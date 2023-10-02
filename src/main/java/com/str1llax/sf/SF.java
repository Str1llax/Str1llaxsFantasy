package com.str1llax.sf;

import com.str1llax.sf.block.entity.SFBlockEntities;
import com.str1llax.sf.paintings.SFPaintings;
import com.str1llax.sf.recipe.SFRecipes;
import com.str1llax.sf.register.SFBlocks;
import com.str1llax.sf.register.SFItems;
import com.str1llax.sf.register.SFMetalItems;
import com.str1llax.sf.register.SFOreBlocks;
import com.str1llax.sf.screen.*;
import com.str1llax.sf.util.SFItemProperties;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import software.bernie.geckolib3.GeckoLib;


@Mod(SF.MOD_ID)
public class SF {
    public static final String MOD_ID = "sf";
   public SF() {
       IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

       SFItems.ITEMS.register(bus);
       SFMetalItems.ITEMS.register(bus);
       SFOreBlocks.BLOCKS.register(bus);
       SFBlocks.BLOCKS.register(bus);

       SFBlockEntities.register(bus);
       SFMenuTypes.register(bus);
       SFRecipes.register(bus);
       SFPaintings.register(bus);

       bus.addListener(this::setup);
       bus.addListener(this::clientSetup);

       GeckoLib.initialize();

       MinecraftForge.EVENT_BUS.register(this);
   }

   private void clientSetup(final FMLClientSetupEvent event){
       ItemBlockRenderTypes.setRenderLayer(SFBlocks.ADVANCED_BLOCK.get(), RenderType.cutout());
       ItemBlockRenderTypes.setRenderLayer(SFBlocks.MEAT_GRINDER.get(), RenderType.cutout());

       ItemBlockRenderTypes.setRenderLayer(SFBlocks.GEM_COMBINER.get(), RenderType.cutout());

       ItemBlockRenderTypes.setRenderLayer(SFBlocks.CABLE_IRON.get(), RenderType.cutout());

       ItemBlockRenderTypes.setRenderLayer(SFBlocks.PINK_ROSE.get(), RenderType.cutout());
       ItemBlockRenderTypes.setRenderLayer(SFBlocks.POTTED_PINK_ROSE.get(), RenderType.cutout());

       ItemBlockRenderTypes.setRenderLayer(SFBlocks.HEVEA_DOOR.get(), RenderType.translucent());
       ItemBlockRenderTypes.setRenderLayer(SFBlocks.HEVEA_TRAPDOOR.get(), RenderType.translucent());
       ItemBlockRenderTypes.setRenderLayer(SFBlocks.HEVEA_LEAVES.get(), RenderType.cutout());
       ItemBlockRenderTypes.setRenderLayer(SFBlocks.HEVEA_SAPLING.get(), RenderType.cutout());

       ItemBlockRenderTypes.setRenderLayer(SFBlocks.CHESTNUT_DOOR.get(), RenderType.translucent());
       ItemBlockRenderTypes.setRenderLayer(SFBlocks.CHESTNUT_TRAPDOOR.get(), RenderType.translucent());
       ItemBlockRenderTypes.setRenderLayer(SFBlocks.CHESTNUT_LEAVES.get(), RenderType.cutout());
       ItemBlockRenderTypes.setRenderLayer(SFBlocks.CHESTNUT_SAPLING.get(), RenderType.cutout());

       ItemBlockRenderTypes.setRenderLayer(SFBlocks.SAKURA_DOOR.get(), RenderType.translucent());
       ItemBlockRenderTypes.setRenderLayer(SFBlocks.SAKURA_TRAPDOOR.get(), RenderType.translucent());
       ItemBlockRenderTypes.setRenderLayer(SFBlocks.SAKURA_LEAVES.get(), RenderType.cutout());
       ItemBlockRenderTypes.setRenderLayer(SFBlocks.SAKURA_SAPLING.get(), RenderType.cutout());

       ItemBlockRenderTypes.setRenderLayer(SFBlocks.CUCUMBER_PLANT.get(), RenderType.cutout());


       MenuScreens.register(SFMenuTypes.CIRCUIT_ASSEMBLER_MENU.get(), CircuitAssemblerScreen::new);
       MenuScreens.register(SFMenuTypes.MIXER_MENU.get(), MixerScreen::new);
       MenuScreens.register(SFMenuTypes.EXTRACTOR_MENU.get(), ExtractorScreen::new);
       MenuScreens.register(SFMenuTypes.CHIP_PRESS_MENU.get(), ChipPressScreen::new);
       MenuScreens.register(SFMenuTypes.GEM_COMBINER_MENU.get(), GemCombinerScreen::new);
       MenuScreens.register(SFMenuTypes.GENERATOR_MENU.get(), GeneratorScreen::new);

       SFItemProperties.addCustomItemProperties();
   }
   private void setup(final FMLCommonSetupEvent event){
       event.enqueueWork(() -> ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(SFBlocks.PINK_ROSE.getId(), SFBlocks.POTTED_PINK_ROSE));
   }
}
