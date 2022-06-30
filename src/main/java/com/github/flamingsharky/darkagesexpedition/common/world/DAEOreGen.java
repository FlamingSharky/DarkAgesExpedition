package com.github.flamingsharky.darkagesexpedition.common.world;

import java.util.List;

import com.github.flamingsharky.darkagesexpedition.common.registries.DABlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class DAEOreGen {

	public static final List<OreConfiguration.TargetBlockState> OVERWORLD_SANCTUM = List.of(
			OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, DABlocks.SANCTUM_ORE.get().defaultBlockState()),
			OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, DABlocks.DEEPSLATE_SANCTUM_ORE.get().defaultBlockState())
			);
	
	public static final List<OreConfiguration.TargetBlockState> OVERWORLD_VENEUM = List.of(
			OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, DABlocks.VENEUM_ORE.get().defaultBlockState()),
			OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, DABlocks.DEEPSLATE_VENEUM_ORE.get().defaultBlockState())
			);
	
	public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SANCTUM_ORE_GEN_CONFIG = FeatureUtils.register("dae_sactum_ore_config", Feature.ORE,
			new OreConfiguration(OVERWORLD_SANCTUM, 5));
	
	public static final Holder<ConfiguredFeature<OreConfiguration, ?>> VENEUM_ORE_GEN_CONFIG = FeatureUtils.register("dae_veneum_ore_config", Feature.ORE, 
			new OreConfiguration(OVERWORLD_VENEUM, 8));
	
	public static final Holder<PlacedFeature> SANCTUM_ORE_GEN = PlacementUtils.register("dae_sanctum_ore_gen", SANCTUM_ORE_GEN_CONFIG,
			DAEOrePlacementHelper.commonOrePlacement(5, HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(7)))); 
	
	public static final Holder<PlacedFeature> VENEUM_ORE_GEN = PlacementUtils.register("dae_veneum_ore_gen", VENEUM_ORE_GEN_CONFIG, 
			DAEOrePlacementHelper.commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.absolute(3), VerticalAnchor.absolute(55))));
	
	
	
	public static void generateOres(final BiomeLoadingEvent e) {
		List<Holder<PlacedFeature>> base = e.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);
		
		base.add(SANCTUM_ORE_GEN);
		base.add(VENEUM_ORE_GEN);
	}
}
