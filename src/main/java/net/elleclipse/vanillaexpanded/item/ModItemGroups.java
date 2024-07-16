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
            .icon(() -> new ItemStack(ModItems.AMETHYST_SWORD)).entries((displayContext, entries) -> {
                entries.add(ModItems.AMETHYST_HELMET);
                entries.add(ModItems.AMETHYST_CHESTPLATE);
                entries.add(ModItems.AMETHYST_LEGGINGS);
                entries.add(ModItems.AMETHYST_BOOTS);
                entries.add(ModItems.AMETHYST_PICKAXE);
                entries.add(ModItems.AMETHYST_AXE);
                entries.add(ModItems.AMETHYST_SWORD);
                entries.add(ModItems.AMETHYST_HOE);
                entries.add(ModItems.AMETHYST_SHOVEL);

                entries.add(ModItems.AMETHYST_UPGRADE_SMITHING_TEMPLATE);

                entries.add(ModItems.COPPER_CHESTPLATE);
                entries.add(ModItems.COPPER_LEGGINGS);
                entries.add(ModItems.COPPER_HELMET);
                entries.add(ModItems.COPPER_BOOTS);
                entries.add(ModItems.COPPER_PICKAXE);
                entries.add(ModItems.COPPER_AXE);
                entries.add(ModItems.COPPER_SWORD);
                entries.add(ModItems.COPPER_HOE);
                entries.add(ModItems.COPPER_SHOVEL);

                entries.add(ModItems.EMERALD_CHESTPLATE);
                entries.add(ModItems.EMERALD_LEGGINGS);
                entries.add(ModItems.EMERALD_HELMET);
                entries.add(ModItems.EMERALD_BOOTS);
                entries.add(ModItems.EMERALD_PICKAXE);
                entries.add(ModItems.EMERALD_AXE);
                entries.add(ModItems.EMERALD_SWORD);
                entries.add(ModItems.EMERALD_HOE);
                entries.add(ModItems.EMERALD_SHOVEL);

                entries.add(ModItems.TURTLE_SCUTE_BOOTS);
                entries.add(ModItems.TURTLE_SCUTE_LEGGINGS);
                entries.add(ModItems.TURTLE_SCUTE_CHESTPLATE);


            }).build());



    public static void registerItemGroups(){
        VanillaExpanded.LOGGER.info("Registering item groups for " + VanillaExpanded.MOD_ID);
    }
}
