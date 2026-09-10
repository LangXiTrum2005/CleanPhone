package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes.dex */
public enum jpc {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);

    private final int mml;

    jpc(int i2) {
        this.mml = i2;
    }

    public static jpc qdl(int i2) {
        if (i2 == 0) {
            return UNDEFINED;
        }
        if (i2 == 1) {
            return EXACTLY;
        }
        if (i2 == 2) {
            return AT_MOST;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i2)));
    }
}
