package com.str1llax.sf.integration;

import com.str1llax.sf.SF;
import com.str1llax.sf.recipe.GemCombinerRecipe;
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

public class GemCombinerRecipeCategory implements IRecipeCategory<GemCombinerRecipe>{
    public final static ResourceLocation UID = new ResourceLocation(SF.MOD_ID, "gem_combining");
    public final static ResourceLocation TEXTURE = new ResourceLocation(SF.MOD_ID, "textures/gui/gem_combiner_gui.png");

    private final IDrawable background;
    private final IDrawable icon;

    public GemCombinerRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(SFBlocks.GEM_COMBINER.get()));
    }

    @Override
    public RecipeType<GemCombinerRecipe> getRecipeType() {
        return JEISFPlugin.GEM_COMBINING;
    }
    @Override
    public Component getTitle() {
        return Component.translatable("sf.jei.gem_combiner");
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
    public void setRecipe(@Nonnull IRecipeLayoutBuilder builder, @Nonnull GemCombinerRecipe recipe, @Nonnull IFocusGroup focusGroup) {
        builder.addSlot(RecipeIngredientRole.INPUT, 44, 14).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.INPUT, 44, 50).addIngredients(recipe.getIngredients().get(1));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 116, 32).addItemStack(recipe.getResultItem());
    }

    public ResourceLocation getUid() {
        return null;
    }

    public Class<? extends GemCombinerRecipe> getRecipeClass() {
        return null;
    }
}
