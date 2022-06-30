package com.github.flamingsharky.darkagesexpedition.client;

import com.github.flamingsharky.darkagesexpedition.utils.ISidedExecutor;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class ClientExecutor implements ISidedExecutor {
    @Override
    public void setup() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
    }

    public void clientSetup(FMLClientSetupEvent event) {
    
    }
}
