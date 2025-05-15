package net.cham.dragonballredux.item;

import net.cham.dragonballredux.DragonBallRedux;
import net.cham.dragonballredux.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DragonBallRedux.MOD_ID);

    public static final RegistryObject<CreativeModeTab> DRAGONBALLREDUX_ITEMS_TAB = CREATIVE_MODE_TABS.register("dragonballredux_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SENZU.get()))
                    //.withTabsBefore(*insert before tab name*.getId())
                    .title(Component.translatable("creativetab.dragonballredux.dragonballredux_items"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.SENZU.get());
                        output.accept(ModBlocks.DRAGON_BALL.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
