package com.bytedance.adsdk.ugeno.yoga;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: loaded from: classes.dex */
public enum ebl {
    FLEX_START(0, "flex_start"),
    CENTER(1, TtmlNode.CENTER),
    FLEX_END(2, "flex_end"),
    SPACE_BETWEEN(3, "space_between"),
    SPACE_AROUND(4, "space_around"),
    SPACE_EVENLY(5, "space_evenly");

    private final String OY;
    private final int ebl;

    ebl(int i, String str) {
        this.ebl = i;
        this.OY = str;
    }

    public int Lxb() {
        return this.ebl;
    }

    public static ebl Lxb(int i) {
        if (i == 0) {
            return FLEX_START;
        }
        if (i == 1) {
            return CENTER;
        }
        if (i == 2) {
            return FLEX_END;
        }
        if (i == 3) {
            return SPACE_BETWEEN;
        }
        if (i == 4) {
            return SPACE_AROUND;
        }
        if (i == 5) {
            return SPACE_EVENLY;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i)));
    }

    public static ebl Lxb(String str) {
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
