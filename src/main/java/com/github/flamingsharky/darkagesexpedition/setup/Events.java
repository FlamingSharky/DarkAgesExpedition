package com.github.flamingsharky.darkagesexpedition.setup;

import com.github.flamingsharky.darkagesexpedition.DAEMod;
import com.github.flamingsharky.darkagesexpedition.world.DAEOreGen;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid=DAEMod.MOD_ID)
public class Events {

	@SubscribeEvent
	public static void biomeLoadEvent(final BiomeLoadingEvent e) {
		DAEOreGen.generateOres(e);
	}
}
