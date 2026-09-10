package com.bytedance.sdk.openadsdk.ka.fi.lr;

import com.bytedance.sdk.component.utils.ac;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class xha extends ik {
    private long lr;
    private long ri;

    public void lr(long j) {
        this.lr = j;
    }

    public void ri(long j) {
        this.ri = j;
    }

    @Override // com.bytedance.sdk.openadsdk.ka.fi.lr.ik
    public void ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.ri);
            jSONObject.put("total_duration", this.lr);
        } catch (Throwable th) {
            ac.ik("FeedPauseModel", th.getMessage());
        }
    }
}
