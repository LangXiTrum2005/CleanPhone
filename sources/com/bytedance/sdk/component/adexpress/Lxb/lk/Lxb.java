package com.bytedance.sdk.component.adexpress.Lxb.lk;

import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    private LD JXs;
    private String LD;
    private String Lxb;
    private List<C0054Lxb> ZU;
    private Map<String, Lxb> lc = new ConcurrentHashMap();
    private String lk;

    public static class LD {
        private String LD;
        private String Lxb;
        private List<Pair<String, String>> lk;

        public void LD(String str) {
            this.LD = str;
        }

        public String Lxb() {
            return this.Lxb;
        }

        public List<Pair<String, String>> LD() {
            return this.lk;
        }

        public void Lxb(String str) {
            this.Lxb = str;
        }

        public void Lxb(List<Pair<String, String>> list) {
            this.lk = list;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.Lxb.lk.Lxb$Lxb, reason: collision with other inner class name */
    public static class C0054Lxb {
        private String LD;
        private String Lxb;
        private int lk;

        public String LD() {
            return this.LD;
        }

        public String Lxb() {
            return this.Lxb;
        }

        public boolean equals(Object obj) {
            String str;
            if (!(obj instanceof C0054Lxb)) {
                return super.equals(obj);
            }
            String str2 = this.Lxb;
            if (str2 != null) {
                C0054Lxb c0054Lxb = (C0054Lxb) obj;
                if (str2.equals(c0054Lxb.Lxb()) && (str = this.LD) != null && str.equals(c0054Lxb.LD())) {
                    return true;
                }
            }
            return false;
        }

        public int lk() {
            return this.lk;
        }

        public void LD(String str) {
            this.LD = str;
        }

        public void Lxb(String str) {
            this.Lxb = str;
        }

        public void Lxb(int i) {
            this.lk = i;
        }
    }

    public LD JXs() {
        return this.JXs;
    }

    public String LD() {
        return this.Lxb;
    }

    public Map<String, Lxb> Lxb() {
        return this.lc;
    }

    public JSONObject OY() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("name", LD());
            jSONObject.putOpt("version", lk());
            jSONObject.putOpt("main", ZU());
            JSONArray jSONArray = new JSONArray();
            if (lc() != null) {
                for (C0054Lxb c0054Lxb : lc()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("url", c0054Lxb.Lxb());
                    jSONObject2.putOpt("md5", c0054Lxb.LD());
                    jSONObject2.putOpt("level", Integer.valueOf(c0054Lxb.lk()));
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.putOpt("resources", jSONArray);
            if (!this.lc.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                boolean z = false;
                for (String str : this.lc.keySet()) {
                    Lxb lxb = this.lc.get(str);
                    if (lxb != null) {
                        jSONObject3.put(str, lxb.OY());
                        z = true;
                    }
                }
                if (z) {
                    jSONObject.put("engines", jSONObject3);
                }
            }
            LD ldJXs = JXs();
            if (ldJXs != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("url", ldJXs.Lxb);
                jSONObject4.put("md5", ldJXs.LD);
                JSONObject jSONObject5 = new JSONObject();
                List<Pair<String, String>> listLD = ldJXs.LD();
                if (listLD != null) {
                    for (Pair<String, String> pair : listLD) {
                        jSONObject5.put((String) pair.first, pair.second);
                    }
                }
                jSONObject4.put("map", jSONObject5);
                jSONObject.putOpt("resources_archive", jSONObject4);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String QAg() {
        JSONObject jSONObjectOY;
        if (!ebl() || (jSONObjectOY = OY()) == null) {
            return null;
        }
        return jSONObjectOY.toString();
    }

    public String ZU() {
        return this.lk;
    }

    public boolean ebl() {
        return (TextUtils.isEmpty(ZU()) || TextUtils.isEmpty(lk()) || TextUtils.isEmpty(LD())) ? false : true;
    }

    public List<C0054Lxb> lc() {
        if (this.ZU == null) {
            this.ZU = new ArrayList();
        }
        return this.ZU;
    }

    public String lk() {
        return this.LD;
    }

    public static Lxb ZU(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Lxb(new JSONObject(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public void LD(String str) {
        this.LD = str;
    }

    public void Lxb(String str) {
        this.Lxb = str;
    }

    public void lk(String str) {
        this.lk = str;
    }

    public void Lxb(LD ld) {
        this.JXs = ld;
    }

    public void Lxb(List<C0054Lxb> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.ZU = list;
    }

    public static Lxb Lxb(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null) {
            return null;
        }
        Lxb lxb = new Lxb();
        lxb.Lxb(jSONObject.optString("name"));
        lxb.LD(jSONObject.optString("version"));
        lxb.lk(jSONObject.optString("main"));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("resources");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                C0054Lxb c0054Lxb = new C0054Lxb();
                c0054Lxb.Lxb(jSONObjectOptJSONObject2.optString("url"));
                c0054Lxb.LD(jSONObjectOptJSONObject2.optString("md5"));
                c0054Lxb.Lxb(jSONObjectOptJSONObject2.optInt("level"));
                arrayList.add(c0054Lxb);
            }
        }
        lxb.Lxb(arrayList);
        try {
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("engines");
            if (jSONObjectOptJSONObject3 != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject3.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Lxb Lxb = Lxb(jSONObjectOptJSONObject3.optJSONObject(next));
                    if (Lxb != null) {
                        lxb.Lxb().put(next, Lxb);
                    }
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        if (jSONObject.has("resources_archive") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("resources_archive")) != null) {
            LD ld = new LD();
            ld.Lxb(jSONObjectOptJSONObject.optString("url"));
            ld.LD(jSONObjectOptJSONObject.optString("md5"));
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("map");
            if (jSONObjectOptJSONObject4 != null) {
                Iterator<String> itKeys2 = jSONObjectOptJSONObject4.keys();
                ArrayList arrayList2 = new ArrayList();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    arrayList2.add(new Pair(next2, jSONObjectOptJSONObject4.optString(next2)));
                }
                ld.Lxb(arrayList2);
            }
            lxb.Lxb(ld);
        }
        if (lxb.ebl()) {
            return lxb;
        }
        return null;
    }
}
