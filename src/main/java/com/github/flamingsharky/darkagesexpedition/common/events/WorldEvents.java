package com.github.flamingsharky.darkagesexpedition.common.events;

import java.util.Random;

import com.github.flamingsharky.darkagesexpedition.DAExpedition;
import com.github.flamingsharky.darkagesexpedition.common.registries.DAMobEffects;
import com.github.flamingsharky.darkagesexpedition.common.world.DAEOreGen;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
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
	
	@SubscribeEvent
	public static void livingSpawnEvent(final LivingSpawnEvent.CheckSpawn event) {
		Random rand = new Random();
		if(rand.nextInt(100)+1 <= 5) {
			LivingEntity ent = event.getEntityLiving();
			ItemStack helmet;
			ItemStack chestplate;
			ItemStack leggings;
			ItemStack boots;
			if(ent instanceof Mob) {
				if(rand.nextDouble() >= 0.5) {
					helmet = rand.nextBoolean() ? new ItemStack(Items.NETHERITE_HELMET) : null;
					chestplate = rand.nextBoolean() ? new ItemStack(Items.NETHERITE_CHESTPLATE) : null;
					leggings = rand.nextBoolean() ? new ItemStack(Items.NETHERITE_LEGGINGS) : null;
					boots = rand.nextBoolean() ? new ItemStack(Items.NETHERITE_BOOTS) : null;
				}else {
					helmet = rand.nextBoolean() ? new ItemStack(Items.CHAINMAIL_HELMET) : null;
					chestplate = rand.nextBoolean() ? new ItemStack(Items.CHAINMAIL_CHESTPLATE) : null;
					leggings = rand.nextBoolean() ? new ItemStack(Items.CHAINMAIL_LEGGINGS) : null;
					boots = rand.nextBoolean() ? new ItemStack(Items.CHAINMAIL_BOOTS) : null;
				}
				if(helmet != null) {
					ent.setItemSlot(EquipmentSlot.HEAD, helmet);
				}
				if(chestplate != null) {
					ent.setItemSlot(EquipmentSlot.CHEST, chestplate);
				}
				if(leggings != null) {
					ent.setItemSlot(EquipmentSlot.LEGS, leggings);
				}
				if(boots != null) {
					ent.setItemSlot(EquipmentSlot.FEET, boots);
				}
			}
		}
		
	}
}
