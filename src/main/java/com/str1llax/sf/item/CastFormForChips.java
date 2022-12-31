package com.str1llax.sf.item;

import com.str1llax.sf.register.SFTabs;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class CastFormForChips extends Item {
    public CastFormForChips() {
        super(new Properties().stacksTo(1).tab(SFTabs.SFTAB_RESOURCES));
    }
    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(new TranslatableComponent("tooltip.sf.cast"));
    }
}
