package com.google.zxing.pdf417.decoder;

import com.google.zxing.pdf417.PDF417Common;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
final class PDF417CodewordDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[][] f21389a = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 2787, 8);

    static {
        int i2;
        for (int i3 = 0; i3 < 2787; i3++) {
            int i4 = PDF417Common.f21386a[i3];
            int i5 = i4 & 1;
            int i6 = 0;
            while (i6 < 8) {
                float f = 0.0f;
                while (true) {
                    i2 = i4 & 1;
                    if (i2 == i5) {
                        f += 1.0f;
                        i4 >>= 1;
                    }
                }
                f21389a[i3][7 - i6] = f / 17.0f;
                i6++;
                i5 = i2;
            }
        }
    }
}
