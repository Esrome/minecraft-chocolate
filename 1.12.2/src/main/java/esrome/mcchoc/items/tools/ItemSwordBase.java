package esrome.mcchoc.items.tools;

import esrome.mcchoc.MinecraftChocolate;
import esrome.mcchoc.init.ModItems;
import esrome.mcchoc.util.IHasModel;
import net.minecraft.item.ItemSword;

public class ItemSwordBase extends ItemSword implements IHasModel {

	public ItemSwordBase(ToolMaterial material, String name){
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(MinecraftChocolate.MINERALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		MinecraftChocolate.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}
