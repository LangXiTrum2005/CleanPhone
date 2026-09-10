package com.bytedance.adsdk.LD.Lxb.LD;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class sLN extends ebl<com.bytedance.adsdk.LD.ebl.lk> {
    private final com.bytedance.adsdk.LD.ebl.lk ZU;

    public sLN(List<com.bytedance.adsdk.LD.ebl.Lxb<com.bytedance.adsdk.LD.ebl.lk>> list) {
        super(list);
        this.ZU = new com.bytedance.adsdk.LD.ebl.lk();
    }

    @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb
    /* JADX INFO: renamed from: LD, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.LD.ebl.lk Lxb(com.bytedance.adsdk.LD.ebl.Lxb<com.bytedance.adsdk.LD.ebl.lk> lxb, float f) {
        com.bytedance.adsdk.LD.ebl.lk lkVar;
        com.bytedance.adsdk.LD.ebl.lk lkVar2 = lxb.Lxb;
        if (lkVar2 == null || (lkVar = lxb.LD) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        com.bytedance.adsdk.LD.ebl.lk lkVar3 = lkVar2;
        com.bytedance.adsdk.LD.ebl.lk lkVar4 = lkVar;
        if (this.lk == null) {
            this.ZU.Lxb(com.bytedance.adsdk.LD.lc.JXs.Lxb(lkVar3.Lxb(), lkVar4.Lxb(), f), com.bytedance.adsdk.LD.lc.JXs.Lxb(lkVar3.LD(), lkVar4.LD(), f));
            return this.ZU;
        }
        lxb.ebl.getClass();
        ZU();
        OY();
        throw null;
    }
}
