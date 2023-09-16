package com.str1llax.sf.register;

import com.str1llax.sf.SF;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.str1llax.sf.SF.MOD_ID;

public class SFTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SF.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SFTAB = CREATIVE_MODE_TABS.register(MOD_ID + "_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(SFItems.EXAMPLE_ITEM.get()))
                    .title(Component.translatable("itemGroup.sf_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //Blocks
                        pOutput.accept(SFBlocks.EXAMPLE_BLOCK.get());
                        pOutput.accept(SFBlocks.ADVANCED_BLOCK.get());
                        //Items
                        pOutput.accept(SFItems.EXAMPLE_ITEM.get());
                        pOutput.accept(SFItems.ADVANCED_ITEM.get());
                        pOutput.accept(SFItems.WIP.get());
                        pOutput.accept(SFItems.DATA_TABLET.get());
                    })
                    .build());


    public static final RegistryObject<CreativeModeTab> SFTAB_WEAPONS = CREATIVE_MODE_TABS.register(MOD_ID + "_weapons",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(SFItems.EXAMPLE_ITEM.get()))
                    .title(Component.translatable("itemGroup.sf_weapons"))
                    .displayItems((pParameters, pOutput) -> {
                        //Blocks

                        //Items
                            //Ruby
                        pOutput.accept(SFItems.RUBY_SWORD.get());
                        pOutput.accept(SFItems.RUBY_AXE.get());
                        pOutput.accept(SFItems.RUBY_PICKAXE.get());
                        pOutput.accept(SFItems.RUBY_SHOVEL.get());
                        pOutput.accept(SFItems.RUBY_HOE.get());
                        pOutput.accept(SFItems.RUBY_BOW.get());
                        pOutput.accept(SFItems.RUBY_HELMET.get());
                        pOutput.accept(SFItems.RUBY_CHESTPLATE.get());
                        pOutput.accept(SFItems.RUBY_LEGGINGS.get());
                        pOutput.accept(SFItems.RUBY_BOOTS.get());
                            //Citrine
                        pOutput.accept(SFItems.CITRINE_SWORD.get());
                        pOutput.accept(SFItems.CITRINE_AXE.get());
                        pOutput.accept(SFItems.CITRINE_PICKAXE.get());
                        pOutput.accept(SFItems.CITRINE_SHOVEL.get());
                        pOutput.accept(SFItems.CITRINE_HOE.get());
                        pOutput.accept(SFItems.CITRINE_BOW.get());
                        pOutput.accept(SFItems.CITRINE_HELMET.get());
                        pOutput.accept(SFItems.CITRINE_CHESTPLATE.get());
                        pOutput.accept(SFItems.CITRINE_LEGGINGS.get());
                        pOutput.accept(SFItems.CITRINE_BOOTS.get());
                            //Amethyst
                        pOutput.accept(SFItems.AMETHYST_SWORD.get());
                        pOutput.accept(SFItems.AMETHYST_AXE.get());
                        pOutput.accept(SFItems.AMETHYST_PICKAXE.get());
                        pOutput.accept(SFItems.AMETHYST_SHOVEL.get());
                        pOutput.accept(SFItems.AMETHYST_HOE.get());
                        pOutput.accept(SFItems.AMETHYST_BOW.get());
                        pOutput.accept(SFItems.AMETHYST_HELMET.get());
                        pOutput.accept(SFItems.AMETHYST_CHESTPLATE.get());
                        pOutput.accept(SFItems.AMETHYST_LEGGINGS.get());
                        pOutput.accept(SFItems.AMETHYST_BOOTS.get());
                            //Amethryne
                        pOutput.accept(SFItems.AMETHRYNE_SWORD.get());
                        pOutput.accept(SFItems.AMETHRYNE_AXE.get());
                        pOutput.accept(SFItems.AMETHRYNE_PICKAXE.get());
                        pOutput.accept(SFItems.AMETHRYNE_SHOVEL.get());
                        pOutput.accept(SFItems.AMETHRYNE_HOE.get());
                        pOutput.accept(SFItems.AMETHRYNE_BOW.get());
                        pOutput.accept(SFItems.AMETHRYNE_HELMET.get());
                        pOutput.accept(SFItems.AMETHRYNE_CHESTPLATE.get());
                        pOutput.accept(SFItems.AMETHRYNE_LEGGINGS.get());
                        pOutput.accept(SFItems.AMETHRYNE_BOOTS.get());
                            //Misc
                        pOutput.accept(SFItems.MAGMA_CHARM.get());
                        pOutput.accept(SFItems.FIST_ENERGY.get());
                        pOutput.accept(SFItems.FIST_ENERGY2.get());
                        pOutput.accept(SFItems.FIST_ENERGY3.get());
                        pOutput.accept(SFItems.MURAMASA.get());
                        pOutput.accept(SFItems.QUANTUM_AXE.get());
                        pOutput.accept(SFItems.PESTLE.get());
                        pOutput.accept(SFItems.MORTAR.get());
                        pOutput.accept(SFItems.MORTAR_AND_PESTLE.get());
                    })
                    .build());
    public static final RegistryObject<CreativeModeTab> SFTAB_RESOURCES = CREATIVE_MODE_TABS.register(MOD_ID + "_resources",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(SFItems.EXAMPLE_ITEM.get()))
                    .title(Component.translatable("itemGroup.sf_resources"))
                    .displayItems((pParameters, pOutput) -> {
                        //Blocks

                        //Items
                        pOutput.accept(SFItems.RAINBOW_POWDER.get());

                        pOutput.accept(SFItems.RUBY.get());
                        pOutput.accept(SFItems.CITRINE.get());
                        pOutput.accept(SFItems.AMETHRYNE.get());

                        pOutput.accept(SFMetalItems.RAW_TIN.get());
                        pOutput.accept(SFMetalItems.TIN_INGOT.get());
                        pOutput.accept(SFMetalItems.RAW_TITANIUM.get());
                        pOutput.accept(SFMetalItems.TITANIUM_INGOT.get());
                        pOutput.accept(SFMetalItems.RAW_VANADIUM.get());
                        pOutput.accept(SFMetalItems.VANADIUM_INGOT.get());
                        pOutput.accept(SFMetalItems.RAW_CHROMIUM.get());
                        pOutput.accept(SFMetalItems.CHROMIUM_INGOT.get());
                        pOutput.accept(SFMetalItems.RAW_MANGANESE.get());
                        pOutput.accept(SFMetalItems.MANGANESE_INGOT.get());
                        pOutput.accept(SFMetalItems.RAW_COBALT.get());
                        pOutput.accept(SFMetalItems.COBALT_INGOT.get());
                        pOutput.accept(SFMetalItems.RAW_NICKEL.get());
                        pOutput.accept(SFMetalItems.NICKEL_INGOT.get());
                        pOutput.accept(SFMetalItems.RAW_ZINC.get());
                        pOutput.accept(SFMetalItems.ZINC_INGOT.get());
                        pOutput.accept(SFMetalItems.RAW_GERMANIUM.get());
                        pOutput.accept(SFMetalItems.GERMANIUM_INGOT.get());
                        pOutput.accept(SFMetalItems.RAW_ZIRCONIUM.get());
                        pOutput.accept(SFMetalItems.ZIRCONIUM_INGOT.get());
                        pOutput.accept(SFMetalItems.RAW_PALLADIUM.get());
                        pOutput.accept(SFMetalItems.PALLADIUM_INGOT.get());
                        pOutput.accept(SFMetalItems.RAW_SILVER.get());
                        pOutput.accept(SFMetalItems.SILVER_INGOT.get());
                        pOutput.accept(SFMetalItems.RAW_CADMIUM.get());
                        pOutput.accept(SFMetalItems.CADMIUM_INGOT.get());
                        pOutput.accept(SFMetalItems.RAW_INDIUM.get());
                        pOutput.accept(SFMetalItems.INDIUM_INGOT.get());
                        pOutput.accept(SFMetalItems.RAW_TERBIUM.get());
                        pOutput.accept(SFMetalItems.TERBIUM_INGOT.get());
                        pOutput.accept(SFMetalItems.RAW_HAFNIUM.get());
                        pOutput.accept(SFMetalItems.HAFNIUM_INGOT.get());
                        pOutput.accept(SFMetalItems.RAW_TUNGSTEN.get());
                        pOutput.accept(SFMetalItems.TUNGSTEN_INGOT.get());
                        pOutput.accept(SFMetalItems.RAW_RHENIUM.get());
                        pOutput.accept(SFMetalItems.RHENIUM_INGOT.get());
                        pOutput.accept(SFMetalItems.RAW_OSMIUM.get());
                        pOutput.accept(SFMetalItems.OSMIUM_INGOT.get());
                        pOutput.accept(SFMetalItems.RAW_IRIDIUM.get());
                        pOutput.accept(SFMetalItems.IRIDIUM.get());
                        pOutput.accept(SFMetalItems.IRIDIUM_INGOT.get());
                        pOutput.accept(SFMetalItems.RAW_PLATINUM.get());
                        pOutput.accept(SFMetalItems.PLATINUM_INGOT.get());
                        pOutput.accept(SFMetalItems.RAW_LEAD.get());
                        pOutput.accept(SFMetalItems.LEAD_INGOT.get());
                        pOutput.accept(SFMetalItems.RAW_BISMUTH.get());
                        pOutput.accept(SFMetalItems.BISMUTH_INGOT.get());
                        pOutput.accept(SFMetalItems.RAW_URANIUM.get());
                        pOutput.accept(SFMetalItems.URANIUM.get());
                        pOutput.accept(SFMetalItems.URANIUM_INGOT.get());

                        pOutput.accept(SFItems.MIGHTY_IRON_INGOT.get());
                        pOutput.accept(SFItems.CRIMSON_ENERGY_INGOT.get());

                        pOutput.accept(SFItems.FLOUR.get());

                        pOutput.accept(SFItems.PLATE_IRON.get());
                        pOutput.accept(SFItems.CELL_IRON.get());

                        pOutput.accept(SFItems.CIRCUIT_SILICON_CHIP.get());
                        pOutput.accept(SFItems.CIRCUIT_IRON_CHIP.get());
                        pOutput.accept(SFItems.CIRCUIT_GOLD_CHIP.get());
                        pOutput.accept(SFItems.CIRCUIT_DIAMOND_CHIP.get());

                        pOutput.accept(SFItems.CAPACITOR_BASE.get());

                        pOutput.accept(SFItems.CIRCUIT_BASE.get());
                        pOutput.accept(SFItems.CIRCUIT_IRON.get());
                        pOutput.accept(SFItems.CIRCUIT_GOLD.get());
                        pOutput.accept(SFItems.CIRCUIT_DIAMOND.get());

                        pOutput.accept(SFItems.BLADE.get());
                        pOutput.accept(SFItems.MIXER_BLADE.get());
                        pOutput.accept(SFItems.MACHINE_CASE.get());
                        pOutput.accept(SFItems.PRESS_PART.get());
                        pOutput.accept(SFItems.TANK.get());
                        pOutput.accept(SFItems.COIL_COPPER.get());
                        pOutput.accept(SFItems.HEATING_ELEMENT.get());

                        pOutput.accept(SFItems.ROSIN.get());
                        pOutput.accept(SFItems.SILICON.get());
                        pOutput.accept(SFItems.RAW_RUBBER.get());
                        pOutput.accept(SFItems.RUBBER.get());
                        pOutput.accept(SFItems.CARBON.get());
                        pOutput.accept(SFItems.PLASTIC.get());
                        pOutput.accept(SFItems.CRUSHED_PLASTIC.get());
                        pOutput.accept(SFItems.CRUSHED_COAL.get());
                        pOutput.accept(SFItems.FIBERGLASS_MIX.get());
                        pOutput.accept(SFItems.FIBERGLASS.get());
                        pOutput.accept(SFItems.S_CRIMSON_EXTRACT.get());
                        pOutput.accept(SFItems.CRIMSON_EXTRACT.get());
                        pOutput.accept(SFItems.CNT_CRIMSON_EXTRACT.get());

                        pOutput.accept(SFItems.M_GUARD.get());
                        pOutput.accept(SFItems.M_HANDLE.get());
                        pOutput.accept(SFItems.M_BLADE.get());

                    })
                    .build());
    public static final RegistryObject<CreativeModeTab> SFTAB_ORES = CREATIVE_MODE_TABS.register(MOD_ID + "_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(SFItems.EXAMPLE_ITEM.get()))
                    .title(Component.translatable("itemGroup.sf_blocks"))
                    .displayItems((pParameters, pOutput) -> {
                        //Blocks
                        pOutput.accept(SFBlocks.HEVEA_LOG.get());
                        pOutput.accept(SFBlocks.HEVEA_WOOD.get());
                        pOutput.accept(SFBlocks.STRIPPED_HEVEA_LOG.get());
                        pOutput.accept(SFBlocks.STRIPPED_HEVEA_WOOD.get());
                        pOutput.accept(SFBlocks.HEVEA_LEAVES.get());
                        pOutput.accept(SFBlocks.HEVEA_SAPLING.get());
                        pOutput.accept(SFBlocks.HEVEA_PLANKS.get());
                        pOutput.accept(SFBlocks.HEVEA_STAIRS.get());
                        pOutput.accept(SFBlocks.HEVEA_SLAB.get());
                        pOutput.accept(SFBlocks.HEVEA_FENCE.get());
                        pOutput.accept(SFBlocks.HEVEA_FENCE_GATE.get());
                        pOutput.accept(SFBlocks.HEVEA_BUTTON.get());
                        pOutput.accept(SFBlocks.HEVEA_PRESSURE_PLATE.get());
                        pOutput.accept(SFBlocks.HEVEA_DOOR.get());
                        pOutput.accept(SFBlocks.HEVEA_TRAPDOOR.get());

                        pOutput.accept(SFBlocks.CHESTNUT_LOG.get());
                        pOutput.accept(SFBlocks.CHESTNUT_WOOD.get());
                        pOutput.accept(SFBlocks.STRIPPED_CHESTNUT_LOG.get());
                        pOutput.accept(SFBlocks.STRIPPED_CHESTNUT_WOOD.get());
                        pOutput.accept(SFBlocks.CHESTNUT_LEAVES.get());
                        pOutput.accept(SFBlocks.CHESTNUT_SAPLING.get());
                        pOutput.accept(SFBlocks.CHESTNUT_PLANKS.get());
                        pOutput.accept(SFBlocks.CHESTNUT_STAIRS.get());
                        pOutput.accept(SFBlocks.CHESTNUT_SLAB.get());
                        pOutput.accept(SFBlocks.CHESTNUT_FENCE.get());
                        pOutput.accept(SFBlocks.CHESTNUT_FENCE_GATE.get());
                        pOutput.accept(SFBlocks.CHESTNUT_BUTTON.get());
                        pOutput.accept(SFBlocks.CHESTNUT_PRESSURE_PLATE.get());
                        pOutput.accept(SFBlocks.CHESTNUT_DOOR.get());
                        pOutput.accept(SFBlocks.CHESTNUT_TRAPDOOR.get());

                        pOutput.accept(SFBlocks.PINK_ROSE.get());

                        pOutput.accept(SFBlocks.RUBY_BLOCK.get());
                        pOutput.accept(SFBlocks.CITRINE_BLOCK.get());

                        pOutput.accept(SFBlocks.RUBY_ORE.get());
                        pOutput.accept(SFBlocks.DEEPSLATE_RUBY_ORE.get());
                        pOutput.accept(SFBlocks.CITRINE_ORE.get());
                        pOutput.accept(SFBlocks.DEEPSLATE_CITRINE_ORE.get());
                        pOutput.accept(SFOreBlocks.TIN_ORE.get());
                        pOutput.accept(SFOreBlocks.DEEPSLATE_TIN_ORE.get());
                        pOutput.accept(SFOreBlocks.TITANIUM_ORE.get());
                        pOutput.accept(SFOreBlocks.DEEPSLATE_TITANIUM_ORE.get());
                        pOutput.accept(SFOreBlocks.VANADIUM_ORE.get());
                        pOutput.accept(SFOreBlocks.DEEPSLATE_VANADIUM_ORE.get());
                        pOutput.accept(SFOreBlocks.CHROMIUM_ORE.get());
                        pOutput.accept(SFOreBlocks.DEEPSLATE_CHROMIUM_ORE.get());
                        pOutput.accept(SFOreBlocks.MANGANESE_ORE.get());
                        pOutput.accept(SFOreBlocks.DEEPSLATE_MANGANESE_ORE.get());
                        pOutput.accept(SFOreBlocks.COBALT_ORE.get());
                        pOutput.accept(SFOreBlocks.DEEPSLATE_COBALT_ORE.get());
                        pOutput.accept(SFOreBlocks.NICKEL_ORE.get());
                        pOutput.accept(SFOreBlocks.DEEPSLATE_NICKEL_ORE.get());
                        pOutput.accept(SFOreBlocks.ZINC_ORE.get());
                        pOutput.accept(SFOreBlocks.DEEPSLATE_ZINC_ORE.get());
                        pOutput.accept(SFOreBlocks.GERMANIUM_ORE.get());
                        pOutput.accept(SFOreBlocks.DEEPSLATE_GERMANIUM_ORE.get());
                        pOutput.accept(SFOreBlocks.ZIRCONIUM_ORE.get());
                        pOutput.accept(SFOreBlocks.DEEPSLATE_ZIRCONIUM_ORE.get());
                        pOutput.accept(SFOreBlocks.PALLADIUM_ORE.get());
                        pOutput.accept(SFOreBlocks.DEEPSLATE_PALLADIUM_ORE.get());
                        pOutput.accept(SFOreBlocks.SILVER_ORE.get());
                        pOutput.accept(SFOreBlocks.DEEPSLATE_SILVER_ORE.get());
                        pOutput.accept(SFOreBlocks.CADMIUM_ORE.get());
                        pOutput.accept(SFOreBlocks.DEEPSLATE_CADMIUM_ORE.get());
                        pOutput.accept(SFOreBlocks.INDIUM_ORE.get());
                        pOutput.accept(SFOreBlocks.DEEPSLATE_INDIUM_ORE.get());
                        pOutput.accept(SFOreBlocks.TERBIUM_ORE.get());
                        pOutput.accept(SFOreBlocks.DEEPSLATE_TERBIUM_ORE.get());
                        pOutput.accept(SFOreBlocks.HAFNIUM_ORE.get());
                        pOutput.accept(SFOreBlocks.DEEPSLATE_HAFNIUM_ORE.get());
                        pOutput.accept(SFOreBlocks.TUNGSTEN_ORE.get());
                        pOutput.accept(SFOreBlocks.DEEPSLATE_TUNGSTEN_ORE.get());
                        pOutput.accept(SFOreBlocks.RHENIUM_ORE.get());
                        pOutput.accept(SFOreBlocks.DEEPSLATE_RHENIUM_ORE.get());
                        pOutput.accept(SFOreBlocks.OSMIUM_ORE.get());
                        pOutput.accept(SFOreBlocks.DEEPSLATE_OSMIUM_ORE.get());
                        pOutput.accept(SFOreBlocks.IRIDIUM_ORE.get());
                        pOutput.accept(SFOreBlocks.DEEPSLATE_IRIDIUM_ORE.get());
                        pOutput.accept(SFOreBlocks.PLATINUM_ORE.get());
                        pOutput.accept(SFOreBlocks.DEEPSLATE_PLATINUM_ORE.get());
                        pOutput.accept(SFOreBlocks.LEAD_ORE.get());
                        pOutput.accept(SFOreBlocks.DEEPSLATE_LEAD_ORE.get());
                        pOutput.accept(SFOreBlocks.BISMUTH_ORE.get());
                        pOutput.accept(SFOreBlocks.DEEPSLATE_BISMUTH_ORE.get());
                        pOutput.accept(SFOreBlocks.URANIUM_ORE.get());
                        pOutput.accept(SFOreBlocks.DEEPSLATE_URANIUM_ORE.get());

                        pOutput.accept(SFBlocks.GENERATOR.get());

                        pOutput.accept(SFBlocks.CABLE_IRON.get());
                        pOutput.accept(SFBlocks.MEAT_GRINDER.get());
                        pOutput.accept(SFBlocks.CIRCUIT_ASSEMBLER.get());
                        pOutput.accept(SFBlocks.MIXER.get());
                        pOutput.accept(SFBlocks.EXTRACTOR.get());
                        pOutput.accept(SFBlocks.CHIP_PRESS.get());
                        pOutput.accept(SFBlocks.GEM_COMBINER.get());

                        //Items
                    })
                    .build());
}

