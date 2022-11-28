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
    //#6 COBALT
    public static final RegistryObject<Item> RAW_COBALT = register("raw_cobalt",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> COBALT_INGOT = register("cobalt_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#7 NICKEL
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
    //#10 YTTRIUM || IDK ADD OR NOT
    public static final RegistryObject<Item> RAW_YTTRIUM = register("raw_yttrium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> YTTRIUM_INGOT = register("yttrium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#11 ZIRCONIUM
    public static final RegistryObject<Item> RAW_ZIRCONIUM = register("raw_zirconium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> ZIRCONIUM_INGOT = register("zirconium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#12 NIOBIUM || IDK ADD OR NOT
    public static final RegistryObject<Item> RAW_NIOBIUM = register("raw_niobium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> NIOBIUM_INGOT = register("niobium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#13 MOLYBDENUM || IDK ADD OR NOT
    public static final RegistryObject<Item> RAW_MOLYBDENUM = register("raw_molybdenum",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> MOLYBDENUM_INGOT = register("molybdenum_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#14 TECHNETIUM || IDK ADD OR NOT
    public static final RegistryObject<Item> RAW_TECHNETIUM = register("raw_technetium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> TECHNETIUM_INGOT = register("technetium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#15 RUTHENIUM || IDK ADD OR NOT
    public static final RegistryObject<Item> RAW_RUTHENIUM = register("raw_ruthenium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> RUTHENIUM_INGOT = register("ruthenium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#16 RHODIUM || IDK ADD OR NOT
    public static final RegistryObject<Item> RAW_RHODIUM = register("raw_rhodium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> RHODIUM_INGOT = register("rhodium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //DONE! #17 PALLADIUM
    public static final RegistryObject<Item> RAW_PALLADIUM = register("raw_palladium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> PALLADIUM_INGOT = register("palladium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#18 SILVER
    public static final RegistryObject<Item> RAW_SILVER = register("raw_silver",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> SILVER_INGOT = register("silver_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#19 CADMIUM || IDK ADD OR NOT
    public static final RegistryObject<Item> RAW_CADMIUM = register("raw_cadmium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> CADMIUM_INGOT = register("cadmium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#20 INDIUM || IDK ADD OR NOT
    public static final RegistryObject<Item> RAW_INDIUM = register("raw_indium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> INDIUM_INGOT = register("indium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#21 LANTHANUM || IDK ADD OR NOT
    public static final RegistryObject<Item> RAW_LANTHANUM = register("raw_lanthanum",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> LANTHANUM_INGOT = register("lanthanum_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#22 CERIUM || IDK ADD OR NOT
    public static final RegistryObject<Item> RAW_CERIUM = register("raw_cerium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> CERIUM_INGOT = register("cerium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#23 PRASEODYMIUM || IDK ADD OR NOT
    public static final RegistryObject<Item> RAW_PRASEODYMIUM = register("raw_praseodymium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> PRASEODYMIUM_INGOT = register("praseodymium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#24 NEODYMIUM || IDK ADD OR NOT
    public static final RegistryObject<Item> RAW_NEODYMIUM = register("raw_neodymium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> NEODYMIUM_INGOT = register("neodymium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#25 PROMETHIUM || IDK ADD OR NOT
    public static final RegistryObject<Item> RAW_PROMETHIUM = register("raw_promethium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> PROMETHIUM_INGOT = register("promethium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#26 SAMARIUM || IDK ADD OR NOT
    public static final RegistryObject<Item> RAW_SAMARIUM = register("raw_samarium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> SAMARIUM_INGOT = register("samarium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#27 EUROPIUM || IDK ADD OR NOT
    public static final RegistryObject<Item> RAW_EUROPIUM = register("raw_europium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> EUROPIUM_INGOT = register("europium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#28 GADOLINIUM || IDK ADD OR NOT
    public static final RegistryObject<Item> RAW_GADOLINIUM = register("raw_gadolinium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> GADOLINIUM_INGOT = register("gadolinium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#29 TERBIUM || IDK ADD OR NOT
    public static final RegistryObject<Item> RAW_TERBIUM = register("raw_terbium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> TERBIUM_INGOT = register("terbium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#30 DYSPROSIUM || IDK ADD OR NOT
    public static final RegistryObject<Item> RAW_DYSPROSIUM = register("raw_dysprosium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> DYSPROSIUM_INGOT = register("dysprosium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#31 HOLMIUM || IDK ADD OR NOT
    public static final RegistryObject<Item> RAW_HOLMIUM = register("raw_holmium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> HOLMIUM_INGOT = register("holmium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#32 ERBIUM || IDK ADD OR NOT
    public static final RegistryObject<Item> RAW_ERBIUM = register("raw_erbium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> ERBIUM_INGOT = register("erbium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#33 THULIUM || IDK ADD OR NOT
    public static final RegistryObject<Item> RAW_THULIUM = register("raw_thulium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> THULIUM_INGOT = register("thulium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#34 YTTERBIUM || IDK ADD OR NOT
    public static final RegistryObject<Item> RAW_YTTERBIUM = register("raw_ytterbium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> YTTERBIUM_INGOT = register("ytterbium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#35 LUTETIUM || IDK ADD OR NOT
    public static final RegistryObject<Item> RAW_LUTETIUM = register("raw_lutetium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> LUTETIUM_INGOT = register("lutetium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#36 HAFNIUM || IDK ADD OR NOT
    public static final RegistryObject<Item> RAW_HAFNIUM = register("raw_hafnium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> HAFNIUM_INGOT = register("hafnium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#37 TANTALUM || IDK ADD OR NOT
    public static final RegistryObject<Item> RAW_TANTALUM = register("raw_tantalum",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> TANTALUM_INGOT = register("tantalum_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //DONE! #38 TUNGSTEN
    public static final RegistryObject<Item> RAW_TUNGSTEN = register("raw_tungsten",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> TUNGSTEN_INGOT = register("tungsten_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));

    //#39 RHENIUM || IDK ADD OR NOT
    public static final RegistryObject<Item> RAW_RHENIUM = register("raw_rhenium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> RHENIUM_INGOT = register("rhenium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#40 OSMIUM
    public static final RegistryObject<Item> RAW_OSMIUM = register("raw_osmium",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> OSMIUM_INGOT = register("osmium_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //DONE! #41 IRIDIUM
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
    //DONE! #42 PLATINUM
    public static final RegistryObject<Item> RAW_PLATINUM = register("raw_platinum",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> PLATINUM_INGOT = register("platinum_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //#43 LEAD
    public static final RegistryObject<Item> RAW_LEAD = register("raw_lead",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> LEAD_INGOT = register("lead_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //DONE! #44 BISMUTH
    public static final RegistryObject<Item> RAW_BISMUTH = register("raw_bismuth",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    public static final RegistryObject<Item> BISMUTH_INGOT = register("bismuth_ingot",
            () -> new Item(new Item.Properties()
                    .tab(TabInit.STRFANTAB_RESOURCES)
            ));
    //DONE! #45 URANIUM
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
