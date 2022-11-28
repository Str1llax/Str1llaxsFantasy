package com.str1llax.strfan.item;

import com.str1llax.strfan.tiers.STFBaseItemT;
import com.str1llax.strfan.util.Utils;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public class CuttersTool extends STFBaseItemT
{
    public CuttersTool() {
        super(new Properties()
                .defaultDurability(72));
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if(Screen.hasShiftDown()) {
            pTooltipComponents.add(new TranslatableComponent("tooltip.strfan.cutters_tool.tooltip.shift"));
        } else {
            pTooltipComponents.add(new TranslatableComponent("tooltip.strfan.cutters_tool.tooltip"));
        }
    }

    @Nonnull
    @Override
    public ItemStack getContainerItem(@Nonnull ItemStack stack)
    {
        ItemStack container = stack.copy();
        if(container.hurt(1, Utils.RAND , null))
            return ItemStack.EMPTY;
        else
            return container;
    }

    @Override
    public boolean hasContainerItem(@Nonnull ItemStack stack)
    {
        return true;
    }

    @Override
    public boolean isEnchantable(@Nonnull ItemStack stack)
    {
        return false;
    }
}