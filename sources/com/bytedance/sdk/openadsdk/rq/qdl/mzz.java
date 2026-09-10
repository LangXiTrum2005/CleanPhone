package com.bytedance.sdk.openadsdk.rq.qdl;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mzz extends com.bytedance.sdk.component.qdl.mml<JSONObject, JSONObject> {
    private JSONObject qdl;

    public mzz(JSONObject jSONObject) {
        this.qdl = jSONObject;
    }

    public static void qdl(com.bytedance.sdk.component.qdl.bjy bjyVar, JSONObject jSONObject) {
        bjyVar.qdl("getData", new mzz(jSONObject));
    }

    @Override // com.bytedance.sdk.component.qdl.mml
    public JSONObject qdl(String str, JSONObject jSONObject, com.bytedance.sdk.component.qdl.mzz mzzVar) throws Exception {
        return com.bytedance.sdk.openadsdk.core.tvp.qdl.ud.qdl(this.qdl, jSONObject);
    }
}
