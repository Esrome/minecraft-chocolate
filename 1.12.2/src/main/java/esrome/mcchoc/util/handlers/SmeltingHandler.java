package esrome.mcchoc.util.handlers;

import java.util.Random;

import esrome.mcchoc.init.ModBlocks;
import esrome.mcchoc.init.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingHandler {

	public static void addRecipes(){
		Random rand = new Random();
		GameRegistry.addSmelting(new ItemStack(ModBlocks.MINECRAFT_CHOCOLATE_ORES, 1, 0), new ItemStack(ModItems.SILVER_INGOT, 1), 1.0f);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.MINECRAFT_CHOCOLATE_ORES, 1, 1), new ItemStack(ModItems.LEAD_INGOT, 1), 1.0f);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.MINECRAFT_CHOCOLATE_ORES, 1, 2), new ItemStack(ModItems.COPPER_INGOT, 1), 1.0f);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.MINECRAFT_CHOCOLATE_ORES, 1, 3), new ItemStack(ModItems.STEEL_INGOT, 1), 1.0f);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.MINECRAFT_CHOCOLATE_ORES, 1, 4), new ItemStack(ModItems.ALUMINUM_INGOT, 1), 1.0f);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.MINECRAFT_CHOCOLATE_ORES, 1, 5), new ItemStack(ModItems.TITANIUM_INGOT, 1), 1.0f);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.MINECRAFT_CHOCOLATE_ORES, 1, 6), new ItemStack(ModItems.BRONZE_INGOT, 1), 1.0f);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.MINECRAFT_CHOCOLATE_ORES, 1, 7), new ItemStack(ModItems.MAGNESIUM_INGOT, 1), 1.0f);
		GameRegistry.addSmelting(new ItemStack(Blocks.REEDS), new ItemStack(ModItems.WAX, 1), 0.1f);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.RUBY_ORE, 1), new ItemStack(ModItems.RUBY, 1), 1.0f);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.AMETHYST_ORE, 1), new ItemStack(ModItems.AMETHYST, 1), 1.0f);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.CARNELIAN_ORE, 1), new ItemStack(ModItems.CARNELIAN, 1), 1.0f);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.MALACHITE_ORE, 1), new ItemStack(ModItems.MALACHITE, 1), 1.0f);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.SAPPHIRE_ORE, 1), new ItemStack(ModItems.SAPPHIRE, 1), 1.0f);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.PERIDOT_ORE, 1), new ItemStack(ModItems.PERIDOT, 1), 1.0f);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.TURQUOISE_ORE, 1), new ItemStack(ModItems.TURQUOISE, 1), 1.0f);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.ROSE_QUARTZ_ORE, 1), new ItemStack(ModItems.ROSE_QUARTZ, 1), 1.0f);
	}
	
}
