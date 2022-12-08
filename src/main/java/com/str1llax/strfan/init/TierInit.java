package com.str1llax.strfan.init;

import com.str1llax.strfan.tiers.FistEnergyTier;
import com.str1llax.strfan.tiers.MuramasaTier;
import net.minecraft.world.item.Tier;

public final class TierInit {
    private TierInit() {

    }
    protected static final Tier MURAMASA = new MuramasaTier();
    protected static final Tier FIST_ENERGY = new FistEnergyTier();
}
