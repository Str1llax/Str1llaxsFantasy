package com.str1llax.strfan.event;

import com.str1llax.strfan.StrFan;
import com.str1llax.strfan.recipe.CircuitAssemblerRecipe;
import com.str1llax.strfan.recipe.ExtractorRecipe;
import com.str1llax.strfan.recipe.MixerRecipe;
import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = StrFan.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>> event) {
        event.getRegistry().registerAll(
        );
    }

    @SubscribeEvent
    public static void registerRecipeTypes(final RegistryEvent.Register<RecipeSerializer<?>> event) {
        Registry.register(Registry.RECIPE_TYPE, CircuitAssemblerRecipe.Type.ID, CircuitAssemblerRecipe.Type.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, MixerRecipe.Type.ID, MixerRecipe.Type.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, ExtractorRecipe.Type.ID, ExtractorRecipe.Type.INSTANCE);
    }
}