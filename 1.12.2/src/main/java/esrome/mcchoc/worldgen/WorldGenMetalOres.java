package esrome.mcchoc.worldgen;

import java.util.Random;

import esrome.mcchoc.blocks.minerals.metals.BlockOres;
import esrome.mcchoc.init.ModBlocks;
import esrome.mcchoc.util.handlers.EnumHandler;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenMetalOres implements IWorldGenerator {

	private WorldGenerator ore_overworld_steel, ore_overworld_copper, ore_overworld_lead, ore_overworld_titanium, ore_overworld_aluminum, ore_overworld_silver, ore_overworld_magnesium, ore_overworld_bronze, ore_overworld_rose_quartz;
	
	public WorldGenMetalOres(){
		ore_overworld_steel = new WorldGenMinable(ModBlocks.MINECRAFT_CHOCOLATE_ORES.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumMetalType.STEEL), 8, BlockMatcher.forBlock(Blocks.STONE));
		ore_overworld_lead = new WorldGenMinable(ModBlocks.MINECRAFT_CHOCOLATE_ORES.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumMetalType.LEAD), 8, BlockMatcher.forBlock(Blocks.STONE));
		ore_overworld_copper = new WorldGenMinable(ModBlocks.MINECRAFT_CHOCOLATE_ORES.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumMetalType.COPPER), 8, BlockMatcher.forBlock(Blocks.STONE));
		ore_overworld_silver = new WorldGenMinable(ModBlocks.MINECRAFT_CHOCOLATE_ORES.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumMetalType.SILVER), 8, BlockMatcher.forBlock(Blocks.STONE));
		ore_overworld_aluminum = new WorldGenMinable(ModBlocks.MINECRAFT_CHOCOLATE_ORES.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumMetalType.ALUMINUM), 8, BlockMatcher.forBlock(Blocks.STONE));
		ore_overworld_titanium = new WorldGenMinable(ModBlocks.MINECRAFT_CHOCOLATE_ORES.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumMetalType.TITANIUM), 8, BlockMatcher.forBlock(Blocks.STONE));
		ore_overworld_bronze = new WorldGenMinable(ModBlocks.MINECRAFT_CHOCOLATE_ORES.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumMetalType.BRONZE), 8, BlockMatcher.forBlock(Blocks.STONE));
		ore_overworld_magnesium = new WorldGenMinable(ModBlocks.MINECRAFT_CHOCOLATE_ORES.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumMetalType.MAGNESIUM), 8, BlockMatcher.forBlock(Blocks.STONE));
		ore_overworld_rose_quartz = new WorldGenMinable(ModBlocks.ROSE_QUARTZ_ORE.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.STONE));
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkx, int chunkz, int chance, int minHeight, int maxHeight){
		if (minHeight > maxHeight || minHeight < 0|| maxHeight > 256){
			throw new IllegalArgumentException("Ore out of bounds or heights are reversed.");
		}
		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chance ; i++){
			int x = chunkx * 16 + rand.nextInt(16);
			int z = chunkz * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			gen.generate(world, rand, new BlockPos(x, y, z));
		}
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.getDimension()){
		case 0:
			for(int a = 0; a < 3; a++){
				Random rand = new Random();
				int ore = 1 + rand.nextInt(8);
					if(ore == 1) runGenerator(ore_overworld_steel, world, random, chunkX, chunkZ, 4, 0, 48);
					if(ore == 2) runGenerator(ore_overworld_lead, world, random, chunkX, chunkZ, 4, 0, 36);
					if(ore == 3) runGenerator(ore_overworld_copper, world, random, chunkX, chunkZ, 5, 0, 60);
					if(ore == 4) runGenerator(ore_overworld_aluminum, world, random, chunkX, chunkZ, 5, 0, 60);
					if(ore == 5) runGenerator(ore_overworld_titanium, world, random, chunkX, chunkZ, 5, 0, 60);
					if(ore == 6) runGenerator(ore_overworld_silver, world, random, chunkX, chunkZ, 3, 0, 6);
					if(ore == 7) runGenerator(ore_overworld_magnesium, world, random, chunkX, chunkZ, 5, 0, 56);
					if(ore == 8) runGenerator(ore_overworld_bronze, world, random, chunkX, chunkZ, 5, 0, 56);
					if(ore == 9) runGenerator(ore_overworld_rose_quartz, world, random, chunkX, chunkZ, 2, 0, 36);
			}
			break;
		case -1:
			break;
		case 1:
			
		}
	}
	
}
