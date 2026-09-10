package com.bytedance.adsdk.Lxb.LD.ZU;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public enum Lxb implements JXs {
    TRUE,
    FALSE,
    NULL;

    private static final Map<String, Lxb> ZU = new HashMap(128);

    static {
        for (Lxb lxb : values()) {
            ZU.put(lxb.name().toLowerCase(), lxb);
        }
    }

    public static Lxb Lxb(String str) {
        return ZU.get(str.toLowerCase());
    }
}
