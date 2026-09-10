package com.bytedance.sdk.openadsdk.core.exu.lnr;

import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ud {
    public static void qdl(ljh ljhVar) {
        if (vu.ud(ljhVar)) {
            com.bytedance.sdk.openadsdk.mml.lnr.ud(ljhVar, "playable_preload", "preload_start", (JSONObject) null);
        }
    }

    public static void qdl(ljh ljhVar, long j, long j2) {
        if (ljhVar != null) {
            if (vu.lnr(ljhVar) || vu.ud(ljhVar)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("loadzip_success_time", j);
                    jSONObject.put("unzip_success_time", j2);
                } catch (JSONException e2) {
                    aaj.qdl("PlayableEvent", "onSuccess json error", e2);
                }
                com.bytedance.sdk.openadsdk.mml.lnr.ud(ljhVar, "playable_preload", "preload_success", jSONObject);
            }
        }
    }

    public static void qdl(ljh ljhVar, int i2, String str) {
        if (ljhVar != null) {
            if (vu.lnr(ljhVar) || vu.ud(ljhVar)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i2);
                    jSONObject.put("error_reason", str);
                } catch (JSONException e2) {
                    aaj.qdl("PlayableEvent", "onFail json error", e2);
                }
                com.bytedance.sdk.openadsdk.mml.lnr.ud(ljhVar, "playable_preload", "preload_fail", jSONObject);
            }
        }
    }
}
