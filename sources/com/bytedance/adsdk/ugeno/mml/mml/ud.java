package com.bytedance.adsdk.ugeno.mml.mml;

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ud extends lnr implements com.bytedance.adsdk.ugeno.qdl.ud {
    private String rq;

    public ud(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.mml.mml.lnr
    public boolean qdl(Object... objArr) {
        com.bytedance.adsdk.ugeno.ud.lnr lnrVar;
        com.bytedance.adsdk.ugeno.ud.lnr lnrVarUd;
        com.bytedance.adsdk.ugeno.qdl.qdl qdlVarExu;
        Map<String, String> map = this.mzz;
        if (map != null && map.size() > 0) {
            String str = this.mzz.get("name");
            this.rq = this.mzz.get("state");
            if (!TextUtils.isEmpty(str) && (lnrVarUd = (lnrVar = this.ud).ud(lnrVar)) != null && (qdlVarExu = lnrVarUd.jpc(str).exu(str)) != null) {
                qdlVarExu.qdl(this);
            }
        }
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.ud
    public void ud() {
        com.bytedance.adsdk.ugeno.mml.rq rqVar;
        if ((TextUtils.equals(this.rq, "complete") || TextUtils.isEmpty(this.rq)) && (rqVar = this.qdl) != null) {
            rqVar.qdl(this.ud, this.mo, this.lnr.ud());
        }
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.ud
    public void qdl() {
        com.bytedance.adsdk.ugeno.mml.rq rqVar;
        if ((TextUtils.equals(this.rq, "start") || TextUtils.isEmpty(this.rq)) && (rqVar = this.qdl) != null) {
            rqVar.qdl(this.ud, this.mo, this.lnr.ud());
        }
    }
}
