package com.bytedance.sdk.component.adexpress.ri.ik;

import android.text.TextUtils;
import android.util.Pair;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private String di;
    private lr fi;
    private String ik;
    private List<C0207ri> ka;
    private String lr;
    private String ri;
    private Map<String, ri> xha = new ConcurrentHashMap();

    public static class lr {
        private List<Pair<String, String>> ik;
        private String lr;
        private String ri;

        public void lr(String str) {
            this.lr = str;
        }

        public String ri() {
            return this.ri;
        }

        public List<Pair<String, String>> lr() {
            return this.ik;
        }

        public void ri(String str) {
            this.ri = str;
        }

        public void ri(List<Pair<String, String>> list) {
            this.ik = list;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.ri.ik.ri$ri, reason: collision with other inner class name */
    public static class C0207ri {
        private int ik;
        private String lr;
        private String ri;

        public boolean equals(Object obj) {
            String str;
            if (!(obj instanceof C0207ri)) {
                return super.equals(obj);
            }
            String str2 = this.ri;
            if (str2 != null) {
                C0207ri c0207ri = (C0207ri) obj;
                if (str2.equals(c0207ri.ri()) && (str = this.lr) != null && str.equals(c0207ri.lr())) {
                    return true;
                }
            }
            return false;
        }

        public int ik() {
            return this.ik;
        }

        public String lr() {
            return this.lr;
        }

        public String ri() {
            return this.ri;
        }

        public void lr(String str) {
            this.lr = str;
        }

        public void ri(String str) {
            this.ri = str;
        }

        public void ri(int i) {
            this.ik = i;
        }
    }

    public List<C0207ri> di() {
        if (this.ka == null) {
            this.ka = new ArrayList();
        }
        return this.ka;
    }

    public lr fi() {
        return this.fi;
    }

    public String ik() {
        return this.lr;
    }

    public JSONObject jbs() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("name", lr());
            jSONObject.putOpt("version", ik());
            jSONObject.putOpt(X3.i.Z, ka());
            if (!TextUtils.isEmpty(this.di)) {
                jSONObject.put("template_fetch_url", this.di);
            }
            JSONArray jSONArray = new JSONArray();
            if (di() != null) {
                for (C0207ri c0207ri : di()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("url", c0207ri.ri());
                    jSONObject2.putOpt("md5", c0207ri.lr());
                    jSONObject2.putOpt(AppLovinEventTypes.USER_COMPLETED_LEVEL, Integer.valueOf(c0207ri.ik()));
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.putOpt("resources", jSONArray);
            if (!this.xha.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                boolean z = false;
                for (String str : this.xha.keySet()) {
                    ri riVar = this.xha.get(str);
                    if (riVar != null) {
                        jSONObject3.put(str, riVar.jbs());
                        z = true;
                    }
                }
                if (z) {
                    jSONObject.put("engines", jSONObject3);
                }
            }
            lr lrVarFi = fi();
            if (lrVarFi != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("url", lrVarFi.ri);
                jSONObject4.put("md5", lrVarFi.lr);
                JSONObject jSONObject5 = new JSONObject();
                List<Pair<String, String>> listLr = lrVarFi.lr();
                if (listLr != null) {
                    for (Pair<String, String> pair : listLr) {
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

    public String ka() {
        return this.ik;
    }

    public String lr() {
        return this.ri;
    }

    public boolean mj() {
        return (TextUtils.isEmpty(ka()) || TextUtils.isEmpty(ik()) || TextUtils.isEmpty(lr())) ? false : true;
    }

    public String qt() {
        JSONObject jSONObjectJbs;
        if (!mj() || (jSONObjectJbs = jbs()) == null) {
            return null;
        }
        return jSONObjectJbs.toString();
    }

    public Map<String, ri> ri() {
        return this.xha;
    }

    public String xha() {
        return this.di;
    }

    public static ri fi(String str) {
        if (str == null) {
            return null;
        }
        try {
            return ri(new JSONObject(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public void ik(String str) {
        this.ik = str;
    }

    public void ka(String str) {
        this.di = str;
    }

    public void lr(String str) {
        this.lr = str;
    }

    public void ri(String str) {
        this.ri = str;
    }

    public void ri(lr lrVar) {
        this.fi = lrVar;
    }

    public void ri(List<C0207ri> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.ka = list;
    }

    public static ri ri(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null) {
            return null;
        }
        ri riVar = new ri();
        riVar.ri(jSONObject.optString("name"));
        riVar.lr(jSONObject.optString("version"));
        riVar.ik(jSONObject.optString(X3.i.Z));
        riVar.ka(jSONObject.optString("template_fetch_url", ""));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("resources");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                C0207ri c0207ri = new C0207ri();
                c0207ri.ri(jSONObjectOptJSONObject2.optString("url"));
                c0207ri.lr(jSONObjectOptJSONObject2.optString("md5"));
                c0207ri.ri(jSONObjectOptJSONObject2.optInt(AppLovinEventTypes.USER_COMPLETED_LEVEL));
                arrayList.add(c0207ri);
            }
        }
        riVar.ri(arrayList);
        try {
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("engines");
            if (jSONObjectOptJSONObject3 != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject3.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    ri riVarRi = ri(jSONObjectOptJSONObject3.optJSONObject(next));
                    if (riVarRi != null) {
                        riVar.ri().put(next, riVarRi);
                    }
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        if (jSONObject.has("resources_archive") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("resources_archive")) != null) {
            lr lrVar = new lr();
            lrVar.ri(jSONObjectOptJSONObject.optString("url"));
            lrVar.lr(jSONObjectOptJSONObject.optString("md5"));
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("map");
            if (jSONObjectOptJSONObject4 != null) {
                Iterator<String> itKeys2 = jSONObjectOptJSONObject4.keys();
                ArrayList arrayList2 = new ArrayList();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    arrayList2.add(new Pair<>(next2, jSONObjectOptJSONObject4.optString(next2)));
                }
                lrVar.ri(arrayList2);
            }
            riVar.ri(lrVar);
        }
        if (riVar.mj()) {
            return riVar;
        }
        return null;
    }
}
