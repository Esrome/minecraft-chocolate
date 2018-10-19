package esrome.mcchoc.items;

import esrome.mcchoc.MinecraftChocolate;
import esrome.mcchoc.init.ModItems;
import esrome.mcchoc.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name, CreativeTabs creativeTab){
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(creativeTab);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		MinecraftChocolate.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}
