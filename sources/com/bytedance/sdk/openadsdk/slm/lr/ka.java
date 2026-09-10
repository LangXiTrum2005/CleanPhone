package com.bytedance.sdk.openadsdk.slm.lr;

import com.ironsource.L6;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ka {

    public static class ri {
        public final JSONObject lr;
        public final String ri;

        public ri(String str, JSONObject jSONObject) {
            this.ri = str;
            this.lr = jSONObject;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("device_info");
            if (jSONObjectOptJSONObject != null) {
                try {
                    jSONObjectOptJSONObject.put(L6.V0, com.bytedance.sdk.openadsdk.ihz.ri.lr.ri.ri().lr());
                    jSONObject.put("device_info", jSONObjectOptJSONObject);
                } catch (JSONException unused) {
                }
            }
        }
    }

    public static ik ri() {
        return fi.ri();
    }
}
