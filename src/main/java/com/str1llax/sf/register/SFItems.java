package com.str1llax.sf.register;

import com.str1llax.sf.SF;
import com.str1llax.sf.item.*;
import com.str1llax.sf.util.SFArmorMaterials;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class SFItems extends Item {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,SF.MOD_ID);
    public static final RegistryObject<Item> EXAMPLE_ITEM = register("example_item",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB)));
    public static final RegistryObject<Item> ADVANCED_ITEM = register("advanced_item",() -> new AdvancedItem(new Item.Properties().tab(SFTabs.SFTAB).stacksTo(8).fireResistant().food(new FoodProperties.Builder().alwaysEat().nutrition(10).saturationMod(5.0f).effect(() -> new MobEffectInstance(MobEffects.GLOWING,6000,2),1f).build())));
    public static final RegistryObject<Item> WIP = register("wip",() -> new WIPItem(new Item.Properties().tab(SFTabs.SFTAB)));

    public static final RegistryObject<Item> HAMMER_TOOL = register("hammer_tool",HammerTool::new);
    public static final RegistryObject<Item> CUTTERS_TOOL = register("cutters_tool",CuttersTool::new);
    public static final RegistryObject<Item> DATA_TABLET = register("data_tablet",() -> new DataTabletItem(new Item.Properties().tab(SFTabs.SFTAB).stacksTo(1)));

    public static final RegistryObject<Item> FLOUR = register("flour",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES)));
    public static final RegistryObject<Item> DOUGH = register("dough",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES)));
    public static final RegistryObject<Item> DUMPLING = register("dumpling",() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(1).saturationMod(0.5f).effect(() -> new MobEffectInstance(MobEffects.HUNGER,100,0),1f).build())));
    public static final RegistryObject<Item> DUMPLINGS = register("dumplings",() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(2).saturationMod(1.0f).effect(() -> new MobEffectInstance(MobEffects.HUNGER,100,0),1f).build())));

    public static final RegistryObject<Item> M_GUARD = register("m_guard",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_PARTS).stacksTo(1).fireResistant()));
    public static final RegistryObject<Item> M_HANDLE = register("m_handle",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_PARTS).stacksTo(1).fireResistant()));
    public static final RegistryObject<Item> M_BLADE = register("m_blade",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_PARTS).stacksTo(1).fireResistant()));

    public static final RegistryObject<Item> CIRCUIT_SILICON_CHIP = register("circuit_silicon_chip",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES)));
    public static final RegistryObject<Item> CIRCUIT_IRON_CHIP = register("circuit_iron_chip",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES)));
    public static final RegistryObject<Item> CIRCUIT_GOLD_CHIP = register("circuit_gold_chip",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES)));
    public static final RegistryObject<Item> CIRCUIT_DIAMOND_CHIP = register("circuit_diamond_chip",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES)));

    public static final RegistryObject<Item> CAPACITOR_BASE = register("capacitor_base",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES)));

    public static final RegistryObject<Item> CIRCUIT_BASE = register("circuit_base",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES)));
    public static final RegistryObject<Item> CIRCUIT_IRON = register("circuit_iron",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES)));
    public static final RegistryObject<Item> CIRCUIT_GOLD = register("circuit_gold",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES)));
    public static final RegistryObject<Item> CIRCUIT_DIAMOND = register("circuit_diamond",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES)));

    public static final RegistryObject<Item> PLATE_IRON = register("plate_iron",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES)));
    public static final RegistryObject<Item> CELL_IRON = register("cell_iron",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES)));
    public static final RegistryObject<Item> CRIMSON_ENERGY_INGOT = register("crimson_energy_ingot",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES).fireResistant()));
    public static final RegistryObject<Item> MIGHTY_IRON_INGOT = register("mighty_iron_ingot",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES).fireResistant()));

    public static final RegistryObject<Item> RUBY = register("ruby",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Item> RUBY_SWORD = register("ruby_sword",() -> new RubySwordItem(SFTiers.RUBY,3,-2.4F,new Item.Properties().tab(SFTabs.SFTAB_WEAPONS)));
    public static final RegistryObject<Item> RUBY_BOW = register("ruby_bow",() -> new BowItem(new Item.Properties().defaultDurability(800).tab(SFTabs.SFTAB_WEAPONS)));
    public static final RegistryObject<Item> RUBY_PICKAXE = register("ruby_pickaxe",() -> new PickaxeItem(SFTiers.RUBY,1,-2.8F,new Item.Properties().tab(SFTabs.SFTAB_TOOLS)));
    public static final RegistryObject<Item> RUBY_AXE = register("ruby_axe",() -> new AxeItem(SFTiers.RUBY,5.0F,-3.0F,new Item.Properties().tab(SFTabs.SFTAB_TOOLS)));
    public static final RegistryObject<Item> RUBY_SHOVEL = register("ruby_shovel",() -> new ShovelItem(SFTiers.RUBY,1.5F,-3.0F,new Item.Properties().tab(SFTabs.SFTAB_TOOLS)));
    public static final RegistryObject<Item> RUBY_HOE = register("ruby_hoe",() -> new HoeItem(SFTiers.RUBY,-3,0.0F,new Item.Properties().tab(SFTabs.SFTAB_TOOLS)));
    public static final RegistryObject<Item> RUBY_HELMET = register("ruby_helmet",() -> new SFArmorItem(SFArmorMaterials.RUBY,EquipmentSlot.HEAD,new Item.Properties().tab(SFTabs.SFTAB_ARMOR)));
    public static final RegistryObject<Item> RUBY_CHESTPLATE = register("ruby_chestplate",() -> new ArmorItem(SFArmorMaterials.RUBY,EquipmentSlot.CHEST,new Item.Properties().tab(SFTabs.SFTAB_ARMOR)));
    public static final RegistryObject<Item> RUBY_LEGGINGS = register("ruby_leggings",() -> new ArmorItem(SFArmorMaterials.RUBY,EquipmentSlot.LEGS,new Item.Properties().tab(SFTabs.SFTAB_ARMOR)));
    public static final RegistryObject<Item> RUBY_BOOTS = register("ruby_boots",() -> new ArmorItem(SFArmorMaterials.RUBY,EquipmentSlot.FEET,new Item.Properties().tab(SFTabs.SFTAB_ARMOR)));

    public static final RegistryObject<Item> CITRINE = register("citrine",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Item> CITRINE_SWORD = register("citrine_sword",() -> new CitrineSwordItem(SFTiers.CITRINE,3,-2.4F,new Item.Properties().tab(SFTabs.SFTAB_WEAPONS)));
    public static final RegistryObject<Item> CITRINE_BOW = register("citrine_bow",() -> new BowItem(new Item.Properties().defaultDurability(800).tab(SFTabs.SFTAB_WEAPONS)));
    public static final RegistryObject<Item> CITRINE_PICKAXE = register("citrine_pickaxe",() -> new PickaxeItem(SFTiers.CITRINE,1,-2.8F,new Item.Properties().tab(SFTabs.SFTAB_TOOLS)));
    public static final RegistryObject<Item> CITRINE_AXE = register("citrine_axe",() -> new AxeItem(SFTiers.CITRINE,5.0F,-3.0F,new Item.Properties().tab(SFTabs.SFTAB_TOOLS)));
    public static final RegistryObject<Item> CITRINE_SHOVEL = register("citrine_shovel",() -> new ShovelItem(SFTiers.CITRINE,1.5F,-3.0F,new Item.Properties().tab(SFTabs.SFTAB_TOOLS)));
    public static final RegistryObject<Item> CITRINE_HOE = register("citrine_hoe",() -> new HoeItem(SFTiers.CITRINE,-3,0.0F,new Item.Properties().tab(SFTabs.SFTAB_TOOLS)));
    public static final RegistryObject<Item> CITRINE_HELMET = register("citrine_helmet",() -> new SFArmorItem(SFArmorMaterials.CITRINE,EquipmentSlot.HEAD,new Item.Properties().tab(SFTabs.SFTAB_ARMOR)));
    public static final RegistryObject<Item> CITRINE_CHESTPLATE = register("citrine_chestplate",() -> new ArmorItem(SFArmorMaterials.CITRINE,EquipmentSlot.CHEST,new Item.Properties().tab(SFTabs.SFTAB_ARMOR)));
    public static final RegistryObject<Item> CITRINE_LEGGINGS = register("citrine_leggings",() -> new ArmorItem(SFArmorMaterials.CITRINE,EquipmentSlot.LEGS,new Item.Properties().tab(SFTabs.SFTAB_ARMOR)));
    public static final RegistryObject<Item> CITRINE_BOOTS = register("citrine_boots",() -> new ArmorItem(SFArmorMaterials.CITRINE,EquipmentSlot.FEET,new Item.Properties().tab(SFTabs.SFTAB_ARMOR)));

    public static final RegistryObject<Item> AMETHYST = register("amethyst",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Item> AMETHYST_SWORD = register("amethyst_sword",() -> new AmethystSwordItem(SFTiers.AMETHYST,3,-2.4F,new Item.Properties().tab(SFTabs.SFTAB_WEAPONS)));
    public static final RegistryObject<Item> AMETHYST_BOW = register("amethyst_bow",() -> new BowItem(new Item.Properties().defaultDurability(800).tab(SFTabs.SFTAB_WEAPONS)));
    public static final RegistryObject<Item> AMETHYST_PICKAXE = register("amethyst_pickaxe",() -> new PickaxeItem(SFTiers.AMETHYST,1,-2.8F,new Item.Properties().tab(SFTabs.SFTAB_TOOLS)));
    public static final RegistryObject<Item> AMETHYST_AXE = register("amethyst_axe",() -> new AxeItem(SFTiers.AMETHYST,5.0F,-3.0F,new Item.Properties().tab(SFTabs.SFTAB_TOOLS)));
    public static final RegistryObject<Item> AMETHYST_SHOVEL = register("amethyst_shovel",() -> new ShovelItem(SFTiers.AMETHYST,1.5F,-3.0F,new Item.Properties().tab(SFTabs.SFTAB_TOOLS)));
    public static final RegistryObject<Item> AMETHYST_HOE = register("amethyst_hoe",() -> new HoeItem(SFTiers.AMETHYST,-3,0.0F,new Item.Properties().tab(SFTabs.SFTAB_TOOLS)));
    public static final RegistryObject<Item> AMETHYST_HELMET = register("amethyst_helmet",() -> new SFArmorItem(SFArmorMaterials.AMETHYST,EquipmentSlot.HEAD,new Item.Properties().tab(SFTabs.SFTAB_ARMOR)));
    public static final RegistryObject<Item> AMETHYST_CHESTPLATE = register("amethyst_chestplate",() -> new ArmorItem(SFArmorMaterials.AMETHYST,EquipmentSlot.CHEST,new Item.Properties().tab(SFTabs.SFTAB_ARMOR)));
    public static final RegistryObject<Item> AMETHYST_LEGGINGS = register("amethyst_leggings",() -> new ArmorItem(SFArmorMaterials.AMETHYST,EquipmentSlot.LEGS,new Item.Properties().tab(SFTabs.SFTAB_ARMOR)));
    public static final RegistryObject<Item> AMETHYST_BOOTS = register("amethyst_boots",() -> new ArmorItem(SFArmorMaterials.AMETHYST,EquipmentSlot.FEET,new Item.Properties().tab(SFTabs.SFTAB_ARMOR)));

    public static final RegistryObject<Item> AMETHRYNE = register("amethryne",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Item> AMETHRYNE_SWORD = register("amethryne_sword",() -> new AmethryneSwordItem(SFTiers.AMETHRYNE,3,-2.4F,new Item.Properties().tab(SFTabs.SFTAB_WEAPONS)));
    public static final RegistryObject<Item> AMETHRYNE_BOW = register("amethryne_bow",() -> new BowItem(new Item.Properties().defaultDurability(800).tab(SFTabs.SFTAB_WEAPONS)));
    public static final RegistryObject<Item> AMETHRYNE_PICKAXE = register("amethryne_pickaxe",() -> new PickaxeItem(SFTiers.AMETHRYNE,1,-2.8F,new Item.Properties().tab(SFTabs.SFTAB_TOOLS)));
    public static final RegistryObject<Item> AMETHRYNE_AXE = register("amethryne_axe",() -> new AxeItem(SFTiers.AMETHRYNE,5.0F,-3.0F,new Item.Properties().tab(SFTabs.SFTAB_TOOLS)));
    public static final RegistryObject<Item> AMETHRYNE_SHOVEL = register("amethryne_shovel",() -> new ShovelItem(SFTiers.AMETHRYNE,1.5F,-3.0F,new Item.Properties().tab(SFTabs.SFTAB_TOOLS)));
    public static final RegistryObject<Item> AMETHRYNE_HOE = register("amethryne_hoe",() -> new HoeItem(SFTiers.AMETHRYNE,-3,0.0F,new Item.Properties().tab(SFTabs.SFTAB_TOOLS)));
    public static final RegistryObject<Item> AMETHRYNE_HELMET = register("amethryne_helmet",() -> new SFArmorItem(SFArmorMaterials.AMETHRYNE,EquipmentSlot.HEAD,new Item.Properties().tab(SFTabs.SFTAB_ARMOR)));
    public static final RegistryObject<Item> AMETHRYNE_CHESTPLATE = register("amethryne_chestplate",() -> new ArmorItem(SFArmorMaterials.AMETHRYNE,EquipmentSlot.CHEST,new Item.Properties().tab(SFTabs.SFTAB_ARMOR)));
    public static final RegistryObject<Item> AMETHRYNE_LEGGINGS = register("amethryne_leggings",() -> new ArmorItem(SFArmorMaterials.AMETHRYNE,EquipmentSlot.LEGS,new Item.Properties().tab(SFTabs.SFTAB_ARMOR)));
    public static final RegistryObject<Item> AMETHRYNE_BOOTS = register("amethryne_boots",() -> new ArmorItem(SFArmorMaterials.AMETHRYNE,EquipmentSlot.FEET,new Item.Properties().tab(SFTabs.SFTAB_ARMOR)));

    public static final RegistryObject<Item> MAGMA_CHARM = register("magma_charm",() -> new MagmaCharm(SFArmorMaterials.MAGMA_CHARM,EquipmentSlot.CHEST,new Item.Properties().setNoRepair().fireResistant().tab(SFTabs.SFTAB_ARMOR)));

    public static final RegistryObject<Item> ROSIN = register("rosin",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES)));
    public static final RegistryObject<Item> SILICON = register("silicon",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES)));
    public static final RegistryObject<Item> RAW_RUBBER = register("raw_rubber",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES)));
    public static final RegistryObject<Item> RUBBER = register("rubber",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES)));
    public static final RegistryObject<Item> CARBON = register("carbon",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES)));
    public static final RegistryObject<Item> PLASTIC = register("plastic",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES)));
    public static final RegistryObject<Item> CRUSHED_PLASTIC = register("crushed_plastic",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES)));
    public static final RegistryObject<Item> CRUSHED_COAL = register("crushed_coal",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES)));
    public static final RegistryObject<Item> FIBERGLASS = register("fiberglass",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES)));
    public static final RegistryObject<Item> FIBERGLASS_MIX = register("fiberglass_mix",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES)));
    public static final RegistryObject<Item> S_CRIMSON_EXTRACT = register("s_crimson_extract",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES)));
    public static final RegistryObject<Item> CRIMSON_EXTRACT = register("crimson_extract",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES)));
    public static final RegistryObject<Item> CNT_CRIMSON_EXTRACT = register("cnt_crimson_extract",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES)));

    public static final RegistryObject<Item> BLADE = register("blade",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES)));
    public static final RegistryObject<Item> MIXER_BLADE = register("mixer_blade",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES)));
    public static final RegistryObject<Item> MACHINE_CASE = register("machine_case",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES)));
    public static final RegistryObject<Item> PRESS_PART = register("press_part",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES)));
    public static final RegistryObject<Item> TANK = register("tank",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES)));
    public static final RegistryObject<Item> COIL_COPPER = register("coil_copper",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES)));
    public static final RegistryObject<Item> HEATING_ELEMENT = register("heating_element",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES)));
    //public static final RegistryObject<Item> ENERGY_COMPONENT = register("energy_component",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES)));
    //public static final RegistryObject<Item> ELECTRIC_MOTOR = register("electric_motor",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES)));
    //public static final RegistryObject<Item> ALLOY_TERBIUM_IRON = register("alloy_terbium_iron",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES)));

    public static final RegistryObject<Item> CAST_FORM_FOR_CHIPS = register("cast_form_for_chips",CastFormForChips::new);
    public static final RegistryObject<Item> CAST_FORM_FOR_SILICON_CHIPS = register("cast_form_for_silicon_chips",CastFormForSiliconChips::new);

    public static final RegistryObject<Item> RAINBOW_POWDER = register("rainbow_powder",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_RESOURCES).stacksTo(16)));

    public static final RegistryObject<Item> MORTAR = register("mortar",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_TOOLS).stacksTo(16)));
    public static final RegistryObject<Item> PESTLE = register("pestle",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_TOOLS).stacksTo(16)));
    public static final RegistryObject<Item> MORTAR_AND_PESTLE = register("mortar_and_pestle",() -> new Item(new Item.Properties().tab(SFTabs.SFTAB_TOOLS).stacksTo(1)));

    public static final RegistryObject<SwordItem> FIST_ENERGY = register("fist_energy",() -> new FistEnergy(SFTiers.FIST_ENERGY,20,-2.4f,new Item.Properties().tab(SFTabs.SFTAB_WEAPONS).stacksTo(1).fireResistant().setNoRepair().durability(3)));
    public static final RegistryObject<SwordItem> FIST_ENERGY2 = register("fist_energy2",() -> new FistEnergy2(SFTiers.FIST_ENERGY,49,-1.4f,new Item.Properties().tab(SFTabs.SFTAB_WEAPONS).stacksTo(1).fireResistant().setNoRepair().durability(2)));
    public static final RegistryObject<SwordItem> FIST_ENERGY3 = register("fist_energy3",() -> new FistEnergy3(SFTiers.FIST_ENERGY,99,0.4f,new Item.Properties().tab(SFTabs.SFTAB_WEAPONS).stacksTo(1).fireResistant().setNoRepair().durability(1)));

    public static final RegistryObject<SwordItem> MURAMASA = register("muramasa",() -> new Muramasa(SFTiers.MURAMASA,3000,6.0f,new Item.Properties().tab(SFTabs.SFTAB_WEAPONS).stacksTo(1).fireResistant().durability(666666)));
    public static final RegistryObject<Item> QUANTUM_AXE = register("quantum_axe", () -> new QuantumAxe(SFTiers.QUANTUM, 5.0F, -3.0F,new Item.Properties().tab(SFTabs.SFTAB_TOOLS)));
     public SFItems(Properties properties) {super(properties);}
    private static <T extends Item> RegistryObject<T> register(final String name,final Supplier<T> item) {return ITEMS.register(name,item);}
}
