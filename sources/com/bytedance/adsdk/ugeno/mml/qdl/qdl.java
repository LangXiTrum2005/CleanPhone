package com.bytedance.adsdk.ugeno.mml.qdl;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class qdl {
    private volatile Map<String, lnr> qdl = new HashMap();

    public lnr qdl(String str) {
        if (this.qdl.containsKey(str) && this.qdl.get(str) != null) {
            return this.qdl.get(str);
        }
        ud udVar = new ud();
        this.qdl.put(str, udVar);
        return udVar;
    }

    public void qdl(String str, lnr lnrVar) {
        if (!this.qdl.containsKey(str) || this.qdl.get(str) == null) {
            this.qdl.put(str, lnrVar);
        }
    }
}
