package com.bytedance.sdk.openadsdk.mml.mzz.ud;

import com.bytedance.sdk.component.utils.aaj;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mzz implements lnr {
    private long qdl;
    private long ud;

    public void qdl(long j) {
        this.qdl = j;
    }

    public void ud(long j) {
        this.ud = j;
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mzz.ud.lnr
    public void qdl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.qdl);
            jSONObject.put("total_duration", this.ud);
        } catch (Throwable th) {
            aaj.lnr("FeedContinueModel", th.getMessage());
        }
    }
}
