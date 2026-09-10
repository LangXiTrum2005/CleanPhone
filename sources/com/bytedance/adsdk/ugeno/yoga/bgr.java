package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes2.dex */
public enum bgr {
    NO_WRAP(0),
    WRAP(1),
    WRAP_REVERSE(2);

    private final int ka;

    bgr(int i) {
        this.ka = i;
    }

    public int ri() {
        return this.ka;
    }

    public static bgr ri(int i) {
        if (i == 0) {
            return NO_WRAP;
        }
        if (i == 1) {
            return WRAP;
        }
        if (i == 2) {
            return WRAP_REVERSE;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i)));
    }

    public static bgr ri(String str) {
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
