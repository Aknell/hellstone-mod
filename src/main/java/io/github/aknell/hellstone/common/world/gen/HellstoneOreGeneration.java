package io.github.aknell.hellstone.common.world.gen;

import io.github.aknell.hellstone.common.world.feature.HellstonePlacedFeatures;
import net.minecraft.world.gen.GenerationStep;
import org.quiltmc.qsl.worldgen.biome.api.BiomeModification;
import org.quiltmc.qsl.worldgen.biome.api.BiomeModifications;
import org.quiltmc.qsl.worldgen.biome.api.BiomeSelectors;

public class HellstoneOreGeneration {

	public static void generateOres() {
		BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, HellstonePlacedFeatures.HELLSTONE_ORE_PLACED.getKey().get());
	}

}
