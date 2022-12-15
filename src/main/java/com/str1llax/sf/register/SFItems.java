package com.str1llax.sf.register;

import com.str1llax.sf.SF;
import com.str1llax.sf.item.*;
import com.str1llax.sf.util.SFArmorMaterials;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class SFItems extends Item {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SF.MOD_ID);

    //BASIC ITEMS
    public static final RegistryObject<Item> EXAMPLE_ITEM = register("example_item", () -> new Item(new Item.Properties().tab(SFTabs.SFTAB)));

    //TOOLS
    public static final RegistryObject<Item> HAMMER_TOOL = register("hammer_tool", HammerTool::new);

    public static final RegistryObject<Item> CUTTERS_TOOL = register("cutters_tool", CuttersTool::new);

    public static final RegistryObject<Item> DATA_TABLET = register("data_tablet",
            () -> new DataTabletItem(new Item.Properties().tab(SFTabs.SFTAB).stacksTo(1)));

    //FOOD INGREDIENTS
    public static final RegistryObject<Item> FLOUR = register("flour",
            () -> new Item(new Item.Properties()
                    .tab(SFTabs.SFTAB_RESOURCES)
            ));


    public static final RegistryObject<Item> DOUGH = register("dough",
            () -> new Item(new Item.Properties()
                    .tab(SFTabs.SFTAB_RESOURCES)
                    ));

    //FOOD
    public static final RegistryObject<Item> DUMPLING = register("dumpling",
            () -> new Item(new Item.Properties()
                    .tab(CreativeModeTab.TAB_FOOD)
                    .food(new FoodProperties.
                            Builder()
                            .nutrition(1)
                            .saturationMod(0.5f)
                            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 100, 0), 1f)
                            .build())   ));

    public static final RegistryObject<Item> DUMPLINGS = register("dumplings",
            () -> new Item(new Item.Properties()
                    .tab(CreativeModeTab.TAB_FOOD)
                    .food(new FoodProperties.
                            Builder()
                            .nutrition(2)
                            .saturationMod(1.0f)
                            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 100, 0), 1f)
                            .build())   ));


    //WEAPON PARTS
    public static final RegistryObject<Item> M_GUARD = register("m_guard",
            () -> new Item(new Item.Properties()
                    .tab(SFTabs.SFTAB_PARTS)
                    .stacksTo(1)
                    .fireResistant()
            ));

    public static final RegistryObject<Item> M_HANDLE = register("m_handle",
            () -> new Item(new Item.Properties()
                    .tab(SFTabs.SFTAB_PARTS)
                    .stacksTo(1)
                    .fireResistant()
            ));

    public static final RegistryObject<Item> M_BLADE = register("m_blade",
            () -> new Item(new Item.Properties()
                    .tab(SFTabs.SFTAB_PARTS)
                    .stacksTo(1)
                    .fireResistant()
            ));

    //CHIPS
    public static final RegistryObject<Item> CIRCUIT_SILICON_CHIP = register("circuit_silicon_chip",
            () -> new Item(new Item.Properties()
                    .tab(SFTabs.SFTAB_MACHINES)
                    .stacksTo(64)
            ));

    public static final RegistryObject<Item> CIRCUIT_IRON_CHIP = register("circuit_iron_chip",
            () -> new Item(new Item.Properties()
                    .tab(SFTabs.SFTAB_MACHINES)
                    .stacksTo(64)
            ));

    public static final RegistryObject<Item> CIRCUIT_GOLD_CHIP = register("circuit_gold_chip",
            () -> new Item(new Item.Properties()
                    .tab(SFTabs.SFTAB_MACHINES)
                    .stacksTo(64)
            ));

    public static final RegistryObject<Item> CIRCUIT_DIAMOND_CHIP = register("circuit_diamond_chip",
            () -> new Item(new Item.Properties()
                    .tab(SFTabs.SFTAB_MACHINES)
                    .stacksTo(64)
            ));

    //CAPACITORS
    public static final RegistryObject<Item> CAPACITOR_BASE = register("capacitor_base",
            () -> new Item(new Item.Properties()
                    .tab(SFTabs.SFTAB_MACHINES)
                    .stacksTo(64)
            ));

    //CIRCUITS
    public static final RegistryObject<Item> CIRCUIT_BASE = register("circuit_base",
            () -> new Item(new Item.Properties()
                    .tab(SFTabs.SFTAB_MACHINES)
                    .stacksTo(64)
            ));

    public static final RegistryObject<Item> CIRCUIT_IRON = register("circuit_iron",
            () -> new Item(new Item.Properties()
                    .tab(SFTabs.SFTAB_MACHINES)
                    .stacksTo(64)
            ));

    public static final RegistryObject<Item> CIRCUIT_GOLD = register("circuit_gold",
            () -> new Item(new Item.Properties()
                    .tab(SFTabs.SFTAB_MACHINES)
                    .stacksTo(64)
            ));

    public static final RegistryObject<Item> CIRCUIT_DIAMOND = register("circuit_diamond",
            () -> new Item(new Item.Properties()
                    .tab(SFTabs.SFTAB_MACHINES)
                    .stacksTo(64)
            ));

    //RESOURCES
    //CELLS
    public static final RegistryObject<Item> CELL_IRON = register("cell_iron",
            () -> new Item(new Item.Properties()
                    .tab(SFTabs.SFTAB_RESOURCES)
                    .stacksTo(64)
            ));

    //PlATES
    public static final RegistryObject<Item> PLATE_IRON = register("plate_iron",
            () -> new Item(new Item.Properties()
                    .tab(SFTabs.SFTAB_RESOURCES)
                    .stacksTo(64)
            ));

    //ALLOYS
    public static final RegistryObject<Item> CRIMSON_ENERGY_INGOT = register("crimson_energy_ingot",
            () -> new Item(new Item.Properties()
                    .tab(SFTabs.SFTAB_RESOURCES)
                    .stacksTo(64)
                    .fireResistant()
            ));

    public static final RegistryObject<Item> MIGHTY_IRON_INGOT = register("mighty_iron_ingot",
            () -> new Item(new Item.Properties()
                    .tab(SFTabs.SFTAB_RESOURCES)
                    .stacksTo(64)
                    .fireResistant()
            ));

    //GEMS
    public static final RegistryObject<Item> RUBY = register("ruby",
            () -> new Item(new Item.Properties()
                    .tab(SFTabs.SFTAB_FLORA)
                    .stacksTo(64)
            ));

    //MATERIALS
    public static final RegistryObject<Item> ROSIN = register("rosin",
            () -> new Item(new Item.Properties()
                    .tab(SFTabs.SFTAB_RESOURCES)
                    .stacksTo(64)
            ));

    public static final RegistryObject<Item> SILICON = register("silicon",
            () -> new Item(new Item.Properties()
                    .tab(SFTabs.SFTAB_RESOURCES)
                    .stacksTo(64)
            ));

    public static final RegistryObject<Item> RAW_RUBBER = register("raw_rubber",
            () -> new Item(new Item.Properties()
                    .tab(SFTabs.SFTAB_RESOURCES)
                    .stacksTo(64)
            ));

    public static final RegistryObject<Item> RUBBER = register("rubber",
            () -> new Item(new Item.Properties()
                    .tab(SFTabs.SFTAB_RESOURCES)
                    .stacksTo(64)
            ));

    public static final RegistryObject<Item> CARBON = register("carbon",
            () -> new Item(new Item.Properties()
                    .tab(SFTabs.SFTAB_RESOURCES)
                    .stacksTo(64)
            ));

    public static final RegistryObject<Item> PLASTIC = register("plastic",
            () -> new Item(new Item.Properties()
                    .tab(SFTabs.SFTAB_RESOURCES)
                    .stacksTo(64)
            ));

    public static final RegistryObject<Item> CRUSHED_PLASTIC = register("crushed_plastic",
            () -> new Item(new Item.Properties()
                    .tab(SFTabs.SFTAB_RESOURCES)
                    .stacksTo(64)
            ));

    public static final RegistryObject<Item> CRUSHED_COAL = register("crushed_coal",
            () -> new Item(new Item.Properties()
                    .tab(SFTabs.SFTAB_RESOURCES)
                    .stacksTo(64)
            ));

    public static final RegistryObject<Item> FIBERGLASS = register("fiberglass",
            () -> new Item(new Item.Properties()
                    .tab(SFTabs.SFTAB_RESOURCES)
                    .stacksTo(64)
            ));

    public static final RegistryObject<Item> FIBERGLASS_MIX = register("fiberglass_mix",
            () -> new Item(new Item.Properties()
                    .tab(SFTabs.SFTAB_RESOURCES)
                    .stacksTo(64)
            ));
    public static final RegistryObject<Item> S_CRIMSON_EXTRACT = register("s_crimson_extract",
            () -> new Item(new Item.Properties()
                    .tab(SFTabs.SFTAB_RESOURCES)
                    .stacksTo(64)
            ));

    public static final RegistryObject<Item> CRIMSON_EXTRACT = register("crimson_extract",
            () -> new Item(new Item.Properties()
                    .tab(SFTabs.SFTAB_RESOURCES)
                    .stacksTo(64)
            ));

    public static final RegistryObject<Item> CNT_CRIMSON_EXTRACT = register("cnt_crimson_extract",
            () -> new Item(new Item.Properties()
                    .tab(SFTabs.SFTAB_RESOURCES)
                    .stacksTo(64)
            ));
    //END OF RESOURCES
    //MISC
    public static final RegistryObject<Item> CAST_FORM_FOR_CHIPS = register("cast_form_for_chips",
            () -> new Item(new Item.Properties()
                    .tab(SFTabs.SFTAB_MACHINES)
                    .stacksTo(64)
            ));

    public static final RegistryObject<Item> CAST_FORM_FOR_SILICON_CHIPS = register("cast_form_for_silicon_chips",
            () -> new Item(new Item.Properties()
                    .tab(SFTabs.SFTAB_MACHINES)
                    .stacksTo(64)
            ));

    public static final RegistryObject<Item> RAINBOW_POWDER = register("rainbow_powder",
            () -> new Item(new Item.Properties()
                    .tab(SFTabs.SFTAB_RESOURCES)
                    .stacksTo(16)
            ));

    public static final RegistryObject<Item> MORTAR = register("mortar",
            () -> new Item(new Item.Properties()
                    .tab(SFTabs.SFTAB_TOOLS)
                    .stacksTo(16)
            ));

    public static final RegistryObject<Item> PESTLE = register("pestle",
            () -> new Item(new Item.Properties()
                    .tab(SFTabs.SFTAB_TOOLS)
                    .stacksTo(16)
            ));

    public static final RegistryObject<Item> MORTAR_AND_PESTLE = register("mortar_and_pestle",
            () -> new Item(new Item.Properties()
                    .tab(SFTabs.SFTAB_TOOLS)
                    .stacksTo(1)
            ));
    //END OF MISC


    //ADVANCED ITEMS
    public static final RegistryObject<Item> ADVANCED_ITEM = register("advanced_item",
            () -> new AdvancedItem(new Item.Properties()
                    .tab(SFTabs.SFTAB)
                    .stacksTo(8)
                    .fireResistant()
                    .food(new FoodProperties
                            .Builder()
                            .alwaysEat()
                            .nutrition(10)
                            .saturationMod(5.0f)
                            .effect(() -> new MobEffectInstance(MobEffects.GLOWING, 6000, 2), 1f)
                            .build())   ));
    //END OF ADVANCED ITEMS

    //WEAPONS
    //MAGIC
    public static final RegistryObject<SwordItem> FIST_ENERGY = register("fist_energy",
            () -> new FistEnergy(SFTiers.FIST_ENERGY, 20, -2.4f,
                    new Item.Properties()
                            .tab(SFTabs.SFTAB_WEAPONS)
                            .stacksTo(1)
                            .fireResistant()
                            .setNoRepair()
                            .durability(3)));

    public static final RegistryObject<SwordItem> FIST_ENERGY2 = register("fist_energy2",
            () -> new FistEnergy2(SFTiers.FIST_ENERGY, 49, -1.4f,
                    new Item.Properties()
                            .tab(SFTabs.SFTAB_WEAPONS)
                            .stacksTo(1)
                            .fireResistant()
                            .setNoRepair()
                            .durability(2)));

    public static final RegistryObject<SwordItem> FIST_ENERGY3 = register("fist_energy3",
            () -> new FistEnergy3(SFTiers.FIST_ENERGY, 99, 0.4f,
                    new Item.Properties()
                            .tab(SFTabs.SFTAB_WEAPONS)
                            .stacksTo(1)
                            .fireResistant()
                            .setNoRepair()
                            .durability(1)));

    //SWORDS
    public static final RegistryObject<Item> RUBY_SWORD = register("ruby_sword",
            () -> new RubySwordItem(SFTiers.RUBY,3, -2.4F,new Item.Properties().tab(SFTabs.SFTAB_WEAPONS)));

    public static final RegistryObject<SwordItem> MURAMASA = register("muramasa",
            () -> new Muramasa(SFTiers.MURAMASA, 3000, 6.0f,
                    new Item.Properties()
                            .tab(SFTabs.SFTAB_WEAPONS)
                            .stacksTo(1)
                            .fireResistant()
                            .durability(666666)));
    //BOWS
    public static final RegistryObject<Item> RUBY_BOW = register("ruby_bow",
            () -> new BowItem(new Item.Properties().defaultDurability(800).tab(SFTabs.SFTAB_WEAPONS)));

    //PICKAXES
    public static final RegistryObject<Item> RUBY_PICKAXE = register("ruby_pickaxe",
            () -> new PickaxeItem(SFTiers.RUBY,1, -2.8F,new Item.Properties().tab(SFTabs.SFTAB_TOOLS)));
    //AXES
    public static final RegistryObject<Item> RUBY_AXE = register("ruby_axe",
            () -> new AxeItem(SFTiers.RUBY,5.0F, -3.0F,new Item.Properties().tab(SFTabs.SFTAB_TOOLS)));
    //SHOVELS
    public static final RegistryObject<Item> RUBY_SHOVEL = register("ruby_shovel",
            () -> new ShovelItem(SFTiers.RUBY,1.5F, -3.0F,new Item.Properties().tab(SFTabs.SFTAB_TOOLS)));
    //HOES
    public static final RegistryObject<Item> RUBY_HOE = register("ruby_hoe",
            () -> new HoeItem(SFTiers.RUBY, -3, 0.0F,new Item.Properties().tab(SFTabs.SFTAB_TOOLS)));

    //HELMETS
    public static final RegistryObject<Item> RUBY_HELMET = register("ruby_helmet",
            () -> new ModArmorItem(SFArmorMaterials.RUBY, EquipmentSlot.HEAD,new Item.Properties().tab(SFTabs.SFTAB_ARMOR)));
    //CHESTPLATES
    public static final RegistryObject<Item> RUBY_CHESTPLATE = register("ruby_chestplate",
            () -> new ArmorItem(SFArmorMaterials.RUBY, EquipmentSlot.CHEST,new Item.Properties().tab(SFTabs.SFTAB_ARMOR)));
    //LEGGINGS
    public static final RegistryObject<Item> RUBY_LEGGINGS = register("ruby_leggings",
            () -> new ArmorItem(SFArmorMaterials.RUBY, EquipmentSlot.LEGS,new Item.Properties().tab(SFTabs.SFTAB_ARMOR)));
    //BOOTS
    public static final RegistryObject<Item> RUBY_BOOTS = register("ruby_boots",
            () -> new ArmorItem(SFArmorMaterials.RUBY, EquipmentSlot.FEET,new Item.Properties().tab(SFTabs.SFTAB_ARMOR)));
    public SFItems(Properties properties) {
        super(properties);
    }
    private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item)
    {
        return ITEMS.register(name, item);
    }
}
