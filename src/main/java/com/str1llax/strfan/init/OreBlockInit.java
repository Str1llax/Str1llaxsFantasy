package com.str1llax.strfan.init;

import com.str1llax.strfan.Str1llaxsFantasy;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;
import java.util.function.Supplier;

public class OreBlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Str1llaxsFantasy.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = ItemInit.ITEMS;

    //ORES
    //DONE! #1 TIN
    public static final RegistryObject<Block> TIN_ORE = register("tin_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));
    public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = register("deepslate_tin_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //DONE! #2 TITANIUM
    public static final RegistryObject<Block> TITANIUM_ORE = register("titanium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));
    public static final RegistryObject<Block> DEEPSLATE_TITANIUM_ORE = register("deepslate_titanium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //DONE! #3 VANADIUM
    public static final RegistryObject<Block> VANADIUM_ORE = register("vanadium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));
    public static final RegistryObject<Block> DEEPSLATE_VANADIUM_ORE = register("deepslate_vanadium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //DONE! #4 CHROMIUM
    public static final RegistryObject<Block> CHROMIUM_ORE = register("chromium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_CHROMIUM_ORE = register("deepslate_chromium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //DONE! #5 MANGANESE
    public static final RegistryObject<Block> MANGANESE_ORE = register("manganese_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_MANGANESE_ORE = register("deepslate_manganese_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //DONE! #6 COBALT
    public static final RegistryObject<Block> COBALT_ORE = register("cobalt_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_COBALT_ORE = register("deepslate_cobalt_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //DONE! #7 NICKEL
    public static final RegistryObject<Block> NICKEL_ORE = register("nickel_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_NICKEL_ORE = register("deepslate_nickel_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //#8 ZINC
    public static final RegistryObject<Block> ZINC_ORE = register("zinc_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_ZINC_ORE = register("deepslate_zinc_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //#9 GERMANIUM
    public static final RegistryObject<Block> GERMANIUM_ORE = register("germanium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_GERMANIUM_ORE = register("deepslate_germanium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //#10 YTTRIUM || IDK ADD OR NOT
    public static final RegistryObject<Block> YTTRIUM_ORE = register("yttrium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_YTTRIUM_ORE = register("deepslate_yttrium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //#11 ZIRCONIUM
    public static final RegistryObject<Block> ZIRCONIUM_ORE = register("zirconium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_ZIRCONIUM_ORE = register("deepslate_zirconium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));


    //#12 NIOBIUM || IDK ADD OR NOT
    public static final RegistryObject<Block> NIOBIUM_ORE = register("niobium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_NIOBIUM_ORE = register("deepslate_niobium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //#13 MOLYBDENUM || IDK ADD OR NOT
    public static final RegistryObject<Block> MOLYBDENUM_ORE = register("molybdenum_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_MOLYBDENUM_ORE = register("deepslate_molybdenum_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //#14 TECHNETIUM || IDK ADD OR NOT
    public static final RegistryObject<Block> TECHNETIUM_ORE = register("technetium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_TECHNETIUM_ORE = register("deepslate_technetium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //#15 RUTHENIUM || IDK ADD OR NOT
    public static final RegistryObject<Block> RUTHENIUM_ORE = register("ruthenium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_RUTHENIUM_ORE = register("deepslate_ruthenium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //#16 RHODIUM || IDK ADD OR NOT
    public static final RegistryObject<Block> RHODIUM_ORE = register("rhodium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));


    public static final RegistryObject<Block> DEEPSLATE_RHODIUM_ORE = register("deepslate_rhodium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //DONE! #17 PALLADIUM
    public static final RegistryObject<Block> PALLADIUM_ORE = register("palladium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(),  new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_PALLADIUM_ORE = register("deepslate_palladium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //#18 SILVER
    public static final RegistryObject<Block> SILVER_ORE = register("silver_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = register("deepslate_silver_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //#19 CADMIUM || IDK ADD OR NOT
    public static final RegistryObject<Block> CADMIUM_ORE = register("cadmium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_CADMIUM_ORE = register("deepslate_cadmium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //#20 INDIUM || IDK ADD OR NOT
    public static final RegistryObject<Block> INDIUM_ORE = register("indium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_INDIUM_ORE = register("deepslate_indium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //#21 LANTHANUM || IDK ADD OR NOT
    public static final RegistryObject<Block> LANTHANUM_ORE = register("lanthanum_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_LANTHANUM_ORE = register("deepslate_lanthanum_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //#22 CERIUM || IDK ADD OR NOT
    public static final RegistryObject<Block> CERIUM_ORE = register("cerium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_CERIUM_ORE = register("deepslate_cerium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //#23 PRASEODYMIUM || IDK ADD OR NOT
    public static final RegistryObject<Block> PRASEODYMIUM_ORE = register("praseodymium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_PRASEODYMIUM_ORE = register("deepslate_praseodymium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //#24 NEODYMIUM || IDK ADD OR NOT
    public static final RegistryObject<Block> NEODYMIUM_ORE = register("neodymium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_NEODYMIUM_ORE = register("deepslate_neodymium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //#25 PROMETHIUM || IDK ADD OR NOT
    public static final RegistryObject<Block> PROMETHIUM_ORE = register("promethium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_PROMETHIUM_ORE = register("deepslate_promethium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //#26 SAMARIUM || IDK ADD OR NOT
    public static final RegistryObject<Block> SAMARIUM_ORE = register("samarium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_SAMARIUM_ORE = register("deepslate_samarium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));


    //#27 EUROPIUM || IDK ADD OR NOT
    public static final RegistryObject<Block> EUROPIUM_ORE = register("europium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_EUROPIUM_ORE = register("deepslate_europium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //#28 GADOLINIUM || IDK ADD OR NOT
    public static final RegistryObject<Block> GADOLINIUM_ORE = register("gadolinium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_GADOLINIUM_ORE = register("deepslate_gadolinium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //#29 TERBIUM || IDK ADD OR NOT
    public static final RegistryObject<Block> TERBIUM_ORE = register("terbium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_TERBIUM_ORE = register("deepslate_terbium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //#30 DYSPROSIUM || IDK ADD OR NOT
    public static final RegistryObject<Block> DYSPROSIUM_ORE = register("dysprosium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_DYSPROSIUM_ORE = register("deepslate_dysprosium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //#31 HOLMIUM || IDK ADD OR NOT
    public static final RegistryObject<Block> HOLMIUM_ORE = register("holmium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_HOLMIUM_ORE = register("deepslate_holmium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //#32 ERBIUM || IDK ADD OR NOT
    public static final RegistryObject<Block> ERBIUM_ORE = register("erbium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_ERBIUM_ORE = register("deepslate_erbium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //#33 THULIUM || IDK ADD OR NOT
    public static final RegistryObject<Block> THULIUM_ORE = register("thulium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_THULIUM_ORE = register("deepslate_thulium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //#34 YTTERBIUM || IDK ADD OR NOT
    public static final RegistryObject<Block> YTTERBIUM_ORE = register("ytterbium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_YTTERBIUM_ORE = register("deepslate_ytterbium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //#35 LUTETIUM || IDK ADD OR NOT
    public static final RegistryObject<Block> LUTETIUM_ORE = register("lutetium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_LUTETIUM_ORE = register("deepslate_lutetium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //#36 HAFNIUM || IDK ADD OR NOT
    public static final RegistryObject<Block> HAFNIUM_ORE = register("hafnium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_HAFNIUM_ORE = register("deepslate_hafnium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //#37 TANTALUM || IDK ADD OR NOT
    public static final RegistryObject<Block> TANTALUM_ORE = register("tantalum_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_TANTALUM_ORE = register("deepslate_tantalum_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //DONE! #38 TUNGSTEN
    public static final RegistryObject<Block> TUNGSTEN_ORE = register("tungsten_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSTALE_TUNGSTEN_ORE = register("deepslate_tungsten_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //#39 RHENIUM || IDK ADD OR NOT
    public static final RegistryObject<Block> RHENIUM_ORE = register("rhenium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_RHENIUM_ORE = register("deepslate_rhenium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //#40 OSMIUM
    public static final RegistryObject<Block> OSMIUM_ORE = register("osmium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_OSMIUM_ORE = register("deepslate_osmium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //DONE! #41 IRIDIUM
    public static final RegistryObject<Block> IRIDIUM_ORE = register("iridium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_IRIDIUM_ORE = register("deepslate_iridium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //DONE! #42 PLATINUM
    public static final RegistryObject<Block> PLATINUM_ORE = register("platinum_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_PLATINUM_ORE = register("deepslate_platinum_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //#43 LEAD
    public static final RegistryObject<Block> LEAD_ORE = register("lead_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_LEAD_ORE = register("deepslate_lead_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //DONE! #44 BISMUTH
    public static final RegistryObject<Block> BISMUTH_ORE = register("bismuth_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_BISMUTH_ORE = register("deepslate_bismuth_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    //DONE! #45 URANIUM
    public static final RegistryObject<Block> URANIUM_ORE = register("uranium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    public static final RegistryObject<Block> DEEPSLATE_URANIUM_ORE = register("deepslate_uranium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_ORES)));

    private static <T extends Block> RegistryObject<T> registerOreBlock(final String name, final Supplier<? extends T> block, CreativeModeTab strfantab) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block, Function<RegistryObject<T>, Supplier<? extends Item>> item) {
        RegistryObject<T> obj = registerOreBlock(name, block, TabInit.STRFANTAB_ORES);
        ITEMS.register(name, item.apply(obj));
        return obj;
    }

}
