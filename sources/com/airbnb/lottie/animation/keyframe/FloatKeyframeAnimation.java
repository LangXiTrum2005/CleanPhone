package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;

/* JADX INFO: loaded from: classes.dex */
public class FloatKeyframeAnimation extends KeyframeAnimation<Float> {
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public final Object g(Keyframe keyframe, float f) {
        return Float.valueOf(m(keyframe, f));
    }

    public final float l() {
        return m(b(), d());
    }

    public final float m(Keyframe keyframe, float f) {
        float f2;
        if (keyframe.f9951b == null || keyframe.f9952c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        LottieValueCallback lottieValueCallback = this.f9646e;
        Object obj = keyframe.f9951b;
        if (lottieValueCallback != null) {
            Float f3 = (Float) keyframe.f9952c;
            float fE = e();
            float f4 = this.d;
            f2 = f;
            Float f5 = (Float) lottieValueCallback.b(keyframe.g, keyframe.f9954h.floatValue(), (Float) obj, f3, f2, fE, f4);
            if (f5 != null) {
                return f5.floatValue();
            }
        } else {
            f2 = f;
        }
        if (keyframe.f9955i == -3987645.8f) {
            keyframe.f9955i = ((Float) obj).floatValue();
        }
        float f6 = keyframe.f9955i;
        if (keyframe.j == -3987645.8f) {
            keyframe.j = ((Float) keyframe.f9952c).floatValue();
        }
        return MiscUtils.d(f6, keyframe.j, f2);
    }
}
