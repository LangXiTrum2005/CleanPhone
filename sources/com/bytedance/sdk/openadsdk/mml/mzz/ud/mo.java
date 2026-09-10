package com.bytedance.sdk.openadsdk.mml.mzz.ud;

import com.bytedance.sdk.component.utils.aaj;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mo implements lnr {
    private int lnr = 0;
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

    @Override // com.bytedance.sdk.openadsdk.mml.mzz.ud.lnr
    public void qdl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("total_duration", this.qdl);
            jSONObject.put("buffers_time", this.ud);
            jSONObject.put("video_backup", this.lnr);
        } catch (Throwable th) {
            aaj.lnr("FeedOverModel", th.getMessage());
        }
    }
}
