package net.cham.dragonballredux.datagen;

import net.cham.dragonballredux.DragonBallRedux;
import net.cham.dragonballredux.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, DragonBallRedux.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.SENZU_SPROUT.get());
        basicItem(ModItems.SENZU_ESSENCE.get());
        basicItem(ModItems.SENZU_BEAN.get());
    }
}
