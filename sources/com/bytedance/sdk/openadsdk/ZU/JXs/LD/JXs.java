package com.bytedance.sdk.openadsdk.ZU.JXs.LD;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class JXs implements lk {
    private long LD;
    private long Lxb;

    public void LD(long j) {
        this.LD = j;
    }

    public void Lxb(long j) {
        this.Lxb = j;
    }

    @Override // com.bytedance.sdk.openadsdk.ZU.JXs.LD.lk
    public void Lxb(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.Lxb);
            jSONObject.put("total_duration", this.LD);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("FeedContinueModel", th.getMessage());
        }
    }
}
