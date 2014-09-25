// Date: 18/09/2014 18:45:53
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX


package fr.toss.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelLibellule extends ModelBase
{
  //fields
    ModelRenderer Corps;
    ModelRenderer AileGauche11;
    ModelRenderer AileDroite11;
    ModelRenderer AileGauche21;
    ModelRenderer AileDroite21;
    ModelRenderer AileGauche20;
    ModelRenderer AileGauche10;
    ModelRenderer AileDroite10;
    ModelRenderer AileDroite20;
  
  public ModelLibellule()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Corps = new ModelRenderer(this, 48, 0);
      Corps.addBox(-4F, 0F, 0F, 7, 1, 1);
      Corps.setRotationPoint(0F, 18F, 0F);
      Corps.setTextureSize(64, 32);
      Corps.mirror = true;
      setRotation(Corps, 0F, 0F, 0F);
      AileGauche11 = new ModelRenderer(this, 0, 20);
      AileGauche11.addBox(0F, 0F, 0F, 1, 0, 5);
      AileGauche11.setRotationPoint(1F, 18.5F, 0F);
      AileGauche11.setTextureSize(64, 32);
      AileGauche11.mirror = true;
      setRotation(AileGauche11, -0.1047198F, 0F, 0F);
      AileDroite11 = new ModelRenderer(this, 14, 20);
      AileDroite11.addBox(0F, 0F, -4F, 1, 0, 5);
      AileDroite11.setRotationPoint(1F, 18.5F, 0F);
      AileDroite11.setTextureSize(64, 32);
      AileDroite11.mirror = true;
      setRotation(AileDroite11, -0.1047198F, 0F, 0F);
      AileGauche21 = new ModelRenderer(this, 0, 20);
      AileGauche21.addBox(0F, 0F, 0F, 1, 0, 5);
      AileGauche21.setRotationPoint(-0.5F, 18.5F, 0F);
      AileGauche21.setTextureSize(64, 32);
      AileGauche21.mirror = true;
      setRotation(AileGauche21, 0.1047198F, 0F, 0F);
      AileDroite21 = new ModelRenderer(this, 14, 20);
      AileDroite21.addBox(0F, 0F, -4F, 1, 0, 5);
      AileDroite21.setRotationPoint(-0.5F, 18.5F, 0F);
      AileDroite21.setTextureSize(64, 32);
      AileDroite21.mirror = true;
      setRotation(AileDroite21, -0.1047198F, 0F, 0F);
      AileGauche20 = new ModelRenderer(this, 0, 20);
      AileGauche20.addBox(0F, 0F, 0F, 1, 0, 5);
      AileGauche20.setRotationPoint(-0.5F, 18.5F, 0F);
      AileGauche20.setTextureSize(64, 32);
      AileGauche20.mirror = true;
      setRotation(AileGauche20, -0.1047198F, 0F, 0F);
      AileGauche10 = new ModelRenderer(this, 0, 20);
      AileGauche10.addBox(0F, 0F, 0F, 1, 0, 5);
      AileGauche10.setRotationPoint(1F, 18.5F, 0F);
      AileGauche10.setTextureSize(64, 32);
      AileGauche10.mirror = true;
      setRotation(AileGauche10, 0.1047198F, 0F, 0F);
      AileDroite10 = new ModelRenderer(this, 14, 20);
      AileDroite10.addBox(0F, 0F, -4F, 1, 0, 5);
      AileDroite10.setRotationPoint(1F, 18.5F, 0F);
      AileDroite10.setTextureSize(64, 32);
      AileDroite10.mirror = true;
      setRotation(AileDroite10, 0.1047198F, 0F, 0F);
      AileDroite20 = new ModelRenderer(this, 14, 20);
      AileDroite20.addBox(0F, 0F, -4F, 1, 0, 5);
      AileDroite20.setRotationPoint(-0.5F, 18.5F, 0F);
      AileDroite20.setTextureSize(64, 32);
      AileDroite20.mirror = true;
      setRotation(AileDroite20, 0.1047198F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Corps.render(f5);
    AileGauche11.render(f5);
    AileDroite11.render(f5);
    AileGauche21.render(f5);
    AileDroite21.render(f5);
    AileGauche20.render(f5);
    AileGauche10.render(f5);
    AileDroite10.render(f5);
    AileDroite20.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
	  super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
	  this.AileDroite10.rotateAngleZ = (float) (Math.cos(f) / 2.0f);
	  this.AileDroite11.rotateAngleZ = (float) -(Math.cos(f) / 2.0f);
  }
}