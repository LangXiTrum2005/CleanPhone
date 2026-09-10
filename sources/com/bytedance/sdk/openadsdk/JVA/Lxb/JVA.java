package com.bytedance.sdk.openadsdk.JVA.Lxb;

import com.bytedance.sdk.component.Lxb.kqm;
import com.bytedance.sdk.openadsdk.core.Ivz;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class JVA extends com.bytedance.sdk.component.Lxb.JXs<JSONObject, JSONObject> {
    private final Ivz Lxb;

    public JVA(Ivz ivz) {
        this.Lxb = ivz;
    }

    public static void Lxb(kqm kqmVar, Ivz ivz) {
        kqmVar.Lxb("commonConvert", new JVA(ivz));
    }

    @Override // com.bytedance.sdk.component.Lxb.JXs
    public JSONObject Lxb(JSONObject jSONObject, com.bytedance.sdk.component.Lxb.lc lcVar) throws Exception {
        this.Lxb.lc(jSONObject);
        return null;
    }
}
