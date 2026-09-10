package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes.dex */
public class tvp {
    public static long qdl(float f, float f2) {
        return ((long) Float.floatToRawIntBits(f2)) | (((long) Float.floatToRawIntBits(f)) << 32);
    }

    public static long qdl(int i2, int i3) {
        return qdl(i2, i3);
    }
}
