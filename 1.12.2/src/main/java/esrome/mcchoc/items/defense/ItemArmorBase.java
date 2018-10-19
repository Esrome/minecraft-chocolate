package esrome.mcchoc.items.defense;

import esrome.mcchoc.MinecraftChocolate;
import esrome.mcchoc.init.ModItems;
import esrome.mcchoc.util.IHasModel;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemArmorBase extends ItemArmor implements IHasModel {

	public ItemArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) 
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(MinecraftChocolate.MINERALS);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		MinecraftChocolate.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}
