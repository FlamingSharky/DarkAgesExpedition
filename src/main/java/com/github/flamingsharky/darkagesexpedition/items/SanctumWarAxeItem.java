package com.github.flamingsharky.darkagesexpedition.items;

import com.github.flamingsharky.darkagesexpedition.setup.Weapon_Tiers;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Spider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;

public class SanctumWarAxeItem extends AxeItem {
    public SanctumWarAxeItem(float attackDamageModifier, float attackSpeedModifier, Properties properties) {
        super(Weapon_Tiers.SANCTUM, attackDamageModifier, attackSpeedModifier, properties);
    }
    
    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (target instanceof Spider) {
            target.hurt(attacker instanceof Player ? DamageSource.playerAttack((Player) attacker) : DamageSource.mobAttack(attacker), 2.5f);
        }
        return super.hurtEnemy(stack, target, attacker);
    }
}
