package esrome.mcchoc.blocks.redstone;

import java.util.Random;

import esrome.mcchoc.MinecraftChocolate;
import esrome.mcchoc.blocks.BlockBase;
import esrome.mcchoc.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockSpikes extends BlockBase {
	
	private final boolean isOn;
    protected static final AxisAlignedBB AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D);

    public BlockSpikes(boolean isOn, String name)
    {
    	super(name, Material.GLASS, 2.0f, -1, SoundType.GLASS);
    	this.isOn = isOn;
    }
    public BlockSpikes(String name)
    {
    	super(name, Material.GLASS, 2.0f, -1, SoundType.GLASS, MinecraftChocolate.REDSTONE);
    	this.isOn = false;
    }
    
    @Override
    public boolean isFullBlock(IBlockState state) {
    	return false;
    }
    
    @Override
    public boolean isFullCube(IBlockState state) {
    	return false;
    }
    
    @Override
    public boolean isOpaqueCube(IBlockState state) {
    	return false;
    }
    
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return AABB;
    }
    
    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn)
    {
        if (entityIn instanceof EntityLivingBase && ((BlockSpikes)worldIn.getBlockState(pos).getBlock()).isOn)
        {
            entityIn.attackEntityFrom(DamageSource.CACTUS, 1.0F);
            if(worldIn.getBlockState(pos).getBlock()==ModBlocks.SPIKES_POISON_ON) {
            	((EntityLivingBase)entityIn).addPotionEffect(new PotionEffect(Potion.getPotionById(19), 10, 0));
            }
        }

        super.onEntityWalk(worldIn, pos, entityIn);
    }
    
    @Override
    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
    	if (entityIn instanceof EntityLivingBase && ((BlockSpikes)worldIn.getBlockState(pos).getBlock()).isOn)
        {
            entityIn.attackEntityFrom(DamageSource.CACTUS, 1.0F);
            if(worldIn.getBlockState(pos).getBlock()==ModBlocks.SPIKES_POISON_ON) {
            	((EntityLivingBase)entityIn).addPotionEffect(new PotionEffect(Potion.getPotionById(19), 10, 0));
            }
        }

        super.onEntityCollidedWithBlock(worldIn, pos, state, entityIn);
    }
    
    private static Block getOffBlock(IBlockState state) {
    	if(state.getBlock()==ModBlocks.SPIKES || state.getBlock()==ModBlocks.SPIKES_ON) {
    		return ModBlocks.SPIKES;
    	}
    	if(state.getBlock()==ModBlocks.SPIKES_POISON || state.getBlock()==ModBlocks.SPIKES_POISON_ON) {
    		return ModBlocks.SPIKES_POISON;
    	}
    	return null;
    }

    private static Block getOnBlock(IBlockState state) {
    	if(state.getBlock()==ModBlocks.SPIKES || state.getBlock()==ModBlocks.SPIKES_ON) {
    		return ModBlocks.SPIKES_ON;
    	}
    	if(state.getBlock()==ModBlocks.SPIKES_POISON || state.getBlock()==ModBlocks.SPIKES_POISON_ON) {
    		return ModBlocks.SPIKES_POISON_ON;
    	}
    	return null;
    }
    
    @Override
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
    @Override
    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos)
    {
        if (!worldIn.isRemote)
        {
        	if(!worldIn.getBlockState(pos.down()).getBlock().isFullBlock(worldIn.getBlockState(pos.down()))) {
        		worldIn.setBlockToAir(pos);
        		worldIn.spawnEntity(new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(getOffBlock(state))));
        		return;
        	}
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

    @Override
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
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(getOffBlock(state));
    }

    @Override
    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(getOffBlock(state));
    }

    @Override
    protected ItemStack getSilkTouchDrop(IBlockState state)
    {
        return new ItemStack(getOffBlock(state));
    }
}
