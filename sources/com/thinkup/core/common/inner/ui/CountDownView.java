package com.thinkup.core.common.inner.ui;

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
    private Paint m;
    private int m0;
    private int mm;
    private int mn;
    private int mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Paint f41845n;
    private RectF n0;
    private String nm;
    private Rect nn;
    private float no;
    private Paint o;
    private float o0;
    private long o00;
    private Paint.FontMetrics o0m;
    private Drawable o0n;
    private float o0o;
    private int om;
    private int on;
    private float oo;

    public CountDownView(Context context) {
        this(context, null);
    }

    private void o(Context context) {
        this.o0 = TypedValue.applyDimension(1, 2.5f, context.getResources().getDisplayMetrics());
        this.oo = TypedValue.applyDimension(1, 10.0f, context.getResources().getDisplayMetrics());
        this.om = Color.parseColor("#66000000");
        this.on = Color.parseColor("#CC000000");
        this.m0 = -1;
        Paint paint = new Paint();
        this.o = paint;
        paint.setAntiAlias(true);
        this.o.setStrokeCap(Paint.Cap.ROUND);
        this.o.setStyle(Paint.Style.STROKE);
        this.o.setStrokeWidth(this.o0);
        Paint paint2 = new Paint(this.o);
        this.m = paint2;
        paint2.setColor(this.om);
        this.m.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint();
        this.f41845n = paint3;
        paint3.setAntiAlias(true);
        this.f41845n.setTextSize(this.oo);
        this.f41845n.setColor(this.m0);
        this.n0 = new RectF();
        this.nn = new Rect();
        this.o00 = -1L;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.o0n != null && TextUtils.equals("0", this.nm)) {
            this.o0n.setBounds(0, 0, getWidth(), getHeight());
            this.o0n.draw(canvas);
            return;
        }
        canvas.drawCircle(this.n0.centerX(), this.n0.centerY(), this.mn, this.m);
        this.o.setColor(this.on);
        canvas.drawArc(this.n0, 0.0f, 360.0f, false, this.o);
        this.o.setColor(this.m0);
        canvas.drawArc(this.n0, -90.0f, this.no, false, this.o);
        if (TextUtils.isEmpty(this.nm)) {
            return;
        }
        Paint paint = this.f41845n;
        String str = this.nm;
        paint.getTextBounds(str, 0, str.length(), this.nn);
        this.o0o = this.f41845n.measureText(this.nm);
        this.o0m = this.f41845n.getFontMetrics();
        String str2 = this.nm;
        float fCenterX = this.n0.centerX() - (this.o0o / 2.0f);
        float fCenterY = this.n0.centerY();
        Paint.FontMetrics fontMetrics = this.o0m;
        float f = fontMetrics.bottom;
        canvas.drawText(str2, fCenterX, (((f - fontMetrics.top) / 2.0f) - f) + fCenterY, this.f41845n);
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.mo = i2;
        this.mm = i3;
        o();
    }

    public void refresh(long j) {
        long j2 = this.o00;
        if (j2 >= 0) {
            this.no = ((j * 1.0f) / j2) * 360.0f;
            StringBuilder sb = new StringBuilder();
            sb.append((int) Math.ceil(j / 1000.0d));
            this.nm = sb.toString();
            postInvalidate();
        }
    }

    public void refreshToEnd() {
        if (this.o00 > 0) {
            this.no = 360.0f;
            this.nm = "0";
            postInvalidate();
        }
    }

    public void setBgColor(int i2) {
        this.om = i2;
        this.m.setColor(i2);
    }

    public void setCountDownEndDrawable(Drawable drawable) {
        this.o0n = drawable;
        postInvalidate();
    }

    public void setDuration(long j) {
        this.o00 = j;
        StringBuilder sb = new StringBuilder();
        sb.append(j / 1000);
        this.nm = sb.toString();
    }

    public void setThickInPx(int i2) {
        float f = i2;
        this.o0 = f;
        this.o.setStrokeWidth(f);
        o();
    }

    public void setUnderRingColor(int i2) {
        this.on = i2;
    }

    public CountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o0 = TypedValue.applyDimension(1, 2.5f, context.getResources().getDisplayMetrics());
        this.oo = TypedValue.applyDimension(1, 10.0f, context.getResources().getDisplayMetrics());
        this.om = Color.parseColor("#66000000");
        this.on = Color.parseColor("#CC000000");
        this.m0 = -1;
        Paint paint = new Paint();
        this.o = paint;
        paint.setAntiAlias(true);
        this.o.setStrokeCap(Paint.Cap.ROUND);
        this.o.setStyle(Paint.Style.STROKE);
        this.o.setStrokeWidth(this.o0);
        Paint paint2 = new Paint(this.o);
        this.m = paint2;
        paint2.setColor(this.om);
        this.m.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint();
        this.f41845n = paint3;
        paint3.setAntiAlias(true);
        this.f41845n.setTextSize(this.oo);
        this.f41845n.setColor(this.m0);
        this.n0 = new RectF();
        this.nn = new Rect();
        this.o00 = -1L;
    }

    private void o() {
        float f = this.o0 * 0.5f;
        float f2 = 0.0f + f;
        this.n0.set(f2, f2, this.mo - f, this.mm - f);
        this.mn = ((int) this.n0.width()) >> 1;
    }
}
