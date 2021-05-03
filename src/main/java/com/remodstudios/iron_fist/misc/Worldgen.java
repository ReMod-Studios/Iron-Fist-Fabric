package com.remodstudios.iron_fist.misc;

import com.remodstudios.iron_fist.IronFistMain;
import com.remodstudios.iron_fist.blocks.IronFistBlocks;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

@SuppressWarnings("unused")
public class Worldgen {
    public static void init() {
//        ConfiguredFeature<?, ?> SNOWFLAKE_OBSIDIAN_RULE = Feature.ORE
//                .configure(new OreFeatureConfig(
//                        new BlockMatchRuleTest(Blocks.END_STONE), // base block is endstone in the end biomes
//                        IronFistBlocks.INSTANCE.SNOWFLAKE_OBSIDIAN.getDefaultState(),
//                        9))
//                .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
//                        YOffset.getBottom(), YOffset.getTop()
//                )))
//                .spreadHorizontally()
//                .repeat(20);
        RegistryKey<ConfiguredFeature<?, ?>> oreWoolOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier(IronFistMain.MOD_ID, "snowflake_obsidian_rule"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreWoolOverworld.getValue(), Feature.ORE
                .configure(new OreFeatureConfig(
                        new BlockMatchRuleTest(Blocks.END_STONE), // base block is endstone in the end biomes
                        IronFistBlocks.INSTANCE.SNOWFLAKE_OBSIDIAN.getDefaultState(),
                        9))
                .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                        YOffset.getBottom(), YOffset.getTop()
                )))
                .spreadHorizontally()
                .repeat(20));
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreWoolOverworld);

        // Portal
    }
}
