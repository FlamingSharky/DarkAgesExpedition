package com.github.flamingsharky.darkagesexpedition.worldgen.mainGen;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class PlacementFeatures {
    public static final Holder<PlacedFeature> SANCTUM_ORE_PLACEMENT = PlacementUtils.register("sanctum_ore_placement",
            ConfiguredFeatures.SANCTUM_ORE, OrePlacement.commonOrePlacement(4, //<- Veins per chunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(-64))));

    public static final Holder<PlacedFeature> VENEUM_ORE_PLACEMENT = PlacementUtils.register("veneum_ore_placement",
            ConfiguredFeatures.VENEUM_ORE, OrePlacement.commonOrePlacement(5, //<- Veins per chunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(50), VerticalAnchor.aboveBottom(0))));
}
