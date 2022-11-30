package com.str1llax.strfan.init;

import com.str1llax.strfan.Str1llaxsFantasy;
import com.str1llax.strfan.item.AdvancedItem;
import com.str1llax.strfan.item.CuttersTool;
import com.str1llax.strfan.item.HammerTool;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ItemInit extends Item {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Str1llaxsFantasy.MOD_ID);

    //BASIC ITEMS
    public static final RegistryObject<Item> EXAMPLE_ITEM = register("example_item",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB)
            ));

    //TOOLS
    public static final RegistryObject<Item> HAMMER_TOOL = register("hammer_tool", HammerTool::new);

    public static final RegistryObject<Item> CUTTERS_TOOL = register("cutters_tool", CuttersTool::new);

    //FOOD INGREDIENTS
    public static final RegistryObject<Item> FLOUR = register("flour",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_FOOD)
            ));


    public static final RegistryObject<Item> DOUGH = register("dough",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_FOOD)
                    ));

    //FOOD
    public static final RegistryObject<Item> DUMPLING = register("dumpling",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_FOOD)
                    .food(new FoodProperties.
                            Builder()
                            .nutrition(1)
                            .saturationMod(0.5f)
                            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 100, 0), 1f)
                            .build())   ));

    public static final RegistryObject<Item> DUMPLINGS = register("dumplings",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_FOOD)
                    .food(new FoodProperties.
                            Builder()
                            .nutrition(2)
                            .saturationMod(1.0f)
                            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 100, 0), 1f)
                            .build())   ));


    //WEAPON PARTS
    public static final RegistryObject<Item> M_GUARD = register("m_guard",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_WEAPONS)
                    .stacksTo(1)
                    .fireResistant()
            ));

    public static final RegistryObject<Item> M_HANDLE = register("m_handle",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_WEAPONS)
                    .stacksTo(1)
                    .fireResistant()
            ));

    public static final RegistryObject<Item> M_BLADE = register("m_blade",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_WEAPONS)
                    .stacksTo(1)
                    .fireResistant()
            ));

    //CHIPS
    public static final RegistryObject<Item> CIRCUIT_SILICON_CHIP = register("circuit_silicon_chip",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_MACHINES)
                    .stacksTo(64)
            ));

    public static final RegistryObject<Item> CIRCUIT_IRON_CHIP = register("circuit_iron_chip",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_MACHINES)
                    .stacksTo(64)
            ));

    public static final RegistryObject<Item> CIRCUIT_GOLD_CHIP = register("circuit_gold_chip",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_MACHINES)
                    .stacksTo(64)
            ));

    public static final RegistryObject<Item> CIRCUIT_DIAMOND_CHIP = register("circuit_diamond_chip",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_MACHINES)
                    .stacksTo(64)
            ));

    //CAPACITORS
    public static final RegistryObject<Item> CAPACITOR_BASE = register("capacitor_base",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_MACHINES)
                    .stacksTo(64)
            ));

    //CIRCUITS
    public static final RegistryObject<Item> CIRCUIT_BASE = register("circuit_base",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_MACHINES)
                    .stacksTo(64)
            ));

    public static final RegistryObject<Item> CIRCUIT_IRON = register("circuit_iron",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_MACHINES)
                    .stacksTo(64)
            ));

    public static final RegistryObject<Item> CIRCUIT_GOLD = register("circuit_gold",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_MACHINES)
                    .stacksTo(64)
            ));

    public static final RegistryObject<Item> CIRCUIT_DIAMOND = register("circuit_diamond",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_MACHINES)
                    .stacksTo(64)
            ));

    //RESOURCES
    //CELLS
    public static final RegistryObject<Item> CELL_IRON = register("cell_iron",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
                    .stacksTo(64)
            ));

    //PlATES
    public static final RegistryObject<Item> PLATE_IRON = register("plate_iron",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
                    .stacksTo(64)
            ));

    //ALLOYS
    public static final RegistryObject<Item> CRIMSON_ENERGY_INGOT = register("crimson_energy_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
                    .stacksTo(64)
                    .fireResistant()
            ));

    public static final RegistryObject<Item> MIGHTY_IRON_INGOT = register("mighty_iron_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
                    .stacksTo(64)
                    .fireResistant()
            ));

    //MATERIALS
    public static final RegistryObject<Item> ROSIN = register("rosin",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
                    .stacksTo(64)
            ));

    public static final RegistryObject<Item> SILICON = register("silicon",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
                    .stacksTo(64)
            ));

    public static final RegistryObject<Item> RAW_RUBBER = register("raw_rubber",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
                    .stacksTo(64)
            ));

    public static final RegistryObject<Item> RUBBER = register("rubber",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
                    .stacksTo(64)
            ));

    public static final RegistryObject<Item> CARBON = register("carbon",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
                    .stacksTo(64)
            ));

    public static final RegistryObject<Item> PLASTIC = register("plastic",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
                    .stacksTo(64)
            ));

    public static final RegistryObject<Item> CRUSHED_PLASTIC = register("crushed_plastic",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
                    .stacksTo(64)
            ));

    public static final RegistryObject<Item> CRUSHED_COAL = register("crushed_coal",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
                    .stacksTo(64)
            ));

    public static final RegistryObject<Item> FIBERGLASS = register("fiberglass",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
                    .stacksTo(64)
            ));

    public static final RegistryObject<Item> FIBERGLASS_MIX = register("fiberglass_mix",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
                    .stacksTo(64)
            ));

    public static final RegistryObject<Item> CRIMSON_EXTRACT = register("crimson_extract",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
                    .stacksTo(64)
            ));
    //END OF RESOURCES
    //MISC
    public static final RegistryObject<Item> CAST_FORM_FOR_CHIPS = register("cast_form_for_chips",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_MACHINES)
                    .stacksTo(64)
            ));

    public static final RegistryObject<Item> CAST_FORM_FOR_SILICON_CHIPS = register("cast_form_for_silicon_chips",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_MACHINES)
                    .stacksTo(64)
            ));

    public static final RegistryObject<Item> RAINBOW_POWDER = register("rainbow_powder",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
                    .stacksTo(16)
            ));

    public static final RegistryObject<Item> MORTAR = register("mortar",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_FOOD)
                    .stacksTo(16)
            ));

    public static final RegistryObject<Item> PESTLE = register("pestle",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_FOOD)
                    .stacksTo(16)
            ));

    public static final RegistryObject<Item> MORTAR_AND_PESTLE = register("mortar_and_pestle",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_FOOD)
                    .stacksTo(1)
            ));
    //END OF MISC


    //ADVANCED ITEMS
    public static final RegistryObject<Item> ADVANCED_ITEM = register("advanced_item",
            () -> new AdvancedItem(new Item.Properties()
                    .tab(TabInit.STRFANTAB)
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
    //SWORDS
    public static final RegistryObject<SwordItem> MURAMASA = register("muramasa",
            () -> new SwordItem(TierInit.MURAMASA, 3000, 5f,
                    new Item.Properties().rarity(Rarity.EPIC)
                            .tab(TabInit.STRFANTAB_WEAPONS)
                            .stacksTo(1)
                            .fireResistant()
                            .durability(666666)));

    public ItemInit(Properties p_41383_) {
        super(p_41383_);
    }

    //END OF WEAPONS

    private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item)
    {
        return ITEMS.register(name, item);
    }
}
