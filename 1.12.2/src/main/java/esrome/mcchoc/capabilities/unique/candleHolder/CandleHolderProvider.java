package esrome.mcchoc.capabilities.unique.candleHolder;

import esrome.mcchoc.capabilities.thirst.IThirst;
import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

public class CandleHolderProvider implements ICapabilitySerializable<NBTBase> {
	
	@CapabilityInject(ICandleHolder.class) 
	public static final Capability<ICandleHolder> CANDLE_CAP = null; 

	private ICandleHolder instance = CANDLE_CAP.getDefaultInstance(); 

	@Override 
	public boolean hasCapability(Capability<?> capability, EnumFacing facing) 
	{ 
	return capability == CANDLE_CAP; 
	} 

	@Override 
	public <T> T getCapability(Capability<T> capability, EnumFacing facing) 
	{ 
	return capability == CANDLE_CAP ? CANDLE_CAP.<T> cast(this.instance) : null; 
	} 

	@Override 
	public NBTBase serializeNBT() 
	{ 
		return CANDLE_CAP.getStorage().writeNBT(CANDLE_CAP, this.instance, null); 
	} 

	@Override 
	public void deserializeNBT(NBTBase nbt) 
	{ 
		CANDLE_CAP.getStorage().readNBT(CANDLE_CAP, this.instance, null, nbt); 
	} 
}
