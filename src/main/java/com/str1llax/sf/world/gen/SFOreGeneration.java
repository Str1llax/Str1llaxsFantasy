package com.str1llax.sf.world.gen;

import com.str1llax.sf.world.feature.SFPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class SFOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);
        base.add(SFPlacedFeatures.TIN_ORE_PLACED);
        base.add(SFPlacedFeatures.TITANIUM_ORE_PLACED);
        base.add(SFPlacedFeatures.VANADIUM_ORE_PLACED);
        base.add(SFPlacedFeatures.CHROMIUM_ORE_PLACED);
        base.add(SFPlacedFeatures.MANGANESE_ORE_PLACED);
        base.add(SFPlacedFeatures.COBALT_ORE_PLACED);
        base.add(SFPlacedFeatures.NICKEL_ORE_PLACED);
        base.add(SFPlacedFeatures.ZINC_ORE_PLACED);
        base.add(SFPlacedFeatures.GERMANIUM_ORE_PLACED);
        base.add(SFPlacedFeatures.ZIRCONIUM_ORE_PLACED);
        base.add(SFPlacedFeatures.PALLADIUM_ORE_PLACED);
        base.add(SFPlacedFeatures.SILVER_ORE_PLACED);
        base.add(SFPlacedFeatures.CADMIUM_ORE_PLACED);
        base.add(SFPlacedFeatures.INDIUM_ORE_PLACED);
        base.add(SFPlacedFeatures.TERBIUM_ORE_PLACED);
        base.add(SFPlacedFeatures.HAFNIUM_ORE_PLACED);
        base.add(SFPlacedFeatures.TUNGSTEN_ORE_PLACED);
        base.add(SFPlacedFeatures.RHENIUM_ORE_PLACED);
        base.add(SFPlacedFeatures.OSMIUM_ORE_PLACED);
        base.add(SFPlacedFeatures.IRIDIUM_ORE_PLACED);
        base.add(SFPlacedFeatures.PLATINUM_ORE_PLACED);
        base.add(SFPlacedFeatures.LEAD_ORE_PLACED);
        base.add(SFPlacedFeatures.BISMUTH_ORE_PLACED);
        base.add(SFPlacedFeatures.URANIUM_ORE_PLACED);
        base.add(SFPlacedFeatures.RUBY_ORE_PLACED);
        base.add(SFPlacedFeatures.CITRINE_ORE_PLACED);
    }
}
