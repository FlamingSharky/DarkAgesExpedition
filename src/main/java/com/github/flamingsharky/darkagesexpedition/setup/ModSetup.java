package com.github.flamingsharky.darkagesexpedition.setup;

import com.github.flamingsharky.darkagesexpedition.worldgen.ores.SanctumOreGen;
import com.github.flamingsharky.darkagesexpedition.worldgen.ores.VeneumOreGen;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class ModSetup {
    public static void setup() {
        IEventBus bus = MinecraftForge.EVENT_BUS;
        bus.addListener(SanctumOreGen::onBiomeLoadingEvent);
        bus.addListener(VeneumOreGen::onBiomeLoadingEvent);
    }

    public static void init(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            SanctumOreGen.registerConfiguredFeatures();
            VeneumOreGen.registerConfiguredFeatures();
        });
    }}
