package esrome.mcchoc.items.food;

import esrome.mcchoc.MinecraftChocolate;
import esrome.mcchoc.init.ModBlocks;
import esrome.mcchoc.init.ModItems;
import esrome.mcchoc.util.IHasModel;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

public class ItemTomato extends ItemFood implements IHasModel, IPlantable {

	public ItemTomato(String name, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(MinecraftChocolate.MINECRAFT_CHOCOLATE);
		
		ModItems.ITEMS.add(this);
	}
	
	public ItemTomato(String name, int amount, float saturation) {
		super(amount, saturation, false);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(MinecraftChocolate.MINECRAFT_CHOCOLATE);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		MinecraftChocolate.proxy.registerItemRenderer(this, 0, "inventory");
	}

	@Override
	public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
		return EnumPlantType.Crop;
	}

	@Override
	public IBlockState getPlant(IBlockAccess world, BlockPos pos) {
		return ModBlocks.TOMATO_PLANT.getDefaultState();
	}
	
	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		ItemStack stack = player.getHeldItem(hand);
		IBlockState state = worldIn.getBlockState(pos);
		if(facing == EnumFacing.UP && player.canPlayerEdit(pos.offset(facing), facing, stack) && state.getBlock().canSustainPlant(state, worldIn, pos, EnumFacing.UP, this) && worldIn.isAirBlock(pos.up())){
			worldIn.setBlockState(pos.up(), ModBlocks.TOMATO_PLANT.getDefaultState());
			stack.shrink(1);
			return EnumActionResult.SUCCESS;
		}else{
			return EnumActionResult.FAIL;
		}
	}
	
}
