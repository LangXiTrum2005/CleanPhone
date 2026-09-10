package com.bytedance.adsdk.ugeno.ZU.LD;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ZU extends Lxb {
    public ZU(com.bytedance.adsdk.ugeno.LD.lk lkVar, String str, com.bytedance.adsdk.ugeno.ZU.LD.Lxb lxb) {
        super(lkVar, str, lxb);
    }

    @Override // com.bytedance.adsdk.ugeno.ZU.LD.Lxb
    public void Lxb() {
        Map<String, String> map = this.lc;
        if (map == null || map.size() <= 0) {
            return;
        }
        String str = this.lc.get("id");
        if (TextUtils.isEmpty(str)) {
            Lxb(this.lk);
            return;
        }
        com.bytedance.adsdk.ugeno.LD.lk lkVar = this.lk;
        com.bytedance.adsdk.ugeno.LD.lk lkVarLD = lkVar.LD(lkVar);
        if (lkVarLD == null) {
            return;
        }
        Lxb(lkVarLD.lk(str));
    }

    private void Lxb(com.bytedance.adsdk.ugeno.LD.lk lkVar) {
        if (lkVar == null) {
            return;
        }
        for (String str : this.lc.keySet()) {
            if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "id")) {
                lkVar.Lxb(str, this.lc.get(str));
            }
        }
        lkVar.id();
        lkVar.LD();
    }
}
