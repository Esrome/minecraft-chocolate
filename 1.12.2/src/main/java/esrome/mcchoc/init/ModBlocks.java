package esrome.mcchoc.init;

import java.util.ArrayList;
import java.util.List;

import esrome.mcchoc.MinecraftChocolate;
import esrome.mcchoc.blocks.BlockBase;
import esrome.mcchoc.blocks.BlockGlass;
import esrome.mcchoc.blocks.BlockModStairs;
import esrome.mcchoc.blocks.bluestone.BlockBluestoneOre;
import esrome.mcchoc.blocks.bluestone.BlockCoalGenerator;
import esrome.mcchoc.blocks.bluestone.BlockComponentCrafter;
import esrome.mcchoc.blocks.halloween.BlockCandle;
import esrome.mcchoc.blocks.halloween.BlockHalloweenSign;
import esrome.mcchoc.blocks.halloween.BlockSpecialJackOLantern;
import esrome.mcchoc.blocks.minerals.crystals.BlockAmethystOre;
import esrome.mcchoc.blocks.minerals.crystals.BlockPeridotOre;
import esrome.mcchoc.blocks.minerals.crystals.BlockRoseQuartzOre;
import esrome.mcchoc.blocks.minerals.crystals.BlockRubyOre;
import esrome.mcchoc.blocks.minerals.crystals.BlockSapphireOre;
import esrome.mcchoc.blocks.minerals.metals.BlockOres;
import esrome.mcchoc.blocks.plants.BlockTomatoPlant;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class ModBlocks {

public static final List<Block> BLOCKS = new ArrayList<Block>();

	//crops
	public static final Block TOMATO_PLANT = new BlockTomatoPlant("tomato_plant");

	//minerals
	public static final Block MINECRAFT_CHOCOLATE_ORES = new BlockOres("ore_overworld", "overworld");
	public static final Block IRON_STAIRS = new BlockModStairs(Blocks.IRON_BLOCK.getDefaultState(), "iron_stairs", CreativeTabs.BUILDING_BLOCKS);
	public static final Block GOLD_STAIRS = new BlockModStairs(Blocks.GOLD_BLOCK.getDefaultState(), "gold_stairs", CreativeTabs.BUILDING_BLOCKS);
	//copper
	public static final Block COPPER_BLOCK = new BlockBase("copper_block", Material.IRON, 3.0F, 1, SoundType.METAL, MinecraftChocolate.MINERALS);
	public static final Block COPPER_STAIRS = new BlockModStairs(COPPER_BLOCK.getDefaultState(), "copper_stairs", MinecraftChocolate.MINERALS);
	//lead
	public static final Block LEAD_BLOCK = new BlockBase("lead_block", Material.IRON, 5.0F, 2, SoundType.METAL, MinecraftChocolate.MINERALS);
	public static final Block LEAD_STAIRS = new BlockModStairs(LEAD_BLOCK.getDefaultState(), "lead_stairs", MinecraftChocolate.MINERALS);
	//silver
	public static final Block SILVER_BLOCK = new BlockBase("silver_block", Material.IRON, 4.0F, 2, SoundType.METAL, MinecraftChocolate.MINERALS);
	public static final Block SILVER_STAIRS = new BlockModStairs(SILVER_BLOCK.getDefaultState(), "silver_stairs", MinecraftChocolate.MINERALS);
	//steel
	public static final Block STEEL_BLOCK = new BlockBase("steel_block", Material.IRON, 5.0F, 2, SoundType.METAL, MinecraftChocolate.MINERALS);
	public static final Block STEEL_STAIRS = new BlockModStairs(STEEL_BLOCK.getDefaultState(), "steel_stairs", MinecraftChocolate.MINERALS);
	//aluminum
	public static final Block ALUMINUM_BLOCK = new BlockBase("aluminum_block", Material.IRON, 2.8F, 1, SoundType.METAL, MinecraftChocolate.MINERALS);
	public static final Block ALUMINUM_STAIRS = new BlockModStairs(ALUMINUM_BLOCK.getDefaultState(), "aluminum_stairs", MinecraftChocolate.MINERALS);
	//titanium
	public static final Block TITANIUM_BLOCK = new BlockBase("titanium_block", Material.IRON, 4.0F, 2, SoundType.METAL, MinecraftChocolate.MINERALS);
	public static final Block TITANIUM_STAIRS = new BlockModStairs(TITANIUM_BLOCK.getDefaultState(), "titanium_stairs", MinecraftChocolate.MINERALS);
	//magnesium
	public static final Block MAGNESIUM_BLOCK = new BlockBase("magnesium_block", Material.IRON, 2.0F, 1, SoundType.METAL, MinecraftChocolate.MINERALS);
	public static final Block MAGNESIUM_STAIRS = new BlockModStairs(MAGNESIUM_BLOCK.getDefaultState(), "magnesium_stairs", MinecraftChocolate.MINERALS);
	//bronze
	public static final Block BRONZE_BLOCK = new BlockBase("bronze_block", Material.IRON, 2.0F, 1, SoundType.METAL, MinecraftChocolate.MINERALS);
	public static final Block BRONZE_STAIRS = new BlockModStairs(BRONZE_BLOCK.getDefaultState(), "bronze_stairs", MinecraftChocolate.MINERALS);
	//rose quartz
	public static final Block ROSE_QUARTZ_ORE = new BlockRoseQuartzOre("rose_quartz_ore");
	public static final Block ROSE_QUARTZ_BLOCK = new BlockBase("rose_quartz_block", Material.ROCK, 3.0F, 1, SoundType.STONE, MinecraftChocolate.MINERALS);
	public static final Block ROSE_QUARTZ_PILLAR = new BlockBase("rose_quartz_pillar", Material.ROCK, 3.0F, 1, SoundType.STONE, MinecraftChocolate.MINERALS);
	public static final Block ROSE_QUARTZ_BLOCK_CHISELED = new BlockBase("rose_quartz_block_chiseled", Material.ROCK, 3.0F, 1, SoundType.STONE, MinecraftChocolate.MINERALS);
	public static final Block ROSE_QUARTZ_STAIRS = new BlockModStairs(ROSE_QUARTZ_BLOCK.getDefaultState(), "rose_quartz_stairs", MinecraftChocolate.MINERALS);
	//minecraft
	public static final Block DIAMOND_GLASS = new BlockGlass("diamond_glass", CreativeTabs.DECORATIONS);
	public static final Block DIAMOND_STAIRS = new BlockModStairs(Blocks.DIAMOND_BLOCK.getDefaultState(), "diamond_stairs", CreativeTabs.DECORATIONS);
	public static final Block EMERALD_GLASS = new BlockGlass("emerald_glass", CreativeTabs.DECORATIONS);
	public static final Block EMERALD_STAIRS = new BlockModStairs(Blocks.EMERALD_BLOCK.getDefaultState(), "emerald_stairs", CreativeTabs.DECORATIONS);
	//sapphire
	public static final Block SAPPHIRE_ORE = new BlockSapphireOre("sapphire_ore");
	public static final Block SAPPHIRE_BLOCK = new BlockBase("sapphire_block", Material.IRON, 3.0F, 2, SoundType.METAL, MinecraftChocolate.MINERALS);
	public static final Block SAPPHIRE_GLASS = new BlockGlass("sapphire_glass", MinecraftChocolate.MINERALS);
	public static final Block SAPPIRE_STAIRS = new BlockModStairs(SAPPHIRE_ORE.getDefaultState(), "sapphire_stairs", MinecraftChocolate.MINERALS);
	//ruby
	public static final Block RUBY_ORE = new BlockRubyOre("ruby_ore");
	public static final Block RUBY_BLOCK = new BlockBase("ruby_block", Material.IRON, 3.0F, 2, SoundType.METAL, MinecraftChocolate.MINERALS);
	public static final Block RUBY_GLASS = new BlockGlass("ruby_glass", MinecraftChocolate.MINERALS);
	public static final Block RUBY_STAIRS = new BlockModStairs(RUBY_ORE.getDefaultState(), "ruby_stairs", MinecraftChocolate.MINERALS);
	//amethyst
	public static final Block AMETHYST_ORE = new BlockAmethystOre("amethyst_ore");
	public static final Block AMETHYST_BLOCK = new BlockBase("amethyst_block", Material.IRON, 3.0F, 2, SoundType.METAL, MinecraftChocolate.MINERALS);
	public static final Block AMETHYST_GLASS = new BlockGlass("amethyst_glass", MinecraftChocolate.MINERALS);
	public static final Block AMETHYST_STAIRS = new BlockModStairs(AMETHYST_ORE.getDefaultState(), "amethyst_stairs", MinecraftChocolate.MINERALS);
	//peridot
	public static final Block PERIDOT_ORE = new BlockPeridotOre("peridot_ore");
	public static final Block PERIDOT_BLOCK = new BlockBase("peridot_block", Material.IRON, 3.0F, 2, SoundType.METAL, MinecraftChocolate.MINERALS);
	public static final Block PERIDOT_GLASS = new BlockGlass("peridot_glass", MinecraftChocolate.MINERALS);
	public static final Block PERIDOT_STAIRS = new BlockModStairs(PERIDOT_BLOCK.getDefaultState(), "peridot_stairs", MinecraftChocolate.MINERALS);
	
	/*
	//bluestone
	public static final Block BLUESTONE_ORE = new BlockBluestoneOre("bluestone_ore");	
	public static final Block BLUESTONE_BLOCK = new BlockBase("bluestone_block", Material.ROCK, 3.0F, 1, SoundType.STONE, MinecraftChocolate.BLUESTONE);
	public static final Block COAL_GENERATOR = new BlockCoalGenerator("coal_generator");
	public static final Block COMPONENT_CRAFTER = new BlockComponentCrafter("component_crafter");
	*/
	
	//halloween
	public static final Block SPECIAL_JACK_O_LANTERN = new BlockSpecialJackOLantern("special_jack_o_lantern");
	public static final Block CANDLE = new BlockCandle("candle");
	public static final Block TRICK_OR_TREAT_SIGN = new BlockHalloweenSign("trick_or_treat");
	
}
