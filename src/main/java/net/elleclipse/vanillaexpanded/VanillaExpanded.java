package net.elleclipse.vanillaexpanded;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import net.elleclipse.vanillaexpanded.item.ModItemGroups;
import net.elleclipse.vanillaexpanded.item.ModItems;
import net.elleclipse.vanillaexpanded.util.ModLootTableModifier;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.minecraft.util.InvalidIdentifierException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.BiConsumer;

public class VanillaExpanded implements ModInitializer {

	public static final String MOD_ID = "vanilla-expanded";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final Identifier TEST_CHEST = Identifier.of("vanilla-expanded", "chests/amethyst_geode_loot_1");

	@Override
	public void onInitialize() {
		LOGGER.info("Vanilla Expanded has loaded");

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();

		ModLootTableModifier.modifyLootTable();
	}

}