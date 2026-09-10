package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class SplitDimensionPathKeyframeAnimation extends BaseKeyframeAnimation<PointF, PointF> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PointF f9667i;
    public final PointF j;
    public final FloatKeyframeAnimation k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final FloatKeyframeAnimation f9668l;
    public LottieValueCallback m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LottieValueCallback f9669n;

    public SplitDimensionPathKeyframeAnimation(FloatKeyframeAnimation floatKeyframeAnimation, FloatKeyframeAnimation floatKeyframeAnimation2) {
        super(Collections.EMPTY_LIST);
        this.f9667i = new PointF();
        this.j = new PointF();
        this.k = floatKeyframeAnimation;
        this.f9668l = floatKeyframeAnimation2;
        j(this.d);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public final Object f() {
        return l(0.0f);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public final /* bridge */ /* synthetic */ Object g(Keyframe keyframe, float f) {
        return l(f);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public final void j(float f) {
        FloatKeyframeAnimation floatKeyframeAnimation = this.k;
        floatKeyframeAnimation.j(f);
        FloatKeyframeAnimation floatKeyframeAnimation2 = this.f9668l;
        floatKeyframeAnimation2.j(f);
        this.f9667i.set(((Float) floatKeyframeAnimation.f()).floatValue(), ((Float) floatKeyframeAnimation2.f()).floatValue());
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f9643a;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((BaseKeyframeAnimation.AnimationListener) arrayList.get(i2)).a();
            i2++;
        }
    }

    public final PointF l(float f) {
        float f2;
        Float f3;
        FloatKeyframeAnimation floatKeyframeAnimation;
        Keyframe keyframeB;
        FloatKeyframeAnimation floatKeyframeAnimation2;
        Keyframe keyframeB2;
        Float f4 = null;
        if (this.m == null || (keyframeB2 = (floatKeyframeAnimation2 = this.k).b()) == null) {
            f2 = f;
            f3 = null;
        } else {
            float fD = floatKeyframeAnimation2.d();
            Float f5 = keyframeB2.f9954h;
            LottieValueCallback lottieValueCallback = this.m;
            float f6 = keyframeB2.g;
            f2 = f;
            f3 = (Float) lottieValueCallback.b(f6, f5 == null ? f6 : f5.floatValue(), (Float) keyframeB2.f9951b, (Float) keyframeB2.f9952c, f, f, fD);
        }
        if (this.f9669n != null && (keyframeB = (floatKeyframeAnimation = this.f9668l).b()) != null) {
            float fD2 = floatKeyframeAnimation.d();
            Float f7 = keyframeB.f9954h;
            LottieValueCallback lottieValueCallback2 = this.f9669n;
            float f8 = keyframeB.g;
            f4 = (Float) lottieValueCallback2.b(f8, f7 == null ? f8 : f7.floatValue(), (Float) keyframeB.f9951b, (Float) keyframeB.f9952c, f2, f2, fD2);
        }
        PointF pointF = this.f9667i;
        PointF pointF2 = this.j;
        if (f3 == null) {
            pointF2.set(pointF.x, 0.0f);
        } else {
            pointF2.set(f3.floatValue(), 0.0f);
        }
        if (f4 == null) {
            pointF2.set(pointF2.x, pointF.y);
            return pointF2;
        }
        pointF2.set(pointF2.x, f4.floatValue());
        return pointF2;
    }
}
