package com.bytedance.sdk.openadsdk.core.NXR.lk;

import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.core.model.eK;
import com.bytedance.sdk.openadsdk.core.model.tD;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LD {
    public static void Lxb(tD tDVar) {
        if (eK.LD(tDVar)) {
            com.bytedance.sdk.openadsdk.ZU.lk.LD(tDVar, "playable_preload", "preload_start", (JSONObject) null);
        }
    }

    public static void Lxb(tD tDVar, long j, long j2) {
        if (tDVar != null) {
            if (eK.lk(tDVar) || eK.LD(tDVar)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("loadzip_success_time", j);
                    jSONObject.put("unzip_success_time", j2);
                } catch (JSONException e) {
                    sLN.Lxb("PlayableEvent", "onSuccess json error", e);
                }
                com.bytedance.sdk.openadsdk.ZU.lk.LD(tDVar, "playable_preload", "preload_success", jSONObject);
            }
        }
    }

    public static void Lxb(tD tDVar, int i, String str) {
        if (tDVar != null) {
            if (eK.lk(tDVar) || eK.LD(tDVar)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i);
                    jSONObject.put("error_reason", str);
                } catch (JSONException e) {
                    sLN.Lxb("PlayableEvent", "onFail json error", e);
                }
                com.bytedance.sdk.openadsdk.ZU.lk.LD(tDVar, "playable_preload", "preload_fail", jSONObject);
            }
        }
    }
}
