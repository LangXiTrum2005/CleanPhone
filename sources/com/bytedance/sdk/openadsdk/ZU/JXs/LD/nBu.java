package com.bytedance.sdk.openadsdk.ZU.JXs.LD;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class nBu implements lk {
    private String JXs;
    private long LD;
    private String Lxb;
    private int ZU;
    private String lc;
    private long lk;

    public void LD(long j) {
        this.lk = j;
    }

    public void Lxb(String str) {
        this.Lxb = str;
    }

    public void lk(String str) {
        this.lc = str;
    }

    public void LD(String str) {
        this.JXs = str;
    }

    public void Lxb(long j) {
        this.LD = j;
    }

    public void Lxb(int i) {
        this.ZU = i;
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
            jSONObject.put("error_code", this.ZU);
            jSONObject.put("error_message", this.JXs);
            jSONObject.put("error_message_server", this.lc);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("LoadVideoErrorModel", th.getMessage());
        }
    }
}
