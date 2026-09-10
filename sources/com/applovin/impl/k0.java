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
import androidx.core.app.NotificationCompat;
import com.applovin.sdk.AppLovinMediationProvider;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class k0 extends View {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f8252w = Color.rgb(66, 145, 241);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f8253x = Color.rgb(66, 145, 241);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f8254y = Color.rgb(66, 145, 241);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f8255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f8256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Paint f8257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Paint f8258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RectF f8259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f8260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f8261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f8262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f8263i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f8264j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f8265k;
    private float l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f8266m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f8267n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f8268o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f8269p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f8270q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f8271r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final float f8272s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final float f8273t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final float f8274u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f8275v;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static float c(Resources resources, float f10) {
            return (f10 * resources.getDisplayMetrics().density) + 0.5f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static float d(Resources resources, float f10) {
            return f10 * resources.getDisplayMetrics().scaledDensity;
        }
    }

    public k0(Context context) {
        this(context, null);
    }

    private float getProgressAngle() {
        return (getProgress() / this.f8264j) * 360.0f;
    }

    public void a() {
        this.f8265k = f8252w;
        this.f8261g = f8253x;
        this.f8260f = this.f8273t;
        setMax(100);
        setProgress(0);
        this.l = this.f8272s;
        this.f8266m = 0;
        this.f8269p = this.f8274u;
        this.f8262h = f8254y;
    }

    public void b() {
        TextPaint textPaint = new TextPaint();
        this.f8257c = textPaint;
        textPaint.setColor(this.f8261g);
        this.f8257c.setTextSize(this.f8260f);
        this.f8257c.setAntiAlias(true);
        TextPaint textPaint2 = new TextPaint();
        this.f8258d = textPaint2;
        textPaint2.setColor(this.f8262h);
        this.f8258d.setTextSize(this.f8269p);
        this.f8258d.setAntiAlias(true);
        Paint paint = new Paint();
        this.f8255a = paint;
        paint.setColor(this.f8265k);
        this.f8255a.setStyle(Paint.Style.STROKE);
        this.f8255a.setAntiAlias(true);
        this.f8255a.setStrokeWidth(this.l);
        Paint paint2 = new Paint();
        this.f8256b = paint2;
        paint2.setColor(this.f8266m);
        this.f8256b.setAntiAlias(true);
    }

    public int getFinishedStrokeColor() {
        return this.f8265k;
    }

    public float getFinishedStrokeWidth() {
        return this.l;
    }

    public int getInnerBackgroundColor() {
        return this.f8266m;
    }

    public String getInnerBottomText() {
        return this.f8270q;
    }

    public int getInnerBottomTextColor() {
        return this.f8262h;
    }

    public float getInnerBottomTextSize() {
        return this.f8269p;
    }

    public int getMax() {
        return this.f8264j;
    }

    public String getPrefixText() {
        return this.f8267n;
    }

    public int getProgress() {
        return this.f8263i;
    }

    public String getSuffixText() {
        return this.f8268o;
    }

    public int getTextColor() {
        return this.f8261g;
    }

    public float getTextSize() {
        return this.f8260f;
    }

    @Override // android.view.View
    public void invalidate() {
        b();
        super.invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = this.l;
        this.f8259e.set(f10, f10, getWidth() - f10, getHeight() - f10);
        float width = getWidth();
        float f11 = this.l;
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, ((width - f11) + f11) / 2.0f, this.f8256b);
        canvas.drawArc(this.f8259e, 270.0f, -getProgressAngle(), false, this.f8255a);
        String str = this.f8267n + this.f8263i + this.f8268o;
        if (!TextUtils.isEmpty(str)) {
            canvas.drawText(str, (getWidth() - this.f8257c.measureText(str)) / 2.0f, (getWidth() - (this.f8257c.ascent() + this.f8257c.descent())) / 2.0f, this.f8257c);
        }
        if (TextUtils.isEmpty(getInnerBottomText())) {
            return;
        }
        this.f8258d.setTextSize(this.f8269p);
        canvas.drawText(getInnerBottomText(), (getWidth() - this.f8258d.measureText(getInnerBottomText())) / 2.0f, (getHeight() - this.f8271r) - ((this.f8257c.ascent() + this.f8257c.descent()) / 2.0f), this.f8258d);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(a(i10), a(i11));
        this.f8271r = getHeight() - ((getHeight() * 3) / 4);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.f8261g = bundle.getInt("text_color");
        this.f8260f = bundle.getFloat("text_size");
        this.f8269p = bundle.getFloat("inner_bottom_text_size");
        this.f8270q = bundle.getString("inner_bottom_text");
        this.f8262h = bundle.getInt("inner_bottom_text_color");
        this.f8265k = bundle.getInt("finished_stroke_color");
        this.l = bundle.getFloat("finished_stroke_width");
        this.f8266m = bundle.getInt("inner_background_color");
        b();
        setMax(bundle.getInt(AppLovinMediationProvider.MAX));
        setProgress(bundle.getInt(NotificationCompat.CATEGORY_PROGRESS));
        this.f8267n = bundle.getString("prefix");
        this.f8268o = bundle.getString("suffix");
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
        bundle.putInt(AppLovinMediationProvider.MAX, getMax());
        bundle.putInt(NotificationCompat.CATEGORY_PROGRESS, getProgress());
        bundle.putString("suffix", getSuffixText());
        bundle.putString("prefix", getPrefixText());
        bundle.putFloat("finished_stroke_width", getFinishedStrokeWidth());
        bundle.putInt("inner_background_color", getInnerBackgroundColor());
        return bundle;
    }

    public void setFinishedStrokeColor(int i10) {
        this.f8265k = i10;
        invalidate();
    }

    public void setFinishedStrokeWidth(float f10) {
        this.l = f10;
        invalidate();
    }

    public void setInnerBackgroundColor(int i10) {
        this.f8266m = i10;
        invalidate();
    }

    public void setInnerBottomText(String str) {
        this.f8270q = str;
        invalidate();
    }

    public void setInnerBottomTextColor(int i10) {
        this.f8262h = i10;
        invalidate();
    }

    public void setInnerBottomTextSize(float f10) {
        this.f8269p = f10;
        invalidate();
    }

    public void setMax(int i10) {
        if (i10 > 0) {
            this.f8264j = i10;
            invalidate();
        }
    }

    public void setPrefixText(String str) {
        this.f8267n = str;
        invalidate();
    }

    public void setProgress(int i10) {
        this.f8263i = i10;
        if (i10 > getMax()) {
            this.f8263i %= getMax();
        }
        invalidate();
    }

    public void setSuffixText(String str) {
        this.f8268o = str;
        invalidate();
    }

    public void setTextColor(int i10) {
        this.f8261g = i10;
        invalidate();
    }

    public void setTextSize(float f10) {
        this.f8260f = f10;
        invalidate();
    }

    public k0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public k0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f8259e = new RectF();
        this.f8263i = 0;
        this.f8267n = "";
        this.f8268o = "";
        this.f8270q = "";
        this.f8273t = a.d(getResources(), 14.0f);
        this.f8275v = (int) a.c(getResources(), 100.0f);
        this.f8272s = a.c(getResources(), 4.0f);
        this.f8274u = a.d(getResources(), 18.0f);
        a();
        b();
    }

    private int a(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == 1073741824) {
            return size;
        }
        int i11 = this.f8275v;
        return mode == Integer.MIN_VALUE ? Math.min(i11, size) : i11;
    }
}
