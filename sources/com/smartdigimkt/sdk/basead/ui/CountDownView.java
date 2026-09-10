package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes6.dex */
public class CountDownView extends CloseImageView {
    private Drawable A0;
    private Paint i0;
    private Paint j0;
    private Paint k0;
    private float l0;
    private float m0;
    private int n0;
    private int o0;
    private int p0;
    private int q0;
    private int r0;
    private int s0;
    private RectF t0;
    private float u0;
    private String v0;
    private Rect w0;
    private long x0;
    private float y0;
    private Paint.FontMetrics z0;

    public CountDownView(Context context) {
        this(context, null);
    }

    private void a(Context context) {
        this.l0 = TypedValue.applyDimension(1, 2.5f, context.getResources().getDisplayMetrics());
        this.m0 = TypedValue.applyDimension(1, 10.0f, context.getResources().getDisplayMetrics());
        this.n0 = Color.parseColor("#66000000");
        this.o0 = Color.parseColor("#CC000000");
        this.p0 = -1;
        Paint paint = new Paint();
        this.i0 = paint;
        paint.setAntiAlias(true);
        this.i0.setStrokeCap(Paint.Cap.ROUND);
        this.i0.setStyle(Paint.Style.STROKE);
        this.i0.setStrokeWidth(this.l0);
        Paint paint2 = new Paint(this.i0);
        this.j0 = paint2;
        paint2.setColor(this.n0);
        this.j0.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint();
        this.k0 = paint3;
        paint3.setAntiAlias(true);
        this.k0.setTextSize(this.m0);
        this.k0.setColor(this.p0);
        this.t0 = new RectF();
        this.w0 = new Rect();
        this.x0 = -1L;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A0 != null && TextUtils.equals("0", this.v0)) {
            this.A0.setBounds(0, 0, getWidth(), getHeight());
            this.A0.draw(canvas);
            return;
        }
        canvas.drawCircle(this.t0.centerX(), this.t0.centerY(), this.s0, this.j0);
        this.i0.setColor(this.o0);
        canvas.drawArc(this.t0, 0.0f, 360.0f, false, this.i0);
        this.i0.setColor(this.p0);
        canvas.drawArc(this.t0, -90.0f, this.u0, false, this.i0);
        if (TextUtils.isEmpty(this.v0)) {
            return;
        }
        Paint paint = this.k0;
        String str = this.v0;
        paint.getTextBounds(str, 0, str.length(), this.w0);
        this.y0 = this.k0.measureText(this.v0);
        this.z0 = this.k0.getFontMetrics();
        String str2 = this.v0;
        float fCenterX = this.t0.centerX() - (this.y0 / 2.0f);
        float fCenterY = this.t0.centerY();
        Paint.FontMetrics fontMetrics = this.z0;
        float f = fontMetrics.bottom;
        canvas.drawText(str2, fCenterX, (((f - fontMetrics.top) / 2.0f) - f) + fCenterY, this.k0);
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.q0 = i2;
        this.r0 = i3;
        a();
    }

    public void refresh(long j) {
        long j2 = this.x0;
        if (j2 >= 0) {
            this.u0 = ((j * 1.0f) / j2) * 360.0f;
            this.v0 = android.support.v4.media.a.i((int) Math.ceil((this.x0 - j) / 1000.0d), "", new StringBuilder());
            postInvalidate();
        }
    }

    public void refreshToEnd() {
        if (this.x0 > 0) {
            this.u0 = 360.0f;
            this.v0 = "0";
            postInvalidate();
        }
    }

    public void setBgColor(int i2) {
        this.n0 = i2;
        this.j0.setColor(i2);
    }

    public void setCountDownEndDrawable(Drawable drawable) {
        this.A0 = drawable;
        postInvalidate();
    }

    public void setDuration(long j) {
        this.x0 = j;
        this.v0 = android.support.v4.media.a.j(j / 1000, "", new StringBuilder());
    }

    public void setThickInPx(int i2) {
        float f = i2;
        this.l0 = f;
        this.i0.setStrokeWidth(f);
        a();
    }

    public void setUnderRingColor(int i2) {
        this.o0 = i2;
    }

    public CountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    private void a() {
        float f = this.l0 * 0.5f;
        float f2 = 0.0f + f;
        this.t0.set(f2, f2, this.q0 - f, this.r0 - f);
        this.s0 = ((int) this.t0.width()) >> 1;
    }
}
