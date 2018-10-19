package esrome.mcchoc.capabilities.thirst;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTPrimitive;
import net.minecraft.nbt.NBTTagFloat;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;

public class ThirstStorage implements IStorage<IThirst>{

	@Override 
	public NBTBase writeNBT(Capability<IThirst> capability, IThirst instance, EnumFacing side) 
	{ 
		return new NBTTagFloat(instance.getThirst()); 
	} 

	@Override 
	public void readNBT(Capability<IThirst> capability, IThirst instance, EnumFacing side, NBTBase nbt) 
	{ 
		instance.setThirst(((NBTPrimitive) nbt).getFloat()); 
	} 
	
}
