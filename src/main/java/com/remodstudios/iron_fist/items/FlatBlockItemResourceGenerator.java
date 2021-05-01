package com.remodstudios.iron_fist.items;

import com.remodstudios.yarnandneedles.datagen.ResourceGenerator;
import com.swordglowsblue.artifice.api.ArtificeResourcePack;
import com.swordglowsblue.artifice.api.util.IdUtils;
import net.minecraft.util.Identifier;

public final class FlatBlockItemResourceGenerator implements ResourceGenerator {
    public static final ResourceGenerator INSTANCE = new FlatBlockItemResourceGenerator();

    private FlatBlockItemResourceGenerator() { }

    @Override
    public void generateAssets(ArtificeResourcePack.ClientResourcePackBuilder pack, Identifier id) {
        pack.addItemModel(id, model -> model
                .parent(new Identifier("item/generated"))
                .texture("layer0", IdUtils.wrapPath("block/", id)));
    }

    @Override
    public void generateData(ArtificeResourcePack.ServerResourcePackBuilder pack, Identifier id) {

    }
}
