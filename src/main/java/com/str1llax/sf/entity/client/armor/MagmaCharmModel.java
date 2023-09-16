package com.str1llax.sf.entity.client.armor;

import com.str1llax.sf.SF;
import com.str1llax.sf.item.MagmaCharm;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.DynamicGeoEntityRenderer;

public class MagmaCharmModel extends DynamicGeoEntityRenderer<MagmaCharm> {
    public MagmaCharmModel(EntityRendererProvider.Context renderManager, GeoModel<MagmaCharm> model) {
        super(renderManager, model);
    }

    public MagmaCharmModel() {
        super();
    }

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
