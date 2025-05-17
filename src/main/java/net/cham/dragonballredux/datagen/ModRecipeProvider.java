package net.cham.dragonballredux.datagen;

import net.cham.dragonballredux.DragonBallRedux;
import net.cham.dragonballredux.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.SmeltingRecipe;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SENZU_SPROUT.get(), 1)
                .requires(ModItems.SENZU_BEAN.get())
                .unlockedBy(getHasName(ModItems.SENZU_BEAN.get()), has(ModItems.SENZU_BEAN.get()))
                .save(pRecipeOutput);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.SENZU_BEAN.get()), RecipeCategory.MISC, ModItems.SENZU_ESSENCE.get(), 1F, 600)
                .unlockedBy(getHasName(ModItems.SENZU_BEAN.get()), has(ModItems.SENZU_BEAN.get()))
                .save(pRecipeOutput);

    }

}
