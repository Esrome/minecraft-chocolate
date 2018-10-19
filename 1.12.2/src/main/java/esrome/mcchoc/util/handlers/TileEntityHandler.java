package esrome.mcchoc.util.handlers;


import esrome.mcchoc.tileentity.bluestone.TileEntityCoalGenerator;
import esrome.mcchoc.util.Reference;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler {

	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityCoalGenerator.class, Reference.MODID + ":coal_generator");
	}
	
}
