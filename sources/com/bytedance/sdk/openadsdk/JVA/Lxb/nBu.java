package com.bytedance.sdk.openadsdk.JVA.Lxb;

import com.bytedance.sdk.component.Lxb.kqm;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class nBu extends com.bytedance.sdk.component.Lxb.JXs<JSONObject, JSONObject> {
    private WeakReference<com.bytedance.sdk.component.QAg.ZU> Lxb;

    public nBu(com.bytedance.sdk.component.QAg.ZU zu) {
        this.Lxb = new WeakReference<>(zu);
    }

    public static void Lxb(kqm kqmVar, com.bytedance.sdk.component.QAg.ZU zu) {
        kqmVar.Lxb("preventTouchEvent", new nBu(zu));
    }

    @Override // com.bytedance.sdk.component.Lxb.JXs
    public JSONObject Lxb(JSONObject jSONObject, com.bytedance.sdk.component.Lxb.lc lcVar) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        try {
            boolean zOptBoolean = jSONObject.optBoolean("isPrevent", false);
            com.bytedance.sdk.component.QAg.ZU zu = this.Lxb.get();
            if (zu != null) {
                zu.setIsPreventTouchEvent(zOptBoolean);
                jSONObject2.put("success", true);
            } else {
                jSONObject2.put("success", false);
            }
        } catch (Throwable unused) {
            jSONObject2.put("success", false);
        }
        return jSONObject2;
    }
}
