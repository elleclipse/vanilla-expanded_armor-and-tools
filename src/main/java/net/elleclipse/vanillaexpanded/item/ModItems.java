package net.elleclipse.vanillaexpanded.item;

import net.elleclipse.vanillaexpanded.VanillaExpanded;
import net.elleclipse.vanillaexpanded.item.custom.ModArmorMaterial;
import net.elleclipse.vanillaexpanded.item.custom.ModToolMaterial;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item AMETHYST_HELMET = register(new ArmorItem(ModArmorMaterial.AMETHYST, ArmorItem.Type.HELMET, new Item.Settings()), "amethyst_helmet");
    public static final Item AMETHYST_CHESTPLATE = register(new ArmorItem(ModArmorMaterial.AMETHYST, ArmorItem.Type.CHESTPLATE, new Item.Settings()), "amethyst_chestplate");
    public static final Item AMETHYST_LEGGINGS = register(new ArmorItem(ModArmorMaterial.AMETHYST, ArmorItem.Type.LEGGINGS, new Item.Settings()), "amethyst_leggings");
    public static final Item AMETHYST_BOOTS = register(new ArmorItem(ModArmorMaterial.AMETHYST, ArmorItem.Type.BOOTS, new Item.Settings()), "amethyst_boots");
    public static final Item AMETHYST_DUST = register(new Item(new Item.Settings()),"amethyst_dust");
    public static final Item OBSIDIAN_DUST = register(new Item(new Item.Settings()),"obsidian_dust");
    public static final Item TUFF_ROD = register(new Item(new Item.Settings()), "tuff_rod");
    public static final Item REINFORCED_AMETHYST_DUST = register(new Item(new Item.Settings()),"reinforced_amethyst_dust");
    public static final Item REINFORCED_AMETHYST_SHARD = register(new Item(new Item.Settings()),"reinforced_amethyst_shard");

    public static final Item AMETHYST_PICKAXE = register(new PickaxeItem(ModToolMaterial.AMETHYST, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(
            ModToolMaterial.AMETHYST, 4, -3.5F
    ))),"amethyst_pickaxe");
    public static final Item AMETHYST_AXE = register(new AxeItem(ModToolMaterial.AMETHYST, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(
            ModToolMaterial.AMETHYST, 9, -2.5F
    ))),"amethyst_axe");
    public static final Item AMETHYST_SWORD = register(new SwordItem(ModToolMaterial.AMETHYST, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(
            ModToolMaterial.AMETHYST, 9, -2F
    ))),"amethyst_sword");
    public static final Item AMETHYST_SHOVEL = register(new ShovelItem(ModToolMaterial.AMETHYST, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(
            ModToolMaterial.AMETHYST, 3, -3.5F
    ))),"amethyst_shovel");
    public static final Item AMETHYST_HOE = register(new HoeItem(ModToolMaterial.AMETHYST, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(
            ModToolMaterial.AMETHYST, 2, -3.5F
    ))),"amethyst_hoe");


    public static final Item COPPER_HELMET = register(new ArmorItem(ModArmorMaterial.COPPER, ArmorItem.Type.HELMET, new Item.Settings()), "copper_helmet");
    public static final Item COPPER_CHESTPLATE = register(new ArmorItem(ModArmorMaterial.COPPER, ArmorItem.Type.CHESTPLATE, new Item.Settings()), "copper_chestplate");
    public static final Item COPPER_LEGGINGS = register(new ArmorItem(ModArmorMaterial.COPPER, ArmorItem.Type.LEGGINGS, new Item.Settings()), "copper_leggings");
    public static final Item COPPER_BOOTS = register(new ArmorItem(ModArmorMaterial.COPPER, ArmorItem.Type.BOOTS, new Item.Settings()), "copper_boots");

    public static final Item COPPER_PICKAXE = register(new PickaxeItem(ModToolMaterial.COPPER, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(
            ModToolMaterial.COPPER, 3, -3.5F
    ))),"copper_pickaxe");
    public static final Item COPPER_AXE = register(new AxeItem(ModToolMaterial.COPPER, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(
            ModToolMaterial.COPPER, 6, -2.5F
    ))),"copper_axe");
    public static final Item COPPER_SWORD = register(new SwordItem(ModToolMaterial.COPPER, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(
            ModToolMaterial.COPPER, 6, -2F
    ))),"copper_sword");
    public static final Item COPPER_SHOVEL = register(new ShovelItem(ModToolMaterial.COPPER, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(
            ModToolMaterial.COPPER, 2, -3.5F
    ))),"copper_shovel");
    public static final Item COPPER_HOE = register(new HoeItem(ModToolMaterial.COPPER, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(
            ModToolMaterial.COPPER, 1, -3.5F
    ))),"copper_hoe");


    public static final Item EMERALD_HELMET = register(new ArmorItem(ModArmorMaterial.EMERALD, ArmorItem.Type.HELMET, new Item.Settings()), "emerald_helmet");
    public static final Item EMERALD_CHESTPLATE = register(new ArmorItem(ModArmorMaterial.EMERALD, ArmorItem.Type.CHESTPLATE, new Item.Settings()), "emerald_chestplate");
    public static final Item EMERALD_LEGGINGS = register(new ArmorItem(ModArmorMaterial.EMERALD, ArmorItem.Type.LEGGINGS, new Item.Settings()), "emerald_leggings");
    public static final Item EMERALD_BOOTS = register(new ArmorItem(ModArmorMaterial.EMERALD, ArmorItem.Type.BOOTS, new Item.Settings()), "emerald_boots");

    public static final Item EMERALD_PICKAXE = register(new PickaxeItem(ModToolMaterial.EMERALD, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(
            ModToolMaterial.EMERALD, 3, -3.5F
    ))),"emerald_pickaxe");
    public static final Item EMERALD_AXE = register(new AxeItem(ModToolMaterial.EMERALD, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(
            ModToolMaterial.EMERALD, 6, -2.5F
    ))),"emerald_axe");
    public static final Item EMERALD_SWORD = register(new SwordItem(ModToolMaterial.EMERALD, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(
            ModToolMaterial.EMERALD, 6, -2F
    ))),"emerald_sword");
    public static final Item EMERALD_SHOVEL = register(new ShovelItem(ModToolMaterial.EMERALD, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(
            ModToolMaterial.EMERALD, 2, -3.5F
    ))),"emerald_shovel");
    public static final Item EMERALD_HOE = register(new HoeItem(ModToolMaterial.EMERALD, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(
            ModToolMaterial.EMERALD, 1, -3.5F
    ))),"emerald_hoe");

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
