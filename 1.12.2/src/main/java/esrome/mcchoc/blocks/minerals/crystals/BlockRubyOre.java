package esrome.mcchoc.blocks.minerals.crystals;

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

public class BlockRubyOre extends Block implements IHasModel{

	public BlockRubyOre(String name) 
	{
		super(Material.ROCK);
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe", 2);
		setHardness(3.0F);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(MinecraftChocolate.BUILDING_BLOCKS);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.RUBY;
	}
	
	public int quantityDropped(Random random)
    {
        return 1;
    }

    public int quantityDroppedWithBonus(int fortune, Random random)
    {
         return 1 + random.nextInt(fortune);
    }
	
	@Override
	public void registerModels() 
	{
		MinecraftChocolate.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	
}
