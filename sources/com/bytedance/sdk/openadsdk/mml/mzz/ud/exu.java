package com.bytedance.sdk.openadsdk.mml.mzz.ud;

import com.bytedance.sdk.component.utils.aaj;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class exu implements lnr {
    public long lnr;
    public long qdl;
    public int ud;

    public void qdl(long j) {
        this.qdl = j;
    }

    public void ud(long j) {
        this.lnr = j;
    }

    public void qdl(int i2) {
        this.ud = i2;
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mzz.ud.lnr
    public void qdl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.qdl);
            jSONObject.put("buffers_count", this.ud);
            jSONObject.put("total_duration", this.lnr);
        } catch (Throwable th) {
            aaj.lnr("PlayBufferModel", th.getMessage());
        }
    }
}
