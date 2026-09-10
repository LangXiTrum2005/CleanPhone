package com.bytedance.sdk.openadsdk.ka.fi.lr;

import com.bytedance.sdk.component.utils.ac;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class aw extends ik {
    public long ik;
    public int lr;
    public long ri;

    public void lr(long j) {
        this.ik = j;
    }

    public void ri(long j) {
        this.ri = j;
    }

    public void ri(int i) {
        this.lr = i;
    }

    @Override // com.bytedance.sdk.openadsdk.ka.fi.lr.ik
    public void ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.ri);
            jSONObject.put("buffers_count", this.lr);
            jSONObject.put("total_duration", this.ik);
        } catch (Throwable th) {
            ac.ik("PlayBufferModel", th.getMessage());
        }
    }
}
