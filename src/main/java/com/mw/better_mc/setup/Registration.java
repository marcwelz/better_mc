package com.mw.better_mc.setup;

import com.mw.better_mc.Main;
import com.mw.better_mc.block.ModBlocks;
import com.mw.better_mc.item.ModItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);

    public static void register() {
       IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

       ModItems.register(modEventBus);
       ModBlocks.register(modEventBus);
    }
}
