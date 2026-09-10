package com.bytedance.adsdk.ud;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class aaj {
    private final Map<String, String> qdl;
    private boolean ud;

    public String qdl(String str) {
        return str;
    }

    public final String ud(String str, String str2) {
        if (this.ud && this.qdl.containsKey(str2)) {
            return this.qdl.get(str2);
        }
        String strQdl = qdl(str, str2);
        if (this.ud) {
            this.qdl.put(str2, strQdl);
        }
        return strQdl;
    }

    public String qdl(String str, String str2) {
        return qdl(str2);
    }
}
