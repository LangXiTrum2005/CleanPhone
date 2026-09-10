package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class oh {
    private ri di;
    private JSONObject fi;
    private String ik;
    private String ka;
    private String lr;
    private String ri;

    public static class ri {
        private JSONArray ik;
        private JSONArray lr;
        private JSONArray ri;

        public JSONArray ik() {
            return this.ik;
        }

        public JSONArray lr() {
            return this.lr;
        }

        public JSONArray ri() {
            return this.ri;
        }

        public void ik(JSONArray jSONArray) {
            this.ik = jSONArray;
        }

        public void lr(JSONArray jSONArray) {
            this.lr = jSONArray;
        }

        public void ri(JSONArray jSONArray) {
            this.ri = jSONArray;
        }

        public static ri ri(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("image");
            ri riVar = new ri();
            riVar.ri(jSONArrayOptJSONArray);
            riVar.lr(jSONObject.optJSONArray("fetch"));
            riVar.ik(jSONObject.optJSONArray("script"));
            return riVar;
        }
    }

    public ri di() {
        return this.di;
    }

    public JSONObject fi() {
        return this.fi;
    }

    public String ik() {
        return this.ik;
    }

    public String ka() {
        return this.ka;
    }

    public String lr() {
        return this.lr;
    }

    public String ri() {
        return this.ri;
    }

    public static oh ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        oh ohVar = new oh();
        ohVar.ri = jSONObject.optString("id");
        ohVar.ka = jSONObject.optString("data");
        ohVar.ik = jSONObject.optString("url");
        ohVar.lr = jSONObject.optString("md5");
        ohVar.fi = jSONObject.optJSONObject("custom_components");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preload");
        if (jSONObjectOptJSONObject != null) {
            ohVar.di = ri.ri(jSONObjectOptJSONObject);
        }
        return ohVar;
    }
}
