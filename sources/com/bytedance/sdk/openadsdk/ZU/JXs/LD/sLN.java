package com.bytedance.sdk.openadsdk.ZU.JXs.LD;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class sLN implements lk {
    private long LD;
    private String Lxb;
    private long ZU;
    private long lk;

    public void LD(long j) {
        this.lk = j;
    }

    public void Lxb(String str) {
        this.Lxb = str;
    }

    public void lk(long j) {
        this.ZU = j;
    }

    public void Lxb(long j) {
        this.LD = j;
    }

    @Override // com.bytedance.sdk.openadsdk.ZU.JXs.LD.lk
    public void Lxb(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.Lxb);
            jSONObject.put("preload_size", this.LD);
            jSONObject.put("load_time", this.lk);
            jSONObject.put("local_cache", this.ZU);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("LoadVideoSuccessModel", th.getMessage());
        }
    }
}
