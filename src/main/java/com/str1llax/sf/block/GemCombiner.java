package com.str1llax.sf.block;

import com.str1llax.sf.block.entity.SFBlockEntities;
import com.str1llax.sf.block.entity.sfentities.GemCombinerBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.network.NetworkHooks;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class GemCombiner extends BaseEntityBlock {
    public GemCombiner(Properties properties) {
        super(properties);
    }
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public static final VoxelShape NORTH =
            Shapes.join(Shapes.box(0.0625, 0, 0.0625, 0.9375, 0.25, 0.9375),
                        Shapes.join(Shapes.box(0, 0.25, 0, 1, 0.375, 1),
                                    Shapes.join(Shapes.box(0, 0.375, 0.3125, 1, 1, 0.625),
                                                Shapes.box(0.625, 0.375, 0.625, 0.9375, 0.75, 0.9375), BooleanOp.OR), BooleanOp.OR), BooleanOp.OR);
    public static final VoxelShape EAST =
            Shapes.join(Shapes.box(0.0625, 0, 0.0625, 0.9375, 0.25, 0.9375),
                        Shapes.join(Shapes.box(0, 0.25, 0, 1, 0.375, 1),
                                    Shapes.join(Shapes.box(0.375, 0.375, 0, 0.6875, 1, 1),
                                                Shapes.box(0.0625, 0.375, 0.625, 0.375, 0.75, 0.9375), BooleanOp.OR), BooleanOp.OR), BooleanOp.OR);

    public static final VoxelShape SOUTH =
            Shapes.join(Shapes.box(0.0625, 0, 0.0625, 0.9375, 0.25, 0.9375),
                        Shapes.join(Shapes.box(0, 0.25, 0, 1, 0.375, 1),
                                    Shapes.join(Shapes.box(0, 0.375, 0.375, 1, 1, 0.6875),
                                                Shapes.box(0.0625, 0.375, 0.0625, 0.375, 0.75, 0.375), BooleanOp.OR), BooleanOp.OR), BooleanOp.OR);
    public static final VoxelShape WEST =
            Shapes.join(Shapes.box(0.0625, 0, 0.0625, 0.9375, 0.25, 0.9375),
                        Shapes.join(Shapes.box(0, 0.25, 0, 1, 0.375, 1),
                                    Shapes.join(Shapes.box(0.3125, 0.375, 0, 0.625, 1, 1),
                                                Shapes.box(0.625, 0.375, 0.0625, 0.9375, 0.75, 0.375), BooleanOp.OR), BooleanOp.OR), BooleanOp.OR);

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context)
    {
        switch (state.getValue(FACING))
        {

            default:
                return NORTH;
            case SOUTH:
                return SOUTH;
            case WEST:
                return WEST;
            case EAST:
                return EAST;
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        builder.add(FACING);
        super.createBlockStateDefinition(builder);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirror) {
        return state.rotate(mirror.getRotation(state.getValue(FACING)));
    }

    @Override
    public BlockState rotate(BlockState state, LevelAccessor level, BlockPos pos, Rotation direction) {
        return state.setValue(FACING, direction.rotate(state.getValue(FACING)));
    }

    /* BLOCK ENTITY */

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    @Override
    public void onRemove(BlockState pState, Level level, BlockPos pos, BlockState state, boolean pIsMoving) {
        if (pState.getBlock() != state.getBlock()) {
            BlockEntity blockEntity = level.getBlockEntity(pos);
            if (blockEntity instanceof GemCombinerBlockEntity) {
                ((GemCombinerBlockEntity) blockEntity).drops();
            }
        }
        super.onRemove(pState, level, pos, state, pIsMoving);
    }

    @Override
    public @NotNull InteractionResult use(@NotNull BlockState state, Level level, @NotNull BlockPos pos, @NotNull Player player, @NotNull InteractionHand hand, @NotNull BlockHitResult hit) {
        if (!level.isClientSide()) {
            BlockEntity entity = level.getBlockEntity(pos);
            if(entity instanceof GemCombinerBlockEntity) {
                NetworkHooks.openGui(((ServerPlayer)player), (GemCombinerBlockEntity)entity, pos);
            } else {
                throw new IllegalStateException("Our Container provider is missing!");
            }
        }
        return InteractionResult.sidedSuccess(level.isClientSide());
    }
    @Nullable
    @Override
    public BlockEntity newBlockEntity(@NotNull BlockPos pos, @NotNull BlockState state) {
        return new GemCombinerBlockEntity(pos, state);
    }
    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(@NotNull Level level, @NotNull BlockState state, @NotNull BlockEntityType<T> pBlockEntityType) {
        return createTickerHelper(pBlockEntityType, SFBlockEntities.GEM_COMBINER_BLOCK_ENTITY.get(),
                GemCombinerBlockEntity::tick);
    }
}
