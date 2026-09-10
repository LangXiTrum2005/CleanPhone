package com.thinkup.core.basead.ui.web;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public class WebProgressBarView extends View {
    int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Paint f41808n;
    int o;

    public WebProgressBarView(Context context) {
        super(context);
        o();
    }

    private void o() {
        this.m = -14522893;
        Paint paint = new Paint();
        this.f41808n = paint;
        paint.setColor(this.m);
        this.f41808n.setAntiAlias(true);
        this.f41808n.setDither(true);
        this.o = 0;
        setBackgroundColor(16777215);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.drawRect(0.0f, 0.0f, (getWidth() * this.o) / 100, getHeight(), this.f41808n);
        canvas.restore();
    }

    public void setProgress(int i2) {
        this.o = i2;
        postInvalidate();
    }

    public WebProgressBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o();
    }

    public WebProgressBarView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        o();
    }
}
