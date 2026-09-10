package com.bytedance.adsdk.Lxb.LD.ZU;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public enum ZU implements JXs {
    LEFT_PAREN("("),
    RIGHT_PAREN(")"),
    LEFT_BRACKET("["),
    RIGHT_BRACKET("]"),
    COMMA(",");

    private static final Map<String, ZU> lc;
    private final String ebl;

    static {
        HashMap map = new HashMap(128);
        lc = map;
        for (ZU zu : map.values()) {
            lc.put(zu.Lxb(), zu);
        }
    }

    ZU(String str) {
        this.ebl = str;
    }

    public static boolean Lxb(JXs jXs) {
        return jXs instanceof ZU;
    }

    public String Lxb() {
        return this.ebl;
    }
}
