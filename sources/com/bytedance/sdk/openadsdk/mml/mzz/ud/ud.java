package com.bytedance.sdk.openadsdk.mml.mzz.ud;

import com.bytedance.sdk.component.utils.aaj;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ud implements lnr {
    private int lnr;
    private int mml;
    private long qdl;
    private long ud;

    public void qdl(long j) {
        this.qdl = j;
    }

    public void ud(long j) {
        this.ud = j;
    }

    public void qdl(int i2) {
        this.lnr = i2;
    }

    public void ud(int i2) {
        this.mml = i2;
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mzz.ud.lnr
    public void qdl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.qdl);
            jSONObject.put("total_duration", this.ud);
            jSONObject.put("vbtt_skip_type", this.lnr);
            jSONObject.put("skip_reason", this.mml);
        } catch (Throwable th) {
            aaj.lnr("EndcardSkipModel", th.getMessage());
        }
    }
}
