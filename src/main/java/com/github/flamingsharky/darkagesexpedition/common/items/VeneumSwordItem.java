package com.github.flamingsharky.darkagesexpedition.common.items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;

public class VeneumSwordItem extends SwordItem {
    public VeneumSwordItem(int attackDamageModifier, float attackSpeedModifier, Properties properties) {
        super(WeaponTiers.VENEUM, attackDamageModifier, attackSpeedModifier, properties);
    }
    
    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (attacker.getRandom().nextFloat() <= 0.2f) {
            if (target.getActiveEffects().stream().anyMatch(inst -> inst.getEffect() == MobEffects.POISON && inst.getAmplifier() == 0)) {
                target.addEffect(new MobEffectInstance(MobEffects.POISON, 60, 1));
            } else if (target.getActiveEffects().stream().anyMatch(inst -> inst.getEffect() == MobEffects.POISON && inst.getAmplifier() == 1)) {
                target.addEffect(new MobEffectInstance(MobEffects.POISON, 60, 2));
            } else {
                target.addEffect(new MobEffectInstance(MobEffects.POISON, 60));
            }
        }
        return super.hurtEnemy(stack, target, attacker);
    }
}
