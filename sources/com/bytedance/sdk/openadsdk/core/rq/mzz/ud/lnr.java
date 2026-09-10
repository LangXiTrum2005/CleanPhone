package com.bytedance.sdk.openadsdk.core.rq.mzz.ud;

import android.content.Context;
import com.bytedance.adsdk.ugeno.mml.rq;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class lnr extends com.bytedance.adsdk.ugeno.mml.mml.lnr {
    private boolean rq;

    public lnr(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.mml.mml.lnr
    public boolean qdl(Object... objArr) {
        Map<String, String> map = this.mzz;
        if (map == null || map.isEmpty()) {
            return false;
        }
        long jLongValue = ((Long) objArr[0]).longValue() / 1000;
        long jLongValue2 = ((Long) objArr[1]).longValue() / 1000;
        if (jLongValue <= 0) {
            this.rq = false;
        }
        if (this.mzz.containsKey("percent")) {
            float fQdl = com.bytedance.adsdk.ugeno.wd.lnr.qdl(this.mzz.get("percent"), -1.0f);
            if (fQdl >= 0.0f && jLongValue >= (fQdl / 100.0f) * jLongValue2 && !this.rq) {
                this.rq = true;
                rq rqVar = this.qdl;
                if (rqVar != null) {
                    rqVar.qdl(this.ud, this.mo, this.lnr.ud());
                }
            }
        } else if (jLongValue >= com.bytedance.adsdk.ugeno.wd.lnr.qdl(this.mzz.get("interval"), -1) && !this.rq) {
            this.rq = true;
            rq rqVar2 = this.qdl;
            if (rqVar2 != null) {
                rqVar2.qdl(this.ud, this.mo, this.lnr.ud());
            }
        }
        return true;
    }
}
