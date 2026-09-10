package com.smartdigimkt.n1;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.smartdigimkt.v0.i;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.v0.y;
import com.smartdigimkt.x.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f36916A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private String f36917B;
    private long C;
    private int D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private long f36918E;
    private int E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private long f36919F;
    private int G;
    private long G0;
    private int H;
    private long H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f36920I;
    private int I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private String f36921J;
    private int J0;
    private String K;
    private long K0;
    private int L;
    private List<d> M;
    private int M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private List<com.smartdigimkt.x.c> f36922N;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private int f36925R;
    private LinkedList<String> S;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private int f36928Y;
    private List<String> Z;
    private int a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f36930b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f36931b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f36932c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f36933c0;
    private int d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f36934d0;
    private String e0;
    private Map<String, C0548a> e1;
    private int f;
    private String f0;
    private boolean g;
    private b g1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map<String, String> f36936h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f36937i;
    private long j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List<c> f36938l;
    private String l1;
    private boolean m;
    private String m1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f36939n;
    private long o;
    private String o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f36940p;
    private boolean q;
    private int r;
    private int s;
    private int t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f36941u;
    private List<String> v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f36942w;
    private int x;
    private int y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f36943z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36929a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f36935e = 86400;
    private String k = "";
    private boolean O = false;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private int f36923P = 3;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f36924Q = true;
    private int T = 0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f36926U = com.smartdigimkt.o1.b.l2;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private int f36927V = 10;
    private int W = 120;
    private String X = "";
    private int g0 = 1;
    private int h0 = 1;
    private int i0 = 1;
    private int j0 = 0;
    private int k0 = 1;
    private String l0 = "";
    private int m0 = 0;
    private int n0 = 2;
    private int p0 = 86400;
    private String q0 = "LdxThdi1WBK\\/WgfPhbxQYkeXHBPwHZKAJ7eXHM==";
    private String r0 = "LdxThdi1WBK\\/WgfPhbxQYkeXHBPwHZKsYFh=";
    private int s0 = 1;
    private int t0 = 30;
    private int u0 = 5;
    private int v0 = 0;
    private int w0 = 0;
    private int x0 = 9377;
    private int y0 = 0;
    private int z0 = 0;
    private int A0 = 0;
    private int B0 = 2;
    private int C0 = 10;
    private List<Integer> D0 = new ArrayList();
    private int F0 = 1;
    private int L0 = 3;
    private String N0 = "";
    private String O0 = "";
    private String P0 = "";
    private String Q0 = "";
    private String R0 = "";
    private int S0 = 0;
    private int T0 = 21600;
    private int U0 = 2;
    private int V0 = 0;
    private int W0 = 0;
    private int X0 = 604800;
    private int Y0 = 0;
    private String Z0 = "";
    private String a1 = "";
    private String b1 = "";
    private String c1 = "";
    private String d1 = "";
    private int f1 = 0;
    private int h1 = 0;
    private String i1 = "";
    private int j1 = 2;
    private int k1 = 7200;
    private int n1 = 0;
    private boolean o1 = false;
    private int p1 = 1;
    private int q1 = 0;
    private int r1 = 0;
    private int s1 = 0;
    private int t1 = 3;
    private int u1 = 600;
    private int v1 = 10;

    /* JADX INFO: renamed from: com.smartdigimkt.n1.a$a, reason: collision with other inner class name */
    public static class C0548a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<String> f36944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<String> f36945b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<String> f36946c;
        private List<String> d;

        public List<String> a() {
            return this.d;
        }

        public List<String> b() {
            return this.f36946c;
        }

        public List<String> c() {
            return this.f36944a;
        }

        public List<String> d() {
            return this.f36945b;
        }

        public void a(List<String> list) {
            this.d = list;
        }

        public void b(List<String> list) {
            this.f36946c = list;
        }

        public void c(List<String> list) {
            this.f36944a = list;
        }

        public void d(List<String> list) {
            this.f36945b = list;
        }

        public void a(JSONObject jSONObject) {
            try {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("x");
                if (jSONArrayOptJSONArray != null) {
                    this.f36944a = i.a(jSONArrayOptJSONArray);
                }
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("y");
                if (jSONArrayOptJSONArray2 != null) {
                    this.f36945b = i.a(jSONArrayOptJSONArray2);
                }
                JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("width");
                if (jSONArrayOptJSONArray3 != null) {
                    this.f36946c = i.a(jSONArrayOptJSONArray3);
                }
                JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("height");
                if (jSONArrayOptJSONArray4 != null) {
                    this.d = i.a(jSONArrayOptJSONArray4);
                }
            } catch (Exception e2) {
                if (com.smartdigimkt.b.b.f33800a) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f36947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f36948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f36949c;
        private JSONArray d;

        public static b a(JSONObject jSONObject) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            b bVar = new b();
            Context contextK = com.smartdigimkt.m6.b.p().k();
            bVar.f36947a = jSONObject.optString("title", contextK.getString(k.a(contextK, "sdm_cm_feedback_dialog_title", k.f38992h)));
            bVar.f36948b = jSONObject.optString(com.smartdigimkt.o1.b.P3, contextK.getString(k.a(contextK, "sdm_cm_feedback_dialog_close_close", k.f38992h)));
            bVar.f36949c = jSONObject.optString(com.smartdigimkt.o1.b.Q3, contextK.getString(k.a(contextK, "sdm_cm_feedback_dialog_close_submit", k.f38992h)));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("content");
            bVar.d = jSONArrayOptJSONArray;
            if (jSONArrayOptJSONArray == null) {
                JSONArray jSONArray = new JSONArray();
                bVar.d = jSONArray;
                jSONArray.put(contextK.getString(k.a(contextK, "sdm_cm_feedback_dialog_content_stuck", k.f38992h)));
                bVar.d.put(contextK.getString(k.a(contextK, "sdm_cm_feedback_dialog_content_cnr", k.f38992h)));
                bVar.d.put(contextK.getString(k.a(contextK, "sdm_cm_feedback_dialog_content_balck_screen", k.f38992h)));
                bVar.d.put(contextK.getString(k.a(contextK, "sdm_cm_feedback_dialog_content_other", k.f38992h)));
            }
            return bVar;
        }

        public void b(String str) {
            this.f36949c = str;
        }

        public void c(String str) {
            this.f36947a = str;
        }

        public String d() {
            return this.f36947a;
        }

        public JSONArray b() {
            return this.d;
        }

        public String c() {
            return this.f36949c;
        }

        public String a() {
            return this.f36948b;
        }

        public void a(String str) {
            this.f36948b = str;
        }

        public void a(JSONArray jSONArray) {
            this.d = jSONArray;
        }
    }

    public void A(int i2) {
        this.p0 = i2;
    }

    public int A0() {
        return this.s;
    }

    public String B() {
        return this.O0;
    }

    public String B0() {
        return this.e0;
    }

    public String C() {
        return this.P0;
    }

    public String C0() {
        return this.d1;
    }

    public String D() {
        return this.N0;
    }

    public String D0() {
        return this.c1;
    }

    public String E() {
        return this.q0;
    }

    public int E0() {
        return this.G;
    }

    public String F() {
        return this.k;
    }

    public long F0() {
        return this.f36939n;
    }

    public long G() {
        return this.j;
    }

    public long G0() {
        if (this.f36941u <= 0) {
            this.f36941u = com.smartdigimkt.o1.b.f37308Q;
        }
        return this.f36941u;
    }

    public void H(int i2) {
        if (i2 > 0) {
            this.C0 = i2;
        }
    }

    public int H0() {
        return this.a0;
    }

    public void I(int i2) {
        this.f36925R = i2;
    }

    public int I0() {
        return this.Y0;
    }

    public void J(int i2) {
        this.W = i2;
    }

    public String J0() {
        return this.f0;
    }

    public void K(int i2) {
        this.f36927V = i2;
    }

    public int K0() {
        return this.f36923P;
    }

    public void L(int i2) {
        this.t = i2;
    }

    public int L0() {
        return this.s1;
    }

    public void M(int i2) {
        this.S0 = i2;
    }

    public int M0() {
        return this.t1;
    }

    public long N() {
        return this.f36935e;
    }

    public int N0() {
        return this.r1;
    }

    public int O() {
        return this.f36920I;
    }

    public int O0() {
        return this.v1;
    }

    public int P() {
        return this.F0;
    }

    public int P0() {
        return this.u1;
    }

    public int Q() {
        return this.s0;
    }

    public int Q0() {
        return this.V0;
    }

    public void R(int i2) {
        this.L0 = i2;
    }

    public int R0() {
        return this.j0;
    }

    public int S() {
        return this.L;
    }

    public long S0() {
        return this.K0;
    }

    public int T() {
        return this.m0;
    }

    public String T0() {
        return this.f36917B;
    }

    public void U(int i2) {
        this.f36931b0 = i2;
    }

    public long U0() {
        return this.C * 1000;
    }

    public String V() {
        return this.o0;
    }

    public long V0() {
        return this.H0 * 1000;
    }

    public int W() {
        return this.n0;
    }

    public int W0() {
        return this.X0;
    }

    public int X() {
        return this.p0;
    }

    public long X0() {
        return this.f36940p;
    }

    public void Y(int i2) {
        this.G = i2;
    }

    public List<c> Y0() {
        return this.f36938l;
    }

    public void Z(int i2) {
        this.a0 = i2;
    }

    public int Z0() {
        return this.k0;
    }

    public void a(LinkedList<String> linkedList) {
        this.S = linkedList;
    }

    public void a0(int i2) {
        this.Y0 = i2;
    }

    public String a1() {
        return this.l0;
    }

    public String b() {
        return this.X;
    }

    public int b0() {
        return this.v0;
    }

    public int b1() {
        return this.J0;
    }

    public void c(String str) {
        this.X = str;
    }

    public int c0() {
        return this.u0;
    }

    public long c1() {
        return this.f36932c;
    }

    public void d(long j) {
        this.f36935e = j;
    }

    public int d0() {
        return this.w0;
    }

    public int d1() {
        return this.i0;
    }

    public void e(int i2) {
        this.A0 = i2;
    }

    public int e0() {
        return this.W0;
    }

    public int e1() {
        return this.h0;
    }

    public void f(int i2) {
        this.y0 = i2;
    }

    public int f0() {
        return this.C0;
    }

    public int f1() {
        return this.f;
    }

    public void g(int i2) {
        this.B0 = i2;
    }

    public int g0() {
        return this.f36925R;
    }

    public int g1() {
        return this.I0;
    }

    public void h(int i2) {
        this.z0 = i2;
    }

    public int h0() {
        return this.W;
    }

    public int h1() {
        return this.g0;
    }

    public void i(String str) {
        this.r0 = str;
    }

    public int i0() {
        return this.f36927V;
    }

    public int i1() {
        return this.U0;
    }

    public void j(long j) {
        this.H0 = j;
    }

    public void j0(int i2) {
        this.X0 = i2;
    }

    public String j1() {
        return this.l1;
    }

    public void k(int i2) {
        this.f36929a = i2;
    }

    public void k0(int i2) {
        this.k0 = i2;
    }

    public int k1() {
        return this.y;
    }

    public int l() {
        return this.M0;
    }

    public int l0() {
        return this.t;
    }

    public int l1() {
        return this.f36943z;
    }

    public void m(int i2) {
        this.T = i2;
    }

    public void m0(int i2) {
        this.i0 = i2;
    }

    public int m1() {
        return this.p1;
    }

    public void n(int i2) {
        this.f36926U = i2;
    }

    public void n0(int i2) {
        this.h0 = i2;
    }

    public boolean n1() {
        return this.g;
    }

    public List<com.smartdigimkt.x.c> o() {
        return this.f36922N;
    }

    public void o0(int i2) {
        this.f = i2;
    }

    public boolean o1() {
        return this.f36924Q;
    }

    public int p() {
        return this.f36929a;
    }

    public int p0() {
        return this.f36916A;
    }

    public boolean p1() {
        return this.f36937i;
    }

    public void q(String str) {
        this.o0 = str;
    }

    public void q0(int i2) {
        this.g0 = i2;
    }

    public boolean q1() {
        return this.o1;
    }

    public List<d> r() {
        return this.M;
    }

    public long r0() {
        return this.f36919F;
    }

    public boolean r1() {
        return (TextUtils.isEmpty(this.N0) || TextUtils.isEmpty(this.O0) || TextUtils.isEmpty(this.P0) || TextUtils.isEmpty(this.R0)) ? false : true;
    }

    public void s(String str) {
        this.K = str;
    }

    public int s0() {
        return this.x;
    }

    public boolean s1() {
        return (TextUtils.isEmpty(this.N0) || TextUtils.isEmpty(this.O0) || TextUtils.isEmpty(this.P0) || TextUtils.isEmpty(this.Q0)) ? false : true;
    }

    public String t() {
        return this.r0;
    }

    public void t0(int i2) {
        this.f36943z = i2;
    }

    public boolean t1() {
        return this.O;
    }

    public String toString() {
        return "cc=" + this.f36930b + " upal=" + this.f36932c + " cfc=" + this.d + " getpf=" + this.f36935e + " uplc=" + this.f + " rurl=" + this.m;
    }

    public void u(int i2) {
        this.s0 = i2;
    }

    public int u0() {
        return this.L0;
    }

    public boolean u1() {
        return this.m;
    }

    public int v() {
        return this.d;
    }

    public int v0() {
        return this.f36933c0;
    }

    public boolean v1() {
        return this.q;
    }

    public LinkedList<String> w() {
        return this.S;
    }

    public int w0() {
        return this.f36934d0;
    }

    public boolean w1() {
        return (TextUtils.isEmpty(this.Z0) || TextUtils.isEmpty(this.b1) || TextUtils.isEmpty(this.a1)) ? false : true;
    }

    public int x() {
        return this.T;
    }

    public int x0() {
        return this.f36931b0;
    }

    public String x1() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.smartdigimkt.o1.b.f37320h, this.f36930b);
            jSONObject.put(com.smartdigimkt.o1.b.f37322l, this.f36932c);
            jSONObject.put(com.smartdigimkt.o1.b.m, this.d);
            jSONObject.put(com.smartdigimkt.o1.b.f37324p, this.f);
            jSONObject.put(com.smartdigimkt.o1.b.f37326w, this.g);
            jSONObject.put(com.smartdigimkt.o1.b.o, this.f36937i);
            jSONObject.put("plct", this.f36939n);
            jSONObject.put(com.smartdigimkt.o1.b.f37301B, this.o);
            jSONObject.put(com.smartdigimkt.o1.b.C, this.m);
            jSONObject.put(com.smartdigimkt.o1.b.G, this.q);
            jSONObject.put("plctb", this.f36941u);
            jSONObject.put(com.smartdigimkt.o1.b.f37315b0, this.G0);
            jSONObject.put(com.smartdigimkt.o1.b.f37317c0, this.H0);
            jSONObject.put(com.smartdigimkt.o1.b.f0, this.y);
            jSONObject.put(com.smartdigimkt.o1.b.g0, this.f36943z);
            jSONObject.put(com.smartdigimkt.o1.b.f37321i, this.f36921J);
            jSONObject.put(com.smartdigimkt.o1.b.j, this.K);
            jSONObject.put(com.smartdigimkt.o1.b.k, this.L);
            jSONObject.put(com.smartdigimkt.o1.b.i0, this.K0);
            jSONObject.put(com.smartdigimkt.o1.b.a0, this.x);
            jSONObject.put(com.smartdigimkt.o1.b.G0, this.f36919F);
            jSONObject.put(com.smartdigimkt.o1.b.E0, this.D);
            jSONObject.put(com.smartdigimkt.o1.b.F0, this.f36918E);
            jSONObject.put(com.smartdigimkt.o1.b.e0, this.J0);
            jSONObject.put(com.smartdigimkt.o1.b.o1, this.L0);
            jSONObject.put(com.smartdigimkt.o1.b.w1, this.F0);
            jSONObject.put("iex", this.f36920I);
            jSONObject.put(com.smartdigimkt.o1.b.o0, this.G);
            jSONObject.put(com.smartdigimkt.o1.b.p0, this.H);
            jSONObject.put(com.smartdigimkt.o1.b.t0, this.M0);
            jSONObject.put(com.smartdigimkt.o1.b.l0, this.E0);
            jSONObject.put("pf", this.f36928Y);
            jSONObject.put(com.smartdigimkt.o1.b.A0, this.a0);
            jSONObject.put(com.smartdigimkt.o1.b.B0, this.e0);
            jSONObject.put(com.smartdigimkt.o1.b.x0, this.f36931b0);
            jSONObject.put(com.smartdigimkt.o1.b.y0, this.f36933c0);
            jSONObject.put(com.smartdigimkt.o1.b.z0, this.f36934d0);
            jSONObject.put(com.smartdigimkt.o1.b.f37318d0, this.I0);
            jSONObject.put(com.smartdigimkt.o1.b.F1, this.h0);
            jSONObject.put(com.smartdigimkt.o1.b.G1, this.g0);
            jSONObject.put(com.smartdigimkt.o1.b.H1, this.i0);
            jSONObject.put(com.smartdigimkt.o1.b.I1, this.j0);
            jSONObject.put(com.smartdigimkt.o1.b.J1, this.k0);
            jSONObject.put(com.smartdigimkt.o1.b.L1, this.m0);
            jSONObject.put(com.smartdigimkt.o1.b.K1, this.l0);
            jSONObject.put(com.smartdigimkt.o1.b.W1, this.n0);
            jSONObject.put(com.smartdigimkt.o1.b.Z1, this.p0);
            jSONObject.put(com.smartdigimkt.o1.b.P2, this.f36929a);
            jSONObject.put(com.smartdigimkt.o1.b.U2, this.i1);
            jSONObject.put(com.smartdigimkt.o1.b.j3, this.W);
            jSONObject.put(com.smartdigimkt.o1.b.h3, this.f36927V);
            jSONObject.put(com.smartdigimkt.o1.b.x3, this.o1);
            jSONObject.put(com.smartdigimkt.o1.b.u3, this.n1);
            jSONObject.put("isDefault", this.q1);
            return jSONObject.toString();
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public int y() {
        return this.f36926U * 1000;
    }

    public int y0() {
        return this.r;
    }

    public void y1() {
        Locale.getDefault().getLanguage();
        if (!s1()) {
            this.N0 = "Confirm to close? ";
            this.O0 = "You will not be rewarded after closing the window";
            this.P0 = "Close it";
            this.Q0 = "Continue";
        }
        if (r1()) {
            return;
        }
        this.N0 = "Confirm to close? ";
        this.O0 = "You will not be rewarded after closing the window";
        this.P0 = "Close it";
        this.R0 = "Continue";
    }

    public void z(int i2) {
        this.n0 = i2;
    }

    public int z0() {
        return this.f36928Y;
    }

    public String A() {
        return this.Q0;
    }

    public void B(int i2) {
        this.t0 = i2;
    }

    public void C(int i2) {
        this.x0 = i2;
    }

    public void D(int i2) {
        this.v0 = i2;
    }

    public void E(int i2) {
        this.u0 = i2;
    }

    public void F(int i2) {
        this.w0 = i2;
    }

    public void G(int i2) {
        this.W0 = i2;
    }

    public int H() {
        return this.E0;
    }

    public int I() {
        return this.D;
    }

    public long J() {
        return this.f36918E;
    }

    public int K() {
        return this.H;
    }

    public b L() {
        return this.g1;
    }

    public int M() {
        return this.f1;
    }

    public void N(int i2) {
        this.T0 = i2;
    }

    public void O(int i2) {
        this.f36916A = i2;
    }

    public void P(int i2) {
        this.f36919F = i2;
    }

    public void Q(int i2) {
        this.x = i2;
    }

    public int R() {
        return this.q1;
    }

    public void S(int i2) {
        this.f36933c0 = i2;
    }

    public void T(int i2) {
        this.f36934d0 = i2;
    }

    public int U() {
        return this.h1;
    }

    public void V(int i2) {
        this.r = i2;
    }

    public void W(int i2) {
        this.f36928Y = i2;
    }

    public void X(int i2) {
        this.s = i2;
    }

    public Map<String, String> Y() {
        return this.f36936h;
    }

    public int Z() {
        return this.t0;
    }

    public void a(List<com.smartdigimkt.x.c> list) {
        this.f36922N = list;
    }

    public int a0() {
        return this.x0;
    }

    public boolean b(int i2) {
        return this.D0.contains(Integer.valueOf(i2));
    }

    public void b0(int i2) {
        this.f36923P = i2;
    }

    public void c(List<String> list) {
        this.Z = list;
    }

    public void c0(int i2) {
        this.s1 = i2;
    }

    public void d(List<c> list) {
        this.f36938l = list;
    }

    public void d0(int i2) {
        this.t1 = i2;
    }

    public int e() {
        return this.A0;
    }

    public void e0(int i2) {
        this.r1 = i2;
    }

    public int f() {
        return this.y0;
    }

    public void f0(int i2) {
        this.v1 = i2;
    }

    public int g() {
        return this.B0;
    }

    public void g0(int i2) {
        this.u1 = i2;
    }

    public int h() {
        return this.z0;
    }

    public void h0(int i2) {
        this.V0 = i2;
    }

    public void i(long j) {
        this.C = j;
    }

    public void i0(int i2) {
        this.j0 = i2;
    }

    public void j(String str) {
        this.R0 = str;
    }

    public String j0() {
        return this.m1;
    }

    public void k(long j) {
        this.f36940p = j;
    }

    public String k0() {
        return this.K;
    }

    public void l(long j) {
        this.f36932c = j;
    }

    public void l0(int i2) {
        this.J0 = i2;
    }

    public void m(String str) {
        this.P0 = str;
    }

    public int m0() {
        return this.S0;
    }

    public String n() {
        return this.f36921J;
    }

    public int n0() {
        return this.T0;
    }

    public void o(String str) {
        this.q0 = str;
    }

    public String o0() {
        return this.i1;
    }

    public void p(int i2) {
        this.D = i2;
    }

    public void p0(int i2) {
        this.I0 = i2;
    }

    public void q(int i2) {
        this.H = i2;
    }

    public List<String> q0() {
        return this.Z;
    }

    public void r(int i2) {
        this.f1 = i2;
    }

    public void r0(int i2) {
        this.U0 = i2;
    }

    public void s(int i2) {
        this.f36920I = i2;
    }

    public void s0(int i2) {
        this.y = i2;
    }

    public void t(int i2) {
        this.F0 = i2;
    }

    public long t0() {
        return this.G0 * 1000;
    }

    public void u(String str) {
        this.e0 = str;
    }

    public void u0(int i2) {
        this.p1 = i2;
    }

    public void v(String str) {
        this.d1 = str;
    }

    public void w(int i2) {
        this.L = i2;
    }

    public void x(int i2) {
        this.m0 = i2;
    }

    public void y(String str) {
        this.f36917B = str;
    }

    public void z(String str) {
        this.l0 = str;
    }

    public void A(String str) {
        this.l1 = str;
    }

    public void a(int i2) {
        this.D0.add(Integer.valueOf(i2));
    }

    public void b(List<d> list) {
        this.M = list;
    }

    public void c(long j) {
        this.f36918E = j;
    }

    public void d(String str) {
        this.Z0 = str;
    }

    public void e(long j) {
        this.G0 = j;
    }

    public void f(boolean z2) {
        this.m = z2;
    }

    public void g(String str) {
        this.f36921J = str;
    }

    public void h(long j) {
        this.K0 = j;
    }

    public void i(int i2) {
        this.M0 = i2;
    }

    public String j() {
        return this.b1;
    }

    public void k(String str) {
        this.Q0 = str;
    }

    public void l(int i2) {
        this.d = i2;
    }

    public int m() {
        return this.n1;
    }

    public void n(String str) {
        this.N0 = str;
    }

    public void o(int i2) {
        this.E0 = i2;
    }

    public void p(String str) {
        this.k = str;
    }

    public long q() {
        return this.o;
    }

    public void r(String str) {
        this.m1 = str;
    }

    public String s() {
        return this.f36930b;
    }

    public void t(String str) {
        this.i1 = str;
    }

    public Map<String, C0548a> u() {
        return this.e1;
    }

    public void v(int i2) {
        this.q1 = i2;
    }

    public void w(String str) {
        this.c1 = str;
    }

    public void x(String str) {
        this.f0 = str;
    }

    public void y(int i2) {
        this.h1 = i2;
    }

    public String z() {
        return this.R0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [com.smartdigimkt.n1.a] */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.smartdigimkt.n1.a] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    public static a b(String str) {
        ArrayList arrayList;
        d dVarC;
        ?? r4 = 0;
        arrayList = null;
        ArrayList arrayList2 = null;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            ?? aVar = new a();
            try {
                aVar.h(jSONObject.optString(com.smartdigimkt.o1.b.f37320h));
                aVar.s(jSONObject.optString(com.smartdigimkt.o1.b.j, com.smartdigimkt.n1.b.f36952c));
                aVar.l(jSONObject.optLong(com.smartdigimkt.o1.b.f37322l));
                aVar.l(jSONObject.optInt(com.smartdigimkt.o1.b.m));
                aVar.d(jSONObject.optLong("getpf"));
                aVar.o0(jSONObject.optInt(com.smartdigimkt.o1.b.f37324p));
                aVar.a(jSONObject.optBoolean(com.smartdigimkt.o1.b.f37326w));
                aVar.b(jSONObject.optLong("current_time"));
                aVar.c(jSONObject.optBoolean(com.smartdigimkt.o1.b.o));
                aVar.a(jSONObject.optLong(com.smartdigimkt.o1.b.f37301B));
                aVar.f(jSONObject.optLong("plct") == 0 ? com.smartdigimkt.o1.b.f37307P : jSONObject.optLong("plct"));
                aVar.f(jSONObject.optBoolean(com.smartdigimkt.o1.b.C));
                aVar.k(jSONObject.optLong(com.smartdigimkt.o1.b.f37303F));
                aVar.g(jSONObject.optBoolean(com.smartdigimkt.o1.b.G));
                aVar.V(jSONObject.optInt(com.smartdigimkt.o1.b.X));
                aVar.X(jSONObject.optInt(com.smartdigimkt.o1.b.f37312Y));
                aVar.w(jSONObject.optInt(com.smartdigimkt.o1.b.k));
                aVar.L(jSONObject.optInt(com.smartdigimkt.o1.b.Z, 1800));
                aVar.Q(jSONObject.optInt(com.smartdigimkt.o1.b.a0));
                aVar.g(jSONObject.optLong("plctb") == 0 ? com.smartdigimkt.o1.b.f37308Q : jSONObject.optLong("plctb"));
                aVar.p0(jSONObject.optInt(com.smartdigimkt.o1.b.f37318d0));
                aVar.l0(jSONObject.optInt(com.smartdigimkt.o1.b.e0));
                aVar.Q(jSONObject.optInt(com.smartdigimkt.o1.b.a0, 100));
                aVar.s0(jSONObject.optInt(com.smartdigimkt.o1.b.f0, 2));
                aVar.t0(jSONObject.optInt(com.smartdigimkt.o1.b.g0, 2));
                boolean z2 = true;
                aVar.O(jSONObject.optInt(com.smartdigimkt.o1.b.h0, 1));
                aVar.h(jSONObject.optLong(com.smartdigimkt.o1.b.i0, com.smartdigimkt.o1.b.C0));
                aVar.y(jSONObject.optString(com.smartdigimkt.o1.b.j0));
                aVar.i(jSONObject.optLong(com.smartdigimkt.o1.b.k0, com.smartdigimkt.o1.b.D0));
                aVar.p(jSONObject.optInt(com.smartdigimkt.o1.b.E0, 1));
                aVar.c(jSONObject.optInt(com.smartdigimkt.o1.b.F0, 604800));
                aVar.P(jSONObject.optInt(com.smartdigimkt.o1.b.G0, com.smartdigimkt.o1.b.K0));
                aVar.R(jSONObject.optInt(com.smartdigimkt.o1.b.o1, 3));
                aVar.t(jSONObject.optInt(com.smartdigimkt.o1.b.w1, 1));
                aVar.x(jSONObject.optString(com.smartdigimkt.o1.b.H0, ""));
                aVar.o(jSONObject.optInt(com.smartdigimkt.o1.b.l0, 1));
                aVar.n0(jSONObject.optInt(com.smartdigimkt.o1.b.F1, 1));
                aVar.q0(jSONObject.optInt(com.smartdigimkt.o1.b.G1, 1));
                aVar.m0(jSONObject.optInt(com.smartdigimkt.o1.b.H1, 1));
                int i2 = 0;
                aVar.i0(jSONObject.optInt(com.smartdigimkt.o1.b.I1, 0));
                aVar.k0(jSONObject.optInt(com.smartdigimkt.o1.b.J1, 1));
                aVar.x(jSONObject.optInt(com.smartdigimkt.o1.b.L1, -1));
                aVar.z(jSONObject.optInt(com.smartdigimkt.o1.b.W1, 2));
                aVar.A(jSONObject.optInt(com.smartdigimkt.o1.b.Z1, 86400));
                aVar.q(jSONObject.optString(com.smartdigimkt.o1.b.X1));
                aVar.i(jSONObject.optString(com.smartdigimkt.o1.b.H2));
                aVar.o(jSONObject.optString(com.smartdigimkt.o1.b.G2));
                aVar.u(jSONObject.optInt(com.smartdigimkt.o1.b.O2));
                aVar.n(jSONObject.optInt(com.smartdigimkt.o1.b.j2, com.smartdigimkt.o1.b.l2));
                aVar.m(jSONObject.optInt(com.smartdigimkt.o1.b.i2, 0));
                try {
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(com.smartdigimkt.o1.b.h2);
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                        LinkedList linkedList = new LinkedList();
                        for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                            linkedList.add(jSONArrayOptJSONArray.optString(i3));
                        }
                        aVar.a(linkedList);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                long jOptLong = jSONObject.optLong(com.smartdigimkt.o1.b.f37315b0);
                if (jOptLong == 0) {
                    aVar.e(20L);
                } else {
                    aVar.e(jOptLong);
                }
                long jOptLong2 = jSONObject.optLong(com.smartdigimkt.o1.b.f37317c0);
                if (jOptLong2 == 0) {
                    aVar.j(10L);
                } else {
                    aVar.j(jOptLong2);
                    JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(com.smartdigimkt.o1.b.v);
                    if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                        HashMap map = new HashMap();
                        for (int i4 = 0; i4 < jSONArrayOptJSONArray2.length(); i4++) {
                            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray2.optJSONObject(i4);
                            map.put(jSONObjectOptJSONObject.optString("domain"), jSONObjectOptJSONObject.optString("format"));
                        }
                        aVar.b(map);
                    }
                }
                aVar.Y(jSONObject.optInt(com.smartdigimkt.o1.b.o0, 3));
                aVar.q(jSONObject.optInt(com.smartdigimkt.o1.b.p0, 86400));
                aVar.s(jSONObject.optInt("iex", 1));
                JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray(com.smartdigimkt.o1.b.r0);
                if (jSONArrayOptJSONArray3 == null || jSONArrayOptJSONArray3.length() <= 0) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    for (int i5 = 0; i5 < jSONArrayOptJSONArray3.length(); i5++) {
                        String strOptString = jSONArrayOptJSONArray3.optString(i5);
                        if (y.b(strOptString) && (dVarC = d.c(new JSONObject(strOptString))) != null) {
                            arrayList.add(dVarC);
                        }
                    }
                }
                if (arrayList != null) {
                    aVar.b(arrayList);
                }
                try {
                    JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray(com.smartdigimkt.o1.b.s0);
                    if (jSONArrayOptJSONArray4 != null && jSONArrayOptJSONArray4.length() > 0) {
                        arrayList2 = new ArrayList();
                        for (int i6 = 0; i6 < jSONArrayOptJSONArray4.length(); i6++) {
                            String strOptString2 = jSONArrayOptJSONArray4.optString(i6);
                            if (y.b(strOptString2)) {
                                JSONObject jSONObject2 = new JSONObject(strOptString2);
                                arrayList2.add(new com.smartdigimkt.x.c(jSONObject2.optInt("adtype"), jSONObject2.optString("unitid")));
                            }
                        }
                    }
                    if (arrayList2 != null) {
                        aVar.a(arrayList2);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                aVar.i(jSONObject.optInt(com.smartdigimkt.o1.b.t0, com.smartdigimkt.o1.b.y1));
                aVar.W(jSONObject.optInt("pf", com.smartdigimkt.o1.b.z1));
                aVar.Z(jSONObject.optInt(com.smartdigimkt.o1.b.A0, 20));
                aVar.u(jSONObject.optString(com.smartdigimkt.o1.b.B0));
                JSONArray jSONArrayOptJSONArray5 = jSONObject.optJSONArray(com.smartdigimkt.o1.b.v0);
                if (jSONArrayOptJSONArray5 != null && jSONArrayOptJSONArray5.length() > 0) {
                    ArrayList arrayList3 = new ArrayList();
                    for (int i7 = 0; i7 < jSONArrayOptJSONArray5.length(); i7++) {
                        arrayList3.add(jSONArrayOptJSONArray5.optString(i7));
                    }
                    aVar.c(arrayList3);
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(com.smartdigimkt.o1.b.w0);
                if (jSONObjectOptJSONObject2 != null) {
                    aVar.U(jSONObjectOptJSONObject2.optInt(com.smartdigimkt.o1.b.x0, 1));
                    aVar.S(jSONObjectOptJSONObject2.optInt(com.smartdigimkt.o1.b.y0, 1));
                    aVar.T(jSONObjectOptJSONObject2.optInt(com.smartdigimkt.o1.b.z0, 1));
                }
                aVar.n(jSONObject.optString(com.smartdigimkt.o1.b.u2, ""));
                aVar.l(jSONObject.optString(com.smartdigimkt.o1.b.v2, ""));
                aVar.m(jSONObject.optString(com.smartdigimkt.o1.b.w2, ""));
                aVar.k(jSONObject.optString(com.smartdigimkt.o1.b.x2, ""));
                aVar.j(jSONObject.optString(com.smartdigimkt.o1.b.y2, ""));
                aVar.M(jSONObject.optInt(com.smartdigimkt.o1.b.z2, 0));
                aVar.N(jSONObject.optInt(com.smartdigimkt.o1.b.A2, 21600));
                aVar.r0(jSONObject.optInt(com.smartdigimkt.o1.b.B2, 2));
                aVar.h0(jSONObject.optInt(com.smartdigimkt.o1.b.C2, 0));
                aVar.G(jSONObject.optInt(com.smartdigimkt.o1.b.D2, 0));
                aVar.j0(jSONObject.optInt(com.smartdigimkt.o1.b.E2, 604800));
                aVar.a0(jSONObject.optInt(com.smartdigimkt.o1.b.F2, 0));
                aVar.d(jSONObject.optString("adchoice_icon", ""));
                aVar.e(jSONObject.optString("adchoice_link", ""));
                aVar.f(jSONObject.optString("adchoice_size", ""));
                aVar.v(jSONObject.optString("platform_logo", ""));
                aVar.w(jSONObject.optString("platform_name", ""));
                aVar.a(a(jSONObject.optString(com.smartdigimkt.o1.b.N2, "")));
                aVar.k(jSONObject.optInt(com.smartdigimkt.o1.b.P2, 0));
                aVar.y(jSONObject.optInt(com.smartdigimkt.o1.b.R2, 0));
                aVar.J(jSONObject.optInt(com.smartdigimkt.o1.b.j3, 120));
                aVar.K(jSONObject.optInt(com.smartdigimkt.o1.b.h3, 10));
                aVar.c(jSONObject.optString(com.smartdigimkt.o1.b.J3, ""));
                aVar.t(jSONObject.optString(com.smartdigimkt.o1.b.U2, ""));
                aVar.c(jSONObject.optInt(com.smartdigimkt.o1.b.V2, 2));
                aVar.d(jSONObject.optInt(com.smartdigimkt.o1.b.W2, 7200));
                aVar.r(jSONObject.optString(com.smartdigimkt.o1.b.t3));
                aVar.A(jSONObject.optString(com.smartdigimkt.o1.b.B3));
                int iOptInt = jSONObject.optInt(com.smartdigimkt.o1.b.u3, 0);
                if (iOptInt > 2 || iOptInt < 0) {
                    iOptInt = 0;
                }
                aVar.j(iOptInt);
                aVar.d(jSONObject.optBoolean(com.smartdigimkt.o1.b.x3, false));
                JSONArray jSONArrayOptJSONArray6 = jSONObject.optJSONArray(com.smartdigimkt.o1.b.s3);
                if (jSONArrayOptJSONArray6 != null && jSONArrayOptJSONArray6.length() > 0) {
                    for (int i8 = 0; i8 < jSONArrayOptJSONArray6.length(); i8++) {
                        JSONObject jSONObject3 = jSONArrayOptJSONArray6.getJSONObject(i8);
                        Iterator<String> itKeys = jSONObject3.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            if (!TextUtils.isEmpty(next) && jSONObject3.getBoolean(next)) {
                                aVar.a(Integer.parseInt(next));
                            }
                        }
                    }
                }
                try {
                    int iOptInt2 = jSONObject.optInt("lqcnt", 30);
                    int iOptInt3 = jSONObject.optInt("lqto", 5);
                    int iOptInt4 = jSONObject.optInt("lqswt", 0);
                    int iOptInt5 = jSONObject.optInt("lqtype", 0);
                    aVar.E(iOptInt3);
                    aVar.B(iOptInt2);
                    aVar.D(iOptInt4);
                    aVar.F(iOptInt5);
                    int i9 = Integer.parseInt(com.smartdigimkt.r4.a.b(jSONObject.optString("lqpt")));
                    if (i9 > 0 && i9 < 65535) {
                        aVar.C(i9);
                    }
                } catch (Exception unused) {
                }
                aVar.u0(jSONObject.optInt(com.smartdigimkt.o1.b.C3, 0));
                try {
                    int iOptInt6 = jSONObject.optInt("l", 3);
                    boolean z3 = jSONObject.optInt("k", 0) == 1;
                    if (jSONObject.optInt("m", 1) != 1) {
                        z2 = false;
                    }
                    aVar.b0(iOptInt6);
                    aVar.e(z3);
                    aVar.b(z2);
                } catch (Exception e3) {
                    e3.getMessage();
                }
                aVar.r(jSONObject.optInt(com.smartdigimkt.o1.b.L3, 0));
                aVar.a(b.a(jSONObject.optJSONObject(com.smartdigimkt.o1.b.M3)));
                try {
                    int iOptInt7 = jSONObject.optInt(com.smartdigimkt.o1.b.R3, com.smartdigimkt.b0.a.L2);
                    int iOptInt8 = jSONObject.optInt(com.smartdigimkt.o1.b.S3, com.smartdigimkt.b0.a.N2);
                    int iOptInt9 = jSONObject.optInt(com.smartdigimkt.o1.b.T3, com.smartdigimkt.b0.a.O2);
                    int iOptInt10 = jSONObject.optInt(com.smartdigimkt.o1.b.V3, com.smartdigimkt.b0.a.T2);
                    if (iOptInt7 <= 0) {
                        iOptInt7 = com.smartdigimkt.b0.a.L2;
                    }
                    if (iOptInt8 <= 0) {
                        iOptInt8 = com.smartdigimkt.b0.a.N2;
                    }
                    if (iOptInt9 <= 0) {
                        iOptInt9 = com.smartdigimkt.b0.a.O2;
                    }
                    if (iOptInt10 < 0) {
                        iOptInt10 = com.smartdigimkt.b0.a.T2;
                    }
                    aVar.e(iOptInt7);
                    aVar.f(iOptInt8);
                    aVar.h(iOptInt9);
                    aVar.g(iOptInt10);
                    int iOptInt11 = jSONObject.optInt(com.smartdigimkt.o1.b.U3, 0);
                    if (iOptInt11 >= 0) {
                        i2 = iOptInt11;
                    }
                    aVar.I(i2);
                    aVar.H(jSONObject.optInt(com.smartdigimkt.o1.b.W3, 10));
                    return aVar;
                } catch (Exception unused2) {
                    return aVar;
                }
            } catch (Exception e4) {
                e = e4;
                r4 = aVar;
            }
        } catch (Exception e5) {
            e = e5;
        }
        e.printStackTrace();
        return r4;
    }

    public void a(long j) {
        this.o = j;
    }

    public void c(boolean z2) {
        this.f36937i = z2;
    }

    public int d() {
        return this.k1;
    }

    public void e(String str) {
        this.b1 = str;
    }

    public void f(long j) {
        this.f36939n = j;
    }

    public void g(long j) {
        this.f36941u = j;
    }

    public void h(String str) {
        this.f36930b = str;
    }

    public String i() {
        return this.Z0;
    }

    public void j(int i2) {
        this.n1 = i2;
    }

    public String k() {
        return this.a1;
    }

    public void l(String str) {
        this.O0 = str;
    }

    public void a(boolean z2) {
        this.g = z2;
    }

    public int c() {
        return this.j1;
    }

    public void d(int i2) {
        this.k1 = i2;
    }

    public void e(boolean z2) {
        this.O = z2;
    }

    public void f(String str) {
        this.a1 = str;
    }

    public void g(boolean z2) {
        this.q = z2;
    }

    public static String a(Context context, String str) {
        try {
            a aVarC = com.smartdigimkt.n1.b.b().c(com.smartdigimkt.u.a.f().a());
            if (aVarC != null && aVarC.Y() != null) {
                String host = Uri.parse(str).getHost();
                Iterator<Map.Entry<String, String>> it = aVarC.Y().entrySet().iterator();
                while (it.hasNext()) {
                    String key = it.next().getKey();
                    if (!TextUtils.isEmpty(host) && host.contains(key)) {
                        String str2 = aVarC.Y().get(key);
                        if (TextUtils.isEmpty(str2)) {
                            return "";
                        }
                        return str2.replace("{gaid}", com.smartdigimkt.n8.c.y());
                    }
                }
                return "";
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public void c(int i2) {
        this.j1 = i2;
    }

    public void d(boolean z2) {
        this.o1 = z2;
    }

    public static boolean a() {
        try {
            a aVarC = com.smartdigimkt.n1.b.b().c(com.smartdigimkt.u.a.f().a());
            if (aVarC != null) {
                return aVarC.n1();
            }
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return true;
        }
    }

    public void a(Map<String, C0548a> map) {
        this.e1 = map;
    }

    public static Map<String, C0548a> a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                C0548a c0548a = new C0548a();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                if (jSONObjectOptJSONObject != null) {
                    c0548a.a(jSONObjectOptJSONObject);
                }
                map.put(next, c0548a);
            }
            return map;
        } catch (JSONException e2) {
            if (com.smartdigimkt.b.b.f33800a) {
                e2.printStackTrace();
            }
            return null;
        } catch (Exception e3) {
            if (com.smartdigimkt.b.b.f33800a) {
                e3.printStackTrace();
            }
            return null;
        }
    }

    public void a(b bVar) {
        this.g1 = bVar;
    }

    public void b(long j) {
        this.j = j;
    }

    public void b(Map<String, String> map) {
        this.f36936h = map;
    }

    public void b(boolean z2) {
        this.f36924Q = z2;
    }
}
