package com.str1llax.sf.tiers;

import com.str1llax.sf.register.SFItems;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

public class MuramasaTier implements Tier {

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
    public @NotNull Ingredient getRepairIngredient() {
        return Ingredient.of(SFItems.CRIMSON_ENERGY_INGOT.get());
    }
}
