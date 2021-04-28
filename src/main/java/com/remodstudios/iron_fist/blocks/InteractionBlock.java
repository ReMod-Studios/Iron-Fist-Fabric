package com.remodstudios.iron_fist.blocks;

import com.remodstudios.iron_fist.items.IronFistItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class InteractionBlock extends Block {
    public InteractionBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (player.getStackInHand(hand).isOf(Items.BUCKET)) {
            player.setStackInHand(hand, new ItemStack(IronFistItems.INSTANCE.BUCKET_OF_TEARS));
        }
        return super.onUse(state, world, pos, player, hand, hit);
    }
}
