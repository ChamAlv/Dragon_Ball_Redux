package net.cham.dragonballredux.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties SENZU_BEAN = new FoodProperties.Builder()
            .nutrition(20)
            .saturationModifier(2F)
            .alwaysEdible()
            .fast()
            .effect(new MobEffectInstance(MobEffects.HEAL, 10, 9999999), 1f)
            .build();
}
