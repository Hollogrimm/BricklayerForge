package net.hollogrimm.bricklayer.block;

import net.hollogrimm.bricklayer.Bricklayer;
import net.hollogrimm.bricklayer.item.ModCreativeModeTab;
import net.hollogrimm.bricklayer.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Bricklayer.MOD_ID);

    public static final RegistryObject<Block> WHITE_BRICKS = registerBlock("white_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> ORANGE_BRICKS = registerBlock("orange_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> MAGENTA_BRICKS = registerBlock("magenta_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LIGHT_BLUE_BRICKS = registerBlock("light_blue_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> YELLOW_BRICKS = registerBlock("yellow_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LIME_BRICKS = registerBlock("lime_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PINK_BRICKS = registerBlock("pink_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> GRAY_BRICKS = registerBlock("gray_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LIGHT_GRAY_BRICKS = registerBlock("light_gray_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> CYAN_BRICKS = registerBlock("cyan_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PURPLE_BRICKS = registerBlock("purple_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> BLUE_BRICKS = registerBlock("blue_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> BROWN_BRICKS = registerBlock("brown_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> GREEN_BRICKS = registerBlock("green_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> RED_BRICKS = registerBlock("red_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> BLACK_BRICKS = registerBlock("black_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
