package com.link.mod.cakemod;

import com.link.mod.cakemod.registry.cakes.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.lwjgl.system.CallbackI;

public class Main implements ModInitializer {

    public static final Block CHOCOLATE_CAKE = new ChocolateCakeBlock(FabricBlockSettings.of(Material.CAKE).strength(0.5f));
    public static final Block BIRTHDAY_CAKE = new BirthdayCakeBlock(FabricBlockSettings.of(Material.CAKE).strength(0.5f));
    public static final Block WEDDING_CAKE = new WeddingCakeBlock(FabricBlockSettings.of(Material.CAKE).strength(0.5f));
    public static final Block CARROT_BLOCK = new CarrotCakeBlock(FabricBlockSettings.of(Material.CAKE).strength(0.5f));
    public static final Block APPLE_PIE = new ApplePieBlock(FabricBlockSettings.of(Material.CAKE).strength(0.5f));
    public static final Block SPOOKY_CAKE = new SpookyCakeBlock(FabricBlockSettings.of(Material.CAKE).strength(0.5f));

    public static final String MOD_ID = "cakemod";






    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "chocolate_cake"), CHOCOLATE_CAKE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chocolate_cake"), new BlockItem(CHOCOLATE_CAKE, new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "birthday_cake"), BIRTHDAY_CAKE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "birthday_cake"), new BlockItem(BIRTHDAY_CAKE, new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "wedding_cake"),WEDDING_CAKE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "wedding_cake"), new BlockItem(WEDDING_CAKE, new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "carrot_cake"), CARROT_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "carrot_cake"), new BlockItem(CARROT_BLOCK, new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "apple_pie"), APPLE_PIE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"apple_pie"), new BlockItem(APPLE_PIE, new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"spooky_cake"), SPOOKY_CAKE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spooky_cake"), new BlockItem(SPOOKY_CAKE, new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1)));
    }
}
