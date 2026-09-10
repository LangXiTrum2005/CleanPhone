package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes2.dex */
public enum mj {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);

    private final int ka;

    mj(int i) {
        this.ka = i;
    }

    public static mj ri(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return EXACTLY;
        }
        if (i == 2) {
            return AT_MOST;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i)));
    }
}
