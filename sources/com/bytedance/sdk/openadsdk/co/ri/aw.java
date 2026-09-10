package com.bytedance.sdk.openadsdk.co.ri;

import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class aw extends com.bytedance.sdk.component.ri.ka<JSONObject, JSONObject> {
    private WeakReference<com.bytedance.sdk.component.jbs.di> ri;

    public aw(com.bytedance.sdk.component.jbs.di diVar) {
        this.ri = new WeakReference<>(diVar);
    }

    public static void ri(com.bytedance.sdk.component.ri.vr vrVar, com.bytedance.sdk.component.jbs.di diVar) {
        vrVar.ri("preventTouchEvent", new aw(diVar));
    }

    @Override // com.bytedance.sdk.component.ri.ka
    public JSONObject ri(String str, JSONObject jSONObject, com.bytedance.sdk.component.ri.fi fiVar) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        try {
            boolean zOptBoolean = jSONObject.optBoolean("isPrevent", false);
            com.bytedance.sdk.component.jbs.di diVar = this.ri.get();
            if (diVar != null) {
                diVar.setIsPreventTouchEvent(zOptBoolean);
                jSONObject2.put("success", true);
                return jSONObject2;
            }
            jSONObject2.put("success", false);
            return jSONObject2;
        } catch (Throwable unused) {
            jSONObject2.put("success", false);
            return jSONObject2;
        }
    }
}
