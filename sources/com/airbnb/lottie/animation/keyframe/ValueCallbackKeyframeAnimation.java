package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class ValueCallbackKeyframeAnimation<K, A> extends BaseKeyframeAnimation<K, A> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f9680i;

    public ValueCallbackKeyframeAnimation(LottieValueCallback lottieValueCallback, Object obj) {
        super(Collections.EMPTY_LIST);
        k(lottieValueCallback);
        this.f9680i = obj;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public final float c() {
        return 1.0f;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public final Object f() {
        LottieValueCallback lottieValueCallback = this.f9646e;
        float f = this.d;
        Object obj = this.f9680i;
        return lottieValueCallback.b(0.0f, 0.0f, obj, obj, f, f, f);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public final Object g(Keyframe keyframe, float f) {
        return f();
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public final void i() {
        if (this.f9646e != null) {
            super.i();
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public final void j(float f) {
        this.d = f;
    }
}
