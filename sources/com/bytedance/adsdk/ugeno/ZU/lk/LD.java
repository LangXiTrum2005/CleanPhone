package com.bytedance.adsdk.ugeno.ZU.lk;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class LD extends Lxb implements com.bytedance.adsdk.ugeno.ZU.Lxb.ZU {
    private com.bytedance.adsdk.ugeno.ZU.Lxb.lk QAg;

    public LD(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.ZU.lk.Lxb
    public boolean Lxb(Object... objArr) {
        com.bytedance.adsdk.ugeno.ZU.Lxb.Lxb lxbBcA = this.LD.BcA();
        if (lxbBcA == null) {
            return false;
        }
        com.bytedance.adsdk.ugeno.ZU.Lxb.lk lkVarLxb = lxbBcA.Lxb(this.lc);
        this.QAg = lkVarLxb;
        if (lkVarLxb != null) {
            lkVarLxb.Lxb(this);
            return false;
        }
        lxbBcA.Lxb(this.lc, new com.bytedance.adsdk.ugeno.ZU.Lxb.LD());
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.ZU.Lxb.ZU
    public void Lxb(String str) {
        this.Lxb.Lxb(this.LD, this.lc, this.lk.LD());
    }
}
