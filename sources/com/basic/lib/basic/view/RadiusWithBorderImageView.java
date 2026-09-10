package com.basic.lib.basic.view;

import android.graphics.Canvas;
import androidx.annotation.Dimension;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes.dex */
public class RadiusWithBorderImageView extends RadiusImageView {
    public int l;
    public int m;

    public final int getBorderColor() {
        return this.l;
    }

    public final int getBorderWidth() {
        return this.m;
    }

    @Override // com.basic.lib.basic.view.RadiusImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        AbstractC2995aW.q(canvas, "canvas");
        super.onDraw(canvas);
        if (getRadius() > 0 || getRadiusLT() > 0 || getRadiusRT() > 0 || getRadiusRB() > 0 || getRadiusLB() > 0) {
            throw null;
        }
    }

    public final void setBorderColor(int i) {
        this.l = i;
        postInvalidate();
    }

    public final void setBorderWidth(@Dimension int i) {
        this.m = i;
        postInvalidate();
    }
}
