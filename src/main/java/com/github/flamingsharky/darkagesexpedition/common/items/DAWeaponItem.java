package com.github.flamingsharky.darkagesexpedition.common.items;

import com.github.flamingsharky.darkagesexpedition.common.registries.DAMobEffects;
import com.github.flamingsharky.darkagesexpedition.utils.WeaponAttributes;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Spider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraftforge.common.ToolActions;

public class DAWeaponItem extends SwordItem {
	
	private final Tier tier;
	private final WeaponAttributes attributes;

	public DAWeaponItem(final Tier pTier, final WeaponAttributes attr, Properties pProperties) {
		super(pTier, attr.getDamage(), attr.getAttackSpeed(), pProperties);
		this.tier = pTier;
		this.attributes = attr;
	}
	
	@Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
		if(attributes == WeaponAttributes.DAGGER) {
			int bleedChance = 15;
			for(ItemStack i : target.getArmorSlots()) {
				if(!i.isEmpty()) {
					bleedChance -= 2;
				}
			}
			if(attacker.getRandom().nextInt(100) + 1 <= bleedChance) {
				target.addEffect(new MobEffectInstance(DAMobEffects.BLEED_EFFECT.get(), 3, 1));
			}
		}
    	if(tier == WeaponTiers.SANCTUM && target instanceof Spider) {
            target.hurt(attacker instanceof Player ? DamageSource.playerAttack((Player) attacker) : DamageSource.mobAttack(attacker), 2.5f);
    	}else if(tier == WeaponTiers.VENEUM && attacker.getRandom().nextFloat() <= 0.2f) {
    		MobEffectInstance instance = target.getEffect(MobEffects.POISON);
    		if(instance != null) {
    			if(instance.getAmplifier() == 0) {
    				target.addEffect(new MobEffectInstance(MobEffects.POISON, 60, 1));
    			}else if(instance.getAmplifier() == 1) {
    				target.addEffect(new MobEffectInstance(MobEffects.POISON, 60, 2));
    			}else {
    				target.addEffect(new MobEffectInstance(MobEffects.POISON, 60));
    			}
    		}
//    		if (target.getActiveEffects().stream().anyMatch(inst -> inst.getEffect() == MobEffects.POISON && inst.getAmplifier() == 0)) {
//                target.addEffect(new MobEffectInstance(MobEffects.POISON, 60, 1));
//            } else if (target.getActiveEffects().stream().anyMatch(inst -> inst.getEffect() == MobEffects.POISON && inst.getAmplifier() == 1)) {
//                target.addEffect(new MobEffectInstance(MobEffects.POISON, 60, 2));
//            } else {
//                target.addEffect(new MobEffectInstance(MobEffects.POISON, 60));
//            }
    	}
        return super.hurtEnemy(stack, target, attacker);
    }
	
	@Override
    public boolean canPerformAction(ItemStack stack, net.minecraftforge.common.ToolAction toolAction) {
    	if(attributes.shouldSwipe()) {
    		return net.minecraftforge.common.ToolActions.DEFAULT_SWORD_ACTIONS.contains(toolAction);
    	}else {
    		return toolAction == ToolActions.SWORD_DIG;
    	}
    }

}
