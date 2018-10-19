package esrome.mcchoc;

import esrome.mcchoc.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MCChoc extends CreativeTabs {
	public MCChoc(String label) { super("mcChoc"); }
	public ItemStack getTabIconItem() { return new ItemStack(ModItems.CHOCOLATE);}
}	
