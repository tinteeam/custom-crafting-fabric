package com.tinteeam.custom_crafting;

import com.tinteeam.custom_crafting.item.blank_diamond;

import net.fabricmc.api.ModInitializer;

public class Customcrafting implements ModInitializer {
	
	


	@Override
	public void onInitialize() {
		blank_diamond.initialize();
	}
	//dummy variable
	 public String MODID = "custom_crafting";
}