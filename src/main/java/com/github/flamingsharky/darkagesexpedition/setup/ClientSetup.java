package com.github.flamingsharky.darkagesexpedition.setup;

import com.github.flamingsharky.darkagesexpedition.DAEMod;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = DAEMod.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ClientSetup {
    public static void init(FMLClientSetupEvent event) {

    }
}
