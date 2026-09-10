package com.airbnb.lottie.animation.content;

import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PointF;
import android.support.v4.media.a;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class PolystarContent implements PathContent, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LottieDrawable f9612c;
    public final PolystarShape.Type d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9613e;
    public final boolean f;
    public final FloatKeyframeAnimation g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final BaseKeyframeAnimation f9614h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final FloatKeyframeAnimation f9615i;
    public final FloatKeyframeAnimation j;
    public final FloatKeyframeAnimation k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final FloatKeyframeAnimation f9616l;
    public final FloatKeyframeAnimation m;
    public boolean o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f9610a = new Path();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CompoundTrimPathContent f9617n = new CompoundTrimPathContent();

    /* JADX INFO: renamed from: com.airbnb.lottie.animation.content.PolystarContent$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9618a;

        static {
            int[] iArr = new int[PolystarShape.Type.values().length];
            f9618a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9618a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public PolystarContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, PolystarShape polystarShape) {
        this.f9612c = lottieDrawable;
        this.f9611b = polystarShape.f9777a;
        PolystarShape.Type type = polystarShape.f9778b;
        this.d = type;
        this.f9613e = polystarShape.j;
        this.f = polystarShape.k;
        BaseKeyframeAnimation baseKeyframeAnimationG = polystarShape.f9779c.g();
        this.g = (FloatKeyframeAnimation) baseKeyframeAnimationG;
        BaseKeyframeAnimation baseKeyframeAnimationG2 = polystarShape.d.g();
        this.f9614h = baseKeyframeAnimationG2;
        BaseKeyframeAnimation baseKeyframeAnimationG3 = polystarShape.f9780e.g();
        this.f9615i = (FloatKeyframeAnimation) baseKeyframeAnimationG3;
        BaseKeyframeAnimation baseKeyframeAnimationG4 = polystarShape.g.g();
        this.k = (FloatKeyframeAnimation) baseKeyframeAnimationG4;
        BaseKeyframeAnimation baseKeyframeAnimationG5 = polystarShape.f9782i.g();
        this.m = (FloatKeyframeAnimation) baseKeyframeAnimationG5;
        PolystarShape.Type type2 = PolystarShape.Type.STAR;
        if (type == type2) {
            this.j = (FloatKeyframeAnimation) polystarShape.f.g();
            this.f9616l = (FloatKeyframeAnimation) polystarShape.f9781h.g();
        } else {
            this.j = null;
            this.f9616l = null;
        }
        baseLayer.g(baseKeyframeAnimationG);
        baseLayer.g(baseKeyframeAnimationG2);
        baseLayer.g(baseKeyframeAnimationG3);
        baseLayer.g(baseKeyframeAnimationG4);
        baseLayer.g(baseKeyframeAnimationG5);
        if (type == type2) {
            baseLayer.g(this.j);
            baseLayer.g(this.f9616l);
        }
        baseKeyframeAnimationG.a(this);
        baseKeyframeAnimationG2.a(this);
        baseKeyframeAnimationG3.a(this);
        baseKeyframeAnimationG4.a(this);
        baseKeyframeAnimationG5.a(this);
        if (type == type2) {
            this.j.a(this);
            this.f9616l.a(this);
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public final void a() {
        this.o = false;
        this.f9612c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final void b(List list, List list2) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i2 >= arrayList.size()) {
                return;
            }
            Content content = (Content) arrayList.get(i2);
            if (content instanceof TrimPathContent) {
                TrimPathContent trimPathContent = (TrimPathContent) content;
                if (trimPathContent.f9641c == ShapeTrimPath.Type.X) {
                    this.f9617n.f9571a.add(trimPathContent);
                    trimPathContent.d(this);
                }
            }
            i2++;
        }
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void d(ColorFilter colorFilter, LottieValueCallback lottieValueCallback) {
        FloatKeyframeAnimation floatKeyframeAnimation;
        FloatKeyframeAnimation floatKeyframeAnimation2;
        if (colorFilter == LottieProperty.r) {
            this.g.k(lottieValueCallback);
            return;
        }
        if (colorFilter == LottieProperty.s) {
            this.f9615i.k(lottieValueCallback);
            return;
        }
        if (colorFilter == LottieProperty.f9540i) {
            this.f9614h.k(lottieValueCallback);
            return;
        }
        if (colorFilter == LottieProperty.t && (floatKeyframeAnimation2 = this.j) != null) {
            floatKeyframeAnimation2.k(lottieValueCallback);
            return;
        }
        if (colorFilter == LottieProperty.f9544u) {
            this.k.k(lottieValueCallback);
            return;
        }
        if (colorFilter == LottieProperty.v && (floatKeyframeAnimation = this.f9616l) != null) {
            floatKeyframeAnimation.k(lottieValueCallback);
        } else if (colorFilter == LottieProperty.f9545w) {
            this.m.k(lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public final void e(KeyPath keyPath, int i2, ArrayList arrayList, KeyPath keyPath2) {
        MiscUtils.f(keyPath, i2, arrayList, keyPath2, this);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final String getName() {
        return this.f9611b;
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public final Path u() {
        float f;
        float f2;
        double d;
        float fCos;
        float fSin;
        float f3;
        int i2;
        float f4;
        boolean z2 = this.o;
        Path path = this.f9610a;
        if (z2) {
            return path;
        }
        path.reset();
        if (this.f9613e) {
            this.o = true;
            return path;
        }
        int iOrdinal = this.d.ordinal();
        FloatKeyframeAnimation floatKeyframeAnimation = this.k;
        FloatKeyframeAnimation floatKeyframeAnimation2 = this.m;
        FloatKeyframeAnimation floatKeyframeAnimation3 = this.f9615i;
        FloatKeyframeAnimation floatKeyframeAnimation4 = this.g;
        BaseKeyframeAnimation baseKeyframeAnimation = this.f9614h;
        if (iOrdinal == 0) {
            float fFloatValue = ((Float) floatKeyframeAnimation4.f()).floatValue();
            double radians = Math.toRadians((floatKeyframeAnimation3 != null ? ((Float) floatKeyframeAnimation3.f()).floatValue() : 0.0d) - 90.0d);
            double d2 = fFloatValue;
            float f5 = (float) (6.283185307179586d / d2);
            if (this.f) {
                f5 *= -1.0f;
            }
            float f6 = f5 / 2.0f;
            float f7 = fFloatValue - ((int) fFloatValue);
            if (f7 != 0.0f) {
                radians += (double) ((1.0f - f7) * f6);
            }
            float fFloatValue2 = ((Float) floatKeyframeAnimation.f()).floatValue();
            float fFloatValue3 = ((Float) this.j.f()).floatValue();
            FloatKeyframeAnimation floatKeyframeAnimation5 = this.f9616l;
            float fFloatValue4 = floatKeyframeAnimation5 != null ? ((Float) floatKeyframeAnimation5.f()).floatValue() / 100.0f : 0.0f;
            float fFloatValue5 = floatKeyframeAnimation2 != null ? ((Float) floatKeyframeAnimation2.f()).floatValue() / 100.0f : 0.0f;
            if (f7 != 0.0f) {
                float fA = a.a(fFloatValue2, fFloatValue3, f7, fFloatValue3);
                f = 2.0f;
                double d3 = fA;
                f3 = fA;
                fCos = (float) (Math.cos(radians) * d3);
                fSin = (float) (d3 * Math.sin(radians));
                path.moveTo(fCos, fSin);
                d = radians + ((double) ((f5 * f7) / 2.0f));
                f2 = f6;
            } else {
                f = 2.0f;
                double d4 = fFloatValue2;
                float fCos2 = (float) (Math.cos(radians) * d4);
                float fSin2 = (float) (d4 * Math.sin(radians));
                path.moveTo(fCos2, fSin2);
                f2 = f6;
                d = radians + ((double) f2);
                fCos = fCos2;
                fSin = fSin2;
                f3 = 0.0f;
            }
            double dCeil = Math.ceil(d2) * 2.0d;
            double d5 = d;
            int i3 = 0;
            boolean z3 = false;
            while (true) {
                double d6 = i3;
                if (d6 >= dCeil) {
                    break;
                }
                float f8 = z3 ? fFloatValue2 : fFloatValue3;
                float f9 = (f3 == 0.0f || d6 != dCeil - 2.0d) ? f2 : (f5 * f7) / f;
                if (f3 != 0.0f && d6 == dCeil - 1.0d) {
                    f8 = f3;
                }
                double d7 = f8;
                float fCos3 = (float) (Math.cos(d5) * d7);
                float fSin3 = (float) (Math.sin(d5) * d7);
                if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                    path.lineTo(fCos3, fSin3);
                    f4 = fCos3;
                    i2 = i3;
                } else {
                    i2 = i3;
                    double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                    float fCos4 = (float) Math.cos(dAtan2);
                    float fSin4 = (float) Math.sin(dAtan2);
                    Path path2 = path;
                    float f10 = fCos;
                    double dAtan3 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                    float fCos5 = (float) Math.cos(dAtan3);
                    float fSin5 = (float) Math.sin(dAtan3);
                    float f11 = z3 ? fFloatValue4 : fFloatValue5;
                    float f12 = z3 ? fFloatValue5 : fFloatValue4;
                    float f13 = (z3 ? fFloatValue3 : fFloatValue2) * f11 * 0.47829f;
                    float f14 = fCos4 * f13;
                    float f15 = f13 * fSin4;
                    float f16 = (z3 ? fFloatValue2 : fFloatValue3) * f12 * 0.47829f;
                    float f17 = fCos5 * f16;
                    float f18 = f16 * fSin5;
                    if (f7 != 0.0f) {
                        if (i2 == 0) {
                            f14 *= f7;
                            f15 *= f7;
                        } else if (d6 == dCeil - 1.0d) {
                            f17 *= f7;
                            f18 *= f7;
                        }
                    }
                    f4 = fCos3;
                    path = path2;
                    path.cubicTo(f10 - f14, fSin - f15, f17 + fCos3, fSin3 + f18, f4, fSin3);
                }
                d5 += (double) f9;
                z3 = !z3;
                i3 = i2 + 1;
                fCos = f4;
                fSin = fSin3;
                f7 = f7;
                f5 = f5;
            }
            PointF pointF = (PointF) baseKeyframeAnimation.f();
            path.offset(pointF.x, pointF.y);
            path.close();
        } else if (iOrdinal == 1) {
            int iFloor = (int) Math.floor(((Float) floatKeyframeAnimation4.f()).floatValue());
            double radians2 = Math.toRadians((floatKeyframeAnimation3 != null ? ((Float) floatKeyframeAnimation3.f()).floatValue() : 0.0d) - 90.0d);
            double d8 = iFloor;
            float fFloatValue6 = ((Float) floatKeyframeAnimation2.f()).floatValue() / 100.0f;
            float fFloatValue7 = ((Float) floatKeyframeAnimation.f()).floatValue();
            double d9 = fFloatValue7;
            float fCos6 = (float) (Math.cos(radians2) * d9);
            float fSin6 = (float) (Math.sin(radians2) * d9);
            path.moveTo(fCos6, fSin6);
            float f19 = fSin6;
            double d10 = (float) (6.283185307179586d / d8);
            double dCeil2 = Math.ceil(d8);
            double d11 = radians2 + d10;
            int i4 = 0;
            while (i4 < dCeil2) {
                float fCos7 = (float) (Math.cos(d11) * d9);
                float fSin7 = (float) (Math.sin(d11) * d9);
                if (fFloatValue6 != 0.0f) {
                    double dAtan4 = (float) (Math.atan2(f19, fCos6) - 1.5707963267948966d);
                    float fCos8 = (float) Math.cos(dAtan4);
                    float fSin8 = (float) Math.sin(dAtan4);
                    Path path3 = path;
                    double dAtan5 = (float) (Math.atan2(fSin7, fCos7) - 1.5707963267948966d);
                    float f20 = fFloatValue7 * fFloatValue6 * 0.25f;
                    float f21 = fCos8 * f20;
                    float f22 = fSin8 * f20;
                    float fCos9 = ((float) Math.cos(dAtan5)) * f20;
                    float fSin9 = fSin7 + (f20 * ((float) Math.sin(dAtan5)));
                    path = path3;
                    path.cubicTo(fCos6 - f21, f19 - f22, fCos7 + fCos9, fSin9, fCos7, fSin7);
                } else {
                    path.lineTo(fCos7, fSin7);
                }
                d11 += d10;
                i4++;
                fCos6 = fCos7;
                f19 = fSin7;
                baseKeyframeAnimation = baseKeyframeAnimation;
                d9 = d9;
            }
            PointF pointF2 = (PointF) baseKeyframeAnimation.f();
            path.offset(pointF2.x, pointF2.y);
            path.close();
        }
        path.close();
        this.f9617n.a(path);
        this.o = true;
        return path;
    }
}
