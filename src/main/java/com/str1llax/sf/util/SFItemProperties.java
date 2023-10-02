package com.str1llax.sf.util;

import com.str1llax.sf.register.SFItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class SFItemProperties {
    public static void addCustomItemProperties() {
        makeBow(SFItems.RUBY_BOW.get());
        makeBow(SFItems.CITRINE_BOW.get());
        makeBow(SFItems.AMETHYST_BOW.get());
        makeBow(SFItems.AMETRINE_BOW.get());
    }
    private static void makeBow(Item item) {
        ItemProperties.register(item, new ResourceLocation("pull"), (stack, level, useItemRemainingTicks, i) -> {
            if (useItemRemainingTicks == null) {return 0.0F;}
            else {return useItemRemainingTicks.getUseItem() != stack ? 0.0F : (float)(stack.getUseDuration() - useItemRemainingTicks.getUseItemRemainingTicks()) / 20.0F;}});
        ItemProperties.register(item, new ResourceLocation("pulling"), (stack, level, entity, i) -> entity != null && entity.isUsingItem() && entity.getUseItem() == stack ? 1.0F : 0.0F);
    }
}
