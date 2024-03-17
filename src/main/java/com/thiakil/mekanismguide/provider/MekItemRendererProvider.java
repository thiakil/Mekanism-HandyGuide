package com.thiakil.mekanismguide.provider;

import com.thiakil.mekanismguide.MekanismGuide;
import com.thiakil.mekanismguide.renderer.MekItemStackContentRenderer;
import li.cil.manual.api.ManualModel;
import li.cil.manual.api.prefab.provider.AbstractRendererProvider;
import li.cil.manual.api.render.ContentRenderer;
import li.cil.manual.api.util.MatchResult;
import li.cil.manual.client.document.Strings;
import li.cil.manual.client.document.segment.render.ItemStackContentRenderer;
import li.cil.manual.client.document.segment.render.MissingContentRenderer;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import java.util.Arrays;
import java.util.Optional;

public final class MekItemRendererProvider extends AbstractRendererProvider {
    public MekItemRendererProvider() {
        super("item");
    }

    // --------------------------------------------------------------------- //

    //only apply to Mekanism guide
    @Override
    public MatchResult matches(final ManualModel manual) {
        return manual == MekanismGuide.MANUAL.get() ? MatchResult.MATCH : MatchResult.MISMATCH;
    }

    //prioritise above built in renderer
    @Override
    public int sortOrder() {
        return -99;
    }

    @Override
    protected Optional<ContentRenderer> doGetRenderer(final String data) {
        String[] itemNames = data.split(",");
        ItemStack[] items = Arrays.stream(itemNames).map(el -> BuiltInRegistries.ITEM.getOptional(new ResourceLocation(el))).filter(Optional::isPresent).map(el->new ItemStack(el.get())).toArray(ItemStack[]::new);
        if (items.length == 0) {
            return Optional.of(new MissingContentRenderer(Strings.NO_SUCH_ITEM));
        }
        return Optional.of(new MekItemStackContentRenderer(items));
    }
}
