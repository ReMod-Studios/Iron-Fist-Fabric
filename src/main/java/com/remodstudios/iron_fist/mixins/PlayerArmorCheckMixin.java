package com.remodstudios.iron_fist.mixins;

import com.remodstudios.iron_fist.IronFistMain;
import com.remodstudios.iron_fist.items.IronFistItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.stat.Stat;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public abstract class PlayerArmorCheckMixin extends LivingEntity {
    protected PlayerArmorCheckMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    ItemStack helmet = getEquippedStack(EquipmentSlot.HEAD);
    ItemStack chestplate = getEquippedStack(EquipmentSlot.CHEST);
    ItemStack leggings = getEquippedStack(EquipmentSlot.LEGS);
    ItemStack boots = getEquippedStack(EquipmentSlot.FEET);
    ItemStack mainhand = getEquippedStack(EquipmentSlot.MAINHAND);

    public final boolean hasMagnetism =     (   helmet.getName().equals(IronFistItems.INSTANCE.MAGNETITE_HELMET) &&
                                                chestplate.getName().equals(IronFistItems.INSTANCE.MAGNETITE_CHESTPLATE) &&
                                                leggings.getName().equals(IronFistItems.INSTANCE.MAGNETITE_LEGGINGS) &&
                                                boots.getName().equals(IronFistItems.INSTANCE.MAGNETITE_BOOTS)  ||
                                            (       mainhand.getName().equals(IronFistItems.INSTANCE.MAGNETITE_SWORD) ||
                                                    mainhand.getName().equals(IronFistItems.INSTANCE.MAGNETITE_AXE) ||
                                                    mainhand.getName().equals(IronFistItems.INSTANCE.MAGNETITE_PICKAXE) ||
                                                    mainhand.getName().equals(IronFistItems.INSTANCE.MAGNETITE_SHOVEL) ||
                                                    mainhand.getName().equals(IronFistItems.INSTANCE.MAGNETITE_HOE))
                                            );

    @Shadow public abstract ItemStack getEquippedStack(EquipmentSlot slot);

    @Shadow public abstract boolean giveItemStack(ItemStack stack);

    @Shadow public abstract void incrementStat(Stat<?> stat);

    @Inject(at = @At("HEAD"), method = "tick")
    private void tick (CallbackInfo ci) {
        if (hasMagnetism) {

        }
    }
}
