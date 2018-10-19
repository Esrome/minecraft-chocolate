package esrome.mcchoc.tileentity.bluestone;

import esrome.mcchoc.blocks.bluestone.BlockComponentCrafter;
import esrome.mcchoc.capabilities.bluestone.BluestoneEnergyStorage;
import esrome.mcchoc.recipes.ComponentCrafterRecipes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public class TileEntityComponentCrafter extends TileEntity implements ITickable {

	private BluestoneEnergyStorage storage = new BluestoneEnergyStorage(1000);
	public ItemStackHandler handler = new ItemStackHandler(10);
	private String customName;
	public int cookTime, energy = storage.getEnergyStored();
	private ItemStack smelting = ItemStack.EMPTY;
	
	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing) 
	{
		if(capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) return true;
		if(capability == CapabilityEnergy.ENERGY) return true;
		else return false;
	}
	
	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing) 
	{
		if(capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) return (T) this.handler;
		if(capability == CapabilityEnergy.ENERGY) return (T)this.storage;
		return super.getCapability(capability, facing);
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound)
	{
		super.writeToNBT(compound);
		compound.setTag("Inventory", this.handler.serializeNBT());
		compound.setInteger("CookTime", cookTime);
		compound.setInteger("GuiEnergy", energy);
		this.storage.writeToNBT(compound);
		compound.setString("Name", getDisplayName().toString());
		return compound;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound) 
	{
		super.readFromNBT(compound);
		this.handler.deserializeNBT(compound.getCompoundTag("Inventory"));
		this.storage.readFromNBT(compound);
		this.cookTime = compound.getInteger("CookTime");
		this.energy = compound.getInteger("GuiEnergy");
		if(compound.hasKey("Name")) this.customName = compound.getString("Name");
	}
	
	@Override
	public void update()
	{
		if(world.isBlockPowered(pos)) energy += 50;
		
		ItemStack[] inputs = new ItemStack[] {handler.getStackInSlot(1), handler.getStackInSlot(2), handler.getStackInSlot(3), handler.getStackInSlot(4), handler.getStackInSlot(5), handler.getStackInSlot(6), handler.getStackInSlot(7), handler.getStackInSlot(8), handler.getStackInSlot(9)};
		
		if(energy >= 5)
		{
			if(cookTime > 0)
			{
				energy -= 5;
				cookTime++;
				BlockComponentCrafter.setState(true, world, pos);
				if(cookTime == 100)
				{
					if(handler.getStackInSlot(0).getCount() > 0)
					{
						handler.getStackInSlot(0).grow(1);
					}
					else
					{
						handler.insertItem(2, smelting, false);
					}
					smelting = ItemStack.EMPTY;
					cookTime = 0;
					return;
				}
			}
			else
			{
				if(!inputs[0].isEmpty() && !inputs[1].isEmpty())
				{
					/*ItemStack output = ComponentCrafterRecipes.getInstance().getSinteringResult(inputs[0], inputs[1]);
					if(!output.isEmpty())
					{
						smelting = output;
						cookTime++;
						inputs[0].shrink(1);
						inputs[1].shrink(1);
						inputs[2].shrink(1);
						inputs[3].shrink(1);
						inputs[4].shrink(1);
						inputs[5].shrink(1);
						inputs[6].shrink(1);
						inputs[7].shrink(1);
						inputs[8].shrink(1);						
						handler.setStackInSlot(0, inputs[0]);
						handler.setStackInSlot(1, inputs[1]);
						energy -= 20;
					}*/
				}
			}
		}
	}
	
	@Override
	public ITextComponent getDisplayName() 
	{
		return new TextComponentTranslation("container.component_crafter");
	}
	
	public int getEnergyStored()
	{
		return this.energy;
	}
	
	public int getMaxEnergyStored()
	{
		return this.storage.getMaxEnergyStored();
	}
	
	public boolean isUsableByPlayer(EntityPlayer player) 
	{
		return this.world.getTileEntity(this.pos) != this ? false : player.getDistanceSq((double)this.pos.getX() + 0.5D, (double)this.pos.getY() + 0.5D, (double)this.pos.getZ() + 0.5D) <= 64.0D;
	}
	
	public int getField(int id) 
	{
		switch(id) 
		{
		case 0:
			return this.cookTime;
		case 1:
			return this.energy;
		default:
			return 0;
		}
	}

	public void setField(int id, int value) 
	{
		switch(id) 
		{
		case 0:
			this.cookTime = value;
			break;
		case 1:
			this.energy = value;
		}
	}
	
}
