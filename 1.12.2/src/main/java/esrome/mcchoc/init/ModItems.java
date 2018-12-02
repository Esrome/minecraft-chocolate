package esrome.mcchoc.init;

import java.util.ArrayList;
import java.util.List;

import esrome.mcchoc.MinecraftChocolate;
import esrome.mcchoc.items.ItemBase;
import esrome.mcchoc.items.defense.ItemArmorBase;
import esrome.mcchoc.items.food.ItemFoodBase;
import esrome.mcchoc.items.tools.ItemAxeBase;
import esrome.mcchoc.items.tools.ItemHoeBase;
import esrome.mcchoc.items.tools.ItemPickaxeBase;
import esrome.mcchoc.items.tools.ItemShovelBase;
import esrome.mcchoc.items.tools.ItemSwordBase;
import esrome.mcchoc.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
	public static final ToolMaterial COPPERT = EnumHelper.addToolMaterial("copper", 1, 176, 5.0F, 1.5F, 9);
	public static final ToolMaterial LEADT = EnumHelper.addToolMaterial("lead", 2, 250, 6.0F, 2.0F, 14);
	public static final ToolMaterial SILVERT = EnumHelper.addToolMaterial("silver", 2, 350, 9.0F, 2.0F, 19);
	public static final ToolMaterial STEELT = EnumHelper.addToolMaterial("steel", 2, 750, 7.0F, 3.0F, 15);
	public static final ToolMaterial ALUMINUMT = EnumHelper.addToolMaterial("aluminum", 1, 136, 4.0F, 1.0F, 7);
	public static final ToolMaterial TITANIUMT = EnumHelper.addToolMaterial("titanium", 2, 550, 6.6F, 3.0F, 14);
	public static final ToolMaterial MAGNESIUMT = EnumHelper.addToolMaterial("magnesium", 0, 56, 3.0F, 1.0F, 8);
	public static final ToolMaterial BRONZET = EnumHelper.addToolMaterial("bronze", 1, 256, 5.5F, 3.0F, 7);
	
	public static final ArmorMaterial COPPERA = EnumHelper.addArmorMaterial("copper", Reference.MODID + ":copper", 10, new int[]{1, 3, 5, 2}, 11, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial LEADA = EnumHelper.addArmorMaterial("lead", Reference.MODID + ":lead", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial SILVERA = EnumHelper.addArmorMaterial("silver", Reference.MODID + ":silver", 18, new int[]{2, 5, 7, 3}, 18, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
	public static final ArmorMaterial STEELA = EnumHelper.addArmorMaterial("steel", Reference.MODID + ":steel", 20, new int[]{2, 6, 7, 3}, 16, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ALUMINUMA = EnumHelper.addArmorMaterial("aluminum", Reference.MODID + ":aluminum", 8, new int[]{1, 2, 3, 2}, 11, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial TITANIUMA = EnumHelper.addArmorMaterial("titanium", Reference.MODID + ":titanium", 10, new int[]{1, 3, 5, 2}, 11, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial MAGNESIUMA = EnumHelper.addArmorMaterial("magnesium", Reference.MODID + ":magnesium", 6, new int[]{1, 2, 2, 1}, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BRONZEA = EnumHelper.addArmorMaterial("bronze", Reference.MODID + ":bronze", 13, new int[]{2, 4, 5, 3}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	public static final ArmorMaterial REAPER = EnumHelper.addArmorMaterial("reaper", Reference.MODID + ":reaper", 5, new int[]{1, 2, 3, 1}, 0, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//copper
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot", MinecraftChocolate.MINERALS);
	public static final Item COPPER_NUGGET = new ItemBase("copper_nugget", MinecraftChocolate.MINERALS);
	public static final Item COPPER_SWORD = new ItemSwordBase(COPPERT, "copper_sword");
	public static final Item COPPER_HOE = new ItemHoeBase(COPPERT, "copper_hoe");
	public static final Item COPPER_SPADE = new ItemShovelBase(COPPERT, "copper_spade");
	public static final Item COPPER_PICKAXE = new ItemPickaxeBase(COPPERT, "copper_pickaxe");
	public static final Item COPPER_AXE = new ItemAxeBase("copper_axe", COPPERT);
	public static final Item COPPER_HELMET = new ItemArmorBase("copper_helmet", COPPERA, 1, EntityEquipmentSlot.HEAD);
	public static final Item COPPER_CHESTPLATE = new ItemArmorBase("copper_chestplate", COPPERA, 1, EntityEquipmentSlot.CHEST);
	public static final Item COPPER_LEGGINGS = new ItemArmorBase("copper_leggings", COPPERA, 2, EntityEquipmentSlot.LEGS);
	public static final Item COPPER_BOOTS = new ItemArmorBase("copper_boots", COPPERA, 1, EntityEquipmentSlot.FEET);
	//lead
	public static final Item LEAD_INGOT = new ItemBase("lead_ingot", MinecraftChocolate.MINERALS);
	public static final Item LEAD_NUGGET = new ItemBase("lead_nugget", MinecraftChocolate.MINERALS);
	public static final Item LEAD_SWORD = new ItemSwordBase(LEADT, "lead_sword");
	public static final Item LEAD_HOE = new ItemHoeBase(LEADT, "lead_hoe");
	public static final Item LEAD_SPADE = new ItemShovelBase(LEADT, "lead_spade");
	public static final Item LEAD_PICKAXE = new ItemPickaxeBase(LEADT, "lead_pickaxe");
	public static final Item LEAD_AXE = new ItemAxeBase("lead_axe", LEADT);
	public static final Item LEAD_HELMET = new ItemArmorBase("lead_helmet", LEADA, 1, EntityEquipmentSlot.HEAD);
	public static final Item LEAD_CHESTPLATE = new ItemArmorBase("lead_chestplate", LEADA, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEAD_LEGGINGS = new ItemArmorBase("lead_leggings", LEADA, 2, EntityEquipmentSlot.LEGS);
	public static final Item LEAD_BOOTS = new ItemArmorBase("lead_boots", LEADA, 1, EntityEquipmentSlot.FEET);
	//silver
	public static final Item SILVER_INGOT = new ItemBase("silver_ingot", MinecraftChocolate.MINERALS);
	public static final Item SILVER_NUGGGET = new ItemBase("silver_nugget", MinecraftChocolate.MINERALS);
	public static final Item SILVER_SWORD = new ItemSwordBase(SILVERT, "silver_sword");
	public static final Item SILVER_HOE = new ItemHoeBase(SILVERT, "silver_hoe");
	public static final Item SILVER_SPADE = new ItemShovelBase(SILVERT, "silver_spade");
	public static final Item SILVER_PICKAXE = new ItemPickaxeBase(SILVERT, "silver_pickaxe");
	public static final Item SILVER_AXE = new ItemAxeBase("silver_axe", SILVERT);
	public static final Item SILVER_HELMET = new ItemArmorBase("silver_helmet", SILVERA, 1, EntityEquipmentSlot.HEAD);
	public static final Item SILVER_CHESTPLATE = new ItemArmorBase("silver_chestplate", SILVERA, 1, EntityEquipmentSlot.CHEST);
	public static final Item SILVER_LEGGINGS = new ItemArmorBase("silver_leggings", SILVERA, 2, EntityEquipmentSlot.LEGS);
	public static final Item SILVER_BOOTS = new ItemArmorBase("silver_boots", SILVERA, 1, EntityEquipmentSlot.FEET);
	//steel
	public static final Item STEEL_INGOT = new ItemBase("steel_ingot", MinecraftChocolate.MINERALS);
	public static final Item STEEL_NUGGGET = new ItemBase("steel_nugget", MinecraftChocolate.MINERALS);
	public static final Item STEEL_SWORD = new ItemSwordBase(STEELT, "steel_sword");
	public static final Item STEEL_HOE = new ItemHoeBase(STEELT, "steel_hoe");
	public static final Item STEEL_SPADE = new ItemShovelBase(STEELT, "steel_spade");
	public static final Item STEEL_PICKAXE = new ItemPickaxeBase(STEELT, "steel_pickaxe");
	public static final Item STEEL_AXE = new ItemAxeBase("steel_axe", STEELT);
	public static final Item STEEL_HELMET = new ItemArmorBase("steel_helmet", STEELA, 1, EntityEquipmentSlot.HEAD);
	public static final Item STEEL_CHESTPLATE = new ItemArmorBase("steel_chestplate", STEELA, 1, EntityEquipmentSlot.CHEST);
	public static final Item STEEL_LEGGINGS = new ItemArmorBase("steel_leggings", STEELA, 2, EntityEquipmentSlot.LEGS);
	public static final Item STEEL_BOOTS = new ItemArmorBase("steel_boots", STEELA, 1, EntityEquipmentSlot.FEET);
	//aluminum
	public static final Item ALUMINUM_INGOT = new ItemBase("aluminum_ingot", MinecraftChocolate.MINERALS);
	public static final Item ALUMINUM_NUGGGET = new ItemBase("aluminum_nugget", MinecraftChocolate.MINERALS);
	public static final Item ALUMINUM_SWORD = new ItemSwordBase(ALUMINUMT, "aluminum_sword");
	public static final Item ALUMINUM_HOE = new ItemHoeBase(ALUMINUMT, "aluminum_hoe");
	public static final Item ALUMINUM_SPADE = new ItemShovelBase(ALUMINUMT, "aluminum_spade");
	public static final Item ALUMINUM_PICKAXE = new ItemPickaxeBase(ALUMINUMT, "aluminum_pickaxe");
	public static final Item ALUMINUM_AXE = new ItemAxeBase("aluminum_axe", ALUMINUMT);
	public static final Item ALUMINUM_HELMET = new ItemArmorBase("aluminum_helmet", ALUMINUMA, 1, EntityEquipmentSlot.HEAD);
	public static final Item ALUMINUM_CHESTPLATE = new ItemArmorBase("aluminum_chestplate", ALUMINUMA, 1, EntityEquipmentSlot.CHEST);
	public static final Item ALUMINUM_LEGGINGS = new ItemArmorBase("aluminum_leggings", ALUMINUMA, 2, EntityEquipmentSlot.LEGS);
	public static final Item ALUMINUM_BOOTS = new ItemArmorBase("aluminum_boots", ALUMINUMA, 1, EntityEquipmentSlot.FEET);
	//titanium
	public static final Item TITANIUM_INGOT = new ItemBase("titanium_ingot", MinecraftChocolate.MINERALS);
	public static final Item TITANIUM_NUGGET = new ItemBase("titanium_nugget", MinecraftChocolate.MINERALS);
	public static final Item TITANIUM_SWORD = new ItemSwordBase(TITANIUMT, "titanium_sword");
	public static final Item TITANIUM_HOE = new ItemHoeBase(TITANIUMT, "titanium_hoe");
	public static final Item TITANIUM_SPADE = new ItemShovelBase(TITANIUMT, "titanium_spade");
	public static final Item TITANIUM_PICKAXE = new ItemPickaxeBase(TITANIUMT, "titanium_pickaxe");
	public static final Item TITANIUM_AXE = new ItemAxeBase("titanium_axe", TITANIUMT);
	public static final Item TITANIUM_HELMET = new ItemArmorBase("titanium_helmet", TITANIUMA, 1, EntityEquipmentSlot.HEAD);
	public static final Item TITANIUM_CHESTPLATE = new ItemArmorBase("titanium_chestplate", TITANIUMA, 1, EntityEquipmentSlot.CHEST);
	public static final Item TITANIUM_LEGGINGS = new ItemArmorBase("titanium_leggings", TITANIUMA, 2, EntityEquipmentSlot.LEGS);
	public static final Item TITANIUM_BOOTS = new ItemArmorBase("titanium_boots", TITANIUMA, 1, EntityEquipmentSlot.FEET);
	//magnesium
	public static final Item MAGNESIUM_INGOT = new ItemBase("magnesium_ingot", MinecraftChocolate.MINERALS);
	public static final Item MAGNESIUM_NUGGET = new ItemBase("magnesium_nugget", MinecraftChocolate.MINERALS);
	public static final Item MAGNESIUM_SWORD = new ItemSwordBase(MAGNESIUMT, "magnesium_sword");
	public static final Item MAGNESIUM_HOE = new ItemHoeBase(MAGNESIUMT, "magnesium_hoe");
	public static final Item MAGNESIUM_SPADE = new ItemShovelBase(MAGNESIUMT, "magnesium_spade");
	public static final Item MAGNESIUM_PICKAXE = new ItemPickaxeBase(MAGNESIUMT, "magnesium_pickaxe");
	public static final Item MAGNESIUM_AXE = new ItemAxeBase("magnesium_axe", MAGNESIUMT);
	public static final Item MAGNESIUM_HELMET = new ItemArmorBase("magnesium_helmet", MAGNESIUMA, 1, EntityEquipmentSlot.HEAD);
	public static final Item MAGNESIUM_CHESTPLATE = new ItemArmorBase("magnesium_chestplate", MAGNESIUMA, 1, EntityEquipmentSlot.CHEST);
	public static final Item MAGNESIUM_LEGGINGS = new ItemArmorBase("magnesium_leggings", MAGNESIUMA, 2, EntityEquipmentSlot.LEGS);
	public static final Item MAGNESIUM_BOOTS = new ItemArmorBase("magnesium_boots", MAGNESIUMA, 1, EntityEquipmentSlot.FEET);
	//bronze
	public static final Item BRONZE_INGOT = new ItemBase("bronze_ingot", MinecraftChocolate.MINERALS);
	public static final Item BRONZE_NUGGET = new ItemBase("bronze_nugget", MinecraftChocolate.MINERALS);
	public static final Item BRONZE_SWORD = new ItemSwordBase(BRONZET, "bronze_sword");
	public static final Item BRONZE_HOE = new ItemHoeBase(BRONZET, "bronze_hoe");
	public static final Item BRONZE_SPADE = new ItemShovelBase(BRONZET, "bronze_spade");
	public static final Item BRONZE_PICKAXE = new ItemPickaxeBase(BRONZET, "bronze_pickaxe");
	public static final Item BRONZE_AXE = new ItemAxeBase("bronze_axe", BRONZET);
	public static final Item BRONZE_HELMET = new ItemArmorBase("bronze_helmet", BRONZEA, 1, EntityEquipmentSlot.HEAD);
	public static final Item BRONZE_CHESTPLATE = new ItemArmorBase("bronze_chestplate", BRONZEA, 1, EntityEquipmentSlot.CHEST);
	public static final Item BRONZE_LEGGINGS = new ItemArmorBase("bronze_leggings", BRONZEA, 2, EntityEquipmentSlot.LEGS);
	public static final Item BRONZE_BOOTS = new ItemArmorBase("bronze_boots", BRONZEA, 1, EntityEquipmentSlot.FEET);
	//rose_quartz
	public static final Item ROSE_QUARTZ = new ItemBase("rose_quartz", MinecraftChocolate.MINERALS);
	//sapphire
	public static final Item SAPPHIRE = new ItemBase("sapphire", MinecraftChocolate.MINERALS);
	//ruby
	public static final Item RUBY = new ItemBase("ruby", MinecraftChocolate.MINERALS);
	//amethyst
	public static final Item AMETHYST = new ItemBase("amethyst", MinecraftChocolate.MINERALS);
	//peridot
	public static final Item PERIDOT = new ItemBase("peridot", MinecraftChocolate.MINERALS);
	//malachite
	public static final Item MALACHITE = new ItemBase("malachite", MinecraftChocolate.MINERALS);
	//carnelian
	public static final Item CARNELIAN = new ItemBase("carnelian", MinecraftChocolate.MINERALS);
	//turquoise
	public static final Item TURQUOISE = new ItemBase("turquoise", MinecraftChocolate.MINERALS);
	
	/*
	//costumes
	public static final Item REAPER_MASK = new ItemCostumeBase(REAPER, "reaper_mask", EntityEquipmentSlot.HEAD);
	public static final Item REAPER_ROBE = new ItemCostumeBase(REAPER, "reaper_robe", EntityEquipmentSlot.CHEST);
	public static final Item REAPER_PANTS = new ItemCostumeBase(REAPER, "reaper_pants", EntityEquipmentSlot.LEGS);
	public static final Item REAPER_BOOTS = new ItemCostumeBase(REAPER, "reaper_boots", EntityEquipmentSlot.FEET);
	
	//shields
	public static final Item ROUND_SHIELD = new ItemRoundShield("round_shield");
	
	//food
	public static final Item TOMATO = new ItemFoodBase("tomato", 3, 2.4F, MinecraftChocolate.MINECRAFT_CHOCOLATE);
	*/
	
	//miscellaneous
	public static final Item CHOCOLATE = new ItemFoodBase("chocolate", 3, 2.4F, MinecraftChocolate.MINECRAFT_CHOCOLATE);
	public static final Item WAX = new ItemBase("wax", MinecraftChocolate.MINECRAFT_CHOCOLATE);
	
}
