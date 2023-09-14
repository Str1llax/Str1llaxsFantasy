package com.str1llax.sf.entity.client.armor;

import com.str1llax.sf.SF;
import com.str1llax.sf.item.MagmaCharm;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MagmaCharmModel extends AnimatedGeoModel<MagmaCharm> {
    @Override
    public ResourceLocation getModelLocation(MagmaCharm object) {
        return new ResourceLocation(SF.MOD_ID, "geo/magma_charm.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(MagmaCharm object) {
        return new ResourceLocation(SF.MOD_ID, "textures/models/armor/magma_charm.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(MagmaCharm animatable) {
        return new ResourceLocation(SF.MOD_ID, "animations/magma_charm.json");
    }
}
