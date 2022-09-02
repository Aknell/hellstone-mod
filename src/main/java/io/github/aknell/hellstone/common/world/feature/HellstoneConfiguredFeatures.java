package io.github.aknell.hellstone.common.world.feature;

import io.github.aknell.hellstone.common.block.HellstoneBlocks;
import net.minecraft.util.Holder;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.util.ConfiguredFeatureUtil;

import java.util.List;

public class HellstoneConfiguredFeatures {

	public static List<OreFeatureConfig.Target> NETHER_HELLSTONE_ORE;

	public static Holder<ConfiguredFeature<OreFeatureConfig, ?>> HELLSTONE_ORE;

	public static void init() {
		NETHER_HELLSTONE_ORE = List.of(
				OreFeatureConfig.createTarget(OreConfiguredFeatures.BASE_STONE_NETHER, HellstoneBlocks.HELLSTONE_ORE.getDefaultState())
		);

		HELLSTONE_ORE = ConfiguredFeatureUtil.register("ore_hellstone", Feature.ORE, new OreFeatureConfig(NETHER_HELLSTONE_ORE, 5));
	}

}
