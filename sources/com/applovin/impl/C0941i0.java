package com.applovin.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: com.applovin.impl.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0941i0 extends View {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f10928w = Color.rgb(66, 145, 241);
    private static final int x = Color.rgb(66, 145, 241);
    private static final int y = Color.rgb(66, 145, 241);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f10929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f10930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Paint f10931c;
    protected Paint d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RectF f10932e;
    private float f;
    private int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f10933h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f10934i;
    private int j;
    private int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f10935l;
    private int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f10936n;
    private String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f10937p;
    private String q;
    private float r;
    private final float s;
    private final float t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final float f10938u;
    private final int v;

    /* JADX INFO: renamed from: com.applovin.impl.i0$a */
    public static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static float c(Resources resources, float f) {
            return (f * resources.getDisplayMetrics().density) + 0.5f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static float d(Resources resources, float f) {
            return f * resources.getDisplayMetrics().scaledDensity;
        }
    }

    public C0941i0(Context context) {
        this(context, null);
    }

    private float getProgressAngle() {
        return (getProgress() / this.j) * 360.0f;
    }

    public void a() {
        this.k = f10928w;
        this.g = x;
        this.f = this.t;
        setMax(100);
        setProgress(0);
        this.f10935l = this.s;
        this.m = 0;
        this.f10937p = this.f10938u;
        this.f10933h = y;
    }

    public void b() {
        TextPaint textPaint = new TextPaint();
        this.f10931c = textPaint;
        textPaint.setColor(this.g);
        this.f10931c.setTextSize(this.f);
        this.f10931c.setAntiAlias(true);
        TextPaint textPaint2 = new TextPaint();
        this.d = textPaint2;
        textPaint2.setColor(this.f10933h);
        this.d.setTextSize(this.f10937p);
        this.d.setAntiAlias(true);
        Paint paint = new Paint();
        this.f10929a = paint;
        paint.setColor(this.k);
        this.f10929a.setStyle(Paint.Style.STROKE);
        this.f10929a.setAntiAlias(true);
        this.f10929a.setStrokeWidth(this.f10935l);
        Paint paint2 = new Paint();
        this.f10930b = paint2;
        paint2.setColor(this.m);
        this.f10930b.setAntiAlias(true);
    }

    public int getFinishedStrokeColor() {
        return this.k;
    }

    public float getFinishedStrokeWidth() {
        return this.f10935l;
    }

    public int getInnerBackgroundColor() {
        return this.m;
    }

    public String getInnerBottomText() {
        return this.q;
    }

    public int getInnerBottomTextColor() {
        return this.f10933h;
    }

    public float getInnerBottomTextSize() {
        return this.f10937p;
    }

    public int getMax() {
        return this.j;
    }

    public String getPrefixText() {
        return this.f10936n;
    }

    public int getProgress() {
        return this.f10934i;
    }

    public String getSuffixText() {
        return this.o;
    }

    public int getTextColor() {
        return this.g;
    }

    public float getTextSize() {
        return this.f;
    }

    @Override // android.view.View
    public void invalidate() {
        b();
        super.invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.f10935l;
        this.f10932e.set(f, f, getWidth() - f, getHeight() - f);
        float width = getWidth();
        float f2 = this.f10935l;
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, ((width - f2) + f2) / 2.0f, this.f10930b);
        canvas.drawArc(this.f10932e, 270.0f, -getProgressAngle(), false, this.f10929a);
        String str = this.f10936n + this.f10934i + this.o;
        if (!TextUtils.isEmpty(str)) {
            canvas.drawText(str, (getWidth() - this.f10931c.measureText(str)) / 2.0f, (getWidth() - (this.f10931c.ascent() + this.f10931c.descent())) / 2.0f, this.f10931c);
        }
        if (TextUtils.isEmpty(getInnerBottomText())) {
            return;
        }
        this.d.setTextSize(this.f10937p);
        canvas.drawText(getInnerBottomText(), (getWidth() - this.d.measureText(getInnerBottomText())) / 2.0f, (getHeight() - this.r) - ((this.f10931c.ascent() + this.f10931c.descent()) / 2.0f), this.d);
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(a(i2), a(i3));
        this.r = getHeight() - ((getHeight() * 3) / 4);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.g = bundle.getInt("text_color");
        this.f = bundle.getFloat("text_size");
        this.f10937p = bundle.getFloat("inner_bottom_text_size");
        this.q = bundle.getString("inner_bottom_text");
        this.f10933h = bundle.getInt("inner_bottom_text_color");
        this.k = bundle.getInt("finished_stroke_color");
        this.f10935l = bundle.getFloat("finished_stroke_width");
        this.m = bundle.getInt("inner_background_color");
        b();
        setMax(bundle.getInt("max"));
        setProgress(bundle.getInt("progress"));
        this.f10936n = bundle.getString("prefix");
        this.o = bundle.getString("suffix");
        super.onRestoreInstanceState(bundle.getParcelable("saved_instance"));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("saved_instance", super.onSaveInstanceState());
        bundle.putInt("text_color", getTextColor());
        bundle.putFloat("text_size", getTextSize());
        bundle.putFloat("inner_bottom_text_size", getInnerBottomTextSize());
        bundle.putFloat("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putString("inner_bottom_text", getInnerBottomText());
        bundle.putInt("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putInt("finished_stroke_color", getFinishedStrokeColor());
        bundle.putInt("max", getMax());
        bundle.putInt("progress", getProgress());
        bundle.putString("suffix", getSuffixText());
        bundle.putString("prefix", getPrefixText());
        bundle.putFloat("finished_stroke_width", getFinishedStrokeWidth());
        bundle.putInt("inner_background_color", getInnerBackgroundColor());
        return bundle;
    }

    public void setFinishedStrokeColor(int i2) {
        this.k = i2;
        invalidate();
    }

    public void setFinishedStrokeWidth(float f) {
        this.f10935l = f;
        invalidate();
    }

    public void setInnerBackgroundColor(int i2) {
        this.m = i2;
        invalidate();
    }

    public void setInnerBottomText(String str) {
        this.q = str;
        invalidate();
    }

    public void setInnerBottomTextColor(int i2) {
        this.f10933h = i2;
        invalidate();
    }

    public void setInnerBottomTextSize(float f) {
        this.f10937p = f;
        invalidate();
    }

    public void setMax(int i2) {
        if (i2 > 0) {
            this.j = i2;
            invalidate();
        }
    }

    public void setPrefixText(String str) {
        this.f10936n = str;
        invalidate();
    }

    public void setProgress(int i2) {
        this.f10934i = i2;
        if (i2 > getMax()) {
            this.f10934i %= getMax();
        }
        invalidate();
    }

    public void setSuffixText(String str) {
        this.o = str;
        invalidate();
    }

    public void setTextColor(int i2) {
        this.g = i2;
        invalidate();
    }

    public void setTextSize(float f) {
        this.f = f;
        invalidate();
    }

    public C0941i0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0941i0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f10932e = new RectF();
        this.f10934i = 0;
        this.f10936n = "";
        this.o = "";
        this.q = "";
        this.t = a.d(getResources(), 14.0f);
        this.v = (int) a.c(getResources(), 100.0f);
        this.s = a.c(getResources(), 4.0f);
        this.f10938u = a.d(getResources(), 18.0f);
        a();
        b();
    }

    private int a(int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            return size;
        }
        int i3 = this.v;
        return mode == Integer.MIN_VALUE ? Math.min(i3, size) : i3;
    }
}
