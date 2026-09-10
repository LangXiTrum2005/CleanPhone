package com.bytedance.sdk.openadsdk.uq.lr;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private List<C0277ri> ik;
    private List<C0277ri> lr;
    private String ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.uq.lr.ri$ri, reason: collision with other inner class name */
    public static class C0277ri {
        private int ik;
        private String lr;
        private String ri;

        public boolean equals(Object obj) {
            String str;
            if (!(obj instanceof C0277ri)) {
                return super.equals(obj);
            }
            String str2 = this.ri;
            if (str2 != null) {
                C0277ri c0277ri = (C0277ri) obj;
                if (str2.equals(c0277ri.ri) && (str = this.lr) != null && str.equals(c0277ri.lr)) {
                    return true;
                }
            }
            return false;
        }

        public static C0277ri ri(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            C0277ri c0277ri = new C0277ri();
            c0277ri.ri = jSONObject.optString("url");
            c0277ri.lr = jSONObject.optString("md5");
            c0277ri.ik = jSONObject.optInt("type");
            return c0277ri;
        }

        public String ri() {
            return this.ri;
        }
    }

    public List<C0277ri> ik() {
        return this.ik;
    }

    public void lr(List<C0277ri> list) {
        this.ik = list;
    }

    public void ri(String str) {
        this.ri = str;
    }

    public List<C0277ri> lr() {
        return this.lr;
    }

    public void ri(List<C0277ri> list) {
        this.lr = list;
    }

    public static ri lr(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            ri riVar = new ri();
            riVar.ri(jSONObject.optString("version"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("resources");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    C0277ri c0277riRi = C0277ri.ri(jSONArrayOptJSONArray.optJSONObject(i));
                    if (c0277riRi != null) {
                        if (c0277riRi.ik != 1) {
                            if (c0277riRi.ik == 2 && arrayList2.size() < 10) {
                                arrayList2.add(c0277riRi);
                            }
                        } else {
                            arrayList.add(c0277riRi);
                        }
                    }
                }
            }
            riVar.ri(arrayList);
            riVar.lr(arrayList2);
            return riVar;
        } catch (JSONException unused) {
            return null;
        }
    }

    public String ri() {
        return this.ri;
    }
}
