package com.github.flamingsharky.darkagesexpedition.common.events;

import java.util.Random;

import com.github.flamingsharky.darkagesexpedition.DAExpedition;
import com.github.flamingsharky.darkagesexpedition.common.registries.DAMobEffects;
import com.github.flamingsharky.darkagesexpedition.common.world.DAEOreGen;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid=DAExpedition.MOD_ID)
public class WorldEvents {

	@SubscribeEvent
	public static void biomeLoadEvent(final BiomeLoadingEvent e) {
		DAEOreGen.generateOres(e);
	}
	
	@SubscribeEvent
	public static void livingEntityHurtEvent(final LivingAttackEvent event) {
		Entity attacker = event.getSource().getEntity();
		
		if(attacker != null && attacker instanceof LivingEntity) {
			LivingEntity attackerLiving = ((LivingEntity)attacker);
			if(attackerLiving.hasEffect(DAMobEffects.PLAGUE_EFFECT.get())) {
				Random rand = new Random();
				if(rand.nextInt(100) + 1 <= 80) {
					event.getEntityLiving().addEffect(new MobEffectInstance(DAMobEffects.PLAGUE_EFFECT.get(), Integer.MAX_VALUE));
				}
			}
		}
	}
}
