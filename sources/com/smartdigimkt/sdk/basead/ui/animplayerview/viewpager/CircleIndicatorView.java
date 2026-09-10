package com.smartdigimkt.sdk.basead.ui.animplayerview.viewpager;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public class CircleIndicatorView extends View {
    private boolean e0;
    private final Path f0;

    public CircleIndicatorView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        int iMin = Math.min(width, height);
        this.f0.reset();
        this.f0.addCircle(width, height, iMin, Path.Direction.CCW);
        canvas.clipPath(this.f0);
        canvas.drawColor(this.e0 ? -7829368 : -1);
        canvas.restore();
    }

    public void setSelectStatus(boolean z2) {
        this.e0 = z2;
        invalidate();
    }

    public CircleIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleIndicatorView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f0 = new Path();
    }
}
