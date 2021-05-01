package com.remodstudios.iron_fist.mixins;

import com.remodstudios.iron_fist.items.IronFistItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CryingObsidianBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(CryingObsidianBlock.class)
public class CryingObsidianInteractionMixin extends Block {
    public CryingObsidianInteractionMixin(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (player.getStackInHand(hand).isOf(Items.BUCKET)) {
            player.setStackInHand(hand, new ItemStack(IronFistItems.INSTANCE.BUCKET_OF_TEARS));
            player.playSound(SoundEvents.ITEM_BUCKET_FILL, 1.0F, 1.0F);
            world.setBlockState(pos, Blocks.OBSIDIAN.getDefaultState());
            return ActionResult.success(world.isClient());
        }
        return ActionResult.PASS;
    }
}