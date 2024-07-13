package net.elleclipse.vanillaexpanded.item;

import net.elleclipse.vanillaexpanded.VanillaExpanded;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup AMETHYST_COMBAT_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(VanillaExpanded.MOD_ID, "amethyst_helmet"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.amethyst_combat"))
            .icon(() -> new ItemStack(ModItems.AMETHYST_DUST)).entries((displayContext, entries) -> {
                entries.add(ModItems.AMETHYST_HELMET);
                entries.add(ModItems.AMETHYST_CHESTPLATE);
                entries.add(ModItems.AMETHYST_LEGGINGS);
                entries.add(ModItems.AMETHYST_BOOTS);
                entries.add(ModItems.AMETHYST_DUST);
                entries.add(ModItems.OBSIDIAN_DUST);
                entries.add(ModItems.REINFORCED_AMETHYST_DUST);
                entries.add(ModItems.REINFORCED_AMETHYST_SHARD);
                entries.add(ModItems.AMETHYST_PICKAXE);
                entries.add(ModItems.AMETHYST_AXE);
                entries.add(ModItems.AMETHYST_SWORD);
                entries.add(ModItems.AMETHYST_HOE);
                entries.add(ModItems.AMETHYST_SHOVEL);
                entries.add(ModItems.TUFF_ROD);
                entries.add(ModItems.COPPER_CHESTPLATE);
                entries.add(ModItems.COPPER_LEGGINGS);
                entries.add(ModItems.COPPER_HELMET);
                entries.add(ModItems.COPPER_BOOTS);

            }).build());



    public static void registerItemGroups(){
        VanillaExpanded.LOGGER.info("Registering item groups for " + VanillaExpanded.MOD_ID);
    }
}
