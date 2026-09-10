package com.bytedance.adsdk.ud.mo;

import android.support.v4.media.a;

/* JADX INFO: loaded from: classes.dex */
public class ud {
    private static float qdl(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    private static float ud(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static int qdl(float f, int i2, int i3) {
        if (i2 == i3) {
            return i2;
        }
        float f2 = ((i2 >> 24) & 255) / 255.0f;
        float f3 = ((i3 >> 24) & 255) / 255.0f;
        float fUd = ud(((i2 >> 16) & 255) / 255.0f);
        float fUd2 = ud(((i2 >> 8) & 255) / 255.0f);
        float fUd3 = ud((i2 & 255) / 255.0f);
        float fUd4 = ud(((i3 >> 16) & 255) / 255.0f);
        float fUd5 = ud(((i3 >> 8) & 255) / 255.0f);
        float fUd6 = ud((i3 & 255) / 255.0f);
        float fA = a.a(f3, f2, f, f2);
        float fA2 = a.a(fUd4, fUd, f, fUd);
        float fA3 = a.a(fUd5, fUd2, f, fUd2);
        float fA4 = a.a(fUd6, fUd3, f, fUd3);
        float fQdl = qdl(fA2) * 255.0f;
        float fQdl2 = qdl(fA3) * 255.0f;
        return Math.round(qdl(fA4) * 255.0f) | (Math.round(fQdl) << 16) | (Math.round(fA * 255.0f) << 24) | (Math.round(fQdl2) << 8);
    }
}
