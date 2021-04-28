package com.remodstudios.iron_fist.items;

import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

@SuppressWarnings("unused")
public enum IronFistToolMaterials implements ToolMaterial {
    MAGNETITE(ToolMaterials.IRON);


    private final int durability;
    private final float miningSpeedMultiplier;
    private final float attackDamage;
    private final int miningLevel;
    private final int enchantibility;
    private final Supplier<Ingredient> repairIngredientSupplier;

    IronFistToolMaterials(int durability, float miningSpeedMultiplier, float attackDamage, int miningLevel, int enchantibility, Supplier<Ingredient> repairIngredientSupplier) {
        this.durability = durability;
        this.miningSpeedMultiplier = miningSpeedMultiplier;
        this.attackDamage = attackDamage;
        this.miningLevel = miningLevel;
        this.enchantibility = enchantibility;
        this.repairIngredientSupplier = repairIngredientSupplier;
    }

    IronFistToolMaterials(ToolMaterial material) {
        this.durability = material.getDurability();
        this.miningSpeedMultiplier = material.getMiningSpeedMultiplier();
        this.attackDamage = material.getAttackDamage();
        this.miningLevel = material.getMiningLevel();
        this.enchantibility = material.getEnchantability();
        this.repairIngredientSupplier = material::getRepairIngredient;
    }


    @Override
    public int getDurability() {
        return durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return miningSpeedMultiplier;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return miningLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantibility;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredientSupplier.get();
    }
}
