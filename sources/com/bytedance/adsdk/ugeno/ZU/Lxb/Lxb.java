package com.bytedance.adsdk.ugeno.ZU.Lxb;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Lxb {
    private volatile Map<String, lk> Lxb = new HashMap();

    public lk Lxb(String str) {
        if (this.Lxb.containsKey(str) && this.Lxb.get(str) != null) {
            return this.Lxb.get(str);
        }
        LD ld = new LD();
        this.Lxb.put(str, ld);
        return ld;
    }

    public void Lxb(String str, lk lkVar) {
        if (!this.Lxb.containsKey(str) || this.Lxb.get(str) == null) {
            this.Lxb.put(str, lkVar);
        }
    }
}
