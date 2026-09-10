package com.bytedance.sdk.component.adexpress.dynamic.mzz;

import com.bytedance.sdk.component.adexpress.ud.exu;
import com.smartdigimkt.x.t;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class wd implements jpc {
    private com.bytedance.sdk.component.adexpress.dynamic.mo.ud qdl;

    /* JADX INFO: Access modifiers changed from: private */
    public void ud(exu exuVar) {
        try {
            JSONObject jSONObjectLnr = exuVar.lnr();
            JSONObject jSONObject = new JSONObject(jSONObjectLnr.optString("template_Plugin"));
            JSONObject jSONObjectOptJSONObject = jSONObjectLnr.optJSONObject(t.o1);
            com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVarQdl = new mo(jSONObject, jSONObjectOptJSONObject, jSONObjectLnr.optJSONObject("AdSize"), new JSONObject(jSONObjectLnr.optString("diff_template_Plugin"))).qdl(exuVar.ud(), exuVar.to(), jSONObjectOptJSONObject.optDouble("score_exact_i18n"), jSONObjectOptJSONObject.optString("comment_num_i18n"), exuVar);
            try {
                JSONObject jSONObject2 = new JSONObject(jSONObjectOptJSONObject.optString("dynamic_creative"));
                jpcVarQdl.qdl(jSONObject2.optString("color"));
                jpcVarQdl.qdl(jSONObject2.optJSONArray("material_center"));
            } catch (Throwable unused) {
            }
            this.qdl.qdl(jpcVarQdl);
        } catch (Exception unused2) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mzz.jpc
    public void qdl(com.bytedance.sdk.component.adexpress.dynamic.mo.ud udVar) {
        this.qdl = udVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mzz.jpc
    public void qdl(final exu exuVar) {
        if (exuVar.fs() == 1) {
            ud(exuVar);
        } else {
            com.bytedance.sdk.component.adexpress.mml.mml.qdl(new com.bytedance.sdk.component.jpc.jpc("dynamicparse") { // from class: com.bytedance.sdk.component.adexpress.dynamic.mzz.wd.1
                @Override // java.lang.Runnable
                public void run() {
                    wd.this.ud(exuVar);
                }
            }, 5);
        }
    }
}
