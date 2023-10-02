package com.str1llax.sf.register;

import com.str1llax.sf.tiers.FistEnergyTier;
import com.str1llax.sf.tiers.MuramasaTier;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public final class SFTiers {
    private SFTiers() {}
    public static final Tier MURAMASA = new MuramasaTier();
    public static final Tier FIST_ENERGY = new FistEnergyTier();
    public static final ForgeTier QUANTUM = new ForgeTier(4, 5000, 8.0F, 3.0F, 30, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.EMPTY);
    public static final ForgeTier RUBY = new ForgeTier(3, 1561, 8.0F, 3.0F, 10, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(SFItems.RUBY.get()));
    public static final ForgeTier CITRINE = new ForgeTier(3, 1561, 8.0F, 3.0F, 10, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(SFItems.CITRINE.get()));
    public static final ForgeTier AMETHYST = new ForgeTier(3, 1561, 8.0F, 3.0F, 10, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(SFItems.CITRINE.get()));
    public static final ForgeTier AMETRINE = new ForgeTier(3, 1561, 8.0F, 3.0F, 10, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(SFItems.AMETRINE.get()));
}
