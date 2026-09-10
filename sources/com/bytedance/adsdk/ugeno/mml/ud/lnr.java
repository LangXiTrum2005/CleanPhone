package com.bytedance.adsdk.ugeno.mml.ud;

import com.bytedance.adsdk.ugeno.core.bjy;
import com.bytedance.adsdk.ugeno.mml.mo;

/* JADX INFO: loaded from: classes.dex */
public class lnr extends qdl {
    private bjy tvp;

    public lnr(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, String str, mo.qdl qdlVar) {
        super(lnrVar, str, qdlVar);
    }

    @Override // com.bytedance.adsdk.ugeno.mml.ud.qdl
    public void qdl() {
        bjy bjyVarBch = this.lnr.bch();
        this.tvp = bjyVarBch;
        if (bjyVarBch != null) {
            bjyVarBch.qdl(this.lnr, this.wd, this.ud);
        }
    }
}
