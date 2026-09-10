package com.bytedance.sdk.openadsdk.ZU.JXs.LD;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LD implements lk {
    private long LD;
    private long Lxb;
    private int ZU;
    private int lk;

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
            jSONObject.put("buffers_time", this.Lxb);
            jSONObject.put("total_duration", this.LD);
            jSONObject.put("vbtt_skip_type", this.lk);
            jSONObject.put("skip_reason", this.ZU);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("EndcardSkipModel", th.getMessage());
        }
    }
}
