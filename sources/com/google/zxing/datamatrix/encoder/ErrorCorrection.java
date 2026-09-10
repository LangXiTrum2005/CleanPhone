package com.google.zxing.datamatrix.encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class ErrorCorrection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f21360a = new int[256];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f21361b = new int[255];

    static {
        int i2 = 1;
        for (int i3 = 0; i3 < 255; i3++) {
            f21361b[i3] = i2;
            f21360a[i2] = i3;
            i2 <<= 1;
            if (i2 >= 256) {
                i2 ^= 301;
            }
        }
    }
}
