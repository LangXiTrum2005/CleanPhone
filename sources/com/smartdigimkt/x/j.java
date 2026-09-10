package com.smartdigimkt.x;

import android.net.Uri;
import android.text.TextUtils;
import com.p004ironsource.d9;
import com.smartdigimkt.v0.v;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class j extends com.smartdigimkt.f1.k implements Serializable, com.smartdigimkt.w1.a {
    public static final String T = "j";

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final String f39759U = "apk_alt";

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final String f39760V = "disableApkAlt";
    public static final String W = "apk_info";
    public static final String X = "ntbarpt";

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final String f39761Y = "ntbarpasbl";
    public static final String Z = "atat_type";
    public static final String a0 = "akdlui";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f39762b0 = "ttc";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f39763c0 = "ttc_ct";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f39764d0 = "ttc_pe";
    public static final String e0 = "ttc_po";
    public static final String f0 = "adv_id";
    public static final String g0 = "ttc_type";
    public static final String h0 = "ttc_ct2";
    public static final String i0 = "gh_id";
    public static final String j0 = "gh_path";
    public static final String k0 = "bind_id";
    public static final String l0 = "mark";
    public static final String m0 = "isPost";
    private static final long n0 = 1;
    public static final int o0 = 604800;
    public static final int p0 = 1800;
    public static final String q0 = "apk_download_start";
    public static final String r0 = "apk_download_end";
    public static final String s0 = "apk_install";
    public static final String t0 = "loopback";
    public static final String u0 = "domain";
    public static final String v0 = "key";
    public static final String w0 = "value";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private b f39766B;
    private String G;
    private String H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private String f39769I;
    private int K;
    private String L;
    private int M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private Map<String, String> f39771N;
    private String O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private String f39772P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f39773Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private int f39774R;
    private com.smartdigimkt.p.b S;
    private int y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f39775z = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private String f39765A = "";
    private int C = 0;
    private int D = 0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f39767E = 0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private String f39768F = "";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f39770J = false;

    public static d b(JSONObject jSONObject, d dVar) {
        if (jSONObject == null || dVar == null) {
            return null;
        }
        try {
            dVar.a(jSONObject.optBoolean(f39762b0));
            dVar.k(jSONObject.optInt(f39763c0, 604800));
            dVar.m(jSONObject.optString(f0));
            dVar.n(jSONObject.optInt("ttc_type", 3));
            dVar.m(jSONObject.optInt(h0, 1800));
            dVar.s(jSONObject.optString(l0));
            dVar.l(jSONObject.optInt(m0));
            try {
                if (jSONObject.has(t0)) {
                    String strOptString = jSONObject.optString(t0);
                    if (!TextUtils.isEmpty(strOptString)) {
                        dVar.r(strOptString);
                        dVar.a(k(strOptString));
                    }
                }
            } catch (Exception unused) {
            }
            String strOptString2 = jSONObject.optString("gh_id");
            if (!TextUtils.isEmpty(strOptString2)) {
                dVar.p(strOptString2);
                String strOptString3 = jSONObject.optString("gh_path");
                if (!TextUtils.isEmpty(strOptString3)) {
                    dVar.q(com.smartdigimkt.r4.a.b(strOptString3));
                }
                dVar.o(jSONObject.optString("bind_id"));
            }
            dVar.C(jSONObject.optString("cam_html"));
            dVar.x(jSONObject.optString("cam_html"));
            dVar.f(jSONObject.optInt(f39759U, 0));
            dVar.h(jSONObject.optInt(f39760V, 0));
            dVar.a(b.b(jSONObject.optString(W)));
            dVar.i(jSONObject.optInt(f39761Y, 0));
            dVar.j(jSONObject.optInt(X, 0));
            dVar.g(jSONObject.optInt(Z, 0));
            dVar.n(jSONObject.optString(a0, ""));
            return dVar;
        } catch (Exception e2) {
            e2.printStackTrace();
            e2.getLocalizedMessage();
            return dVar;
        }
    }

    public static d c(JSONObject jSONObject, d dVar) {
        if (jSONObject == null || dVar == null) {
            return null;
        }
        try {
            dVar.a(jSONObject.optBoolean(f39762b0));
            dVar.k(jSONObject.optInt(f39763c0, 604800));
            dVar.m(jSONObject.optString(f0));
            dVar.n(jSONObject.optInt("ttc_type", 3));
            dVar.m(jSONObject.optInt(h0, 1800));
            dVar.a(System.currentTimeMillis());
            dVar.P(jSONObject.optString("html_url"));
            dVar.L(jSONObject.optString("end_screen_url"));
            dVar.s(jSONObject.optString(l0));
            dVar.l(jSONObject.optInt(m0));
            try {
                if (jSONObject.has(t0)) {
                    String strOptString = jSONObject.optString(t0);
                    if (!TextUtils.isEmpty(strOptString)) {
                        dVar.r(strOptString);
                        dVar.a(k(strOptString));
                    }
                }
            } catch (Exception unused) {
            }
            String strOptString2 = jSONObject.optString("gh_id");
            if (!TextUtils.isEmpty(strOptString2)) {
                dVar.p(strOptString2);
                String strOptString3 = jSONObject.optString("gh_path");
                if (!TextUtils.isEmpty(strOptString3)) {
                    dVar.q(com.smartdigimkt.r4.a.b(strOptString3));
                }
                dVar.o(jSONObject.optString("bind_id"));
            }
            dVar.f(jSONObject.optInt(f39759U, 0));
            dVar.h(jSONObject.optInt(f39760V, 0));
            dVar.a(b.b(jSONObject.optString(W)));
            dVar.i(jSONObject.optInt(f39761Y, 0));
            dVar.j(jSONObject.optInt(X, 0));
            dVar.g(jSONObject.optInt(Z, 0));
            dVar.n(jSONObject.optString(a0, ""));
            return dVar;
        } catch (Exception e2) {
            e2.printStackTrace();
            e2.getLocalizedMessage();
            return dVar;
        }
    }

    public int A() {
        return this.f39775z;
    }

    public String B() {
        return this.G;
    }

    public String C() {
        return this.H;
    }

    public com.smartdigimkt.p.b D() {
        return this.S;
    }

    public Map<String, String> E() {
        return this.f39771N;
    }

    public String F() {
        return this.O;
    }

    public int G() {
        return this.D;
    }

    public int H() {
        return this.C;
    }

    public int I() {
        return this.K;
    }

    public int J() {
        return this.M;
    }

    public String K() {
        return this.L;
    }

    public int L() {
        return this.f39774R;
    }

    public int M() {
        return this.f39773Q;
    }

    public boolean N() {
        return this.f39770J;
    }

    public void a(b bVar) {
        this.f39766B = bVar;
    }

    public void f(int i2) {
        this.y = i2;
    }

    public void g(int i2) {
        this.f39767E = i2;
    }

    public void h(int i2) {
        this.f39775z = i2;
    }

    public void i(int i2) {
        this.D = i2;
    }

    public void j(int i2) {
        this.C = i2;
    }

    public void k(int i2) {
        this.K = i2;
    }

    public void l(int i2) {
        this.M = i2;
    }

    public void m(int i2) {
        this.f39774R = i2;
    }

    public void n(String str) {
        this.f39768F = str;
    }

    public void o(String str) {
        this.f39769I = str;
    }

    public void p(String str) {
        this.G = str;
    }

    public void q(String str) {
        this.H = str;
    }

    public void r(String str) {
        this.O = str;
    }

    public void s(String str) {
        this.L = str;
    }

    public String u() {
        return this.f39772P;
    }

    public String v() {
        return this.f39768F;
    }

    public int w() {
        return this.y;
    }

    public b x() {
        return this.f39766B;
    }

    public int y() {
        return this.f39767E;
    }

    @Deprecated
    public String z() {
        return this.f39769I;
    }

    public static Map<String, String> k(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                HashMap map = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    map.put("domain", jSONObject.getString("domain"));
                    map.put("key", jSONObject.getString("key"));
                    map.put("value", jSONObject.getString("value"));
                    return map;
                } catch (Throwable unused) {
                    return map;
                }
            }
        } catch (Throwable unused2) {
        }
        return null;
    }

    public void a(Map<String, String> map) {
        this.f39771N = map;
    }

    public String l(String str) {
        Map<String, String> mapE;
        try {
            if (TextUtils.isEmpty(str) || (mapE = E()) == null || mapE.size() <= 0) {
                return str;
            }
            Uri uri = Uri.parse(str);
            String host = uri.getHost();
            String str2 = mapE.get("domain");
            if (TextUtils.isEmpty(host) || !host.contains(str2)) {
                return str;
            }
            String str3 = mapE.get("key");
            String str4 = mapE.get("value");
            if (!str.contains(str3) && TextUtils.isEmpty(uri.getQueryParameter(str3)) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                return str + d9.i.f24749c + str3 + d9.i.f24747b + str4;
            }
            if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                return str;
            }
            return str.replace(str3 + d9.i.f24747b + (TextUtils.isEmpty(uri.getQueryParameter(str3)) ? "" : uri.getQueryParameter(str3)), str3 + d9.i.f24747b + str4);
        } catch (Throwable unused) {
            return str;
        }
    }

    public void m(String str) {
        this.f39772P = str;
    }

    public void n(int i2) {
        this.f39773Q = i2;
    }

    public void a(boolean z2) {
        this.f39770J = z2;
    }

    public void a(com.smartdigimkt.p.b bVar) {
        this.S = bVar;
    }

    public static String a(e eVar, d dVar, String str) {
        if (eVar != null && !TextUtils.isEmpty(str) && dVar != null) {
            try {
                HashMap<String, String> mapZ = eVar.z();
                if (mapZ != null) {
                    mapZ.entrySet().iterator();
                    for (Map.Entry<String, String> entry : mapZ.entrySet()) {
                        String key = entry.getKey();
                        str = str.replaceAll("\\{" + key + "\\}", entry.getValue());
                    }
                }
                HashMap<String, String> mapZ2 = dVar.Z();
                if (mapZ2 != null) {
                    mapZ2.entrySet().iterator();
                    for (Map.Entry<String, String> entry2 : mapZ2.entrySet()) {
                        String key2 = entry2.getKey();
                        str = str.replaceAll("\\{" + key2 + "\\}", entry2.getValue());
                    }
                }
                HashMap<String, String> mapL = eVar.l();
                if (mapL != null) {
                    for (Map.Entry<String, String> entry3 : mapL.entrySet()) {
                        String key3 = entry3.getKey();
                        str = str.replaceAll("\\{" + key3 + "\\}", entry3.getValue());
                    }
                }
                str = str.replaceAll("\\{c\\}", URLEncoder.encode(eVar.b(), "utf-8"));
                Matcher matcher = Pattern.compile("=\\{.*?\\}").matcher(str);
                while (matcher.find()) {
                    str = str.replace(matcher.group(0), d9.i.f24747b);
                }
                return str;
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return str;
    }

    public static JSONObject a(JSONObject jSONObject, d dVar) throws JSONException {
        if (dVar == null) {
            return jSONObject;
        }
        jSONObject.put(f39762b0, dVar.N());
        jSONObject.put(f39763c0, dVar.I());
        jSONObject.put(f0, dVar.u());
        jSONObject.put("ttc_type", dVar.M());
        jSONObject.put(h0, dVar.L());
        jSONObject.put("gh_id", dVar.B());
        jSONObject.put("gh_path", com.smartdigimkt.r4.a.c(dVar.C()));
        jSONObject.put("bind_id", dVar.z());
        jSONObject.put(f39759U, dVar.w());
        jSONObject.put(f39760V, dVar.A());
        if (dVar.x() != null) {
            jSONObject.put(W, dVar.x().l());
        }
        jSONObject.put(l0, dVar.K());
        jSONObject.put(m0, dVar.J());
        jSONObject.put("nv_t2", dVar.t1());
        jSONObject.put(f39761Y, dVar.G());
        jSONObject.put(X, dVar.H());
        jSONObject.put(Z, dVar.y());
        jSONObject.put(a0, dVar.v());
        return jSONObject;
    }

    public boolean a(d dVar) {
        boolean z2 = this.y == 1 && dVar.e1() == 3 && dVar.A() != 1;
        if (z2) {
            try {
                if (v.a(com.smartdigimkt.m6.b.p().k(), n())) {
                    return false;
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return z2;
    }
}
