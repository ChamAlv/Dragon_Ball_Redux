package net.cham.dragonballredux.datagen;

import net.cham.dragonballredux.block.ModBlocks;
import net.cham.dragonballredux.block.custom.SenzuCropBlock;
import net.cham.dragonballredux.item.ModItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider pRegistries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.DRAGON_BALL.get());

        LootItemCondition.Builder lootitemcondition$builder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.SENZU_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SenzuCropBlock.AGE, 7));
        this.add(ModBlocks.SENZU_CROP.get(), createCropDrops(ModBlocks.SENZU_CROP.get(), ModItems.SENZU_BEAN.get(),
               ModItems.SENZU_SPROUT.get(), lootitemcondition$builder));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
