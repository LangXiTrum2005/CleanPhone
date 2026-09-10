package com.google.android.material.carousel;

/* JADX INFO: loaded from: classes4.dex */
final class CarouselStrategyHelper {
    public static float a(int i2, float f, float f2) {
        return (Math.max(0, i2 - 1) * f2) + f;
    }

    public static float b(int i2, float f, float f2) {
        return i2 > 0 ? (f2 / 2.0f) + f : f;
    }

    public static int c(int[] iArr) {
        int i2 = Integer.MIN_VALUE;
        for (int i3 : iArr) {
            if (i3 > i2) {
                i2 = i3;
            }
        }
        return i2;
    }

    public static float d(float f, float f2, float f3, int i2) {
        return i2 > 0 ? (f3 / 2.0f) + f2 : f;
    }
}
