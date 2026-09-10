package com.bytedance.sdk.openadsdk.core.settings;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb extends IeN {
    public Lxb() {
        super("tt_set_apm.prop", new IeN.Lxb() { // from class: com.bytedance.sdk.openadsdk.core.settings.Lxb.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.IeN.Lxb
            public void LD() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.IeN.Lxb
            public void Lxb() {
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.JXs
    public void Lxb(JSONObject jSONObject) {
        JXs.Lxb Lxb = Lxb();
        if (jSONObject.has("apm_url")) {
            Lxb.Lxb("apm_url", jSONObject.optString("apm_url"));
        }
        if (jSONObject.has("perf_con")) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("perf_con");
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has("perf_con_apm")) {
                    Lxb.Lxb("perf_con_apm", jSONObjectOptJSONObject.optInt("perf_con_apm"));
                }
            } catch (Exception unused) {
            }
        }
        Lxb.Lxb();
        ZU();
    }
}
