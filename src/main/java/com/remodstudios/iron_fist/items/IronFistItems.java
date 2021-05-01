package com.remodstudios.iron_fist.items;

import com.remodstudios.iron_fist.IronFistMain;
import com.remodstudios.iron_fist.blocks.IronFistBlocks;
import com.remodstudios.yarnandneedles.blocks.BlockRegistry;
import com.remodstudios.yarnandneedles.datagen.ResourceGenerators;
import com.remodstudios.yarnandneedles.items.ItemRegistry;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

import java.util.Map;

@SuppressWarnings("unused")
public class IronFistItems extends ItemRegistry {
    public static final IronFistItems INSTANCE = new IronFistItems();

    private final ItemGroup GROUP
            = FabricItemGroupBuilder.build(
            IronFistMain.id("group"),
            () -> new ItemStack(IronFistItems.INSTANCE.STARFRUIT)
    );

    public IronFistItems() {
        super(IronFistMain.MOD_ID);
    }

    //region Item Declarations

    private final FabricItemSettings BASE_SETTINGS = new FabricItemSettings().group(GROUP);
    private final FabricItemSettings UNSTACKABLE_SETTINGS = new FabricItemSettings().group(GROUP).maxCount(1);

    public final Item ARKSTONE_CRYSTAL = add("arkstone_crystal");
    public final Item ARKSTONE_INGOT = add("arkstone_ingot");

    public final Item BUCKET_OF_FERROFLUID = add("bucket_of_ferrofluid", new Item(UNSTACKABLE_SETTINGS));
    public final Item BUCKET_OF_TEARS = add("bucket_of_tears", new Item(UNSTACKABLE_SETTINGS));

    public final Item ERODITE = add("erodite");
    public final Item FAIRY_LIGHTS = add("fairy_lights");

    public final Item MAGNETITE = add("magnetite");
    public final Item MAGNETITE_SWORD       =
            add("magnetite_sword", ResourceGenerators.HANDHELD_ITEM,
                    new MagnetiteSwordItem(IronFistToolMaterials.MAGNETITE, 3, -2.4F, UNSTACKABLE_SETTINGS)
            );
    public final Item MAGNETITE_SHOVEL 		=
            add("magnetite_shovel", ResourceGenerators.HANDHELD_ITEM,
                    new MagnetiteShovelItem(IronFistToolMaterials.MAGNETITE, 1.5f, -3f, UNSTACKABLE_SETTINGS)
            );
    public final Item MAGNETITE_PICKAXE 	=
            add("magnetite_pickaxe", ResourceGenerators.HANDHELD_ITEM,
                    new MagnetitePickaxeItem(IronFistToolMaterials.MAGNETITE, 1, -2.8f, UNSTACKABLE_SETTINGS)
            );
    public final Item MAGNETITE_AXE 		=
            add("magnetite_axe", ResourceGenerators.HANDHELD_ITEM,
                    new MagnetiteAxeItem(IronFistToolMaterials.MAGNETITE, 6.0F, -3.1F, UNSTACKABLE_SETTINGS)
            );
    public final Item MAGNETITE_HOE 		=
            add("magnetite_hoe", ResourceGenerators.HANDHELD_ITEM,
                    new MagnetiteHoeItem(IronFistToolMaterials.MAGNETITE, -2, -1.0F, UNSTACKABLE_SETTINGS)
            );
    public final Item MAGNETITE_HELMET 		=
            add("magnetite_helmet",
                    new ArmorItem(IronFistArmorMaterials.MAGNETITE, EquipmentSlot.HEAD, UNSTACKABLE_SETTINGS)
            );
    public final Item MAGNETITE_CHESTPLATE 	=
            add("magnetite_chestplate",
                    new ArmorItem(IronFistArmorMaterials.MAGNETITE, EquipmentSlot.CHEST, UNSTACKABLE_SETTINGS)
            );
    public final Item MAGNETITE_LEGGINGS 	=
            add("magnetite_leggings",
                    new ArmorItem(IronFistArmorMaterials.MAGNETITE, EquipmentSlot.LEGS, UNSTACKABLE_SETTINGS)
            );
    public  final Item MAGNETITE_BOOTS 		=
            add("magnetite_boots",
                    new ArmorItem(IronFistArmorMaterials.MAGNETITE, EquipmentSlot.FEET, UNSTACKABLE_SETTINGS)
            );

    public final Item SILVER_INGOT = add("silver_ingot");
    public final Item SILVER_NUGGET = add("silver_nugget");

    public final Item STARFRUIT             =
            add("starfruit",
                    new Item(new Item.Settings().food(new FoodComponent.Builder()
                            .hunger(6)
                            .saturationModifier(6F)
                            .build())
                            .group(GROUP))
            );
    public final Item THORN = add("thorn");

    //endregion

    @Override
    public void init() {
        // add block items *before* init (since init registers)
        for (Map.Entry<Identifier, Pair<Block, BlockRegistry.RegistrySettings>> entry : IronFistBlocks.INSTANCE.BLOCKS.entrySet())
            addBlockItem(entry.getKey().getPath(), entry.getValue().getLeft());
        super.init();
    }

    @Override
    protected FabricItemSettings getDefaultSettings() {
        return BASE_SETTINGS;
    }
}
