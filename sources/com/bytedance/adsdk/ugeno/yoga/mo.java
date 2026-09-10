package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes.dex */
public enum mo {
    FLEX_START(0),
    CENTER(1),
    FLEX_END(2),
    SPACE_BETWEEN(3),
    SPACE_AROUND(4),
    SPACE_EVENLY(5);

    private final int wd;

    mo(int i2) {
        this.wd = i2;
    }

    public int qdl() {
        return this.wd;
    }

    public static mo qdl(int i2) {
        if (i2 == 0) {
            return FLEX_START;
        }
        if (i2 == 1) {
            return CENTER;
        }
        if (i2 == 2) {
            return FLEX_END;
        }
        if (i2 == 3) {
            return SPACE_BETWEEN;
        }
        if (i2 == 4) {
            return SPACE_AROUND;
        }
        if (i2 == 5) {
            return SPACE_EVENLY;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i2)));
    }

    public static mo qdl(String str) {
        str.getClass();
        switch (str) {
            case "center":
                return CENTER;
            case "space_around":
                return SPACE_AROUND;
            case "space_evenly":
                return SPACE_EVENLY;
            case "flex_start":
                return FLEX_START;
            case "space_between":
                return SPACE_BETWEEN;
            case "flex_end":
                return FLEX_END;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(str));
        }
    }
}
