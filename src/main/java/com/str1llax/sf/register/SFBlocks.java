package com.str1llax.sf.register;

import com.str1llax.sf.SF;
import com.str1llax.sf.block.*;
import com.str1llax.sf.world.feature.tree.ChestnutTreeGrower;
import com.str1llax.sf.world.feature.tree.HeveaTreeGrower;
import com.str1llax.sf.world.feature.tree.SakuraTreeGrower;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class SFBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,SF.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = SFItems.ITEMS;
    //  EXAMPLE BLOCKS
    public static final RegistryObject<Block> EXAMPLE_BLOCK = register("example_block",() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)),object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB)));
    //  FLOWERS
    public static final RegistryObject<Block> PINK_ROSE = register("pink_rose",() -> new FlowerBlock(MobEffects.HEAL,8,BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()),object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> POTTED_PINK_ROSE = registerBlockWithoutBlockItem("potted_pink_rose",() -> new FlowerPotBlock(null,SFBlocks.PINK_ROSE,BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    //  WOOD
        // HEVEA
    public static final RegistryObject<Block> HEVEA_LOG = register("hevea_log",() -> new SFFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)),object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> HEVEA_WOOD = register("hevea_wood",() -> new SFFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)),object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> STRIPPED_HEVEA_LOG = register("stripped_hevea_log",() -> new SFFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)),object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> STRIPPED_HEVEA_WOOD = register("stripped_hevea_wood",() -> new SFFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)),object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> HEVEA_PLANKS = register("hevea_planks",() -> new SFFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state,BlockGetter world,BlockPos pos,Direction face) {return true;}
                @Override
                public int getFlammability(BlockState state,BlockGetter world,BlockPos pos,Direction face) {return 20;}
                @Override
                public int getFireSpreadSpeed(BlockState state,BlockGetter world,BlockPos pos,Direction face) {return 5;}},
            object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> HEVEA_STAIRS = register("hevea_stairs",() -> new StairBlock(() -> SFBlocks.HEVEA_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)),object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> HEVEA_SLAB = register("hevea_slab",() -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)),object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> HEVEA_FENCE = register("hevea_fence",() -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD,HEVEA_PLANKS.get().defaultMaterialColor()).strength(2.0F,3.0F).sound(SoundType.WOOD)),object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> HEVEA_FENCE_GATE = register("hevea_fence_gate",() -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)),object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> HEVEA_BUTTON = register("hevea_button",() -> new WoodButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON)),object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> HEVEA_PRESSURE_PLATE = register("hevea_pressure_plate",() -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE)),object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> HEVEA_DOOR = register("hevea_door",() -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)),object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> HEVEA_TRAPDOOR = register("hevea_trapdoor",() -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR)),object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> HEVEA_LEAVES = register("hevea_leaves",() -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).noOcclusion()) {
                @Override
                public boolean isFlammable(BlockState state,BlockGetter world,BlockPos pos,Direction face) {return true;}
                @Override
                public int getFlammability(BlockState state,BlockGetter world,BlockPos pos,Direction face) {return 60;}
                @Override
                public int getFireSpreadSpeed(BlockState state,BlockGetter world,BlockPos pos,Direction face) {return 30;}},object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> HEVEA_SAPLING = register("hevea_sapling",() -> new SaplingBlock(new HeveaTreeGrower(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING).noOcclusion()),object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    // CHESTNUT
    public static final RegistryObject<Block> CHESTNUT_LOG = register("chestnut_log",() -> new SFFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)),object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> CHESTNUT_WOOD = register("chestnut_wood",() -> new SFFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)),object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> STRIPPED_CHESTNUT_LOG = register("stripped_chestnut_log",() -> new SFFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)),object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> STRIPPED_CHESTNUT_WOOD = register("stripped_chestnut_wood",() -> new SFFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)),object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> CHESTNUT_PLANKS = register("chestnut_planks",() -> new SFFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state,BlockGetter world,BlockPos pos,Direction face) {return true;}
                @Override
                public int getFlammability(BlockState state,BlockGetter world,BlockPos pos,Direction face) {return 20;}
                @Override
                public int getFireSpreadSpeed(BlockState state,BlockGetter world,BlockPos pos,Direction face) {return 5;}},object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> CHESTNUT_STAIRS = register("chestnut_stairs",() -> new StairBlock(() -> SFBlocks.CHESTNUT_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)),object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> CHESTNUT_SLAB = register("chestnut_slab",() -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)),object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> CHESTNUT_FENCE = register("chestnut_fence",() -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD,CHESTNUT_PLANKS.get().defaultMaterialColor()).strength(2.0F,3.0F).sound(SoundType.WOOD)),object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> CHESTNUT_FENCE_GATE = register("chestnut_fence_gate",() -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)),object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> CHESTNUT_BUTTON = register("chestnut_button",() -> new WoodButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON)),object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> CHESTNUT_PRESSURE_PLATE = register("chestnut_pressure_plate",() -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE)),object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> CHESTNUT_DOOR = register("chestnut_door",() -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)),object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> CHESTNUT_TRAPDOOR = register("chestnut_trapdoor",() -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR)),object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> CHESTNUT_LEAVES = register("chestnut_leaves",() -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).noOcclusion()) {
                @Override
                public boolean isFlammable(BlockState state,BlockGetter world,BlockPos pos,Direction face) {return true;}
                @Override
                public int getFlammability(BlockState state,BlockGetter world,BlockPos pos,Direction face) {return 60;}
                @Override
                public int getFireSpreadSpeed(BlockState state,BlockGetter world,BlockPos pos,Direction face) {return 30;}},object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> CHESTNUT_SAPLING = register("chestnut_sapling",() -> new SaplingBlock(new ChestnutTreeGrower(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING).noOcclusion()),object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    // SAKURA
    public static final RegistryObject<Block> SAKURA_LOG = register("sakura_log",() -> new SFFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)){
                @Override
                public void appendHoverText(ItemStack pStack,@Nullable BlockGetter pLevel,List<Component> pTooltip,TooltipFlag pFlag) {
                    if(Screen.hasShiftDown()) {pTooltip.add(new TranslatableComponent("tooltip.sf.sakura.tooltip.shift"));}
                    else {pTooltip.add(new TranslatableComponent("tooltip.sf.sakura.tooltip"));}}},
            object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> SAKURA_WOOD = register("sakura_wood",() -> new SFFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)){
                @Override
                public void appendHoverText(ItemStack pStack,@Nullable BlockGetter pLevel,List<Component> pTooltip,TooltipFlag pFlag) {
                    if(Screen.hasShiftDown()) {pTooltip.add(new TranslatableComponent("tooltip.sf.sakura.tooltip.shift"));}
                    else {pTooltip.add(new TranslatableComponent("tooltip.sf.sakura.tooltip"));}}},
            object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> STRIPPED_SAKURA_LOG = register("stripped_sakura_log",
            () -> new SFFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)){
                @Override
                public void appendHoverText(ItemStack pStack,@Nullable BlockGetter pLevel,List<Component> pTooltip,TooltipFlag pFlag) {
                    if(Screen.hasShiftDown()) {pTooltip.add(new TranslatableComponent("tooltip.sf.sakura.tooltip.shift"));}
                    else {pTooltip.add(new TranslatableComponent("tooltip.sf.sakura.tooltip"));}}},
            object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> STRIPPED_SAKURA_WOOD = register("stripped_sakura_wood",
            () -> new SFFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)){
                @Override
                public void appendHoverText(ItemStack pStack,@Nullable BlockGetter pLevel,List<Component> pTooltip,TooltipFlag pFlag) {
                    if(Screen.hasShiftDown()) {pTooltip.add(new TranslatableComponent("tooltip.sf.sakura.tooltip.shift"));}
                    else {pTooltip.add(new TranslatableComponent("tooltip.sf.sakura.tooltip"));}}},
            object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> SAKURA_PLANKS = register("sakura_planks",
            () -> new SFFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state,BlockGetter world,BlockPos pos,Direction face) {return true;}
                @Override
                public int getFlammability(BlockState state,BlockGetter world,BlockPos pos,Direction face) {return 20;}
                @Override
                public int getFireSpreadSpeed(BlockState state,BlockGetter world,BlockPos pos,Direction face) {return 5;}
                @Override
                public void appendHoverText(ItemStack pStack,@Nullable BlockGetter pLevel,List<Component> pTooltip,TooltipFlag pFlag) {
                    if(Screen.hasShiftDown()) {pTooltip.add(new TranslatableComponent("tooltip.sf.sakura.tooltip.shift"));}
                    else {pTooltip.add(new TranslatableComponent("tooltip.sf.sakura.tooltip"));}}},
            object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> SAKURA_STAIRS = register("sakura_stairs",
            () -> new StairBlock(() -> SFBlocks.SAKURA_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)){
                @Override
                public void appendHoverText(ItemStack pStack,@Nullable BlockGetter pLevel,List<Component> pTooltip,TooltipFlag pFlag) {
                    if(Screen.hasShiftDown()) {pTooltip.add(new TranslatableComponent("tooltip.sf.sakura.tooltip.shift"));}
                    else {pTooltip.add(new TranslatableComponent("tooltip.sf.sakura.tooltip"));}}},
            object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> SAKURA_SLAB = register("sakura_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)){
                @Override
                public void appendHoverText(ItemStack pStack,@Nullable BlockGetter pLevel,List<Component> pTooltip,TooltipFlag pFlag) {
                    if(Screen.hasShiftDown()) {pTooltip.add(new TranslatableComponent("tooltip.sf.sakura.tooltip.shift"));}
                    else {pTooltip.add(new TranslatableComponent("tooltip.sf.sakura.tooltip"));}}},
            object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> SAKURA_FENCE = register("sakura_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD,SAKURA_PLANKS.get().defaultMaterialColor()).strength(2.0F,3.0F).sound(SoundType.WOOD)){
                @Override
                public void appendHoverText(ItemStack pStack,@Nullable BlockGetter pLevel,List<Component> pTooltip,TooltipFlag pFlag) {
                    if(Screen.hasShiftDown()) {pTooltip.add(new TranslatableComponent("tooltip.sf.sakura.tooltip.shift"));}
                    else {pTooltip.add(new TranslatableComponent("tooltip.sf.sakura.tooltip"));}}},
            object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> SAKURA_FENCE_GATE = register("sakura_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)){
                @Override
                public void appendHoverText(ItemStack pStack,@Nullable BlockGetter pLevel,List<Component> pTooltip,TooltipFlag pFlag) {
                    if(Screen.hasShiftDown()) {pTooltip.add(new TranslatableComponent("tooltip.sf.sakura.tooltip.shift"));}
                    else {pTooltip.add(new TranslatableComponent("tooltip.sf.sakura.tooltip"));}}},
            object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> SAKURA_BUTTON = register("sakura_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON)){
                @Override
                public void appendHoverText(ItemStack pStack,@Nullable BlockGetter pLevel,List<Component> pTooltip,TooltipFlag pFlag) {
                    if(Screen.hasShiftDown()) {pTooltip.add(new TranslatableComponent("tooltip.sf.sakura.tooltip.shift"));}
                    else {pTooltip.add(new TranslatableComponent("tooltip.sf.sakura.tooltip"));}}},
            object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> SAKURA_PRESSURE_PLATE = register("sakura_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE)){
                @Override
                public void appendHoverText(ItemStack pStack,@Nullable BlockGetter pLevel,List<Component> pTooltip,TooltipFlag pFlag) {
                    if(Screen.hasShiftDown()) {pTooltip.add(new TranslatableComponent("tooltip.sf.sakura.tooltip.shift"));}
                    else {pTooltip.add(new TranslatableComponent("tooltip.sf.sakura.tooltip"));}}},
            object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> SAKURA_DOOR = register("sakura_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)){
                @Override
                public void appendHoverText(ItemStack pStack,@Nullable BlockGetter pLevel,List<Component> pTooltip,TooltipFlag pFlag) {
                    if(Screen.hasShiftDown()) {pTooltip.add(new TranslatableComponent("tooltip.sf.sakura.tooltip.shift"));}
                    else {pTooltip.add(new TranslatableComponent("tooltip.sf.sakura.tooltip"));}}},
            object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> SAKURA_TRAPDOOR = register("sakura_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR)){
                @Override
                public void appendHoverText(ItemStack pStack,@Nullable BlockGetter pLevel,List<Component> pTooltip,TooltipFlag pFlag) {
                    if(Screen.hasShiftDown()) {pTooltip.add(new TranslatableComponent("tooltip.sf.sakura.tooltip.shift"));}
                    else {pTooltip.add(new TranslatableComponent("tooltip.sf.sakura.tooltip"));}}},
            object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> SAKURA_LEAVES = register("sakura_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).noOcclusion()) {
                @Override
                public boolean isFlammable(BlockState state,BlockGetter world,BlockPos pos,Direction face) {return true;}
                @Override
                public int getFlammability(BlockState state,BlockGetter world,BlockPos pos,Direction face) {return 60;}
                @Override
                public int getFireSpreadSpeed(BlockState state,BlockGetter world,BlockPos pos,Direction face) {return 30;}
                @Override
                public void appendHoverText(ItemStack pStack,@Nullable BlockGetter pLevel,List<Component> pTooltip,TooltipFlag pFlag) {
                    if(Screen.hasShiftDown()) {pTooltip.add(new TranslatableComponent("tooltip.sf.sakura.tooltip.shift"));}
                    else {pTooltip.add(new TranslatableComponent("tooltip.sf.sakura.tooltip"));}}},
            object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> SAKURA_SAPLING = register("sakura_sapling",
            () -> new SaplingBlock(new SakuraTreeGrower(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING).noOcclusion()){
                @Override
                public void appendHoverText(ItemStack pStack,@Nullable BlockGetter pLevel,List<Component> pTooltip,TooltipFlag pFlag) {
                    if(Screen.hasShiftDown()) {pTooltip.add(new TranslatableComponent("tooltip.sf.sakura.tooltip.shift"));}
                    else {pTooltip.add(new TranslatableComponent("tooltip.sf.sakura.tooltip"));}}},
            object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    //  GEMS
    public static final RegistryObject<Block> RUBY_BLOCK = register("ruby_block",() -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)),object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    //GEM ORES
    //RUBY
    public static final RegistryObject<Block> RUBY_ORE = register("ruby_ore",() -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)),object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = register("deepslate_ruby_ore",() -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE)),object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_FLORA)));
    //  ADVANCED BLOCKS
    public static final RegistryObject<Block> ADVANCED_BLOCK = register("advanced_block",() -> new AdvancedBlock(BlockBehaviour.Properties.of(Material.METAL,MaterialColor.COLOR_PURPLE).strength(3.0f).sound(SoundType.METAL).requiresCorrectToolForDrops().emissiveRendering((state,getter,pos) -> {return true;}).lightLevel(state -> 0).dynamicShape()),object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB)));
    //CABLES
    public static final RegistryObject<Block> CABLE_IRON = register("cable_iron",() -> new CableIron(BlockBehaviour.Properties.of(Material.WOOL,MaterialColor.COLOR_LIGHT_GRAY)),object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_MACHINES)));
    //MECHANISMS
    public static final RegistryObject<Block> MEAT_GRINDER = register("meat_grinder",() -> new MeatGrinder(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)),object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_MACHINES)));
    //MACHINES
    public static final RegistryObject<Block> CIRCUIT_ASSEMBLER = register("circuit_assembler",() -> new CircuitAssembler(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)),object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_MACHINES)));
    public static final RegistryObject<Block> MIXER = register("mixer",() -> new Mixer(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)),object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_MACHINES)));
    public static final RegistryObject<Block> EXTRACTOR = register("extractor",() -> new Extractor(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)),object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_MACHINES)));
    //ENERGY
    public static final RegistryObject<Block> GENERATOR = register("generator",() -> new Generator(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)),object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SFTabs.SFTAB_MACHINES)));
    private static <T extends Block> RegistryObject<T> registerBlock(final String name,final Supplier<? extends T> block,CreativeModeTab SFTab) {return BLOCKS.register(name,block);}
    private static <T extends Block> RegistryObject<T> register(final String name,final Supplier<? extends T> block,Function<RegistryObject<T>,Supplier<? extends Item>> item) {RegistryObject<T> obj = registerBlock(name,block,SFTabs.SFTAB);ITEMS.register(name,item.apply(obj));return obj;}
    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name,Supplier<T> block) {return BLOCKS.register(name,block);}
}
