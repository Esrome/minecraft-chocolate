package esrome.mcchoc.world.event.dispenser;

import net.minecraft.block.BlockColored;
import net.minecraft.block.BlockDispenser;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.BlockStainedGlass;
import net.minecraft.block.BlockStainedGlassPane;
import net.minecraft.block.BlockStainedHardenedClay;
import net.minecraft.dispenser.BehaviorDefaultDispenseItem;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.dispenser.IPosition;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class DispenserColourBehaviour extends BehaviorDefaultDispenseItem {

	public ItemStack dispenseStack(IBlockSource source, ItemStack stack)
    {
        World world = source.getWorld();
        IPosition iposition = BlockDispenser.getDispensePosition(source);
        EnumFacing enumfacing = (EnumFacing)source.getBlockState().getValue(BlockDispenser.FACING);
        if(world.getBlockState(source.getBlockPos().offset(enumfacing)).getBlock()==Blocks.WOOL) {
        	world.setBlockState(source.getBlockPos().offset(enumfacing), Blocks.WOOL.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.byDyeDamage(stack.getMetadata())));
            stack.shrink(1);
            for(int i = 2;i<9;i++) {
            	if(world.getBlockState(source.getBlockPos().offset(enumfacing, i)).getBlock()==Blocks.WOOL) {
            		world.setBlockState(source.getBlockPos().offset(enumfacing, i), Blocks.WOOL.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.byDyeDamage(stack.getMetadata())));
                    stack.shrink(1);
            	}else {
            		i = 9;
            	}
            }
        }else if(world.getBlockState(source.getBlockPos().offset(enumfacing)).getBlock()==Blocks.GLASS||world.getBlockState(source.getBlockPos().offset(enumfacing)).getBlock()==Blocks.STAINED_GLASS) {
        	world.setBlockState(source.getBlockPos().offset(enumfacing), Blocks.STAINED_GLASS.getDefaultState().withProperty(BlockStainedGlass.COLOR, EnumDyeColor.byDyeDamage(stack.getMetadata())));
            stack.shrink(1);
            for(int i = 2;i<9;i++) {
            	if(world.getBlockState(source.getBlockPos().offset(enumfacing, i)).getBlock()==Blocks.GLASS||world.getBlockState(source.getBlockPos().offset(enumfacing, i)).getBlock()==Blocks.STAINED_GLASS) {
            		world.setBlockState(source.getBlockPos().offset(enumfacing, i), Blocks.STAINED_GLASS.getDefaultState().withProperty(BlockStainedGlass.COLOR, EnumDyeColor.byDyeDamage(stack.getMetadata())));
                    stack.shrink(1);
            	}else {
            		i = 9;
            	}
            }
        }else if(world.getBlockState(source.getBlockPos().offset(enumfacing)).getBlock()==Blocks.GLASS_PANE||world.getBlockState(source.getBlockPos().offset(enumfacing)).getBlock()==Blocks.STAINED_GLASS_PANE) {
        	world.setBlockState(source.getBlockPos().offset(enumfacing), Blocks.STAINED_GLASS_PANE.getDefaultState().withProperty(BlockStainedGlassPane.COLOR, EnumDyeColor.byDyeDamage(stack.getMetadata())));
            stack.shrink(1);
            for(int i = 2;i<9;i++) {
            	if(world.getBlockState(source.getBlockPos().offset(enumfacing, i)).getBlock()==Blocks.GLASS_PANE||world.getBlockState(source.getBlockPos().offset(enumfacing, i)).getBlock()==Blocks.STAINED_GLASS_PANE) {
            		world.setBlockState(source.getBlockPos().offset(enumfacing, i), Blocks.STAINED_GLASS_PANE.getDefaultState().withProperty(BlockStainedGlassPane.COLOR, EnumDyeColor.byDyeDamage(stack.getMetadata())));
                    stack.shrink(1);
            	}else {
            		i = 9;
            	}
            }
        }else if(world.getBlockState(source.getBlockPos().offset(enumfacing)).getBlock()==Blocks.HARDENED_CLAY||world.getBlockState(source.getBlockPos().offset(enumfacing)).getBlock()==Blocks.STAINED_HARDENED_CLAY) {
        	world.setBlockState(source.getBlockPos().offset(enumfacing), Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockStainedHardenedClay.COLOR, EnumDyeColor.byDyeDamage(stack.getMetadata())));
            stack.shrink(1);
            for(int i = 2;i<9;i++) {
            	if(world.getBlockState(source.getBlockPos().offset(enumfacing, i)).getBlock()==Blocks.HARDENED_CLAY||world.getBlockState(source.getBlockPos().offset(enumfacing, i)).getBlock()==Blocks.STAINED_HARDENED_CLAY) {
            		world.setBlockState(source.getBlockPos().offset(enumfacing, i), Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockStainedHardenedClay.COLOR, EnumDyeColor.byDyeDamage(stack.getMetadata())));
                    stack.shrink(1);
            	}else {
            		i = 9;
            	}
            }
        }
        return stack;
    }

    protected void playDispenseSound(IBlockSource source)
    {
        source.getWorld().playEvent(1002, source.getBlockPos(), 0);
    }
	
}
