package com.bytedance.sdk.openadsdk.mml.mzz.ud;

import com.bytedance.sdk.component.utils.aaj;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class to implements lnr {
    private long lnr;
    private int mml;
    private String mo;
    private String mzz;
    private String qdl;
    private long ud;

    public void lnr(String str) {
        this.mo = str;
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

    public void ud(String str) {
        this.mzz = str;
    }

    public void qdl(int i2) {
        this.mml = i2;
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
            jSONObject.put("error_code", this.mml);
            jSONObject.put("error_message", this.mzz);
            jSONObject.put("error_message_server", this.mo);
        } catch (Throwable th) {
            aaj.lnr("LoadVideoErrorModel", th.getMessage());
        }
    }
}
