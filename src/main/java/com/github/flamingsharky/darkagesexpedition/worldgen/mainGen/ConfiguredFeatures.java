package com.github.flamingsharky.darkagesexpedition.worldgen.mainGen;

import com.github.flamingsharky.darkagesexpedition.setup.Registration;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

import java.util.List;

public class ConfiguredFeatures {
    public static final List<OreConfiguration.TargetBlockState> SANCTUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, Registration.SANCTUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, Registration.DEEPSLATE_SANCTUM_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SANCTUM_ORE = FeatureUtils.register("sanctum_ore",
            Feature.ORE, new OreConfiguration(SANCTUM_ORES, 6));

    public static final List<OreConfiguration.TargetBlockState> VENEUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, Registration.VENEUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, Registration.DEEPSLATE_VENEUM_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> VENEUM_ORE = FeatureUtils.register("sanctum_ore",
            Feature.ORE, new OreConfiguration(VENEUM_ORES, 6));

}
