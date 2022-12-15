package com.str1llax.sf.block.entity;

import com.str1llax.sf.SF;
import com.str1llax.sf.block.entity.sfentities.*;
import com.str1llax.sf.register.SFBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SFBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, SF.MOD_ID);

    public static final RegistryObject<BlockEntityType<CircuitAssemblerBlockEntity>> CIRCUIT_ASSEMBLER_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("circuit_assembler_block_entity", () ->
                    BlockEntityType.Builder.of(CircuitAssemblerBlockEntity::new,
                            SFBlocks.CIRCUIT_ASSEMBLER.get()).build(null));

    public static final RegistryObject<BlockEntityType<MixerBlockEntity>> MIXER_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("mixer_block_entity", () ->
                    BlockEntityType.Builder.of(MixerBlockEntity::new,
                            SFBlocks.MIXER.get()).build(null));

    public static final RegistryObject<BlockEntityType<ExtractorBlockEntity>> EXTRACTOR_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("extractor_block_entity", () ->
                    BlockEntityType.Builder.of(ExtractorBlockEntity::new,
                            SFBlocks.EXTRACTOR.get()).build(null));

    public static final RegistryObject<BlockEntityType<GeneratorBlockEntity>> GENERATOR_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("generator_block_entity", () ->
                    BlockEntityType.Builder.of(GeneratorBlockEntity::new,
                            SFBlocks.GENERATOR.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }

}
