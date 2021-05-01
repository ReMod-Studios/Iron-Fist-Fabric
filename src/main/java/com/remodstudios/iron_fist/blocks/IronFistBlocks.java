package com.remodstudios.iron_fist.blocks;

import com.remodstudios.iron_fist.IronFistMain;
import com.remodstudios.yarnandneedles.blocks.BlockRegistry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;

@SuppressWarnings("unused")
public class IronFistBlocks extends BlockRegistry {
    public static final IronFistBlocks INSTANCE = new IronFistBlocks();

    public IronFistBlocks() {
        super(IronFistMain.MOD_ID);
    }

    //region Block Declaration
    // Stuff

    public final Block ARKSTONE_GLASS = add("arkstone_glass",
            new Block(newCinderiteLike())
    );
    public final Block ARKSTONE_ORE = add("arkstone_ore",
            new Block(newCinderiteLike())
    );
    public final Block BARBED_BUSH = add("barbed_bush",
            new FlowerLikeBushBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BUSH))
    );
    public final Block BARBED_BUSH_PLANT = add("barbed_bush_plant",
            new FlowerLikeBushBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BUSH))
    );
    public final Block BLOCK_OF_ERODITE = add("block_of_erodite",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK))
    );
    public final Block BLOCK_OF_MAGNETITE = add("block_of_magnetite",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK))
    );
    public final Block BLOCK_OF_SILVER = add("block_of_silver",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK))
    );
    public final Block BLOSSOM_VINES = add("blossom_vines",
            new VineBlock(FabricBlockSettings.copyOf(Blocks.VINE))
    );
    public final Block CHISELED_CINDERITE_BRICKS = add("chiseled_cinderite_bricks",
            new Block(newStoneLike())
    );
    public final Block CINDERITE = add("cinderite",
            new Block(newStoneLike())
    );



    //endregion

    private static final FabricBlockSettings newCinderiteLike() {
        return (FabricBlockSettings
                .of(Material.STONE)
                .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                .breakByTool(FabricToolTags.PICKAXES)
                .requiresTool()
                .strength(0.5F)
        );
    }

    private static final FabricBlockSettings newStoneLike() {
        return (FabricBlockSettings
                .of(Material.STONE)
                .sounds(BlockSoundGroup.STONE)
                .breakByTool(FabricToolTags.PICKAXES)
                .requiresTool()
                .strength(2.5F)
        );
    }
}
