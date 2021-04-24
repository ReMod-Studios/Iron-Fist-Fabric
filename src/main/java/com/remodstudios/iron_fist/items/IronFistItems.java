package com.remodstudios.iron_fist.items;

import com.remodstudios.iron_fist.IronFistMain;
import com.remodstudios.yarnandneedles.items.ItemRegistry;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

@SuppressWarnings("unused")
public class IronFistItems extends ItemRegistry {
    public static final IronFistItems INSTANCE = new IronFistItems();

    private final ItemGroup GROUP
            = FabricItemGroupBuilder.build(
            IronFistMain.id("group"),
            () -> new ItemStack(Blocks.END_PORTAL_FRAME)
    );

    public IronFistItems() {
        super(IronFistMain.MOD_ID);
    }

    //region Item declarations
    private final FabricItemSettings BASE_SETTINGS = new FabricItemSettings().group(GROUP).maxCount(64);
    private final FabricItemSettings TOOL_SETTINGS = new FabricItemSettings().group(GROUP).maxCount(1);

    //endregion
}
