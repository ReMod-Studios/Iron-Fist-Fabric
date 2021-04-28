package com.remodstudios.iron_fist.items;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

@SuppressWarnings("unused")
public enum IronFistArmorMaterials implements ArmorMaterial {
    MAGNETITE(
            s -> 1, // TODO balance
            s -> 1, // TODO balance
            10,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            "finallium",
            0f, 0f,
            () -> Ingredient.ofItems(IronFistItems.INSTANCE.MAGNETITE) // todo use tags
    );
    
    private final ToIntFunction<EquipmentSlot> durabilityFunction;
    private final ToIntFunction<EquipmentSlot> protectionFunction;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final String name;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredientSupplier;

    IronFistArmorMaterials(ToIntFunction<EquipmentSlot> durabilityFunction, ToIntFunction<EquipmentSlot> protectionFunction, int enchantability, SoundEvent equipSound, String name, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredientSupplier) {
        this.durabilityFunction = durabilityFunction;
        this.protectionFunction = protectionFunction;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.name = name;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = repairIngredientSupplier;
    }

    @Override
    public int getDurability(EquipmentSlot slot) {
        return this.durabilityFunction.applyAsInt(slot);
    }


    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionFunction.applyAsInt(slot);
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredientSupplier.get();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
