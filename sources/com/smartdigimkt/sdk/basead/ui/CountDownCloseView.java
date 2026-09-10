package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes6.dex */
public class CountDownCloseView extends CloseImageView {
    private Paint i0;
    private Paint j0;
    private float k0;
    private int l0;
    private int m0;
    private int n0;
    private int o0;
    private int p0;
    private RectF q0;
    private float r0;
    private long s0;

    public CountDownCloseView(Context context) {
        this(context, null);
    }

    private void a(Context context) {
        this.k0 = TypedValue.applyDimension(1, 2.5f, context.getResources().getDisplayMetrics());
        this.l0 = Color.parseColor("#FF57575A");
        this.m0 = -1;
        Paint paint = new Paint();
        this.i0 = paint;
        paint.setAntiAlias(true);
        this.i0.setStrokeCap(Paint.Cap.ROUND);
        this.i0.setStyle(Paint.Style.STROKE);
        this.i0.setStrokeWidth(this.k0);
        Paint paint2 = new Paint();
        this.j0 = paint2;
        paint2.setAntiAlias(true);
        this.j0.setColor(this.m0);
        this.q0 = new RectF();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.r0 < 360.0f) {
            this.i0.setColor(this.l0);
            canvas.drawArc(this.q0, 0.0f, 360.0f, false, this.i0);
            this.i0.setColor(this.m0);
            canvas.drawArc(this.q0, -90.0f, this.r0, false, this.i0);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.n0 = i2;
        this.o0 = i3;
        a();
    }

    public void refresh(long j) {
        long j2 = this.s0;
        if (j2 > 0) {
            this.r0 = ((j * 1.0f) / j2) * 360.0f;
            postInvalidate();
        }
    }

    public void setDuration(long j) {
        this.s0 = j;
    }

    public void setThickInPx(int i2) {
        float f = i2;
        this.k0 = f;
        this.i0.setStrokeWidth(f);
        a();
    }

    public void setUnderRingColor(int i2) {
        this.l0 = i2;
    }

    public CountDownCloseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    private void a() {
        float f = this.k0 * 0.5f;
        float f2 = 0.0f + f;
        this.q0.set(f2, f2, this.n0 - f, this.o0 - f);
        this.p0 = ((int) this.q0.width()) >> 1;
    }
}
