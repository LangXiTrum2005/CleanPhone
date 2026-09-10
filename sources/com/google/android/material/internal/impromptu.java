package com.google.android.material.internal;

/* JADX INFO: compiled from: FadeThroughUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class impromptu {
    public static void attabal(float f, float[] fArr) {
        if (f <= 0.5f) {
            fArr[0] = 1.0f - (f * 2.0f);
            fArr[1] = 0.0f;
        } else {
            fArr[0] = 0.0f;
            fArr[1] = (f * 2.0f) - 1.0f;
        }
    }
}
