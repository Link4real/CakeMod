package com.link.mod.cakemod;

import com.link.mod.cakemod.registry.Cakes;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Main implements ModInitializer {

    public static final String MOD_ID = "cakemod";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "main"))
            .icon(() -> new ItemStack(Cakes.CHOCOLATE_CAKE))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(Cakes.CHOCOLATE_CAKE));
                stacks.add(new ItemStack(Cakes.BIRTHDAY_CAKE));
                stacks.add(new ItemStack(Cakes.WEDDING_CAKE));
                stacks.add(new ItemStack(Cakes.CARROT_BLOCK));
                stacks.add(new ItemStack(Cakes.CHOCOLATE_CARROT_CAKE));
                stacks.add(new ItemStack(Cakes.SPOOKY_CAKE));
                stacks.add(new ItemStack(Cakes.APPLE_PIE));
                stacks.add(new ItemStack(Cakes.GLOW_BERRY_CAKE));
                stacks.add(new ItemStack(Cakes.SWEET_BERRY_CAKE));
            })
            .build();
    // ...

    @Override
    public void onInitialize() {
        Cakes.register();
    }
}
