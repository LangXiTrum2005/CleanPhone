package com.bytedance.adsdk.ri;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ik implements com.bytedance.adsdk.ugeno.ik.ri {

    public static class ri implements com.bytedance.adsdk.ugeno.ik.ri.InterfaceC0189ri {
        private String lr;
        private com.bytedance.adsdk.ri.lr.ri ri;

        private ri(String str) {
            this.lr = str;
            this.ri = com.bytedance.adsdk.ri.lr.ri.ri(str);
        }

        public static ri ri(String str) {
            return new ri(str);
        }

        @Override // com.bytedance.adsdk.ugeno.ik.ri.InterfaceC0189ri
        public Object ri(JSONObject jSONObject) {
            com.bytedance.adsdk.ri.lr.ri riVar = this.ri;
            if (riVar == null) {
                return this.lr;
            }
            Object objRi = riVar.ri(jSONObject);
            if (objRi instanceof String) {
                return objRi;
            }
            if (objRi instanceof com.bytedance.adsdk.ri.lr.ri.ri) {
                return String.valueOf(slm.ri((com.bytedance.adsdk.ri.lr.ri.ri) objRi));
            }
            if (objRi == null || !objRi.getClass().isArray()) {
                return String.valueOf(objRi);
            }
            try {
                return new JSONArray(objRi).toString();
            } catch (JSONException unused) {
                return String.valueOf(objRi);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ik.ri
    public com.bytedance.adsdk.ugeno.ik.ri.InterfaceC0189ri ri(String str) {
        return ri.ri(str);
    }
}
