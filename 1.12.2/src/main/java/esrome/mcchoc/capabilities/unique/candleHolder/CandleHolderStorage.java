package esrome.mcchoc.capabilities.unique.candleHolder;

import esrome.mcchoc.capabilities.thirst.IThirst;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTPrimitive;
import net.minecraft.nbt.NBTTagFloat;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;

public class CandleHolderStorage implements IStorage<ICandleHolder> {

	@Override 
	public NBTBase writeNBT(Capability<ICandleHolder> capability, ICandleHolder instance, EnumFacing side) 
	{ 
		return new NBTTagFloat(instance.getCandle()); 
	} 

	@Override 
	public void readNBT(Capability<ICandleHolder> capability, ICandleHolder instance, EnumFacing side, NBTBase nbt) 
	{ 
		instance.setCandle(((NBTPrimitive) nbt).getFloat()); 
	}
	
}
