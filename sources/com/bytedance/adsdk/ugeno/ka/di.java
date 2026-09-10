package com.bytedance.adsdk.ugeno.ka;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class di {
    private List<ri> lr;
    private ri ri;

    public static class ri {
        private Map<String, Object> di;
        private Map<String, String> fi;
        private String ik = "global";
        private String ka;
        private String lr;
        private String ri;

        public String fi() {
            return this.lr;
        }

        public Map<String, String> ik() {
            return this.fi;
        }

        public String ka() {
            return this.ri;
        }

        public String lr() {
            return this.ka;
        }

        public String ri() {
            return this.ik;
        }

        public String toString() {
            return "Action{scheme='" + this.ik + "', name='" + this.ka + "', params=" + this.fi + ", host='" + this.lr + "', origin='" + this.ri + "', extra=" + this.di + '}';
        }

        public void ik(String str) {
            this.ri = str;
        }

        public void ka(String str) {
            this.lr = str;
        }

        public void lr(String str) {
            this.ka = str;
        }

        public void ri(String str) {
            this.ik = str;
        }

        public void lr(Map<String, Object> map) {
            this.di = map;
        }

        public void ri(Map<String, String> map) {
            this.fi = map;
        }
    }

    public List<ri> lr() {
        return this.lr;
    }

    public ri ri() {
        return this.ri;
    }

    public static di ri(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return null;
        }
        di diVar = new di();
        String strOptString = jSONObject.optString("on");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("handlers");
        diVar.ri = co.ri(strOptString, jSONObject2);
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            ri riVarRi = co.ri(jSONArrayOptJSONArray.optString(i), jSONObject2);
            if (riVarRi != null) {
                arrayList.add(riVarRi);
            }
        }
        diVar.lr = arrayList;
        return diVar;
    }
}
