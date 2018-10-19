package esrome.mcchoc.util.handlers;

import esrome.mcchoc.container.bluestone.ContainerCoalGenerator;
import esrome.mcchoc.gui.bluestone.GUICoalGenerator;
import esrome.mcchoc.tileentity.bluestone.TileEntityCoalGenerator;
import esrome.mcchoc.util.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GUIHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.COAL_GENERATOR_GUI) return new ContainerCoalGenerator(player.inventory, (TileEntityCoalGenerator)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.COAL_GENERATOR_GUI) return new GUICoalGenerator(player.inventory, (TileEntityCoalGenerator)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}
	
}
