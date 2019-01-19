package esrome.mcchoc.items.food;

import esrome.mcchoc.MinecraftChocolate;
import esrome.mcchoc.init.ModItems;
import esrome.mcchoc.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemFoodBase extends ItemFood implements IHasModel {

	public ItemFoodBase(String name, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(MinecraftChocolate.MINECRAFT_CHOCOLATE);
		
		ModItems.ITEMS.add(this);
	}
	
	public ItemFoodBase(String name, int amount, float saturation, CreativeTabs tab) {
		super(amount, saturation, false);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		MinecraftChocolate.proxy.registerItemRenderer(this, 0, "inventory");
	}
		
}
