package com.airbnb.lottie.animation.content;

import android.graphics.PointF;
import android.support.v4.media.a;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.CubicCurveData;
import com.airbnb.lottie.model.content.RoundedCorners;
import com.airbnb.lottie.model.content.ShapeData;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RoundedCornersContent implements ShapeModifierContent, BaseKeyframeAnimation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LottieDrawable f9631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BaseKeyframeAnimation f9632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ShapeData f9633c;

    public RoundedCornersContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, RoundedCorners roundedCorners) {
        this.f9631a = lottieDrawable;
        roundedCorners.getClass();
        BaseKeyframeAnimation baseKeyframeAnimationG = roundedCorners.f9792a.g();
        this.f9632b = baseKeyframeAnimationG;
        baseLayer.g(baseKeyframeAnimationG);
        baseKeyframeAnimationG.a(this);
    }

    public static int d(int i2, int i3) {
        int i4 = i2 / i3;
        if ((i2 ^ i3) < 0 && i4 * i3 != i2) {
            i4--;
        }
        return i2 - (i4 * i3);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public final void a() {
        this.f9631a.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public final void b(List list, List list2) {
    }

    @Override // com.airbnb.lottie.animation.content.ShapeModifierContent
    public final ShapeData c(ShapeData shapeData) {
        int i2;
        ShapeData shapeData2 = shapeData;
        ArrayList arrayList = shapeData2.f9793a;
        if (arrayList.size() > 2) {
            float fFloatValue = ((Float) this.f9632b.f()).floatValue();
            if (fFloatValue != 0.0f) {
                ArrayList arrayList2 = shapeData2.f9793a;
                boolean z2 = shapeData2.f9795c;
                boolean z3 = true;
                int size = arrayList2.size() - 1;
                int i3 = 0;
                while (size >= 0) {
                    CubicCurveData cubicCurveData = (CubicCurveData) arrayList2.get(size);
                    CubicCurveData cubicCurveData2 = (CubicCurveData) arrayList2.get(d(size - 1, arrayList2.size()));
                    PointF pointF = (size != 0 || z2) ? cubicCurveData2.f9713c : shapeData2.f9794b;
                    i3 = (((size != 0 || z2) ? cubicCurveData2.f9712b : pointF).equals(pointF) && cubicCurveData.f9711a.equals(pointF) && !(!shapeData2.f9795c && size == 0 && size == arrayList2.size() - 1)) ? i3 + 2 : i3 + 1;
                    size--;
                }
                ShapeData shapeData3 = this.f9633c;
                if (shapeData3 == null || shapeData3.f9793a.size() != i3) {
                    ArrayList arrayList3 = new ArrayList(i3);
                    for (int i4 = 0; i4 < i3; i4++) {
                        arrayList3.add(new CubicCurveData());
                    }
                    this.f9633c = new ShapeData(new PointF(0.0f, 0.0f), false, arrayList3);
                }
                ShapeData shapeData4 = this.f9633c;
                shapeData4.f9795c = z2;
                PointF pointF2 = shapeData2.f9794b;
                shapeData4.a(pointF2.x, pointF2.y);
                ArrayList arrayList4 = shapeData4.f9793a;
                boolean z4 = shapeData2.f9795c;
                int i5 = 0;
                int i6 = 0;
                while (i5 < arrayList.size()) {
                    CubicCurveData cubicCurveData3 = (CubicCurveData) arrayList.get(i5);
                    CubicCurveData cubicCurveData4 = (CubicCurveData) arrayList.get(d(i5 - 1, arrayList.size()));
                    CubicCurveData cubicCurveData5 = (CubicCurveData) arrayList.get(d(i5 - 2, arrayList.size()));
                    PointF pointF3 = (i5 != 0 || z4) ? cubicCurveData4.f9713c : shapeData2.f9794b;
                    PointF pointF4 = (i5 != 0 || z4) ? cubicCurveData4.f9712b : pointF3;
                    boolean z5 = z3;
                    PointF pointF5 = cubicCurveData3.f9711a;
                    PointF pointF6 = cubicCurveData5.f9713c;
                    boolean z6 = (!shapeData2.f9795c && i5 == 0 && i5 == arrayList.size() + (-1)) ? z5 : false;
                    boolean zEquals = pointF4.equals(pointF3);
                    PointF pointF7 = cubicCurveData3.f9713c;
                    if (zEquals && pointF5.equals(pointF3) && !z6) {
                        float f = pointF3.x;
                        float f2 = f - pointF6.x;
                        float f3 = pointF3.y;
                        float f4 = f3 - pointF6.y;
                        float f5 = pointF7.x - f;
                        float f6 = pointF7.y - f3;
                        i2 = i5;
                        float fHypot = (float) Math.hypot(f2, f4);
                        float fHypot2 = (float) Math.hypot(f5, f6);
                        float fMin = Math.min(fFloatValue / fHypot, 0.5f);
                        float fMin2 = Math.min(fFloatValue / fHypot2, 0.5f);
                        float f7 = pointF3.x;
                        float fA = a.a(pointF6.x, f7, fMin, f7);
                        float f8 = pointF3.y;
                        float fA2 = a.a(pointF6.y, f8, fMin, f8);
                        float fA3 = a.a(pointF7.x, f7, fMin2, f7);
                        float fA4 = a.a(pointF7.y, f8, fMin2, f8);
                        float f9 = fA - ((fA - f7) * 0.5519f);
                        float f10 = fA2 - ((fA2 - f8) * 0.5519f);
                        float f11 = fA3 - ((fA3 - f7) * 0.5519f);
                        float f12 = fA4 - ((fA4 - f8) * 0.5519f);
                        CubicCurveData cubicCurveData6 = (CubicCurveData) arrayList4.get(d(i6 - 1, arrayList4.size()));
                        CubicCurveData cubicCurveData7 = (CubicCurveData) arrayList4.get(i6);
                        cubicCurveData6.f9712b.set(fA, fA2);
                        cubicCurveData6.f9713c.set(fA, fA2);
                        if (i2 == 0) {
                            shapeData4.a(fA, fA2);
                        }
                        cubicCurveData7.f9711a.set(f9, f10);
                        CubicCurveData cubicCurveData8 = (CubicCurveData) arrayList4.get(i6 + 1);
                        cubicCurveData7.f9712b.set(f11, f12);
                        cubicCurveData7.f9713c.set(fA3, fA4);
                        cubicCurveData8.f9711a.set(fA3, fA4);
                        i6 += 2;
                    } else {
                        i2 = i5;
                        CubicCurveData cubicCurveData9 = (CubicCurveData) arrayList4.get(d(i6 - 1, arrayList4.size()));
                        CubicCurveData cubicCurveData10 = (CubicCurveData) arrayList4.get(i6);
                        PointF pointF8 = cubicCurveData4.f9713c;
                        cubicCurveData9.f9712b.set(pointF8.x, pointF8.y);
                        PointF pointF9 = cubicCurveData4.f9713c;
                        cubicCurveData9.f9713c.set(pointF9.x, pointF9.y);
                        cubicCurveData10.f9711a.set(pointF7.x, pointF7.y);
                        i6++;
                    }
                    i5 = i2 + 1;
                    shapeData2 = shapeData;
                    z4 = z4;
                    z3 = z5;
                    arrayList = arrayList;
                }
                return shapeData4;
            }
        }
        return shapeData2;
    }
}
