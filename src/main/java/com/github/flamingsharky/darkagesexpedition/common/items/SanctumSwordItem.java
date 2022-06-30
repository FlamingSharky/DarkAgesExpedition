package com.github.flamingsharky.darkagesexpedition.common.items;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Spider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;

public class SanctumSwordItem extends SwordItem {
    public SanctumSwordItem(int damageModifier, float speedModifier, Properties properties) {
        super(WeaponTiers.SANCTUM, damageModifier, speedModifier, properties);
    }
    
    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (target instanceof Spider) {
            target.hurt(attacker instanceof Player ? DamageSource.playerAttack((Player) attacker) : DamageSource.mobAttack(attacker), 2.5f);
        }
        return super.hurtEnemy(stack, target, attacker);
    }
}
