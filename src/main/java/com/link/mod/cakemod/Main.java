package com.link.mod.cakemod;

import com.link.mod.cakemod.registry.CakeItems;
import com.link.mod.cakemod.registry.cakes.ChocolateCakeBlock;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {

    public static final Block CHOCOLATE_CAKE = new ChocolateCakeBlock(FabricBlockSettings.of(Material.CAKE).strength(0.2f));


    public static final String MOD_ID = "cakemod";






    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier("cakemod", "chocolate_cake"), CHOCOLATE_CAKE);
        Registry.register(Registry.ITEM, new Identifier("cakemod", "chocolate_cake"), new BlockItem(CHOCOLATE_CAKE, new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1)));
    }
}
