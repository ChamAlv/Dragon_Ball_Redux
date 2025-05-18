package net.cham.dragonballredux.item;

import net.cham.dragonballredux.DragonBallRedux;
import net.cham.dragonballredux.block.ModBlocks;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DragonBallRedux.MOD_ID);

    public static final RegistryObject<Item> SENZU_BEAN = ITEMS.register("senzu_bean",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SENZU_BEAN)));

    public static final RegistryObject<Item> SENZU_SPROUT = ITEMS.register("senzu_sprout",
            () -> new ItemNameBlockItem(ModBlocks.SENZU_CROP.get(), new Item.Properties()));

    public static final RegistryObject<Item> SENZU_ESSENCE = ITEMS.register("senzu_essence",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
