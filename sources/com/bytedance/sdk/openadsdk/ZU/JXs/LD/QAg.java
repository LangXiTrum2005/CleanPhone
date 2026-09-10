package com.bytedance.sdk.openadsdk.ZU.JXs.LD;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class QAg implements lk {
    private final long LD;
    private final String Lxb;

    public QAg(String str, long j) {
        this.Lxb = str;
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
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("LoadVideoCancelModel", th.getMessage());
        }
    }
}
