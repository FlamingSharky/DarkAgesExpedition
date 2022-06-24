package com.github.flamingsharky.darkagesexpedition.items;

import com.github.flamingsharky.darkagesexpedition.setup.Weapon_Tiers;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;

public class VeneumWarAxeItem extends AxeItem {
    public VeneumWarAxeItem(int attackDamageModifier, float attackSpeedModifier, Properties properties) {
        super(Weapon_Tiers.VENEUM, attackDamageModifier, attackSpeedModifier, properties);
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
