package com.bytedance.adsdk.qdl.ud.mml;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public enum qdl implements mzz {
    TRUE,
    FALSE,
    NULL;

    private static final Map<String, qdl> mml = new HashMap(128);

    static {
        for (qdl qdlVar : values()) {
            mml.put(qdlVar.name().toLowerCase(), qdlVar);
        }
    }

    public static qdl qdl(String str) {
        return mml.get(str.toLowerCase());
    }
}
