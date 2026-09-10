package com.bytedance.sdk.openadsdk.bjy.lnr;

import com.smartdigimkt.k6.b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mml {

    public static class qdl {
        public final String qdl;
        public final JSONObject ud;

        public qdl(String str, JSONObject jSONObject) {
            this.qdl = str;
            this.ud = jSONObject;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(b.c.d);
            if (jSONObjectOptJSONObject != null) {
                try {
                    jSONObjectOptJSONObject.put("gaid", com.bytedance.sdk.openadsdk.exc.qdl.ud.qdl.qdl().ud());
                    jSONObject.put(b.c.d, jSONObjectOptJSONObject);
                } catch (JSONException unused) {
                }
            }
        }
    }

    public static lnr qdl() {
        return mzz.qdl();
    }
}
