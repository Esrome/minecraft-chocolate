package esrome.mcchoc;

import esrome.mcchoc.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MCChocCombat extends CreativeTabs {
	public MCChocCombat(String label) { super("mcChocCombatTab"); }
	public ItemStack getTabIconItem() { return new ItemStack(ModItems.TUNGSTEN_SWORD);}
}	
