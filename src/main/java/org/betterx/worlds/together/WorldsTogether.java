package org.betterx.worlds.together;

import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.javafmlmod.FMLModContainer;
import net.minecraftforge.fml.loading.targets.FMLUserdevLaunchHandler;
import org.betterx.worlds.together.surfaceRules.SurfaceRuleRegistry;
import org.betterx.worlds.together.tag.v3.TagManager;
import org.betterx.worlds.together.util.Logger;
import org.betterx.worlds.together.world.WorldConfig;
import org.betterx.worlds.together.worldPreset.WorldPresets;

import net.minecraft.resources.ResourceLocation;

public class WorldsTogether {
    public static boolean SURPRESS_EXPERIMENTAL_DIALOG = false;
    public static boolean FORCE_SERVER_TO_BETTERX_PRESET = false;
    public static final String MOD_ID = "worlds_together";
    public static final Logger LOGGER = new Logger(MOD_ID);
    public static final boolean RUNS_TERRABLENDER =
                                                                .getModContainer("terrablender")
                                                                .isPresent();

    public static boolean isDevEnvironment() {
        return ;
    }

    public WorldsTogether() {
        TagManager.ensureStaticallyLoaded();
        SurfaceRuleRegistry.ensureStaticallyLoaded();


        WorldConfig.registerModCache(WorldsTogether.MOD_ID);
        WorldPresets.ensureStaticallyLoaded();
    }

    public static ResourceLocation makeID(String s) {
        return new ResourceLocation(MOD_ID, s);
    }
}
