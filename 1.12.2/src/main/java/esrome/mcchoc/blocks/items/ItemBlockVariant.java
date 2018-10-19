package esrome.mcchoc.blocks.items;

import esrome.mcchoc.util.IMetaName;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockVariant extends ItemBlock {

	public ItemBlockVariant(Block block) {
		super(block);
		setHasSubtypes(true);
		setMaxDamage(0);
	}
	
	@Override
	public int getMetadata(int damage){
		return damage;
	}
	
	@Override
	public String getUnlocalizedName(){
		return getUnlocalizedName(new ItemStack(this));
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack){
		return super.getUnlocalizedName() + "_" + ((IMetaName)this.block).getSpecialName(stack);
	}
	
}
