package com.bytedance.adsdk.ri.lr.ka;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public enum ik implements fi {
    QUESTION("?", 0),
    COLON(":", 0),
    DOUBLE_AMP("&&", 1),
    DOUBLE_BAR("||", 1),
    EQ("==", 2),
    GT(">", 2),
    LT("<", 2),
    LT_EQ("<=", 2),
    GT_EQ(">=", 2),
    NOT_EQ("!=", 2),
    PLUS("+", 3),
    MINUS("-", 3),
    MULTI("*", 4),
    DIVISION("/", 4),
    MOD("%", 4);

    private final String nr;
    private final int tan;
    private static final Map<String, ik> slm = new HashMap(128);
    private static final Set<ik> bu = new HashSet();

    static {
        for (ik ikVar : values()) {
            slm.put(ikVar.ri(), ikVar);
            bu.add(ikVar);
        }
    }

    ik(String str, int i) {
        this.nr = str;
        this.tan = i;
    }

    public static ik ri(String str) {
        return slm.get(str);
    }

    public int lr() {
        return this.tan;
    }

    public static boolean ri(fi fiVar) {
        return fiVar instanceof ik;
    }

    public String ri() {
        return this.nr;
    }
}
