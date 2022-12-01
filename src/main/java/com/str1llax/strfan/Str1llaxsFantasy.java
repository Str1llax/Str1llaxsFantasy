package com.str1llax.strfan;

import com.str1llax.strfan.block.entity.ModBlockEntities;
import com.str1llax.strfan.init.BlockInit;
import com.str1llax.strfan.init.ItemInit;
import com.str1llax.strfan.init.MetalItemInit;
import com.str1llax.strfan.init.OreBlockInit;
import com.str1llax.strfan.recipe.ModRecipes;
import com.str1llax.strfan.screen.CircuitAssemblerScreen;
import com.str1llax.strfan.screen.ExtractorScreen;
import com.str1llax.strfan.screen.MixerScreen;
import com.str1llax.strfan.screen.ModMenuTypes;
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

@Mod("strfan")
public class Str1llaxsFantasy
{
    public static final String MOD_ID = "strfan";



   public Str1llaxsFantasy()
   {
       IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

       ItemInit.ITEMS.register(bus);
       MetalItemInit.ITEMS.register(bus);
       OreBlockInit.BLOCKS.register(bus);
       BlockInit.BLOCKS.register(bus);

       ModBlockEntities.register(bus);
       ModMenuTypes.register(bus);
       ModRecipes.register(bus);

       bus.addListener(this::setup);
       bus.addListener(this::clientSetup);

       MinecraftForge.EVENT_BUS.register(this);
   }

   private void clientSetup(final FMLClientSetupEvent event){
       ItemBlockRenderTypes.setRenderLayer(BlockInit.ADVANCED_BLOCK.get(), RenderType.cutout());
       ItemBlockRenderTypes.setRenderLayer(BlockInit.MEAT_GRINDER.get(), RenderType.cutout());

       ItemBlockRenderTypes.setRenderLayer(BlockInit.CIRCUIT_ASSEMBLER.get(), RenderType.cutout());
       ItemBlockRenderTypes.setRenderLayer(BlockInit.MIXER.get(), RenderType.cutout());
       ItemBlockRenderTypes.setRenderLayer(BlockInit.GENERATOR.get(), RenderType.cutout());
       ItemBlockRenderTypes.setRenderLayer(BlockInit.EXTRACTOR.get(), RenderType.cutout());

       ItemBlockRenderTypes.setRenderLayer(BlockInit.CABLE_IRON.get(), RenderType.cutout());

       ItemBlockRenderTypes.setRenderLayer(BlockInit.PINK_ROSE.get(), RenderType.cutout());
       ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_PINK_ROSE.get(), RenderType.cutout());

       ItemBlockRenderTypes.setRenderLayer(BlockInit.HEVEA_LEAVES.get(), RenderType.cutout());
       ItemBlockRenderTypes.setRenderLayer(BlockInit.HEVEA_SAPLING.get(), RenderType.cutout());


       MenuScreens.register(ModMenuTypes.CIRCUIT_ASSEMBLER_MENU.get(), CircuitAssemblerScreen::new);
       MenuScreens.register(ModMenuTypes.MIXER_MENU.get(), MixerScreen::new);
       MenuScreens.register(ModMenuTypes.EXTRACTOR_MENU.get(), ExtractorScreen::new);
   }
   private void setup(final FMLCommonSetupEvent event){
       event.enqueueWork(() -> {
           ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.PINK_ROSE.getId(), BlockInit.POTTED_PINK_ROSE);
       });
   }
}
