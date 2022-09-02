package io.github.aknell.hellstone.common;

import io.github.aknell.hellstone.common.block.HellstoneBlocks;
import io.github.aknell.hellstone.common.item.HellstoneItems;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HellstoneMod implements ModInitializer {

	public static final String MOD_ID = "hellstone";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Hello Quilt world from {}!", mod.metadata().name());

		HellstoneItems.init();
		HellstoneBlocks.init();

	}

}
