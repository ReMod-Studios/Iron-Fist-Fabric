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


    //endregion

    private static final FabricBlockSettings newCinderiteLike() {
        return (FabricBlockSettings
                .of(Material.STONE)
                .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                .breakByTool(FabricToolTags.PICKAXES)
                .requiresTool()
                .strength(2.5F)
        );
    }
}
