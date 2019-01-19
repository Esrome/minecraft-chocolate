package esrome.mcchoc.blocks.redstone;

import java.util.Random;

import esrome.mcchoc.MinecraftChocolate;
import esrome.mcchoc.blocks.BlockBase;
import esrome.mcchoc.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockRedstoneLamp extends BlockBase {
	private final boolean isOn;

    public BlockRedstoneLamp(boolean isOn, String name)
    {
    	super(name, Material.GLASS, 0.6f, -1, SoundType.GLASS);
    	this.isOn = isOn;

        if (isOn)
        {
            this.setLightLevel(1.0F);
        }
    }
    public BlockRedstoneLamp(String name)
    {
    	super(name, Material.GLASS, 0.6f, -1, SoundType.GLASS, MinecraftChocolate.REDSTONE);
    	this.isOn = false;
    }
    
    private static Block getOffBlock(IBlockState state) {
    	if(state.getBlock()==ModBlocks.BLACK_LAMP || state.getBlock()==ModBlocks.BLACK_LAMP_ON) {
    		return ModBlocks.BLACK_LAMP;
    	}
    	if(state.getBlock()==ModBlocks.RED_LAMP || state.getBlock()==ModBlocks.RED_LAMP_ON) {
    		return ModBlocks.RED_LAMP;
    	}
    	if(state.getBlock()==ModBlocks.GREEN_LAMP || state.getBlock()==ModBlocks.GREEN_LAMP_ON) {
    		return ModBlocks.GREEN_LAMP;
    	}
    	if(state.getBlock()==ModBlocks.BROWN_LAMP || state.getBlock()==ModBlocks.BROWN_LAMP_ON) {
    		return ModBlocks.BROWN_LAMP;
    	}
    	if(state.getBlock()==ModBlocks.BLUE_LAMP || state.getBlock()==ModBlocks.BLUE_LAMP_ON) {
    		return ModBlocks.BLUE_LAMP;
    	}
    	if(state.getBlock()==ModBlocks.PURPLE_LAMP || state.getBlock()==ModBlocks.PURPLE_LAMP_ON) {
    		return ModBlocks.PURPLE_LAMP;
    	}
    	if(state.getBlock()==ModBlocks.CYAN_LAMP || state.getBlock()==ModBlocks.CYAN_LAMP_ON) {
    		return ModBlocks.CYAN_LAMP;
    	}
    	if(state.getBlock()==ModBlocks.LIGHT_GRAY_LAMP || state.getBlock()==ModBlocks.LIGHT_GRAY_LAMP_ON) {
    		return ModBlocks.LIGHT_GRAY_LAMP;
    	}
    	if(state.getBlock()==ModBlocks.DARK_GRAY_LAMP || state.getBlock()==ModBlocks.DARK_GRAY_LAMP_ON) {
    		return ModBlocks.DARK_GRAY_LAMP;
    	}
    	if(state.getBlock()==ModBlocks.PINK_LAMP || state.getBlock()==ModBlocks.PINK_LAMP_ON) {
    		return ModBlocks.PINK_LAMP;
    	}
    	if(state.getBlock()==ModBlocks.YELLOW_LAMP || state.getBlock()==ModBlocks.YELLOW_LAMP_ON) {
    		return ModBlocks.YELLOW_LAMP;
    	}
    	if(state.getBlock()==ModBlocks.LIME_LAMP || state.getBlock()==ModBlocks.LIME_LAMP_ON) {
    		return ModBlocks.LIME_LAMP;
    	}
    	if(state.getBlock()==ModBlocks.MAGENTA_LAMP || state.getBlock()==ModBlocks.MAGENTA_LAMP_ON) {
    		return ModBlocks.MAGENTA_LAMP;
    	}
    	if(state.getBlock()==ModBlocks.WHITE_LAMP || state.getBlock()==ModBlocks.WHITE_LAMP_ON) {
    		return ModBlocks.WHITE_LAMP;
    	}
    	if(state.getBlock()==ModBlocks.ORANGE_LAMP || state.getBlock()==ModBlocks.ORANGE_LAMP_ON) {
    		return ModBlocks.ORANGE_LAMP;
    	}
    	if(state.getBlock()==ModBlocks.LIGHT_BLUE_LAMP || state.getBlock()==ModBlocks.LIGHT_BLUE_LAMP_ON) {
    		return ModBlocks.LIGHT_BLUE_LAMP;
    	}
    	return null;
    }

    private static Block getOnBlock(IBlockState state) {
    	if(state.getBlock()==ModBlocks.BLACK_LAMP || state.getBlock()==ModBlocks.BLACK_LAMP_ON) {
    		return ModBlocks.BLACK_LAMP_ON;
    	}
    	if(state.getBlock()==ModBlocks.RED_LAMP || state.getBlock()==ModBlocks.RED_LAMP_ON) {
    		return ModBlocks.RED_LAMP_ON;
    	}
    	if(state.getBlock()==ModBlocks.GREEN_LAMP || state.getBlock()==ModBlocks.GREEN_LAMP_ON) {
    		return ModBlocks.GREEN_LAMP_ON;
    	}
    	if(state.getBlock()==ModBlocks.BROWN_LAMP || state.getBlock()==ModBlocks.BROWN_LAMP_ON) {
    		return ModBlocks.BROWN_LAMP_ON;
    	}
    	if(state.getBlock()==ModBlocks.BLUE_LAMP || state.getBlock()==ModBlocks.BLUE_LAMP_ON) {
    		return ModBlocks.BLUE_LAMP_ON;
    	}
    	if(state.getBlock()==ModBlocks.PURPLE_LAMP || state.getBlock()==ModBlocks.PURPLE_LAMP_ON) {
    		return ModBlocks.PURPLE_LAMP_ON;
    	}
    	if(state.getBlock()==ModBlocks.CYAN_LAMP || state.getBlock()==ModBlocks.CYAN_LAMP_ON) {
    		return ModBlocks.CYAN_LAMP_ON;
    	}
    	if(state.getBlock()==ModBlocks.LIGHT_GRAY_LAMP || state.getBlock()==ModBlocks.LIGHT_GRAY_LAMP_ON) {
    		return ModBlocks.LIGHT_GRAY_LAMP_ON;
    	}
    	if(state.getBlock()==ModBlocks.DARK_GRAY_LAMP || state.getBlock()==ModBlocks.DARK_GRAY_LAMP_ON) {
    		return ModBlocks.DARK_GRAY_LAMP_ON;
    	}
    	if(state.getBlock()==ModBlocks.PINK_LAMP || state.getBlock()==ModBlocks.PINK_LAMP_ON) {
    		return ModBlocks.PINK_LAMP_ON;
    	}
    	if(state.getBlock()==ModBlocks.YELLOW_LAMP || state.getBlock()==ModBlocks.YELLOW_LAMP_ON) {
    		return ModBlocks.YELLOW_LAMP_ON;
    	}
    	if(state.getBlock()==ModBlocks.LIME_LAMP || state.getBlock()==ModBlocks.LIME_LAMP_ON) {
    		return ModBlocks.LIME_LAMP_ON;
    	}
    	if(state.getBlock()==ModBlocks.MAGENTA_LAMP || state.getBlock()==ModBlocks.MAGENTA_LAMP_ON) {
    		return ModBlocks.MAGENTA_LAMP_ON;
    	}
    	if(state.getBlock()==ModBlocks.WHITE_LAMP || state.getBlock()==ModBlocks.WHITE_LAMP_ON) {
    		return ModBlocks.WHITE_LAMP_ON;
    	}
    	if(state.getBlock()==ModBlocks.ORANGE_LAMP || state.getBlock()==ModBlocks.ORANGE_LAMP_ON) {
    		return ModBlocks.ORANGE_LAMP_ON;
    	}
    	if(state.getBlock()==ModBlocks.LIGHT_BLUE_LAMP || state.getBlock()==ModBlocks.LIGHT_BLUE_LAMP_ON) {
    		return ModBlocks.LIGHT_BLUE_LAMP_ON;
    	}
    	return null;
    }
    
    public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state)
    {
        if (!worldIn.isRemote)
        {
            if (this.isOn && !worldIn.isBlockPowered(pos))
            {
                worldIn.setBlockState(pos, getOffBlock(state).getDefaultState(), 2);
            }
            else if (!this.isOn && worldIn.isBlockPowered(pos))
            {
                worldIn.setBlockState(pos, getOnBlock(state).getDefaultState(), 2);
            }
        }
    }

    /**
     * Called when a neighboring block was changed and marks that this state should perform any checks during a neighbor
     * change. Cases may include when redstone power is updated, cactus blocks popping off due to a neighboring solid
     * block, etc.
     */
    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos)
    {
        if (!worldIn.isRemote)
        {
            if (this.isOn && !worldIn.isBlockPowered(pos))
            {
                worldIn.scheduleUpdate(pos, this, 4);
            }
            else if (!this.isOn && worldIn.isBlockPowered(pos))
            {
                worldIn.setBlockState(pos, getOnBlock(state).getDefaultState(), 2);
            }
        }
    }

    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        if (!worldIn.isRemote)
        {
            if (this.isOn && !worldIn.isBlockPowered(pos))
            {
                worldIn.setBlockState(pos, getOffBlock(state).getDefaultState(), 2);
            }
        }
    }

    /**
     * Get the Item that this Block should drop when harvested.
     */
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(getOffBlock(state));
    }

    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(getOffBlock(state));
    }

    protected ItemStack getSilkTouchDrop(IBlockState state)
    {
        return new ItemStack(getOffBlock(state));
    }
}
