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

        base.add(ModPlacedFeatures.PALLADIUM_ORE_PLACED);
    }
}
