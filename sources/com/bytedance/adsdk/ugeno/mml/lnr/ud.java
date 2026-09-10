package com.bytedance.adsdk.ugeno.mml.lnr;

import com.bytedance.adsdk.ugeno.mml.mo;

/* JADX INFO: loaded from: classes.dex */
public class ud extends com.bytedance.adsdk.ugeno.mml.ud.qdl {
    public ud(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, String str, mo.qdl qdlVar) {
        super(lnrVar, str, qdlVar);
    }

    @Override // com.bytedance.adsdk.ugeno.mml.ud.qdl
    public void qdl() {
        if (this.lnr == null) {
            return;
        }
        int iQdl = com.bytedance.adsdk.ugeno.wd.lnr.qdl(this.mo.get("position"), 0);
        com.bytedance.adsdk.ugeno.ud.lnr lnrVar = this.lnr;
        com.bytedance.adsdk.ugeno.ud.lnr lnrVarUd = lnrVar.ud(lnrVar);
        if (lnrVarUd == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.ud.lnr lnrVarMo = lnrVarUd.mo("SwiperView");
        if (lnrVarMo instanceof com.bytedance.adsdk.ugeno.ud) {
            ((com.bytedance.adsdk.ugeno.ud) lnrVarMo).qdl(iQdl);
        }
    }
}
