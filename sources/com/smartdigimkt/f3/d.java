package com.smartdigimkt.f3;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class d {
    public static final int Z = 2;
    public static final int a0 = 4;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f35051b0 = 5;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f35052c0 = 6;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f35053d0 = 7;
    public static final int e0 = -2;
    public static final int f0 = 1;
    public static final int g0 = 0;
    public static final int h0 = 1;
    public static final int i0 = 2;
    public static final int j0 = 0;
    public static final int k0 = -1;
    public static final int l0 = 5;
    public static final int m0 = 0;
    public static final int n0 = 2;
    public static final int o0 = 2;
    public static final int p0 = -1;
    public static final int q0 = -2;
    public static final int r0 = -3;
    public static final int s0 = 1;
    public static final int t0 = -1;
    private static com.smartdigimkt.v.c u0 = null;
    public static final int v0 = 1;
    public static final int w0 = 2;
    public static String x0;
    private int K;
    private int M;
    private JSONArray X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private JSONObject f35066Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<com.smartdigimkt.d3.b> f35069c;
    private long d;
    private ArrayList<Integer> x;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f35070e = -1;
    private int f = 0;
    private int g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f35071h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f35072i = 1;
    private int j = 1;
    private int k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private double f35073l = 1.0d;
    private int m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f35074n = 5;
    private int o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f35075p = 3;
    private int q = 80;
    private int r = 100;
    private int s = 0;
    private double t = 1.0d;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f35076u = -1;
    private int v = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private double f35077w = 1.0d;
    private int y = 3;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f35078z = 1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f35054A = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f35055B = 100;
    private int C = 60;
    private String D = "";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f35056E = 0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f35057F = 70;
    private int G = 0;
    private int H = -1;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f35058I = -1;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f35059J = -1;
    private int L = 20;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f35060N = 0;
    private int O = 1;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private String f35061P = "";

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f35062Q = 1;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private String f35063R = "";
    private int S = 1;
    private String T = "Virtual Item";

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f35064U = 0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private int f35065V = 1;
    private int W = 60;

    public void A(int i2) {
        this.L = i2;
    }

    public int B() {
        return this.f35055B;
    }

    public int C() {
        return this.C;
    }

    public void D(int i2) {
        this.f35056E = i2;
    }

    public String E() {
        return this.T;
    }

    public void F(int i2) {
        this.f35078z = i2;
    }

    public int G() {
        return this.f;
    }

    public int H() {
        return this.f35070e;
    }

    public int I() {
        return this.L;
    }

    public int J() {
        return this.r;
    }

    public void K(int i2) {
        this.f35059J = i2;
    }

    public void L(int i2) {
        this.f35058I = i2;
    }

    public int M() {
        return this.f35056E;
    }

    public int N() {
        return this.m;
    }

    public Queue<Integer> O() {
        LinkedList linkedList;
        Exception e2;
        try {
            List<com.smartdigimkt.d3.b> list = this.f35069c;
            if (list == null || list.size() <= 0) {
                return null;
            }
            linkedList = new LinkedList();
            for (int i2 = 0; i2 < this.f35069c.size(); i2++) {
                try {
                    linkedList.add(Integer.valueOf(this.f35069c.get(i2).c()));
                } catch (Exception e3) {
                    e2 = e3;
                }
            }
            return linkedList;
        } catch (Exception e4) {
            linkedList = null;
            e2 = e4;
        }
        e2.printStackTrace();
        return linkedList;
    }

    public int P() {
        return this.f35078z;
    }

    public int Q() {
        return this.q;
    }

    public int R() {
        return this.f35075p;
    }

    public String S() {
        return this.f35067a;
    }

    public JSONArray T() {
        return this.X;
    }

    public int U() {
        return this.k;
    }

    public double V() {
        return this.t;
    }

    public int W() {
        return this.f35065V;
    }

    public int X() {
        return this.f35059J;
    }

    public int Y() {
        return this.f35058I;
    }

    public int Z() {
        return this.H;
    }

    public String a() {
        return this.D;
    }

    public String a0() {
        return this.f35061P;
    }

    public void b(String str) {
        this.D = str;
    }

    public JSONObject b0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("unitId", this.f35067a);
            jSONObject.put(b.g, this.f35071h);
            List<com.smartdigimkt.d3.b> list = this.f35069c;
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (com.smartdigimkt.d3.b bVar : this.f35069c) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", bVar.a());
                    jSONObject2.put("timeout", bVar.c());
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            jSONObject.put("aqn", this.f35072i);
            jSONObject.put("acn", this.j);
            jSONObject.put("vcn", this.k);
            jSONObject.put("cbp", this.f35073l);
            jSONObject.put("ttc_type", this.m);
            jSONObject.put("offset", this.f35074n);
            jSONObject.put("dlnet", this.o);
            jSONObject.put(b.f35023J, this.f35075p);
            jSONObject.put(b.K, this.q);
            jSONObject.put("ready_rate", this.r);
            jSONObject.put("endscreen_type", this.M);
            jSONObject.put(b.O, this.G);
            jSONObject.put(b.f35025P, this.H);
            jSONObject.put(b.f35026Q, this.f35058I);
            jSONObject.put(b.f35027R, this.f35059J);
            jSONObject.put("orientation", this.f35056E);
            jSONObject.put(b.S, this.K);
            jSONObject.put("playclosebtn_tm", this.f35070e);
            jSONObject.put("play_ctdown", this.f);
            jSONObject.put("close_alert", this.g);
            jSONObject.put(b.f35035c0, this.f35076u);
            jSONObject.put(b.a0, this.t);
            jSONObject.put(b.r0, this.v);
            jSONObject.put(b.s0, this.f35077w);
            JSONArray jSONArray2 = new JSONArray();
            ArrayList<Integer> arrayList = this.x;
            if (arrayList != null) {
                if (arrayList.size() > 0) {
                    Iterator<Integer> it = this.x.iterator();
                    while (it.hasNext()) {
                        jSONArray2.put(it.next());
                    }
                }
                jSONObject.put(b.o0, jSONArray2);
            }
            jSONObject.put(b.p0, this.y);
            jSONObject.put("tmorl", this.f35078z);
            jSONObject.put(b.x0, this.f35054A);
            jSONObject.put("placementid", this.f35068b);
            jSONObject.put("ltafemty", this.f35055B);
            jSONObject.put("ltorwc", this.C);
            jSONObject.put("amount_max", this.f35060N);
            jSONObject.put("callback_rule", this.O);
            jSONObject.put("virtual_currency", this.f35061P);
            jSONObject.put("amount", this.f35062Q);
            jSONObject.put("icon", this.f35063R);
            jSONObject.put("currency_id", this.S);
            jSONObject.put("name", this.T);
            jSONObject.put("isDefault", this.f35064U);
            jSONObject.put(b.N0, this.f35065V);
            jSONObject.put(b.O0, this.W);
            return jSONObject;
        } catch (Exception e2) {
            e2.printStackTrace();
            return jSONObject;
        }
    }

    public void c(int i2) {
        this.j = i2;
    }

    public void d(int i2) {
        if (i2 <= 0) {
            this.f35062Q = 1;
        } else {
            this.f35062Q = i2;
        }
    }

    public void e(int i2) {
        this.f35060N = i2;
    }

    public int f() {
        return this.f35060N;
    }

    public int g() {
        return this.f35072i;
    }

    public void h(int i2) {
        this.O = i2;
    }

    public ArrayList<Integer> i() {
        return this.x;
    }

    public int j() {
        return this.O;
    }

    public void k(int i2) {
        this.s = i2;
    }

    public void l(int i2) {
        this.g = i2;
    }

    public void m(int i2) {
        this.K = i2;
    }

    public void n(int i2) {
        this.S = i2;
    }

    public void o(int i2) {
        this.G = i2;
    }

    public int p() {
        return this.g;
    }

    public int q() {
        return this.K;
    }

    public int r() {
        return this.S;
    }

    public void s(int i2) {
        this.f35054A = i2;
    }

    public int t() {
        return this.G;
    }

    public int u() {
        return this.o;
    }

    public void v(int i2) {
        this.f35055B = i2;
    }

    public void w(int i2) {
        this.C = i2;
    }

    public int x() {
        return this.f35054A;
    }

    public void y(int i2) {
        this.f = i2;
    }

    public void z(int i2) {
        this.f35070e = i2;
    }

    public int A() {
        return this.W;
    }

    public void B(int i2) {
        this.r = i2;
    }

    public void C(int i2) {
        this.f35076u = i2;
    }

    public int D() {
        return this.f35074n;
    }

    public void E(int i2) {
        this.m = i2;
    }

    public String F() {
        return this.f35068b;
    }

    public void G(int i2) {
        this.q = i2;
    }

    public void H(int i2) {
        this.f35075p = i2;
    }

    public void I(int i2) {
        this.k = i2;
    }

    public void J(int i2) {
        this.f35065V = i2;
    }

    public Queue<Integer> K() {
        LinkedList linkedList;
        Exception e2;
        try {
            List<com.smartdigimkt.d3.b> list = this.f35069c;
            if (list == null || list.size() <= 0) {
                return null;
            }
            linkedList = new LinkedList();
            for (int i2 = 0; i2 < this.f35069c.size(); i2++) {
                try {
                    linkedList.add(Integer.valueOf(this.f35069c.get(i2).a()));
                } catch (Exception e3) {
                    e2 = e3;
                }
            }
            return linkedList;
        } catch (Exception e4) {
            linkedList = null;
            e2 = e4;
        }
        if (com.smartdigimkt.b.b.f33800a) {
            e2.printStackTrace();
        }
        return linkedList;
    }

    public JSONObject L() {
        return this.f35066Y;
    }

    public void M(int i2) {
        this.H = i2;
    }

    public void a(ArrayList<Integer> arrayList) {
        this.x = arrayList;
    }

    public int b() {
        return this.j;
    }

    public List<com.smartdigimkt.d3.b> c() {
        return this.f35069c;
    }

    public int e() {
        return this.f35062Q;
    }

    public void f(int i2) {
        this.f35072i = i2;
    }

    public void g(String str) {
        this.f35067a = str;
    }

    public void h(String str) {
        this.f35061P = str;
    }

    public void i(int i2) {
        this.f35071h = i2;
    }

    public void j(int i2) {
        this.v = i2;
    }

    public int k() {
        return this.f35071h;
    }

    public double l() {
        return this.f35073l;
    }

    public double m() {
        return this.f35077w;
    }

    public int n() {
        return this.v;
    }

    public int o() {
        return this.s;
    }

    public void p(int i2) {
        this.o = i2;
    }

    public void q(int i2) {
        this.M = i2;
    }

    public void r(int i2) {
        this.f35057F = i2;
    }

    public long s() {
        return this.d;
    }

    public void t(int i2) {
        this.f35064U = i2;
    }

    public void u(int i2) {
        this.W = i2;
    }

    public int v() {
        return this.M;
    }

    public int w() {
        return this.f35057F;
    }

    public void x(int i2) {
        this.f35074n = i2;
    }

    public String y() {
        return this.f35063R;
    }

    public int z() {
        return this.f35064U;
    }

    public void a(double d) {
        this.f35073l = d;
    }

    public int b(int i2) {
        int i3 = this.f35076u;
        if (i3 == -1) {
            if (i2 == 94) {
                return 2;
            }
            if (i2 == 287) {
                return 3;
            }
        }
        return i3;
    }

    public void c(double d) {
        this.t = d;
    }

    public void d(String str) {
        this.f35063R = str;
    }

    public void e(String str) {
        if (TextUtils.isEmpty(str)) {
            this.T = this.f35061P;
        } else {
            this.T = str;
        }
    }

    public void f(String str) {
        this.f35068b = str;
    }

    public void g(int i2) {
        this.y = i2;
    }

    public int h() {
        return this.y;
    }

    public void a(long j) {
        this.d = j;
    }

    public void b(double d) {
        this.f35077w = d;
    }

    public void c(String str) {
        x0 = str;
    }

    public String d() {
        return x0;
    }

    public void a(List<com.smartdigimkt.d3.b> list) {
        this.f35069c = list;
    }

    public void b(JSONObject jSONObject) {
        this.f35066Y = jSONObject;
    }

    public boolean a(int i2) {
        ArrayList<Integer> arrayList = this.x;
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        return this.x.contains(Integer.valueOf(i2));
    }

    public static d a(String str) {
        JSONObject jSONObjectOptJSONObject;
        if (u0 == null) {
            u0 = com.smartdigimkt.v.c.a(com.smartdigimkt.m6.b.p().k());
        }
        d dVar = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("unitSetting");
                if (jSONArrayOptJSONArray != null && (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0)) != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("unitId");
                    if (!TextUtils.isEmpty(strOptString)) {
                        d dVar2 = new d();
                        try {
                            List<com.smartdigimkt.d3.b> listA = com.smartdigimkt.d3.b.a(jSONObjectOptJSONObject.optJSONArray("adSourceList"));
                            dVar2.g(strOptString);
                            dVar2.a(listA);
                            dVar2.i(jSONObjectOptJSONObject.optInt(b.g));
                            int iOptInt = jSONObjectOptJSONObject.optInt("aqn", 1);
                            if (iOptInt <= 0) {
                                iOptInt = 1;
                            }
                            dVar2.f(iOptInt);
                            int iOptInt2 = jSONObjectOptJSONObject.optInt("acn", 1);
                            if (iOptInt2 < 0) {
                                iOptInt2 = 1;
                            }
                            dVar2.c(iOptInt2);
                            dVar2.I(jSONObjectOptJSONObject.optInt("vcn", 5));
                            dVar2.a(jSONObjectOptJSONObject.optDouble("cbp", 1.0d));
                            dVar2.E(jSONObjectOptJSONObject.optInt("ttc_type", 2));
                            dVar2.x(jSONObjectOptJSONObject.optInt("offset", 5));
                            dVar2.p(jSONObjectOptJSONObject.optInt("dlnet", 1));
                            dVar2.q(jSONObjectOptJSONObject.optInt("endscreen_type", 2));
                            dVar2.H(jSONObjectOptJSONObject.optInt(b.f35023J, 3));
                            dVar2.G(jSONObjectOptJSONObject.optInt(b.K, 80));
                            dVar2.B(jSONObjectOptJSONObject.optInt("ready_rate", 100));
                            dVar2.k(jSONObjectOptJSONObject.optInt("cd_rate", 0));
                            dVar2.a(jSONObject.optLong("current_time"));
                            dVar2.D(jSONObjectOptJSONObject.optInt("orientation", 0));
                            dVar2.o(jSONObjectOptJSONObject.optInt(b.O, 0));
                            dVar2.M(jSONObjectOptJSONObject.optInt(b.f35025P, -1));
                            dVar2.L(jSONObjectOptJSONObject.optInt(b.f35026Q, 2));
                            dVar2.K(jSONObjectOptJSONObject.optInt(b.f35027R, -1));
                            dVar2.m(jSONObjectOptJSONObject.optInt(b.S, 1));
                            dVar2.z(jSONObjectOptJSONObject.optInt("playclosebtn_tm", -1));
                            dVar2.y(jSONObjectOptJSONObject.optInt("play_ctdown", 0));
                            dVar2.l(jSONObjectOptJSONObject.optInt("close_alert", 0));
                            dVar2.A(jSONObjectOptJSONObject.optInt(b.f35022I, 20));
                            dVar2.r(jSONObjectOptJSONObject.optInt(b.C0, 70));
                            dVar2.C(jSONObjectOptJSONObject.optInt(b.f35035c0, -1));
                            dVar2.c(jSONObjectOptJSONObject.optDouble(b.a0, 1.0d));
                            dVar2.j(jSONObjectOptJSONObject.optInt(b.r0, 2));
                            dVar2.b(jSONObjectOptJSONObject.optDouble(b.s0, 1.0d));
                            dVar2.c(jSONObjectOptJSONObject.optString("atzu"));
                            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray(b.o0);
                            ArrayList<Integer> arrayList = new ArrayList<>();
                            try {
                                if (jSONArrayOptJSONArray2 != null) {
                                    for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                                        arrayList.add(Integer.valueOf(jSONArrayOptJSONArray2.getInt(i2)));
                                    }
                                } else {
                                    arrayList.add(4);
                                    arrayList.add(6);
                                }
                                dVar2.a(arrayList);
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                            int iOptInt3 = jSONObjectOptJSONObject.optInt(b.p0, 0);
                            dVar2.g(iOptInt3 > 0 ? iOptInt3 : 3);
                            int iOptInt4 = jSONObjectOptJSONObject.optInt("tmorl", 1);
                            if (iOptInt4 > 2 || iOptInt4 <= 0) {
                                iOptInt4 = 1;
                            }
                            dVar2.F(iOptInt4);
                            if (dVar2.l() == 1.0d) {
                                dVar2.s(0);
                            } else {
                                dVar2.s(new Random().nextDouble() > dVar2.l() ? 1 : 0);
                            }
                            dVar2.f(jSONObjectOptJSONObject.optString("placementid"));
                            dVar2.v(jSONObjectOptJSONObject.optInt("ltafemty", 10));
                            dVar2.w(jSONObjectOptJSONObject.optInt("ltorwc", 60));
                            dVar2.b(jSONObjectOptJSONObject.optString(com.smartdigimkt.o1.b.J3));
                            dVar2.e(jSONObjectOptJSONObject.optInt("amount_max", 0));
                            dVar2.h(jSONObjectOptJSONObject.optInt("callback_rule", 1));
                            dVar2.h(jSONObjectOptJSONObject.optString("virtual_currency", ""));
                            dVar2.d(jSONObjectOptJSONObject.optInt("amount", 1));
                            dVar2.d(jSONObjectOptJSONObject.optString("icon", ""));
                            dVar2.n(jSONObjectOptJSONObject.optInt("currency_id", 1));
                            dVar2.e(jSONObjectOptJSONObject.optString("name", "Virtual Item"));
                            dVar2.J(jSONObjectOptJSONObject.optInt(b.N0, 1));
                            dVar2.u(jSONObjectOptJSONObject.optInt(b.O0, 60));
                            return dVar2;
                        } catch (Exception e3) {
                            e = e3;
                            dVar = dVar2;
                            e.printStackTrace();
                            return dVar;
                        }
                    }
                }
            } catch (Exception e4) {
                e = e4;
            }
        }
        return dVar;
    }

    public static d a(JSONObject jSONObject) {
        d dVar = null;
        if (jSONObject != null) {
            try {
                d dVar2 = new d();
                try {
                    dVar2.a(com.smartdigimkt.d3.b.a(jSONObject.optJSONArray("adSourceList")));
                    dVar2.i(jSONObject.optInt(b.g));
                    int iOptInt = jSONObject.optInt("aqn", 1);
                    if (iOptInt <= 0) {
                        iOptInt = 1;
                    }
                    dVar2.f(iOptInt);
                    int iOptInt2 = jSONObject.optInt("acn", 1);
                    if (iOptInt2 < 0) {
                        iOptInt2 = 1;
                    }
                    dVar2.c(iOptInt2);
                    dVar2.I(jSONObject.optInt("vcn", 5));
                    dVar2.a(jSONObject.optDouble("cbp", 1.0d));
                    dVar2.E(jSONObject.optInt("ttc_type", 2));
                    dVar2.x(jSONObject.optInt("offset", 5));
                    dVar2.p(jSONObject.optInt("dlnet", 1));
                    dVar2.q(jSONObject.optInt("endscreen_type", 2));
                    dVar2.H(jSONObject.optInt(b.f35023J, 3));
                    dVar2.G(jSONObject.optInt(b.K, 80));
                    dVar2.B(jSONObject.optInt("ready_rate", 100));
                    dVar2.a(jSONObject.optLong("current_time"));
                    dVar2.D(jSONObject.optInt("orientation", 0));
                    dVar2.o(jSONObject.optInt(b.O, 0));
                    dVar2.M(jSONObject.optInt(b.f35025P, -1));
                    dVar2.L(jSONObject.optInt(b.f35026Q, 2));
                    dVar2.K(jSONObject.optInt(b.f35027R, -1));
                    dVar2.m(jSONObject.optInt(b.S, 1));
                    dVar2.z(jSONObject.optInt("playclosebtn_tm", -1));
                    dVar2.y(jSONObject.optInt("play_ctdown", 0));
                    dVar2.l(jSONObject.optInt("close_alert", 0));
                    dVar2.A(jSONObject.optInt(b.f35022I, 20));
                    dVar2.C(jSONObject.optInt(b.f35035c0, -1));
                    dVar2.c(jSONObject.optDouble(b.a0, 1.0d));
                    dVar2.j(jSONObject.optInt(b.r0, 2));
                    dVar2.b(jSONObject.optDouble(b.s0, 1.0d));
                    dVar2.r(jSONObject.optInt(b.C0, 70));
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(b.o0);
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    try {
                        if (jSONArrayOptJSONArray != null) {
                            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                                arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.getInt(i2)));
                            }
                        } else {
                            arrayList.add(4);
                            arrayList.add(6);
                        }
                        dVar2.a(arrayList);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    dVar2.g(jSONObject.optInt(b.p0, 3));
                    int iOptInt3 = jSONObject.optInt("tmorl", 1);
                    if (iOptInt3 > 2 || iOptInt3 <= 0) {
                        iOptInt3 = 1;
                    }
                    dVar2.F(iOptInt3);
                    if (dVar2.l() == 1.0d) {
                        dVar2.s(0);
                    } else {
                        dVar2.s(new Random().nextDouble() > dVar2.l() ? 1 : 0);
                    }
                    dVar2.f(jSONObject.optString("placementid"));
                    dVar2.v(jSONObject.optInt("ltafemty", 10));
                    dVar2.w(jSONObject.optInt("ltorwc", 60));
                    dVar2.b(jSONObject.optString(com.smartdigimkt.o1.b.J3));
                    dVar2.e(jSONObject.optInt("amount_max", 0));
                    dVar2.h(jSONObject.optInt("callback_rule", 1));
                    dVar2.h(jSONObject.optString("virtual_currency", ""));
                    dVar2.d(jSONObject.optInt("amount", 1));
                    dVar2.d(jSONObject.optString("icon", ""));
                    dVar2.n(jSONObject.optInt("currency_id", 1));
                    dVar2.e(jSONObject.optString("name", "Virtual Item"));
                    dVar2.J(jSONObject.optInt(b.N0, 1));
                    dVar2.u(jSONObject.optInt(b.O0, 60));
                    return dVar2;
                } catch (Exception e3) {
                    e = e3;
                    dVar = dVar2;
                    e.printStackTrace();
                    return dVar;
                }
            } catch (Exception e4) {
                e = e4;
            }
        }
        return dVar;
    }

    public void a(JSONArray jSONArray) {
        this.X = jSONArray;
    }
}
