package esrome.mcchoc.util.compatibility;

import esrome.mcchoc.init.ModBlocks;
import esrome.mcchoc.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryCompatibility {

	public static void registerOres(){
		//ores
		OreDictionary.registerOre("oreSilver", new ItemStack(ModBlocks.MINECRAFT_CHOCOLATE_ORES, 1, 0));
		OreDictionary.registerOre("oreLead", new ItemStack(ModBlocks.MINECRAFT_CHOCOLATE_ORES, 1, 1));
		OreDictionary.registerOre("oreCopper", new ItemStack(ModBlocks.MINECRAFT_CHOCOLATE_ORES, 1, 2));
		OreDictionary.registerOre("oreSteel", new ItemStack(ModBlocks.MINECRAFT_CHOCOLATE_ORES, 1, 3));
		OreDictionary.registerOre("oreAluminum", new ItemStack(ModBlocks.MINECRAFT_CHOCOLATE_ORES, 1, 4));
		OreDictionary.registerOre("oreTitanium", new ItemStack(ModBlocks.MINECRAFT_CHOCOLATE_ORES, 1, 5));
		OreDictionary.registerOre("orePlatinum", new ItemStack(ModBlocks.MINECRAFT_CHOCOLATE_ORES, 1, 6));
		OreDictionary.registerOre("oreMagnesium", new ItemStack(ModBlocks.MINECRAFT_CHOCOLATE_ORES, 1, 7));
		OreDictionary.registerOre("oreChromium", new ItemStack(ModBlocks.MINECRAFT_CHOCOLATE_ORES, 1, 8));
		OreDictionary.registerOre("oreUranium", new ItemStack(ModBlocks.MINECRAFT_CHOCOLATE_ORES, 1, 9));
		OreDictionary.registerOre("oreOsmium", new ItemStack(ModBlocks.MINECRAFT_CHOCOLATE_ORES, 1, 10));
		OreDictionary.registerOre("orePlutonium", new ItemStack(ModBlocks.MINECRAFT_CHOCOLATE_ORES, 1, 11));
		OreDictionary.registerOre("orePalladium", new ItemStack(ModBlocks.MINECRAFT_CHOCOLATE_ORES, 1, 12));
		OreDictionary.registerOre("oreTungsten", new ItemStack(ModBlocks.MINECRAFT_CHOCOLATE_ORES, 1, 13));
		OreDictionary.registerOre("oreNickel", new ItemStack(ModBlocks.MINECRAFT_CHOCOLATE_ORES, 1, 14));
		OreDictionary.registerOre("oreBismuth", new ItemStack(ModBlocks.MINECRAFT_CHOCOLATE_ORES, 1, 15));
		//blocks
		OreDictionary.registerOre("blockSilver", ModBlocks.SILVER_BLOCK);
		OreDictionary.registerOre("blockLead", ModBlocks.LEAD_BLOCK);
		OreDictionary.registerOre("blockCopper", ModBlocks.COPPER_BLOCK);
		OreDictionary.registerOre("blockSteel", ModBlocks.STEEL_BLOCK);
		
		//ingots
		OreDictionary.registerOre("ingotSilver", ModItems.SILVER_INGOT);
		OreDictionary.registerOre("ingotLead", ModItems.LEAD_INGOT);
		OreDictionary.registerOre("ingotCopper", ModItems.COPPER_INGOT);
		OreDictionary.registerOre("ingotSteel", ModItems.STEEL_INGOT);
		
		//nuggets
		
		//swords
		
		//axes
		
		//pickaxes
		
		//shovels
		
		//hoes
	}
	
}
