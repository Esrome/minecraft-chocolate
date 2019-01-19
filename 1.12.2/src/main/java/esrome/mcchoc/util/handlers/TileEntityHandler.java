package esrome.mcchoc.util.handlers;

import esrome.mcchoc.tileentity.TileEntityJackOLantern;
import esrome.mcchoc.tileentity.TileEntityTerracottaSwitch;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler {

	public static void registerTileEntities(){
		GameRegistry.registerTileEntity(TileEntityJackOLantern.class, "tile_entity_jack_o_lantern");
		GameRegistry.registerTileEntity(TileEntityTerracottaSwitch.class, "tile_entity_terracotta_switch");
	}
	
}
