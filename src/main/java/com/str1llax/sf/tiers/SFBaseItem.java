package com.str1llax.sf.tiers;

import com.str1llax.sf.register.SFTabs;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;

import javax.annotation.Nonnull;

public class SFBaseItem extends Item {
    private int burnTime = -1;
    private boolean isHidden = false;

    public SFBaseItem()
    {
        this(new Properties());
    }

    public SFBaseItem(Properties props)
    {
        this(props, SFTabs.SFTAB_TOOLS);
    }

    public SFBaseItem(Properties props, CreativeModeTab group)
    {
        super(props.tab(group));
    }

    public SFBaseItem setBurnTime(int burnTime)
    {
        this.burnTime = burnTime;
        return this;
    }

    @Override
    public int getBurnTime(ItemStack itemStack, RecipeType<?> type)
    {
        return burnTime;
    }

    public boolean isHidden()
    {
        return isHidden;
    }

    @Override
    public boolean isRepairable(@Nonnull ItemStack stack)
    {
        return false;
    }

    public boolean isIERepairable(@Nonnull ItemStack stack)
    {
        return super.isRepairable(stack);
    }

    @Override
    public boolean isBookEnchantable(ItemStack stack, ItemStack book)
    {
        return false;
    }


    public boolean canEquip(ItemStack stack, EquipmentSlot armorType, Entity entity)
    {
        return Mob.getEquipmentSlotForItem(stack)==armorType||getEquipmentSlot(stack)==armorType;
    }

    @Override
    public int getBarColor(ItemStack pStack)
    {
        // All items use the vanilla color gradient, even if they use different getBarWidth implementation
        return Mth.hsvToRgb(Math.max(0.0F, getBarWidth(pStack)/(float)MAX_BAR_WIDTH)/3.0F, 1.0F, 1.0F);
    }
}