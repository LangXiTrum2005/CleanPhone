package com.bytedance.sdk.openadsdk.co.ri;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class fi extends com.bytedance.sdk.component.ri.ka<JSONObject, JSONObject> {
    private JSONObject ri;

    public fi(JSONObject jSONObject) {
        this.ri = jSONObject;
    }

    public static void ri(com.bytedance.sdk.component.ri.vr vrVar, JSONObject jSONObject) {
        vrVar.ri("getData", new fi(jSONObject));
    }

    @Override // com.bytedance.sdk.component.ri.ka
    public JSONObject ri(String str, JSONObject jSONObject, com.bytedance.sdk.component.ri.fi fiVar) throws Exception {
        return com.bytedance.sdk.openadsdk.core.jbs.ri.lr.ri(this.ri, jSONObject);
    }
}
