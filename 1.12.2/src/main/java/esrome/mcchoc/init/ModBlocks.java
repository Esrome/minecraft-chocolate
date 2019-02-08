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
import esrome.mcchoc.blocks.redstone.BlockRedstoneLamp;
import esrome.mcchoc.blocks.redstone.BlockSpikes;
import esrome.mcchoc.blocks.redstone.BlockSwitch;
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
	public static final Block COPPER_BLOCK = new BlockBase("copper_block", Material.IRON, 3.0F, 1, SoundType.METAL, MinecraftChocolate.BUILDING_BLOCKS, MapColor.RED_STAINED_HARDENED_CLAY);
	public static final Block COPPER_STAIRS = new BlockModStairs(COPPER_BLOCK.getDefaultState(), "copper_stairs", MinecraftChocolate.BUILDING_BLOCKS);
	public static final Block COPPER_DOOR = new BlockDoorBase(Material.IRON, "copper_door", MinecraftChocolate.BUILDING_BLOCKS, 1, "pickaxe");
	public static final Block COPPER_FENCE = new BlockFenceBase(Material.IRON, MapColor.RED_STAINED_HARDENED_CLAY, "copper_fence", MinecraftChocolate.BUILDING_BLOCKS, 1, "pickaxe");
	public static final Block COPPER_FENCE_GATE = new BlockFenceGateBase(Material.IRON, MapColor.RED_STAINED_HARDENED_CLAY, "copper_fence_gate", MinecraftChocolate.BUILDING_BLOCKS, 1, "pickaxe");
	//lead
	public static final Block LEAD_BLOCK = new BlockBase("lead_block", Material.IRON, 5.0F, 2, SoundType.METAL, MinecraftChocolate.BUILDING_BLOCKS, MapColor.GRAY);
	public static final Block LEAD_STAIRS = new BlockModStairs(LEAD_BLOCK.getDefaultState(), "lead_stairs", MinecraftChocolate.BUILDING_BLOCKS);
	public static final Block LEAD_DOOR = new BlockDoorBase(Material.IRON, "lead_door", MinecraftChocolate.BUILDING_BLOCKS, 1, "pickaxe");
	public static final Block LEAD_FENCE = new BlockFenceBase(Material.IRON, MapColor.GRAY, "lead_fence", MinecraftChocolate.BUILDING_BLOCKS, 1, "pickaxe");
	public static final Block LEAD_FENCE_GATE = new BlockFenceGateBase(Material.IRON, MapColor.GRAY, "lead_fence_gate", MinecraftChocolate.BUILDING_BLOCKS, 1, "pickaxe");
	//silver
	public static final Block SILVER_BLOCK = new BlockBase("silver_block", Material.IRON, 4.0F, 2, SoundType.METAL, MinecraftChocolate.BUILDING_BLOCKS, MapColor.SILVER);
	public static final Block SILVER_STAIRS = new BlockModStairs(SILVER_BLOCK.getDefaultState(), "silver_stairs", MinecraftChocolate.BUILDING_BLOCKS);
	public static final Block SILVER_DOOR = new BlockDoorBase(Material.IRON, "silver_door", MinecraftChocolate.BUILDING_BLOCKS, 1, "pickaxe");
	public static final Block SILVER_FENCE = new BlockFenceBase(Material.IRON, MapColor.IRON, "silver_fence", MinecraftChocolate.BUILDING_BLOCKS, 1, "pickaxe");
	public static final Block SILVER_FENCE_GATE = new BlockFenceGateBase(Material.IRON, MapColor.IRON, "silver_fence_gate", MinecraftChocolate.BUILDING_BLOCKS, 1, "pickaxe");
	//steel
	public static final Block STEEL_BLOCK = new BlockBase("steel_block", Material.IRON, 5.0F, 2, SoundType.METAL, MinecraftChocolate.BUILDING_BLOCKS, MapColor.BLUE_STAINED_HARDENED_CLAY);
	public static final Block STEEL_STAIRS = new BlockModStairs(STEEL_BLOCK.getDefaultState(), "steel_stairs", MinecraftChocolate.BUILDING_BLOCKS);
	public static final Block STEEL_DOOR = new BlockDoorBase(Material.IRON, "steel_door", MinecraftChocolate.BUILDING_BLOCKS, 1, "pickaxe");
	public static final Block STEEL_FENCE = new BlockFenceBase(Material.IRON, MapColor.BLUE_STAINED_HARDENED_CLAY, "steel_fence", MinecraftChocolate.BUILDING_BLOCKS, 1, "pickaxe");
	public static final Block STEEL_FENCE_GATE = new BlockFenceGateBase(Material.IRON, MapColor.BLUE_STAINED_HARDENED_CLAY, "steel_fence_gate", MinecraftChocolate.BUILDING_BLOCKS, 1, "pickaxe");
	//aluminum
	public static final Block ALUMINUM_BLOCK = new BlockBase("aluminum_block", Material.IRON, 2.8F, 1, SoundType.METAL, MinecraftChocolate.BUILDING_BLOCKS, MapColor.SILVER);
	public static final Block ALUMINUM_STAIRS = new BlockModStairs(ALUMINUM_BLOCK.getDefaultState(), "aluminum_stairs", MinecraftChocolate.BUILDING_BLOCKS);
	public static final Block ALUMINUM_DOOR = new BlockDoorBase(Material.IRON, "aluminum_door", MinecraftChocolate.BUILDING_BLOCKS, 1, "pickaxe");
	public static final Block ALUMINUM_FENCE = new BlockFenceBase(Material.IRON, MapColor.SILVER, "aluminum_fence", MinecraftChocolate.BUILDING_BLOCKS, 1, "pickaxe");
	public static final Block ALUMINUM_FENCE_GATE = new BlockFenceGateBase(Material.IRON, MapColor.SILVER, "aluminum_fence_gate", MinecraftChocolate.BUILDING_BLOCKS, 1, "pickaxe");
	//titanium
	public static final Block TITANIUM_BLOCK = new BlockBase("titanium_block", Material.IRON, 4.0F, 2, SoundType.METAL, MinecraftChocolate.BUILDING_BLOCKS, MapColor.SILVER);
	public static final Block TITANIUM_STAIRS = new BlockModStairs(TITANIUM_BLOCK.getDefaultState(), "titanium_stairs", MinecraftChocolate.BUILDING_BLOCKS);
	public static final Block TITANIUM_DOOR = new BlockDoorBase(Material.IRON, "titanium_door", MinecraftChocolate.BUILDING_BLOCKS, 1, "pickaxe");
	public static final Block TITANIUM_FENCE = new BlockFenceBase(Material.IRON, MapColor.SILVER, "titanium_fence", MinecraftChocolate.BUILDING_BLOCKS, 1, "pickaxe");
	public static final Block TITANIUM_FENCE_GATE = new BlockFenceGateBase(Material.IRON, MapColor.SILVER, "titanium_fence_gate", MinecraftChocolate.BUILDING_BLOCKS, 1, "pickaxe");
	//magnesium
	public static final Block MAGNESIUM_BLOCK = new BlockBase("magnesium_block", Material.IRON, 2.0F, 1, SoundType.METAL, MinecraftChocolate.BUILDING_BLOCKS, MapColor.SAND);
	public static final Block MAGNESIUM_STAIRS = new BlockModStairs(MAGNESIUM_BLOCK.getDefaultState(), "magnesium_stairs", MinecraftChocolate.BUILDING_BLOCKS);
	public static final Block MAGNESIUM_DOOR = new BlockDoorBase(Material.IRON, "magnesium_door", MinecraftChocolate.BUILDING_BLOCKS, 1, "pickaxe");
	public static final Block MAGNESIUM_FENCE = new BlockFenceBase(Material.IRON, MapColor.SAND, "magnesium_fence", MinecraftChocolate.BUILDING_BLOCKS, 1, "pickaxe");
	public static final Block MAGNESIUM_FENCE_GATE = new BlockFenceGateBase(Material.IRON, MapColor.SAND, "magnesium_fence_gate", MinecraftChocolate.BUILDING_BLOCKS, 1, "pickaxe");
	//bronze
	public static final Block BRONZE_BLOCK = new BlockBase("bronze_block", Material.IRON, 2.0F, 1, SoundType.METAL, MinecraftChocolate.BUILDING_BLOCKS, MapColor.ORANGE_STAINED_HARDENED_CLAY);
	public static final Block BRONZE_STAIRS = new BlockModStairs(BRONZE_BLOCK.getDefaultState(), "bronze_stairs", MinecraftChocolate.BUILDING_BLOCKS);
	public static final Block BRONZE_DOOR = new BlockDoorBase(Material.IRON, "bronze_door", MinecraftChocolate.BUILDING_BLOCKS, 1, "pickaxe");
	public static final Block BRONZE_FENCE = new BlockFenceBase(Material.IRON, MapColor.ORANGE_STAINED_HARDENED_CLAY, "bronze_fence", MinecraftChocolate.BUILDING_BLOCKS, 1, "pickaxe");
	public static final Block BRONZE_FENCE_GATE = new BlockFenceGateBase(Material.IRON, MapColor.ORANGE_STAINED_HARDENED_CLAY, "bronze_fence_gate", MinecraftChocolate.BUILDING_BLOCKS, 1, "pickaxe");
	//rose quartz
	public static final Block ROSE_QUARTZ_ORE = new BlockRoseQuartzOre("rose_quartz_ore");
	public static final Block ROSE_QUARTZ_BLOCK = new BlockBase("rose_quartz_block", Material.ROCK, 3.0F, 1, SoundType.STONE, MinecraftChocolate.BUILDING_BLOCKS, MapColor.PINK);
	public static final Block ROSE_QUARTZ_PILLAR = new BlockBase("rose_quartz_pillar", Material.ROCK, 3.0F, 1, SoundType.STONE, MinecraftChocolate.BUILDING_BLOCKS, MapColor.PINK);
	public static final Block ROSE_QUARTZ_BLOCK_CHISELED = new BlockBase("rose_quartz_block_chiseled", Material.ROCK, 3.0F, 1, SoundType.STONE, MinecraftChocolate.BUILDING_BLOCKS, MapColor.PINK);
	public static final Block ROSE_QUARTZ_STAIRS = new BlockModStairs(ROSE_QUARTZ_BLOCK.getDefaultState(), "rose_quartz_stairs", MinecraftChocolate.BUILDING_BLOCKS);
	//malachite
	public static final Block MALACHITE_ORE = new BlockMalachiteOre("malachite_ore");
	public static final Block MALACHITE_BLOCK = new BlockBase("malachite_block", Material.ROCK, 3.0F, 1, SoundType.STONE, MinecraftChocolate.BUILDING_BLOCKS, MapColor.GREEN_STAINED_HARDENED_CLAY);
	public static final Block MALACHITE_PILLAR = new BlockBase("malachite_pillar", Material.ROCK, 3.0F, 1, SoundType.STONE, MinecraftChocolate.BUILDING_BLOCKS, MapColor.GREEN_STAINED_HARDENED_CLAY);
	public static final Block MALACHITE_BLOCK_CHISELED = new BlockBase("malachite_block_chiseled", Material.ROCK, 3.0F, 1, SoundType.STONE, MinecraftChocolate.BUILDING_BLOCKS, MapColor.GREEN_STAINED_HARDENED_CLAY);
	public static final Block MALACHITE_STAIRS = new BlockModStairs(MALACHITE_BLOCK.getDefaultState(), "malachite_stairs", MinecraftChocolate.BUILDING_BLOCKS);
	//carnelian
	public static final Block CARNELIAN_ORE = new BlockCarnelianOre("carnelian_ore");
	public static final Block CARNELIAN_BLOCK = new BlockBase("carnelian_block", Material.ROCK, 3.0F, 1, SoundType.STONE, MinecraftChocolate.BUILDING_BLOCKS, MapColor.ORANGE_STAINED_HARDENED_CLAY);
	public static final Block CARNELIAN_PILLAR = new BlockBase("carnelian_pillar", Material.ROCK, 3.0F, 1, SoundType.STONE, MinecraftChocolate.BUILDING_BLOCKS, MapColor.ORANGE_STAINED_HARDENED_CLAY);
	public static final Block CARNELIAN_BLOCK_CHISELED = new BlockBase("carnelian_block_chiseled", Material.ROCK, 3.0F, 1, SoundType.STONE, MinecraftChocolate.BUILDING_BLOCKS, MapColor.ORANGE_STAINED_HARDENED_CLAY);
	public static final Block CARNELIAN_STAIRS = new BlockModStairs(CARNELIAN_BLOCK.getDefaultState(), "carnelian_stairs", MinecraftChocolate.BUILDING_BLOCKS);
	//carnelian
	public static final Block TURQUOISE_ORE = new BlockTurquoiseOre("turquoise_ore");
	public static final Block TURQUOISE_BLOCK = new BlockBase("turquoise_block", Material.ROCK, 3.0F, 1, SoundType.STONE, MinecraftChocolate.BUILDING_BLOCKS, MapColor.LIGHT_BLUE);
	public static final Block TURQUOISE_PILLAR = new BlockBase("turquoise_pillar", Material.ROCK, 3.0F, 1, SoundType.STONE, MinecraftChocolate.BUILDING_BLOCKS, MapColor.LIGHT_BLUE);
	public static final Block TURQUOISE_BLOCK_CHISELED = new BlockBase("turquoise_block_chiseled", Material.ROCK, 3.0F, 1, SoundType.STONE, MinecraftChocolate.BUILDING_BLOCKS, MapColor.LIGHT_BLUE);
	public static final Block TURQUOISE_STAIRS = new BlockModStairs(TURQUOISE_BLOCK.getDefaultState(), "turquoise_stairs", MinecraftChocolate.BUILDING_BLOCKS);
	//minecraft
	public static final Block DIAMOND_STAIRS = new BlockModStairs(Blocks.DIAMOND_BLOCK.getDefaultState(), "diamond_stairs", CreativeTabs.DECORATIONS);
	public static final Block EMERALD_STAIRS = new BlockModStairs(Blocks.EMERALD_BLOCK.getDefaultState(), "emerald_stairs", CreativeTabs.DECORATIONS);
	//sapphire
	public static final Block SAPPHIRE_ORE = new BlockSapphireOre("sapphire_ore");
	public static final Block SAPPHIRE_BLOCK = new BlockBase("sapphire_block", Material.IRON, 3.0F, 2, SoundType.METAL, MinecraftChocolate.BUILDING_BLOCKS, MapColor.BLUE);
	public static final Block SAPPHIRE_STAIRS = new BlockModStairs(SAPPHIRE_ORE.getDefaultState(), "sapphire_stairs", MinecraftChocolate.BUILDING_BLOCKS);
	//ruby
	public static final Block RUBY_ORE = new BlockRubyOre("ruby_ore");
	public static final Block RUBY_BLOCK = new BlockBase("ruby_block", Material.IRON, 3.0F, 2, SoundType.METAL, MinecraftChocolate.BUILDING_BLOCKS, MapColor.RED);
	public static final Block RUBY_STAIRS = new BlockModStairs(RUBY_ORE.getDefaultState(), "ruby_stairs", MinecraftChocolate.BUILDING_BLOCKS);
	//amethyst
	public static final Block AMETHYST_ORE = new BlockAmethystOre("amethyst_ore");
	public static final Block AMETHYST_BLOCK = new BlockBase("amethyst_block", Material.IRON, 3.0F, 2, SoundType.METAL, MinecraftChocolate.BUILDING_BLOCKS, MapColor.PURPLE);
	public static final Block AMETHYST_STAIRS = new BlockModStairs(AMETHYST_ORE.getDefaultState(), "amethyst_stairs", MinecraftChocolate.BUILDING_BLOCKS);
	//peridot
	public static final Block PERIDOT_ORE = new BlockPeridotOre("peridot_ore");
	public static final Block PERIDOT_BLOCK = new BlockBase("peridot_block", Material.IRON, 3.0F, 2, SoundType.METAL, MinecraftChocolate.BUILDING_BLOCKS, MapColor.GREEN);
	public static final Block PERIDOT_STAIRS = new BlockModStairs(PERIDOT_BLOCK.getDefaultState(), "peridot_stairs", MinecraftChocolate.BUILDING_BLOCKS);
	//redstone
	/*
	public static final Block BLACK_LAMP = new BlockRedstoneLamp("black_lamp");
	public static final Block BLACK_LAMP_ON = new BlockRedstoneLamp(true, "black_lamp_on");
	public static final Block RED_LAMP = new BlockRedstoneLamp("red_lamp");
	public static final Block RED_LAMP_ON = new BlockRedstoneLamp(true, "red_lamp_on");
	public static final Block GREEN_LAMP = new BlockRedstoneLamp("green_lamp");
	public static final Block GREEN_LAMP_ON = new BlockRedstoneLamp(true, "green_lamp_on");
	public static final Block BROWN_LAMP = new BlockRedstoneLamp("brown_lamp");
	public static final Block BROWN_LAMP_ON = new BlockRedstoneLamp(true, "brown_lamp_on");
	public static final Block BLUE_LAMP = new BlockRedstoneLamp("blue_lamp");
	public static final Block BLUE_LAMP_ON = new BlockRedstoneLamp(true, "blue_lamp_on");
	public static final Block PURPLE_LAMP = new BlockRedstoneLamp("purple_lamp");
	public static final Block PURPLE_LAMP_ON = new BlockRedstoneLamp(true, "purple_lamp_on");
	public static final Block CYAN_LAMP = new BlockRedstoneLamp("cyan_lamp");
	public static final Block CYAN_LAMP_ON = new BlockRedstoneLamp(true, "cyan_lamp_on");
	public static final Block LIGHT_GRAY_LAMP = new BlockRedstoneLamp("light_gray_lamp");
	public static final Block LIGHT_GRAY_LAMP_ON = new BlockRedstoneLamp(true, "light_gray_lamp_on");
	public static final Block DARK_GRAY_LAMP = new BlockRedstoneLamp("dark_gray_lamp");
	public static final Block DARK_GRAY_LAMP_ON = new BlockRedstoneLamp(true, "dark_gray_lamp_on");
	public static final Block PINK_LAMP = new BlockRedstoneLamp("pink_lamp");
	public static final Block PINK_LAMP_ON = new BlockRedstoneLamp(true, "pink_lamp_on");
	public static final Block LIME_LAMP = new BlockRedstoneLamp("lime_lamp");
	public static final Block LIME_LAMP_ON = new BlockRedstoneLamp(true, "lime_lamp_on");
	public static final Block YELLOW_LAMP = new BlockRedstoneLamp("yellow_lamp");
	public static final Block YELLOW_LAMP_ON = new BlockRedstoneLamp(true, "yellow_lamp_on");
	public static final Block LIGHT_BLUE_LAMP = new BlockRedstoneLamp("light_blue_lamp");
	public static final Block LIGHT_BLUE_LAMP_ON = new BlockRedstoneLamp(true, "light_blue_lamp_on");
	public static final Block MAGENTA_LAMP = new BlockRedstoneLamp("magenta_lamp");
	public static final Block MAGENTA_LAMP_ON = new BlockRedstoneLamp(true, "magenta_lamp_on");
	public static final Block ORANGE_LAMP = new BlockRedstoneLamp("orange_lamp");
	public static final Block ORANGE_LAMP_ON = new BlockRedstoneLamp(true, "orange_lamp_on");
	public static final Block WHITE_LAMP = new BlockRedstoneLamp("white_lamp");
	public static final Block WHITE_LAMP_ON = new BlockRedstoneLamp(true, "white_lamp_on");
	public static final Block SPIKES = new BlockSpikes("spikes");
	public static final Block SPIKES_ON = new BlockSpikes(true, "spikes_on");
	public static final Block SPIKES_POISON = new BlockSpikes("spikes_poison");
	public static final Block SPIKES_POISON_ON = new BlockSpikes(true, "spikes_poison_on");
	public static final Block TERRACOTTA_SWITCH_BLACK = new BlockSwitch("terracotta_switch_black");
	public static final Block TERRACOTTA_SWITCH_RED = new BlockSwitch("terracotta_switch_red");
	public static final Block TERRACOTTA_SWITCH_GREEN = new BlockSwitch("terracotta_switch_green");
	public static final Block TERRACOTTA_SWITCH_BROWN = new BlockSwitch("terracotta_switch_brown");
	public static final Block TERRACOTTA_SWITCH_BLUE = new BlockSwitch("terracotta_switch_blue");
	public static final Block TERRACOTTA_SWITCH_PURPLE = new BlockSwitch("terracotta_switch_purple");
	public static final Block TERRACOTTA_SWITCH_CYAN = new BlockSwitch("terracotta_switch_cyan");
	public static final Block TERRACOTTA_SWITCH_LIGHT_GRAY = new BlockSwitch("terracotta_switch_light_gray");
	public static final Block TERRACOTTA_SWITCH_DARK_GRAY = new BlockSwitch("terracotta_switch_dark_gray");
	public static final Block TERRACOTTA_SWITCH_PINK = new BlockSwitch("terracotta_switch_pink");
	public static final Block TERRACOTTA_SWITCH_LIME = new BlockSwitch("terracotta_switch_lime");
	public static final Block TERRACOTTA_SWITCH_YELLOW = new BlockSwitch("terracotta_switch_yellow");
	public static final Block TERRACOTTA_SWITCH_LIGHT_BLUE = new BlockSwitch("terracotta_switch_light_blue");
	public static final Block TERRACOTTA_SWITCH_MAGENTA = new BlockSwitch("terracotta_switch_magenta");
	public static final Block TERRACOTTA_SWITCH_ORANGE = new BlockSwitch("terracotta_switch_orange");
	public static final Block TERRACOTTA_SWITCH_WHITE = new BlockSwitch("terracotta_switch_white");
	public static final Block WOONEN_SWITCH_OAK = new BlockSwitch("wooden_switch_oak");
	public static final Block WOODEN_SWITCH_SPRUCE = new BlockSwitch("wooden_switch_spruce");
	public static final Block WOODEN_SWITCH_BIRCH = new BlockSwitch("wooden_switch_birch");
	public static final Block WOODEN_SWITCH_JUNGLE = new BlockSwitch("wooden_switch_jungle");
	public static final Block WOODEN_SWITCH_ACACIA = new BlockSwitch("wooden_switch_acacia");
	public static final Block WOODEN_SWITCH_DARK_OAK = new BlockSwitch("wooden_switch_dark_oak");
	public static final Block CONCRETE_SWITCH_BLACK = new BlockSwitch("concrete_switch_black");
	public static final Block CONCRETE_SWITCH_RED = new BlockSwitch("concrete_switch_red");
	public static final Block CONCRETE_SWITCH_GREEN = new BlockSwitch("concrete_switch_green");
	public static final Block CONCRETE_SWITCH_BROWN = new BlockSwitch("concrete_switch_brown");
	public static final Block CONCRETE_SWITCH_BLUE = new BlockSwitch("concrete_switch_blue");
	public static final Block CONCRETE_SWITCH_PURPLE = new BlockSwitch("concrete_switch_purple");
	public static final Block CONCRETE_SWITCH_CYAN = new BlockSwitch("concrete_switch_cyan");
	public static final Block CONCRETE_SWITCH_LIGHT_GRAY = new BlockSwitch("concrete_switch_light_gray");
	public static final Block CONCRETE_SWITCH_DARK_GRAY = new BlockSwitch("concrete_switch_dark_gray");
	public static final Block CONCRETE_SWITCH_PINK = new BlockSwitch("concrete_switch_pink");
	public static final Block CONCRETE_SWITCH_LIME = new BlockSwitch("concrete_switch_lime");
	public static final Block CONCRETE_SWITCH_YELLOW = new BlockSwitch("concrete_switch_yellow");
	public static final Block CONCRETE_SWITCH_LIGHT_BLUE = new BlockSwitch("concrete_switch_light_blue");
	public static final Block CONCRETE_SWITCH_MAGENTA = new BlockSwitch("concrete_switch_magenta");
	public static final Block CONCRETE_SWITCH_ORANGE = new BlockSwitch("concrete_switch_orange");
	public static final Block CONCRETE_SWITCH_WHITE = new BlockSwitch("concrete_switch_white");
	public static final Block STONE_SWITCH = new BlockSwitch("stone_switch");
	public static final Block GRANITE_SWITCH = new BlockSwitch("granite_switch");
	public static final Block ANDENSITE_SWITCH = new BlockSwitch("andesite_switch");
	public static final Block DIORITE_SWITCH = new BlockSwitch("diorite_switch");
	*/
	
	//halloween
	public static final Block SPECIAL_JACK_O_LANTERN = new BlockSpecialJackOLantern("special_jack_o_lantern");
	public static final Block CANDLE = new BlockCandle("candle");
	public static final Block TRICK_OR_TREAT_SIGN = new BlockHalloweenSign("trick_or_treat");
	
	public void registerSlabs() {
		//BlockIronSlab.itemify(IRON_SLAB, IRON_SLAB_DOUBLE);
	}
	
}
