package com.remodstudios.iron_fist.client;

import com.remodstudios.iron_fist.blocks.IronFistBlocks;
import com.remodstudios.iron_fist.items.IronFistItems;
import com.swordglowsblue.artifice.api.Artifice;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.remodstudios.iron_fist.IronFistMain.MOD_ID;
import static com.remodstudios.iron_fist.IronFistMain.MOD_NAME;

@Environment(EnvType.CLIENT)
public class IronFistClientMain implements ClientModInitializer {
    public static final Logger LOGGER = LogManager.getLogger(MOD_NAME + "|Client");

    @Override
    public void onInitializeClient() {
        log(Level.INFO, "Initializing client");
        Artifice.registerAssetPack(new Identifier(MOD_ID, "generated_assets"), pack -> {
            pack.setDisplayName("Iron Fist - Generated Assets");
            pack.setDescription("Resource pack generated by Iron Fist");

            IronFistItems.INSTANCE.generateAssets(pack);
            IronFistBlocks.INSTANCE.generateAssets(pack);
        });
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"|Client] " + message);
    }
}
