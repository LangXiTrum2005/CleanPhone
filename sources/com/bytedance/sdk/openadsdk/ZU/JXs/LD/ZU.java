package com.bytedance.sdk.openadsdk.ZU.JXs.LD;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ZU implements lk {
    public long LD;
    public long Lxb;
    public int ZU = 0;
    public int lk;

    public void LD(long j) {
        this.LD = j;
    }

    public void Lxb(long j) {
        this.Lxb = j;
    }

    public void LD(int i) {
        this.ZU = i;
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
            jSONObject.put("break_reason", this.lk);
            jSONObject.put("video_backup", this.ZU);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("FeedBreakModel", th.getMessage());
        }
    }
}
