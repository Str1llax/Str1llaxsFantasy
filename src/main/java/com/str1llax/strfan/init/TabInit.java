package com.str1llax.strfan.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import static com.str1llax.strfan.StrFan.MOD_ID;

public class TabInit {

    public static final CreativeModeTab STRFANTAB = new CreativeModeTab(MOD_ID + "_tab") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(BlockInit.ADVANCED_BLOCK.get());
        }
    };
    public static final CreativeModeTab STRFANTAB_WEAPONS = new CreativeModeTab(MOD_ID + "_weapons") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.RUBY_SWORD.get());
        }
    };
    public static final CreativeModeTab STRFANTAB_TOOLS = new CreativeModeTab(MOD_ID + "_tools") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.RUBY_PICKAXE.get());
        }
    };
    public static final CreativeModeTab STRFANTAB_ARMOR = new CreativeModeTab(MOD_ID + "_armor") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.RUBY_CHESTPLATE.get());
        }
    };
    public static final CreativeModeTab STRFANTAB_FLORA = new CreativeModeTab(MOD_ID + "_flora") {
    @Override
    @OnlyIn(Dist.CLIENT)
    public ItemStack makeIcon() {
        return new ItemStack(BlockInit.HEVEA_SAPLING.get());
        }
    };
    public static final CreativeModeTab STRFANTAB_FAUNA = new CreativeModeTab(MOD_ID + "_fauna") {
    @Override
    @OnlyIn(Dist.CLIENT)
    public ItemStack makeIcon() {
        return new ItemStack(BlockInit.PINK_ROSE.get());
        }
    };
    public static final CreativeModeTab STRFANTAB_MACHINES = new CreativeModeTab(MOD_ID + "_machines") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(BlockInit.GENERATOR.get().asItem());
        }
    };
    public static final CreativeModeTab STRFANTAB_RESOURCES = new CreativeModeTab(MOD_ID + "_resources") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.MIGHTY_IRON_INGOT.get());
        }
    };
    public static final CreativeModeTab STRFANTAB_ORES = new CreativeModeTab(MOD_ID + "_ores") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(OreBlockInit.PLATINUM_ORE.get());
        }
    };
    public static final CreativeModeTab STRFANTAB_PARTS = new CreativeModeTab(MOD_ID + "_parts") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.M_HANDLE.get());
        }
    };
}

