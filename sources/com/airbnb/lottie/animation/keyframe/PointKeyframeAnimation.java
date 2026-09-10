package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import android.support.v4.media.a;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class PointKeyframeAnimation extends KeyframeAnimation<PointF> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PointF f9664i;

    public PointKeyframeAnimation(List list) {
        super(list);
        this.f9664i = new PointF();
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public final Object g(Keyframe keyframe, float f) {
        return h(keyframe, f, f, f);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final PointF h(Keyframe keyframe, float f, float f2, float f3) {
        Object obj;
        Object obj2 = keyframe.f9951b;
        if (obj2 == null || (obj = keyframe.f9952c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) obj2;
        PointF pointF2 = (PointF) obj;
        LottieValueCallback lottieValueCallback = this.f9646e;
        if (lottieValueCallback != null) {
            PointF pointF3 = (PointF) lottieValueCallback.b(keyframe.g, keyframe.f9954h.floatValue(), pointF, pointF2, f, e(), this.d);
            if (pointF3 != null) {
                return pointF3;
            }
        }
        PointF pointF4 = this.f9664i;
        float f4 = pointF.x;
        float fA = a.a(pointF2.x, f4, f2, f4);
        float f5 = pointF.y;
        pointF4.set(fA, a.a(pointF2.y, f5, f3, f5));
        return pointF4;
    }
}
