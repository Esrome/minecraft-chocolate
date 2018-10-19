package esrome.mcchoc.blocks.bluestone;

import esrome.mcchoc.MinecraftChocolate;
import esrome.mcchoc.init.ModBlocks;
import esrome.mcchoc.init.ModItems;
import esrome.mcchoc.tileentity.bluestone.TileEntityCoalGenerator;
import esrome.mcchoc.util.IHasModel;
import esrome.mcchoc.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockCoalGenerator extends Block implements IHasModel {

	public BlockCoalGenerator(String name) {
		super(Material.IRON);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setHardness(3.0F);
		this.setHarvestLevel("pickaxe", 1);
		//this.setCreativeTab(MinecraftChocolate.BLUESTONE);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() 
	{
		MinecraftChocolate.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if(!worldIn.isRemote){
			playerIn.openGui(MinecraftChocolate.instance, Reference.COAL_GENERATOR_GUI, worldIn, pos.getX(), pos.getY(), pos.getZ());
		}
		return true;
	}
	
	@Override
	public boolean hasTileEntity(IBlockState state) {
		return true;
	}
	
	@Override
	public TileEntity createTileEntity(World world, IBlockState state) {
		return new TileEntityCoalGenerator();
	}
	
	@Override
	public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
		TileEntityCoalGenerator tileEntity = (TileEntityCoalGenerator)worldIn.getTileEntity(pos);
		worldIn.spawnEntity(new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), tileEntity.handler.getStackInSlot(0)));
		super.breakBlock(worldIn, pos, state);
	}
	
}
