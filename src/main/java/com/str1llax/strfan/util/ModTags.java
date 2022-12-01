package com.str1llax.strfan.util;

import com.str1llax.strfan.Str1llaxsFantasy;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> ORES
                = tag("Ores");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Str1llaxsFantasy.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items {
        public static final TagKey<Item> STONES
                = tag("stones");
        public static final TagKey<Item> METALS
                = tag("metals");
        public static final TagKey<Item> CATALYSTS
                = tag("catalysts");
        public static final TagKey<Item> CHIPS
                = tag("chips");
        public static final TagKey<Item> CAPACITORS
                = tag("capacitors");
        public static final TagKey<Item> BASES
                = tag("bases");
        public static final TagKey<Item> MIXER
                = forgeTag("mixer");
        public static final TagKey<Item> EXTRACTOR
                = forgeTag("extractor");



        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Str1llaxsFantasy.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
