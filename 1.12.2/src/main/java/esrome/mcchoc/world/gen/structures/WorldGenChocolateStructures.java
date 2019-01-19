package esrome.mcchoc.world.gen.structures;

import java.util.ArrayList;
import java.util.Random;

import esrome.mcchoc.world.gen.WorldGenStructure;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeDesert;
import net.minecraft.world.biome.BiomeForest;
import net.minecraft.world.biome.BiomeForestMutated;
import net.minecraft.world.biome.BiomePlains;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import scala.actors.threadpool.Arrays;

public class WorldGenChocolateStructures implements IWorldGenerator{

	public static final WorldGenStructure BUNKER = new WorldGenStructure("bunker");
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.getDimension()) {
		case 1:
			break;
		case 0:
			generateStructure(BUNKER, world, random, chunkX, chunkZ, 100, Blocks.GRASS, 40, -2, BiomeForestMutated.class);
			generateStructure(BUNKER, world, random, chunkX, chunkZ, 100, Blocks.GRASS, 40, -2, BiomeForest.class);
			break;
		case -1:
			break;
		}
		
	}
	
	private void generateStructure(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int chance, Block topBlock, int minHeight, int heightMod, Class<?>... classes) {
		ArrayList<Class<?>> classesList = new ArrayList<Class<?>>(Arrays.asList(classes));
		
		int x = (chunkX * 16) + random.nextInt(15);
		int z = (chunkX * 16) + random.nextInt(15);
		int y = calculateFloorHeight(world, x, z, topBlock) + heightMod;
		BlockPos pos = new BlockPos(x,y,z);
		
		Class<?> biome = world.provider.getBiomeForCoords(pos).getClass();
		
		int ch = random.nextInt(chance);
		
		if(world.getWorldType() != WorldType.FLAT) {
			if(classesList.contains(biome) && y >= minHeight) {
				if(ch == 1) {
					generator.generate(world, random, pos);
					System.out.println("A bunker was spawned at: "+x+" "+y+" "+z+" : Chance - "+ch+" Congratulations");
				}else {
					System.out.println("A bunker was not spawned at: "+x+" "+y+" "+z+" : Chance - "+ch);
				}
			}
		}
	}
	
	private static int calculateFloorHeight(World world, int x, int z, Block topBlock) {
		int y = world.getHeight();
		boolean foundGround = false;
		
		while(!foundGround && y-- >= 0) {
			Block block = world.getBlockState(new BlockPos(x, y, z)).getBlock();
			foundGround = block == topBlock;
		}
		
		return y;
	}
	
}
