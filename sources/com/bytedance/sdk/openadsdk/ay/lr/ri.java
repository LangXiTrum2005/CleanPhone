package com.bytedance.sdk.openadsdk.ay.lr;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private final float ik;
    private final int lr;
    private final int ri;

    public ri(int i, int i2, float f) {
        this.ri = i;
        this.lr = i2;
        this.ik = f;
    }

    public static JSONObject ri(ri riVar) throws Throwable {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", riVar.ri);
        jSONObject.put("height", riVar.lr);
        jSONObject.put("alpha", riVar.ik);
        return jSONObject;
    }
}
