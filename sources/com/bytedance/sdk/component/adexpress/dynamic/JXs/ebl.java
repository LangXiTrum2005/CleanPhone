package com.bytedance.sdk.component.adexpress.dynamic.JXs;

import com.bytedance.sdk.component.adexpress.LD.NXR;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ebl implements OY {
    private com.bytedance.sdk.component.adexpress.dynamic.lc.LD Lxb;

    /* JADX INFO: Access modifiers changed from: private */
    public void LD(NXR nxr) {
        try {
            JSONObject jSONObjectLk = nxr.lk();
            JSONObject jSONObject = new JSONObject(jSONObjectLk.optString("template_Plugin"));
            JSONObject jSONObjectOptJSONObject = jSONObjectLk.optJSONObject("creative");
            com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oyLxb = new lc(jSONObject, jSONObjectOptJSONObject, jSONObjectLk.optJSONObject("AdSize"), new JSONObject(jSONObjectLk.optString("diff_template_Plugin"))).Lxb(nxr.LD(), nxr.nBu(), jSONObjectOptJSONObject.optDouble("score_exact_i18n"), jSONObjectOptJSONObject.optString("comment_num_i18n"), nxr);
            try {
                JSONObject jSONObject2 = new JSONObject(jSONObjectOptJSONObject.optString("dynamic_creative"));
                oyLxb.Lxb(jSONObject2.optString("color"));
                oyLxb.Lxb(jSONObject2.optJSONArray("material_center"));
            } catch (Throwable unused) {
            }
            this.Lxb.Lxb(oyLxb);
        } catch (Exception unused2) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.JXs.OY
    public void Lxb(com.bytedance.sdk.component.adexpress.dynamic.lc.LD ld) {
        this.Lxb = ld;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.JXs.OY
    public void Lxb(final NXR nxr) {
        if (nxr.sLN() == 1) {
            LD(nxr);
        } else {
            com.bytedance.sdk.component.adexpress.ZU.ZU.Lxb(new com.bytedance.sdk.component.OY.OY("dynamicparse") { // from class: com.bytedance.sdk.component.adexpress.dynamic.JXs.ebl.1
                @Override // java.lang.Runnable
                public void run() {
                    ebl.this.LD(nxr);
                }
            }, 5);
        }
    }
}
