package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes.dex */
public enum VVE {
    NO_WRAP(0, "nowrap"),
    WRAP(1, "wrap"),
    WRAP_REVERSE(2, "wrap_reverse");

    private final String JXs;
    private final int ZU;

    VVE(int i, String str) {
        this.ZU = i;
        this.JXs = str;
    }

    public int Lxb() {
        return this.ZU;
    }

    public static VVE Lxb(int i) {
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

    public static VVE Lxb(String str) {
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
