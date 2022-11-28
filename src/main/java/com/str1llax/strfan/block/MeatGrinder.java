package com.str1llax.strfan.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;




public class MeatGrinder extends Block {

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public static final VoxelShape NORTH =
            Shapes.join(
                    Shapes.box(0.3125, 0.1875, -0.25, 0.6875, 0.5625, 0.8125),
                    Shapes.box(0.3125, 0, 0.3125, 0.6875, 0.9375, 0.6875),
                    BooleanOp.OR);

    public static final VoxelShape EAST = //Shapes.box(0.1875, 0, 0.3125, 1, 0.5625, 0.6875);
            Shapes.join(
                    Shapes.box(0.1875, 0.1875, 0.3125, 1.25, 0.5625, 0.6875),
                    Shapes.box(0.3125, 0, 0.3125, 0.6875, 0.9375, 0.6875),
                    BooleanOp.OR);

    public static final VoxelShape SOUTH = //Shapes.box(0.3125, 0, 0.1875, 0.6875, 0.5625, 1);
            Shapes.join(
                    Shapes.box(0.3125, 0.1875, 0.1875, 0.6875, 0.5625, 1.25),
                    Shapes.box(0.3125, 0, 0.3125, 0.6875, 0.9375, 0.6875),
                    BooleanOp.OR);

    public static final VoxelShape WEST = //Shapes.box(0, 0, 0.3125, 0.8125, 0.5625, 0.6875);
            Shapes.join(
                    Shapes.box(-0.25, 0.1875, 0.3125, 0.8125, 0.5625, 0.6875),
                    Shapes.box(0.3125, 0, 0.3125, 0.6875, 0.9375, 0.6875),
                    BooleanOp.OR);

    public MeatGrinder(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
        switch (state.getValue(FACING)) {

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
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
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

    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }
}