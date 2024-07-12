package net.elleclipse.vanillaexpanded;

import net.elleclipse.vanillaexpanded.item.ModItemGroups;
import net.elleclipse.vanillaexpanded.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VanillaExpanded implements ModInitializer {

	public static final String MOD_ID = "vanilla-expanded";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Vanilla Expanded has loaded");

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}