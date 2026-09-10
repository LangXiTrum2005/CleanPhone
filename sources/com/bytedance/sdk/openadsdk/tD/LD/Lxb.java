package com.bytedance.sdk.openadsdk.tD.LD;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    private List<C0117Lxb> LD;
    private String Lxb;
    private List<C0117Lxb> lk;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.tD.LD.Lxb$Lxb, reason: collision with other inner class name */
    public static class C0117Lxb {
        private String LD;
        private String Lxb;
        private int lk;

        public boolean equals(Object obj) {
            String str;
            if (!(obj instanceof C0117Lxb)) {
                return super.equals(obj);
            }
            String str2 = this.Lxb;
            if (str2 != null) {
                C0117Lxb c0117Lxb = (C0117Lxb) obj;
                if (str2.equals(c0117Lxb.Lxb) && (str = this.LD) != null && str.equals(c0117Lxb.LD)) {
                    return true;
                }
            }
            return false;
        }

        public static C0117Lxb Lxb(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            C0117Lxb c0117Lxb = new C0117Lxb();
            c0117Lxb.Lxb = jSONObject.optString("url");
            c0117Lxb.LD = jSONObject.optString("md5");
            c0117Lxb.lk = jSONObject.optInt("type");
            return c0117Lxb;
        }

        public String Lxb() {
            return this.Lxb;
        }
    }

    public void LD(List<C0117Lxb> list) {
        this.lk = list;
    }

    public void Lxb(String str) {
        this.Lxb = str;
    }

    public List<C0117Lxb> lk() {
        return this.lk;
    }

    public List<C0117Lxb> LD() {
        return this.LD;
    }

    public void Lxb(List<C0117Lxb> list) {
        this.LD = list;
    }

    public static Lxb LD(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Lxb lxb = new Lxb();
            lxb.Lxb(jSONObject.optString("version"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("resources");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    C0117Lxb c0117LxbLxb = C0117Lxb.Lxb(jSONArrayOptJSONArray.optJSONObject(i));
                    if (c0117LxbLxb != null) {
                        if (c0117LxbLxb.lk != 1) {
                            if (c0117LxbLxb.lk == 2 && arrayList2.size() < 10) {
                                arrayList2.add(c0117LxbLxb);
                            }
                        } else {
                            arrayList.add(c0117LxbLxb);
                        }
                    }
                }
            }
            lxb.Lxb(arrayList);
            lxb.LD(arrayList2);
            return lxb;
        } catch (JSONException unused) {
            return null;
        }
    }

    public String Lxb() {
        return this.Lxb;
    }
}
