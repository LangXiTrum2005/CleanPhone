package com.bytedance.sdk.openadsdk.mml.mzz.ud;

import com.bytedance.sdk.component.utils.aaj;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mml implements lnr {
    public int lnr;
    public int mml = 0;
    public long qdl;
    public long ud;

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
            jSONObject.put("total_duration", this.qdl);
            jSONObject.put("buffers_time", this.ud);
            jSONObject.put("break_reason", this.lnr);
            jSONObject.put("video_backup", this.mml);
        } catch (Throwable th) {
            aaj.lnr("FeedBreakModel", th.getMessage());
        }
    }
}
