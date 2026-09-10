package com.google.android.material.carousel;

/* JADX INFO: loaded from: classes4.dex */
public abstract class CarouselStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f19186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f19187b;

    public static int[] a(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr2[i2] = iArr[i2] * 2;
        }
        return iArr2;
    }

    public static float b(float f, float f2, float f3) {
        return 1.0f - ((f - f3) / (f2 - f3));
    }
}
