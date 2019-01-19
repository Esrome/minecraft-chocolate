package esrome.mcchoc.items.tools;

import esrome.mcchoc.MinecraftChocolate;
import esrome.mcchoc.init.ModItems;
import esrome.mcchoc.util.IHasModel;
import net.minecraft.item.ItemSpade;

public class ItemShovelBase extends ItemSpade implements IHasModel {

	public ItemShovelBase(ToolMaterial material, String name){
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(MinecraftChocolate.TOOLS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		MinecraftChocolate.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}
