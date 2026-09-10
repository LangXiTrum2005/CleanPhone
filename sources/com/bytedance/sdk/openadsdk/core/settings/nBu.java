package com.bytedance.sdk.openadsdk.core.settings;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class nBu extends IeN {
    public nBu() {
        super("tt_set_mediation.prop", null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.JXs
    public void Lxb(JSONObject jSONObject) {
        if (jSONObject.has("mediation_init_conf")) {
            JXs.Lxb Lxb = Lxb();
            Lxb.Lxb("mediation_init_conf", jSONObject.optString("mediation_init_conf"));
            Lxb.Lxb();
            ZU();
        }
    }
}
