package com.str1llax.sf.event;

import com.str1llax.sf.SF;
import com.str1llax.sf.event.loot.CastFormForChipInVillageAdditionModifier;
import com.str1llax.sf.event.loot.CastFormForSiliconChipInVillageAdditionModifier;
import com.str1llax.sf.recipe.CircuitAssemblerRecipe;
import com.str1llax.sf.recipe.ExtractorRecipe;
import com.str1llax.sf.recipe.MixerRecipe;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = SF.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SFModEventBusEvents {

    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>> event) {
        event.getRegistry().registerAll(
                new CastFormForChipInVillageAdditionModifier.Serializer().setRegistryName(new ResourceLocation(SF.MOD_ID,"cast_form_for_chip_in_village")),
                new CastFormForSiliconChipInVillageAdditionModifier.Serializer().setRegistryName(new ResourceLocation(SF.MOD_ID,"cast_form_for_silicon_chip_in_village"))
        );
    }

    @SubscribeEvent
    public static void registerRecipeTypes(final RegistryEvent.Register<RecipeSerializer<?>> event) {
        Registry.register(Registry.RECIPE_TYPE, CircuitAssemblerRecipe.Type.ID, CircuitAssemblerRecipe.Type.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, MixerRecipe.Type.ID, MixerRecipe.Type.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, ExtractorRecipe.Type.ID, ExtractorRecipe.Type.INSTANCE);
    }
}