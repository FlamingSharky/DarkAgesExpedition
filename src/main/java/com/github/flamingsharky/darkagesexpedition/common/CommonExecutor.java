package com.github.flamingsharky.darkagesexpedition.common;

import com.github.flamingsharky.darkagesexpedition.common.registries.DATags;
import com.github.flamingsharky.darkagesexpedition.utils.ISidedExecutor;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class CommonExecutor implements ISidedExecutor {
    @Override
    public void setup() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        DATags.setup();
    }
    
    public void commonSetup(FMLCommonSetupEvent event) {
    
    }
}
