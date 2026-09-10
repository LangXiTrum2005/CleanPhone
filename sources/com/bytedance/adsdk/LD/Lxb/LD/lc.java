package com.bytedance.adsdk.LD.Lxb.LD;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class lc extends ebl<Integer> {
    public lc(List<com.bytedance.adsdk.LD.ebl.Lxb<Integer>> list) {
        super(list);
    }

    @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb
    /* JADX INFO: renamed from: LD, reason: merged with bridge method [inline-methods] */
    public Integer Lxb(com.bytedance.adsdk.LD.ebl.Lxb<Integer> lxb, float f) {
        return Integer.valueOf(lk(lxb, f));
    }

    public int QAg() {
        return lk(lk(), JXs());
    }

    public int lk(com.bytedance.adsdk.LD.ebl.Lxb<Integer> lxb, float f) {
        if (lxb.Lxb == null || lxb.LD == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.lk == null) {
            return com.bytedance.adsdk.LD.lc.JXs.Lxb(lxb.OY(), lxb.QAg(), f);
        }
        lxb.ebl.getClass();
        ZU();
        OY();
        throw null;
    }
}
