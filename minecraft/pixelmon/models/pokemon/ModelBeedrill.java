package pixelmon.models.pokemon;

import net.minecraft.src.Entity;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelBeedrill extends ModelBase
{
  //fields
    ModelRenderer BEEDRILL;
    ModelRenderer LEFT_LEG;
    ModelRenderer LEFT_LEG_CALF;
    ModelRenderer LEFT_FOOT;
    ModelRenderer RIGHT_LEG;
    ModelRenderer RIGHT_LEG_CALF;
    ModelRenderer RIGHT_FOOT;
    ModelRenderer BODY;
    ModelRenderer LEFT_ARM;
    ModelRenderer LA_SECONDARY;
    ModelRenderer LEFT_ARM_STINGER;
    ModelRenderer RIGHT_ARM;
    ModelRenderer RA_SECONDARY;
    ModelRenderer RIGHT_ARM_STINGER;
    ModelRenderer HEAD;
    ModelRenderer LEFT_EAR;
    ModelRenderer LEFT_EAR_END;
    ModelRenderer RIGHT_EAR;
    ModelRenderer RIGHT_EAR_END;
    ModelRenderer RIGHT_WING_TOP;
    ModelRenderer RIGHT_WING_BOTTOM;
    ModelRenderer LEFT_WING_TOP;
    ModelRenderer LEFT_WING_BOTTOM;
    ModelRenderer STINGER;
  
  public ModelBeedrill()
  {
    textureWidth = 512;
    textureHeight = 256;
    
    BEEDRILL = new ModelRenderer(this, "BEEDRILL");
    BEEDRILL.setRotationPoint(0F, 0F, 0F);
    setRotation(BEEDRILL, 0F, 0F, 0F);
    BEEDRILL.mirror = true;
    LEFT_LEG = new ModelRenderer(this, "LEFT_LEG");
    LEFT_LEG.setRotationPoint(6F, 4F, 0F);
    setRotation(LEFT_LEG, 0F, 0F, 0F);
    LEFT_LEG.mirror = true;
      ModelRenderer  Llb = new ModelRenderer(this, 200, 0);
      Llb.addBox(-6F, 1F, 2F, 2, 20, 1);
      Llb.setRotationPoint(-6F, -4F, 0F);
      Llb.setTextureSize(512, 256);
      Llb.mirror = true;
      setRotation(Llb, 0F, 0.418879F, -0.8203047F);
      ModelRenderer  Llb_2 = new ModelRenderer(this, 200, 0);
      Llb_2.addBox(-5.5F, 1.5F, 1.5F, 1, 19, 2);
      Llb_2.setRotationPoint(-6F, -4F, 0F);
      Llb_2.setTextureSize(512, 256);
      Llb_2.mirror = true;
      setRotation(Llb_2, 0F, 0.418879F, -0.8203047F);
      
      LEFT_LEG.addChild(Llb);
      LEFT_LEG.addChild(Llb_2);
      BEEDRILL.addChild(LEFT_LEG);
      
    LEFT_LEG_CALF = new ModelRenderer(this, "LEFT_LEG_CALF");
    LEFT_LEG_CALF.setRotationPoint(12F, 11.5F, -5F);
    setRotation(LEFT_LEG_CALF, 0F, 0F, 0F);
    LEFT_LEG_CALF.mirror = true;
      ModelRenderer Llc_main = new ModelRenderer(this, 200, 0);
      Llc_main.addBox(-1.3F, -1F, -1.5F, 2, 17, 3);
      Llc_main.setRotationPoint(0F, 0F, 0F);
      Llc_main.setTextureSize(512, 256);
      Llc_main.mirror = true;
      setRotation(Llc_main, 0F, 0F, 0F);
      ModelRenderer  Llc_secondary = new ModelRenderer(this, 200, 0);
      Llc_secondary.addBox(-1.8F, 0F, -1F, 3, 15, 2);
      Llc_secondary.setRotationPoint(0F, 0F, 0F);
      Llc_secondary.setTextureSize(512, 256);
      Llc_secondary.mirror = true;
      setRotation(Llc_secondary, 0F, 0F, 0F);
      
      LEFT_LEG_CALF.addChild(Llc_main);
      LEFT_LEG_CALF.addChild(Llc_secondary);
      LEFT_LEG.addChild(LEFT_LEG_CALF);
      
    LEFT_FOOT = new ModelRenderer(this, "LEFT_FOOT");
    LEFT_FOOT.setRotationPoint(-0.3F, 16F, 0F);
    setRotation(LEFT_FOOT, 0F, 0F, 0F);
    LEFT_FOOT.mirror = true;
      ModelRenderer  lf_1 = new ModelRenderer(this, 200, 0);
      lf_1.addBox(-0.5F, 0F, -1.5F, 1, 6, 2);
      lf_1.setRotationPoint(0F, 0F, 0F);
      lf_1.setTextureSize(512, 256);
      lf_1.mirror = true;
      setRotation(lf_1, 0F, 0F, 0F);
      ModelRenderer lf_2 = new ModelRenderer(this, 200, 0);
      lf_2.addBox(-0.5F, 4F, -7.5F, 1, 2, 7);
      lf_2.setRotationPoint(0F, 0F, 0F);
      lf_2.setTextureSize(512, 256);
      lf_2.mirror = true;
      setRotation(lf_2, 0F, 0F, 0F);
      ModelRenderer lf_3 = new ModelRenderer(this, 200, 0);
      lf_3.addBox(-0.5F, 5F, -8.5F, 1, 1, 10);
      lf_3.setRotationPoint(0F, 0F, 0F);
      lf_3.setTextureSize(512, 256);
      lf_3.mirror = true;
      setRotation(lf_3, 0F, 0F, 0F);
      ModelRenderer lf_4 = new ModelRenderer(this, 200, 0);
      lf_4.addBox(-1F, 1.5F, -1F, 2, 4, 1);
      lf_4.setRotationPoint(0F, 0F, 0F);
      lf_4.setTextureSize(512, 256);
      lf_4.mirror = true;
      setRotation(lf_4, 0F, 0F, 0F);
      ModelRenderer  lf_5 = new ModelRenderer(this, 200, 0);
      lf_5.addBox(-1F, 4.5F, -7F, 2, 1, 6);
      lf_5.setRotationPoint(0F, 0F, 0F);
      lf_5.setTextureSize(512, 256);
      lf_5.mirror = true;
      setRotation(lf_5, 0F, 0F, 0F);
      
      
      
    RIGHT_LEG = new ModelRenderer(this, "RIGHT_LEG");
    RIGHT_LEG.setRotationPoint(-6F, 4F, 0F);
    setRotation(RIGHT_LEG, 0F, 0F, 0F);
    RIGHT_LEG.mirror = true;
      ModelRenderer Rlb_Secondary = new ModelRenderer(this, 200, 0);
      Rlb_Secondary.addBox(4.5F, 0F, 1.5F, 1, 20, 2);
      Rlb_Secondary.setRotationPoint(6F, -4F, 0F);
      Rlb_Secondary.setTextureSize(512, 256);
      Rlb_Secondary.mirror = true;
      setRotation(Rlb_Secondary, 0F, -0.418879F, 0.8203047F);
      ModelRenderer Rlb_main = new ModelRenderer(this, 200, 0);
      Rlb_main.addBox(4F, 1F, 2F, 2, 20, 1);
      Rlb_main.setRotationPoint(6F, -4F, 0F);
      Rlb_main.setTextureSize(512, 256);
      Rlb_main.mirror = true;
      setRotation(Rlb_main, 0F, -0.418879F, 0.8203047F);
    RIGHT_LEG_CALF = new ModelRenderer(this, "RIGHT_LEG_CALF");
    RIGHT_LEG_CALF.setRotationPoint(-11.5F, 11.5F, -5F);
    setRotation(RIGHT_LEG_CALF, 0F, 0F, 0F);
    RIGHT_LEG_CALF.mirror = true;
      ModelRenderer Rlc_main = new ModelRenderer(this, 200, 0);
      Rlc_main.addBox(-1.3F, -1F, -1.5F, 2, 17, 3);
      Rlc_main.setRotationPoint(0F, 0F, 0F);
      Rlc_main.setTextureSize(512, 256);
      Rlc_main.mirror = true;
      setRotation(Rlc_main, 0F, 0F, 0F);
      ModelRenderer  Rlg_secondary = new ModelRenderer(this, 200, 0);
      Rlg_secondary.addBox(-1.8F, 0F, -1F, 3, 15, 2);
      Rlg_secondary.setRotationPoint(0F, 0F, 0F);
      Rlg_secondary.setTextureSize(512, 256);
      Rlg_secondary.mirror = true;
      setRotation(Rlg_secondary, 0F, 0F, 0F);
    RIGHT_FOOT = new ModelRenderer(this, "RIGHT_FOOT");
    RIGHT_FOOT.setRotationPoint(-0.3F, 16F, 0F);
    setRotation(RIGHT_FOOT, 0F, 0F, 0F);
    RIGHT_FOOT.mirror = true;
      ModelRenderer  rf_1 = new ModelRenderer(this, 200, 0);
      rf_1.addBox(-0.5F, 0F, -0.5F, 1, 6, 2);
      rf_1.setRotationPoint(0F, 0F, 0F);
      rf_1.setTextureSize(512, 256);
      rf_1.mirror = true;
      setRotation(rf_1, 0F, 0F, 0F);
      ModelRenderer rf_2 = new ModelRenderer(this, 200, 0);
      rf_2.addBox(-0.5F, 4F, -6.5F, 1, 2, 7);
      rf_2.setRotationPoint(0F, 0F, 0F);
      rf_2.setTextureSize(512, 256);
      rf_2.mirror = true;
      setRotation(rf_2, 0F, 0F, 0F);
      ModelRenderer  rf_3 = new ModelRenderer(this, 200, 0);
      rf_3.addBox(-0.5F, 5F, -7.5F, 1, 1, 10);
      rf_3.setRotationPoint(0F, 0F, 0F);
      rf_3.setTextureSize(512, 256);
      rf_3.mirror = true;
      setRotation(rf_3, 0F, 0F, 0F);
      ModelRenderer rf_4 = new ModelRenderer(this, 200, 0);
      rf_4.addBox(-1F, 1.5F, 0F, 2, 4, 1);
      rf_4.setRotationPoint(0F, 0F, 0F);
      rf_4.setTextureSize(512, 256);
      rf_4.mirror = true;
      setRotation(rf_4, 0F, 0F, 0F);
      ModelRenderer rf_5 = new ModelRenderer(this, 200, 0);
      rf_5.addBox(-1F, 4.5F, -6F, 2, 1, 6);
      rf_5.setRotationPoint(0F, 0F, 0F);
      rf_5.setTextureSize(512, 256);
      rf_5.mirror = true;
      setRotation(rf_5, 0F, 0F, 0F);

      
      
    BODY = new ModelRenderer(this, "BODY");
    BODY.setRotationPoint(0F, 0F, 0F);
    setRotation(BODY, 0F, 0F, 0F);
    BODY.mirror = true;
      ModelRenderer Body_middle = new ModelRenderer(this, 0, 233);
      Body_middle.addBox(-5F, -6F, -5F, 10, 12, 10);
      Body_middle.setRotationPoint(0F, 0F, 0F);
      Body_middle.setTextureSize(512, 256);
      Body_middle.mirror = true;
      setRotation(Body_middle, 0F, 0F, 0F);
      ModelRenderer Body_Horizontal_middle = new ModelRenderer(this, 0, 236);
      Body_Horizontal_middle.addBox(-6F, -5F, -4F, 12, 10, 8);
      Body_Horizontal_middle.setRotationPoint(0F, 0F, 0F);
      Body_Horizontal_middle.setTextureSize(512, 256);
      Body_Horizontal_middle.mirror = true;
      setRotation(Body_Horizontal_middle, 0F, 0F, 0F);
      ModelRenderer Body_Vertical_middle = new ModelRenderer(this, 0, 233);
      Body_Vertical_middle.addBox(-4F, -7F, -4F, 8, 14, 8);
      Body_Vertical_middle.setRotationPoint(0F, 0F, 0F);
      Body_Vertical_middle.setTextureSize(512, 256);
      Body_Vertical_middle.mirror = true;
      setRotation(Body_Vertical_middle, 0F, 0F, 0F);
      ModelRenderer  Body_Front_middle = new ModelRenderer(this, 0, 233);
      Body_Front_middle.addBox(-4F, -5F, -6F, 8, 10, 12);
      Body_Front_middle.setRotationPoint(0F, 0F, 0F);
      Body_Front_middle.setTextureSize(512, 256);
      Body_Front_middle.mirror = true;
      setRotation(Body_Front_middle, 0F, 0F, 0F);
    LEFT_ARM = new ModelRenderer(this, "LEFT_ARM");
    LEFT_ARM.setRotationPoint(6F, -3F, 0F);
    setRotation(LEFT_ARM, 0F, 0F, 0F);
    LEFT_ARM.mirror = true;
      ModelRenderer la_base_1 = new ModelRenderer(this, 200, 0);
      la_base_1.addBox(-4F, -4F, -0.5F, 13, 2, 1);
      la_base_1.setRotationPoint(-6F, 4F, 0F);
      la_base_1.setTextureSize(512, 256);
      la_base_1.mirror = true;
      setRotation(la_base_1, 0F, 0F, 0.5759587F);
      ModelRenderer  la_base_2 = new ModelRenderer(this, 200, 0);
      la_base_2.addBox(-3F, -3.5F, -1F, 11, 1, 2);
      la_base_2.setRotationPoint(-6F, 4F, 0F);
      la_base_2.setTextureSize(512, 256);
      la_base_2.mirror = true;
      setRotation(la_base_2, 0F, 0F, 0.5759587F);
    LA_SECONDARY = new ModelRenderer(this, "LA_SECONDARY");
    LA_SECONDARY.setRotationPoint(9F, 5.5F, 0F);
    setRotation(LA_SECONDARY, 0F, 0F, 0F);
    LA_SECONDARY.mirror = true;
      ModelRenderer Lasb_1 = new ModelRenderer(this, 200, 0);
      Lasb_1.addBox(-1F, -9F, -9F, 2, 1, 9);
      Lasb_1.setRotationPoint(-15F, -1.5F, 0F);
      Lasb_1.setTextureSize(512, 256);
      Lasb_1.mirror = true;
      setRotation(Lasb_1, 0F, 0F, 0.5759587F);
      ModelRenderer  Lasb_2 = new ModelRenderer(this, 200, 0);
      Lasb_2.addBox(-0.5F, -9.5F, -8F, 1, 2, 7);
      Lasb_2.setRotationPoint(-15F, -1.5F, 0F);
      Lasb_2.setTextureSize(512, 256);
      Lasb_2.mirror = true;
      setRotation(Lasb_2, 0F, 0F, 0.5759587F);
    LEFT_ARM_STINGER = new ModelRenderer(this, "LEFT_ARM_STINGER");
    LEFT_ARM_STINGER.setRotationPoint(0.5F, 0.5F, -9F);
    setRotation(LEFT_ARM_STINGER, 0F, 0F, 0F);
    LEFT_ARM_STINGER.mirror = true;
      ModelRenderer las_1 = new ModelRenderer(this, 0, 100);
      las_1.addBox(-11.5F, 5F, -4.5F, 10, 10, 4);
      las_1.setRotationPoint(-15.5F, -2F, 9F);
      las_1.setTextureSize(512, 256);
      las_1.mirror = true;
      setRotation(las_1, 0F, 0F, -0.7853982F);
      ModelRenderer  las_2 = new ModelRenderer(this, 0, 100);
      las_2.addBox(-10.5F, 6F, -0.5F, 8, 8, 1);
      las_2.setRotationPoint(-15.5F, -2F, 9F);
      las_2.setTextureSize(512, 256);
      las_2.mirror = true;
      setRotation(las_2, 0F, 0F, -0.7853982F);
      ModelRenderer las_3 = new ModelRenderer(this, 0, 100);
      las_3.addBox(-10.5F, 6F, -8.5F, 8, 8, 4);
      las_3.setRotationPoint(-15.5F, -2F, 9F);
      las_3.setTextureSize(512, 256);
      las_3.mirror = true;
      setRotation(las_3, 0F, 0F, -0.7853982F);
      ModelRenderer  las_4 = new ModelRenderer(this, 0, 100);
      las_4.addBox(-9.5F, 7F, -12.56667F, 6, 6, 4);
      las_4.setRotationPoint(-15.5F, -2F, 9F);
      las_4.setTextureSize(512, 256);
      las_4.mirror = true;
      setRotation(las_4, 0F, 0F, -0.7853982F);
      ModelRenderer  las_5 = new ModelRenderer(this, 0, 100);
      las_5.addBox(-8.5F, 8F, -16.5F, 4, 4, 4);
      las_5.setRotationPoint(-15.5F, -2F, 9F);
      las_5.setTextureSize(512, 256);
      las_5.mirror = true;
      setRotation(las_5, 0F, 0F, -0.7853982F);
      ModelRenderer las_6 = new ModelRenderer(this, 0, 100);
      las_6.addBox(-7.5F, 9F, -20.5F, 2, 2, 4);
      las_6.setRotationPoint(-15.5F, -2F, 9F);
      las_6.setTextureSize(512, 256);
      las_6.mirror = true;
      setRotation(las_6, 0F, 0F, -0.7853982F);
      ModelRenderer  las_7 = new ModelRenderer(this, 0, 100);
      las_7.addBox(-11F, 5.5F, -6.5F, 9, 9, 2);
      las_7.setRotationPoint(-15.5F, -2F, 9F);
      las_7.setTextureSize(512, 256);
      las_7.mirror = true;
      setRotation(las_7, 0F, 0F, -0.7853982F);
      ModelRenderer las_8 = new ModelRenderer(this, 0, 100);
      las_8.addBox(-10F, 6.5F, -10.5F, 7, 7, 2);
      las_8.setRotationPoint(-15.5F, -2F, 9F);
      las_8.setTextureSize(512, 256);
      las_8.mirror = true;
      setRotation(las_8, 0F, 0F, -0.7853982F);
      ModelRenderer las_9 = new ModelRenderer(this, 0, 100);
      las_9.addBox(-9F, 7.5F, -14.5F, 5, 5, 2);
      las_9.setRotationPoint(-15.5F, -2F, 9F);
      las_9.setTextureSize(512, 256);
      las_9.mirror = true;
      setRotation(las_9, 0F, 0F, -0.7853982F);
      ModelRenderer las_10 = new ModelRenderer(this, 0, 100);
      las_10.addBox(-8F, 8.5F, -18.5F, 3, 3, 2);
      las_10.setRotationPoint(-15.5F, -2F, 9F);
      las_10.setTextureSize(512, 256);
      las_10.mirror = true;
      setRotation(las_10, 0F, 0F, -0.7853982F);

    RIGHT_ARM = new ModelRenderer(this, "RIGHT_ARM");
    RIGHT_ARM.setRotationPoint(-6F, -3F, 0F);
    setRotation(RIGHT_ARM, 0F, 0F, 0F);
    RIGHT_ARM.mirror = true;
      ModelRenderer  ra_base_1 = new ModelRenderer(this, 200, 0);
      ra_base_1.addBox(-9F, -4F, -0.5F, 13, 2, 1);
      ra_base_1.setRotationPoint(6F, 3F, 0F);
      ra_base_1.setTextureSize(512, 256);
      ra_base_1.mirror = true;
      setRotation(ra_base_1, 0F, 0F, -0.5759587F);
      ModelRenderer  ra_base_2 = new ModelRenderer(this, 200, 0);
      ra_base_2.addBox(-8F, -3.5F, -1F, 11, 1, 2);
      ra_base_2.setRotationPoint(6F, 3F, 0F);
      ra_base_2.setTextureSize(512, 256);
      ra_base_2.mirror = true;
      setRotation(ra_base_2, 0F, 0F, -0.5759587F);
    RA_SECONDARY = new ModelRenderer(this, "RA_SECONDARY");
    RA_SECONDARY.setRotationPoint(-9F, 5.5F, 0F);
    setRotation(RA_SECONDARY, 0F, 0F, 0F);
    RA_SECONDARY.mirror = true;
      ModelRenderer  Rasb_1 = new ModelRenderer(this, 200, 0);
      Rasb_1.addBox(0F, -9F, -9F, 2, 1, 9);
      Rasb_1.setRotationPoint(15F, -2.5F, 0F);
      Rasb_1.setTextureSize(512, 256);
      Rasb_1.mirror = true;
      setRotation(Rasb_1, 0F, 0F, -0.5759587F);
      ModelRenderer Rasb_2 = new ModelRenderer(this, 200, 0);
      Rasb_2.addBox(0.5F, -9.5F, -8F, 1, 2, 7);
      Rasb_2.setRotationPoint(15F, -2.5F, 0F);
      Rasb_2.setTextureSize(512, 256);
      Rasb_2.mirror = true;
      setRotation(Rasb_2, 0F, 0F, -0.5759587F);
    RIGHT_ARM_STINGER = new ModelRenderer(this, "RIGHT_ARM_STINGER");
    RIGHT_ARM_STINGER.setRotationPoint(0F, 0F, -9F);
    setRotation(RIGHT_ARM_STINGER, 0F, 0F, 0F);
    RIGHT_ARM_STINGER.mirror = true;
      ModelRenderer  Rrs_1 = new ModelRenderer(this, 0, 100);
      Rrs_1.addBox(1.1F, 4.8F, -4.5F, 10, 10, 4);
      Rrs_1.setRotationPoint(15F, -2.5F, 9F);
      Rrs_1.setTextureSize(512, 256);
      Rrs_1.mirror = true;
      setRotation(Rrs_1, 0F, 0F, 0.7853982F);
      ModelRenderer Rrs_2 = new ModelRenderer(this, 0, 100);
      Rrs_2.addBox(2.1F, 5.8F, -0.5F, 8, 8, 1);
      Rrs_2.setRotationPoint(15F, -2.5F, 9F);
      Rrs_2.setTextureSize(512, 256);
      Rrs_2.mirror = true;
      setRotation(Rrs_2, 0F, 0F, 0.7853982F);
      ModelRenderer  Rrs_3 = new ModelRenderer(this, 0, 100);
      Rrs_3.addBox(2.1F, 5.8F, -8.5F, 8, 8, 4);
      Rrs_3.setRotationPoint(15F, -2.5F, 9F);
      Rrs_3.setTextureSize(512, 256);
      Rrs_3.mirror = true;
      setRotation(Rrs_3, 0F, 0F, 0.7853982F);
      ModelRenderer Rrs_4 = new ModelRenderer(this, 0, 100);
      Rrs_4.addBox(3.1F, 6.8F, -12.56667F, 6, 6, 4);
      Rrs_4.setRotationPoint(15F, -2.5F, 9F);
      Rrs_4.setTextureSize(512, 256);
      Rrs_4.mirror = true;
      setRotation(Rrs_4, 0F, 0F, 0.7853982F);
      ModelRenderer Rrs_5 = new ModelRenderer(this, 0, 100);
      Rrs_5.addBox(4.1F, 7.8F, -16.5F, 4, 4, 4);
      Rrs_5.setRotationPoint(15F, -2.5F, 9F);
      Rrs_5.setTextureSize(512, 256);
      Rrs_5.mirror = true;
      setRotation(Rrs_5, 0F, 0F, 0.7853982F);
      ModelRenderer Rrs_6 = new ModelRenderer(this, 0, 100);
      Rrs_6.addBox(5.1F, 8.8F, -20.5F, 2, 2, 4);
      Rrs_6.setRotationPoint(15F, -2.5F, 9F);
      Rrs_6.setTextureSize(512, 256);
      Rrs_6.mirror = true;
      setRotation(Rrs_6, 0F, 0F, 0.7853982F);
      ModelRenderer  Rrs_7 = new ModelRenderer(this, 0, 100);
      Rrs_7.addBox(1.6F, 5.2F, -6.5F, 9, 9, 2);
      Rrs_7.setRotationPoint(15F, -2.5F, 9F);
      Rrs_7.setTextureSize(512, 256);
      Rrs_7.mirror = true;
      setRotation(Rrs_7, 0F, 0F, 0.7853982F);
      ModelRenderer Rrs_8 = new ModelRenderer(this, 0, 100);
      Rrs_8.addBox(2.6F, 6.2F, -10.5F, 7, 7, 2);
      Rrs_8.setRotationPoint(15F, -2.5F, 9F);
      Rrs_8.setTextureSize(512, 256);
      Rrs_8.mirror = true;
      setRotation(Rrs_8, 0F, 0F, 0.7853982F);
      ModelRenderer  Rrs_9 = new ModelRenderer(this, 0, 100);
      Rrs_9.addBox(3.6F, 7.2F, -14.5F, 5, 5, 2);
      Rrs_9.setRotationPoint(15F, -2.5F, 9F);
      Rrs_9.setTextureSize(512, 256);
      Rrs_9.mirror = true;
      setRotation(Rrs_9, 0F, 0F, 0.7853982F);
      ModelRenderer Rrs_10 = new ModelRenderer(this, 0, 100);
      Rrs_10.addBox(4.6F, 8.2F, -18.5F, 3, 3, 2);
      Rrs_10.setRotationPoint(15F, -2.5F, 9F);
      Rrs_10.setTextureSize(512, 256);
      Rrs_10.mirror = true;
      setRotation(Rrs_10, 0F, 0F, 0.7853982F);
    HEAD = new ModelRenderer(this, "HEAD");
    HEAD.setRotationPoint(0F, -7F, 0F);
    setRotation(HEAD, 0F, 0F, 0F);
    HEAD.mirror = true;
      ModelRenderer Head_Center = new ModelRenderer(this, 0, 227);
      Head_Center.addBox(-7F, -11F, -11F, 14, 10, 18);
      Head_Center.setRotationPoint(0F, 0F, 0F);
      Head_Center.setTextureSize(512, 256);
      Head_Center.mirror = true;
      setRotation(Head_Center, 0F, 0F, 0F);
      ModelRenderer  Head_front_middle = new ModelRenderer(this, 0, 222);
      Head_front_middle.addBox(-6F, -9F, -16F, 12, 6, 24);
      Head_front_middle.setRotationPoint(0F, 0F, 0F);
      Head_front_middle.setTextureSize(512, 256);
      Head_front_middle.mirror = true;
      setRotation(Head_front_middle, 0F, 0F, 0F);
      ModelRenderer Head_horizontal_middle = new ModelRenderer(this, 0, 228);
      Head_horizontal_middle.addBox(-8F, -10F, -10F, 16, 8, 16);
      Head_horizontal_middle.setRotationPoint(0F, 0F, 0F);
      Head_horizontal_middle.setTextureSize(512, 256);
      Head_horizontal_middle.mirror = true;
      setRotation(Head_horizontal_middle, 0F, 0F, 0F);
      ModelRenderer Head_Vertical_middle = new ModelRenderer(this, 0, 227);
      Head_Vertical_middle.addBox(-6F, -12F, -10F, 12, 12, 16);
      Head_Vertical_middle.setRotationPoint(0F, 0F, 0F);
      Head_Vertical_middle.setTextureSize(512, 256);
      Head_Vertical_middle.mirror = true;
      setRotation(Head_Vertical_middle, 0F, 0F, 0F);
      ModelRenderer Right_eye_back = new ModelRenderer(this, 0, 200);
      Right_eye_back.addBox(-9F, -10F, -7F, 1, 6, 8);
      Right_eye_back.setRotationPoint(0F, 0F, 0F);
      Right_eye_back.setTextureSize(512, 256);
      Right_eye_back.mirror = true;
      setRotation(Right_eye_back, 0F, 0F, 0F);
      ModelRenderer Right_eye_front = new ModelRenderer(this, 0, 192);
      Right_eye_front.addBox(-9F, -9F, -9F, 1, 4, 2);
      Right_eye_front.setRotationPoint(0F, 0F, 0F);
      Right_eye_front.setTextureSize(512, 256);
      Right_eye_front.mirror = true;
      setRotation(Right_eye_front, 0F, 0F, 0F);
      ModelRenderer  Left_eye_back = new ModelRenderer(this, 0, 176);
      Left_eye_back.addBox(8F, -10F, -7F, 1, 6, 8);
      Left_eye_back.setRotationPoint(0F, 0F, 0F);
      Left_eye_back.setTextureSize(512, 256);
      Left_eye_back.mirror = true;
      setRotation(Left_eye_back, 0F, 0F, 0F);
      ModelRenderer Left_eye_front = new ModelRenderer(this, 0, 167);
      Left_eye_front.addBox(8F, -9F, -9F, 1, 4, 2);
      Left_eye_front.setRotationPoint(0F, 0F, 0F);
      Left_eye_front.setTextureSize(512, 256);
      Left_eye_front.mirror = true;
      setRotation(Left_eye_front, 0F, 0F, 0F);
    LEFT_EAR = new ModelRenderer(this, "LEFT_EAR");
    LEFT_EAR.setRotationPoint(4F, -12F, -3F);
    setRotation(LEFT_EAR, 0F, 0F, 0F);
    LEFT_EAR.mirror = true;
      ModelRenderer Mle = new ModelRenderer(this, 200, 0);
      Mle.addBox(-0.5F, -10F, -2F, 1, 11, 1);
      Mle.setRotationPoint(-4F, 19F, 3F);
      Mle.setTextureSize(512, 256);
      Mle.mirror = true;
      setRotation(Mle, -0.0872665F, 0F, 0F);
    LEFT_EAR_END = new ModelRenderer(this, "LEFT_EAR_END");
    LEFT_EAR_END.setRotationPoint(0F, -10F, 1F);
    setRotation(LEFT_EAR_END, 0F, 0F, 0F);
    LEFT_EAR_END.mirror = true;
      ModelRenderer Lee_cube = new ModelRenderer(this, 200, 0);
      Lee_cube.addBox(-0.5F, -1F, -11.5F, 1, 2, 12);
      Lee_cube.setRotationPoint(-4F, 29F, 2F);
      Lee_cube.setTextureSize(512, 256);
      Lee_cube.mirror = true;
      setRotation(Lee_cube, 0F, 0F, 0F);
    RIGHT_EAR = new ModelRenderer(this, "RIGHT_EAR");
    RIGHT_EAR.setRotationPoint(-4F, -12F, -3F);
    setRotation(RIGHT_EAR, 0F, 0F, 0F);
    RIGHT_EAR.mirror = true;
      ModelRenderer Mre = new ModelRenderer(this, 200, 0);
      Mre.addBox(-0.5F, -10F, -2F, 1, 11, 1);
      Mre.setRotationPoint(4F, 19F, 3F);
      Mre.setTextureSize(512, 256);
      Mre.mirror = true;
      setRotation(Mre, -0.0872665F, 0F, 0F);
    RIGHT_EAR_END = new ModelRenderer(this, "RIGHT_EAR_END");
    RIGHT_EAR_END.setRotationPoint(0F, -10F, 1F);
    setRotation(RIGHT_EAR_END, 0F, 0F, 0F);
    RIGHT_EAR_END.mirror = true;
      ModelRenderer Ree_cube = new ModelRenderer(this, 200, 0);
      Ree_cube.addBox(-0.5F, -1F, -11.5F, 1, 2, 12);
      Ree_cube.setRotationPoint(4F, 29F, 2F);
      Ree_cube.setTextureSize(512, 256);
      Ree_cube.mirror = true;
      setRotation(Ree_cube, 0F, 0F, 0F);
    RIGHT_WING_TOP = new ModelRenderer(this, "RIGHT_WING_TOP");
    RIGHT_WING_TOP.setRotationPoint(-3F, -1F, 6F);
    setRotation(RIGHT_WING_TOP, 0F, 0F, 0F);
    RIGHT_WING_TOP.mirror = true;
      ModelRenderer Right_wing_top_spirit = new ModelRenderer(this, 0, 0);
      Right_wing_top_spirit.addBox(-35F, -32F, 0.01F, 35, 35, 0);
      Right_wing_top_spirit.setRotationPoint(3F, 1F, -6F);
      Right_wing_top_spirit.setTextureSize(512, 256);
      Right_wing_top_spirit.mirror = true;
      setRotation(Right_wing_top_spirit, 0F, 0F, 0F);
    RIGHT_WING_BOTTOM = new ModelRenderer(this, "RIGHT_WING_BOTTOM");
    RIGHT_WING_BOTTOM.setRotationPoint(-3F, -1F, 6F);
    setRotation(RIGHT_WING_BOTTOM, 0F, 0F, 0F);
    RIGHT_WING_BOTTOM.mirror = true;
      ModelRenderer  Rwbs = new ModelRenderer(this, 0, 38);
      Rwbs.addBox(8.5F, -11F, -10F, 25, 25, 0);
      Rwbs.setRotationPoint(3F, 1F, -6F);
      Rwbs.setTextureSize(512, 256);
      Rwbs.mirror = true;
      setRotation(Rwbs, 0F, -2.670354F, 0F);
    LEFT_WING_TOP = new ModelRenderer(this, "LEFT_WING_TOP");
    LEFT_WING_TOP.setRotationPoint(2F, -1F, 6F);
    setRotation(LEFT_WING_TOP, 0F, 0F, 0F);
    LEFT_WING_TOP.mirror = true;
      ModelRenderer  Left_wing_top_spirit = new ModelRenderer(this, 35, 0);
      Left_wing_top_spirit.addBox(0F, -32F, 0.01F, 35, 35, 0);
      Left_wing_top_spirit.setRotationPoint(-2F, 1F, -6F);
      Left_wing_top_spirit.setTextureSize(512, 256);
      Left_wing_top_spirit.mirror = true;
      setRotation(Left_wing_top_spirit, 0F, 0F, 0F);
    LEFT_WING_BOTTOM = new ModelRenderer(this, "LEFT_WING_BOTTOM");
    LEFT_WING_BOTTOM.setRotationPoint(2F, -1F, 6F);
    setRotation(LEFT_WING_BOTTOM, 0F, 0F, 0F);
    LEFT_WING_BOTTOM.mirror = true;
      ModelRenderer  Lwbs = new ModelRenderer(this, 0, 38);
      Lwbs.addBox(2.5F, -11F, -1.4F, 25, 25, 0);
      Lwbs.setRotationPoint(-2F, 1F, -6F);
      Lwbs.setTextureSize(512, 256);
      Lwbs.mirror = true;
      setRotation(Lwbs, 0F, -0.4712389F, 0F);
    STINGER = new ModelRenderer(this, "STINGER");
    STINGER.setRotationPoint(0F, 7F, 2F);
    setRotation(STINGER, 0F, 0F, 0F);
    STINGER.mirror = true;
      ModelRenderer Stinger_main_middle = new ModelRenderer(this, 76, 159);
      Stinger_main_middle.addBox(-8F, 0F, -23F, 16, 16, 22);
      Stinger_main_middle.setRotationPoint(0F, -7F, -2F);
      Stinger_main_middle.setTextureSize(512, 256);
      Stinger_main_middle.mirror = true;
      setRotation(Stinger_main_middle, 0.3665191F, 0F, 0F);
      ModelRenderer  Stinger_Horizontal_middle = new ModelRenderer(this, 174, 175);
      Stinger_Horizontal_middle.addBox(-9F, 2F, -22F, 18, 12, 18);
      Stinger_Horizontal_middle.setRotationPoint(0F, -7F, -2F);
      Stinger_Horizontal_middle.setTextureSize(512, 256);
      Stinger_Horizontal_middle.mirror = true;
      setRotation(Stinger_Horizontal_middle, 0.3665191F, 0F, 0F);
      ModelRenderer Stinger_Front_middle = new ModelRenderer(this, 268, 167);
      Stinger_Front_middle.addBox(-6F, 2F, -24F, 12, 12, 24);
      Stinger_Front_middle.setRotationPoint(0F, -7F, -2F);
      Stinger_Front_middle.setTextureSize(512, 256);
      Stinger_Front_middle.mirror = true;
      setRotation(Stinger_Front_middle, 0.3665191F, 0F, 0F);
      ModelRenderer  Stinger_Verticalal_middle = new ModelRenderer(this, 281, 120);
      Stinger_Verticalal_middle.addBox(-6F, -1F, -22F, 12, 18, 18);
      Stinger_Verticalal_middle.setRotationPoint(0F, -7F, -2F);
      Stinger_Verticalal_middle.setTextureSize(512, 256);
      Stinger_Verticalal_middle.mirror = true;
      setRotation(Stinger_Verticalal_middle, 0.3665191F, 0F, 0F);
      ModelRenderer  Stinger_point_base = new ModelRenderer(this, 0, 231);
      Stinger_point_base.addBox(9F, 1F, -26F, 6, 6, 14);
      Stinger_point_base.setRotationPoint(0F, -7F, -2F);
      Stinger_point_base.setTextureSize(512, 256);
      Stinger_point_base.mirror = true;
      setRotation(Stinger_point_base, 0.4537856F, -0.296706F, 0.7330383F);
      ModelRenderer Stinger_point_middle = new ModelRenderer(this, 0, 234);
      Stinger_point_middle.addBox(10F, 2F, -29F, 4, 4, 14);
      Stinger_point_middle.setRotationPoint(0F, -7F, -2F);
      Stinger_point_middle.setTextureSize(512, 256);
      Stinger_point_middle.mirror = true;
      setRotation(Stinger_point_middle, 0.4537856F, -0.296706F, 0.7330383F);
      ModelRenderer Stinger_point_base_1 = new ModelRenderer(this, 0, 230);
      Stinger_point_base_1.addBox(11F, 3F, -32F, 2, 2, 14);
      Stinger_point_base_1.setRotationPoint(0F, -7F, -2F);
      Stinger_point_base_1.setTextureSize(512, 256);
      Stinger_point_base_1.mirror = true;
      setRotation(Stinger_point_base_1, 0.4537856F, -0.296706F, 0.7330383F);
      ModelRenderer Stinger_point_base_2 = new ModelRenderer(this, 0, 231);
      Stinger_point_base_2.addBox(9.5F, 1.5F, -27.5F, 5, 5, 14);
      Stinger_point_base_2.setRotationPoint(0F, -7F, -2F);
      Stinger_point_base_2.setTextureSize(512, 256);
      Stinger_point_base_2.mirror = true;
      setRotation(Stinger_point_base_2, 0.4537856F, -0.296706F, 0.7330383F);
      ModelRenderer  Stinger_point_middle_2 = new ModelRenderer(this, 0, 234);
      Stinger_point_middle_2.addBox(10.5F, 2.5F, -30.5F, 3, 3, 14);
      Stinger_point_middle_2.setRotationPoint(0F, -7F, -2F);
      Stinger_point_middle_2.setTextureSize(512, 256);
      Stinger_point_middle_2.mirror = true;
      setRotation(Stinger_point_middle_2, 0.4537856F, -0.296706F, 0.7330383F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    BEEDRILL.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

}
