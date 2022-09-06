package io.github.aknell.hellstone.common.world.feature;

import net.minecraft.util.Holder;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.*;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacementModifier;
import net.minecraft.world.gen.feature.util.PlacedFeatureUtil;

import java.util.List;

public class HellstonePlacedFeatures {

	public static final Holder<PlacedFeature> HELLSTONE_ORE_PLACED;
	public static final Holder<PlacedFeature> MYTHRIL_ORE_PLACED;

	private static List<PlacementModifier> orePlacementModifiers(PlacementModifier firstModifier, PlacementModifier secondModifier) {
		return List.of(firstModifier, InSquarePlacementModifier.getInstance(), secondModifier, BiomePlacementModifier.getInstance());
	}

	private static List<PlacementModifier> commonOrePlacementModifiers(int count, PlacementModifier modifier) {
		return orePlacementModifiers(CountPlacementModifier.create(count), modifier);
	}

	private static List<PlacementModifier> rareOrePlacementModifiers(int chance, PlacementModifier modifier) {
		return orePlacementModifiers(RarityFilterPlacementModifier.create(chance), modifier);
	}

	static {
		HELLSTONE_ORE_PLACED = PlacedFeatureUtil.register("ore_hellstone_nether", HellstoneConfiguredFeatures.HELLSTONE_ORE,
				commonOrePlacementModifiers(9, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(8), YOffset.aboveBottom(24))));
		MYTHRIL_ORE_PLACED = PlacedFeatureUtil.register("ore_mythril_end", HellstoneConfiguredFeatures.MYTHRIL_ORE,
				commonOrePlacementModifiers(9, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
	}

}
