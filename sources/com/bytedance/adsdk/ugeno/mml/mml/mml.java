package com.bytedance.adsdk.ugeno.mml.mml;

import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class mml extends lnr implements com.bytedance.adsdk.ugeno.mml.qdl.mml {
    private com.bytedance.adsdk.ugeno.mml.qdl.lnr rq;

    public mml(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.mml.mml.lnr
    public boolean qdl(Object... objArr) {
        com.bytedance.adsdk.ugeno.mml.qdl.qdl qdlVarAg = this.ud.ag();
        if (qdlVarAg == null) {
            return false;
        }
        com.bytedance.adsdk.ugeno.mml.qdl.lnr lnrVarQdl = qdlVarAg.qdl(this.mo);
        this.rq = lnrVarQdl;
        if (lnrVarQdl != null) {
            lnrVarQdl.qdl(this);
            return false;
        }
        qdlVarAg.qdl(this.mo, new com.bytedance.adsdk.ugeno.mml.qdl.ud());
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.mml.qdl.mml
    public void qdl(String str) {
        Log.d("UGBaseEventMonitor", "receive: ");
        this.qdl.qdl(this.ud, this.mo, this.lnr.ud());
    }
}
