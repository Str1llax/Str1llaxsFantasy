package com.str1llax.sf.paintings;

import com.str1llax.sf.SF;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SFPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS =
            DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, SF.MOD_ID);

    public static final RegistryObject<PaintingVariant> MARATHON =
            PAINTING_VARIANTS.register("marathon", () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> FAMILY =
            PAINTING_VARIANTS.register("family", () -> new PaintingVariant(16, 32));


    public static void register(IEventBus eventBus) {
        PAINTING_VARIANTS.register(eventBus);
    }
}
