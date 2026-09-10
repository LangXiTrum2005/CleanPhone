package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.component.utils.ihz;
import com.bytedance.sdk.openadsdk.core.nr;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ri extends qt {
    public ri() {
        super(new qt.ri() { // from class: com.bytedance.sdk.openadsdk.core.settings.ri.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.qt.ri
            public void lr() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.qt.ri
            public void ri() {
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.qt
    public String ri() {
        try {
            String str = "tt_set_apm.prop";
            if (nr.ri() == null || ihz.ri(nr.ri())) {
                return str;
            }
            return "tt_set_apm_" + ihz.ik(nr.ri()) + ".prop";
        } catch (Throwable unused) {
            return "tt_set_apm";
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.fi
    public void ri(JSONObject jSONObject) {
        fi.ri riVarLr = lr();
        if (jSONObject.has("apm_url")) {
            riVarLr.ri("apm_url", jSONObject.optString("apm_url"));
        }
        if (jSONObject.has("perf_con")) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("perf_con");
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has("perf_con_apm")) {
                    riVarLr.ri("perf_con_apm", jSONObjectOptJSONObject.optInt("perf_con_apm"));
                }
            } catch (Exception unused) {
            }
        }
        riVarLr.ri();
        fi();
    }
}
