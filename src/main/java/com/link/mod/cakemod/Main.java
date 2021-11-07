package com.link.mod.cakemod;

import com.link.mod.cakemod.registry.RegisterCakes;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Main implements ModInitializer {

    public static final String MOD_ID = "cakemod";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "main"))
            .icon(() -> new ItemStack(RegisterCakes.CHOCOLATE_CAKE))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(RegisterCakes.CHOCOLATE_CAKE));
                stacks.add(new ItemStack(RegisterCakes.BIRTHDAY_CAKE));
                stacks.add(new ItemStack(RegisterCakes.WEDDING_CAKE));
                stacks.add(new ItemStack(RegisterCakes.CARROT_BLOCK));
                stacks.add(new ItemStack(RegisterCakes.SPOOKY_CAKE));
                stacks.add(new ItemStack(RegisterCakes.APPLE_PIE));
                stacks.add(new ItemStack(RegisterCakes.GLOW_BERRY_CAKE));
            })
            .build();
    // ...

    @Override
    public void onInitialize() {
        RegisterCakes.register();
    }
}
