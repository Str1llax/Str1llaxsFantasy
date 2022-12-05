package com.str1llax.strfan.block;

import com.str1llax.strfan.init.ItemInit;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;



public class AdvancedBlock extends Block
{
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final BooleanProperty LIT = BooleanProperty.create("lit");
    public static final VoxelShape NORTH = Shapes.join(
            Shapes.box(0.359375, 0, 0.359375, 0.640625, 1, 0.640625),
            Shapes.join(
                    Shapes.box(0, 0.359375, 0.359375, 1, 0.640625, 0.640625),
                    Shapes.box(0.359375, 0.359375, 0, 0.640625, 0.640625, 1),
                    BooleanOp.OR),
            BooleanOp.OR);
    public static final VoxelShape SOUTH = Shapes.join(
            Shapes.box(0.359375, 0, 0.359375, 0.640625, 1, 0.640625),
            Shapes.join(
                    Shapes.box(0, 0.359375, 0.359375, 1, 0.640625, 0.640625),
                    Shapes.box(0.359375, 0.359375, 0, 0.640625, 0.640625, 1),
                    BooleanOp.OR),
            BooleanOp.OR);
    public static final VoxelShape EAST = Shapes.join(
            Shapes.box(0.359375, 0, 0.359375, 0.640625, 1, 0.640625),
            Shapes.join(
                    Shapes.box(0, 0.359375, 0.359375, 1, 0.640625, 0.640625),
                    Shapes.box(0.359375, 0.359375, 0, 0.640625, 0.640625, 1),
                    BooleanOp.OR),
            BooleanOp.OR);
    public static final VoxelShape WEST = Shapes.join(
            Shapes.box(0.359375, 0, 0.359375, 0.640625, 1, 0.640625),
            Shapes.join(
                    Shapes.box(0, 0.359375, 0.359375, 1, 0.640625, 0.640625),
                    Shapes.box(0.359375, 0.359375, 0, 0.640625, 0.640625, 1),
                    BooleanOp.OR),
            BooleanOp.OR);

    public AdvancedBlock(Properties properties)
    {
        super(properties.lightLevel(state ->
                state.getValue(LIT) ? 15 : 0));

        this.registerDefaultState(this.defaultBlockState().setValue(FACING, Direction.NORTH).setValue(LIT, false));
    }

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

    @SuppressWarnings("deporecation")
    @Override
    public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result)
    {
        if (!world.isClientSide)
        {
            //if (Registry.BLOCK.getHolderOrThrow(Registry.BLOCK.getResourceKey(BlockInit.ADVANCED_BLOCK.get()).get()).is(TagInit.Blocks.EXAMPLE_BLOCKS))
            if (player.getItemInHand(hand).getItem().equals(ItemInit.ADVANCED_ITEM.get()))
            {
                world.setBlock(pos, state.cycle(LIT), 8);

                return InteractionResult.CONSUME;
            }
            if (player.getItemInHand(hand).getItem().equals(ItemInit.EXAMPLE_ITEM.get()))
            {
                world.setBlock(pos, state.cycle(LIT), 4);

                return InteractionResult.CONSUME;
            }
        }

        return super.use(state, world, pos, player, hand, result);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        builder.add(FACING, LIT);
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
}
