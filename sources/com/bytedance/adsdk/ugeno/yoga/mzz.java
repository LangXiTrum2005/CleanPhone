package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes.dex */
public enum mzz {
    COLUMN(0),
    COLUMN_REVERSE(1),
    ROW(2),
    ROW_REVERSE(3);

    private final int mzz;

    mzz(int i2) {
        this.mzz = i2;
    }

    public int qdl() {
        return this.mzz;
    }

    public static mzz qdl(int i2) {
        if (i2 == 0) {
            return COLUMN;
        }
        if (i2 == 1) {
            return COLUMN_REVERSE;
        }
        if (i2 == 2) {
            return ROW;
        }
        if (i2 == 3) {
            return ROW_REVERSE;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i2)));
    }

    public static mzz qdl(String str) {
        str.getClass();
        switch (str) {
            case "column_reverse":
                return COLUMN_REVERSE;
            case "column":
                return COLUMN;
            case "row_reverse":
                return ROW_REVERSE;
            case "row":
                return ROW;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(str));
        }
    }
}
