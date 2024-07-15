package net.elleclipse.vanillaexpanded.item.custom;

import net.elleclipse.vanillaexpanded.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    AMETHYST(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1800,9,18,-1, () -> Ingredient.ofItems(Items.AMETHYST_CLUSTER)),
    EMERALD(BlockTags.INCORRECT_FOR_IRON_TOOL, 500,11,13,-1, () -> Ingredient.ofItems(Items.EMERALD)),
    COPPER(BlockTags.INCORRECT_FOR_IRON_TOOL, 700,6,16,-1, () -> Ingredient.ofItems(Items.COPPER_INGOT));

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final int enchantability;
    private final float attackDamage;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterial(TagKey<Block> inverseTag, int itemDurability, float miningSpeed, int enchantability, float attackDamage, Supplier<Ingredient> repairIngredient) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.enchantability = enchantability;
        this.attackDamage = attackDamage;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

}
