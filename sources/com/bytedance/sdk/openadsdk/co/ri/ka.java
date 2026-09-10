package com.bytedance.sdk.openadsdk.co.ri;

import com.bytedance.sdk.openadsdk.core.dzy;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ka extends com.bytedance.sdk.component.ri.ka<JSONObject, JSONObject> {
    private final dzy ri;

    public ka(dzy dzyVar) {
        this.ri = dzyVar;
    }

    public static void ri(com.bytedance.sdk.component.ri.vr vrVar, dzy dzyVar) {
        vrVar.ri("expressAdViewStartZoom", new ka(dzyVar));
    }

    @Override // com.bytedance.sdk.component.ri.ka
    public JSONObject ri(String str, JSONObject jSONObject, com.bytedance.sdk.component.ri.fi fiVar) throws Exception {
        this.ri.ka(jSONObject);
        return null;
    }
}
