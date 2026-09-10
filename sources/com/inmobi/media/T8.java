package com.inmobi.media;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class T8 extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap f23223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Canvas f23224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RectF f23225c;
    public RectF d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f23226e;
    public long f;
    public final Paint g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f23227h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Paint f23228i;
    public final Paint j;
    public final Paint k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f23229l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ValueAnimator f23230n;
    public S8 o;

    public T8(Context context) {
        super(context);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-723724);
        this.g = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(-16777216);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setAntiAlias(true);
        this.k = paint2;
        this.f23226e = new Rect();
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setColor(-16777216);
        this.f23227h = paint3;
        Paint paint4 = new Paint();
        paint4.setAntiAlias(true);
        paint4.setColor(0);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f23228i = paint4;
        Paint paint5 = new Paint();
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setAntiAlias(true);
        paint5.setColor(-16777216);
        this.j = paint5;
    }

    public final void a() {
        S8 s8 = this.o;
        if (s8 != null) {
            C8 c8 = (C8) s8;
            C3304x8 c3304x8 = c8.f22738a.f22774p;
            if (c3304x8 != null) {
                Q8 timerAsset = c8.f22739b;
                Intrinsics.f(timerAsset, "timerAsset");
                if (timerAsset.j == 1) {
                    c3304x8.f24100b.a();
                }
            }
        }
        ValueAnimator valueAnimator = this.f23230n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f23230n = null;
    }

    public final void b() {
        ValueAnimator valueAnimator = this.f23230n;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.m = valueAnimator.getCurrentPlayTime();
        valueAnimator.cancel();
    }

    public final void c() {
        ValueAnimator valueAnimator = this.f23230n;
        if (valueAnimator == null || valueAnimator.isRunning()) {
            return;
        }
        valueAnimator.setCurrentPlayTime(this.m);
        valueAnimator.start();
    }

    public final void d() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(TimeUnit.SECONDS.toMillis(this.f));
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new R8(this));
        this.f23230n = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Canvas canvas3;
        Intrinsics.f(canvas, "canvas");
        Canvas canvas4 = this.f23224b;
        if (canvas4 != null) {
            canvas4.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        int iMin = Math.min(width, height);
        V3 v3 = U3.f23253a;
        int iB = (int) (U3.b() * ((int) (getWidth() * 7.0f * 0.007f)));
        float f = width;
        float f2 = height;
        canvas.drawCircle(f, f2, iMin, this.g);
        canvas.drawCircle(f, f2, iMin - iB, this.j);
        ValueAnimator valueAnimator = this.f23230n;
        if (valueAnimator != null) {
            int currentPlayTime = (int) (this.f - (valueAnimator.getCurrentPlayTime() / ((long) 1000)));
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            if (((Float) animatedValue).floatValue() >= 1.0d) {
                currentPlayTime = 0;
            }
            Paint paint = this.k;
            Rect rect = this.f23226e;
            String strValueOf = String.valueOf(currentPlayTime);
            paint.getTextBounds(strValueOf, 0, strValueOf.length(), rect);
            canvas.drawText(strValueOf, getWidth() / 2, (getHeight() / 2) + (((paint.descent() - paint.ascent()) / 2) - paint.descent()), paint);
            Object animatedValue2 = valueAnimator.getAnimatedValue();
            Intrinsics.d(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
            if (((Float) animatedValue2).floatValue() >= 1.0d) {
                a();
            }
        }
        float f3 = this.f23229l;
        if (f3 > 0.0f) {
            RectF rectF = this.f23225c;
            if (rectF != null && (canvas3 = this.f23224b) != null) {
                canvas3.drawArc(rectF, 270.0f, f3, true, this.f23227h);
            }
            RectF rectF2 = this.d;
            if (rectF2 != null && (canvas2 = this.f23224b) != null) {
                canvas2.drawOval(rectF2, this.f23228i);
            }
        }
        Bitmap bitmap = this.f23223a;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (i2 != i4 || i3 != i5) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            Intrinsics.e(bitmapCreateBitmap, "createBitmap(...)");
            bitmapCreateBitmap.eraseColor(0);
            this.f23223a = bitmapCreateBitmap;
            this.f23224b = new Canvas(bitmapCreateBitmap);
        }
        super.onSizeChanged(i2, i3, i4, i5);
        V3 v3 = U3.f23253a;
        float fB = (int) (U3.b() * ((int) (getWidth() * 4.0f * 0.007f)));
        float fB2 = (int) (U3.b() * ((int) (getWidth() * 14.0f * 0.007f)));
        float fB3 = (int) (U3.b() * ((int) (getWidth() * 5.0f * 0.007f)));
        float fB4 = (int) (U3.b() * ((int) (getWidth() * 1.5f * 0.007f)));
        RectF rectF = new RectF(fB3, fB3, getWidth() - fB3, getHeight() - fB3);
        this.f23225c = rectF;
        this.d = new RectF(rectF.left + fB, rectF.top + fB, rectF.right - fB, rectF.bottom - fB);
        this.j.setStrokeWidth(fB4);
        this.k.setTextSize(fB2);
        invalidate();
    }

    public final void setTimerEventsListener(S8 s8) {
        this.o = s8;
    }

    public final void setTimerValue(long j) {
        this.f = j;
    }
}
