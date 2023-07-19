package net.jan.moder;

import net.fabricmc.api.ModInitializer;

import net.jan.moder.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {

	public static  final  String MOD_ID = "xviis-century-pirate-addon-";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registeredModItems();
	}
}