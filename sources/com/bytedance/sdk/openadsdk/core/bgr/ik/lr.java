package com.bytedance.sdk.openadsdk.core.bgr.ik;

import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    public static void ri(wjv wjvVar) {
        if (dw.lr(wjvVar)) {
            com.bytedance.sdk.openadsdk.ka.ik.lr(wjvVar, "playable_preload", "preload_start", (JSONObject) null);
        }
    }

    public static void ri(wjv wjvVar, long j, long j2) {
        if (wjvVar != null) {
            if (dw.ik(wjvVar) || dw.lr(wjvVar)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("loadzip_success_time", j);
                    jSONObject.put("unzip_success_time", j2);
                } catch (JSONException e) {
                    ac.ri("PlayableEvent", "onSuccess json error", e);
                }
                com.bytedance.sdk.openadsdk.ka.ik.lr(wjvVar, "playable_preload", "preload_success", jSONObject);
            }
        }
    }

    public static void ri(wjv wjvVar, int i, String str) {
        if (wjvVar != null) {
            if (dw.ik(wjvVar) || dw.lr(wjvVar)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i);
                    jSONObject.put("error_reason", str);
                } catch (JSONException e) {
                    ac.ri("PlayableEvent", "onFail json error", e);
                }
                com.bytedance.sdk.openadsdk.ka.ik.lr(wjvVar, "playable_preload", "preload_fail", jSONObject);
            }
        }
    }
}
