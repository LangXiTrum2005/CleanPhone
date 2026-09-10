package com.bytedance.adsdk.ugeno.ZU.LD;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class LD extends Lxb {
    private List<com.bytedance.adsdk.ugeno.ZU.Lxb.ZU> OY;

    public LD(com.bytedance.adsdk.ugeno.LD.lk lkVar, String str, com.bytedance.adsdk.ugeno.ZU.LD.Lxb lxb) {
        super(lkVar, str, lxb);
        this.OY = new CopyOnWriteArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.ZU.LD.Lxb
    public void Lxb() {
        com.bytedance.adsdk.ugeno.ZU.Lxb.lk lkVarLxb;
        Map<String, String> map = this.lc;
        if (map == null || map.size() <= 0) {
            return;
        }
        String str = this.lc.get("name");
        com.bytedance.adsdk.ugeno.ZU.Lxb.Lxb lxbBcA = this.lk.BcA();
        if (lxbBcA == null || (lkVarLxb = lxbBcA.Lxb(str)) == null) {
            return;
        }
        lkVarLxb.Lxb(str);
    }
}
