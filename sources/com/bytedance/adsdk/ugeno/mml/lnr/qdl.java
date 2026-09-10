package com.bytedance.adsdk.ugeno.mml.lnr;

import com.bytedance.adsdk.ugeno.mml.mo;

/* JADX INFO: loaded from: classes.dex */
public class qdl extends com.bytedance.adsdk.ugeno.mml.ud.qdl {
    public qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, String str, mo.qdl qdlVar) {
        super(lnrVar, str, qdlVar);
    }

    @Override // com.bytedance.adsdk.ugeno.mml.ud.qdl
    public void qdl() {
        com.bytedance.adsdk.ugeno.ud.lnr lnrVarUd;
        com.bytedance.adsdk.ugeno.ud.lnr lnrVar = this.lnr;
        if (lnrVar == null || (lnrVarUd = lnrVar.ud(lnrVar)) == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.ud.lnr lnrVarMo = lnrVarUd.mo("SwiperView");
        if (lnrVarMo instanceof com.bytedance.adsdk.ugeno.ud) {
            ((com.bytedance.adsdk.ugeno.ud) lnrVarMo).lnr();
        }
    }
}
