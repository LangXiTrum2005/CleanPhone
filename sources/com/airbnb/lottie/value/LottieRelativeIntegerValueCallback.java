package com.airbnb.lottie.value;

import com.airbnb.lottie.utils.MiscUtils;

/* JADX INFO: loaded from: classes.dex */
public class LottieRelativeIntegerValueCallback extends LottieValueCallback<Integer> {
    @Override // com.airbnb.lottie.value.LottieValueCallback
    public final Object a(LottieFrameInfo lottieFrameInfo) {
        int iE = MiscUtils.e(lottieFrameInfo.f, ((Integer) lottieFrameInfo.f9961c).intValue(), ((Integer) lottieFrameInfo.d).intValue());
        Object obj = this.f9964b;
        if (obj != null) {
            return Integer.valueOf(((Integer) obj).intValue() + iE);
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }
}
