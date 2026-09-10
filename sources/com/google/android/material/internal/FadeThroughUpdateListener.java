package com.google.android.material.internal;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes4.dex */
public class FadeThroughUpdateListener implements ValueAnimator.AnimatorUpdateListener {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Object[] objArr = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        if (fFloatValue <= 0.5f) {
            (b3 == true ? 1 : 0)[0] = 1.0f - (fFloatValue * 2.0f);
            (b2 == true ? 1 : 0)[1] = 0;
            throw null;
        }
        objArr[0] = 0;
        (b4 == true ? 1 : 0)[1] = (fFloatValue * 2.0f) - 1.0f;
        throw null;
    }
}
