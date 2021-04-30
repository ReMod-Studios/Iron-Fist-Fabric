package com.remodstudios.iron_fist.mixins;

import com.remodstudios.iron_fist.IronFistMain;
import com.remodstudios.iron_fist.items.IronFistItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.stat.Stat;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public abstract class PlayerArmorCheckMixin {
    @Shadow public abstract ItemStack getEquippedStack(EquipmentSlot slot);

    @Shadow public abstract boolean giveItemStack(ItemStack stack);

    @Shadow public abstract void incrementStat(Stat<?> stat);

    @Inject(at = @At("HEAD"), method = "tick")
    private void tick (CallbackInfo ci) {
        ItemStack helmet = getEquippedStack(EquipmentSlot.HEAD);
        ItemStack chestplate = getEquippedStack(EquipmentSlot.CHEST);
        ItemStack leggings = getEquippedStack(EquipmentSlot.LEGS);
        ItemStack boots = getEquippedStack(EquipmentSlot.FEET);
        
        if  (   helmet.getName().equals(IronFistItems.INSTANCE.MAGNETITE_HELMET) &&
                chestplate.getName().equals(IronFistItems.INSTANCE.MAGNETITE_CHESTPLATE) &&
                leggings.getName().equals(IronFistItems.INSTANCE.MAGNETITE_LEGGINGS) &&
                boots.getName().equals(IronFistItems.INSTANCE.MAGNETITE_BOOTS)
            )
        {

        }
    }
}
