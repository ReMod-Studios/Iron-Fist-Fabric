package com.remodstudios.iron_fist;

import com.remodstudios.iron_fist.blocks.IronFistBlocks;
import com.remodstudios.iron_fist.items.IronFistItems;
import com.swordglowsblue.artifice.api.Artifice;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IronFistMain implements ModInitializer {
    public static final String MOD_ID = "iron_fist";
    public static final String MOD_NAME = "Iron Fist";

    public static final Logger LOGGER = LogManager.getLogger(MOD_NAME);

    @Override
    public void onInitialize() {
        log(Level.INFO, "Initializing");
        //TODO: Initializer
        IronFistItems.INSTANCE.init();
        IronFistBlocks.INSTANCE.init();
        Artifice.registerDataPack(new Identifier(MOD_ID, "generated_data"), pack -> {
            pack.setDisplayName("Iron Fist - Generated Data");
            pack.setDescription("Data pack generated by Iron Fist");

            IronFistBlocks.INSTANCE.generateData(pack);
            IronFistItems.INSTANCE.generateData(pack);
        });
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }
    public static Identifier id(String path) { return new Identifier(MOD_ID, path); }
}