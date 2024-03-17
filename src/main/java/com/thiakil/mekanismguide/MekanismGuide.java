package com.thiakil.mekanismguide;

import com.mojang.logging.LogUtils;
import com.thiakil.mekanismguide.item.ManualItem;
import com.thiakil.mekanismguide.provider.MekItemRendererProvider;
import li.cil.manual.api.ManualModel;
import li.cil.manual.api.prefab.Manual;
import li.cil.manual.api.prefab.provider.NamespaceDocumentProvider;
import li.cil.manual.api.provider.DocumentProvider;
import li.cil.manual.api.provider.RendererProvider;
import li.cil.manual.api.util.Constants;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MekanismGuide.MODID)
public class MekanismGuide
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "mekanismguide";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold Items which will all be registered under the "examplemod" namespace
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);
    // Create a Deferred Register to hold CreativeModeTabs which will all be registered under the "examplemod" namespace
    //public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    static final DeferredRegister<ManualModel> MANUALS = DeferredRegister.create(Constants.MANUAL_REGISTRY, MODID);
    public static final DeferredHolder<ManualModel, ManualModel> MANUAL = MANUALS.register("handyguide", Manual::new);

    static final DeferredRegister<DocumentProvider> DOCUMENT_PROVIDERS = DeferredRegister.create(Constants.DOCUMENT_PROVIDER_REGISTRY, MODID);
    public static final DeferredHolder<DocumentProvider,DocumentProvider> DOCUMENT_PROVIDER = DOCUMENT_PROVIDERS.register("handyguide", () ->
            new NamespaceDocumentProvider(MODID, "doc"));

    public static final DeferredItem<ManualItem> MANUAL_ITEM = ITEMS.registerItem("handyguide", ManualItem::new);

    private static final DeferredRegister<RendererProvider> RENDERER_PROVIDERS = DeferredRegister.create(Constants.RENDERER_PROVIDER_REGISTRY, MODID);
    public static final DeferredHolder<RendererProvider, RendererProvider> MEK_ITEM_PROVIDER = RENDERER_PROVIDERS.register("mekitem", MekItemRendererProvider::new);

    // Creates a creative tab with the id "examplemod:example_tab" for the example item, that is placed after the combat tab
    //public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register("example_tab", () -> CreativeModeTab.builder()
    //        .title(Component.translatable("itemGroup.examplemod")) //The language key for the title of your CreativeModeTab
    //        .withTabsBefore(CreativeModeTabs.COMBAT)
    //        .icon(() -> EXAMPLE_ITEM.get().getDefaultInstance())
    //        .displayItems((parameters, output) -> {
    //            output.accept(EXAMPLE_ITEM.get()); // Add the example item to the tab. For your own tabs, this method is preferred over the event
    //        }).build());

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public MekanismGuide(IEventBus modEventBus)
    {
        // Register the Deferred Register to the mod event bus so items get registered
        ITEMS.register(modEventBus);
        // Register the Deferred Register to the mod event bus so tabs get registered
        //CREATIVE_MODE_TABS.register(modEventBus);
        MANUALS.register(modEventBus);
        DOCUMENT_PROVIDERS.register(modEventBus);
        RENDERER_PROVIDERS.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        //ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTabKey().location().getPath().equals("mekanism")){
            event.accept(MANUAL_ITEM);
        }
        //if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS)
        //    event.accept(EXAMPLE_BLOCK_ITEM);
    }
}
