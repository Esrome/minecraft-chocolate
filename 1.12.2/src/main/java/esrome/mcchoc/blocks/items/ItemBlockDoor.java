package esrome.mcchoc.blocks.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockDoor.EnumDoorHalf;
import net.minecraft.block.BlockDoor.EnumHingePosition;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemBlockDoor extends ItemBlock {

	public ItemBlockDoor(Block block) {
		super(block);
	}

	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if (facing != EnumFacing.UP) {
			return EnumActionResult.FAIL;
		}else {
			IBlockState state = worldIn.getBlockState(pos);
			Block bottomDoorBlock = state.getBlock();
			if(!block.isReplaceable(worldIn, pos)) {
				pos = pos.offset(facing);
			}
				
			ItemStack stack = player.getHeldItem(hand);
			if(player.canPlayerEdit(pos, facing, stack) && this.block.canPlaceBlockAt(worldIn, pos)) {
				EnumFacing playerFacing = EnumFacing.fromAngle((double)player.rotationYaw);
				int x = playerFacing.getFrontOffsetX();
				int y = playerFacing.getFrontOffsetY();
				int z = playerFacing.getFrontOffsetZ();
				boolean flag = x < 0 && hitZ < 0.5F || x > 0 && hitZ > 0.5F || z < 0 && hitX < 0.5F || z > 0 && hitX > 0.5F;
				placeDoor(worldIn, pos, playerFacing, this.block, flag);
				SoundType sound = block.getSoundType(state, worldIn, pos, player);
				worldIn.playSound(player, pos, sound.getPlaceSound(), SoundCategory.BLOCKS, (sound.getVolume() * 1.0F) / 2.0F, sound.getPitch() * 0.8F);
				
				stack.shrink(1);
				return EnumActionResult.SUCCESS;
			}
		}
		return EnumActionResult.FAIL;
		
	}

	private static void placeDoor(World worldIn, BlockPos bottomDoor, EnumFacing playerFacing, Block door, boolean flag) {
		BlockPos posYClockwise = bottomDoor.offset(playerFacing.rotateY());
		BlockPos posYCounterclockwise = bottomDoor.offset(playerFacing.rotateYCCW());
		
		int i = (worldIn.getBlockState(posYCounterclockwise).isNormalCube() ? 1 : 0) + (worldIn.getBlockState(posYCounterclockwise.up()).isNormalCube() ? 1 : 0);
		int j = (worldIn.getBlockState(posYClockwise).isNormalCube() ? 1 : 0) + (worldIn.getBlockState(posYClockwise.up()).isNormalCube() ? 1 : 0);
		
		boolean flag2 = worldIn.getBlockState(posYCounterclockwise).getBlock() == door || worldIn.getBlockState(posYCounterclockwise.up()).getBlock() == door;
		boolean flag3 = worldIn.getBlockState(posYClockwise).getBlock() == door || worldIn.getBlockState(posYClockwise.up()).getBlock() == door;
		
		if((!flag2 || flag3) && j <= 1) {
			if (flag3 && !flag2 || j < 1) {
				flag = false;
			}
		}else {
			flag = true;
		}
		
		BlockPos topDoor = bottomDoor.up();
		boolean flag4 = worldIn.isBlockPowered(bottomDoor) || worldIn.isBlockPowered(topDoor);
		IBlockState doorState = door.getDefaultState().withProperty(BlockDoor.FACING, playerFacing).withProperty(BlockDoor.HINGE, flag ? EnumHingePosition.RIGHT :  EnumHingePosition.LEFT).withProperty(BlockDoor.POWERED, flag4);
		worldIn.setBlockState(bottomDoor, doorState.withProperty(BlockDoor.HALF, EnumDoorHalf.LOWER));
		worldIn.setBlockState(topDoor, doorState.withProperty(BlockDoor.HALF, EnumDoorHalf.UPPER));
		worldIn.notifyNeighborsOfStateChange(bottomDoor, door, false);
		worldIn.notifyNeighborsOfStateChange(topDoor, door, false);
	}
	
}
