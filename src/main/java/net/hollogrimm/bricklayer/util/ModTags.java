package net.hollogrimm.bricklayer.util;

import net.hollogrimm.bricklayer.Bricklayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> PAINTABLE_BRICKS
                = tag("paintable_bricks");

        public static final TagKey<Block> LARGE_PAINTABLE_BRICKS
                = tag("large_paintable_bricks");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Bricklayer.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }

    }

    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Bricklayer.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
