package com.github.flamingsharky.darkagesexpedition.setup;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class ModSetup {
    public static void setup() {
        IEventBus bus = MinecraftForge.EVENT_BUS;

    }

    public static void init(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {

        });
    }}
