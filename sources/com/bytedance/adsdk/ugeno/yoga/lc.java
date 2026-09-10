package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes.dex */
public enum lc {
    COLUMN(0, "column"),
    COLUMN_REVERSE(1, "column_reverse"),
    ROW(2, "row"),
    ROW_REVERSE(3, "row_reverse");

    private final int JXs;
    private final String lc;

    lc(int i, String str) {
        this.JXs = i;
        this.lc = str;
    }

    public int Lxb() {
        return this.JXs;
    }

    public static lc Lxb(int i) {
        if (i == 0) {
            return COLUMN;
        }
        if (i == 1) {
            return COLUMN_REVERSE;
        }
        if (i == 2) {
            return ROW;
        }
        if (i == 3) {
            return ROW_REVERSE;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i)));
    }

    public static lc Lxb(String str) {
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
