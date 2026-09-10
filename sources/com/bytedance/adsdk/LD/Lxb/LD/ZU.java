package com.bytedance.adsdk.LD.Lxb.LD;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ZU extends ebl<Float> {
    public ZU(List<com.bytedance.adsdk.LD.ebl.Lxb<Float>> list) {
        super(list);
    }

    @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb
    /* JADX INFO: renamed from: LD, reason: merged with bridge method [inline-methods] */
    public Float Lxb(com.bytedance.adsdk.LD.ebl.Lxb<Float> lxb, float f) {
        return Float.valueOf(lk(lxb, f));
    }

    public float QAg() {
        return lk(lk(), JXs());
    }

    public float lk(com.bytedance.adsdk.LD.ebl.Lxb<Float> lxb, float f) {
        if (lxb.Lxb == null || lxb.LD == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.lk == null) {
            return com.bytedance.adsdk.LD.lc.JXs.Lxb(lxb.lc(), lxb.ebl(), f);
        }
        lxb.ebl.getClass();
        ZU();
        OY();
        throw null;
    }
}
