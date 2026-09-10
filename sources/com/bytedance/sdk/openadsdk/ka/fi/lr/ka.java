package com.bytedance.sdk.openadsdk.ka.fi.lr;

import com.bytedance.sdk.component.utils.ac;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ka extends ik {
    public int ik;
    public int ka = 0;
    public long lr;
    public long ri;

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
            jSONObject.put("total_duration", this.ri);
            jSONObject.put("buffers_time", this.lr);
            jSONObject.put("break_reason", this.ik);
            jSONObject.put("video_backup", this.ka);
        } catch (Throwable th) {
            ac.ik("FeedBreakModel", th.getMessage());
        }
    }
}
