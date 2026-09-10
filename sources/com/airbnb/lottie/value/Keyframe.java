package com.airbnb.lottie.value;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.LottieComposition;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class Keyframe<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LottieComposition f9950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f9952c;
    public final Interpolator d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Interpolator f9953e;
    public final Interpolator f;
    public final float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Float f9954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f9955i;
    public float j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9956l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f9957n;
    public PointF o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public PointF f9958p;

    public Keyframe(LottieComposition lottieComposition, Object obj, Object obj2, Interpolator interpolator, float f, Float f2) {
        this.f9955i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.f9956l = 784923401;
        this.m = Float.MIN_VALUE;
        this.f9957n = Float.MIN_VALUE;
        this.o = null;
        this.f9958p = null;
        this.f9950a = lottieComposition;
        this.f9951b = obj;
        this.f9952c = obj2;
        this.d = interpolator;
        this.f9953e = null;
        this.f = null;
        this.g = f;
        this.f9954h = f2;
    }

    public final float a() {
        LottieComposition lottieComposition = this.f9950a;
        if (lottieComposition == null) {
            return 1.0f;
        }
        if (this.f9957n == Float.MIN_VALUE) {
            if (this.f9954h == null) {
                this.f9957n = 1.0f;
            } else {
                this.f9957n = ((this.f9954h.floatValue() - this.g) / (lottieComposition.f9520l - lottieComposition.k)) + b();
            }
        }
        return this.f9957n;
    }

    public final float b() {
        LottieComposition lottieComposition = this.f9950a;
        if (lottieComposition == null) {
            return 0.0f;
        }
        if (this.m == Float.MIN_VALUE) {
            float f = lottieComposition.k;
            this.m = (this.g - f) / (lottieComposition.f9520l - f);
        }
        return this.m;
    }

    public final boolean c() {
        return this.d == null && this.f9953e == null && this.f == null;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f9951b + ", endValue=" + this.f9952c + ", startFrame=" + this.g + ", endFrame=" + this.f9954h + ", interpolator=" + this.d + AbstractJsonLexerKt.END_OBJ;
    }

    public Keyframe(LottieComposition lottieComposition, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f) {
        this.f9955i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.f9956l = 784923401;
        this.m = Float.MIN_VALUE;
        this.f9957n = Float.MIN_VALUE;
        this.o = null;
        this.f9958p = null;
        this.f9950a = lottieComposition;
        this.f9951b = obj;
        this.f9952c = obj2;
        this.d = null;
        this.f9953e = interpolator;
        this.f = interpolator2;
        this.g = f;
        this.f9954h = null;
    }

    public Keyframe(LottieComposition lottieComposition, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.f9955i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.f9956l = 784923401;
        this.m = Float.MIN_VALUE;
        this.f9957n = Float.MIN_VALUE;
        this.o = null;
        this.f9958p = null;
        this.f9950a = lottieComposition;
        this.f9951b = obj;
        this.f9952c = obj2;
        this.d = interpolator;
        this.f9953e = interpolator2;
        this.f = interpolator3;
        this.g = f;
        this.f9954h = f2;
    }

    public Keyframe(Object obj) {
        this.f9955i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.f9956l = 784923401;
        this.m = Float.MIN_VALUE;
        this.f9957n = Float.MIN_VALUE;
        this.o = null;
        this.f9958p = null;
        this.f9950a = null;
        this.f9951b = obj;
        this.f9952c = obj;
        this.d = null;
        this.f9953e = null;
        this.f = null;
        this.g = Float.MIN_VALUE;
        this.f9954h = Float.valueOf(Float.MAX_VALUE);
    }
}
