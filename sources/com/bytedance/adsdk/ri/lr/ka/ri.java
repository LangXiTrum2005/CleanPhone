package com.bytedance.adsdk.ri.lr.ka;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public enum ri implements fi {
    TRUE,
    FALSE,
    NULL;

    private static final Map<String, ri> ka = new HashMap(128);

    static {
        for (ri riVar : values()) {
            ka.put(riVar.name().toLowerCase(), riVar);
        }
    }

    public static ri ri(String str) {
        return ka.get(str.toLowerCase());
    }
}
