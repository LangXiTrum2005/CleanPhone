package com.smartdigimkt.sdk.basead.ui.web;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public class WebProgressBarView extends View {
    int e0;
    int f0;
    Paint g0;

    public WebProgressBarView(Context context) {
        super(context);
        a();
    }

    private void a() {
        this.f0 = -14522893;
        Paint paint = new Paint();
        this.g0 = paint;
        paint.setColor(this.f0);
        this.g0.setAntiAlias(true);
        this.g0.setDither(true);
        this.e0 = 0;
        setBackgroundColor(16777215);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.drawRect(0.0f, 0.0f, (getWidth() * this.e0) / 100, getHeight(), this.g0);
        canvas.restore();
    }

    public void setProgress(int i2) {
        this.e0 = i2;
        postInvalidate();
    }

    public WebProgressBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public WebProgressBarView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a();
    }
}
