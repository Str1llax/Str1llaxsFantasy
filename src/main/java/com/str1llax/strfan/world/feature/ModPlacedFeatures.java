package com.str1llax.strfan.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

public class ModPlacedFeatures {
    //TREES
    //  RUBBER WOOD
    public static final Holder<PlacedFeature> HEVEA_PLACED = PlacementUtils.register("hevea_placed",
            ModConfiguredFeatures.HEVEA_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(0, 0.5f, 1)));

    //FLOWERS
    //  PINK ROSE
    public static final Holder<PlacedFeature> PINK_ROSE_PLACED = PlacementUtils.register("pink_rose_placed",
            ModConfiguredFeatures.PINK_ROSE, RarityFilter.onAverageOnceEvery(16),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    //ORES
    //  TIN ORE
    public static final Holder<PlacedFeature> TIN_ORE_PLACED = PlacementUtils.register("tin_ore_placed",
            ModConfiguredFeatures.TIN_ORE, ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(90))));
    //  TITANIUM ORE
    public static final Holder<PlacedFeature> TITANIUM_ORE_PLACED = PlacementUtils.register("titanium_ore_placed",
            ModConfiguredFeatures.TITANIUM_ORE, ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(80))));
    //  VANADIUM ORE
    public static final Holder<PlacedFeature> VANADIUM_ORE_PLACED = PlacementUtils.register("vanadium_ore_placed",
            ModConfiguredFeatures.VANADIUM_ORE, ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(80))));
    //  CHROMIUM ORE
    public static final Holder<PlacedFeature> CHROMIUM_ORE_PLACED = PlacementUtils.register("chromium_ore_placed",
            ModConfiguredFeatures.CHROMIUM_ORE, ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(80))));

    //  MANGANESE ORE
    public static final Holder<PlacedFeature> MANGANESE_ORE_PLACED = PlacementUtils.register("manganese_ore_placed",
            ModConfiguredFeatures.MANGANESE_ORE, ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(80))));

    //  COBALT ORE
    public static final Holder<PlacedFeature> COBALT_ORE_PLACED = PlacementUtils.register("cobalt_ore_placed",
            ModConfiguredFeatures.COBALT_ORE, ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(80))));

    //  PALLADIUM ORE
    public static final Holder<PlacedFeature> PALLADIUM_ORE_PLACED = PlacementUtils.register("palladium_ore_placed",
            ModConfiguredFeatures.PALLADIUM_ORE, ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(80))));
}
