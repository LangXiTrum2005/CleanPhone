package com.bytedance.adsdk.ri.lr.ka;

import com.ironsource.X3;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public enum ka implements fi {
    LEFT_PAREN("("),
    RIGHT_PAREN(")"),
    LEFT_BRACKET(X3.j.d),
    RIGHT_BRACKET(X3.j.e),
    COMMA(",");

    private static final Map<String, ka> di;
    private final String xha;

    static {
        HashMap map = new HashMap(128);
        di = map;
        for (ka kaVar : map.values()) {
            di.put(kaVar.ri(), kaVar);
        }
    }

    ka(String str) {
        this.xha = str;
    }

    public static boolean ri(fi fiVar) {
        return fiVar instanceof ka;
    }

    public String ri() {
        return this.xha;
    }
}
