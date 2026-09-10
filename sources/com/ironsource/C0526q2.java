package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.q2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0526q2 {
    public static final String A = "nurl";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f30049o = "adMarkup";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f30050p = "instance";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f30051q = "adData";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f30052r = "price";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f30053s = "serverData";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f30054t = "loadTimeout";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f30055u = "order";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f30056v = "show";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f30057w = "price";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f30058x = "notifications";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f30059y = "burl";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f30060z = "lurl";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f30061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f30063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f30064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f30065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f30066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f30067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f30068h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<String> f30069i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<String> f30070j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<String> f30071k;
    private JSONObject l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Ab f30072m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f30073n;

    public C0526q2(String str) {
        this.f30061a = null;
        this.f30062b = "";
        this.f30063c = null;
        this.f30064d = "";
        this.f30065e = null;
        this.f30066f = -1;
        this.f30067g = -1;
        this.f30068h = -1;
        this.f30069i = new ArrayList();
        this.f30070j = new ArrayList();
        this.f30071k = new ArrayList();
        this.l = null;
        this.f30072m = null;
        this.f30073n = true;
        this.f30061a = str;
    }

    public W8 a(String str) {
        return null;
    }

    public List<String> b() {
        return this.f30069i;
    }

    public String c() {
        return this.f30061a;
    }

    public Ab d() {
        return this.f30072m;
    }

    public int e() {
        return this.f30066f;
    }

    public Integer f() {
        return this.f30065e;
    }

    public List<String> g() {
        return this.f30070j;
    }

    public List<String> h() {
        return this.f30071k;
    }

    public String i() {
        return this.f30064d;
    }

    public int j() {
        return this.f30068h;
    }

    public String k() {
        return this.f30062b;
    }

    public int l() {
        return this.f30067g;
    }

    public JSONObject m() {
        return this.l;
    }

    public boolean n() {
        return this.f30073n;
    }

    private void a(JSONObject jSONObject, int i10) {
        this.f30066f = i10;
        this.f30067g = i10;
        this.f30068h = i10;
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt("show", i10);
            this.f30067g = iOptInt;
            this.f30068h = jSONObject.optInt("price", iOptInt);
        }
    }

    public JSONObject a() {
        return this.f30063c;
    }

    private void a(JSONObject jSONObject, String str, List<String> list) throws JSONException {
        if (jSONObject.has(str)) {
            list.addAll(C0391ia.b(jSONObject.getJSONArray(str)));
        }
    }

    public C0526q2(JSONObject jSONObject) {
        this(jSONObject, -1, null);
    }

    public C0526q2(JSONObject jSONObject, int i10, JSONObject jSONObject2) {
        this.f30061a = null;
        this.f30062b = "";
        this.f30063c = null;
        this.f30064d = "";
        this.f30065e = null;
        this.f30066f = -1;
        this.f30067g = -1;
        this.f30068h = -1;
        ArrayList arrayList = new ArrayList();
        this.f30069i = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f30070j = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f30071k = arrayList3;
        this.l = null;
        this.f30072m = null;
        this.f30073n = true;
        try {
            if (jSONObject.has(f30050p)) {
                this.f30061a = jSONObject.getString(f30050p);
            }
            if (jSONObject.has("adMarkup")) {
                this.f30062b = jSONObject.getString("adMarkup");
            } else if (jSONObject.has(f30053s)) {
                this.f30062b = jSONObject.getJSONObject(f30053s).toString();
            }
            this.f30063c = jSONObject.optJSONObject("adData");
            this.f30064d = jSONObject.optString("price", "0");
            if (jSONObject.has(f30058x)) {
                JSONObject jSONObject3 = jSONObject.getJSONObject(f30058x);
                a(jSONObject3, f30059y, arrayList);
                a(jSONObject3, f30060z, arrayList2);
                a(jSONObject3, A, arrayList3);
            }
            this.l = C0391ia.a(jSONObject2, jSONObject.optJSONObject(com.ironsource.mediationsdk.d.f29333d));
            this.f30072m = jSONObject.has(com.ironsource.mediationsdk.d.f29334e) ? Ab.a(jSONObject.getJSONObject(com.ironsource.mediationsdk.d.f29334e)) : null;
            this.f30065e = jSONObject.has(f30054t) ? Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(jSONObject.getLong(f30054t))) : null;
            a(jSONObject.optJSONObject(f30055u), i10);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            this.f30073n = false;
            IronLog.INTERNAL.error("exception " + e10.getMessage());
        }
    }
}
