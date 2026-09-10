package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3700q2 {
    public static final String A = "nurl";
    public static final String o = "adMarkup";
    public static final String p = "instance";
    public static final String q = "adData";
    public static final String r = "price";
    public static final String s = "serverData";
    public static final String t = "loadTimeout";
    public static final String u = "order";
    public static final String v = "show";
    public static final String w = "price";
    public static final String x = "notifications";
    public static final String y = "burl";
    public static final String z = "lurl";
    private String a;
    private String b;
    private JSONObject c;
    private String d;
    private Integer e;
    private int f;
    private int g;
    private int h;
    private final List<String> i;
    private final List<String> j;
    private final List<String> k;
    private JSONObject l;
    private C3810wb m;
    private boolean n;

    public C3700q2(String str) {
        this.a = null;
        this.b = "";
        this.c = null;
        this.d = "";
        this.e = null;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = null;
        this.m = null;
        this.n = true;
        this.a = str;
    }

    public U8 a(String str) {
        return null;
    }

    public List<String> b() {
        return this.i;
    }

    public String c() {
        return this.a;
    }

    public C3810wb d() {
        return this.m;
    }

    public int e() {
        return this.f;
    }

    public Integer f() {
        return this.e;
    }

    public List<String> g() {
        return this.j;
    }

    public List<String> h() {
        return this.k;
    }

    public String i() {
        return this.d;
    }

    public int j() {
        return this.h;
    }

    public String k() {
        return this.b;
    }

    public int l() {
        return this.g;
    }

    public JSONObject m() {
        return this.l;
    }

    public boolean n() {
        return this.n;
    }

    private void a(JSONObject jSONObject, int i) {
        this.f = i;
        this.g = i;
        this.h = i;
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt(v, i);
            this.g = iOptInt;
            this.h = jSONObject.optInt("price", iOptInt);
        }
    }

    public JSONObject a() {
        return this.c;
    }

    private void a(JSONObject jSONObject, String str, List<String> list) throws JSONException {
        if (jSONObject.has(str)) {
            list.addAll(C3512fa.b(jSONObject.getJSONArray(str)));
        }
    }

    public C3700q2(JSONObject jSONObject) {
        this(jSONObject, -1, null);
    }

    public C3700q2(JSONObject jSONObject, int i, JSONObject jSONObject2) {
        this.a = null;
        this.b = "";
        this.c = null;
        this.d = "";
        this.e = null;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.j = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.k = arrayList3;
        this.l = null;
        this.m = null;
        this.n = true;
        try {
            if (jSONObject.has(p)) {
                this.a = jSONObject.getString(p);
            }
            if (jSONObject.has("adMarkup")) {
                this.b = jSONObject.getString("adMarkup");
            } else if (jSONObject.has(s)) {
                this.b = jSONObject.getJSONObject(s).toString();
            }
            this.c = jSONObject.optJSONObject("adData");
            this.d = jSONObject.optString("price", "0");
            if (jSONObject.has(x)) {
                JSONObject jSONObject3 = jSONObject.getJSONObject(x);
                a(jSONObject3, y, arrayList);
                a(jSONObject3, z, arrayList2);
                a(jSONObject3, A, arrayList3);
            }
            this.l = C3512fa.a(jSONObject2, jSONObject.optJSONObject(com.ironsource.mediationsdk.d.d));
            this.m = jSONObject.has(com.ironsource.mediationsdk.d.e) ? C3810wb.a(jSONObject.getJSONObject(com.ironsource.mediationsdk.d.e)) : null;
            this.e = jSONObject.has(t) ? Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(jSONObject.getLong(t))) : null;
            a(jSONObject.optJSONObject(u), i);
        } catch (Exception e) {
            C3631m4.d().a(e);
            this.n = false;
            IronLog.INTERNAL.error("exception " + e.getMessage());
        }
    }
}
