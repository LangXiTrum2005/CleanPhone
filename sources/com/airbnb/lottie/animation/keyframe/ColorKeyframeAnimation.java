package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.utils.GammaEvaluator;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;

/* JADX INFO: loaded from: classes.dex */
public class ColorKeyframeAnimation extends KeyframeAnimation<Integer> {
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public final Object g(Keyframe keyframe, float f) {
        return Integer.valueOf(l(keyframe, f));
    }

    public final int l(Keyframe keyframe, float f) {
        float f2;
        if (keyframe.f9951b == null || keyframe.f9952c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        LottieValueCallback lottieValueCallback = this.f9646e;
        Object obj = keyframe.f9951b;
        if (lottieValueCallback != null) {
            Integer num = (Integer) keyframe.f9952c;
            float fE = e();
            float f3 = this.d;
            f2 = f;
            Integer num2 = (Integer) lottieValueCallback.b(keyframe.g, keyframe.f9954h.floatValue(), (Integer) obj, num, f2, fE, f3);
            if (num2 != null) {
                return num2.intValue();
            }
        } else {
            f2 = f;
        }
        return GammaEvaluator.c(MiscUtils.b(f2, 0.0f, 1.0f), ((Integer) obj).intValue(), ((Integer) keyframe.f9952c).intValue());
    }
}
