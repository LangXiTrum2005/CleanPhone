package com.bytedance.adsdk.LD.lc;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes.dex */
public class LD {
    private static float LD(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    private static float Lxb(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static int Lxb(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float f3 = ((i2 >> 24) & 255) / 255.0f;
        float fLD = LD(((i >> 16) & 255) / 255.0f);
        float fLD2 = LD(((i >> 8) & 255) / 255.0f);
        float fLD3 = LD((i & 255) / 255.0f);
        float fLD4 = LD(((i2 >> 16) & 255) / 255.0f);
        float fLD5 = LD(((i2 >> 8) & 255) / 255.0f);
        float fLD6 = LD((i2 & 255) / 255.0f);
        float fW = AbstractC5044xl.w(f3, f2, f, f2);
        float fW2 = AbstractC5044xl.w(fLD4, fLD, f, fLD);
        float fW3 = AbstractC5044xl.w(fLD5, fLD2, f, fLD2);
        float fW4 = AbstractC5044xl.w(fLD6, fLD3, f, fLD3);
        float fLxb = Lxb(fW2) * 255.0f;
        float fLxb2 = Lxb(fW3) * 255.0f;
        return Math.round(Lxb(fW4) * 255.0f) | (Math.round(fLxb) << 16) | (Math.round(fW * 255.0f) << 24) | (Math.round(fLxb2) << 8);
    }
}
