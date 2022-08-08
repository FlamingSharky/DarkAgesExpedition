package com.github.flamingsharky.darkagesexpedition.common.registries;

import com.github.flamingsharky.darkagesexpedition.DAExpedition;
import com.github.flamingsharky.darkagesexpedition.common.effects.BleedMobEffect;
import com.github.flamingsharky.darkagesexpedition.common.effects.PlagueMobEffect;

import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DAMobEffects {
	public static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, DAExpedition.MOD_ID);
	
	public static final RegistryObject<MobEffect> BLEED_EFFECT = EFFECTS.register("bleed", () -> new BleedMobEffect());
	public static final RegistryObject<MobEffect> PLAGUE_EFFECT = EFFECTS.register("plague", () -> new PlagueMobEffect());
	
	
}
