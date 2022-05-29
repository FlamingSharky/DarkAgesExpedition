package com.github.flamingsharky.darkagesexpedition.worldgen;

import com.github.flamingsharky.darkagesexpedition.worldgen.ores.OreGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class WorldGenEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        OreGeneration.generateOres(event);
    }
}
