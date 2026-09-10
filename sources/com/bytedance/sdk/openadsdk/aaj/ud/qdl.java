package com.bytedance.sdk.openadsdk.aaj.ud;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class qdl {
    private List<C0100qdl> lnr;
    private String qdl;
    private List<C0100qdl> ud;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.aaj.ud.qdl$qdl, reason: collision with other inner class name */
    public static class C0100qdl {
        private int lnr;
        private String qdl;
        private String ud;

        public boolean equals(Object obj) {
            String str;
            if (!(obj instanceof C0100qdl)) {
                return super.equals(obj);
            }
            String str2 = this.qdl;
            if (str2 != null) {
                C0100qdl c0100qdl = (C0100qdl) obj;
                if (str2.equals(c0100qdl.qdl) && (str = this.ud) != null && str.equals(c0100qdl.ud)) {
                    return true;
                }
            }
            return false;
        }

        public static C0100qdl qdl(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            C0100qdl c0100qdl = new C0100qdl();
            c0100qdl.qdl = jSONObject.optString("url");
            c0100qdl.ud = jSONObject.optString("md5");
            c0100qdl.lnr = jSONObject.optInt("type");
            return c0100qdl;
        }

        public String qdl() {
            return this.qdl;
        }
    }

    public List<C0100qdl> lnr() {
        return this.lnr;
    }

    public void qdl(String str) {
        this.qdl = str;
    }

    public void ud(List<C0100qdl> list) {
        this.lnr = list;
    }

    public void qdl(List<C0100qdl> list) {
        this.ud = list;
    }

    public List<C0100qdl> ud() {
        return this.ud;
    }

    public static qdl ud(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            qdl qdlVar = new qdl();
            qdlVar.qdl(jSONObject.optString("version"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("resources");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    C0100qdl c0100qdlQdl = C0100qdl.qdl(jSONArrayOptJSONArray.optJSONObject(i2));
                    if (c0100qdlQdl != null) {
                        if (c0100qdlQdl.lnr != 1) {
                            if (c0100qdlQdl.lnr == 2 && arrayList2.size() < 10) {
                                arrayList2.add(c0100qdlQdl);
                            }
                        } else {
                            arrayList.add(c0100qdlQdl);
                        }
                    }
                }
            }
            qdlVar.qdl(arrayList);
            qdlVar.ud(arrayList2);
            return qdlVar;
        } catch (JSONException unused) {
            return null;
        }
    }

    public String qdl() {
        return this.qdl;
    }
}
