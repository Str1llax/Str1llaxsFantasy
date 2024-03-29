package com.str1llax.sf.world.feature;

import com.str1llax.sf.register.SFBlocks;
import com.str1llax.sf.register.SFOreBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.AcaciaFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FancyFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.FancyTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;
import java.util.OptionalInt;

public class SFConfiguredFeatures {
    /*HEVEA*/
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> HEVEA_TREE = FeatureUtils.register("hevea",
            Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(SFBlocks.HEVEA_LOG.get()),
                    new StraightTrunkPlacer(4, 2, 0), BlockStateProvider.simple(SFBlocks.HEVEA_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                    new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
    public static final Holder<PlacedFeature> HEVEA_CHECKED = PlacementUtils.register("hevea_checked", HEVEA_TREE,
            PlacementUtils.filteredByBlockSurvival(SFBlocks.HEVEA_SAPLING.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> HEVEA_SPAWN = FeatureUtils.register("hevea_spawn",
            Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(List.of(
            
            new WeightedPlacedFeature(HEVEA_CHECKED, 0.5F)), HEVEA_CHECKED));
    /*CHESTNUT*/
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> CHESTNUT_TREE = FeatureUtils.register("chestnut", 
            Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(SFBlocks.CHESTNUT_LOG.get()),
                    new FancyTrunkPlacer(3, 11, 0), BlockStateProvider.simple(SFBlocks.CHESTNUT_LEAVES.get()),
                    new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                    new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build());
    public static final Holder<PlacedFeature> CHESTNUT_CHECKED = PlacementUtils.register("chestnut_checked", CHESTNUT_TREE,
            PlacementUtils.filteredByBlockSurvival(SFBlocks.CHESTNUT_SAPLING.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> CHESTNUT_SPAWN = FeatureUtils.register("chestnut_spawn",
            Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(List.of(
            
            new WeightedPlacedFeature(CHESTNUT_CHECKED, 0.5F)), CHESTNUT_CHECKED));
    /*SAKURA*/
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> SAKURA_TREE = FeatureUtils.register("sakura",
            Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(SFBlocks.SAKURA_LOG.get()),
                    new ForkingTrunkPlacer(5, 2, 2), BlockStateProvider.simple(SFBlocks.SAKURA_LEAVES.get()),
                    new AcaciaFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)),
                    new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
    public static final Holder<PlacedFeature> SAKURA_CHECKED = PlacementUtils.register("sakura_checked", SAKURA_TREE,
            PlacementUtils.filteredByBlockSurvival(SFBlocks.SAKURA_SAPLING.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> SAKURA_SPAWN = FeatureUtils.register("sakura_spawn",
            Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(List.of(
            
            new WeightedPlacedFeature(SAKURA_CHECKED, 0.5F)), SAKURA_CHECKED));
    /*FLOWERS*/
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> PINK_ROSE = FeatureUtils.register("flower_pink_rose",
            Feature.FLOWER, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                    new SimpleBlockConfiguration(BlockStateProvider.simple(SFBlocks.PINK_ROSE.get())))));
    /*#1 TIN ORE REPLACER*/
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_TIN_ORES = List.of(
            
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, SFOreBlocks.TIN_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, SFOreBlocks.DEEPSLATE_TIN_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> TIN_ORE = FeatureUtils.register("tin_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_TIN_ORES, 9));
    /*#2 TITANIUM ORE REPLACER*/
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_TITANIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, SFOreBlocks.TITANIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, SFOreBlocks.DEEPSLATE_TITANIUM_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> TITANIUM_ORE = FeatureUtils.register("titanium_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_TITANIUM_ORES, 7));
    /*#3 VANADIUM ORE REPLACER*/
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_VANADIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, SFOreBlocks.VANADIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, SFOreBlocks.DEEPSLATE_VANADIUM_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> VANADIUM_ORE = FeatureUtils.register("vanadium_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_VANADIUM_ORES, 7));
    /*#4 CHROMIUM ORE REPLACER*/
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_CHROMIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, SFOreBlocks.CHROMIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, SFOreBlocks.DEEPSLATE_CHROMIUM_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> CHROMIUM_ORE = FeatureUtils.register("chromium_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_CHROMIUM_ORES, 7));
    /*#5 MANGANESE ORE REPLACER*/
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_MANGANESE_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, SFOreBlocks.MANGANESE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, SFOreBlocks.DEEPSLATE_MANGANESE_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> MANGANESE_ORE = FeatureUtils.register("manganese_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_MANGANESE_ORES, 7));
    /*#6 COBALT ORE REPLACER*/
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_COBALT_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, SFOreBlocks.COBALT_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, SFOreBlocks.DEEPSLATE_COBALT_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> COBALT_ORE = FeatureUtils.register("cobalt_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_COBALT_ORES, 7));
    /*#7 NICKEL ORE REPLACER*/
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_NICKEL_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, SFOreBlocks.NICKEL_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, SFOreBlocks.DEEPSLATE_NICKEL_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> NICKEL_ORE = FeatureUtils.register("nickel_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_NICKEL_ORES, 7));
    /*#8 ZINC ORE REPLACER*/
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_ZINC_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, SFOreBlocks.ZINC_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, SFOreBlocks.DEEPSLATE_ZINC_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ZINC_ORE = FeatureUtils.register("zinc_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_ZINC_ORES, 7));
    /*#9 GERMANIUM ORE REPLACER*/
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_GERMANIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, SFOreBlocks.GERMANIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, SFOreBlocks.DEEPSLATE_GERMANIUM_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> GERMANIUM_ORE = FeatureUtils.register("germanium_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_GERMANIUM_ORES, 7));
    /*#10 ZIRCONIUM ORE REPLACER*/
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_ZIRCONIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, SFOreBlocks.ZIRCONIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, SFOreBlocks.DEEPSLATE_ZIRCONIUM_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ZIRCONIUM_ORE = FeatureUtils.register("zirconium_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_ZIRCONIUM_ORES, 7));
    /*#11 PALLADIUM ORE REPLACER*/
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_PALLADIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, SFOreBlocks.PALLADIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, SFOreBlocks.DEEPSLATE_PALLADIUM_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> PALLADIUM_ORE = FeatureUtils.register("palladium_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_PALLADIUM_ORES, 7));
    /*#12 SILVER ORE REPLACER*/
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_SILVER_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, SFOreBlocks.SILVER_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, SFOreBlocks.DEEPSLATE_SILVER_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SILVER_ORE = FeatureUtils.register("silver_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_SILVER_ORES, 7));
    /*#13 CADMIUM ORE REPLACER*/
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_CADMIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, SFOreBlocks.CADMIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, SFOreBlocks.DEEPSLATE_CADMIUM_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> CADMIUM_ORE = FeatureUtils.register("cadmium_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_CADMIUM_ORES, 7));
    /*#14 INDIUM ORE REPLACER*/
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_INDIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, SFOreBlocks.INDIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, SFOreBlocks.DEEPSLATE_INDIUM_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> INDIUM_ORE = FeatureUtils.register("indium_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_INDIUM_ORES, 7));
    /*#15 TERBIUM ORE REPLACER*/
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_TERBIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, SFOreBlocks.TERBIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, SFOreBlocks.DEEPSLATE_TERBIUM_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> TERBIUM_ORE = FeatureUtils.register("terbium_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_TERBIUM_ORES, 7));
    /*#16 HAFNIUM ORE REPLACER*/
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_HAFNIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, SFOreBlocks.HAFNIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, SFOreBlocks.DEEPSLATE_HAFNIUM_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> HAFNIUM_ORE = FeatureUtils.register("hafnium_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_HAFNIUM_ORES, 7));
    /*#17 TUNGSTEN ORE REPLACER*/
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_TUNGSTEN_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, SFOreBlocks.TUNGSTEN_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, SFOreBlocks.DEEPSTALE_TUNGSTEN_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> TUNGSTEN_ORE = FeatureUtils.register("tungsten_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_TUNGSTEN_ORES, 7));
    /*#18 RHENIUM ORE REPLACER*/
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_RHENIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, SFOreBlocks.RHENIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, SFOreBlocks.DEEPSLATE_RHENIUM_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> RHENIUM_ORE = FeatureUtils.register("rhenium_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_RHENIUM_ORES, 7));
    /*#19 OSMIUM ORE REPLACER*/
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_OSMIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, SFOreBlocks.OSMIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, SFOreBlocks.DEEPSLATE_OSMIUM_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> OSMIUM_ORE = FeatureUtils.register("osmium_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_OSMIUM_ORES, 7));
    /*#20 IRIDIUM ORE REPLACER*/
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_IRIDIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, SFOreBlocks.IRIDIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, SFOreBlocks.DEEPSLATE_IRIDIUM_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> IRIDIUM_ORE = FeatureUtils.register("iridium_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_IRIDIUM_ORES, 7));
    /*#21 PLATINUM ORE REPLACER*/
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_PLATINUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, SFOreBlocks.PLATINUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, SFOreBlocks.DEEPSLATE_PLATINUM_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> PLATINUM_ORE = FeatureUtils.register("platinum_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_PLATINUM_ORES, 7));
    /*#22 LEAD ORE REPLACER*/
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_LEAD_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, SFOreBlocks.LEAD_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, SFOreBlocks.DEEPSLATE_LEAD_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> LEAD_ORE = FeatureUtils.register("lead_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_LEAD_ORES, 7));
    /*#23 BISMUTH ORE REPLACER*/
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_BISMUTH_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, SFOreBlocks.BISMUTH_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, SFOreBlocks.DEEPSLATE_BISMUTH_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> BISMUTH_ORE = FeatureUtils.register("bismuth_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_BISMUTH_ORES, 7));
    /*#24 URANIUM ORE REPLACER*/
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_URANIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, SFOreBlocks.URANIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, SFOreBlocks.DEEPSLATE_URANIUM_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> URANIUM_ORE = FeatureUtils.register("uranium_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_URANIUM_ORES, 7));
    /*RUBY ORE REPLACER*/
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_RUBY_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, SFBlocks.RUBY_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, SFBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> RUBY_ORE = FeatureUtils.register("ruby_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_RUBY_ORES, 7));
    /*CITRINE ORE REPLACER*/
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_CITRINE_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, SFBlocks.CITRINE_ORE.get().defaultBlockState()), 
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, SFBlocks.DEEPSLATE_CITRINE_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> CITRINE_ORE = FeatureUtils.register("citrine_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_CITRINE_ORES, 7));

}
