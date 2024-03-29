package net.hollogrimm.bricklayer.item;

import net.hollogrimm.bricklayer.Bricklayer;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Bricklayer.MOD_ID);

    // Dyed Bricks

    public static final RegistryObject<Item> WHITE_BRICK = ITEMS.register("white_brick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BRICKLAYER_MATERIALS)));

    public static final RegistryObject<Item> ORANGE_BRICK = ITEMS.register("orange_brick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BRICKLAYER_MATERIALS)));

    public static final RegistryObject<Item> MAGENTA_BRICK = ITEMS.register("magenta_brick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BRICKLAYER_MATERIALS)));

    public static final RegistryObject<Item> LIGHT_BLUE_BRICK = ITEMS.register("light_blue_brick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BRICKLAYER_MATERIALS)));

    public static final RegistryObject<Item> YELLOW_BRICK = ITEMS.register("yellow_brick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BRICKLAYER_MATERIALS)));

    public static final RegistryObject<Item> LIME_BRICK = ITEMS.register("lime_brick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BRICKLAYER_MATERIALS)));

    public static final RegistryObject<Item> PINK_BRICK = ITEMS.register("pink_brick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BRICKLAYER_MATERIALS)));

    public static final RegistryObject<Item> GRAY_BRICK = ITEMS.register("gray_brick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BRICKLAYER_MATERIALS)));

    public static final RegistryObject<Item> LIGHT_GRAY_BRICK = ITEMS.register("light_gray_brick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BRICKLAYER_MATERIALS)));

    public static final RegistryObject<Item> CYAN_BRICK = ITEMS.register("cyan_brick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BRICKLAYER_MATERIALS)));

    public static final RegistryObject<Item> PURPLE_BRICK = ITEMS.register("purple_brick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BRICKLAYER_MATERIALS)));

    public static final RegistryObject<Item> BLUE_BRICK = ITEMS.register("blue_brick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BRICKLAYER_MATERIALS)));

    public static final RegistryObject<Item> BROWN_BRICK = ITEMS.register("brown_brick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BRICKLAYER_MATERIALS)));

    public static final RegistryObject<Item> GREEN_BRICK = ITEMS.register("green_brick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BRICKLAYER_MATERIALS)));

    public static final RegistryObject<Item> RED_BRICK = ITEMS.register("red_brick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BRICKLAYER_MATERIALS)));

    public static final RegistryObject<Item> BLACK_BRICK = ITEMS.register("black_brick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BRICKLAYER_MATERIALS)));

    // Large Bricks

    public static final RegistryObject<Item> LARGE_BRICK = ITEMS.register("large_brick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BRICKLAYER_MATERIALS)));

    public static final RegistryObject<Item> LARGE_WHITE_BRICK = ITEMS.register("large_white_brick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BRICKLAYER_MATERIALS)));

    public static final RegistryObject<Item> LARGE_ORANGE_BRICK = ITEMS.register("large_orange_brick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BRICKLAYER_MATERIALS)));

    public static final RegistryObject<Item> LARGE_MAGENTA_BRICK = ITEMS.register("large_magenta_brick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BRICKLAYER_MATERIALS)));

    public static final RegistryObject<Item> LARGE_LIGHT_BLUE_BRICK = ITEMS.register("large_light_blue_brick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BRICKLAYER_MATERIALS)));

    public static final RegistryObject<Item> LARGE_YELLOW_BRICK = ITEMS.register("large_yellow_brick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BRICKLAYER_MATERIALS)));

    public static final RegistryObject<Item> LARGE_LIME_BRICK = ITEMS.register("large_lime_brick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BRICKLAYER_MATERIALS)));

    public static final RegistryObject<Item> LARGE_PINK_BRICK = ITEMS.register("large_pink_brick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BRICKLAYER_MATERIALS)));

    public static final RegistryObject<Item> LARGE_GRAY_BRICK = ITEMS.register("large_gray_brick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BRICKLAYER_MATERIALS)));

    public static final RegistryObject<Item> LARGE_LIGHT_GRAY_BRICK = ITEMS.register("large_light_gray_brick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BRICKLAYER_MATERIALS)));

    public static final RegistryObject<Item> LARGE_CYAN_BRICK = ITEMS.register("large_cyan_brick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BRICKLAYER_MATERIALS)));

    public static final RegistryObject<Item> LARGE_PURPLE_BRICK = ITEMS.register("large_purple_brick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BRICKLAYER_MATERIALS)));

    public static final RegistryObject<Item> LARGE_BLUE_BRICK = ITEMS.register("large_blue_brick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BRICKLAYER_MATERIALS)));

    public static final RegistryObject<Item> LARGE_BROWN_BRICK = ITEMS.register("large_brown_brick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BRICKLAYER_MATERIALS)));

    public static final RegistryObject<Item> LARGE_GREEN_BRICK = ITEMS.register("large_green_brick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BRICKLAYER_MATERIALS)));

    public static final RegistryObject<Item> LARGE_RED_BRICK = ITEMS.register("large_red_brick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BRICKLAYER_MATERIALS)));

    public static final RegistryObject<Item> LARGE_BLACK_BRICK = ITEMS.register("large_black_brick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BRICKLAYER_MATERIALS)));

    // Misc. Stuff

    public static final RegistryObject<Item> CLAY_CLUMP = ITEMS.register("clay_clump",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BRICKLAYER_MATERIALS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
