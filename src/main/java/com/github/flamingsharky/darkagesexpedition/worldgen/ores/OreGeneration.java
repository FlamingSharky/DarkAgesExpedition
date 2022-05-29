package com.github.flamingsharky.darkagesexpedition.worldgen.ores;

import com.github.flamingsharky.darkagesexpedition.worldgen.mainGen.PlacementFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class OreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(PlacementFeatures.SANCTUM_ORE_PLACEMENT);
        base.add(PlacementFeatures.VENEUM_ORE_PLACEMENT);
    }
}
