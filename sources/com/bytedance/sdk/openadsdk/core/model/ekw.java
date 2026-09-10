package com.bytedance.sdk.openadsdk.core.model;

import com.smartdigimkt.x.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ekw {
    private String lnr;
    private String mml;
    private qdl mo;
    private JSONObject mzz;
    private String qdl;
    private String ud;

    public static class qdl {
        private JSONArray lnr;
        private JSONArray qdl;
        private JSONArray ud;

        public JSONArray lnr() {
            return this.lnr;
        }

        public JSONObject mml() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(d.c.k, this.qdl);
                jSONObject.put("fetch", this.ud);
                jSONObject.put("script", this.lnr);
                return jSONObject;
            } catch (JSONException e2) {
                e2.getMessage();
                return jSONObject;
            }
        }

        public JSONArray qdl() {
            return this.qdl;
        }

        public JSONArray ud() {
            return this.ud;
        }

        public void lnr(JSONArray jSONArray) {
            this.lnr = jSONArray;
        }

        public void qdl(JSONArray jSONArray) {
            this.qdl = jSONArray;
        }

        public void ud(JSONArray jSONArray) {
            this.ud = jSONArray;
        }

        public static qdl qdl(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(d.c.k);
            qdl qdlVar = new qdl();
            qdlVar.qdl(jSONArrayOptJSONArray);
            qdlVar.ud(jSONObject.optJSONArray("fetch"));
            qdlVar.lnr(jSONObject.optJSONArray("script"));
            return qdlVar;
        }
    }

    public String lnr() {
        return this.lnr;
    }

    public String mml() {
        return this.mml;
    }

    public qdl mo() {
        return this.mo;
    }

    public JSONObject mzz() {
        return this.mzz;
    }

    public String qdl() {
        return this.qdl;
    }

    public String ud() {
        return this.ud;
    }

    public JSONObject wd() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.qdl);
            jSONObject.put("md5", this.ud);
            jSONObject.put("url", this.lnr);
            jSONObject.put("data", this.mml);
            jSONObject.put("custom_components", this.mzz);
            qdl qdlVar = this.mo;
            if (qdlVar != null) {
                jSONObject.put("preload", qdlVar.mml());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static ekw qdl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        ekw ekwVar = new ekw();
        ekwVar.qdl = jSONObject.optString("id");
        ekwVar.mml = jSONObject.optString("data");
        ekwVar.lnr = jSONObject.optString("url");
        ekwVar.ud = jSONObject.optString("md5");
        ekwVar.mzz = jSONObject.optJSONObject("custom_components");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preload");
        if (jSONObjectOptJSONObject != null) {
            ekwVar.mo = qdl.qdl(jSONObjectOptJSONObject);
        }
        return ekwVar;
    }
}
