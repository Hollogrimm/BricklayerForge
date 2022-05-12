package net.hollogrimm.bricklayer.block;

import net.hollogrimm.bricklayer.Bricklayer;
import net.hollogrimm.bricklayer.item.ModCreativeModeTab;
import net.hollogrimm.bricklayer.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
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

    // Basic Bricks

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

    // Brick Stairs
    public static final RegistryObject<Block> WHITE_BRICK_STAIRS = registerBlock("white_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.WHITE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> ORANGE_BRICK_STAIRS = registerBlock("orange_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.ORANGE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> MAGENTA_BRICK_STAIRS = registerBlock("magenta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.MAGENTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LIGHT_BLUE_BRICK_STAIRS = registerBlock("light_blue_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_BLUE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> YELLOW_BRICK_STAIRS = registerBlock("yellow_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.YELLOW_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LIME_BRICK_STAIRS = registerBlock("lime_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.LIME_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PINK_BRICK_STAIRS = registerBlock("pink_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.PINK_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> GRAY_BRICK_STAIRS = registerBlock("gray_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.GRAY_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LIGHT_GRAY_BRICK_STAIRS = registerBlock("light_gray_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_GRAY_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> CYAN_BRICK_STAIRS = registerBlock("cyan_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.CYAN_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PURPLE_BRICK_STAIRS = registerBlock("purple_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.PURPLE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> BLUE_BRICK_STAIRS = registerBlock("blue_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.BLUE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> BROWN_BRICK_STAIRS = registerBlock("brown_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.BROWN_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> GREEN_BRICK_STAIRS = registerBlock("green_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.GREEN_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> RED_BRICK_STAIRS = registerBlock("red_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.RED_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> BLACK_BRICK_STAIRS = registerBlock("black_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.BLACK_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

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
