package com.str1llax.sf.tiers;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class Quantum implements Tier {

    @Override
    public int getUses() {
        return 0;
    }

    @Override
    public float getSpeed() {
        return -4.0f;
    }

    @Override
    public float getAttackDamageBonus() {
        return -1.0f;
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
        return null;
    }
}
