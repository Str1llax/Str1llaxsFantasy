package com.str1llax.sf.recipe;

import com.str1llax.sf.SF;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SFRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, SF.MOD_ID);

    public static final RegistryObject<RecipeSerializer<CircuitAssemblerRecipe>> CIRCUIT_ASSEMBLER_SERIALIZER = SERIALIZERS.register("circuit_assembling", () -> CircuitAssemblerRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<MixerRecipe>> MIXER_SERIALIZER = SERIALIZERS.register("mixing", () -> MixerRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<ExtractorRecipe>> EXTRACTOR_SERIALIZER = SERIALIZERS.register("extracting", () -> ExtractorRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<ChipPressRecipe>> CHIP_PRESS_SERIALIZER = SERIALIZERS.register("chip_pressing", () -> ChipPressRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<GemCombinerRecipe>> GEM_COMBINER_SERIALIZER = SERIALIZERS.register("gem_combining", () -> GemCombinerRecipe.Serializer.INSTANCE);
    public static void register(IEventBus bus) {
        SERIALIZERS.register(bus);
    }
}
