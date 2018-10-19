package esrome.mcchoc;

import esrome.mcchoc.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MCChocMinerals extends CreativeTabs {
	public MCChocMinerals(String label) { super("mcChocMineralsTab"); }
	public ItemStack getTabIconItem() { return new ItemStack(ModItems.SILVER_INGOT);}
}	
