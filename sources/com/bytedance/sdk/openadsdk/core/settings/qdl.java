package com.bytedance.sdk.openadsdk.core.settings;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class qdl extends to {
    public qdl() {
        super("tt_set_apm.prop", new to.qdl() { // from class: com.bytedance.sdk.openadsdk.core.settings.qdl.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.to.qdl
            public void qdl() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.to.qdl
            public void ud() {
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.mzz
    public void qdl(JSONObject jSONObject) {
        mzz.qdl qdlVarQdl = qdl();
        if (jSONObject.has("apm_url")) {
            qdlVarQdl.qdl("apm_url", jSONObject.optString("apm_url"));
        }
        if (jSONObject.has("perf_con")) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("perf_con");
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has("perf_con_apm")) {
                    qdlVarQdl.qdl("perf_con_apm", jSONObjectOptJSONObject.optInt("perf_con_apm"));
                }
            } catch (Exception unused) {
            }
        }
        qdlVarQdl.qdl();
        mml();
    }
}
