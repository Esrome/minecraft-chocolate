package esrome.mcchoc;

import esrome.mcchoc.capabilities.CapabilityHandler;
import esrome.mcchoc.proxy.ServerProxy;
import esrome.mcchoc.util.Reference;
import esrome.mcchoc.util.handlers.RegistryHandler;
import esrome.mcchoc.util.handlers.SmeltingHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class MinecraftChocolate {

	public static final CreativeTabs BUILDING_BLOCKS = new MCChocBuildingBlocks("mcChocBuildingBlocksTab");
	public static final CreativeTabs REDSTONE = new MCChocRedstone("mcChocRedstoneTab");
	public static final CreativeTabs MINECRAFT_CHOCOLATE = new MCChoc("mcChoc");
	public static final CreativeTabs TOOLS = new MCChocTools("mcChocToolsTab");
	public static final CreativeTabs COMBAT = new MCChocCombat("mcChocCombatTab");
	
	@Instance
	public static MinecraftChocolate instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.SERVER)
	public static ServerProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event){
		RegistryHandler.otherRegistries();
		System.out.println("Pre-Initializing Minecraft Chocolate");
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event){
		SmeltingHandler.addRecipes();
		RegistryHandler.initRegistries();
		MinecraftForge.EVENT_BUS.register(CapabilityHandler.class);
		System.out.println("Initializing Minecraft Chocolate");
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event){
		RegistryHandler.postInitRegistries();
		System.out.println("Post-Initializing Minecraft Chocolate");
	}
	
}
