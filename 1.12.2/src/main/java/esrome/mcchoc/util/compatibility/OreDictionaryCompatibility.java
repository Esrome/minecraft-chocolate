package esrome.mcchoc.util.compatibility;

import esrome.mcchoc.init.ModBlocks;
import esrome.mcchoc.init.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
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
		OreDictionary.registerOre("oreBronze", new ItemStack(ModBlocks.MINECRAFT_CHOCOLATE_ORES, 1, 6));
		OreDictionary.registerOre("oreMagnesium", new ItemStack(ModBlocks.MINECRAFT_CHOCOLATE_ORES, 1, 7));
		OreDictionary.registerOre("oreRoseQuartz", ModBlocks.ROSE_QUARTZ_ORE);
		OreDictionary.registerOre("oreQuartz", ModBlocks.ROSE_QUARTZ_ORE);
		OreDictionary.registerOre("oreMalachite", ModBlocks.MALACHITE_ORE);
		OreDictionary.registerOre("oreQuartz", ModBlocks.MALACHITE_ORE);
		OreDictionary.registerOre("oreCarnelian", ModBlocks.CARNELIAN_ORE);
		OreDictionary.registerOre("oreQuartz", ModBlocks.CARNELIAN_ORE);
		OreDictionary.registerOre("oreTurquoise", ModBlocks.TURQUOISE_ORE);
		OreDictionary.registerOre("oreQuartz", ModBlocks.TURQUOISE_ORE);
		OreDictionary.registerOre("oreAmethyst", ModBlocks.AMETHYST_ORE);
		OreDictionary.registerOre("oreSapphire", ModBlocks.SAPPHIRE_ORE);
		OreDictionary.registerOre("oreRuby", ModBlocks.RUBY_ORE);
		OreDictionary.registerOre("orePeridot", ModBlocks.PERIDOT_ORE);
		
		//blocks
		OreDictionary.registerOre("blockSilver", ModBlocks.SILVER_BLOCK);
		OreDictionary.registerOre("blockLead", ModBlocks.LEAD_BLOCK);
		OreDictionary.registerOre("blockCopper", ModBlocks.COPPER_BLOCK);
		OreDictionary.registerOre("blockSteel", ModBlocks.STEEL_BLOCK);
		OreDictionary.registerOre("blockAluminum", ModBlocks.ALUMINUM_BLOCK);
		OreDictionary.registerOre("blockTitanium", ModBlocks.TITANIUM_BLOCK);
		OreDictionary.registerOre("blockBronze", ModBlocks.BRONZE_BLOCK);
		OreDictionary.registerOre("blockMagnesium", ModBlocks.MAGNESIUM_BLOCK);
		OreDictionary.registerOre("blockAmethyst", ModBlocks.AMETHYST_BLOCK);
		OreDictionary.registerOre("blockRuby", ModBlocks.RUBY_BLOCK);
		OreDictionary.registerOre("blockSapphire", ModBlocks.SAPPHIRE_BLOCK);
		OreDictionary.registerOre("blockPeridot", ModBlocks.PERIDOT_BLOCK);
		OreDictionary.registerOre("blockQuartz", ModBlocks.ROSE_QUARTZ_BLOCK);
		OreDictionary.registerOre("blockQuartz", ModBlocks.MALACHITE_BLOCK);
		OreDictionary.registerOre("blockQuartz", ModBlocks.CARNELIAN_BLOCK);
		OreDictionary.registerOre("blockQuartz", ModBlocks.TURQUOISE_BLOCK);
		OreDictionary.registerOre("blockRoseQuartz", ModBlocks.ROSE_QUARTZ_BLOCK);
		OreDictionary.registerOre("blockCarnelian", ModBlocks.CARNELIAN_BLOCK);
		OreDictionary.registerOre("blockMalachite", ModBlocks.MALACHITE_BLOCK);
		OreDictionary.registerOre("blockTurquoise", ModBlocks.TURQUOISE_BLOCK);
		OreDictionary.registerOre("stairAmethyst", ModBlocks.AMETHYST_STAIRS);
		OreDictionary.registerOre("stairRuby", ModBlocks.RUBY_STAIRS);
		OreDictionary.registerOre("stairSapphire", ModBlocks.SAPPHIRE_STAIRS);
		OreDictionary.registerOre("stairPeridot", ModBlocks.PERIDOT_STAIRS);
		OreDictionary.registerOre("stairQuartz", ModBlocks.ROSE_QUARTZ_STAIRS);
		OreDictionary.registerOre("stairQuartz", ModBlocks.MALACHITE_STAIRS);
		OreDictionary.registerOre("stairQuartz", ModBlocks.CARNELIAN_STAIRS);
		OreDictionary.registerOre("stairQuartz", ModBlocks.TURQUOISE_STAIRS);
		OreDictionary.registerOre("stairRoseQuartz", ModBlocks.ROSE_QUARTZ_STAIRS);
		OreDictionary.registerOre("stairMalachite", ModBlocks.MALACHITE_STAIRS);
		OreDictionary.registerOre("stairCarnelian", ModBlocks.CARNELIAN_STAIRS);
		OreDictionary.registerOre("stairTurquoise", ModBlocks.TURQUOISE_STAIRS);
		OreDictionary.registerOre("pillarQuartz", ModBlocks.ROSE_QUARTZ_PILLAR);
		OreDictionary.registerOre("pillarQuartz", ModBlocks.MALACHITE_PILLAR);
		OreDictionary.registerOre("pillarQuartz", ModBlocks.CARNELIAN_PILLAR);
		OreDictionary.registerOre("pillarQuartz", ModBlocks.TURQUOISE_PILLAR);
		OreDictionary.registerOre("pillarRoseQuartz", ModBlocks.ROSE_QUARTZ_PILLAR);
		OreDictionary.registerOre("pillarMalachite", ModBlocks.MALACHITE_PILLAR);
		OreDictionary.registerOre("pillarCarnelian", ModBlocks.CARNELIAN_PILLAR);
		OreDictionary.registerOre("pillarTurquoise", ModBlocks.TURQUOISE_PILLAR);
		OreDictionary.registerOre("blockChiseledQuartz", ModBlocks.ROSE_QUARTZ_BLOCK_CHISELED);
		OreDictionary.registerOre("blockChiseledQuartz", ModBlocks.MALACHITE_BLOCK_CHISELED);
		OreDictionary.registerOre("blockChiseledQuartz", ModBlocks.CARNELIAN_BLOCK_CHISELED);
		OreDictionary.registerOre("blockChiseledQuartz", ModBlocks.TURQUOISE_BLOCK_CHISELED);
		OreDictionary.registerOre("blockChiseledRoseQuartz", ModBlocks.ROSE_QUARTZ_BLOCK_CHISELED);
		OreDictionary.registerOre("blockChiseledMalachite", ModBlocks.MALACHITE_BLOCK_CHISELED);
		OreDictionary.registerOre("blockChiseledCarnelian", ModBlocks.CARNELIAN_BLOCK_CHISELED);
		OreDictionary.registerOre("blockChiseledTurquoise", ModBlocks.TURQUOISE_BLOCK_CHISELED);
		
		//ingots
		OreDictionary.registerOre("ingotSilver", ModItems.SILVER_INGOT);
		OreDictionary.registerOre("ingotLead", ModItems.LEAD_INGOT);
		OreDictionary.registerOre("ingotCopper", ModItems.COPPER_INGOT);
		OreDictionary.registerOre("ingotSteel", ModItems.STEEL_INGOT);
		OreDictionary.registerOre("ingotAluminum", ModItems.ALUMINUM_INGOT);
		OreDictionary.registerOre("ingotTitanium", ModItems.TITANIUM_INGOT);
		OreDictionary.registerOre("ingotBronze", ModItems.BRONZE_INGOT);
		
		//crystals
		OreDictionary.registerOre("gemQuartz", ModItems.ROSE_QUARTZ);
		OreDictionary.registerOre("gemRoseQuartz", ModItems.ROSE_QUARTZ);
		OreDictionary.registerOre("gemQuartz", ModItems.MALACHITE);
		OreDictionary.registerOre("gemMalachite", ModItems.MALACHITE);
		OreDictionary.registerOre("gemQuartz", ModItems.CARNELIAN);
		OreDictionary.registerOre("gemCarnelian", ModItems.CARNELIAN);
		OreDictionary.registerOre("gemQuartz", ModItems.TURQUOISE);
		OreDictionary.registerOre("gemTurquoise", ModItems.TURQUOISE);
		OreDictionary.registerOre("gemAmethyst", ModItems.AMETHYST);
		OreDictionary.registerOre("gemPeridot", ModItems.PERIDOT);
		OreDictionary.registerOre("gemRuby", ModItems.RUBY);
		OreDictionary.registerOre("gemSapphire", ModItems.SAPPHIRE);
		
		//nuggets
		OreDictionary.registerOre("nuggetSilver", ModItems.SILVER_NUGGGET);
		OreDictionary.registerOre("nuggetLead", ModItems.LEAD_NUGGET);
		OreDictionary.registerOre("nuggetCopper", ModItems.COPPER_NUGGET);
		OreDictionary.registerOre("nuggetSteel", ModItems.STEEL_NUGGET);
		OreDictionary.registerOre("nuggetAluminum", ModItems.ALUMINUM_NUGGET);
		OreDictionary.registerOre("nuggetTitanium", ModItems.TITANIUM_NUGGET);
		OreDictionary.registerOre("nuggetBronze", ModItems.BRONZE_NUGGET);
		OreDictionary.registerOre("nuggetMagnesium", ModItems.MAGNESIUM_NUGGET);
		
		//swords
		OreDictionary.registerOre("swordSilver", ModItems.SILVER_SWORD);
		OreDictionary.registerOre("swordLead", ModItems.LEAD_SWORD);
		OreDictionary.registerOre("swordCopper", ModItems.COPPER_SWORD);
		OreDictionary.registerOre("swordSteel", ModItems.STEEL_SWORD);
		OreDictionary.registerOre("swordAluminum", ModItems.ALUMINUM_SWORD);
		OreDictionary.registerOre("swordTitanium", ModItems.TITANIUM_SWORD);
		OreDictionary.registerOre("swordBronze", ModItems.BRONZE_SWORD);
		OreDictionary.registerOre("swordMagnesium", ModItems.MAGNESIUM_SWORD);
		
		//axes
		OreDictionary.registerOre("axeSilver", ModItems.SILVER_AXE);
		OreDictionary.registerOre("axeLead", ModItems.LEAD_AXE);
		OreDictionary.registerOre("axeCopper", ModItems.COPPER_AXE);
		OreDictionary.registerOre("axeSteel", ModItems.STEEL_AXE);
		OreDictionary.registerOre("axeAluminum", ModItems.ALUMINUM_AXE);
		OreDictionary.registerOre("axeTitanium", ModItems.TITANIUM_AXE);
		OreDictionary.registerOre("axeBronze", ModItems.BRONZE_AXE);
		OreDictionary.registerOre("axeMagnesium", ModItems.MAGNESIUM_AXE);
		
		//pickaxes
		OreDictionary.registerOre("pickaxeSilver", ModItems.SILVER_PICKAXE);
		OreDictionary.registerOre("pickaxeLead", ModItems.LEAD_PICKAXE);
		OreDictionary.registerOre("pickaxeCopper", ModItems.COPPER_PICKAXE);
		OreDictionary.registerOre("pickaxeSteel", ModItems.STEEL_PICKAXE);
		OreDictionary.registerOre("pickaxeAluminum", ModItems.ALUMINUM_PICKAXE);
		OreDictionary.registerOre("pickaxeTitanium", ModItems.TITANIUM_PICKAXE);
		OreDictionary.registerOre("pickaxeBronze", ModItems.BRONZE_PICKAXE);
		OreDictionary.registerOre("pickaxeMagnesium", ModItems.MAGNESIUM_PICKAXE);
		
		//shovels
		OreDictionary.registerOre("spadeSilver", ModItems.SILVER_SPADE);
		OreDictionary.registerOre("spadeLead", ModItems.LEAD_SPADE);
		OreDictionary.registerOre("spadeCopper", ModItems.COPPER_SPADE);
		OreDictionary.registerOre("spadeSteel", ModItems.STEEL_SPADE);
		OreDictionary.registerOre("spadeAluminum", ModItems.ALUMINUM_SPADE);
		OreDictionary.registerOre("spadeTitanium", ModItems.TITANIUM_SPADE);
		OreDictionary.registerOre("spadeBronze", ModItems.BRONZE_SPADE);
		OreDictionary.registerOre("spadeMagnesium", ModItems.MAGNESIUM_SPADE);
		
		//hoes
		OreDictionary.registerOre("hoeSilver", ModItems.SILVER_HOE);
		OreDictionary.registerOre("hoeLead", ModItems.LEAD_HOE);
		OreDictionary.registerOre("hoeCoper", ModItems.COPPER_HOE);
		OreDictionary.registerOre("hoeSteel", ModItems.STEEL_HOE);
		OreDictionary.registerOre("hoeAluminum", ModItems.ALUMINUM_HOE);
		OreDictionary.registerOre("hoeTitanium", ModItems.TITANIUM_HOE);
		OreDictionary.registerOre("hoeBronze", ModItems.BRONZE_HOE);
		OreDictionary.registerOre("hoeMagnesium", ModItems.MAGNESIUM_HOE);
		
		//helmets
		OreDictionary.registerOre("helmetSilver", ModItems.SILVER_HELMET);
		OreDictionary.registerOre("helmetLead", ModItems.LEAD_HELMET);
		OreDictionary.registerOre("helmetCopper", ModItems.COPPER_HELMET);
		OreDictionary.registerOre("helmetSteel", ModItems.STEEL_HELMET);
		OreDictionary.registerOre("helmetAluminum", ModItems.ALUMINUM_HELMET);
		OreDictionary.registerOre("helmetTitanium", ModItems.TITANIUM_HELMET);
		OreDictionary.registerOre("hlemetBronze", ModItems.BRONZE_HELMET);
		OreDictionary.registerOre("helmetMagnesium", ModItems.MAGNESIUM_HELMET);
		
		//chestplates"
		OreDictionary.registerOre("chestplateSilver", ModItems.SILVER_CHESTPLATE);
		OreDictionary.registerOre("chestplateLead", ModItems.LEAD_CHESTPLATE);
		OreDictionary.registerOre("chesptlateCopper", ModItems.COPPER_CHESTPLATE);
		OreDictionary.registerOre("chestplateSteel", ModItems.STEEL_CHESTPLATE);
		OreDictionary.registerOre("chestplateAluminum", ModItems.ALUMINUM_CHESTPLATE);
		OreDictionary.registerOre("chestplateTitanium", ModItems.TITANIUM_CHESTPLATE);
		OreDictionary.registerOre("chestplateBronze", ModItems.BRONZE_CHESTPLATE);
		OreDictionary.registerOre("chestplateMagnesium", ModItems.MAGNESIUM_CHESTPLATE);
		
		//leggings
		OreDictionary.registerOre("leggingsSilver", ModItems.SILVER_LEGGINGS);
		OreDictionary.registerOre("leggingsLead", ModItems.LEAD_LEGGINGS);
		OreDictionary.registerOre("leggingsCopper", ModItems.COPPER_LEGGINGS);
		OreDictionary.registerOre("leggingsSteel", ModItems.STEEL_LEGGINGS);
		OreDictionary.registerOre("leggingsAluminum", ModItems.ALUMINUM_LEGGINGS);
		OreDictionary.registerOre("leggingsTitanium", ModItems.TITANIUM_LEGGINGS);
		OreDictionary.registerOre("leggingsBronze", ModItems.BRONZE_LEGGINGS);
		OreDictionary.registerOre("leggingsMagnesium", ModItems.MAGNESIUM_LEGGINGS);
		
		//boots
		OreDictionary.registerOre("bootsSilver", ModItems.SILVER_BOOTS);
		OreDictionary.registerOre("bootsLead", ModItems.LEAD_BOOTS);
		OreDictionary.registerOre("bootsCopper", ModItems.COPPER_BOOTS);
		OreDictionary.registerOre("bootsSteel", ModItems.STEEL_BOOTS);
		OreDictionary.registerOre("bootsAluminum", ModItems.ALUMINUM_BOOTS);
		OreDictionary.registerOre("bootsTitanium", ModItems.TITANIUM_BOOTS);
		OreDictionary.registerOre("bootsBronze", ModItems.BRONZE_BOOTS);
		OreDictionary.registerOre("bootsMagnesium", ModItems.MAGNESIUM_BOOTS);
		
		//miscellaneous
		OreDictionary.registerOre("chocolate", ModItems.CHOCOLATE);
		
	}
	
}
