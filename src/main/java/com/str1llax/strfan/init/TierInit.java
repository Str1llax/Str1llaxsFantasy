package com.str1llax.strfan.init;

import com.str1llax.strfan.tiers.FistEnergyTier;
import com.str1llax.strfan.tiers.MuramasaTier;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public final class TierInit {
    private TierInit() {

    }
    public static final Tier MURAMASA = new MuramasaTier();
    public static final Tier FIST_ENERGY = new FistEnergyTier();
    public static final ForgeTier RUBY = new ForgeTier(3, 1561, 8.0F, 3.0F, 10, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ItemInit.RUBY.get()));
}
