package com.str1llax.strfan.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import static com.str1llax.strfan.Str1llaxsFantasy.MOD_ID;

public class TabInit {

        public static final CreativeModeTab STRFANTAB = new CreativeModeTab(MOD_ID + "_tab") {
            @Override
            @OnlyIn(Dist.CLIENT)
            public ItemStack makeIcon() {
                return new ItemStack(ItemInit.ADVANCED_ITEM.get());
            }
        };

        public static final CreativeModeTab STRFANTAB_FOOD = new CreativeModeTab(MOD_ID + "_food") {
            @Override
            @OnlyIn(Dist.CLIENT)
            public ItemStack makeIcon() {
                return new ItemStack(BlockInit.MEAT_GRINDER.get().asItem());
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

        public static final CreativeModeTab STRFANTAB_WEAPONS = new CreativeModeTab(MOD_ID + "_weapons") {
            @Override
            @OnlyIn(Dist.CLIENT)
            public ItemStack makeIcon() {
                return new ItemStack(ItemInit.MURAMASA.get());
            }
        };
}

