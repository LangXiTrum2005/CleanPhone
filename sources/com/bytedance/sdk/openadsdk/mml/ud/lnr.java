package com.bytedance.sdk.openadsdk.mml.ud;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class lnr implements ud {
    ud qdl;

    @Override // com.bytedance.sdk.openadsdk.mml.ud.ud
    public void qdl(JSONObject jSONObject, long j) throws JSONException {
        ud udVar = this.qdl;
        if (udVar != null) {
            udVar.qdl(jSONObject, j);
        }
        if (j <= 0) {
            j = System.currentTimeMillis();
        }
        jSONObject.put("event_ts", j);
    }
}
