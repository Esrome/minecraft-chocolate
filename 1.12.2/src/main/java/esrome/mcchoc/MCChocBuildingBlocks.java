package esrome.mcchoc;

import esrome.mcchoc.init.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class MCChocBuildingBlocks extends CreativeTabs {
	public MCChocBuildingBlocks(String label) { super("mcChocBuildingBlocksTab"); }
	public ItemStack getTabIconItem() { return new ItemStack(ModBlocks.COPPER_BLOCK);}
}	
