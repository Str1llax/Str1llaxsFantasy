package com.str1llax.strfan.init;

import com.str1llax.strfan.StrFan;
import com.str1llax.strfan.block.*;
import com.str1llax.strfan.block.custom.ModFlammableRotatedPillarBlock;
import com.str1llax.strfan.world.feature.tree.RubberTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;
import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, StrFan.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = ItemInit.ITEMS;

    //  EXAMPLE BLOCKS
    public static final RegistryObject<Block> EXAMPLE_BLOCK = register("example_block",
            () -> new Block(BlockBehaviour.Properties
                    .of(Material.METAL, MaterialColor.COLOR_PURPLE)
                    .strength(3.0f)
                    .sound(SoundType.METAL)
                    .requiresCorrectToolForDrops()
                    .emissiveRendering((state, getter, pos) ->
                    {
                        return true;
                    })
                    .lightLevel(state -> 4)  ),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB)));
            
    //  FLOWERS
    public static final RegistryObject<Block> PINK_ROSE = register("pink_rose",
            () -> new FlowerBlock(MobEffects.HEAL,8,BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB)));
    public static final RegistryObject<Block> POTTED_PINK_ROSE = registerBlockWithoutBlockItem("potted_pink_rose",
            () -> new FlowerPotBlock(null, BlockInit.PINK_ROSE, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));

    //  WOOD
    public static final RegistryObject<Block> HEVEA_LOG = register("hevea_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB)));

    public static final RegistryObject<Block> HEVEA_WOOD = register("hevea_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB)));

    public static final RegistryObject<Block> STRIPPED_HEVEA_LOG = register("stripped_hevea_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB)));

    public static final RegistryObject<Block> STRIPPED_HEVEA_WOOD = register("stripped_hevea_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB)));

    public static final RegistryObject<Block> HEVEA_PLANKS = register("hevea_planks",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            },
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB)));

    public static final RegistryObject<Block> HEVEA_STAIRS = register("hevea_stairs",
            () -> new StairBlock(() -> BlockInit.HEVEA_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB)));

    public static final RegistryObject<Block> HEVEA_SLAB = register("hevea_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB)));

    public static final RegistryObject<Block> HEVEA_FENCE = register("hevea_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, HEVEA_PLANKS.get().defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB)));

    public static final RegistryObject<Block> HEVEA_FENCE_GATE = register("hevea_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB)));

    public static final RegistryObject<Block> HEVEA_LEAVES = register("hevea_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).noOcclusion()) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;}}, object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB)));

    public static final RegistryObject<Block> HEVEA_SAPLING = register("hevea_sapling",
            () -> new SaplingBlock(new RubberTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING).noOcclusion()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB)));

    //  ADVANCED BLOCKS
    public static final RegistryObject<Block> ADVANCED_BLOCK = register("advanced_block",
            () -> new AdvancedBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE)
                    .strength(3.0f)
                    .sound(SoundType.METAL)
                    .requiresCorrectToolForDrops()
                    .emissiveRendering((state, getter, pos) -> {return true;})
                    .lightLevel(state -> 0).dynamicShape()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB)));
    //CABLES
    public static final RegistryObject<Block> CABLE_IRON = register("cable_iron",
            () -> new CableIron(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_LIGHT_GRAY)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB)));

    //MECHANISMS
    public static final RegistryObject<Block> MEAT_GRINDER = register("meat_grinder",
            () -> new MeatGrinder(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_FOOD)));

    //MACHINES
    public static final RegistryObject<Block> CIRCUIT_ASSEMBLER = register("circuit_assembler",
            () -> new CircuitAssembler(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_MACHINES)));

    public static final RegistryObject<Block> MIXER = register("mixer",
            () -> new Mixer(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_MACHINES)));

    public static final RegistryObject<Block> EXTRACTOR = register("extractor",
            () -> new Extractor(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_MACHINES)));

    //ENERGY GENERATION
    public static final RegistryObject<Block> GENERATOR = register("generator",
            () -> new Generator(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(TabInit.STRFANTAB_MACHINES)));


    private static <T extends Block> RegistryObject<T> registerBlock(final String name, final Supplier<? extends T> block, CreativeModeTab strfanTab) {
        return BLOCKS.register(name, block);
    }
    private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block, Function<RegistryObject<T>, Supplier<? extends Item>> item) {
        RegistryObject<T> obj = registerBlock(name, block, TabInit.STRFANTAB);
        ITEMS.register(name, item.apply(obj));
        return obj;
    }
    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }
}
