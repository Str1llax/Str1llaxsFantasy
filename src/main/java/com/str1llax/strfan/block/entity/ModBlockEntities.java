package com.str1llax.strfan.block.entity;

import com.str1llax.strfan.StrFan;
import com.str1llax.strfan.block.entity.custom.CircuitAssemblerBlockEntity;
import com.str1llax.strfan.block.entity.custom.ExtractorBlockEntity;
import com.str1llax.strfan.block.entity.custom.MixerBlockEntity;
import com.str1llax.strfan.init.BlockInit;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, StrFan.MOD_ID);

    public static final RegistryObject<BlockEntityType<CircuitAssemblerBlockEntity>> CIRCUIT_ASSEMBLER_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("circuit_assembler_block_entity", () ->
                    BlockEntityType.Builder.of(CircuitAssemblerBlockEntity::new,
                            BlockInit.CIRCUIT_ASSEMBLER.get()).build(null));

    public static final RegistryObject<BlockEntityType<MixerBlockEntity>> MIXER_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("mixer_block_entity", () ->
                    BlockEntityType.Builder.of(MixerBlockEntity::new,
                            BlockInit.MIXER.get()).build(null));

    public static final RegistryObject<BlockEntityType<ExtractorBlockEntity>> EXTRACTOR_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("extractor_block_entity", () ->
                    BlockEntityType.Builder.of(ExtractorBlockEntity::new,
                            BlockInit.EXTRACTOR.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }

}
