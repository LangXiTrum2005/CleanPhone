package com.bytedance.adsdk.ud;

/* JADX INFO: loaded from: classes.dex */
class ud {
    static final int[] qdl = new int[0];
    static final long[] ud = new long[0];
    static final Object[] lnr = new Object[0];

    public static int qdl(int[] iArr, int i2, int i3) {
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }
}
