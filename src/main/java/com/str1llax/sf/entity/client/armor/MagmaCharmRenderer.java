package com.str1llax.sf.entity.client.armor;

import com.str1llax.sf.item.MagmaCharm;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MagmaCharmRenderer extends GeoArmorRenderer<MagmaCharm> {
    public MagmaCharmRenderer() {
        super(new MagmaCharmModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorLeftLeg";
        this.leftLegBone = "armorRightLeg";
        this.rightBootBone = "armorLeftBoot";
        this.leftBootBone = "armorRightBoot";
    }
}
