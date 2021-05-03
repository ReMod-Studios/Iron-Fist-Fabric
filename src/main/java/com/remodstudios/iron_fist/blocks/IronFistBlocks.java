package com.remodstudios.iron_fist.blocks;

import com.remodstudios.iron_fist.IronFistMain;
import com.remodstudios.yarnandneedles.blocks.BlockRegistry;
import com.remodstudios.yarnandneedles.datagen.ResourceGenerators;
import com.remodstudios.yarnandneedles.datagen.generators.block.LogBlockGenerator;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.sound.BlockSoundGroup;

import static com.remodstudios.yarnandneedles.datagen.ResourceGenerators.LOG_BLOCK;
import static net.minecraft.block.Blocks.*;

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
    public final Block IRONWOOD_LOG = add("ironwood_log",
            RegistrySettings.of(LOG_BLOCK),
            new PillarBlock(FabricBlockSettings
                            .of(Material.METAL)
                            .strength(2.0F)
                            .sounds(BlockSoundGroup.WOOD))
    );
    public final Block IRONWOOD_LEAVES = add("ironwood_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(OAK_LEAVES))
    );
    public final Block FLOWERING_IRONWOOD_LEAVES = add("flowering_ironwood_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(IRONWOOD_LEAVES))
    );
    public final Block POLISHED_CINDERITE = add("polished_cinderite",
            new Block(newCinderiteLike())
    );
    public final Block POLISHED_CINDERITE_TOTEM_BLOCK = add("polished_cinderite_totem_block",
            new Block(newCinderiteLike())
    );
    public final Block RINGROOT = add("ringroot",
            RegistrySettings.of(ResourceGenerators.SIMPLE_BLOCK, RenderLayer.getCutout()),
            new FlowerLikeBushBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BUSH))
    );
    public final Block RUSTY_CINDERITE_BRICKS = add("rusty_cinderite_bricks",
            new Block(newCinderiteLike())
    );
    public final Block RUSTY_CINDERITE_TILES = add("rusty_cinderite_tiles",
            new Block(newCinderiteLike())
    );
    public final Block SAGUAROSTEEL_BLOCK = add("saguarosteel_block",
            new Block(newSaguaroLike())
    );
    public final Block SAGUAROSTEEL_BUD = add("saguarosteel_bud",
            RegistrySettings.of(ResourceGenerators.SIMPLE_BLOCK, RenderLayer.getCutout()),
            new FlowerLikeBushBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BUSH).sounds(BlockSoundGroup.METAL))
    );
    public final Block SUGUAROSTEEL_GROWTH = add("saguarosteel_growth",
            new Block(newSaguaroLike())
    );
    public final Block SUGUAROSTEEL_THORNS = add("saguarosteel_thorns",
            RegistrySettings.of(ResourceGenerators.SIMPLE_BLOCK, RenderLayer.getCutout()),
            new FlowerLikeBushBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BUSH).sounds(BlockSoundGroup.METAL))
    );
    public final Block SILVER_BUD = add("silver_bud",
            RegistrySettings.of(ResourceGenerators.SIMPLE_BLOCK, RenderLayer.getCutout()),
            new FlowerLikeBushBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BUSH).sounds(BlockSoundGroup.METAL))
    );
    public final Block SILVER_GROWTH = add("silver_growth",
            new Block(FabricBlockSettings.copyOf(IRON_BLOCK))
    );
    public final Block SNOWFLAKE_OBSIDIAN = add("snowflake_obsidian",
            new Block(FabricBlockSettings.copyOf(OBSIDIAN))
    );
    public final Block STRIPPED_IRONWOOD_LOG = add("stripped_ironwood_log",
            new Block(FabricBlockSettings.copyOf(IRONWOOD_LOG))
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
    private static final FabricBlockSettings newSaguaroLike() {
        return  (FabricBlockSettings
                .copyOf(STONE)
                .sounds(BlockSoundGroup.METAL)
        );
    }
}
