package com.remodstudios.iron_fist.blocks;

import com.remodstudios.yarnandneedles.datagen.ResourceGenerator;
import com.remodstudios.yarnandneedles.datagen.generators.block.SimpleBlockGenerator;
import com.swordglowsblue.artifice.api.ArtificeResourcePack;
import com.swordglowsblue.artifice.api.util.IdUtils;
import net.minecraft.util.Identifier;

public final class PlantBlockResourceGenerator extends SimpleBlockGenerator {
    public static final ResourceGenerator INSTANCE = new PlantBlockResourceGenerator();

    private PlantBlockResourceGenerator() { }

    @Override
    protected void generateModels(ArtificeResourcePack.ClientResourcePackBuilder pack, Identifier id) {
        pack.addBlockModel(id, model -> model
                .parent(new Identifier("block/cross"))
                .texture("cross", IdUtils.wrapPath("block/", id))
        );
    }
}
