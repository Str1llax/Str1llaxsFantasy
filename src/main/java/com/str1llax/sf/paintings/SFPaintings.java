package com.str1llax.sf.paintings;

import com.str1llax.sf.SF;
import net.minecraft.world.entity.decoration.Motive;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SFPaintings {
    public static final DeferredRegister<Motive> PAINTING_MOTIVES =
            DeferredRegister.create(ForgeRegistries.PAINTING_TYPES, SF.MOD_ID);

    public static final RegistryObject<Motive> MARATHON =
            PAINTING_MOTIVES.register("marathon", () -> new Motive(16, 16));
    public static final RegistryObject<Motive> FAMILY =
            PAINTING_MOTIVES.register("family", () -> new Motive(16, 32));


    public static void register(IEventBus eventBus) {
        PAINTING_MOTIVES.register(eventBus);
    }
}
