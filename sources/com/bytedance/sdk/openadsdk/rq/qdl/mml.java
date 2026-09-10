package com.bytedance.sdk.openadsdk.rq.qdl;

import com.bytedance.sdk.openadsdk.core.hkc;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mml extends com.bytedance.sdk.component.qdl.mml<JSONObject, JSONObject> {
    private final hkc qdl;

    public mml(hkc hkcVar) {
        this.qdl = hkcVar;
    }

    public static void qdl(com.bytedance.sdk.component.qdl.bjy bjyVar, hkc hkcVar) {
        bjyVar.qdl("expressAdViewStartZoom", new mml(hkcVar));
    }

    @Override // com.bytedance.sdk.component.qdl.mml
    public JSONObject qdl(String str, JSONObject jSONObject, com.bytedance.sdk.component.qdl.mzz mzzVar) throws Exception {
        this.qdl.mml(jSONObject);
        return null;
    }
}
