package com.bytedance.adsdk.ud.qdl.ud;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ud extends wd<Integer> {
    public ud(List<com.bytedance.adsdk.ud.wd.qdl<Integer>> list) {
        super(list);
    }

    public int lnr(com.bytedance.adsdk.ud.wd.qdl<Integer> qdlVar, float f) {
        if (qdlVar.qdl == null || qdlVar.ud == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.lnr == null) {
            return com.bytedance.adsdk.ud.mo.ud.qdl(com.bytedance.adsdk.ud.mo.mzz.ud(f, 0.0f, 1.0f), qdlVar.qdl.intValue(), qdlVar.ud.intValue());
        }
        qdlVar.wd.getClass();
        mml();
        jpc();
        throw null;
    }

    public int tvp() {
        return lnr(lnr(), mzz());
    }

    @Override // com.bytedance.adsdk.ud.qdl.ud.qdl
    /* JADX INFO: renamed from: ud, reason: merged with bridge method [inline-methods] */
    public Integer qdl(com.bytedance.adsdk.ud.wd.qdl<Integer> qdlVar, float f) {
        return Integer.valueOf(lnr(qdlVar, f));
    }
}
