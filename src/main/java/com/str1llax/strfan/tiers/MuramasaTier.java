package com.str1llax.strfan.tiers;

import com.str1llax.strfan.init.ItemInit;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class MuramasaTier implements Tier {

    @Override
    public int getUses() {
        return 0;
    }

    @Override
    public float getSpeed() {
        return 0f;
    }

    @Override
    public float getAttackDamageBonus() {
        return 0f;
    }

    @Override
    public int getLevel() {
        return 0;
    }

    @Override
    public int getEnchantmentValue() {
        return 0;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(ItemInit.CRIMSON_ENERGY_INGOT.get());
    }
}
