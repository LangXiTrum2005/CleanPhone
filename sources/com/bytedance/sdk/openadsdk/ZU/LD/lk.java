package com.bytedance.sdk.openadsdk.ZU.LD;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lk implements LD {
    LD Lxb;

    @Override // com.bytedance.sdk.openadsdk.ZU.LD.LD
    public void Lxb(JSONObject jSONObject, long j) throws JSONException {
        LD ld = this.Lxb;
        if (ld != null) {
            ld.Lxb(jSONObject, j);
        }
        if (j <= 0) {
            j = System.currentTimeMillis();
        }
        jSONObject.put("event_ts", j);
    }
}
