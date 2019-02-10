package esrome.mcchoc;

import esrome.mcchoc.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MCChocTools extends CreativeTabs {
	public MCChocTools(String label) { super("mcChocToolsTab"); }
	public ItemStack getTabIconItem() { return new ItemStack(ModItems.SILVER_AXE);}
}	
