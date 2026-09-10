package com.airbnb.lottie.value;

import com.airbnb.lottie.SimpleColorFilter;

/* JADX INFO: loaded from: classes.dex */
public class LottieValueCallback<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LottieFrameInfo f9963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SimpleColorFilter f9964b;

    public LottieValueCallback() {
        this.f9963a = new LottieFrameInfo();
        this.f9964b = null;
    }

    public Object a(LottieFrameInfo lottieFrameInfo) {
        return this.f9964b;
    }

    public final Object b(float f, float f2, Object obj, Object obj2, float f3, float f4, float f5) {
        LottieFrameInfo lottieFrameInfo = this.f9963a;
        lottieFrameInfo.f9959a = f;
        lottieFrameInfo.f9960b = f2;
        lottieFrameInfo.f9961c = obj;
        lottieFrameInfo.d = obj2;
        lottieFrameInfo.f9962e = f3;
        lottieFrameInfo.f = f4;
        lottieFrameInfo.g = f5;
        return a(lottieFrameInfo);
    }

    public LottieValueCallback(SimpleColorFilter simpleColorFilter) {
        this.f9963a = new LottieFrameInfo();
        this.f9964b = simpleColorFilter;
    }
}
