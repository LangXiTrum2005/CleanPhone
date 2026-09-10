package com.thinkup.core.common.inner.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes6.dex */
public class CountDownCloseView extends CloseImageView {
    private Paint m;
    private int m0;
    private float mm;
    private long mn;
    private RectF mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f41844n;
    private Paint o;
    private int o0;
    private int om;
    private int on;
    private int oo;

    public CountDownCloseView(Context context) {
        this(context, null);
    }

    private void o(Context context) {
        this.f41844n = TypedValue.applyDimension(1, 2.5f, context.getResources().getDisplayMetrics());
        this.o0 = Color.parseColor("#FF57575A");
        this.oo = -1;
        Paint paint = new Paint();
        this.o = paint;
        paint.setAntiAlias(true);
        this.o.setStrokeCap(Paint.Cap.ROUND);
        this.o.setStyle(Paint.Style.STROKE);
        this.o.setStrokeWidth(this.f41844n);
        Paint paint2 = new Paint();
        this.m = paint2;
        paint2.setAntiAlias(true);
        this.m.setColor(this.oo);
        this.mo = new RectF();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mm < 360.0f) {
            this.o.setColor(this.o0);
            canvas.drawArc(this.mo, 0.0f, 360.0f, false, this.o);
            this.o.setColor(this.oo);
            canvas.drawArc(this.mo, -90.0f, this.mm, false, this.o);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.om = i2;
        this.on = i3;
        o();
    }

    public void refresh(long j) {
        long j2 = this.mn;
        if (j2 > 0) {
            this.mm = ((j * 1.0f) / j2) * 360.0f;
            postInvalidate();
        }
    }

    public void setDuration(long j) {
        this.mn = j;
    }

    public void setThickInPx(int i2) {
        float f = i2;
        this.f41844n = f;
        this.o.setStrokeWidth(f);
        o();
    }

    public void setUnderRingColor(int i2) {
        this.o0 = i2;
    }

    public CountDownCloseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41844n = TypedValue.applyDimension(1, 2.5f, context.getResources().getDisplayMetrics());
        this.o0 = Color.parseColor("#FF57575A");
        this.oo = -1;
        Paint paint = new Paint();
        this.o = paint;
        paint.setAntiAlias(true);
        this.o.setStrokeCap(Paint.Cap.ROUND);
        this.o.setStyle(Paint.Style.STROKE);
        this.o.setStrokeWidth(this.f41844n);
        Paint paint2 = new Paint();
        this.m = paint2;
        paint2.setAntiAlias(true);
        this.m.setColor(this.oo);
        this.mo = new RectF();
    }

    private void o() {
        float f = this.f41844n * 0.5f;
        float f2 = 0.0f + f;
        this.mo.set(f2, f2, this.om - f, this.on - f);
        this.m0 = ((int) this.mo.width()) >> 1;
    }
}
