package com.str1llax.strfan.init;

import com.str1llax.strfan.StrFan;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class TagInit {
    public static class Blocks {
        public static final TagKey<Block> ORES = tag("ores");
        public static final TagKey<Block> HEVEA_LOGS = tag("hevea_logs");
        public static final TagKey<Block> MACHINES = tag("machines");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(StrFan.MOD_ID, name));
        }
        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }
    public static class Items {
        public static final TagKey<Item> STONES = tag("stones");
        public static final TagKey<Item> METALS = tag("metals");
        public static final TagKey<Item> CATALYSTS = tag("catalysts");
        public static final TagKey<Item> CHIPS = tag("chips");
        public static final TagKey<Item> CAPACITORS = tag("capacitors");
        public static final TagKey<Item> BASES = tag("bases");
        public static final TagKey<Item> MIXER = forgeTag("mixer");
        public static final TagKey<Item> EXTRACTOR = forgeTag("extractor");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(StrFan.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
