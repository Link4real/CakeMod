package com.link.mod.cakemod.registry;

import com.link.mod.cakemod.Main;
import com.link.mod.cakemod.registry.cakes.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.link.mod.cakemod.Main.MOD_ID;

public class Cakes {

    public static final Block CHOCOLATE_CAKE = new ChocolateCakeBlock(FabricBlockSettings.of(Material.CAKE).strength(0.5f));
    public static final Block BIRTHDAY_CAKE = new BirthdayCakeBlock(FabricBlockSettings.of(Material.CAKE).strength(0.5f));
    public static final Block WEDDING_CAKE = new WeddingCakeBlock(FabricBlockSettings.of(Material.CAKE).strength(0.5f));
    public static final Block CARROT_BLOCK = new CarrotCakeBlock(FabricBlockSettings.of(Material.CAKE).strength(0.5f));
    public static final Block APPLE_PIE = new ApplePieBlock(FabricBlockSettings.of(Material.CAKE).strength(0.5f));
    public static final Block SPOOKY_CAKE = new SpookyCakeBlock(FabricBlockSettings.of(Material.CAKE).strength(0.5f));
    public static final Block GLOW_BERRY_CAKE = new GlowBerryCakeBlock(FabricBlockSettings.of(Material.CAKE).strength(0.5f).luminance(9));
    public static final Block CHOCOLATE_CARROT_CAKE = new CarrotCakeBlock(FabricBlockSettings.of(Material.CAKE).strength(0.5f));
    public static final Block SWEET_BERRY_CAKE = new SweetBerryCakeBlock(FabricBlockSettings.of(Material.CAKE).strength(0.5f));

    public static void register() {
        //Chocolate Cake
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "chocolate_cake"), CHOCOLATE_CAKE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chocolate_cake"), new BlockItem(CHOCOLATE_CAKE, new FabricItemSettings().group(Main.ITEM_GROUP).maxCount(1)));
        //Birthday Cake
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "birthday_cake"), BIRTHDAY_CAKE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "birthday_cake"), new BlockItem(BIRTHDAY_CAKE, new FabricItemSettings().group(Main.ITEM_GROUP).maxCount(1)));
        //Wedding Cake
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "wedding_cake"),WEDDING_CAKE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "wedding_cake"), new BlockItem(WEDDING_CAKE, new FabricItemSettings().group(Main.ITEM_GROUP).maxCount(1)));
        //Carrot Cake
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "carrot_cake"), CARROT_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "carrot_cake"), new BlockItem(CARROT_BLOCK, new FabricItemSettings().group(Main.ITEM_GROUP).maxCount(1)));
        //Apple Pie
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "apple_pie"), APPLE_PIE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"apple_pie"), new BlockItem(APPLE_PIE, new FabricItemSettings().group(Main.ITEM_GROUP).maxCount(1)));
        //Spooky Cake
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"spooky_cake"), SPOOKY_CAKE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spooky_cake"), new BlockItem(SPOOKY_CAKE, new FabricItemSettings().group(Main.ITEM_GROUP).maxCount(1)));
        //Glow Berry Cake
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "glow_berry_cake"), GLOW_BERRY_CAKE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glow_berry_cake"), new BlockItem(GLOW_BERRY_CAKE, new FabricItemSettings().group(Main.ITEM_GROUP).maxCount(1)));
        //Chocolate Carrot Cake
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "chocolate_carrot_cake"), CHOCOLATE_CARROT_CAKE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chocolate_carrot_cake"), new BlockItem(CHOCOLATE_CARROT_CAKE, new FabricItemSettings().group(Main.ITEM_GROUP).maxCount(1)));
        //Sweet Berry Cake
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "sweet_berry_cake"), SWEET_BERRY_CAKE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sweet_berry_cake"), new BlockItem(SWEET_BERRY_CAKE, new FabricItemSettings().group(Main.ITEM_GROUP).maxCount(1)));
    }
}
