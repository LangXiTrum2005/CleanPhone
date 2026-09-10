package com.bytedance.sdk.openadsdk.ZU.JXs.LD;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lc implements lk {
    private long LD;
    private long Lxb;
    private int lk = 0;

    public void LD(long j) {
        this.LD = j;
    }

    public void Lxb(long j) {
        this.Lxb = j;
    }

    public void Lxb(int i) {
        this.lk = i;
    }

    @Override // com.bytedance.sdk.openadsdk.ZU.JXs.LD.lk
    public void Lxb(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("total_duration", this.Lxb);
            jSONObject.put("buffers_time", this.LD);
            jSONObject.put("video_backup", this.lk);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("FeedOverModel", th.getMessage());
        }
    }
}
