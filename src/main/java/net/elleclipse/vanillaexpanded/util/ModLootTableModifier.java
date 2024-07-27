package net.elleclipse.vanillaexpanded.util;


import net.elleclipse.vanillaexpanded.item.ModItems;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.block.StructureBlock;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootTableEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;


public class ModLootTableModifier {

    private static final RegistryKey<LootTable> ANCIENT_CITY_CHEST_ID = LootTables.ANCIENT_CITY_CHEST;
    private static final RegistryKey<LootTable> ABANDONED_MINESHAFT_MINECART_CHEST_ID = LootTables.ABANDONED_MINESHAFT_CHEST;
    private static final RegistryKey<LootTable> WITHER_SKELETON_ID = EntityType.WITHER_SKELETON.getLootTableId();

    public static void modifyLootTable(){
        LootTableEvents.MODIFY.register((key, tableBuilder, source, resourceManager) -> {
            if(source.isBuiltin() && WITHER_SKELETON_ID.equals(key)){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(ModItems.WITHERED_BONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,2.0f)).build());

                tableBuilder.pool(poolBuilder);
            }

            if(source.isBuiltin() && ABANDONED_MINESHAFT_MINECART_CHEST_ID.equals(key)){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(ModItems.AMETHYST_UPGRADE_SMITHING_TEMPLATE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,2.0f)).build());

                tableBuilder.pool(poolBuilder);
            }

            if(source.isBuiltin() && ANCIENT_CITY_CHEST_ID.equals(key)){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.35f))
                        .with(ItemEntry.builder(ModItems.ECHO_SHARD_UPGRADE_SMITHING_TEMPLATE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,2.0f)).build());

                tableBuilder.pool(poolBuilder);
            }
        });
    }

}
