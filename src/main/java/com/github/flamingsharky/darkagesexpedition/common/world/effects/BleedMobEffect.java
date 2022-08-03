package com.github.flamingsharky.darkagesexpedition.common.world.effects;

import java.awt.Color;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class BleedMobEffect extends MobEffect {

	public BleedMobEffect() {
		super(MobEffectCategory.HARMFUL, new Color(38, 13, 7).getRGB());
	}

	@Override
	public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
		pLivingEntity.hurt(DamageSource.GENERIC, (pAmplifier+1));
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
