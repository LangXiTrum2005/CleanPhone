package com.bytedance.sdk.component.adexpress.qdl.lnr;

import android.text.TextUtils;
import android.util.Pair;
import androidx.media3.extractor.text.ttml.a;
import com.applovin.sdk.AppLovinEventTypes;
import com.p004ironsource.d9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class qdl {
    private String lnr;
    private List<C0081qdl> mml;
    private String mo;
    private ud mzz;
    private String qdl;
    private String ud;
    private Map<String, qdl> wd = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.qdl.lnr.qdl$qdl, reason: collision with other inner class name */
    public static class C0081qdl {
        private int lnr;
        private String qdl;
        private String ud;

        public boolean equals(Object obj) {
            String str;
            if (!(obj instanceof C0081qdl)) {
                return super.equals(obj);
            }
            String str2 = this.qdl;
            if (str2 != null) {
                C0081qdl c0081qdl = (C0081qdl) obj;
                if (str2.equals(c0081qdl.qdl()) && (str = this.ud) != null && str.equals(c0081qdl.ud())) {
                    return true;
                }
            }
            return false;
        }

        public int lnr() {
            return this.lnr;
        }

        public String qdl() {
            return this.qdl;
        }

        public String ud() {
            return this.ud;
        }

        public void qdl(String str) {
            this.qdl = str;
        }

        public void ud(String str) {
            this.ud = str;
        }

        public void qdl(int i2) {
            this.lnr = i2;
        }
    }

    public static class ud {
        private List<Pair<String, String>> lnr;
        private String qdl;
        private String ud;

        public String qdl() {
            return this.qdl;
        }

        public void ud(String str) {
            this.ud = str;
        }

        public void qdl(String str) {
            this.qdl = str;
        }

        public List<Pair<String, String>> ud() {
            return this.lnr;
        }

        public void qdl(List<Pair<String, String>> list) {
            this.lnr = list;
        }
    }

    public boolean jpc() {
        return (TextUtils.isEmpty(mml()) || TextUtils.isEmpty(lnr()) || TextUtils.isEmpty(ud())) ? false : true;
    }

    public String lnr() {
        return this.ud;
    }

    public String mml() {
        return this.lnr;
    }

    public List<C0081qdl> mo() {
        if (this.mml == null) {
            this.mml = new ArrayList();
        }
        return this.mml;
    }

    public ud mzz() {
        return this.mzz;
    }

    public Map<String, qdl> qdl() {
        return this.wd;
    }

    public String to() {
        JSONObject jSONObjectTvp;
        if (!jpc() || (jSONObjectTvp = tvp()) == null) {
            return null;
        }
        return jSONObjectTvp.toString();
    }

    public JSONObject tvp() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("name", ud());
            jSONObject.putOpt("version", lnr());
            jSONObject.putOpt(d9.h.Z, mml());
            if (!TextUtils.isEmpty(this.mo)) {
                jSONObject.put("template_fetch_url", this.mo);
            }
            JSONArray jSONArray = new JSONArray();
            if (mo() != null) {
                for (C0081qdl c0081qdl : mo()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("url", c0081qdl.qdl());
                    jSONObject2.putOpt("md5", c0081qdl.ud());
                    jSONObject2.putOpt(AppLovinEventTypes.USER_COMPLETED_LEVEL, Integer.valueOf(c0081qdl.lnr()));
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.putOpt("resources", jSONArray);
            if (!this.wd.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                boolean z2 = false;
                for (String str : this.wd.keySet()) {
                    qdl qdlVar = this.wd.get(str);
                    if (qdlVar != null) {
                        jSONObject3.put(str, qdlVar.tvp());
                        z2 = true;
                    }
                }
                if (z2) {
                    jSONObject.put("engines", jSONObject3);
                }
            }
            ud udVarMzz = mzz();
            if (udVarMzz != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("url", udVarMzz.qdl);
                jSONObject4.put("md5", udVarMzz.ud);
                JSONObject jSONObject5 = new JSONObject();
                List<Pair<String, String>> listUd = udVarMzz.ud();
                if (listUd != null) {
                    for (Pair<String, String> pair : listUd) {
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

    public String ud() {
        return this.qdl;
    }

    public String wd() {
        return this.mo;
    }

    public static qdl mzz(String str) {
        if (str == null) {
            return null;
        }
        try {
            return qdl(new JSONObject(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public void lnr(String str) {
        this.lnr = str;
    }

    public void mml(String str) {
        this.mo = str;
    }

    public void qdl(String str) {
        this.qdl = str;
    }

    public void ud(String str) {
        this.ud = str;
    }

    public void qdl(ud udVar) {
        this.mzz = udVar;
    }

    public void qdl(List<C0081qdl> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.mml = list;
    }

    public static qdl qdl(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null) {
            return null;
        }
        qdl qdlVar = new qdl();
        qdlVar.qdl(jSONObject.optString("name"));
        qdlVar.ud(jSONObject.optString("version"));
        qdlVar.lnr(jSONObject.optString(d9.h.Z));
        qdlVar.mml(jSONObject.optString("template_fetch_url", ""));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("resources");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i2);
                C0081qdl c0081qdl = new C0081qdl();
                c0081qdl.qdl(jSONObjectOptJSONObject2.optString("url"));
                c0081qdl.ud(jSONObjectOptJSONObject2.optString("md5"));
                c0081qdl.qdl(jSONObjectOptJSONObject2.optInt(AppLovinEventTypes.USER_COMPLETED_LEVEL));
                arrayList.add(c0081qdl);
            }
        }
        qdlVar.qdl(arrayList);
        try {
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("engines");
            if (jSONObjectOptJSONObject3 != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject3.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    qdl qdlVarQdl = qdl(jSONObjectOptJSONObject3.optJSONObject(next));
                    if (qdlVarQdl != null) {
                        qdlVar.qdl().put(next, qdlVarQdl);
                    }
                }
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
        if (jSONObject.has("resources_archive") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("resources_archive")) != null) {
            ud udVar = new ud();
            udVar.qdl(jSONObjectOptJSONObject.optString("url"));
            udVar.ud(jSONObjectOptJSONObject.optString("md5"));
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("map");
            if (jSONObjectOptJSONObject4 != null) {
                Iterator<String> itKeys2 = jSONObjectOptJSONObject4.keys();
                ArrayList arrayList2 = new ArrayList();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    a.z(next2, jSONObjectOptJSONObject4.optString(next2), arrayList2);
                }
                udVar.qdl(arrayList2);
            }
            qdlVar.qdl(udVar);
        }
        if (qdlVar.jpc()) {
            return qdlVar;
        }
        return null;
    }
}
