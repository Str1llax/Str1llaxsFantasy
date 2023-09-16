package com.str1llax.sf.screen.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.Rect2i;

public abstract class InfoArea extends Gui {
    protected final Rect2i area;

    protected InfoArea(Rect2i area) {
        this.area = area;
    }

    public abstract void draw(PoseStack transform);
}
