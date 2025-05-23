package net.cham.dragonballredux.block;

import net.cham.dragonballredux.DragonBallRedux;
import net.cham.dragonballredux.block.custom.SenzuCropBlock;
import net.cham.dragonballredux.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, DragonBallRedux.MOD_ID);






    public static final RegistryObject<Block> DRAGON_BALL = registerBlock("dragon_ball",
            () -> new Block(BlockBehaviour.Properties.of()
                    .explosionResistance(3)
                    .instabreak()
                    .sound(SoundType.AMETHYST)));


    public static final RegistryObject<Block> SENZU_CROP = BLOCKS.register("senzu_crop",
            () -> new SenzuCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)));





    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventbus) {
        BLOCKS.register(eventbus);
    }

}
