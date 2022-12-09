package com.str1llax.strfan.recipe;

import com.str1llax.strfan.StrFan;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, StrFan.MOD_ID);

    public static final RegistryObject<RecipeSerializer<CircuitAssemblerRecipe>> CIRCUIT_ASSEMBLER_SERIALIZER =
            SERIALIZERS.register("circuit_assembling", () -> CircuitAssemblerRecipe.Serializer.INSTANCE);


    public static final RegistryObject<RecipeSerializer<MixerRecipe>> MIXER_SERIALIZER =
            SERIALIZERS.register("mixing", () -> MixerRecipe.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<ExtractorRecipe>> EXTRACTORSERIALIZER =
            SERIALIZERS.register("extracting", () -> ExtractorRecipe.Serializer.INSTANCE);

    public static void register(IEventBus bus) {
        SERIALIZERS.register(bus);
    }
}
