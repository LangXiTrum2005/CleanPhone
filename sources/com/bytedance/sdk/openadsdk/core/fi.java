package com.bytedance.sdk.openadsdk.core;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class fi {
    public static void ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, String str, int i, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.ka.ik.lr(wjvVar, str, "convert_track", jSONObject);
    }
}
