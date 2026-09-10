package com.bytedance.sdk.component.adexpress.dynamic.fi;

import com.bytedance.sdk.component.adexpress.lr.aw;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class xha implements mj {
    private com.bytedance.sdk.component.adexpress.dynamic.di.lr ri;

    /* JADX INFO: Access modifiers changed from: private */
    public void lr(aw awVar) {
        try {
            JSONObject jSONObjectIk = awVar.ik();
            JSONObject jSONObject = new JSONObject(jSONObjectIk.optString("template_Plugin"));
            JSONObject jSONObjectOptJSONObject = jSONObjectIk.optJSONObject("creative");
            com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVarRi = new di(jSONObject, jSONObjectOptJSONObject, jSONObjectIk.optJSONObject("AdSize"), new JSONObject(jSONObjectIk.optString("diff_template_Plugin"))).ri(awVar.lr(), awVar.qt(), jSONObjectOptJSONObject.optDouble("score_exact_i18n"), jSONObjectOptJSONObject.optString("comment_num_i18n"), awVar);
            try {
                JSONObject jSONObject2 = new JSONObject(jSONObjectOptJSONObject.optString("dynamic_creative"));
                mjVarRi.ri(jSONObject2.optString("color"));
                mjVarRi.ri(jSONObject2.optJSONArray("material_center"));
            } catch (Throwable unused) {
            }
            this.ri.ri(mjVarRi);
        } catch (Exception unused2) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fi.mj
    public void ri(com.bytedance.sdk.component.adexpress.dynamic.di.lr lrVar) {
        this.ri = lrVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fi.mj
    public void ri(final aw awVar) {
        if (awVar.co() == 1) {
            lr(awVar);
        } else {
            com.bytedance.sdk.component.adexpress.ka.ka.ri(new com.bytedance.sdk.component.mj.lr.ik("dynamicparse") { // from class: com.bytedance.sdk.component.adexpress.dynamic.fi.xha.1
                @Override // java.lang.Runnable
                public void run() {
                    xha.this.lr(awVar);
                }
            }, 5);
        }
    }
}
