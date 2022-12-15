package com.str1llax.sf.world;

import com.str1llax.sf.SF;
import com.str1llax.sf.world.gen.SFFlowerGeneration;
import com.str1llax.sf.world.gen.SFOreGeneration;
import com.str1llax.sf.world.gen.SFTreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SF.MOD_ID)
public class SFWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        SFOreGeneration.generateOres(event);
        SFTreeGeneration.generateTrees(event);
        SFFlowerGeneration.generateFlowers(event);
    }
}
