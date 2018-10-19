package esrome.mcchoc.blocks;

import esrome.mcchoc.MinecraftChocolate;
import esrome.mcchoc.init.ModBlocks;
import esrome.mcchoc.init.ModItems;
import esrome.mcchoc.util.IHasModel;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockModStairs extends BlockStairs implements IHasModel {

	public BlockModStairs(IBlockState modelState, String name, CreativeTabs tab) {
		super(modelState);
		setSoundType(SoundType.WOOD);
		setHardness(0.8F);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
        setLightOpacity(255);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public boolean getUseNeighborBrightness(IBlockState state) {
		return true;
	}
	
	@Override
	public void registerModels() 
	{
		MinecraftChocolate.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	
}
