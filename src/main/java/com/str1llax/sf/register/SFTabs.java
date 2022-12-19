package com.str1llax.sf.register;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import static com.str1llax.sf.SF.MOD_ID;

public class SFTabs {

    public static final CreativeModeTab SFTAB = new CreativeModeTab(MOD_ID + "_tab") {@Override @OnlyIn(Dist.CLIENT) public ItemStack makeIcon() {return new ItemStack(SFBlocks.ADVANCED_BLOCK.get());}};
    public static final CreativeModeTab SFTAB_WEAPONS = new CreativeModeTab(MOD_ID + "_weapons") {@Override @OnlyIn(Dist.CLIENT) public ItemStack makeIcon() {return new ItemStack(SFItems.RUBY_SWORD.get());}};
    public static final CreativeModeTab SFTAB_TOOLS = new CreativeModeTab(MOD_ID + "_tools") {@Override @OnlyIn(Dist.CLIENT) public ItemStack makeIcon() {return new ItemStack(SFItems.RUBY_PICKAXE.get());}};
    public static final CreativeModeTab SFTAB_ARMOR = new CreativeModeTab(MOD_ID + "_armor") {@Override @OnlyIn(Dist.CLIENT) public ItemStack makeIcon() {return new ItemStack(SFItems.RUBY_HELMET.get());}};
    public static final CreativeModeTab SFTAB_FLORA = new CreativeModeTab(MOD_ID + "_flora") {@Override @OnlyIn(Dist.CLIENT) public ItemStack makeIcon() {return new ItemStack(SFBlocks.HEVEA_SAPLING.get());}};
    public static final CreativeModeTab SFTAB_FAUNA = new CreativeModeTab(MOD_ID + "_fauna") {@Override @OnlyIn(Dist.CLIENT) public ItemStack makeIcon() {return new ItemStack(SFBlocks.PINK_ROSE.get());}};
    public static final CreativeModeTab SFTAB_MACHINES = new CreativeModeTab(MOD_ID + "_machines") {@Override @OnlyIn(Dist.CLIENT) public ItemStack makeIcon() {return new ItemStack(SFBlocks.GENERATOR.get().asItem());}};
    public static final CreativeModeTab SFTAB_RESOURCES = new CreativeModeTab(MOD_ID + "_resources") {@Override @OnlyIn(Dist.CLIENT) public ItemStack makeIcon() {return new ItemStack(SFItems.MIGHTY_IRON_INGOT.get());}};
    public static final CreativeModeTab SFTAB_ORES = new CreativeModeTab(MOD_ID + "_ores") {@Override @OnlyIn(Dist.CLIENT) public ItemStack makeIcon() {return new ItemStack(SFOreBlocks.PLATINUM_ORE.get());}};
    public static final CreativeModeTab SFTAB_PARTS = new CreativeModeTab(MOD_ID + "_parts") {@Override @OnlyIn(Dist.CLIENT) public ItemStack makeIcon() {return new ItemStack(SFItems.M_HANDLE.get());}};
}

