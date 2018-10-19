package esrome.mcchoc.items.halloween.costume;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelReaperCostume - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelReaperCostume extends ModelBiped {
    public ModelRenderer Back1;
    public ModelRenderer Back2;
    public ModelRenderer Back3;
    public ModelRenderer LeftSleeve;
    public ModelRenderer RightSleeve;
    public ModelRenderer Core;
    public ModelRenderer Back;

    public ModelReaperCostume() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.LeftSleeve = new ModelRenderer(this, 0, 20);
        this.LeftSleeve.setRotationPoint(5.0F, 1.5F, -0.5F);
        this.LeftSleeve.addBox(-1.0F, -2.0F, -2.0F, 5, 5, 5, 0.0F);
        this.Core = new ModelRenderer(this, 24, 16);
        this.Core.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Core.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.Back = new ModelRenderer(this, 0, 0);
        this.Back.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Back.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Back2 = new ModelRenderer(this, 36, 0);
        this.Back2.setRotationPoint(0.0F, 11.0F, 2.5F);
        this.Back2.addBox(-5.5F, 0.0F, 0.0F, 11, 6, 1, 0.0F);
        this.Back1 = new ModelRenderer(this, 0, 0);
        this.Back1.setRotationPoint(0.0F, -0.5F, -2.5F);
        this.Back1.addBox(-4.5F, 0.0F, 0.0F, 9, 12, 5, 0.0F);
        this.RightSleeve = new ModelRenderer(this, 0, 20);
        this.RightSleeve.setRotationPoint(-5.5F, 1.5F, -0.5F);
        this.RightSleeve.addBox(-3.0F, -2.0F, -2.0F, 5, 5, 5, 0.0F);
        this.Back3 = new ModelRenderer(this, 0, 36);
        this.Back3.setRotationPoint(0.0F, 17.0F, 3.5F);
        this.Back3.addBox(-6.5F, 0.0F, 0.0F, 13, 5, 1, 0.0F);
        
        this.bipedHead.addChild(Core);
        this.bipedHead.addChild(Back);
        
        this.bipedBody.addChild(Back1);
        this.bipedBody.addChild(Back2);
        this.bipedBody.addChild(Back3);
        this.bipedLeftArm.addChild(LeftSleeve);
        this.bipedRightArm.addChild(RightSleeve);
    }
    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
