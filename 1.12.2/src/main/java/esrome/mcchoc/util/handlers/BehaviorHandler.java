package esrome.mcchoc.util.handlers;

import esrome.mcchoc.world.event.dispenser.DispenserColourBehaviour;
import net.minecraft.block.BlockDispenser;
import net.minecraft.init.Items;

public class BehaviorHandler {

	public static void registerDispensorBehavior() {
		BlockDispenser.DISPENSE_BEHAVIOR_REGISTRY.putObject(Items.DYE, new DispenserColourBehaviour());
	}
	
}
