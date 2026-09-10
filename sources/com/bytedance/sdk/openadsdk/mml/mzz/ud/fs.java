package com.bytedance.sdk.openadsdk.mml.mzz.ud;

import com.bytedance.sdk.component.utils.aaj;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class fs implements lnr {
    private long lnr;
    private long mml;
    private String qdl;
    private long ud;

    public void lnr(long j) {
        this.mml = j;
    }

    public void qdl(String str) {
        this.qdl = str;
    }

    public void ud(long j) {
        this.lnr = j;
    }

    public void qdl(long j) {
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
            jSONObject.put("load_time", this.lnr);
            jSONObject.put("local_cache", this.mml);
        } catch (Throwable th) {
            aaj.lnr("LoadVideoSuccessModel", th.getMessage());
        }
    }
}
