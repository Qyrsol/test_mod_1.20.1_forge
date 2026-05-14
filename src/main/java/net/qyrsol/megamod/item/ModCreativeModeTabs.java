package net.qyrsol.megamod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.qyrsol.megamod.MegaMod;
import net.qyrsol.megamod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MegaMod.MOD_ID);

public static final RegistryObject<CreativeModeTab> MEGA_TAB = CREATIVE_MODE_TABS.register("mega_tab",
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STEEL_INGOT.get()))
                .title(Component.translatable("creativetab.mega_tab"))
                .displayItems((pParameters, pOutput) -> {
                    pOutput.accept(ModItems.STEEL_INGOT.get());
                    pOutput.accept(ModItems.RAW_STEEL.get());
                    pOutput.accept(ModBlocks.STEEL_BLOCK.get());
                    pOutput.accept(ModBlocks.RAW_STEEL_BLOCK.get());
                })
                .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
