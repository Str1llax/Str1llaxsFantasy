package com.str1llax.sf.integration;

import com.str1llax.sf.SF;
import com.str1llax.sf.recipe.*;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Objects;

@JeiPlugin
public class JEISFPlugin implements IModPlugin {
    public static RecipeType<MixerRecipe> MIXING = new RecipeType<>(MixerRecipeCategory.UID, MixerRecipe.class);
    public static RecipeType<CircuitAssemblerRecipe> CIRCUIT_ASSEMBLING = new RecipeType<>(CircuitAssemblerRecipeCategory.UID, CircuitAssemblerRecipe.class);
    public static RecipeType<ExtractorRecipe> EXTRACTING = new RecipeType<>(ExtractorRecipeCategory.UID, ExtractorRecipe.class);
    public static RecipeType<ChipPressRecipe> CHIP_PRESSING = new RecipeType<>(ChipPressRecipeCategory.UID, ChipPressRecipe.class);
    public static RecipeType<GemCombinerRecipe> GEM_COMBINING = new RecipeType<>(GemCombinerRecipeCategory.UID, GemCombinerRecipe.class);

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();

        List<MixerRecipe> recipesMixing = rm.getAllRecipesFor(MixerRecipe.Type.INSTANCE);
        registration.addRecipes(MIXING, recipesMixing);

        List<CircuitAssemblerRecipe> recipesCircuitAssembling = rm.getAllRecipesFor(CircuitAssemblerRecipe.Type.INSTANCE);
        registration.addRecipes(CIRCUIT_ASSEMBLING, recipesCircuitAssembling);


        List<ExtractorRecipe> recipesExtracting = rm.getAllRecipesFor(ExtractorRecipe.Type.INSTANCE);
        registration.addRecipes(EXTRACTING, recipesExtracting);


        List<ChipPressRecipe> recipesChipPressing = rm.getAllRecipesFor(ChipPressRecipe.Type.INSTANCE);
        registration.addRecipes(CHIP_PRESSING, recipesChipPressing);


        List<GemCombinerRecipe> recipesGemCombining = rm.getAllRecipesFor(GemCombinerRecipe.Type.INSTANCE);
        registration.addRecipes(GEM_COMBINING, recipesGemCombining);
    }
    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new MixerRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new CircuitAssemblerRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new ExtractorRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new ChipPressRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new GemCombinerRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
    }
    @Override
    public @NotNull ResourceLocation getPluginUid() {
        return new ResourceLocation(SF.MOD_ID, "jei_plugin");
    }
}
