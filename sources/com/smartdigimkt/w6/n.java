package com.smartdigimkt.w6;

import com.p004ironsource.m5;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class n implements Serializable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    String[] f39568A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    String[] f39569B;
    String[] C;
    String[] D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    String[] f39570E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    String[] f39571F;
    String[] G;
    Map<Integer, String[]> H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    String[] f39572I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    String[] f39573J;
    String K;
    String L;
    String M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    String f39574N;
    String O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    String f39575P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    String f39576Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    String f39577R;
    String S;
    String T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    String f39578U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    String f39579V;
    String W;
    String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    String f39580Y;
    String Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f39581a;
    String a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String[] f39582b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    String f39583b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String[] f39584c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    String f39585c0;
    String[] d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    String f39586d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String[] f39587e;
    String e0;
    String[] f;
    String f0;
    String[] g;
    String g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String[] f39588h;
    String h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    String[] f39589i;
    String i0;
    String[] j;
    String j0;
    String[] k;
    String k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    String[] f39590l;
    String l0;
    String[] m;
    String m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String[] f39591n;
    String n0;
    String[] o;
    String o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    String[] f39592p;
    String p0;
    String[] q;
    String[] q0;
    String[] r;
    String r0;
    String[] s;
    String[] t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    String[] f39593u;
    String[] v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    String[] f39594w;
    String[] x;
    String[] y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    String[] f39595z;

    public static final n a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            n nVar = new n();
            nVar.f39581a = jSONObject.optString("ks");
            nVar.f39582b = com.smartdigimkt.n8.h.a(jSONObject.optJSONArray(m5.f25674A));
            nVar.f39584c = com.smartdigimkt.n8.h.a(jSONObject.optJSONArray(m5.f25678z));
            nVar.d = com.smartdigimkt.n8.h.a(jSONObject.optJSONArray("imp"));
            nVar.f39587e = com.smartdigimkt.n8.h.a(jSONObject.optJSONArray("click"));
            nVar.g = com.smartdigimkt.n8.h.a(jSONObject.optJSONArray("vstart"));
            nVar.f39588h = com.smartdigimkt.n8.h.a(jSONObject.optJSONArray("v25"));
            nVar.f39589i = com.smartdigimkt.n8.h.a(jSONObject.optJSONArray("v50"));
            nVar.j = com.smartdigimkt.n8.h.a(jSONObject.optJSONArray("v75"));
            nVar.k = com.smartdigimkt.n8.h.a(jSONObject.optJSONArray("v100"));
            nVar.f39590l = com.smartdigimkt.n8.h.a(jSONObject.optJSONArray("vpaused"));
            nVar.m = com.smartdigimkt.n8.h.a(jSONObject.optJSONArray("vclick"));
            nVar.f39591n = com.smartdigimkt.n8.h.a(jSONObject.optJSONArray("vmute"));
            nVar.o = com.smartdigimkt.n8.h.a(jSONObject.optJSONArray("vunmute"));
            nVar.f39592p = com.smartdigimkt.n8.h.a(jSONObject.optJSONArray("ec_show"));
            nVar.q = com.smartdigimkt.n8.h.a(jSONObject.optJSONArray("ec_close"));
            nVar.r = com.smartdigimkt.n8.h.a(jSONObject.optJSONArray("apk_dl_star"));
            nVar.s = com.smartdigimkt.n8.h.a(jSONObject.optJSONArray("apk_dl_end"));
            nVar.t = com.smartdigimkt.n8.h.a(jSONObject.optJSONArray(com.smartdigimkt.x.j.s0));
            nVar.f39593u = com.smartdigimkt.n8.h.a(jSONObject.optJSONArray("vresumed"));
            nVar.v = com.smartdigimkt.n8.h.a(jSONObject.optJSONArray("vskip"));
            nVar.f39594w = com.smartdigimkt.n8.h.a(jSONObject.optJSONArray("vfail"));
            nVar.x = com.smartdigimkt.n8.h.a(jSONObject.optJSONArray("apk_start_install"));
            nVar.y = com.smartdigimkt.n8.h.a(jSONObject.optJSONArray("dp_start"));
            nVar.f39595z = com.smartdigimkt.n8.h.a(jSONObject.optJSONArray("dp_succ"));
            nVar.f39568A = com.smartdigimkt.n8.h.a(jSONObject.optJSONArray("app_install"));
            nVar.f39569B = com.smartdigimkt.n8.h.a(jSONObject.optJSONArray("app_uninstall"));
            nVar.C = com.smartdigimkt.n8.h.a(jSONObject.optJSONArray("app_unknow"));
            nVar.f39570E = com.smartdigimkt.n8.h.a(jSONObject.optJSONArray("dp_inst_fail"));
            nVar.D = com.smartdigimkt.n8.h.a(jSONObject.optJSONArray("dp_uninst_fail"));
            nVar.f39571F = com.smartdigimkt.n8.h.a(jSONObject.optJSONArray("vd_succ"));
            nVar.G = com.smartdigimkt.n8.h.a(jSONObject.optJSONArray("vrewarded"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("v_p_tracking");
            if (jSONArrayOptJSONArray != null) {
                nVar.H = new HashMap();
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                    int iOptInt = jSONObjectOptJSONObject.optInt("play_sec");
                    nVar.H.put(Integer.valueOf(iOptInt), com.smartdigimkt.n8.h.a(jSONObjectOptJSONObject.optJSONArray("list")));
                }
            }
            nVar.f39572I = com.smartdigimkt.n8.h.a(jSONObject.optJSONArray("load_success"));
            nVar.f39573J = com.smartdigimkt.n8.h.a(jSONObject.optJSONArray("load_fail"));
            nVar.K = jSONObject.optString("tp_nurl");
            nVar.L = jSONObject.optString("tp_imp");
            nVar.M = jSONObject.optString("tp_click");
            nVar.f39574N = jSONObject.optString("tp_vstart");
            nVar.O = jSONObject.optString("tp_v25");
            nVar.f39575P = jSONObject.optString("tp_v50");
            nVar.f39576Q = jSONObject.optString("tp_v75");
            nVar.f39577R = jSONObject.optString("tp_v100");
            nVar.S = jSONObject.optString("tp_vpaused");
            nVar.T = jSONObject.optString("tp_vclick");
            nVar.f39578U = jSONObject.optString("tp_vmute");
            nVar.f39579V = jSONObject.optString("tp_vunmute");
            nVar.W = jSONObject.optString("tp_ec_show");
            nVar.X = jSONObject.optString("tp_ec_close");
            nVar.f39580Y = jSONObject.optString("tp_apk_dl_star");
            nVar.Z = jSONObject.optString("tp_apk_dl_end");
            nVar.a0 = jSONObject.optString("tp_apk_install");
            nVar.f39583b0 = jSONObject.optString("tp_vresumed");
            nVar.f39585c0 = jSONObject.optString("tp_vskip");
            nVar.f39586d0 = jSONObject.optString("tp_vfail");
            nVar.e0 = jSONObject.optString("tp_apk_start_install");
            nVar.f0 = jSONObject.optString("tp_dp_start");
            nVar.g0 = jSONObject.optString("tp_dp_succ");
            nVar.h0 = jSONObject.optString("tp_app_install");
            nVar.i0 = jSONObject.optString("tp_app_uninstall");
            nVar.j0 = jSONObject.optString("tp_app_unknow");
            nVar.l0 = jSONObject.optString("tp_dp_inst_fail");
            nVar.k0 = jSONObject.optString("tp_dp_uninst_fail");
            nVar.m0 = jSONObject.optString("tp_vd_succ");
            nVar.n0 = jSONObject.optString("tp_vrewarded");
            nVar.o0 = jSONObject.optString("tp_load_success");
            nVar.p0 = jSONObject.optString("tp_load_fail");
            nVar.q0 = com.smartdigimkt.n8.h.a(jSONObject.optJSONArray("vready"));
            nVar.r0 = jSONObject.optString("tp_ready");
            return nVar;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public String A() {
        return this.h0;
    }

    public String B() {
        return this.i0;
    }

    public String C() {
        return this.j0;
    }

    public String D() {
        return this.M;
    }

    public String E() {
        return this.l0;
    }

    public String F() {
        return this.f0;
    }

    public String G() {
        return this.g0;
    }

    public String H() {
        return this.k0;
    }

    public String I() {
        return this.X;
    }

    public String J() {
        return this.W;
    }

    public String K() {
        return this.L;
    }

    public String L() {
        return this.p0;
    }

    public String M() {
        return this.o0;
    }

    public String N() {
        return this.K;
    }

    public String O() {
        return this.n0;
    }

    public String P() {
        return this.T;
    }

    public String Q() {
        return this.m0;
    }

    public String R() {
        return this.f39578U;
    }

    public String S() {
        return this.S;
    }

    public String T() {
        return this.f39586d0;
    }

    public String U() {
        return this.f39577R;
    }

    public String V() {
        return this.O;
    }

    public String W() {
        return this.f39575P;
    }

    public String X() {
        return this.f39576Q;
    }

    public String Y() {
        return this.r0;
    }

    public String Z() {
        return this.f39583b0;
    }

    public String a0() {
        return this.f39585c0;
    }

    public void b(String[] strArr) {
        this.r = strArr;
    }

    public String b0() {
        return this.f39574N;
    }

    public void c(String[] strArr) {
        this.t = strArr;
    }

    public String c0() {
        return this.f39579V;
    }

    public String[] d() {
        return this.t;
    }

    public String[] d0() {
        return this.m;
    }

    public String[] e() {
        return this.x;
    }

    public Map<Integer, String[]> e0() {
        return this.H;
    }

    public String[] f() {
        return this.f39568A;
    }

    public String[] f0() {
        return this.f39571F;
    }

    public String[] g() {
        return this.f39569B;
    }

    public String[] g0() {
        return this.f39591n;
    }

    public void h(String[] strArr) {
        this.f = strArr;
    }

    public String[] h0() {
        return this.f39590l;
    }

    public String[] i() {
        return a(this.f39587e, this.f);
    }

    public String[] i0() {
        return this.f39594w;
    }

    public String[] j() {
        return this.f39570E;
    }

    public String[] j0() {
        return this.k;
    }

    public String[] k() {
        return this.y;
    }

    public String[] k0() {
        return this.f39588h;
    }

    public String[] l() {
        return this.f39595z;
    }

    public String[] l0() {
        return this.f39589i;
    }

    public String[] m() {
        return this.D;
    }

    public String[] m0() {
        return this.j;
    }

    public String[] n() {
        return this.q;
    }

    public String[] n0() {
        return this.q0;
    }

    public String[] o() {
        return this.f39592p;
    }

    public String[] o0() {
        return this.f39593u;
    }

    public String[] p() {
        return this.d;
    }

    public String[] p0() {
        return this.v;
    }

    public String[] q() {
        return this.f39573J;
    }

    public String[] q0() {
        return this.g;
    }

    public String[] r() {
        return this.f39572I;
    }

    public String[] r0() {
        return this.o;
    }

    public String[] s() {
        return this.f39584c;
    }

    public String[] t() {
        return this.f39582b;
    }

    public String u() {
        return this.f39581a;
    }

    public String[] v() {
        return this.G;
    }

    public String w() {
        return this.Z;
    }

    public String x() {
        return this.f39580Y;
    }

    public String y() {
        return this.a0;
    }

    public String z() {
        return this.e0;
    }

    public void A(String[] strArr) {
        this.k = strArr;
    }

    public void B(String[] strArr) {
        this.f39588h = strArr;
    }

    public void C(String[] strArr) {
        this.f39589i = strArr;
    }

    public void D(String[] strArr) {
        this.j = strArr;
    }

    public void E(String[] strArr) {
        this.f39593u = strArr;
    }

    public void F(String[] strArr) {
        this.v = strArr;
    }

    public void G(String[] strArr) {
        this.g = strArr;
    }

    public void H(String[] strArr) {
        this.o = strArr;
    }

    public String[] b() {
        return this.s;
    }

    public String[] c() {
        return this.r;
    }

    public void d(String[] strArr) {
        this.x = strArr;
    }

    public void e(String[] strArr) {
        this.f39568A = strArr;
    }

    public void f(String[] strArr) {
        this.f39569B = strArr;
    }

    public void g(String[] strArr) {
        this.C = strArr;
    }

    public String[] h() {
        return this.C;
    }

    public void i(String[] strArr) {
        this.f39587e = strArr;
    }

    public void j(String[] strArr) {
        this.f39570E = strArr;
    }

    public void k(String[] strArr) {
        this.y = strArr;
    }

    public void l(String[] strArr) {
        this.f39595z = strArr;
    }

    public void m(String[] strArr) {
        this.D = strArr;
    }

    public void n(String[] strArr) {
        this.q = strArr;
    }

    public void o(String[] strArr) {
        this.f39592p = strArr;
    }

    public void p(String[] strArr) {
        this.d = strArr;
    }

    public void q(String[] strArr) {
        this.f39573J = strArr;
    }

    public void r(String[] strArr) {
        this.f39572I = strArr;
    }

    public void s(String[] strArr) {
        this.f39584c = strArr;
    }

    public void t(String[] strArr) {
        this.f39582b = strArr;
    }

    public void u(String[] strArr) {
        this.G = strArr;
    }

    public void v(String[] strArr) {
        this.m = strArr;
    }

    public void w(String[] strArr) {
        this.f39571F = strArr;
    }

    public void x(String[] strArr) {
        this.f39591n = strArr;
    }

    public void y(String[] strArr) {
        this.f39590l = strArr;
    }

    public void z(String[] strArr) {
        this.f39594w = strArr;
    }

    public void a(String[] strArr) {
        this.s = strArr;
    }

    public void a(Map<Integer, String[]> map) {
        this.H = map;
    }

    private String[] a(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr.length == 0) {
            return strArr2;
        }
        if (strArr2 == null || strArr2.length == 0) {
            return strArr;
        }
        String[] strArr3 = new String[strArr.length + strArr2.length];
        System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
        System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
        return strArr3;
    }
}
