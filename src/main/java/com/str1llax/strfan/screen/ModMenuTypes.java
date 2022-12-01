package com.str1llax.strfan.screen;

import com.str1llax.strfan.Str1llaxsFantasy;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.CONTAINERS, Str1llaxsFantasy.MOD_ID);

    public static final RegistryObject<MenuType<CircuitAssemblerMenu>> CIRCUIT_ASSEMBLER_MENU =
            registerMenuType(CircuitAssemblerMenu::new, "circuit_assembler_menu");
    public static final RegistryObject<MenuType<MixerMenu>> MIXER_MENU =
            registerMenuType(MixerMenu::new, "mixer_menu");
    public static final RegistryObject<MenuType<ExtractorMenu>> EXTRACTOR_MENU =
            registerMenuType(ExtractorMenu::new, "extractor_menu");

    private static <T extends AbstractContainerMenu> RegistryObject<MenuType<T>> registerMenuType(IContainerFactory<T> factory,
                                                                                                  String name) {
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus bus){
        MENUS.register(bus);
    }
}
