package com.bytedance.sdk.openadsdk.JVA.Lxb;

import com.bytedance.sdk.component.Lxb.kqm;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class JXs extends com.bytedance.sdk.component.Lxb.JXs<JSONObject, JSONObject> {
    private JSONObject Lxb;

    public JXs(JSONObject jSONObject) {
        this.Lxb = jSONObject;
    }

    public static void Lxb(kqm kqmVar, JSONObject jSONObject) {
        kqmVar.Lxb("getData", new JXs(jSONObject));
    }

    @Override // com.bytedance.sdk.component.Lxb.JXs
    public JSONObject Lxb(JSONObject jSONObject, com.bytedance.sdk.component.Lxb.lc lcVar) throws Exception {
        return com.bytedance.sdk.openadsdk.core.OY.Lxb.LD.Lxb(this.Lxb, jSONObject);
    }
}
