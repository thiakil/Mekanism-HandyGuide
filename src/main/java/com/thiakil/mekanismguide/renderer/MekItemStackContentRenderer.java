package com.thiakil.mekanismguide.renderer;

import li.cil.manual.api.render.ContentRenderer;
import li.cil.manual.api.render.InteractiveContentRenderer;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;

public final class MekItemStackContentRenderer implements ContentRenderer, InteractiveContentRenderer {
    /**
     * How long to show individual stacks, in milliseconds, before switching to the next.
     */
    private static final int CYCLE_SPEED = 1000;

    // --------------------------------------------------------------------- //

    private final ItemStack[] stacks;

    private ItemStack lastRendered = ItemStack.EMPTY;

    // --------------------------------------------------------------------- //

    public MekItemStackContentRenderer(final ItemStack... stacks) {
        this.stacks = stacks;
    }

    // --------------------------------------------------------------------- //

    @Override
    public int getWidth() {
        return 32;
    }

    @Override
    public int getHeight() {
        return 32;
    }

    @Override
    public void render(final GuiGraphics graphics, final int mouseX, final int mouseY) {
        final int index = (int) (System.currentTimeMillis() % (CYCLE_SPEED * stacks.length)) / CYCLE_SPEED;
        this.lastRendered = stacks[index];

        final float scaleX = getWidth() / 16f;
        final float scaleY = getHeight() / 16f;

        final var pose = graphics.pose();

        pose.pushPose();
        pose.scale(scaleX, scaleY, 1);

        graphics.renderFakeItem(this.lastRendered, 0, 0);

        pose.popPose();
    }

    @Override
    public Component getTooltip(Component tooltip) {
        return lastRendered.getHoverName();
    }
}
