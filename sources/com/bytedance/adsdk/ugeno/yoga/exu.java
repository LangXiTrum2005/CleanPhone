package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes.dex */
public enum exu {
    STATIC(0),
    RELATIVE(1),
    ABSOLUTE(2);

    private final int mml;

    exu(int i2) {
        this.mml = i2;
    }

    public int qdl() {
        return this.mml;
    }

    public static exu qdl(int i2) {
        if (i2 == 0) {
            return STATIC;
        }
        if (i2 == 1) {
            return RELATIVE;
        }
        if (i2 == 2) {
            return ABSOLUTE;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i2)));
    }

    public static exu qdl(String str) {
        str.getClass();
        switch (str) {
            case "static":
                return STATIC;
            case "relative":
                return RELATIVE;
            case "absolute":
                return ABSOLUTE;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(str));
        }
    }
}
