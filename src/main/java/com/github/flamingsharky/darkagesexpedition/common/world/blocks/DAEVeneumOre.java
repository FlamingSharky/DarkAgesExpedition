package com.github.flamingsharky.darkagesexpedition.common.world.blocks;


import java.awt.Color;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class DAEVeneumOre extends Block {

	public DAEVeneumOre(Properties prop) {
		super(prop);
	}
	
	@Override
	public void playerWillDestroy(Level pLevel, BlockPos pPos, BlockState pState, Player pPlayer) {
		AreaEffectCloud cloud = new AreaEffectCloud(pLevel, pPos.getX(), pPos.getY(), pPos.getZ());
		cloud.setRadius(1.0F);
		cloud.setWaitTime(10);
		cloud.setRadiusPerTick(-cloud.getRadius() / (float)cloud.getDuration());
		cloud.setFixedColor(new Color(90, 138, 62).getRGB());
		cloud.addEffect(new MobEffectInstance(MobEffects.POISON, 60));
		
		pLevel.addFreshEntity(cloud);		
		super.playerWillDestroy(pLevel, pPos, pState, pPlayer);
	}

}
