package esrome.mcchoc.util.handlers;

import java.util.Random;

import net.minecraft.util.Rotation;

public class RandomHandler {

	public static Rotation randomRotation() {
		Random random = new Random();
		int rot = random.nextInt(4);
		if(rot <= 1) {
			return Rotation.NONE;
		}else if(rot == 2) {
			return Rotation.CLOCKWISE_180;
		}else if(rot == 3) {
			return Rotation.CLOCKWISE_90;
		}else {
			return Rotation.COUNTERCLOCKWISE_90;
		}
	}
	
}
