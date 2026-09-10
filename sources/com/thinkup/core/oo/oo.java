package com.thinkup.core.oo;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class oo {
    private Map<String, String> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Map<String, String> f42474n;
    private JSONObject o;
    final String o0 = "oo";
    private Map<String, String> oo;

    public final void m(JSONObject jSONObject) {
        this.o = jSONObject;
    }

    public final void n(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("cached");
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(strOptString)) {
            try {
                JSONObject jSONObject2 = new JSONObject(strOptString);
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject2.optString(next));
                }
            } catch (Throwable unused) {
            }
        }
        this.m = map;
    }

    public final void o(JSONObject jSONObject, String str) {
        String strOptString = jSONObject.optString("cached");
        Map<String, String> mapOonm = oonm();
        if (TextUtils.isEmpty(strOptString) || this.o == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(strOptString);
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String strOptString2 = jSONObject2.optString(next);
                String str2 = mapOonm.get(next);
                jSONObject.put(next, this.o.opt(next));
                if (!TextUtils.equals(strOptString2, str2)) {
                    com.thinkup.core.common.oo0.oo.o(str, TextUtils.isEmpty(str) ? "1" : "2", next, strOptString2, str2);
                    jSONObject2.put(next, str2);
                }
            }
            jSONObject.put("cached", jSONObject2.toString());
        } catch (Throwable unused) {
        }
    }

    public final void o0(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("n_cache");
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(strOptString)) {
            try {
                JSONObject jSONObject2 = new JSONObject(strOptString);
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject2.optString(next));
                }
            } catch (Throwable unused) {
            }
        }
        this.f42474n = map;
    }

    public final JSONObject oon0() {
        return this.o;
    }

    public final synchronized Map<String, String> oonm() {
        try {
            if (this.oo == null) {
                HashMap map = new HashMap();
                this.oo = map;
                Map<String, String> map2 = this.m;
                if (map2 != null) {
                    map.putAll(map2);
                }
                Map<String, String> map3 = this.f42474n;
                if (map3 != null) {
                    this.oo.putAll(map3);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.oo;
    }

    public final boolean oono() {
        Map<String, String> map = this.f42474n;
        return map == null || map.size() == 0;
    }

    private Map<String, String> m() {
        return this.f42474n;
    }

    private Map<String, String> o() {
        return this.m;
    }
}
