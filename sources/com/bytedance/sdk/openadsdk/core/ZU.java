package com.bytedance.sdk.openadsdk.core;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ZU {
    public static void Lxb(com.bytedance.sdk.openadsdk.core.model.tD tDVar, String str, int i, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.ZU.lk.LD(tDVar, str, "convert_track", jSONObject);
    }
}
