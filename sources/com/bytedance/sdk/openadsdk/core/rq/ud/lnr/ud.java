package com.bytedance.sdk.openadsdk.core.rq.ud.lnr;

import android.content.Context;
import android.util.Log;
import com.bytedance.adsdk.ugeno.mml.rq;

/* JADX INFO: loaded from: classes3.dex */
public class ud extends com.bytedance.adsdk.ugeno.mml.mml.lnr {
    private float rq;

    public ud(Context context) {
        super(context);
        this.rq = 100.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.mml.mml.lnr
    public boolean qdl(Object... objArr) {
        if (objArr != null && objArr.length >= 2) {
            if (com.bytedance.adsdk.ugeno.wd.lnr.qdl(String.valueOf(objArr[1]), 0.0f) <= 0.0f) {
                rq rqVar = this.qdl;
                if (rqVar != null) {
                    rqVar.qdl(this.ud, this.mo, this.lnr.ud());
                }
                return true;
            }
            this.rq = com.bytedance.adsdk.ugeno.wd.lnr.qdl(this.mzz.get("rate"), 100);
            float fQdl = com.bytedance.adsdk.ugeno.wd.lnr.qdl(String.valueOf(objArr[0]), 100.0f);
            Log.d("UGBaseEventMonitor", "monitor: progress=" + fQdl + " mTargetProgress=" + this.rq);
            if (fQdl >= this.rq) {
                rq rqVar2 = this.qdl;
                if (rqVar2 != null) {
                    rqVar2.qdl(this.ud, this.mo, this.lnr.ud());
                }
                return true;
            }
        }
        return false;
    }
}
