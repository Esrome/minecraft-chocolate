package esrome.mcchoc.util.handlers;

import esrome.mcchoc.init.ModItems;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.IStringSerializable;

public class EnumHandler {

	public static enum EnumBlockHalf implements IStringSerializable{
		TOP(0, "top"),
		BOTTOM(1, "bottom"),
		DOUBLE(2, "double");
		
		private static final EnumBlockHalf[] META_LOOKUP = new EnumBlockHalf[values().length];
		private final int meta;
		private final String name, unlocalizedName;
		
		private EnumBlockHalf(int meta, String name){
			this(meta, name, name);
		}
		
		private EnumBlockHalf(int meta, String name, String unlocalizedName){
			this.meta = meta;
			this.name = name;
			this.unlocalizedName = unlocalizedName;
		}
		
		@Override
		public String getName(){
			return this.name;
		}
	
		@Override
		public String toString(){
			return this.name;
		}
	
		public String getUnlocalizedName(){
			return this.unlocalizedName;
		}
		
		public int getMeta(){
			return this.meta;
		}
		
		public static EnumBlockHalf byMetadata(int meta){
			return META_LOOKUP[meta];
		}
		
		static{
			for(EnumBlockHalf enumtype : values()){
				META_LOOKUP[enumtype.getMeta()] = enumtype;
			}
		}
	}
	
	public static enum EnumMetalType implements IStringSerializable{
		
		SILVER(0, "silver", 2),
		LEAD(1, "lead", 1),
		COPPER(2, "copper", 2),
		STEEL(3, "steel", 2),
		ALUMINUM(4, "aluminum", 1),
		TITANIUM(5, "titanium", 2),
		BRONZE(6, "bronze", 2),
		MAGNESIUM(7, "tungsten", 3);
		
		private static final EnumMetalType[] META_LOOKUP = new EnumMetalType[values().length];
		private final int meta, harvestLevel;
		private final String name, unlocalizedName;
		
		private EnumMetalType(int meta, String name, int harvestLevel){
			this(meta, name, name, harvestLevel);
		}
		
		private EnumMetalType(int meta, String name, String unlocalizedName, int harvestLevel){
			this.meta = meta;
			this.name = name;
			this.unlocalizedName = unlocalizedName;
			this.harvestLevel = harvestLevel;
		}
		
		@Override
		public String getName(){
			return this.name;
		}
	
		@Override
		public String toString(){
			return this.name;
		}
	
		public String getUnlocalizedName(){
			return this.unlocalizedName;
		}
		
		public int getMeta(){
			return this.meta;
		}
		
		public int getHarvestLevel(){
			return this.harvestLevel;
		}
		
		public static EnumMetalType byMetadata(int meta){
			return META_LOOKUP[meta];
		}
		
		static{
			for(EnumMetalType enumtype : values()){
				META_LOOKUP[enumtype.getMeta()] = enumtype;
			}
		}
	}
}
