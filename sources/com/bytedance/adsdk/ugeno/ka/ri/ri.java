package com.bytedance.adsdk.ugeno.ka.ri;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private volatile Map<String, ik> ri = new HashMap();

    public ik ri(String str) {
        if (this.ri.containsKey(str) && this.ri.get(str) != null) {
            return this.ri.get(str);
        }
        lr lrVar = new lr();
        this.ri.put(str, lrVar);
        return lrVar;
    }

    public void ri(String str, ik ikVar) {
        if (!this.ri.containsKey(str) || this.ri.get(str) == null) {
            this.ri.put(str, ikVar);
        }
    }
}
