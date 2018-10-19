package esrome.mcchoc.capabilities;

import esrome.mcchoc.capabilities.thirst.IThirst;
import esrome.mcchoc.capabilities.thirst.ThirstProvider;
import esrome.mcchoc.capabilities.unique.candleHolder.CandleHolderProvider;
import esrome.mcchoc.util.Reference;
import net.minecraft.command.ICommand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.CommandEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CapabilityHandler {
	public static final ResourceLocation THIRST_CAP = new ResourceLocation(Reference.MODID, "thirst"); 

	@SubscribeEvent 
	public void attachCapability(AttachCapabilitiesEvent<Entity> event) 
	{ 
		if ((event.getObject() instanceof EntityPlayer)){
			event.addCapability(THIRST_CAP, new ThirstProvider());
		}
	}
	
	@SubscribeEvent 
	public void onPlayerClone(PlayerEvent.Clone event) 
	{ 
		if(!event.isWasDeath()){
			EntityPlayer player = event.getEntityPlayer(); 
			IThirst thirst = player.getCapability(ThirstProvider.THIRST_CAP, null); 
			IThirst oldThirst = event.getOriginal().getCapability(ThirstProvider.THIRST_CAP, null); 

			thirst.setThirst(oldThirst.getThirst()); 
		}
	}
}
