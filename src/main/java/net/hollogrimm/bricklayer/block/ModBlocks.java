package net.hollogrimm.bricklayer.block;

import net.hollogrimm.bricklayer.Bricklayer;
import net.hollogrimm.bricklayer.item.ModCreativeModeTab;
import net.hollogrimm.bricklayer.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
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

    // Dyed Bricks

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

    // Dyed Brick Slabs

    public static final RegistryObject<Block> WHITE_BRICK_SLAB = registerBlock("white_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> ORANGE_BRICK_SLAB = registerBlock("orange_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> MAGENTA_BRICK_SLAB = registerBlock("magenta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LIGHT_BLUE_BRICK_SLAB = registerBlock("light_blue_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> YELLOW_BRICK_SLAB = registerBlock("yellow_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LIME_BRICK_SLAB = registerBlock("lime_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PINK_BRICK_SLAB = registerBlock("pink_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> GRAY_BRICK_SLAB = registerBlock("gray_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LIGHT_GRAY_BRICK_SLAB = registerBlock("light_gray_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> CYAN_BRICK_SLAB = registerBlock("cyan_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PURPLE_BRICK_SLAB = registerBlock("purple_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> BLUE_BRICK_SLAB = registerBlock("blue_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> BROWN_BRICK_SLAB = registerBlock("brown_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> GREEN_BRICK_SLAB = registerBlock("green_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> RED_BRICK_SLAB = registerBlock("red_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> BLACK_BRICK_SLAB = registerBlock("black_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    // Dyed Brick Walls

    public static final RegistryObject<Block> WHITE_BRICK_WALL = registerBlock("white_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> ORANGE_BRICK_WALL = registerBlock("orange_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> MAGENTA_BRICK_WALL = registerBlock("magenta_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LIGHT_BLUE_BRICK_WALL = registerBlock("light_blue_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> YELLOW_BRICK_WALL = registerBlock("yellow_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LIME_BRICK_WALL = registerBlock("lime_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PINK_BRICK_WALL = registerBlock("pink_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> GRAY_BRICK_WALL = registerBlock("gray_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LIGHT_GRAY_BRICK_WALL = registerBlock("light_gray_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> CYAN_BRICK_WALL = registerBlock("cyan_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PURPLE_BRICK_WALL = registerBlock("purple_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> BLUE_BRICK_WALL = registerBlock("blue_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> BROWN_BRICK_WALL = registerBlock("brown_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> GREEN_BRICK_WALL = registerBlock("green_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> RED_BRICK_WALL = registerBlock("red_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> BLACK_BRICK_WALL = registerBlock("black_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    // Large Bricks

    public static final RegistryObject<Block> LARGE_BRICKS = registerBlock("large_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_WHITE_BRICKS = registerBlock("large_white_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_ORANGE_BRICKS = registerBlock("large_orange_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_MAGENTA_BRICKS = registerBlock("large_magenta_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_LIGHT_BLUE_BRICKS = registerBlock("large_light_blue_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_YELLOW_BRICKS = registerBlock("large_yellow_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_LIME_BRICKS = registerBlock("large_lime_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PINK_BRICKS = registerBlock("large_pink_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_GRAY_BRICKS = registerBlock("large_gray_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_LIGHT_GRAY_BRICKS = registerBlock("large_light_gray_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_CYAN_BRICKS = registerBlock("large_cyan_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PURPLE_BRICKS = registerBlock("large_purple_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_BLUE_BRICKS = registerBlock("large_blue_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_BROWN_BRICKS = registerBlock("large_brown_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_GREEN_BRICKS = registerBlock("large_green_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_RED_BRICKS = registerBlock("large_red_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_BLACK_BRICKS = registerBlock("large_black_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    // Large Brick Stairs

    public static final RegistryObject<Block> LARGE_BRICK_STAIRS = registerBlock("large_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.WHITE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_WHITE_BRICK_STAIRS = registerBlock("large_white_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.WHITE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_ORANGE_BRICK_STAIRS = registerBlock("large_orange_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.ORANGE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_MAGENTA_BRICK_STAIRS = registerBlock("large_magenta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.MAGENTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_LIGHT_BLUE_BRICK_STAIRS = registerBlock("large_light_blue_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_BLUE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_YELLOW_BRICK_STAIRS = registerBlock("large_yellow_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.YELLOW_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_LIME_BRICK_STAIRS = registerBlock("large_lime_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.LIME_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PINK_BRICK_STAIRS = registerBlock("large_pink_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.PINK_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_GRAY_BRICK_STAIRS = registerBlock("large_gray_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.GRAY_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_LIGHT_GRAY_BRICK_STAIRS = registerBlock("large_light_gray_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_GRAY_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_CYAN_BRICK_STAIRS = registerBlock("large_cyan_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.CYAN_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PURPLE_BRICK_STAIRS = registerBlock("large_purple_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.PURPLE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_BLUE_BRICK_STAIRS = registerBlock("large_blue_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.BLUE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_BROWN_BRICK_STAIRS = registerBlock("large_brown_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.BROWN_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_GREEN_BRICK_STAIRS = registerBlock("large_green_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.GREEN_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_RED_BRICK_STAIRS = registerBlock("large_red_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.RED_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_BLACK_BRICK_STAIRS = registerBlock("large_black_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.BLACK_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    // Large Dyed Brick Slabs

    public static final RegistryObject<Block> LARGE_BRICK_SLAB = registerBlock("large_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_WHITE_BRICK_SLAB = registerBlock("large_white_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_ORANGE_BRICK_SLAB = registerBlock("large_orange_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_MAGENTA_BRICK_SLAB = registerBlock("large_magenta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_LIGHT_BLUE_BRICK_SLAB = registerBlock("large_light_blue_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_YELLOW_BRICK_SLAB = registerBlock("large_yellow_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_LIME_BRICK_SLAB = registerBlock("large_lime_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PINK_BRICK_SLAB = registerBlock("large_pink_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_GRAY_BRICK_SLAB = registerBlock("large_gray_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_LIGHT_GRAY_BRICK_SLAB = registerBlock("large_light_gray_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_CYAN_BRICK_SLAB = registerBlock("large_cyan_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PURPLE_BRICK_SLAB = registerBlock("large_purple_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_BLUE_BRICK_SLAB = registerBlock("large_blue_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_BROWN_BRICK_SLAB = registerBlock("large_brown_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_GREEN_BRICK_SLAB = registerBlock("large_green_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_RED_BRICK_SLAB = registerBlock("large_red_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_BLACK_BRICK_SLAB = registerBlock("large_black_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    // Large Dyed Brick Walls

    public static final RegistryObject<Block> LARGE_BRICK_WALL = registerBlock("large_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_WHITE_BRICK_WALL = registerBlock("large_white_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_ORANGE_BRICK_WALL = registerBlock("large_orange_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_MAGENTA_BRICK_WALL = registerBlock("large_magenta_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_LIGHT_BLUE_BRICK_WALL = registerBlock("large_light_blue_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_YELLOW_BRICK_WALL = registerBlock("large_yellow_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_LIME_BRICK_WALL = registerBlock("large_lime_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PINK_BRICK_WALL = registerBlock("large_pink_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_GRAY_BRICK_WALL = registerBlock("large_gray_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_LIGHT_GRAY_BRICK_WALL = registerBlock("large_light_gray_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_CYAN_BRICK_WALL = registerBlock("large_cyan_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PURPLE_BRICK_WALL = registerBlock("large_purple_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_BLUE_BRICK_WALL = registerBlock("large_blue_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_BROWN_BRICK_WALL = registerBlock("large_brown_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_GREEN_BRICK_WALL = registerBlock("large_green_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_RED_BRICK_WALL = registerBlock("large_red_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_BLACK_BRICK_WALL = registerBlock("large_black_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    // Painted / Carved Brick Blocks

    public static final RegistryObject<Block> CARVED_BRICKS = registerBlock("carved_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_WHITE_BRICKS = registerBlock("painted_white_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_ORANGE_BRICKS = registerBlock("painted_orange_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_MAGENTA_BRICKS = registerBlock("painted_magenta_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_LIGHT_BLUE_BRICKS = registerBlock("painted_light_blue_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_YELLOW_BRICKS = registerBlock("painted_yellow_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_LIME_BRICKS = registerBlock("painted_lime_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_PINK_BRICKS = registerBlock("painted_pink_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_GRAY_BRICKS = registerBlock("painted_gray_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_LIGHT_GRAY_BRICKS = registerBlock("painted_light_gray_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_CYAN_BRICKS = registerBlock("painted_cyan_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_PURPLE_BRICKS = registerBlock("painted_purple_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_BLUE_BRICKS = registerBlock("painted_blue_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_BROWN_BRICKS = registerBlock("painted_brown_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_GREEN_BRICKS = registerBlock("painted_green_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_RED_BRICKS = registerBlock("painted_red_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_BLACK_BRICKS = registerBlock("painted_black_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    // Painted / Carved Brick Block Stairs

    public static final RegistryObject<Block> CARVED_BRICK_STAIRS = registerBlock("carved_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.WHITE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_WHITE_BRICK_STAIRS = registerBlock("painted_white_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.WHITE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_ORANGE_BRICK_STAIRS = registerBlock("painted_orange_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.ORANGE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_MAGENTA_BRICK_STAIRS = registerBlock("painted_magenta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.MAGENTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_LIGHT_BLUE_BRICK_STAIRS = registerBlock("painted_light_blue_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_BLUE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_YELLOW_BRICK_STAIRS = registerBlock("painted_yellow_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.YELLOW_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_LIME_BRICK_STAIRS = registerBlock("painted_lime_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.LIME_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_PINK_BRICK_STAIRS = registerBlock("painted_pink_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.PINK_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_GRAY_BRICK_STAIRS = registerBlock("painted_gray_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.GRAY_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_LIGHT_GRAY_BRICK_STAIRS = registerBlock("painted_light_gray_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_GRAY_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_CYAN_BRICK_STAIRS = registerBlock("painted_cyan_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.CYAN_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_PURPLE_BRICK_STAIRS = registerBlock("painted_purple_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.PURPLE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_BLUE_BRICK_STAIRS = registerBlock("painted_blue_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.BLUE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_BROWN_BRICK_STAIRS = registerBlock("painted_brown_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.BROWN_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_GREEN_BRICK_STAIRS = registerBlock("painted_green_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.GREEN_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_RED_BRICK_STAIRS = registerBlock("painted_red_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.RED_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_BLACK_BRICK_STAIRS = registerBlock("painted_black_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.BLACK_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    // Painted / Carved Brick Slabs

    public static final RegistryObject<Block> CARVED_BRICK_SLAB = registerBlock("carved_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_WHITE_BRICK_SLAB = registerBlock("painted_white_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_ORANGE_BRICK_SLAB = registerBlock("painted_orange_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_MAGENTA_BRICK_SLAB = registerBlock("painted_magenta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_LIGHT_BLUE_BRICK_SLAB = registerBlock("painted_light_blue_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_YELLOW_BRICK_SLAB = registerBlock("painted_yellow_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_LIME_BRICK_SLAB = registerBlock("painted_lime_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_PINK_BRICK_SLAB = registerBlock("painted_pink_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_GRAY_BRICK_SLAB = registerBlock("painted_gray_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_LIGHT_GRAY_BRICK_SLAB = registerBlock("painted_light_gray_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_CYAN_BRICK_SLAB = registerBlock("painted_cyan_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_PURPLE_BRICK_SLAB = registerBlock("painted_purple_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_BLUE_BRICK_SLAB = registerBlock("painted_blue_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_BROWN_BRICK_SLAB = registerBlock("painted_brown_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_GREEN_BRICK_SLAB = registerBlock("painted_green_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_RED_BRICK_SLAB = registerBlock("painted_red_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_BLACK_BRICK_SLAB = registerBlock("painted_black_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    // Painted / Carved Brick Walls

    public static final RegistryObject<Block> CARVED_BRICK_WALL = registerBlock("carved_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_WHITE_BRICK_WALL = registerBlock("painted_white_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_ORANGE_BRICK_WALL = registerBlock("painted_orange_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_MAGENTA_BRICK_WALL = registerBlock("painted_magenta_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_LIGHT_BLUE_BRICK_WALL = registerBlock("painted_light_blue_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_YELLOW_BRICK_WALL = registerBlock("painted_yellow_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_LIME_BRICK_WALL = registerBlock("painted_lime_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_PINK_BRICK_WALL = registerBlock("painted_pink_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_GRAY_BRICK_WALL = registerBlock("painted_gray_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_LIGHT_GRAY_BRICK_WALL = registerBlock("painted_light_gray_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_CYAN_BRICK_WALL = registerBlock("painted_cyan_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_PURPLE_BRICK_WALL = registerBlock("painted_purple_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_BLUE_BRICK_WALL = registerBlock("painted_blue_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_BROWN_BRICK_WALL = registerBlock("painted_brown_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_GREEN_BRICK_WALL = registerBlock("painted_green_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_RED_BRICK_WALL = registerBlock("painted_red_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> PAINTED_BLACK_BRICK_WALL = registerBlock("painted_black_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    // Large painted / carved brick blocks

    public static final RegistryObject<Block> LARGE_CARVED_BRICKS = registerBlock("large_carved_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_WHITE_BRICKS = registerBlock("large_painted_white_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_ORANGE_BRICKS = registerBlock("large_painted_orange_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_MAGENTA_BRICKS = registerBlock("large_painted_magenta_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_LIGHT_BLUE_BRICKS = registerBlock("large_painted_light_blue_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_YELLOW_BRICKS = registerBlock("large_painted_yellow_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_LIME_BRICKS = registerBlock("large_painted_lime_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_PINK_BRICKS = registerBlock("large_painted_pink_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_GRAY_BRICKS = registerBlock("large_painted_gray_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_LIGHT_GRAY_BRICKS = registerBlock("large_painted_light_gray_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_CYAN_BRICKS = registerBlock("large_painted_cyan_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_PURPLE_BRICKS = registerBlock("large_painted_purple_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_BLUE_BRICKS = registerBlock("large_painted_blue_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_BROWN_BRICKS = registerBlock("large_painted_brown_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_GREEN_BRICKS = registerBlock("large_painted_green_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_RED_BRICKS = registerBlock("large_painted_red_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_BLACK_BRICKS = registerBlock("large_painted_black_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.BRICKLAYER_BLOCKS);

    // Large Painted / Carved StairsLARGE_

    public static final RegistryObject<Block> LARGE_CARVED_BRICK_STAIRS = registerBlock("large_carved_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.WHITE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_WHITE_BRICK_STAIRS = registerBlock("large_painted_white_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.WHITE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_ORANGE_BRICK_STAIRS = registerBlock("large_painted_orange_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.ORANGE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_MAGENTA_BRICK_STAIRS = registerBlock("large_painted_magenta_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.MAGENTA_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_LIGHT_BLUE_BRICK_STAIRS = registerBlock("large_painted_light_blue_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_BLUE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_YELLOW_BRICK_STAIRS = registerBlock("large_painted_yellow_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.YELLOW_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_LIME_BRICK_STAIRS = registerBlock("large_painted_lime_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.LIME_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_PINK_BRICK_STAIRS = registerBlock("large_painted_pink_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.PINK_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_GRAY_BRICK_STAIRS = registerBlock("large_painted_gray_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.GRAY_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_LIGHT_GRAY_BRICK_STAIRS = registerBlock("large_painted_light_gray_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_GRAY_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_CYAN_BRICK_STAIRS = registerBlock("large_painted_cyan_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.CYAN_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_PURPLE_BRICK_STAIRS = registerBlock("large_painted_purple_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.PURPLE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_BLUE_BRICK_STAIRS = registerBlock("large_painted_blue_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.BLUE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_BROWN_BRICK_STAIRS = registerBlock("large_painted_brown_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.BROWN_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_GREEN_BRICK_STAIRS = registerBlock("large_painted_green_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.GREEN_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_RED_BRICK_STAIRS = registerBlock("large_painted_red_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.RED_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_BLACK_BRICK_STAIRS = registerBlock("large_painted_black_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.BLACK_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f, 6f)
                            .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    // Painted / Carved Brick Slabs

    public static final RegistryObject<Block> LARGE_CARVED_BRICK_SLAB = registerBlock("large_carved_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_WHITE_BRICK_SLAB = registerBlock("large_painted_white_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_ORANGE_BRICK_SLAB = registerBlock("large_painted_orange_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_MAGENTA_BRICK_SLAB = registerBlock("large_painted_magenta_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_LIGHT_BLUE_BRICK_SLAB = registerBlock("large_painted_light_blue_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_YELLOW_BRICK_SLAB = registerBlock("large_painted_yellow_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_LIME_BRICK_SLAB = registerBlock("large_painted_lime_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_PINK_BRICK_SLAB = registerBlock("large_painted_pink_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_GRAY_BRICK_SLAB = registerBlock("large_painted_gray_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_LIGHT_GRAY_BRICK_SLAB = registerBlock("large_painted_light_gray_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_CYAN_BRICK_SLAB = registerBlock("large_painted_cyan_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_PURPLE_BRICK_SLAB = registerBlock("large_painted_purple_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_BLUE_BRICK_SLAB = registerBlock("large_painted_blue_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_BROWN_BRICK_SLAB = registerBlock("large_painted_brown_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_GREEN_BRICK_SLAB = registerBlock("large_painted_green_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_RED_BRICK_SLAB = registerBlock("large_painted_red_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_BLACK_BRICK_SLAB = registerBlock("large_painted_black_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    // Painted / Carved Brick Walls

    public static final RegistryObject<Block> LARGE_CARVED_BRICK_WALL = registerBlock("large_carved_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_WHITE_BRICK_WALL = registerBlock("large_painted_white_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_ORANGE_BRICK_WALL = registerBlock("large_painted_orange_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_MAGENTA_BRICK_WALL = registerBlock("large_painted_magenta_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_LIGHT_BLUE_BRICK_WALL = registerBlock("large_painted_light_blue_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_YELLOW_BRICK_WALL = registerBlock("large_painted_yellow_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_LIME_BRICK_WALL = registerBlock("large_painted_lime_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_PINK_BRICK_WALL = registerBlock("large_painted_pink_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_GRAY_BRICK_WALL = registerBlock("large_painted_gray_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_LIGHT_GRAY_BRICK_WALL = registerBlock("large_painted_light_gray_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_CYAN_BRICK_WALL = registerBlock("large_painted_cyan_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_PURPLE_BRICK_WALL = registerBlock("large_painted_purple_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_BLUE_BRICK_WALL = registerBlock("large_painted_blue_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_BROWN_BRICK_WALL = registerBlock("large_painted_brown_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_GREEN_BRICK_WALL = registerBlock("large_painted_green_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_RED_BRICK_WALL = registerBlock("large_painted_red_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f, 6f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.BRICKLAYER_BLOCKS);

    public static final RegistryObject<Block> LARGE_PAINTED_BLACK_BRICK_WALL = registerBlock("large_painted_black_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
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
