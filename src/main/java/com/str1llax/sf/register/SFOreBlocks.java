package com.str1llax.sf.register;

import com.str1llax.sf.SF;
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

public class SFOreBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SF.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = SFItems.ITEMS;
    //ORES
    //DONE! #1 TIN
    public static final RegistryObject<Block> TIN_ORE = register("tin_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));
    public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = register("deepslate_tin_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));
    //DONE! #2 TITANIUM
    public static final RegistryObject<Block> TITANIUM_ORE = register("titanium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));
    public static final RegistryObject<Block> DEEPSLATE_TITANIUM_ORE = register("deepslate_titanium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));
    //DONE! #3 VANADIUM
    public static final RegistryObject<Block> VANADIUM_ORE = register("vanadium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));
    public static final RegistryObject<Block> DEEPSLATE_VANADIUM_ORE = register("deepslate_vanadium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));
    //DONE! #4 CHROMIUM
    public static final RegistryObject<Block> CHROMIUM_ORE = register("chromium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));
    public static final RegistryObject<Block> DEEPSLATE_CHROMIUM_ORE = register("deepslate_chromium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));
    //DONE! #5 MANGANESE
    public static final RegistryObject<Block> MANGANESE_ORE = register("manganese_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));
    public static final RegistryObject<Block> DEEPSLATE_MANGANESE_ORE = register("deepslate_manganese_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));
    //DONE! #6 COBALT
    public static final RegistryObject<Block> COBALT_ORE = register("cobalt_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));
    public static final RegistryObject<Block> DEEPSLATE_COBALT_ORE = register("deepslate_cobalt_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));
    //DONE! #7 NICKEL
    public static final RegistryObject<Block> NICKEL_ORE = register("nickel_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));
    public static final RegistryObject<Block> DEEPSLATE_NICKEL_ORE = register("deepslate_nickel_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));
    //DONE!8 ZINC
    public static final RegistryObject<Block> ZINC_ORE = register("zinc_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));
    public static final RegistryObject<Block> DEEPSLATE_ZINC_ORE = register("deepslate_zinc_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));
    //DONE!9 GERMANIUM
    public static final RegistryObject<Block> GERMANIUM_ORE = register("germanium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));
    public static final RegistryObject<Block> DEEPSLATE_GERMANIUM_ORE = register("deepslate_germanium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));
    //DONE!10 ZIRCONIUM
    public static final RegistryObject<Block> ZIRCONIUM_ORE = register("zirconium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));
    public static final RegistryObject<Block> DEEPSLATE_ZIRCONIUM_ORE = register("deepslate_zirconium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));
    //DONE! #11 PALLADIUM
    public static final RegistryObject<Block> PALLADIUM_ORE = register("palladium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)), object -> () -> new BlockItem(object.get(),  new Item.Properties().tab(SFTabs.SFTAB_ORES)));
    public static final RegistryObject<Block> DEEPSLATE_PALLADIUM_ORE = register("deepslate_palladium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));
    //DONE!12 SILVER
    public static final RegistryObject<Block> SILVER_ORE = register("silver_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));
    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = register("deepslate_silver_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));
    //DONE!13 CADMIUM
    public static final RegistryObject<Block> CADMIUM_ORE = register("cadmium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));
    public static final RegistryObject<Block> DEEPSLATE_CADMIUM_ORE = register("deepslate_cadmium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));
    //DONE!14 INDIUM
    public static final RegistryObject<Block> INDIUM_ORE = register("indium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));
    public static final RegistryObject<Block> DEEPSLATE_INDIUM_ORE = register("deepslate_indium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));    
    //DONE!15 TERBIUM || ДЛЯ СПЛАВА С ЖЕЛЕЗОМ ДЛЯ ДВИГАТЕЛЕЙ
    public static final RegistryObject<Block> TERBIUM_ORE = register("terbium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));    
    public static final RegistryObject<Block> DEEPSLATE_TERBIUM_ORE = register("deepslate_terbium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));    
    //DONE!16 HAFNIUM || НА БУДУЩЕЕ ДЛЯ РАКЕТ
    public static final RegistryObject<Block> HAFNIUM_ORE = register("hafnium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));    
    public static final RegistryObject<Block> DEEPSLATE_HAFNIUM_ORE = register("deepslate_hafnium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));    
    //DONE! #17 TUNGSTEN
    public static final RegistryObject<Block> TUNGSTEN_ORE = register("tungsten_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));    
    public static final RegistryObject<Block> DEEPSTALE_TUNGSTEN_ORE = register("deepslate_tungsten_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));    
    //DONE!18 RHENIUM || ТОЖЕ ДЛЯ РАКЕТ НАВЕРНОЕ
    public static final RegistryObject<Block> RHENIUM_ORE = register("rhenium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));    
    public static final RegistryObject<Block> DEEPSLATE_RHENIUM_ORE = register("deepslate_rhenium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));   
    //DONE!19 OSMIUM
    public static final RegistryObject<Block> OSMIUM_ORE = register("osmium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));    
    public static final RegistryObject<Block> DEEPSLATE_OSMIUM_ORE = register("deepslate_osmium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));   
    //DONE! #20 IRIDIUM
    public static final RegistryObject<Block> IRIDIUM_ORE = register("iridium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));
    public static final RegistryObject<Block> DEEPSLATE_IRIDIUM_ORE = register("deepslate_iridium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));
    //DONE! #21 PLATINUM
    public static final RegistryObject<Block> PLATINUM_ORE = register("platinum_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));
    public static final RegistryObject<Block> DEEPSLATE_PLATINUM_ORE = register("deepslate_platinum_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));
    //DONE!22 LEAD
    public static final RegistryObject<Block> LEAD_ORE = register("lead_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));
    public static final RegistryObject<Block> DEEPSLATE_LEAD_ORE = register("deepslate_lead_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));
    //DONE! #23 BISMUTH
    public static final RegistryObject<Block> BISMUTH_ORE = register("bismuth_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));
    public static final RegistryObject<Block> DEEPSLATE_BISMUTH_ORE = register("deepslate_bismuth_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));
    //DONE! #24 URANIUM
    public static final RegistryObject<Block> URANIUM_ORE = register("uranium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));
    public static final RegistryObject<Block> DEEPSLATE_URANIUM_ORE = register("deepslate_uranium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SFTabs.SFTAB_ORES)));
    //END OF ORES
    private static <T extends Block> RegistryObject<T> registerOreBlock(final String name, final Supplier<? extends T> block, CreativeModeTab SFTab) {return BLOCKS.register(name, block);}
    private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block, Function<RegistryObject<T>, Supplier<? extends Item>> item) {RegistryObject<T> obj = registerOreBlock(name, block, SFTabs.SFTAB_ORES);ITEMS.register(name, item.apply(obj));return obj;}
}
