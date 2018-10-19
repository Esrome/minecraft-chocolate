package esrome.mcchoc.blocks.bluestone;

import java.util.Random;

import esrome.mcchoc.MinecraftChocolate;
import esrome.mcchoc.init.ModBlocks;
import esrome.mcchoc.init.ModItems;
import esrome.mcchoc.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBluestoneOre extends Block implements IHasModel {

	public BlockBluestoneOre(String name) {
		super(Material.ROCK);
		
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		
		//this.setCreativeTab(MinecraftChocolate.BLUESTONE);
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(3.0F);
		this.setLightLevel(0.1F);
		this.setSoundType(SoundType.STONE);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		//return ModItems.BLUESTONE_DUST;
		return null;
	}
	
	@Override
	public int quantityDropped(IBlockState state, int fortune, Random random) {
		return (1 + random.nextInt(3)) * fortune;
	}
	
	@Override
	public void registerModels() 
	{
		MinecraftChocolate.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	
}
