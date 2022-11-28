package com.str1llax.strfan.item;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class AdvancedItem extends Item
{
    public AdvancedItem(Properties properties)
    {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand)
    {
        if (!world.isClientSide())
        {
            System.out.println(player.getName().getString() + " has used item with hand " + hand.name());
        }

        return super.use(world, player, hand);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @javax.annotation.Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if(Screen.hasShiftDown()) {
            pTooltipComponents.add(new TranslatableComponent("tooltip.strfan.advanced_item.tooltip.shift"));
        } else {
            pTooltipComponents.add(new TranslatableComponent("tooltip.strfan.advanced_item.tooltip"));
        }
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return 72000;
    }
}
