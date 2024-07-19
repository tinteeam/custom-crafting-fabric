package com.tinteeam.custom_crafting;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.registry.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Customcrafting implements ModInitializer {
	
	

	@Override
	public void onInitialize() {
		blank_diamond.initialize();
	}
}