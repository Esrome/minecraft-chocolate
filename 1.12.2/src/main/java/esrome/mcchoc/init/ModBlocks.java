package esrome.mcchoc.init;

import java.util.ArrayList;
import java.util.List;

import esrome.mcchoc.MinecraftChocolate;
import esrome.mcchoc.blocks.BlockBase;
import esrome.mcchoc.blocks.BlockDoorBase;
import esrome.mcchoc.blocks.BlockFenceBase;
import esrome.mcchoc.blocks.BlockFenceGateBase;
import esrome.mcchoc.blocks.BlockModStairs;
import esrome.mcchoc.blocks.halloween.BlockCandle;
import esrome.mcchoc.blocks.halloween.BlockHalloweenSign;
import esrome.mcchoc.blocks.halloween.BlockSpecialJackOLantern;
import esrome.mcchoc.blocks.minerals.crystals.BlockAmethystOre;
import esrome.mcchoc.blocks.minerals.crystals.BlockCarnelianOre;
import esrome.mcchoc.blocks.minerals.crystals.BlockMalachiteOre;
import esrome.mcchoc.blocks.minerals.crystals.BlockPeridotOre;
import esrome.mcchoc.blocks.minerals.crystals.BlockRoseQuartzOre;
import esrome.mcchoc.blocks.minerals.crystals.BlockRubyOre;
import esrome.mcchoc.blocks.minerals.crystals.BlockSapphireOre;
import esrome.mcchoc.blocks.minerals.crystals.BlockTurquoiseOre;
import esrome.mcchoc.blocks.minerals.metals.BlockOres;
import esrome.mcchoc.blocks.plants.BlockTomatoPlant;
import esrome.mcchoc.blocks.slab.BlockIronSlab;
import esrome.mcchoc.blocks.slab.BlockSlabBase;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
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
	public static final Block IRON_FENCE = new BlockFenceBase(Material.IRON, MapColor.IRON, "iron_fence", CreativeTabs.BUILDING_BLOCKS, 1, "pickaxe");
	public static final Block IRON_FENCE_GATE = new BlockFenceGateBase(Material.IRON, MapColor.GOLD, "iron_fence_gate", CreativeTabs.BUILDING_BLOCKS, 1, "pickaxe");
	//public static final BlockSlabBase IRON_SLAB = new BlockIronSlab.Half();
	//public static final BlockSlabBase IRON_SLAB_DOUBLE = new BlockIronSlab.Double();
	public static final Block GOLD_STAIRS = new BlockModStairs(Blocks.GOLD_BLOCK.getDefaultState(), "gold_stairs", CreativeTabs.BUILDING_BLOCKS);
	public static final Block GOLD_DOOR = new BlockDoorBase(Material.IRON, "gold_door", CreativeTabs.BUILDING_BLOCKS, 1, "pickaxe");
	public static final Block GOLD_FENCE = new BlockFenceBase(Material.IRON, MapColor.GOLD, "gold_fence", CreativeTabs.BUILDING_BLOCKS, 1, "pickaxe");
	public static final Block GOLD_FENCE_GATE = new BlockFenceGateBase(Material.IRON, MapColor.GOLD, "gold_fence_gate", CreativeTabs.BUILDING_BLOCKS, 1, "pickaxe");
	//copper
	public static final Block COPPER_BLOCK = new BlockBase("copper_block", Material.IRON, 3.0F, 1, SoundType.METAL, MinecraftChocolate.MINERALS, MapColor.RED_STAINED_HARDENED_CLAY);
	public static final Block COPPER_STAIRS = new BlockModStairs(COPPER_BLOCK.getDefaultState(), "copper_stairs", MinecraftChocolate.MINERALS);
	public static final Block COPPER_DOOR = new BlockDoorBase(Material.IRON, "copper_door", MinecraftChocolate.MINERALS, 1, "pickaxe");
	public static final Block COPPER_FENCE = new BlockFenceBase(Material.IRON, MapColor.RED_STAINED_HARDENED_CLAY, "copper_fence", MinecraftChocolate.MINERALS, 1, "pickaxe");
	public static final Block COPPER_FENCE_GATE = new BlockFenceGateBase(Material.IRON, MapColor.RED_STAINED_HARDENED_CLAY, "copper_fence_gate", MinecraftChocolate.MINERALS, 1, "pickaxe");
	//lead
	public static final Block LEAD_BLOCK = new BlockBase("lead_block", Material.IRON, 5.0F, 2, SoundType.METAL, MinecraftChocolate.MINERALS, MapColor.GRAY);
	public static final Block LEAD_STAIRS = new BlockModStairs(LEAD_BLOCK.getDefaultState(), "lead_stairs", MinecraftChocolate.MINERALS);
	public static final Block LEAD_DOOR = new BlockDoorBase(Material.IRON, "lead_door", MinecraftChocolate.MINERALS, 1, "pickaxe");
	public static final Block LEAD_FENCE = new BlockFenceBase(Material.IRON, MapColor.GRAY, "lead_fence", MinecraftChocolate.MINERALS, 1, "pickaxe");
	public static final Block LEAD_FENCE_GATE = new BlockFenceGateBase(Material.IRON, MapColor.GRAY, "lead_fence_gate", MinecraftChocolate.MINERALS, 1, "pickaxe");
	//silver
	public static final Block SILVER_BLOCK = new BlockBase("silver_block", Material.IRON, 4.0F, 2, SoundType.METAL, MinecraftChocolate.MINERALS, MapColor.SILVER);
	public static final Block SILVER_STAIRS = new BlockModStairs(SILVER_BLOCK.getDefaultState(), "silver_stairs", MinecraftChocolate.MINERALS);
	public static final Block SILVER_DOOR = new BlockDoorBase(Material.IRON, "silver_door", MinecraftChocolate.MINERALS, 1, "pickaxe");
	public static final Block SILVER_FENCE = new BlockFenceBase(Material.IRON, MapColor.IRON, "silver_fence", MinecraftChocolate.MINERALS, 1, "pickaxe");
	public static final Block SILVER_FENCE_GATE = new BlockFenceGateBase(Material.IRON, MapColor.IRON, "silver_fence_gate", MinecraftChocolate.MINERALS, 1, "pickaxe");
	//steel
	public static final Block STEEL_BLOCK = new BlockBase("steel_block", Material.IRON, 5.0F, 2, SoundType.METAL, MinecraftChocolate.MINERALS, MapColor.BLUE_STAINED_HARDENED_CLAY);
	public static final Block STEEL_STAIRS = new BlockModStairs(STEEL_BLOCK.getDefaultState(), "steel_stairs", MinecraftChocolate.MINERALS);
	public static final Block STEEL_DOOR = new BlockDoorBase(Material.IRON, "steel_door", MinecraftChocolate.MINERALS, 1, "pickaxe");
	public static final Block STEEL_FENCE = new BlockFenceBase(Material.IRON, MapColor.BLUE_STAINED_HARDENED_CLAY, "steel_fence", MinecraftChocolate.MINERALS, 1, "pickaxe");
	public static final Block STEEL_FENCE_GATE = new BlockFenceGateBase(Material.IRON, MapColor.BLUE_STAINED_HARDENED_CLAY, "steel_fence_gate", MinecraftChocolate.MINERALS, 1, "pickaxe");
	//aluminum
	public static final Block ALUMINUM_BLOCK = new BlockBase("aluminum_block", Material.IRON, 2.8F, 1, SoundType.METAL, MinecraftChocolate.MINERALS, MapColor.SILVER);
	public static final Block ALUMINUM_STAIRS = new BlockModStairs(ALUMINUM_BLOCK.getDefaultState(), "aluminum_stairs", MinecraftChocolate.MINERALS);
	public static final Block ALUMINUM_DOOR = new BlockDoorBase(Material.IRON, "aluminum_door", MinecraftChocolate.MINERALS, 1, "pickaxe");
	public static final Block ALUMINUM_FENCE = new BlockFenceBase(Material.IRON, MapColor.SILVER, "aluminum_fence", MinecraftChocolate.MINERALS, 1, "pickaxe");
	public static final Block ALUMINUM_FENCE_GATE = new BlockFenceGateBase(Material.IRON, MapColor.SILVER, "aluminum_fence_gate", MinecraftChocolate.MINERALS, 1, "pickaxe");
	//titanium
	public static final Block TITANIUM_BLOCK = new BlockBase("titanium_block", Material.IRON, 4.0F, 2, SoundType.METAL, MinecraftChocolate.MINERALS, MapColor.SILVER);
	public static final Block TITANIUM_STAIRS = new BlockModStairs(TITANIUM_BLOCK.getDefaultState(), "titanium_stairs", MinecraftChocolate.MINERALS);
	public static final Block TITANIUM_DOOR = new BlockDoorBase(Material.IRON, "titanium_door", MinecraftChocolate.MINERALS, 1, "pickaxe");
	public static final Block TITANIUM_FENCE = new BlockFenceBase(Material.IRON, MapColor.SILVER, "titanium_fence", MinecraftChocolate.MINERALS, 1, "pickaxe");
	public static final Block TITANIUM_FENCE_GATE = new BlockFenceGateBase(Material.IRON, MapColor.SILVER, "titanium_fence_gate", MinecraftChocolate.MINERALS, 1, "pickaxe");
	//magnesium
	public static final Block MAGNESIUM_BLOCK = new BlockBase("magnesium_block", Material.IRON, 2.0F, 1, SoundType.METAL, MinecraftChocolate.MINERALS, MapColor.SAND);
	public static final Block MAGNESIUM_STAIRS = new BlockModStairs(MAGNESIUM_BLOCK.getDefaultState(), "magnesium_stairs", MinecraftChocolate.MINERALS);
	public static final Block MAGNESIUM_DOOR = new BlockDoorBase(Material.IRON, "magnesium_door", MinecraftChocolate.MINERALS, 1, "pickaxe");
	public static final Block MAGNESIUM_FENCE = new BlockFenceBase(Material.IRON, MapColor.SAND, "magnesium_fence", MinecraftChocolate.MINERALS, 1, "pickaxe");
	public static final Block MAGNESIUM_FENCE_GATE = new BlockFenceGateBase(Material.IRON, MapColor.SAND, "magnesium_fence_gate", MinecraftChocolate.MINERALS, 1, "pickaxe");
	//bronze
	public static final Block BRONZE_BLOCK = new BlockBase("bronze_block", Material.IRON, 2.0F, 1, SoundType.METAL, MinecraftChocolate.MINERALS, MapColor.ORANGE_STAINED_HARDENED_CLAY);
	public static final Block BRONZE_STAIRS = new BlockModStairs(BRONZE_BLOCK.getDefaultState(), "bronze_stairs", MinecraftChocolate.MINERALS);
	public static final Block BRONZE_DOOR = new BlockDoorBase(Material.IRON, "bronze_door", MinecraftChocolate.MINERALS, 1, "pickaxe");
	public static final Block BRONZE_FENCE = new BlockFenceBase(Material.IRON, MapColor.ORANGE_STAINED_HARDENED_CLAY, "bronze_fence", MinecraftChocolate.MINERALS, 1, "pickaxe");
	public static final Block BRONZE_FENCE_GATE = new BlockFenceGateBase(Material.IRON, MapColor.ORANGE_STAINED_HARDENED_CLAY, "bronze_fence_gate", MinecraftChocolate.MINERALS, 1, "pickaxe");
	//rose quartz
	public static final Block ROSE_QUARTZ_ORE = new BlockRoseQuartzOre("rose_quartz_ore");
	public static final Block ROSE_QUARTZ_BLOCK = new BlockBase("rose_quartz_block", Material.ROCK, 3.0F, 1, SoundType.STONE, MinecraftChocolate.MINERALS, MapColor.PINK);
	public static final Block ROSE_QUARTZ_PILLAR = new BlockBase("rose_quartz_pillar", Material.ROCK, 3.0F, 1, SoundType.STONE, MinecraftChocolate.MINERALS, MapColor.PINK);
	public static final Block ROSE_QUARTZ_BLOCK_CHISELED = new BlockBase("rose_quartz_block_chiseled", Material.ROCK, 3.0F, 1, SoundType.STONE, MinecraftChocolate.MINERALS, MapColor.PINK);
	public static final Block ROSE_QUARTZ_STAIRS = new BlockModStairs(ROSE_QUARTZ_BLOCK.getDefaultState(), "rose_quartz_stairs", MinecraftChocolate.MINERALS);
	//malachite
	public static final Block MALACHITE_ORE = new BlockMalachiteOre("malachite_ore");
	public static final Block MALACHITE_BLOCK = new BlockBase("malachite_block", Material.ROCK, 3.0F, 1, SoundType.STONE, MinecraftChocolate.MINERALS, MapColor.GREEN_STAINED_HARDENED_CLAY);
	public static final Block MALACHITE_PILLAR = new BlockBase("malachite_pillar", Material.ROCK, 3.0F, 1, SoundType.STONE, MinecraftChocolate.MINERALS, MapColor.GREEN_STAINED_HARDENED_CLAY);
	public static final Block MALACHITE_BLOCK_CHISELED = new BlockBase("malachite_block_chiseled", Material.ROCK, 3.0F, 1, SoundType.STONE, MinecraftChocolate.MINERALS, MapColor.GREEN_STAINED_HARDENED_CLAY);
	public static final Block MALACHITE_STAIRS = new BlockModStairs(MALACHITE_BLOCK.getDefaultState(), "malachite_stairs", MinecraftChocolate.MINERALS);
	//carnelian
	public static final Block CARNELIAN_ORE = new BlockCarnelianOre("carnelian_ore");
	public static final Block CARNELIAN_BLOCK = new BlockBase("carnelian_block", Material.ROCK, 3.0F, 1, SoundType.STONE, MinecraftChocolate.MINERALS, MapColor.ORANGE_STAINED_HARDENED_CLAY);
	public static final Block CARNELIAN_PILLAR = new BlockBase("carnelian_pillar", Material.ROCK, 3.0F, 1, SoundType.STONE, MinecraftChocolate.MINERALS, MapColor.ORANGE_STAINED_HARDENED_CLAY);
	public static final Block CARNELIAN_BLOCK_CHISELED = new BlockBase("carnelian_block_chiseled", Material.ROCK, 3.0F, 1, SoundType.STONE, MinecraftChocolate.MINERALS, MapColor.ORANGE_STAINED_HARDENED_CLAY);
	public static final Block CARNELIAN_STAIRS = new BlockModStairs(CARNELIAN_BLOCK.getDefaultState(), "carnelian_stairs", MinecraftChocolate.MINERALS);
	//carnelian
	public static final Block TURQUOISE_ORE = new BlockTurquoiseOre("turquoise_ore");
	public static final Block TURQUOISE_BLOCK = new BlockBase("turquoise_block", Material.ROCK, 3.0F, 1, SoundType.STONE, MinecraftChocolate.MINERALS, MapColor.LIGHT_BLUE);
	public static final Block TURQUOISE_PILLAR = new BlockBase("turquoise_pillar", Material.ROCK, 3.0F, 1, SoundType.STONE, MinecraftChocolate.MINERALS, MapColor.LIGHT_BLUE);
	public static final Block TURQUOISE_BLOCK_CHISELED = new BlockBase("turquoise_block_chiseled", Material.ROCK, 3.0F, 1, SoundType.STONE, MinecraftChocolate.MINERALS, MapColor.LIGHT_BLUE);
	public static final Block TURQUOISE_STAIRS = new BlockModStairs(TURQUOISE_BLOCK.getDefaultState(), "turquoise_stairs", MinecraftChocolate.MINERALS);
	//minecraft
	public static final Block DIAMOND_STAIRS = new BlockModStairs(Blocks.DIAMOND_BLOCK.getDefaultState(), "diamond_stairs", CreativeTabs.DECORATIONS);
	public static final Block EMERALD_STAIRS = new BlockModStairs(Blocks.EMERALD_BLOCK.getDefaultState(), "emerald_stairs", CreativeTabs.DECORATIONS);
	//sapphire
	public static final Block SAPPHIRE_ORE = new BlockSapphireOre("sapphire_ore");
	public static final Block SAPPHIRE_BLOCK = new BlockBase("sapphire_block", Material.IRON, 3.0F, 2, SoundType.METAL, MinecraftChocolate.MINERALS, MapColor.BLUE);
	public static final Block SAPPIRE_STAIRS = new BlockModStairs(SAPPHIRE_ORE.getDefaultState(), "sapphire_stairs", MinecraftChocolate.MINERALS);
	//ruby
	public static final Block RUBY_ORE = new BlockRubyOre("ruby_ore");
	public static final Block RUBY_BLOCK = new BlockBase("ruby_block", Material.IRON, 3.0F, 2, SoundType.METAL, MinecraftChocolate.MINERALS, MapColor.RED);
	public static final Block RUBY_STAIRS = new BlockModStairs(RUBY_ORE.getDefaultState(), "ruby_stairs", MinecraftChocolate.MINERALS);
	//amethyst
	public static final Block AMETHYST_ORE = new BlockAmethystOre("amethyst_ore");
	public static final Block AMETHYST_BLOCK = new BlockBase("amethyst_block", Material.IRON, 3.0F, 2, SoundType.METAL, MinecraftChocolate.MINERALS, MapColor.PURPLE);
	public static final Block AMETHYST_STAIRS = new BlockModStairs(AMETHYST_ORE.getDefaultState(), "amethyst_stairs", MinecraftChocolate.MINERALS);
	//peridot
	public static final Block PERIDOT_ORE = new BlockPeridotOre("peridot_ore");
	public static final Block PERIDOT_BLOCK = new BlockBase("peridot_block", Material.IRON, 3.0F, 2, SoundType.METAL, MinecraftChocolate.MINERALS, MapColor.GREEN);
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
