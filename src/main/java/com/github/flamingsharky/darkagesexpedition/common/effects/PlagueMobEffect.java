package com.github.flamingsharky.darkagesexpedition.common.effects;

import java.awt.Color;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class PlagueMobEffect extends MobEffect {
	
	private int i = 0;
	
	public PlagueMobEffect() {
		super(MobEffectCategory.HARMFUL, new Color(32, 38, 7).getRGB());
	}
	
	@Override
	public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
		if(pLivingEntity instanceof Player) {
			Player player = ((Player)pLivingEntity);
			player.causeFoodExhaustion(0.01F * (pAmplifier+1));
		}
		
		if(pLivingEntity.getHealth() > pAmplifier+1 && i >= 20/(pAmplifier+1)) {
			pLivingEntity.hurt(DamageSource.MAGIC, (pAmplifier+1));
			i = 0;
		}else {
			i++;
		}
	}
	
	@Override
	public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
		int shift = 25 >> pAmplifier;
		if(pDuration % shift == 0) {
			return true;
		}
		return false;
	}

}
