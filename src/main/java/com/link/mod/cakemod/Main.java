package com.link.mod.cakemod;

import com.link.mod.cakemod.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {




    public static final String MOD_ID = "modid";







    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
