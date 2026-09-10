package com.bytedance.adsdk.Lxb.LD.ZU;

import androidx.webkit.ProxyConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public enum lk implements JXs {
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
    MULTI(ProxyConfig.MATCH_ALL_SCHEMES, 4),
    DIVISION("/", 4),
    MOD("%", 4);

    private final String brP;
    private final int tD;
    private static final Map<String, lk> VVE = new HashMap(128);
    private static final Set<lk> kqm = new HashSet();

    static {
        for (lk lkVar : values()) {
            VVE.put(lkVar.Lxb(), lkVar);
            kqm.add(lkVar);
        }
    }

    lk(String str, int i) {
        this.brP = str;
        this.tD = i;
    }

    public static lk Lxb(String str) {
        return VVE.get(str);
    }

    public int LD() {
        return this.tD;
    }

    public static boolean Lxb(JXs jXs) {
        return jXs instanceof lk;
    }

    public String Lxb() {
        return this.brP;
    }
}
