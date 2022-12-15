package com.str1llax.sf.block;

import com.str1llax.sf.register.SFBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import javax.annotation.Nullable;

public class SFFlammableRotatedPillarBlock extends RotatedPillarBlock {

    public SFFlammableRotatedPillarBlock(Properties properties) {
        super(properties);
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return 5;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return 5;
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        if(context.getItemInHand().getItem() instanceof AxeItem) {
            if(state.is(SFBlocks.HEVEA_LOG.get())) {
                return SFBlocks.STRIPPED_HEVEA_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(SFBlocks.HEVEA_WOOD.get())) {
                return SFBlocks.STRIPPED_HEVEA_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(SFBlocks.CHESTNUT_LOG.get())) {
                return SFBlocks.STRIPPED_CHESTNUT_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(SFBlocks.CHESTNUT_WOOD.get())) {
                return SFBlocks.STRIPPED_CHESTNUT_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }

        return super.getToolModifiedState(state, context, toolAction, simulate);
    }
}
