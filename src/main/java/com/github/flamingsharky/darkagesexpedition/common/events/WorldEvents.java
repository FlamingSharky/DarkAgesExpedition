package com.github.flamingsharky.darkagesexpedition.common.events;

import com.github.flamingsharky.darkagesexpedition.DAExpedition;
import com.github.flamingsharky.darkagesexpedition.common.world.DAEOreGen;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid=DAExpedition.MOD_ID)
public class WorldEvents {

	@SubscribeEvent
	public static void biomeLoadEvent(final BiomeLoadingEvent e) {
		DAEOreGen.generateOres(e);
	}
}
