package com.link.mod.cakemod;

import com.link.mod.cakemod.registry.cakes.BirthdayCakeBlock;
import com.link.mod.cakemod.registry.cakes.ChocolateCakeBlock;
import com.link.mod.cakemod.registry.cakes.WeddingCakeBlock;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {

    public static final Block CHOCOLATE_CAKE = new ChocolateCakeBlock(FabricBlockSettings.of(Material.CAKE).strength(0.2f));
    public static final Block BIRTHDAY_CAKE = new BirthdayCakeBlock(FabricBlockSettings.of(Material.CAKE).strength(0.2f));
    public static final Block WEDDING_CAKE = new WeddingCakeBlock(FabricBlockSettings.of(Material.CAKE).strength(0.2f));

    public static final String MOD_ID = "cakemod";






    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "chocolate_cake"), CHOCOLATE_CAKE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chocolate_cake"), new BlockItem(CHOCOLATE_CAKE, new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "birthday_cake"), BIRTHDAY_CAKE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "birthday_cake"), new BlockItem(BIRTHDAY_CAKE, new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "wedding_cake"),WEDDING_CAKE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "wedding_cake"), new BlockItem(WEDDING_CAKE, new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1)));
    }
}
