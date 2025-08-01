package net.crusiador.wegetthere.item;

import net.crusiador.wegetthere.block.ModBlocks;
import net.crusiador.wegetthere.wegetthere;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, wegetthere.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SEBS_ITEMS_TABS = CREATIVE_MODE_TABS.register("seb.draws.things",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.S13.get()))
                    .title(Component.translatable("creativetab.wegetthere.seb.blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.SA.get());
                        output.accept(ModBlocks.SB.get());
                        output.accept(ModBlocks.S3.get());
                        output.accept(ModBlocks.S4.get());
                        output.accept(ModBlocks.S5.get());
                        output.accept(ModBlocks.S6.get());
                        output.accept(ModBlocks.S7.get());
                        output.accept(ModBlocks.S8.get());
                        output.accept(ModBlocks.S9.get());
                        output.accept(ModBlocks.S10.get());
                        output.accept(ModBlocks.S11.get());
                        output.accept(ModBlocks.S12.get());
                        output.accept(ModBlocks.S13.get());
                        output.accept(ModBlocks.S14.get());
                        output.accept(ModBlocks.S15.get());
                        output.accept(ModBlocks.S16.get());
                        output.accept(ModBlocks.S17.get());
                        output.accept(ModBlocks.S18.get());
                        output.accept(ModBlocks.S19.get());
                        output.accept(ModBlocks.S20.get());
                        output.accept(ModBlocks.S21.get());
                        output.accept(ModBlocks.S22.get());
                        output.accept(ModBlocks.S23.get());
                        output.accept(ModBlocks.S24.get());
                        output.accept(ModBlocks.S25.get());
                        output.accept(ModBlocks.SHREK.get());
                        output.accept(ModBlocks.PY.get());
                        output.accept(ModBlocks.COW.get());
                        output.accept(ModBlocks.PUY.get());

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}