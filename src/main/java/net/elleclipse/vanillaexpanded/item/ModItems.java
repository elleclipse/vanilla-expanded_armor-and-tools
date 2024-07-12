package net.elleclipse.vanillaexpanded.item;

import net.elleclipse.vanillaexpanded.VanillaExpanded;
import net.elleclipse.vanillaexpanded.item.custom.ModArmorMaterial;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item AMETHYST_HELMET = register(new ArmorItem(ModArmorMaterial.AMETHYST, ArmorItem.Type.HELMET, new Item.Settings()), "amethyst_helmet");
    public static final Item AMETHYST_CHESTPLATE = register(new ArmorItem(ModArmorMaterial.AMETHYST, ArmorItem.Type.CHESTPLATE, new Item.Settings()), "amethyst_chestplate");
    public static final Item AMETHYST_LEGGINGS = register(new ArmorItem(ModArmorMaterial.AMETHYST, ArmorItem.Type.LEGGINGS, new Item.Settings()), "amethyst_leggings");
    public static final Item AMETHYST_BOOTS = register(new ArmorItem(ModArmorMaterial.AMETHYST, ArmorItem.Type.BOOTS, new Item.Settings()), "amethyst_boots");
    public static final Item AMETHYST_DUST = register(new Item(new Item.Settings()),"amethyst_dust");

    private static void addItemsToCombatMenu(FabricItemGroupEntries entries){
    }

    public static Item register(Item item, String id) {
        // Create the identifier for the item.
        Identifier itemID = Identifier.of(VanillaExpanded.MOD_ID, id);

        // Return the registered item!
        return Registry.register(Registries.ITEM, itemID, item);
    }

    public static void registerModItems(){
        VanillaExpanded.LOGGER.info("Registering mod items for " + VanillaExpanded.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatMenu);
    }
}
