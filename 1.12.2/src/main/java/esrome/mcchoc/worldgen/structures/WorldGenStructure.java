package esrome.mcchoc.worldgen.structures;

import java.util.Random;

import esrome.mcchoc.util.IStructure;
import esrome.mcchoc.util.Reference;
import net.minecraft.block.state.IBlockState;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.template.Template;
import net.minecraft.world.gen.structure.template.TemplateManager;

public class WorldGenStructure extends WorldGenerator implements IStructure{

	public static String structureName;
	
	public WorldGenStructure(String name) {
		this.structureName = name;
	}
	
	
	@Override
	public boolean generate(World worldIn, Random rand, BlockPos position) {
		this.generateStrucutre(worldIn, position);
		return true;
	}

	public static void generateStrucutre(World world, BlockPos pos) {
		MinecraftServer mcServer = world.getMinecraftServer();
		TemplateManager manager = worldServer.getStructureTemplateManager();
		ResourceLocation location = new ResourceLocation(Reference.MODID, structureName);
		Template template = manager.getTemplate(mcServer, location);
		
		if(template != null) {
			IBlockState state = world.getBlockState(pos);
			world.notifyBlockUpdate(pos, state, state, 3);
			template.addBlocksToWorldChunk(world, pos, settings);
		}
	}
	
}
