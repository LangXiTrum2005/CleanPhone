package com.bytedance.sdk.openadsdk.ZU.JXs.LD;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class NXR implements lk {
    public int LD;
    public long Lxb;
    public long lk;

    public void LD(long j) {
        this.lk = j;
    }

    public void Lxb(long j) {
        this.Lxb = j;
    }

    public void Lxb(int i) {
        this.LD = i;
    }

    @Override // com.bytedance.sdk.openadsdk.ZU.JXs.LD.lk
    public void Lxb(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.Lxb);
            jSONObject.put("buffers_count", this.LD);
            jSONObject.put("total_duration", this.lk);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("PlayBufferModel", th.getMessage());
        }
    }
}
