package net.hollogrimm.bricklayer.item;

import net.hollogrimm.bricklayer.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab BRICKLAYER_MATERIALS = new CreativeModeTab("bricklayer_materials") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BROWN_BRICK.get());
        }
    };

    public static final CreativeModeTab BRICKLAYER_BLOCKS = new CreativeModeTab("bricklayer_blocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.BROWN_BRICKS.get());
        }
    };
}
