package com.bytedance.sdk.openadsdk.ka.fi.lr;

import com.bytedance.sdk.component.utils.ac;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends ik {
    private int ik;
    private int ka;
    private long lr;
    private long ri;

    public void lr(long j) {
        this.lr = j;
    }

    public void ri(long j) {
        this.ri = j;
    }

    public void lr(int i) {
        this.ka = i;
    }

    public void ri(int i) {
        this.ik = i;
    }

    @Override // com.bytedance.sdk.openadsdk.ka.fi.lr.ik
    public void ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.ri);
            jSONObject.put("total_duration", this.lr);
            jSONObject.put("vbtt_skip_type", this.ik);
            jSONObject.put("skip_reason", this.ka);
        } catch (Throwable th) {
            ac.ik("EndcardSkipModel", th.getMessage());
        }
    }
}
