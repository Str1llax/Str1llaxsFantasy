package com.str1llax.sf.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class CableIron extends Block {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public static final BooleanProperty CONNECTED = BooleanProperty.create("connected");
    public static final VoxelShape NORTH_NOT_CONNECTED = Shapes.box(0.375, 0.375, 0, 0.625, 0.625, 1);
    public static final VoxelShape SOUTH_NOT_CONNECTED = Shapes.box(0.375, 0.375, 0, 0.625, 0.625, 1);
    public static final VoxelShape WEST_NOT_CONNECTED = Shapes.box(0, 0.375, 0.375, 1, 0.625, 0.625);
    public static final VoxelShape EAST_NOT_CONNECTED = Shapes.box(0, 0.375, 0.375, 1, 0.625, 0.625);

    public CableIron(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
        switch (state.getValue(FACING)) {

            default:
                return NORTH_NOT_CONNECTED;
            case SOUTH:
                return SOUTH_NOT_CONNECTED;
            case WEST:
                return WEST_NOT_CONNECTED;
            case EAST:
                return EAST_NOT_CONNECTED;
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