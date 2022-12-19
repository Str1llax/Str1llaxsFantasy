package com.str1llax.sf.block;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GemInfuser extends Block {
    public GemInfuser(Properties properties) {
        super(properties);
    }
    public void appendHoverText(ItemStack pStack, @Nullable BlockGetter pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
        if(Screen.hasShiftDown()) {pTooltip.add(new TranslatableComponent("tooltip.sf.machine.tooltip.shift"));}
        else {pTooltip.add(new TranslatableComponent("tooltip.sf.machine.tooltip"));
        }
    }
}
