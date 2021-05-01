package com.remodstudios.iron_fist.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.DeadBushBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class FlowerLikeBushBlock extends DeadBushBlock {
    protected FlowerLikeBushBlock(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isTranslucent(BlockState state, BlockView world, BlockPos pos) {
        return super.isTranslucent(state, world, pos);
    }
}