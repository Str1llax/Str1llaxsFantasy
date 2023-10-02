package com.str1llax.sf.block;

import com.str1llax.sf.register.SFItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class CucumberPlantBlock extends CropBlock {

    public static final IntegerProperty AGE = BlockStateProperties.AGE_5;

    public CucumberPlantBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public int getMaxAge() {
        return 5;
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return SFItems.CUCUMBER_SEEDS.get();
    }
}
