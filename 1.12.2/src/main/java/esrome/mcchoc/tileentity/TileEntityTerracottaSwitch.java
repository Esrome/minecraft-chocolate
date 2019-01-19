package esrome.mcchoc.tileentity;

import net.minecraft.block.BlockLever;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TileEntityTerracottaSwitch extends TileEntity {

	public EnumDyeColor color;
	public BlockLever.EnumOrientation facing;
	public boolean powered;
	
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		this.color = EnumDyeColor.byMetadata(compound.getInteger("color"));
		this.facing = BlockLever.EnumOrientation.byMetadata(compound.getInteger("facing"));
		this.powered = compound.getBoolean("powered");
		super.readFromNBT(compound);
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) {
		compound.setInteger("color", color.getMetadata());
		compound.setInteger("facing", facing.getMetadata());
		compound.setBoolean("powered", powered);
		return super.writeToNBT(compound);
	}
	
	@Override
	public boolean shouldRefresh(World world, BlockPos pos, IBlockState oldState, IBlockState newState)
	{
		return (oldState.getBlock() != newState.getBlock());
	}
	
}
