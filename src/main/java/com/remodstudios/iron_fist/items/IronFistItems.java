package com.remodstudios.iron_fist.items;

import com.remodstudios.iron_fist.IronFistMain;
import com.remodstudios.iron_fist.blocks.IronFistBlocks;
import com.remodstudios.yarnandneedles.datagen.ResourceGenerators;
import com.remodstudios.yarnandneedles.items.ItemRegistry;
import com.remodstudios.yarnandneedles.items.ModAxeItem;
import com.remodstudios.yarnandneedles.items.ModHoeItem;
import com.remodstudios.yarnandneedles.items.ModPickaxeItem;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;

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

    public final Item ARKSTONE_CRYSTAL = add("arkstone_crystal", new Item(BASE_SETTINGS));
    public final Item ARKSTONE_INGOT = add("arkstone_ingot", new Item(BASE_SETTINGS));

    public final Item BUCKET_OF_FERROFLUID = add("bucket_of_ferrofluid", new Item(UNSTACKABLE_SETTINGS));
    public final Item BUCKET_OF_TEARS = add("bucket_of_tears", new Item(UNSTACKABLE_SETTINGS));

    public final Item ERODITE = add("erodite");    
    public final Item FAIRY_LIGHTS = add("fairy_lights");

    public final Item MAGNETITE = add("magnetite");
    public final Item MAGNETITE_SWORD       =
            add("magnetite_sword", ResourceGenerators.HANDHELD_ITEM,
                    new SwordItem(IronFistToolMaterials.MAGNETITE, 3, -2.4F, UNSTACKABLE_SETTINGS)
            );
    public final Item MAGNETITE_SHOVEL 		=
            add("magnetite_shovel", ResourceGenerators.HANDHELD_ITEM,
                    new ShovelItem(IronFistToolMaterials.MAGNETITE, 1.5f, -3f, UNSTACKABLE_SETTINGS)
            );
    public final Item MAGNETITE_PICKAXE 	=
            add("magnetite_pickaxe", ResourceGenerators.HANDHELD_ITEM,
                    new ModPickaxeItem(IronFistToolMaterials.MAGNETITE, 1, -2.8f, UNSTACKABLE_SETTINGS)
            );
    public final Item MAGNETITE_AXE 		=
            add("magnetite_axe", ResourceGenerators.HANDHELD_ITEM,
                    new ModAxeItem(IronFistToolMaterials.MAGNETITE, 6.0F, -3.1F, UNSTACKABLE_SETTINGS)
            );
    public final Item MAGNETITE_HOE 		=
            add("magnetite_hoe", ResourceGenerators.HANDHELD_ITEM,
                    new ModHoeItem(IronFistToolMaterials.MAGNETITE, -2, -1.0F, UNSTACKABLE_SETTINGS)
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

    //region Block Item Declarations

    public final BlockItem ARKSTONE_GLASS = addBlockItem("arkstone_glass", IronFistBlocks.INSTANCE.ARKSTONE_GLASS);
    public final BlockItem ARKSTONE_ORE = addBlockItem("arkstone_ore", IronFistBlocks.INSTANCE.ARKSTONE_ORE);
    public final BlockItem BARBED_BUSH = addBlockItem("barbed_bush", IronFistBlocks.INSTANCE.BARBED_BUSH);
    public final BlockItem BARBED_BUSH_PLANT = addBlockItem("barbed_bush_plant", IronFistBlocks.INSTANCE.BARBED_BUSH_PLANT);
    public final BlockItem BLOCK_OF_ERODITE = addBlockItem("block_of_erodite", IronFistBlocks.INSTANCE.BLOCK_OF_ERODITE);
    public final BlockItem BLOCK_OF_MAGNETITE = addBlockItem("block_of_magnetite", IronFistBlocks.INSTANCE.BLOCK_OF_MAGNETITE);
    public final BlockItem BLOCK_OF_SILVER = addBlockItem("block_of_silver", IronFistBlocks.INSTANCE.BLOCK_OF_SILVER);
    public final BlockItem BLOSSOM_VINES = addBlockItem("blossom_vines", IronFistBlocks.INSTANCE.BLOSSOM_VINES);

    //endregion
}
