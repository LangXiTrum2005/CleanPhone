package com.bytedance.sdk.openadsdk.bch.ud;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class qdl {
    private final float lnr;
    private final int qdl;
    private final int ud;

    public qdl(int i2, int i3, float f) {
        this.qdl = i2;
        this.ud = i3;
        this.lnr = f;
    }

    public static JSONObject qdl(qdl qdlVar) throws Throwable {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", qdlVar.qdl);
        jSONObject.put("height", qdlVar.ud);
        jSONObject.put("alpha", qdlVar.lnr);
        return jSONObject;
    }
}
