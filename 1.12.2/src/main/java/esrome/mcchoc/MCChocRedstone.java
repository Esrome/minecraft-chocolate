package esrome.mcchoc;

import esrome.mcchoc.init.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class MCChocRedstone extends CreativeTabs {
	public MCChocRedstone(String label) { super("mcChocRedstoneTab"); }
	public ItemStack getTabIconItem() { return new ItemStack(ModBlocks.RED_LAMP);}
}	
