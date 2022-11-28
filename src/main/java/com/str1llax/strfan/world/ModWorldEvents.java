package com.str1llax.strfan.world;

import com.str1llax.strfan.Str1llaxsFantasy;
import com.str1llax.strfan.world.gen.ModFlowerGeneration;
import com.str1llax.strfan.world.gen.ModOreGeneration;
import com.str1llax.strfan.world.gen.ModTreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Str1llaxsFantasy.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);

        ModTreeGeneration.generateTrees(event);
        ModFlowerGeneration.generateFlowers(event);
    }
}
