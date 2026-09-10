package com.bytedance.adsdk.ud.qdl.ud;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class mzz extends wd<com.bytedance.adsdk.ud.lnr.ud.mml> {
    private final com.bytedance.adsdk.ud.lnr.ud.mml mml;

    public mzz(List<com.bytedance.adsdk.ud.wd.qdl<com.bytedance.adsdk.ud.lnr.ud.mml>> list) {
        super(list);
        com.bytedance.adsdk.ud.lnr.ud.mml mmlVar = list.get(0).qdl;
        int iLnr = mmlVar != null ? mmlVar.lnr() : 0;
        this.mml = new com.bytedance.adsdk.ud.lnr.ud.mml(new float[iLnr], new int[iLnr]);
    }

    @Override // com.bytedance.adsdk.ud.qdl.ud.qdl
    /* JADX INFO: renamed from: ud, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ud.lnr.ud.mml qdl(com.bytedance.adsdk.ud.wd.qdl<com.bytedance.adsdk.ud.lnr.ud.mml> qdlVar, float f) {
        this.mml.qdl(qdlVar.qdl, qdlVar.ud, f);
        return this.mml;
    }
}
