package com.str1llax.sf.integration;

import com.str1llax.sf.SF;
import com.str1llax.sf.recipe.CircuitAssemblerRecipe;
import com.str1llax.sf.register.SFBlocks;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nonnull;

public class CircuitAssemblerRecipeCategory implements IRecipeCategory<CircuitAssemblerRecipe>{
    public final static ResourceLocation UID = new ResourceLocation(SF.MOD_ID, "circuit_assembling");
    public final static ResourceLocation TEXTURE = new ResourceLocation(SF.MOD_ID, "textures/gui/circuit_assembler_gui.png");

    private final IDrawable background;
    private final IDrawable icon;

    public CircuitAssemblerRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(SFBlocks.CIRCUIT_ASSEMBLER.get()));
    }

    @Override
    public RecipeType<CircuitAssemblerRecipe> getRecipeType() {
        return JEISFPlugin.CIRCUIT_ASSEMBLING;
    }
    @Override
    public Component getTitle() {
        return Component.translatable("sf.jei.circuit_assembler");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(@Nonnull IRecipeLayoutBuilder builder, @Nonnull CircuitAssemblerRecipe recipe, @Nonnull IFocusGroup focusGroup) {
        builder.addSlot(RecipeIngredientRole.INPUT, 80, 10).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.INPUT, 39, 29).addIngredients(recipe.getIngredients().get(1));
        builder.addSlot(RecipeIngredientRole.INPUT, 60, 29).addIngredients(recipe.getIngredients().get(2));
        builder.addSlot(RecipeIngredientRole.INPUT, 100, 29).addIngredients(recipe.getIngredients().get(3));
        builder.addSlot(RecipeIngredientRole.INPUT, 121, 29).addIngredients(recipe.getIngredients().get(4));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 57).addItemStack(recipe.getResultItem());
    }

    public ResourceLocation getUid() {
        return null;
    }

    public Class<? extends CircuitAssemblerRecipe> getRecipeClass() {
        return null;
    }
}
