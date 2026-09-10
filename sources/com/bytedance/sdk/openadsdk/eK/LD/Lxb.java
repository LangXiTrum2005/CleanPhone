package com.bytedance.sdk.openadsdk.eK.LD;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    private final int LD;
    private final int Lxb;
    private final float lk;

    public Lxb(int i, int i2, float f) {
        this.Lxb = i;
        this.LD = i2;
        this.lk = f;
    }

    public static JSONObject Lxb(Lxb lxb) throws Throwable {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", lxb.Lxb);
        jSONObject.put("height", lxb.LD);
        jSONObject.put("alpha", lxb.lk);
        return jSONObject;
    }
}
