package esrome.mcchoc.gui.hud;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;

public class ThirstGUI extends Gui {

	public ThirstGUI(Minecraft mc)
    {
        ScaledResolution scaled = new ScaledResolution(mc);
        int width = scaled.getScaledWidth();
        int height = scaled.getScaledHeight();
 
        drawCenteredString(mc.fontRenderer, "Welcome", width / 2, (height / 2) - 4, Integer.parseInt("FFAA00", 16));
    }
	
}
