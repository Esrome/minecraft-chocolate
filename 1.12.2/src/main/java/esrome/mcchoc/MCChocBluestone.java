package esrome.mcchoc;

import esrome.mcchoc.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MCChocBluestone extends CreativeTabs {
	public MCChocBluestone(String label) { super("mcChocBluestoneTab"); }
	//public ItemStack getTabIconItem() { return new ItemStack(ModItems.BLUESTONE_DUST);}

	@Override
	public ItemStack getTabIconItem() {
		return null;
	}
}	
