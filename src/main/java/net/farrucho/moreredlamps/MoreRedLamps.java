package net.farrucho.moreredlamps;

import net.fabricmc.api.ModInitializer;
import net.farrucho.moreredlamps.block.MoreRedLampsBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreRedLamps implements ModInitializer {
	public static final String MOD_ID = "moreredlamps";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		MoreRedLampsBlocks.registerModBlock();
	}
}
