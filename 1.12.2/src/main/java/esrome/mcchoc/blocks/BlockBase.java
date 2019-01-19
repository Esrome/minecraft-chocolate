package esrome.mcchoc.blocks;

import esrome.mcchoc.MinecraftChocolate;
import esrome.mcchoc.init.ModBlocks;
import esrome.mcchoc.init.ModItems;
import esrome.mcchoc.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {
	
	public BlockBase(String name, Material material, float toughness, int harvestlevel, CreativeTabs creativeTab, MapColor color) 
	{
		super(material, color);
		if(!(harvestlevel == -1)){
			setHarvestLevel("pickaxe", harvestlevel);
		}
		if(material == Material.IRON){
			setSoundType(SoundType.METAL);
		}else{
			if(material == Material.ROCK){
				setSoundType(SoundType.STONE);
			}
		}
		setHardness(toughness);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(creativeTab);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	public BlockBase(String name, Material material, float toughness, int harvestlevel, SoundType type, CreativeTabs creativeTab, MapColor color) 
	{
		super(material, color);
		if(!(harvestlevel == -1)){
			setHarvestLevel("pickaxe", harvestlevel);
		}
		setSoundType(type);
		setHardness(toughness);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(creativeTab);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	public BlockBase(String name, Material material, float toughness, int harvestlevel, CreativeTabs creativeTab) 
	{
		super(material);
		if(!(harvestlevel == -1)){
			setHarvestLevel("pickaxe", harvestlevel);
		}
		if(material == Material.IRON){
			setSoundType(SoundType.METAL);
		}else{
			if(material == Material.ROCK){
				setSoundType(SoundType.STONE);
			}
		}
		setHardness(toughness);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(creativeTab);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	public BlockBase(String name, Material material, float toughness, int harvestlevel, SoundType type, CreativeTabs creativeTab) 
	{
		super(material);
		if(!(harvestlevel == -1)){
			setHarvestLevel("pickaxe", harvestlevel);
		}
		setSoundType(type);
		setHardness(toughness);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(creativeTab);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	public BlockBase(String name, Material material, float toughness, int harvestlevel, SoundType type) 
	{
		super(material);
		if(!(harvestlevel == -1)){
			setHarvestLevel("pickaxe", harvestlevel);
		}
		setSoundType(type);
		setHardness(toughness);
		setUnlocalizedName(name);
		setRegistryName(name);
		
		ModBlocks.BLOCKS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		MinecraftChocolate.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	
}
