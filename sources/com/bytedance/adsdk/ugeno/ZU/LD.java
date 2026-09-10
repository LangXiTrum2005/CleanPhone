package com.bytedance.adsdk.ugeno.ZU;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class LD {
    private List<Lxb> LD;
    private Lxb Lxb;

    public static class Lxb {
        private String LD;
        private String Lxb = "global";
        private Map<String, String> lk;

        public String LD() {
            return this.LD;
        }

        public String Lxb() {
            return this.Lxb;
        }

        public Map<String, String> lk() {
            return this.lk;
        }

        public String toString() {
            return "Action{scheme='" + this.Lxb + "', name='" + this.LD + "', params=" + this.lk + '}';
        }

        public void LD(String str) {
            this.LD = str;
        }

        public void Lxb(String str) {
            this.Lxb = str;
        }

        public void Lxb(Map<String, String> map) {
            this.lk = map;
        }
    }

    public List<Lxb> LD() {
        return this.LD;
    }

    public Lxb Lxb() {
        return this.Lxb;
    }

    public static LD Lxb(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return null;
        }
        LD ld = new LD();
        String strOptString = jSONObject.optString("on");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("handlers");
        ld.Lxb = OY.Lxb(strOptString, jSONObject2);
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            Lxb Lxb2 = OY.Lxb(jSONArrayOptJSONArray.optString(i), jSONObject2);
            if (Lxb2 != null) {
                arrayList.add(Lxb2);
            }
        }
        ld.LD = arrayList;
        return ld;
    }
}
