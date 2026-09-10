package com.bytedance.sdk.openadsdk.STP.lk;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lk {

    public static class Lxb {
        public final JSONObject LD;
        public final String Lxb;

        public Lxb(String str, JSONObject jSONObject) {
            this.Lxb = str;
            this.LD = jSONObject;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("device_info");
            if (jSONObjectOptJSONObject != null) {
                try {
                    jSONObjectOptJSONObject.put("gaid", com.bytedance.sdk.openadsdk.brP.Lxb.LD.Lxb.Lxb().LD());
                    jSONObject.put("device_info", jSONObjectOptJSONObject);
                } catch (JSONException unused) {
                }
            }
        }
    }

    public static LD Lxb() {
        return ZU.Lxb();
    }
}
