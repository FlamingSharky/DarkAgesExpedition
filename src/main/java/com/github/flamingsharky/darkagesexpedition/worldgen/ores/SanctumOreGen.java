package com.github.flamingsharky.darkagesexpedition.worldgen.ores;

import com.github.flamingsharky.darkagesexpedition.setup.Registration;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class SanctumOreGen {

    public static final int OVERWORLD_VEINSIZE = 1;
    public static final int OVERWORLD_AMOUNT = 1;
    public static final int DEEPSLATE_VEINSIZE = 5;
    public static final int DEEPSLATE_AMOUNT = 3;

    public static PlacedFeature OVERWORLD_OREGEN;
    public static PlacedFeature DEEPSLATE_OREGEN;


    public static void registerConfiguredFeatures() {
        OreConfiguration overworldConfig = new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES,
                Registration.SANCTUM_ORE.get().defaultBlockState(), OVERWORLD_VEINSIZE);
        OVERWORLD_OREGEN = registerPlacedFeature("overworld_mysterious_ore", Feature.ORE.configured(overworldConfig),
                CountPlacement.of(OVERWORLD_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(20)));

        OreConfiguration deepslateConfig = new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,
                Registration.DEEPSLATE_SANCTUM_ORE.get().defaultBlockState(), DEEPSLATE_VEINSIZE);
        DEEPSLATE_OREGEN = registerPlacedFeature("deepslate_mysterious_ore", Feature.ORE.configured(deepslateConfig),
                CountPlacement.of(DEEPSLATE_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(1)));
    }

    private static <C extends FeatureConfiguration, F extends Feature<C>> PlacedFeature registerPlacedFeature(String registryName,
                                                                                                              ConfiguredFeature<C, F> feature, PlacementModifier... placementModifiers) {
        PlacedFeature placed = BuiltinRegistries.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(registryName), feature)
                .placed(placementModifiers);
        return PlacementUtils.register(registryName, placed);
    }

    public static void onBiomeLoadingEvent(BiomeLoadingEvent event) {
        event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OVERWORLD_OREGEN);
        event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, DEEPSLATE_OREGEN);
    }
}
