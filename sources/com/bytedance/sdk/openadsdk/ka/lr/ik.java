package com.bytedance.sdk.openadsdk.ka.lr;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ik implements lr {
    lr ri;

    @Override // com.bytedance.sdk.openadsdk.ka.lr.lr
    public void ri(JSONObject jSONObject, long j) throws JSONException {
        lr lrVar = this.ri;
        if (lrVar != null) {
            lrVar.ri(jSONObject, j);
        }
        if (j <= 0) {
            j = System.currentTimeMillis();
        }
        jSONObject.put("event_ts", j);
    }
}
