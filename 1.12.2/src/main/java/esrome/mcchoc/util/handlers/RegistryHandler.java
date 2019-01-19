package esrome.mcchoc.util.handlers;

import esrome.mcchoc.MinecraftChocolate;
import esrome.mcchoc.capabilities.thirst.IThirst;
import esrome.mcchoc.capabilities.thirst.Thirst;
import esrome.mcchoc.capabilities.thirst.ThirstStorage;
import esrome.mcchoc.init.ModBlocks;
import esrome.mcchoc.init.ModItems;
import esrome.mcchoc.init.ModPotions;
import esrome.mcchoc.util.IHasModel;
import esrome.mcchoc.util.compatibility.OreDictionaryCompatibility;
import esrome.mcchoc.world.gen.WorldGenMetalOres;
import esrome.mcchoc.world.gen.structures.WorldGenChocolateStructures;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RegistryHandler {

	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event){
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
		TileEntityHandler.registerTileEntities();
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event){
		for(Item item : ModItems.ITEMS){
			if(item instanceof IHasModel){
				((IHasModel)item).registerModels();
			}
		}
		for(Block block : ModBlocks.BLOCKS){
			if(block instanceof IHasModel){
				((IHasModel)block).registerModels();
			}
		}
	}
	
	public static void otherRegistries(){
		CapabilityManager.INSTANCE.register(IThirst.class, new ThirstStorage(), Thirst.class);
		GameRegistry.registerWorldGenerator(new WorldGenMetalOres(), 0);
		GameRegistry.registerWorldGenerator(new WorldGenChocolateStructures(), 0);
		ModPotions.registerPotions();
	}
	
	public static void initRegistries(){
		NetworkRegistry.INSTANCE.registerGuiHandler(MinecraftChocolate.instance, new GUIHandler());
		OreDictionaryCompatibility.registerOres();
	}
	
	public static void postInitRegistries() {
		BehaviorHandler.registerDispensorBehavior();
	}
	
}
