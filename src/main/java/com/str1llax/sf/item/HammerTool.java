package com.str1llax.sf.item;

import com.str1llax.sf.util.SFUtils;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import com.str1llax.sf.tiers.SFBaseItem;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public class HammerTool extends SFBaseItem {
    public HammerTool() {
        super(new Properties()
                .defaultDurability(100));
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if(Screen.hasShiftDown()) {
            pTooltipComponents.add(new TranslatableComponent("tooltip.sf.hammer_tool.tooltip.shift"));
        } else {
            pTooltipComponents.add(new TranslatableComponent("tooltip.sf.hammer_tool.tooltip"));
        }
    }

    @Nonnull
    @Override
    public ItemStack getContainerItem(@Nonnull ItemStack stack)
    {
        ItemStack container = stack.copy();
        if(container.hurt(1, SFUtils.RAND , null))
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