package com.airbnb.lottie.value;

import com.airbnb.lottie.utils.MiscUtils;

/* JADX INFO: loaded from: classes.dex */
public class LottieRelativeFloatValueCallback extends LottieValueCallback<Float> {
    @Override // com.airbnb.lottie.value.LottieValueCallback
    public final Object a(LottieFrameInfo lottieFrameInfo) {
        float fD = MiscUtils.d(((Float) lottieFrameInfo.f9961c).floatValue(), ((Float) lottieFrameInfo.d).floatValue(), lottieFrameInfo.f);
        Object obj = this.f9964b;
        if (obj != null) {
            return Float.valueOf(((Float) obj).floatValue() + fD);
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }
}
