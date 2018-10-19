package esrome.mcchoc.gui.hud;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.fml.client.GuiNotification;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class Overlays {

	@SubscribeEvent
    public void onRenderGui(RenderGameOverlayEvent.Text event)
    {
		new ThirstGUI(Minecraft.getMinecraft());
    }
	
}
