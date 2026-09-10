package com.bytedance.adsdk.lr.di;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    private static float lr(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    private static float ri(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static int ri(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float fLr = lr(((i >> 16) & 255) / 255.0f);
        float fLr2 = lr(((i >> 8) & 255) / 255.0f);
        float fLr3 = lr((i & 255) / 255.0f);
        float fLr4 = lr(((i2 >> 16) & 255) / 255.0f);
        float f3 = f2 + (((((i2 >> 24) & 255) / 255.0f) - f2) * f);
        float fLr5 = fLr2 + ((lr(((i2 >> 8) & 255) / 255.0f) - fLr2) * f);
        float fLr6 = fLr3 + (f * (lr((i2 & 255) / 255.0f) - fLr3));
        return (Math.round(ri(fLr + ((fLr4 - fLr) * f)) * 255.0f) << 16) | (Math.round(f3 * 255.0f) << 24) | (Math.round(ri(fLr5) * 255.0f) << 8) | Math.round(ri(fLr6) * 255.0f);
    }
}
