package com.remodstudios.iron_fist.blocks;

import com.remodstudios.iron_fist.IronFistMain;
import com.remodstudios.yarnandneedles.blocks.BlockRegistry;
import com.remodstudios.yarnandneedles.datagen.ResourceGenerators;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.sound.BlockSoundGroup;

@SuppressWarnings("unused")
public class IronFistBlocks extends BlockRegistry {
    public static final IronFistBlocks INSTANCE = new IronFistBlocks();

    public IronFistBlocks() {
        super(IronFistMain.MOD_ID);
    }

    //region Block Declaration
    // Stuff

    // FIXME referencing RenderLayer (client-only) in shared code!!!! -ADCLeo
    public final Block ARKSTONE_GLASS = add("arkstone_glass",
            RegistrySettings.of(ResourceGenerators.SIMPLE_BLOCK, RenderLayer.getTranslucent()),
            new GlassBlock(newCinderiteLike().nonOpaque())
    );
    public final Block ARKSTONE_ORE = add("arkstone_ore",
            new Block(newCinderiteLike())
    );
    // TODO create ResourceGenerator for bush-like blocks
    public final Block BARBED_BUSH = add("barbed_bush",
            RegistrySettings.of(ResourceGenerators.SIMPLE_BLOCK, RenderLayer.getCutout()),
            new FlowerLikeBushBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BUSH))
    );
    public final Block BARBED_BUSH_PLANT = add("barbed_bush_plant",
            RegistrySettings.of(ResourceGenerators.SIMPLE_BLOCK, RenderLayer.getCutout()),
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
            RegistrySettings.of(ResourceGenerators.SIMPLE_BLOCK, RenderLayer.getCutout()),
            new VineBlock(FabricBlockSettings.copyOf(Blocks.VINE))
    );
    
    
    public final Block CHISELED_CINDERITE_BRICKS = add("chiseled_cinderite_bricks",
            new Block(newCinderiteLike())
    );
    public final Block CINDERITE = add("cinderite",
            new Block(newCinderiteLike())
    );
    public final Block CINDERITE_BRICKS = add("cinderite_bricks",
            new Block(newCinderiteLike())
    );
    public final Block CINDERITE_PILLAR = add("cinderite_pillar",
            new Block(newCinderiteLike())
    );
    public final Block CINDERITE_TILES = add("cinderite_tiles",
            new Block(newCinderiteLike())
    );
    public final Block CRACKED_CINDERITE_BRICKS = add("cracked_cinderite_bricks",
            new Block(newCinderiteLike())
    );
    public final Block CRACKED_CINDERITE_TILES = add("cracked_cinderite_tiles",
            new Block(newCinderiteLike())
    );
    
    public final Block ERODITE_ORE = add("erodite_ore",
            new Block(newCinderiteLike())
    );
    
    public final Block FERROMOSS = add("ferromoss",
            new Block(newCinderiteLike().sounds(BlockSoundGroup.AMETHYST_CLUSTER))
    );
    public final Block FERROWEED = add("ferroweed",
            RegistrySettings.of(ResourceGenerators.SIMPLE_BLOCK, RenderLayer.getCutout()),
            new FlowerLikeBushBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BUSH))
    );

    public final Block HOURSAND = add("hoursand",
            new Block(FabricBlockSettings.copyOf(Blocks.SAND))
    );
    public final Block IRON_SAND = add("iron_sand",
            new Block(FabricBlockSettings.copyOf(Blocks.SAND).sounds(BlockSoundGroup.METAL))
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
}
