package com.bytedance.sdk.openadsdk.mml.mzz.ud;

import com.bytedance.sdk.component.utils.aaj;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class rq implements lnr {
    private final String qdl;
    private final long ud;

    public rq(String str, long j) {
        this.qdl = str;
        this.ud = j;
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mzz.ud.lnr
    public void qdl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.qdl);
            jSONObject.put("preload_size", this.ud);
        } catch (Throwable th) {
            aaj.lnr("LoadVideoStartModel", th.getMessage());
        }
    }
}
