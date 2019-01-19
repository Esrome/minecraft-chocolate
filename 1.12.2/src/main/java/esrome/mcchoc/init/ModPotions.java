package esrome.mcchoc.init;

import esrome.mcchoc.potions.CustomPotion;
import net.minecraft.init.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHelper;
import net.minecraft.potion.PotionType;
import net.minecraft.util.DamageSource;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModPotions {


	
	//1200 is a minute


		
	public static void registerPotions() {
		
		registerPotionMixes();
	}
	
	private static void registerPotion(PotionType defaultPotion, PotionType longPotion, PotionType strongPotion, Potion effect) {
		ForgeRegistries.POTIONS.register(effect);
		ForgeRegistries.POTION_TYPES.register(defaultPotion);
		ForgeRegistries.POTION_TYPES.register(longPotion);
		ForgeRegistries.POTION_TYPES.register(strongPotion);
	}
	
	private static void registerPotionMixes() {
	}
	
}
