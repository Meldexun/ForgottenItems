// Date: 16.02.2017 21:54:36
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package tschipp.forgottenitems.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCushionedBoots extends ModelBiped
{
	//fields
	private ModelRenderer Right1;
	private ModelRenderer Left1;
	private ModelRenderer Right2;
	private ModelRenderer Left2;

	public ModelCushionedBoots(float scale)
	{
		super(scale, 0, 64, 32);
		textureWidth = 64;
		textureHeight = 32;

		Right1 = new ModelRenderer(this, 36, 0);
		Right1.addBox(-3F, 10F, -5F, 6, 3, 8);
		Right1.setRotationPoint(0f,0f,0f);
		Right1.setTextureSize(64, 32);
		Right1.mirror = true;
		setRotation(Right1, 0F, 0F, 0F);
		Left1 = new ModelRenderer(this, 36, 0);
		Left1.addBox(-3F, 10F, -5F, 6, 3, 8);
		Left1.setRotationPoint(0,0,0);
		Left1.setTextureSize(64, 32);
		Left1.mirror = true;
		setRotation(Left1, 0F, 0F, 0F);
		Right2 = new ModelRenderer(this, 0, 0);
		Right2.addBox(-3F, 7F, -3F, 6, 3, 6);
		Right2.setRotationPoint(0,0,0);
		Right2.setTextureSize(64, 32);
		Right2.mirror = true;
		setRotation(Right2, 0F, 0F, 0F);
		Left2 = new ModelRenderer(this, 0, 0);
		Left2.addBox(-3F, 7F, -3F, 6, 3, 6);
		Left2.setRotationPoint(0,0,0);
		Left2.setTextureSize(64, 32);
		Left2.mirror = true;
		setRotation(Left2, 0F, 0F, 0F);
		
		this.bipedRightLeg.addChild(Right1);
		this.bipedRightLeg.addChild(Right2);
		this.bipedLeftLeg.addChild(Left1);
		this.bipedLeftLeg.addChild(Left2);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);

	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	

}