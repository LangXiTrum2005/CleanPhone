package com.bytedance.sdk.openadsdk.rdp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class rq extends View {
    private float lnr;
    private final Paint qdl;
    private float ud;

    public rq(Context context) {
        super(context);
        setBackgroundColor(Color.parseColor("#8A8A8A"));
        Paint paint = new Paint();
        this.qdl = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.lnr;
        if (f > 0.0f) {
            float f2 = this.ud;
            canvas.drawLine(0.0f, f2, f, f2, this.qdl);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        float f = i3;
        this.ud = (1.0f * f) / 2.0f;
        this.qdl.setStrokeWidth(f);
    }

    public void setProgress(float f) {
        this.lnr = getWidth() * f;
        invalidate();
    }
}
