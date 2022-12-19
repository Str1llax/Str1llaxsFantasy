package com.str1llax.sf.screen;

import com.str1llax.sf.SF;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SFMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(ForgeRegistries.CONTAINERS, SF.MOD_ID);
    public static final RegistryObject<MenuType<CircuitAssemblerMenu>> CIRCUIT_ASSEMBLER_MENU = registerMenuType(CircuitAssemblerMenu::new, "circuit_assembler_menu");
    public static final RegistryObject<MenuType<MixerMenu>> MIXER_MENU = registerMenuType(MixerMenu::new, "mixer_menu");
    public static final RegistryObject<MenuType<ExtractorMenu>> EXTRACTOR_MENU = registerMenuType(ExtractorMenu::new, "extractor_menu");
    public static final RegistryObject<MenuType<GeneratorMenu>> GENERATOR_MENU = MENUS.register("generator_menu", () -> IForgeMenuType.create((windowId, inv, data) -> new GeneratorMenu(windowId, data.readBlockPos(), inv, inv.player)));
    private static <T extends AbstractContainerMenu> RegistryObject<MenuType<T>> registerMenuType(IContainerFactory<T> factory, String name) {return MENUS.register(name, () -> IForgeMenuType.create(factory));}
    public static void register(IEventBus bus){MENUS.register(bus);}
}
