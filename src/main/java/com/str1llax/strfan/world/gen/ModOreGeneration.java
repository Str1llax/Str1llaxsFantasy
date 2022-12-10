package com.str1llax.strfan.world.gen;

import com.str1llax.strfan.world.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class ModOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(ModPlacedFeatures.TIN_ORE_PLACED);
        base.add(ModPlacedFeatures.TITANIUM_ORE_PLACED);
        base.add(ModPlacedFeatures.VANADIUM_ORE_PLACED);
        base.add(ModPlacedFeatures.CHROMIUM_ORE_PLACED);
        base.add(ModPlacedFeatures.MANGANESE_ORE_PLACED);
        base.add(ModPlacedFeatures.COBALT_ORE_PLACED);
        base.add(ModPlacedFeatures.NICKEL_ORE_PLACED);
        base.add(ModPlacedFeatures.ZINC_ORE_PLACED);
        base.add(ModPlacedFeatures.GERMANIUM_ORE_PLACED);
        base.add(ModPlacedFeatures.ZIRCONIUM_ORE_PLACED);
        base.add(ModPlacedFeatures.PALLADIUM_ORE_PLACED);
        base.add(ModPlacedFeatures.SILVER_ORE_PLACED);
        base.add(ModPlacedFeatures.CADMIUM_ORE_PLACED);
        base.add(ModPlacedFeatures.INDIUM_ORE_PLACED);
        base.add(ModPlacedFeatures.TERBIUM_ORE_PLACED);
        base.add(ModPlacedFeatures.HAFNIUM_ORE_PLACED);
        base.add(ModPlacedFeatures.TUNGSTEN_ORE_PLACED);
        base.add(ModPlacedFeatures.RHENIUM_ORE_PLACED);
        base.add(ModPlacedFeatures.OSMIUM_ORE_PLACED);
        base.add(ModPlacedFeatures.IRIDIUM_ORE_PLACED);
        base.add(ModPlacedFeatures.PLATINUM_ORE_PLACED);
        base.add(ModPlacedFeatures.LEAD_ORE_PLACED);
        base.add(ModPlacedFeatures.BISMUTH_ORE_PLACED);
        base.add(ModPlacedFeatures.URANIUM_ORE_PLACED);
        base.add(ModPlacedFeatures.RUBY_ORE_PLACED);
    }
}
