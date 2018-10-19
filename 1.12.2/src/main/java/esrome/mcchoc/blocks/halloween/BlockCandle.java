package esrome.mcchoc.blocks.halloween;

import java.util.Random;

import esrome.mcchoc.MinecraftChocolate;
import esrome.mcchoc.init.ModBlocks;
import esrome.mcchoc.init.ModItems;
import esrome.mcchoc.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockNote;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockCandle extends Block implements IHasModel {

	protected static final AxisAlignedBB CANDLE_BB = new AxisAlignedBB(0.3125D, 0.0D, 0.3125D, 0.6875D, 0.375D, 0.6875D);
	
	public BlockCandle(String name) {
		super(Material.CLAY);
		setSoundType(SoundType.STONE);
		
		setHardness(0.0F);
		setUnlocalizedName(name);
		setRegistryName(name);
		setLightLevel(3.0F);
		setCreativeTab(MinecraftChocolate.MINECRAFT_CHOCOLATE);
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return CANDLE_BB;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@SideOnly(Side.CLIENT)
    public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand)
    {
       double d0 = (double)pos.getX() + 0.5D;
       double d1 = (double)pos.getY() + rand.nextDouble() * 6.0D / 16.0D;
       double d2 = (double)pos.getZ() + 0.5D;
       double d3 = 0.52D;
       double d4 = rand.nextDouble() * 0.6D - 0.3D;

       if (rand.nextDouble() < 0.1D)
       {
           worldIn.playSound((double)pos.getX() + 0.5D, (double)pos.getY(), (double)pos.getZ() + 0.5D, SoundEvents.BLOCK_FURNACE_FIRE_CRACKLE, SoundCategory.BLOCKS, 1.0F, 1.0F, false);
       }
       worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0, d1, d2 + d4, 0.0D, 0.0D, 0.0D);
       worldIn.spawnParticle(EnumParticleTypes.FLAME, d0, d1, d2 + d4, 0.0D, 0.0D, 0.0D);
    }
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
	@Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
		return null;
	}
	
	@Override
	public void registerModels() 
	{
		MinecraftChocolate.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

}
