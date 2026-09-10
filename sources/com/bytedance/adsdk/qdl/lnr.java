package com.bytedance.adsdk.qdl;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class lnr implements com.bytedance.adsdk.ugeno.lnr.qdl {

    public static class qdl implements com.bytedance.adsdk.ugeno.lnr.qdl.InterfaceC0063qdl {
        private com.bytedance.adsdk.qdl.ud.qdl qdl;
        private String ud;

        private qdl(String str) {
            this.ud = str;
            this.qdl = com.bytedance.adsdk.qdl.ud.qdl.qdl(str);
        }

        public static qdl qdl(String str) {
            return new qdl(str);
        }

        @Override // com.bytedance.adsdk.ugeno.lnr.qdl.InterfaceC0063qdl
        public Object qdl(JSONObject jSONObject) {
            com.bytedance.adsdk.qdl.ud.qdl qdlVar = this.qdl;
            if (qdlVar == null) {
                return this.ud;
            }
            Object objQdl = qdlVar.qdl(jSONObject);
            if (objQdl instanceof String) {
                return objQdl;
            }
            if (objQdl instanceof com.bytedance.adsdk.qdl.ud.qdl.qdl) {
                return String.valueOf(jtx.qdl((com.bytedance.adsdk.qdl.ud.qdl.qdl) objQdl));
            }
            if (objQdl == null || !objQdl.getClass().isArray()) {
                return String.valueOf(objQdl);
            }
            try {
                return new JSONArray(objQdl).toString();
            } catch (JSONException unused) {
                return String.valueOf(objQdl);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.lnr.qdl
    public com.bytedance.adsdk.ugeno.lnr.qdl.InterfaceC0063qdl qdl(String str) {
        return qdl.qdl(str);
    }
}
