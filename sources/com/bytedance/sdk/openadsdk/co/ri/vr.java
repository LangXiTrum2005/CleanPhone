package com.bytedance.sdk.openadsdk.co.ri;

import com.bytedance.sdk.openadsdk.core.dzy;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class vr extends com.bytedance.sdk.component.ri.ka<JSONObject, JSONObject> {
    private final dzy ri;

    public vr(dzy dzyVar) {
        this.ri = dzyVar;
    }

    public static void ri(com.bytedance.sdk.component.ri.vr vrVar, dzy dzyVar) {
        vrVar.ri("commonConvert", new vr(dzyVar));
    }

    @Override // com.bytedance.sdk.component.ri.ka
    public JSONObject ri(String str, JSONObject jSONObject, com.bytedance.sdk.component.ri.fi fiVar) throws Exception {
        this.ri.di(jSONObject);
        return null;
    }
}
