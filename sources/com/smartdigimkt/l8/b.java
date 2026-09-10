package com.smartdigimkt.l8;

import android.text.TextUtils;
import com.smartdigimkt.n8.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f36441a = "b";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f36442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, String> f36443c;
    private Map<String, String> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, String> f36444e;

    public void a(JSONObject jSONObject, String str) {
        String strOptString = jSONObject.optString("cached");
        Map<String, String> mapA = a();
        if (!TextUtils.isEmpty(strOptString) && this.f36442b != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(strOptString);
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String strOptString2 = jSONObject2.optString(next);
                    String str2 = mapA.get(next);
                    jSONObject.put(next, this.f36442b.opt(next));
                    if (!TextUtils.equals(strOptString2, str2)) {
                        com.smartdigimkt.i7.d.a(str, TextUtils.isEmpty(str) ? "1" : "2", next, strOptString2, str2);
                        jSONObject2.put(next, str2);
                    }
                }
                jSONObject.put("cached", jSONObject2.toString());
            } catch (Throwable unused) {
            }
        }
        if (this instanceof a) {
            try {
                if (!TextUtils.isEmpty(((a) this).n()) && ((a) this).o() != null && ((a) this).o().size() > 0 && !TextUtils.equals(((a) this).n(), jSONObject.optString(a.C0534a.i0, ""))) {
                    Iterator<String> it = ((a) this).o().iterator();
                    while (it.hasNext()) {
                        com.smartdigimkt.d7.d.c().a(3, l.b(it.next()));
                    }
                }
                if (!TextUtils.isEmpty(((a) this).r()) && ((a) this).s() != null && ((a) this).s().size() > 0 && !TextUtils.equals(((a) this).r(), jSONObject.optString(a.C0534a.j0, ""))) {
                    Iterator<String> it2 = ((a) this).s().iterator();
                    while (it2.hasNext()) {
                        com.smartdigimkt.d7.d.c().a(3, l.b(it2.next()));
                    }
                }
                if (TextUtils.isEmpty(((a) this).p()) || ((a) this).q() == null || ((a) this).q().size() <= 0 || TextUtils.equals(((a) this).p(), jSONObject.optString(a.C0534a.k0, ""))) {
                    return;
                }
                Iterator<String> it3 = ((a) this).q().iterator();
                while (it3.hasNext()) {
                    com.smartdigimkt.d7.d.c().a(3, l.b(it3.next()));
                }
            } catch (Throwable unused2) {
            }
        }
    }

    public void b(JSONObject jSONObject) {
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
        this.f36443c = map;
    }

    public void c(JSONObject jSONObject) {
        this.f36442b = jSONObject;
    }

    public JSONObject d() {
        return this.f36442b;
    }

    public boolean e() {
        Map<String, String> map = this.d;
        return map == null || map.size() == 0;
    }

    public Map<String, String> c() {
        return this.f36443c;
    }

    public Map<String, String> b() {
        return this.d;
    }

    public void a(JSONObject jSONObject) {
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
        this.d = map;
    }

    public synchronized Map<String, String> a() {
        try {
            if (this.f36444e == null) {
                HashMap map = new HashMap();
                this.f36444e = map;
                Map<String, String> map2 = this.f36443c;
                if (map2 != null) {
                    map.putAll(map2);
                }
                Map<String, String> map3 = this.d;
                if (map3 != null) {
                    this.f36444e.putAll(map3);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f36444e;
    }
}
