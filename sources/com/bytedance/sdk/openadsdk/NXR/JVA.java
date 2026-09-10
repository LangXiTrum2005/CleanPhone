package com.bytedance.sdk.openadsdk.NXR;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class JVA extends View {
    private float LD;
    private final Paint Lxb;
    private float lk;

    public JVA(Context context) {
        super(context);
        setBackgroundColor(Color.parseColor("#8A8A8A"));
        Paint paint = new Paint();
        this.Lxb = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.lk;
        if (f > 0.0f) {
            float f2 = this.LD;
            canvas.drawLine(0.0f, f2, f, f2, this.Lxb);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = i2;
        this.LD = (1.0f * f) / 2.0f;
        this.Lxb.setStrokeWidth(f);
    }

    public void setProgress(float f) {
        this.lk = getWidth() * f;
        invalidate();
    }
}
