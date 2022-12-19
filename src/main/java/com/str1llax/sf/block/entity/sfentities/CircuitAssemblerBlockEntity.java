package com.str1llax.sf.block.entity.sfentities;

import com.str1llax.sf.block.entity.SFBlockEntities;
import com.str1llax.sf.recipe.CircuitAssemblerRecipe;
import com.str1llax.sf.screen.CircuitAssemblerMenu;
import com.str1llax.sf.register.SFTags;
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
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnull;
import java.util.Optional;

public class CircuitAssemblerBlockEntity extends BlockEntity implements MenuProvider {
    private final ItemStackHandler itemHandler = new ItemStackHandler(6){
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }
    };

    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    protected final ContainerData data;
    private int progress = 0;
    private int maxProgress = 100;

    public CircuitAssemblerBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(SFBlockEntities.CIRCUIT_ASSEMBLER_BLOCK_ENTITY.get(), pWorldPosition, pBlockState);
            this.data = new ContainerData() {
                public int get(int index) {
                    switch (index) {
                        case 0: return CircuitAssemblerBlockEntity.this.progress;
                        case 1: return CircuitAssemblerBlockEntity.this.maxProgress;
                        default: return 0;
                    }
                }

                public void set(int index, int value) {
                    switch(index) {
                        case 0: CircuitAssemblerBlockEntity.this.progress = value; break;
                        case 1: CircuitAssemblerBlockEntity.this.maxProgress = value; break;
                    }
                }

                public int getCount() {
                    return 2;
                }
            };
    }

    @Override
    public Component getDisplayName() {
        return new TranslatableComponent("");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, Player pPlayer) {
        return new CircuitAssemblerMenu(pContainerId, pInventory, this, this.data);
    }

    @Nonnull

    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @javax.annotation.Nullable Direction side) {
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            return lazyItemHandler.cast();
        }

        return super.getCapability(cap, side);
    }

    @Override
    public void onLoad() {
        super.onLoad();
        lazyItemHandler = LazyOptional.of(() -> itemHandler);
    }

    @Override
    public void invalidateCaps()  {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
    }

    @Override
    protected void saveAdditional(@NotNull CompoundTag tag) {
        tag.put("inventory", itemHandler.serializeNBT());
        tag.putInt("circuit_assembler.progress", progress);
        super.saveAdditional(tag);
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
        itemHandler.deserializeNBT(nbt.getCompound("inventory"));
        progress = nbt.getInt("circuit_assembler.progress");
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }

        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    public static void tick(Level pLevel, BlockPos pPos, BlockState pState, CircuitAssemblerBlockEntity pBlockEntity) {
        if(hasRecipe(pBlockEntity)) {
            pBlockEntity.progress++;
            setChanged(pLevel, pPos, pState);
            if(pBlockEntity.progress > pBlockEntity.maxProgress) {
                craftItem(pBlockEntity);
            }
        } else {
            pBlockEntity.resetProgress();
            setChanged(pLevel, pPos, pState);
        }
    }

    private static boolean hasRecipe(CircuitAssemblerBlockEntity entity) {
        Level level = entity.level;
        SimpleContainer inventory = new SimpleContainer(entity.itemHandler.getSlots());
        for (int i = 0; i < entity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, entity.itemHandler.getStackInSlot(i));
        }

        Optional<CircuitAssemblerRecipe> match = level.getRecipeManager()
                .getRecipeFor(CircuitAssemblerRecipe.Type.INSTANCE, inventory, level);

        return match.isPresent() && canInsertAmountIntoOutputSlot(inventory)
                && canInsertItemIntoOutputSlot(inventory, match.get().getResultItem())
                && hasCapacitorInCapacitorSlot(entity)
                && hasCatInCatSlot(entity)
                && hasChipInChipSlot(entity)
                && hasChipIn2ChipSlot(entity)
                && hasCatIn2CatSlot(entity);
    }

    private static boolean hasCapacitorInCapacitorSlot(CircuitAssemblerBlockEntity entity) {
        return entity.itemHandler.getStackInSlot(0).is(SFTags.Items.CAPACITORS);
    }
    private static boolean hasCatInCatSlot(CircuitAssemblerBlockEntity entity) {
        return entity.itemHandler.getStackInSlot(1).is(SFTags.Items.BASES);
    }
    private static boolean hasChipInChipSlot(CircuitAssemblerBlockEntity entity) {
        return entity.itemHandler.getStackInSlot(2).is(SFTags.Items.CHIPS);
    }
    private static boolean hasChipIn2ChipSlot(CircuitAssemblerBlockEntity entity) {
        return entity.itemHandler.getStackInSlot(3).is(SFTags.Items.CHIPS);
    }
    private static boolean hasCatIn2CatSlot(CircuitAssemblerBlockEntity entity) {
        return entity.itemHandler.getStackInSlot(4).is(SFTags.Items.CATALYSTS);
    }

    private static void craftItem(CircuitAssemblerBlockEntity entity) {
        Level level = entity.level;
        SimpleContainer inventory = new SimpleContainer(entity.itemHandler.getSlots());
        for (int i = 0; i < entity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, entity.itemHandler.getStackInSlot(i));
        }

        Optional<CircuitAssemblerRecipe> match = level.getRecipeManager()
                .getRecipeFor(CircuitAssemblerRecipe.Type.INSTANCE, inventory, level);

        if(match.isPresent()) {
            entity.itemHandler.extractItem(0,1, false);
            entity.itemHandler.extractItem(1,1, false);
            entity.itemHandler.extractItem(2,1, false);
            entity.itemHandler.extractItem(3,1, false);
            entity.itemHandler.extractItem(4,1, false);

            entity.itemHandler.setStackInSlot(5, new ItemStack(match.get().getResultItem().getItem(),
                    entity.itemHandler.getStackInSlot(5).getCount() + 1));

            entity.resetProgress();
        }
    }

    private void resetProgress() {
        this.progress = 0;
    }

    private static boolean canInsertItemIntoOutputSlot(SimpleContainer inventory, ItemStack output) {
        return inventory.getItem(5).getItem() == output.getItem() || inventory.getItem(5).isEmpty();
    }

    private static boolean canInsertAmountIntoOutputSlot(SimpleContainer inventory) {
        return inventory.getItem(5).getMaxStackSize() > inventory.getItem(5).getCount();
    }
}
