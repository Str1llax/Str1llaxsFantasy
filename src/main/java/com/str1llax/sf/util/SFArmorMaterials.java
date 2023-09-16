package com.str1llax.sf.util;

import com.str1llax.sf.SF;
import com.str1llax.sf.register.SFItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public enum SFArmorMaterials implements ArmorMaterial {
    RUBY("ruby",33,new int[] {3, 6, 8, 3},10, SoundEvents.ARMOR_EQUIP_DIAMOND,
            2.0F,0.0F, ()-> Ingredient.of(SFItems.RUBY.get())),
    CITRINE("citrine",33,new int[] {3, 6, 8, 3},10, SoundEvents.ARMOR_EQUIP_DIAMOND,
            2.0F,0.0F, ()-> Ingredient.of(SFItems.CITRINE.get())),
    AMETHYST("amethyst",33,new int[] {3, 6, 8, 3},10, SoundEvents.ARMOR_EQUIP_DIAMOND,
            2.0F,0.0F, ()-> Ingredient.of(Items.AMETHYST_SHARD)),
    AMETHRYNE("amethryne",33,new int[] {3, 6, 8, 3},10, SoundEvents.ARMOR_EQUIP_DIAMOND,
            2.0F,0.0F, ()-> Ingredient.of(SFItems.AMETHRYNE.get())),
    MAGMA_CHARM("magma_charm",2,new int[] {2, 2, 2, 2},2, SoundEvents.ARMOR_EQUIP_LEATHER,
            0.0F,0.0F, ()-> Ingredient.EMPTY);

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    SFArmorMaterials(String pName, int pDurabilityMultiplier, int[] pSlotProtections, int pEnchantmentValue, SoundEvent pSound, float pToughness, float pKnockbackResistance, Supplier<Ingredient> pRepairIngredient) {
        this.name = pName;
        this.durabilityMultiplier = pDurabilityMultiplier;
        this.slotProtections = pSlotProtections;
        this.enchantmentValue = pEnchantmentValue;
        this.sound = pSound;
        this.toughness = pToughness;
        this.knockbackResistance = pKnockbackResistance;
        this.repairIngredient = new LazyLoadedValue<>(pRepairIngredient);
    }

    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public @NotNull SoundEvent getEquipSound() {
        return this.sound;
    }

    public @NotNull Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public @NotNull String getName() {
        return SF.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
