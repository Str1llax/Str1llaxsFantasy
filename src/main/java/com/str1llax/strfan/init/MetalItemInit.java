package com.str1llax.strfan.init;

import com.str1llax.strfan.Str1llaxsFantasy;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class MetalItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Str1llaxsFantasy.MOD_ID);
    //INGOTS & METALS FROM ORES
    //DONE! #1 TIN
    public static final RegistryObject<Item> RAW_TIN = register("raw_tin",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> TIN_INGOT = register("tin_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //DONE! #2 TITANIUM
    public static final RegistryObject<Item> RAW_TITANIUM = register("raw_titanium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> TITANIUM_INGOT = register("titanium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //DONE! #3 VANADIUM
    public static final RegistryObject<Item> RAW_VANADIUM = register("raw_vanadium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> VANADIUM_INGOT = register("vanadium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //DONE! #4 CHROMIUM
    public static final RegistryObject<Item> RAW_CHROMIUM = register("raw_chromium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> CHROMIUM_INGOT = register("chromium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //DONE! #5 MANGANESE
    public static final RegistryObject<Item> RAW_MANGANESE = register("raw_manganese",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> MANGANESE_INGOT = register("manganese_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //DONE! #6 COBALT
    public static final RegistryObject<Item> RAW_COBALT = register("raw_cobalt",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> COBALT_INGOT = register("cobalt_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //DONE! #7 NICKEL
    public static final RegistryObject<Item> RAW_NICKEL = register("raw_nickel",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> NICKEL_INGOT = register("nickel_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#8 ZINC
    public static final RegistryObject<Item> RAW_ZINC = register("raw_zinc",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> ZINC_INGOT = register("zinc_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#9 GERMANIUM
    public static final RegistryObject<Item> RAW_GERMANIUM = register("raw_germanium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> GERMANIUM_INGOT = register("germanium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#10 ZIRCONIUM
    public static final RegistryObject<Item> RAW_ZIRCONIUM = register("raw_zirconium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> ZIRCONIUM_INGOT = register("zirconium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //DONE! #11 PALLADIUM
    public static final RegistryObject<Item> RAW_PALLADIUM = register("raw_palladium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> PALLADIUM_INGOT = register("palladium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#12 SILVER
    public static final RegistryObject<Item> RAW_SILVER = register("raw_silver",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> SILVER_INGOT = register("silver_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#13 CADMIUM || IDK ADD OR NOT
    public static final RegistryObject<Item> RAW_CADMIUM = register("raw_cadmium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> CADMIUM_INGOT = register("cadmium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#14 INDIUM || IDK ADD OR NOT
    public static final RegistryObject<Item> RAW_INDIUM = register("raw_indium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> INDIUM_INGOT = register("indium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#15 TERBIUM || IDK ADD OR NOT
    public static final RegistryObject<Item> RAW_TERBIUM = register("raw_terbium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> TERBIUM_INGOT = register("terbium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#16 HAFNIUM || IDK ADD OR NOT
    public static final RegistryObject<Item> RAW_HAFNIUM = register("raw_hafnium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> HAFNIUM_INGOT = register("hafnium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //DONE! #17 TUNGSTEN
    public static final RegistryObject<Item> RAW_TUNGSTEN = register("raw_tungsten",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> TUNGSTEN_INGOT = register("tungsten_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));

    //#18 RHENIUM || IDK ADD OR NOT
    public static final RegistryObject<Item> RAW_RHENIUM = register("raw_rhenium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> RHENIUM_INGOT = register("rhenium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#19 OSMIUM
    public static final RegistryObject<Item> RAW_OSMIUM = register("raw_osmium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> OSMIUM_INGOT = register("osmium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //DONE! #20 IRIDIUM
    public static final RegistryObject<Item> RAW_IRIDIUM = register("raw_iridium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> IRIDIUM = register("iridium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> IRIDIUM_INGOT = register("iridium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //DONE! #21 PLATINUM
    public static final RegistryObject<Item> RAW_PLATINUM = register("raw_platinum",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> PLATINUM_INGOT = register("platinum_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#22 LEAD
    public static final RegistryObject<Item> RAW_LEAD = register("raw_lead",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> LEAD_INGOT = register("lead_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //DONE! #23 BISMUTH
    public static final RegistryObject<Item> RAW_BISMUTH = register("raw_bismuth",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> BISMUTH_INGOT = register("bismuth_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //DONE! #24 URANIUM
    public static final RegistryObject<Item> RAW_URANIUM = register("raw_uranium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> URANIUM = register("uranium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> URANIUM_INGOT = register("uranium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //END OF INGOTS & RAW METALS

    private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item)
    {
        return ITEMS.register(name, item);
    }

}
