package com.bytedance.adsdk.lr;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ac {
    private boolean lr;
    private final Map<String, String> ri;

    public final String lr(String str, String str2) {
        if (this.lr && this.ri.containsKey(str2)) {
            return this.ri.get(str2);
        }
        String strRi = ri(str, str2);
        if (this.lr) {
            this.ri.put(str2, strRi);
        }
        return strRi;
    }

    public String ri(String str) {
        return str;
    }

    public String ri(String str, String str2) {
        return ri(str2);
    }
}
