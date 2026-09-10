package com.bytedance.sdk.openadsdk.ZU.JXs.LD;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class OY implements lk {
    private long LD;
    private long Lxb;
    private int lk;

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
            jSONObject.put("video_start_duration", this.Lxb);
            jSONObject.put("video_cache_size", this.LD);
            jSONObject.put("is_auto_play", this.lk);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("FeedPlayModel", th.getMessage());
        }
    }
}
