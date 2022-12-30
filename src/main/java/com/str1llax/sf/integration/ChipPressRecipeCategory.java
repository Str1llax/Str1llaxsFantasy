package com.str1llax.sf.integration;

import com.str1llax.sf.SF;
import com.str1llax.sf.recipe.ChipPressRecipe;
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
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nonnull;

public class ChipPressRecipeCategory implements IRecipeCategory<ChipPressRecipe>{
    public final static ResourceLocation UID = new ResourceLocation(SF.MOD_ID, "chip_pressing");
    public final static ResourceLocation TEXTURE = new ResourceLocation(SF.MOD_ID, "textures/gui/chip_press_gui.png");

    private final IDrawable background;
    private final IDrawable icon;

    public ChipPressRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(SFBlocks.CHIP_PRESS.get()));
    }

    @Override
    public RecipeType<ChipPressRecipe> getRecipeType() {
        return JEISFPlugin.CHIP_PRESSING;
    }
    @Override
    public Component getTitle() {
        return new TranslatableComponent("sf.jei.chip_press");
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
    public void setRecipe(@Nonnull IRecipeLayoutBuilder builder, @Nonnull ChipPressRecipe recipe, @Nonnull IFocusGroup focusGroup) {
        builder.addSlot(RecipeIngredientRole.INPUT, 73, 21).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.INPUT, 73, 52).addIngredients(recipe.getIngredients().get(1));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 109, 36).addItemStack(recipe.getResultItem());
    }

    @Override
    public ResourceLocation getUid() {
        return null;
    }

    @Override
    public Class<? extends ChipPressRecipe> getRecipeClass() {
        return null;
    }
}
