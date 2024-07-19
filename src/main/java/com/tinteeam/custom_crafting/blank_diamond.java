package com.tinteeam.custom_crafting;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class blank_diamond {
    public static final Item BLANK_DIAMOND = register(new Item(new FabricItemSettings()), "blank_diamond");

    public static Item register(Item instance, String path) {
        return Registry.register(Registry.ITEM, new Identifier("custom_crafting", "blank_diamond"), instance);
    }


    public static void initialize() {
    }


   
}
