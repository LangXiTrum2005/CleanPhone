package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import com.airbnb.lottie.value.ScaleXY;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ScaleKeyframeAnimation extends KeyframeAnimation<ScaleXY> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ScaleXY f9665i;

    public ScaleKeyframeAnimation(List list) {
        super(list);
        this.f9665i = new ScaleXY();
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public final Object g(Keyframe keyframe, float f) {
        Object obj;
        float f2;
        Object obj2 = keyframe.f9951b;
        if (obj2 == null || (obj = keyframe.f9952c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        ScaleXY scaleXY = (ScaleXY) obj2;
        ScaleXY scaleXY2 = (ScaleXY) obj;
        LottieValueCallback lottieValueCallback = this.f9646e;
        if (lottieValueCallback != null) {
            f2 = f;
            ScaleXY scaleXY3 = (ScaleXY) lottieValueCallback.b(keyframe.g, keyframe.f9954h.floatValue(), scaleXY, scaleXY2, f2, e(), this.d);
            if (scaleXY3 != null) {
                return scaleXY3;
            }
        } else {
            f2 = f;
        }
        float fD = MiscUtils.d(scaleXY.f9965a, scaleXY2.f9965a, f2);
        float fD2 = MiscUtils.d(scaleXY.f9966b, scaleXY2.f9966b, f2);
        ScaleXY scaleXY4 = this.f9665i;
        scaleXY4.f9965a = fD;
        scaleXY4.f9966b = fD2;
        return scaleXY4;
    }
}
