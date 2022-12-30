package com.str1llax.sf.block.entity.sfentities;

import com.str1llax.sf.block.GemCombiner;
import com.str1llax.sf.block.entity.SFBlockEntities;
import com.str1llax.sf.block.entity.sfentities.util.CustomEnergyStorage;
import com.str1llax.sf.block.entity.sfentities.util.WrappedHandler;
import com.str1llax.sf.recipe.GemCombinerRecipe;
import com.str1llax.sf.register.SFTags;
import com.str1llax.sf.screen.GemCombinerMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnull;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class GemCombinerBlockEntity extends BlockEntity implements MenuProvider {
    private final ItemStackHandler itemHandler = new ItemStackHandler(3){
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }
    };
    private final CustomEnergyStorage energyStored = new CustomEnergyStorage(2000, 32) {
        @Override
        public void onEnergyChanged() {
            setChanged();
        }
    };
    private static final int ENERGY_REQ = 32;
    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    private LazyOptional<IEnergyStorage> lazyEnergyHandler = LazyOptional.empty();
    private final Map<Direction, LazyOptional<IItemHandler>> directionWrappedHandlerMap =
            Map.of(Direction.DOWN, LazyOptional.of(() -> new WrappedHandler(itemHandler, (i) -> i == 1, (i, s) -> false)),
                    Direction.NORTH, LazyOptional.of(() -> new WrappedHandler(itemHandler, (index) -> index == 0,
                            (index, stack) -> itemHandler.isItemValid(0, stack))),
                    Direction.SOUTH, LazyOptional.of(() -> new WrappedHandler(itemHandler, (i) -> i == 1, (i, s) -> false)),
                    Direction.EAST, LazyOptional.of(() -> new WrappedHandler(itemHandler, (i) -> i == 0,
                            (index, stack) -> itemHandler.isItemValid(0, stack))),
                    Direction.WEST, LazyOptional.of(() -> new WrappedHandler(itemHandler, (index) -> index == 0,
                            (index, stack) -> itemHandler.isItemValid(0, stack) || itemHandler.isItemValid(0, stack))));

    protected final ContainerData data;
    private int progress = 0;
    private int maxProgress = 100;

    public GemCombinerBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(SFBlockEntities.GEM_COMBINER_BLOCK_ENTITY.get(), pWorldPosition, pBlockState);
        this.data = new ContainerData() {
            public int get(int index) {
                return switch (index) {
                    case 0 -> GemCombinerBlockEntity.this.progress;
                    case 1 -> GemCombinerBlockEntity.this.maxProgress;
                    default -> 0;
                };
            }

            public void set(int index, int value) {
                switch (index) {
                    case 0 -> GemCombinerBlockEntity.this.progress = value;
                    case 1 -> GemCombinerBlockEntity.this.maxProgress = value;
                }
            }

            public int getCount() {
                return 2;
            }
        };
    }

    @Override
    public @NotNull Component getDisplayName() {
        return new TranslatableComponent("");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, @NotNull Inventory pInventory, @NotNull Player pPlayer) {
        return new GemCombinerMenu(pContainerId, pInventory, this, this.data);
    }

    public IEnergyStorage getEnergyStorage() {
        return energyStored;
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @javax.annotation.Nullable Direction side) {
        if(cap == CapabilityEnergy.ENERGY) {
            return lazyEnergyHandler.cast();
        }

        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            if (side == null) {
                return lazyItemHandler.cast();
            }
        }

        if(directionWrappedHandlerMap.containsKey(side)) {
            Direction localDir = this.getBlockState().getValue(GemCombiner.FACING);

            if(side == Direction.UP || side == Direction.DOWN) {
                return directionWrappedHandlerMap.get(side).cast();
            }

            return switch (localDir) {
                default -> directionWrappedHandlerMap.get(Objects.requireNonNull(side).getOpposite()).cast();
                case EAST -> directionWrappedHandlerMap.get(Objects.requireNonNull(side).getClockWise()).cast();
                case SOUTH -> directionWrappedHandlerMap.get(side).cast();
                case WEST -> directionWrappedHandlerMap.get(Objects.requireNonNull(side).getCounterClockWise()).cast();
            };
        }

        return super.getCapability(cap, side);
    }

    @Override
    public void onLoad() {
        super.onLoad();
        lazyItemHandler = LazyOptional.of(() -> itemHandler);
        lazyEnergyHandler = LazyOptional.of(() -> energyStored);
    }

    @Override
    public void invalidateCaps()  {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
        lazyEnergyHandler.invalidate();
    }

    @Override
    protected void saveAdditional(@NotNull CompoundTag tag) {
        tag.put("inventory", itemHandler.serializeNBT());
        tag.putInt("gem_combiner.progress", progress);
        tag.putInt("gem_combiner.energy", energyStored.getEnergyStored());
        super.saveAdditional(tag);
    }

    @Override
    public void load(@NotNull CompoundTag nbt) {
        super.load(nbt);
        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
        progress = nbt.getInt("gem_combiner.progress");
        energyStored.setEnergy(nbt.getInt("gem_combiner.energy"));
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }

        Containers.dropContents(Objects.requireNonNull(this.level), this.worldPosition, inventory);
    }

    public static void tick(Level pLevel, BlockPos pPos, BlockState pState, GemCombinerBlockEntity pBlockEntity) {
        //if(has1in1slot(pBlockEntity)) {
        //    pBlockEntity.energyStored.receiveEnergy(64, false);
        //}

        if(hasRecipe(pBlockEntity) /*&& hasEnoughEnergy(pBlockEntity)*/) {
            pBlockEntity.progress++;
            //extractEnergy(pBlockEntity);
            setChanged(pLevel, pPos, pState);
            if(pBlockEntity.progress > pBlockEntity.maxProgress) {
                craftItem(pBlockEntity);
            }
        } else {
            pBlockEntity.resetProgress();
            setChanged(pLevel, pPos, pState);
        }
    }

    private static boolean hasRecipe(GemCombinerBlockEntity entity) {
        Level level = entity.level;
        SimpleContainer inventory = new SimpleContainer(entity.itemHandler.getSlots());
        for (int i = 0; i < entity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, entity.itemHandler.getStackInSlot(i));
        }

        Optional<GemCombinerRecipe> match = Objects.requireNonNull(level).getRecipeManager()
                .getRecipeFor(GemCombinerRecipe.Type.INSTANCE, inventory, level);

        return match.isPresent() && canInsertAmountIntoOutputSlot(inventory)
                && canInsertItemIntoOutputSlot(inventory, match.get().getResultItem())
                && has1in1slot(entity)
                && has2in2slot(entity);
    }

    private static boolean has1in1slot(GemCombinerBlockEntity entity) {
        return entity.itemHandler.getStackInSlot(0).is(SFTags.Items.STONES);
    }
    private static boolean has2in2slot(GemCombinerBlockEntity entity) {
        return entity.itemHandler.getStackInSlot(1).is(SFTags.Items.STONES);
    }

    private static void craftItem(GemCombinerBlockEntity entity) {
        Level level = entity.level;
        SimpleContainer inventory = new SimpleContainer(entity.itemHandler.getSlots());
        for (int i = 0; i < entity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, entity.itemHandler.getStackInSlot(i));
        }

        Optional<GemCombinerRecipe> match = Objects.requireNonNull(level).getRecipeManager()
                .getRecipeFor(GemCombinerRecipe.Type.INSTANCE, inventory, level);

        if(match.isPresent()) {
            entity.itemHandler.extractItem(0,1, false);
            entity.itemHandler.extractItem(1,1, false);

            entity.itemHandler.setStackInSlot(2, new ItemStack(match.get().getResultItem().getItem(),
                    entity.itemHandler.getStackInSlot(2).getCount() + 1));

            entity.resetProgress();
        }
    }
    private void resetProgress() {
        this.progress = 0;
    }

    private static boolean canInsertItemIntoOutputSlot(SimpleContainer inventory, ItemStack output) {
        return inventory.getItem(2).getItem() == output.getItem() || inventory.getItem(2).isEmpty();
    }

    private static boolean canInsertAmountIntoOutputSlot(SimpleContainer inventory) {
        return inventory.getItem(2).getMaxStackSize() > inventory.getItem(2).getCount();
    }
}
