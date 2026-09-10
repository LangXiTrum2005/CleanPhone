package com.bytedance.adsdk.LD.Lxb.LD;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class JXs extends ebl<com.bytedance.adsdk.LD.lk.LD.ZU> {
    private final com.bytedance.adsdk.LD.lk.LD.ZU ZU;

    public JXs(List<com.bytedance.adsdk.LD.ebl.Lxb<com.bytedance.adsdk.LD.lk.LD.ZU>> list) {
        super(list);
        com.bytedance.adsdk.LD.lk.LD.ZU zu = list.get(0).Lxb;
        int iLk = zu != null ? zu.lk() : 0;
        this.ZU = new com.bytedance.adsdk.LD.lk.LD.ZU(new float[iLk], new int[iLk]);
    }

    @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb
    /* JADX INFO: renamed from: LD, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.LD.lk.LD.ZU Lxb(com.bytedance.adsdk.LD.ebl.Lxb<com.bytedance.adsdk.LD.lk.LD.ZU> lxb, float f) {
        this.ZU.Lxb(lxb.Lxb, lxb.LD, f);
        return this.ZU;
    }
}
