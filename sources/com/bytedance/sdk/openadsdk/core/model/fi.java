package com.bytedance.sdk.openadsdk.core.model;

import java.util.ArrayList;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class fi {
    private ka lr;
    private ArrayList<ri> ri;

    public static class ri {
        private com.bytedance.sdk.openadsdk.core.aw.ka ik;
        private Set<com.bytedance.sdk.openadsdk.core.aw.qt> ka;
        private final String lr;
        private final String ri;

        public ri(JSONObject jSONObject) {
            this.ri = jSONObject.optString("vast_url");
            this.lr = jSONObject.optString("vast_content");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("videoTrackers");
            if (jSONObjectOptJSONObject != null) {
                com.bytedance.sdk.openadsdk.core.aw.ka kaVar = new com.bytedance.sdk.openadsdk.core.aw.ka();
                this.ik = kaVar;
                kaVar.ri(jSONObjectOptJSONObject);
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("viewabilityVendor");
            if (jSONArrayOptJSONArray != null) {
                this.ka = com.bytedance.sdk.openadsdk.core.aw.qt.ri(jSONArrayOptJSONArray);
            }
        }

        public String ik() {
            return this.ri;
        }

        public String ka() {
            return this.lr;
        }

        public Set<com.bytedance.sdk.openadsdk.core.aw.qt> lr() {
            return this.ka;
        }

        public com.bytedance.sdk.openadsdk.core.aw.ka ri() {
            return this.ik;
        }

        public void ri(com.bytedance.sdk.openadsdk.core.aw.ka kaVar) {
            this.ik = kaVar;
        }

        public void ri(Set<com.bytedance.sdk.openadsdk.core.aw.qt> set) {
            this.ka = set;
        }
    }

    public fi(JSONArray jSONArray) {
        if (jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            ri riVar = new ri(jSONArray.optJSONObject(i));
            if (this.ri == null) {
                this.ri = new ArrayList<>();
            }
            this.ri.add(riVar);
        }
    }

    public static boolean ri(wjv wjvVar) {
        if (wjvVar == null || wjvVar.ory()) {
            return false;
        }
        int iLji = wjvVar.lji();
        int iVz = wjvVar.vz();
        return (iLji == 3 || iLji == 7 || iLji == 8) && (iVz == 5 || iVz == 15 || iVz == 50);
    }

    public boolean ik() {
        ArrayList<ri> arrayList = this.ri;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public ka lr() {
        if (this.lr == null) {
            this.lr = new ka();
            ArrayList<ri> arrayList = this.ri;
            if (arrayList != null) {
                for (ri riVar : arrayList) {
                    com.bytedance.sdk.openadsdk.core.aw.ka kaVarRi = riVar.ri();
                    Set<com.bytedance.sdk.openadsdk.core.aw.qt> setLr = riVar.lr();
                    if (kaVarRi != null) {
                        this.lr.ri().ri(kaVarRi);
                    }
                    if (setLr != null) {
                        this.lr.lr().addAll(setLr);
                    }
                }
            }
        }
        return this.lr;
    }

    public ArrayList<ri> ri() {
        return this.ri;
    }
}
