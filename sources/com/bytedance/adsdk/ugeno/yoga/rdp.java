package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes.dex */
public enum rdp {
    NO_WRAP(0),
    WRAP(1),
    WRAP_REVERSE(2);

    private final int mml;

    rdp(int i2) {
        this.mml = i2;
    }

    public int qdl() {
        return this.mml;
    }

    public static rdp qdl(int i2) {
        if (i2 == 0) {
            return NO_WRAP;
        }
        if (i2 == 1) {
            return WRAP;
        }
        if (i2 == 2) {
            return WRAP_REVERSE;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i2)));
    }

    public static rdp qdl(String str) {
        str.getClass();
        switch (str) {
            case "nowrap":
                return NO_WRAP;
            case "wrap":
                return WRAP;
            case "wrap_reverse":
                return WRAP_REVERSE;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(str));
        }
    }
}
