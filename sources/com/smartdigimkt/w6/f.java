package com.smartdigimkt.w6;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.smartdigimkt.w6.g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public abstract class f<T extends g> implements Serializable {
    public static final int o0 = 1;
    public static final int p0 = 2;
    public static final int q0 = 1;
    public static final int r0 = 2;
    public static final int s0 = 3;
    public static final int t0 = 4;
    public static final int u0 = 1;
    public static final int v0 = 2;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    protected Bitmap f39479A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    protected g f39480B;
    protected String C;
    protected String D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected int f39481E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    protected String f39482F;
    protected String G;
    protected String H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    protected String f39483I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    protected int f39484J;
    protected int K;
    private boolean L;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    protected int f39485N;
    protected int O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    protected int f39486P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    protected int f39487Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    protected long f39488R;
    protected int S;
    protected String T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    protected String f39489U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    protected String f39490V;
    private String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private String f39491Y;
    private String Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f39492a;
    private int a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f39493b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f39494b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f39495c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private String f39496c0;
    protected String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected String f39498e;
    protected String f;
    protected String g;
    private String g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected String f39499h;
    private String h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected String f39500i;
    private String i0;
    protected String j;
    private String j0;
    protected String k;
    private String k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected String f39501l;
    private String l0;
    protected String m;
    private String m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected String f39502n;
    private String n0;
    protected int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected int f39503p;
    protected int q;
    protected String r;
    protected int s;
    protected String t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected String f39504u;
    protected String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected String f39505w;
    protected String x;
    protected String y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected String f39506z;
    protected int M = -1;
    protected boolean W = false;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private String f39497d0 = "";
    private String e0 = "";
    private String f0 = "";

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f39507a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f39508b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f39509c = 3;
    }

    public String A() {
        return this.t;
    }

    public abstract String B();

    public void B(String str) {
        this.f39482F = str;
    }

    public final void C(String str) {
        this.f39492a = str;
    }

    public void D(String str) {
        this.G = str;
    }

    public final String E() {
        return this.f;
    }

    public int F() {
        return this.f39485N;
    }

    public String G() {
        return this.i0;
    }

    public String H() {
        return this.f39489U;
    }

    public int I() {
        return this.s;
    }

    public int J() {
        return this.K;
    }

    public String K() {
        return this.f39482F;
    }

    public final String L() {
        return this.f39492a;
    }

    public void M(String str) {
        this.f39504u = str;
    }

    public void N(String str) {
        this.C = str;
    }

    public abstract int O();

    public void O(String str) {
        this.f39506z = str;
    }

    public String P() {
        return this.G;
    }

    public int Q() {
        return this.f39484J;
    }

    public void R(String str) {
        this.f39491Y = str;
    }

    public void S(String str) {
        this.D = str;
    }

    public void T(String str) {
        this.f39483I = str;
    }

    public void U(String str) {
        this.H = str;
    }

    public void V(String str) {
        this.g0 = str;
    }

    public String W() {
        return this.x;
    }

    public final String X() {
        return this.f39502n;
    }

    public final String Y() {
        return this.k;
    }

    public String Z() {
        return this.f39505w;
    }

    public abstract List<String> a(T t, boolean z2);

    public void a(Bitmap bitmap) {
        this.f39479A = bitmap;
    }

    public int a0() {
        return this.f39481E;
    }

    public void b(g gVar) {
        this.f39480B = gVar;
    }

    public String b0() {
        return this.f39504u;
    }

    public final String c() {
        return this.f39499h;
    }

    public abstract List<String> c(T t, boolean z2);

    public int c0() {
        return this.q;
    }

    public void d(int i2) {
        this.S = i2;
    }

    public String d0() {
        return this.C;
    }

    public String e() {
        return this.r;
    }

    public int e0() {
        return this.f39494b0;
    }

    public void f(int i2) {
        this.f39485N = i2;
    }

    public String f0() {
        return this.f39506z;
    }

    public void g(int i2) {
        this.s = i2;
    }

    public final String g0() {
        return this.f39495c;
    }

    public void h(int i2) {
        this.K = i2;
    }

    public final int h0() {
        return this.o;
    }

    public void i(int i2) {
        this.f39484J = i2;
    }

    public long i0() {
        return this.f39488R;
    }

    public void j(int i2) {
        this.f39481E = i2;
    }

    public int j0() {
        return this.f39487Q;
    }

    public final String k() {
        return this.m;
    }

    public final String k0() {
        return this.j;
    }

    public final void l(String str) {
        this.f39501l = str;
    }

    public int l0() {
        return this.f39486P;
    }

    public final String m() {
        return this.f39493b;
    }

    public String m0() {
        return this.D;
    }

    public final String n() {
        return this.f39500i;
    }

    public String n0() {
        return this.f39483I;
    }

    public int o() {
        return this.S;
    }

    public String o0() {
        return this.H;
    }

    public final void p(String str) {
        this.g = str;
    }

    public String p0() {
        return this.g0;
    }

    public final String q() {
        return this.f39501l;
    }

    public boolean q0() {
        return (TextUtils.isEmpty(this.v) || TextUtils.isEmpty(this.f39504u) || TextUtils.isEmpty(this.f39505w) || TextUtils.isEmpty(this.x)) ? false : true;
    }

    public void r(String str) {
        this.y = str;
    }

    public boolean r0() {
        return !TextUtils.isEmpty(this.j);
    }

    public final void s(String str) {
        this.f39498e = str;
    }

    public boolean s0() {
        return this.f39503p == 4;
    }

    public void t(String str) {
        this.f0 = str;
    }

    public boolean t0() {
        g gVar = this.f39480B;
        return gVar != null && gVar.s() == 1;
    }

    public String u() {
        return this.y;
    }

    public boolean u0() {
        return this.L;
    }

    public void v(String str) {
        this.f39497d0 = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public boolean v0() {
        byte b2 = 2;
        int i2 = this.f39481E;
        if (i2 == 1) {
            return true;
        }
        if (i2 == 2) {
            String strValueOf = String.valueOf(this.f39480B.Z());
            strValueOf.getClass();
            switch (strValueOf.hashCode()) {
                case 48:
                    b2 = !strValueOf.equals("0") ? (byte) -1 : (byte) 0;
                    break;
                case 49:
                    b2 = !strValueOf.equals("1") ? (byte) -1 : (byte) 1;
                    break;
                case 50:
                    if (!strValueOf.equals("2")) {
                        b2 = -1;
                    }
                    break;
                case AD_REWARD_USER_VALUE:
                    b2 = !strValueOf.equals("3") ? (byte) -1 : (byte) 3;
                    break;
                case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                    b2 = !strValueOf.equals("4") ? (byte) -1 : (byte) 4;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                case 2:
                case 4:
                    if (TextUtils.isEmpty(this.j) && !TextUtils.isEmpty(this.f39482F)) {
                        return true;
                    }
                    break;
                case 1:
                case 3:
                    return !TextUtils.isEmpty(this.f39482F);
            }
        }
        return false;
    }

    public void w(String str) {
        this.t = str;
    }

    public boolean w0() {
        return false;
    }

    public String x() {
        return this.f0;
    }

    public boolean x0() {
        return this.W;
    }

    public final void y(String str) {
        this.f = str;
    }

    public String z() {
        return this.f39497d0;
    }

    public void A(String str) {
        this.f39489U = str;
    }

    public String C() {
        return this.k0;
    }

    public int D() {
        return this.O;
    }

    public void E(String str) {
        this.l0 = str;
    }

    public void F(String str) {
        this.f39496c0 = str;
    }

    public void G(String str) {
        this.m0 = str;
    }

    public void H(String str) {
        this.h0 = str;
    }

    public void I(String str) {
        this.x = str;
    }

    public final void J(String str) {
        this.f39502n = str;
    }

    public final void K(String str) {
        this.k = str;
    }

    public void L(String str) {
        this.f39505w = str;
    }

    public String M() {
        int iJ = j();
        if (iJ == 2 || iJ == 3) {
            return !TextUtils.isEmpty(X()) ? X() : p();
        }
        return "";
    }

    public int N() {
        g gVar = this.f39480B;
        if (gVar == null || gVar.c0() != 1 || TextUtils.isEmpty(this.f39480B.g0()) || (this.f39480B.Z() == 1 && TextUtils.isEmpty(this.j))) {
            return v0() ? 2 : 1;
        }
        return 3;
    }

    public final void P(String str) {
        this.f39495c = str;
    }

    public final void Q(String str) {
        this.j = str;
    }

    public JSONArray R() {
        if (TextUtils.isEmpty(this.l0)) {
            return null;
        }
        try {
            return new JSONArray(this.l0);
        } catch (Throwable unused) {
            return null;
        }
    }

    public String S() {
        return this.l0;
    }

    public String T() {
        return this.f39496c0;
    }

    public String U() {
        return this.m0;
    }

    public String V() {
        return this.h0;
    }

    public void a(long j) {
        this.f39488R = j;
    }

    public void b(int i2) {
        this.f39503p = i2;
    }

    public final void c(String str) {
        this.f39499h = str;
    }

    public Bitmap d() {
        return this.f39479A;
    }

    public void e(String str) {
        this.r = str;
    }

    public String f() {
        return this.f39490V;
    }

    public void g(String str) {
        this.v = str;
    }

    public final void h(String str) {
        this.m = str;
    }

    public g i() {
        return this.f39480B;
    }

    public final void j(String str) {
        this.f39500i = str;
    }

    public void k(int i2) {
        this.q = i2;
    }

    public int l() {
        return this.a0;
    }

    public final void m(String str) {
        this.d = str;
    }

    public void n(String str) {
        this.X = str;
    }

    public void o(int i2) {
        this.f39486P = i2;
    }

    public String p() {
        return this.T;
    }

    public void q(String str) {
        this.j0 = str;
    }

    public final String r() {
        return this.d;
    }

    public final String s() {
        return this.g;
    }

    public String t() {
        return this.j0;
    }

    public void u(String str) {
        this.e0 = str;
    }

    public String v() {
        g gVar = this.f39480B;
        return gVar != null ? gVar.g0() : "";
    }

    public final String w() {
        return this.f39498e;
    }

    public void x(String str) {
        this.k0 = str;
    }

    public String y() {
        return this.e0;
    }

    public void z(String str) {
        this.i0 = str;
    }

    public void a(boolean z2) {
        this.L = z2;
    }

    public boolean b(String str) {
        return TextUtils.equals(this.j, str) && !TextUtils.isEmpty(str);
    }

    public void c(int i2) {
        this.a0 = i2;
    }

    public void d(String str) {
        this.Z = str;
    }

    public void e(int i2) {
        this.O = i2;
    }

    public void f(String str) {
        this.f39490V = str;
    }

    public int g() {
        return this.M;
    }

    public String h() {
        return this.v;
    }

    public final void i(String str) {
        this.f39493b = str;
    }

    public int j() {
        return this.f39503p;
    }

    public void k(String str) {
        this.T = str;
    }

    public void l(int i2) {
        this.f39494b0 = i2;
    }

    public final void m(int i2) {
        this.o = i2;
    }

    public void n(int i2) {
        this.f39487Q = i2;
    }

    public void o(String str) {
        this.n0 = str;
    }

    public void a(int i2) {
        this.M = i2;
    }

    public void b(boolean z2) {
        this.W = z2;
    }

    public String a(T t) {
        return s();
    }

    public String b() {
        return this.n0;
    }

    public List<String> b(T t, boolean z2) {
        HashSet hashSet = new HashSet();
        if (t.y() == 1) {
            com.smartdigimkt.j5.a.a().a(hashSet, "g2c_finger_icon");
        }
        if (t.Z() == 1) {
            if (t.V() == 3) {
                com.smartdigimkt.j5.a.a().a(hashSet, "ec_rp_top");
            }
            if (t.V() == 2) {
                com.smartdigimkt.j5.a.a().a(hashSet, "g2c_finger_icon");
            }
            if (t.V() == 4) {
                com.smartdigimkt.j5.a.a().a(hashSet, "ec_sec_poster");
            }
            if (t.y() == 1) {
                com.smartdigimkt.j5.a.a().a(hashSet, "g2c_chop");
                com.smartdigimkt.j5.a.a().a(hashSet, "g2c_gift_icon");
                com.smartdigimkt.j5.a.a().a(hashSet, "g2c_ribbon_bg");
                com.smartdigimkt.j5.a.a().a(hashSet, "g2c_finger_icon_v2");
                com.smartdigimkt.j5.a.a().a(hashSet, "g2c_lucky_bag");
                com.smartdigimkt.j5.a.a().a(hashSet, "g2c_lucky_bag_v2");
            }
            if (TextUtils.isEmpty(this.j) && t.W0() == 2) {
                com.smartdigimkt.j5.a.a().a(hashSet, "g2c_finger_icon");
            }
            if (t.p1() == 1) {
                com.smartdigimkt.j5.a.a().a(hashSet, "g2c_finger_icon");
            }
            if (t.m0() == 3) {
                com.smartdigimkt.j5.a.a().a(hashSet, "g2c_finger_icon_v2");
            }
            if (t.m0() == 2) {
                if (com.smartdigimkt.n8.h.a()) {
                    com.smartdigimkt.j5.a.a().a(hashSet, "rv_task_complete_cn");
                } else {
                    com.smartdigimkt.j5.a.a().a(hashSet, "rv_task_complete");
                }
            }
        }
        if (t.Z() == 3) {
            if (t.V() == 3) {
                com.smartdigimkt.j5.a.a().a(hashSet, "ec_rp_top");
            }
            if (t.V() == 2) {
                com.smartdigimkt.j5.a.a().a(hashSet, "g2c_finger_icon");
            }
            if (t.V() == 4) {
                com.smartdigimkt.j5.a.a().a(hashSet, "ec_sec_poster");
            }
            if (t.f() == 2) {
                com.smartdigimkt.j5.a.a().a(hashSet, "am_bubble");
            }
            if (t.E() == 1) {
                com.smartdigimkt.j5.a.a().a(hashSet, "letter_bg");
                com.smartdigimkt.j5.a.a().a(hashSet, "letter_icon");
            }
            if (t.p1() == 1) {
                com.smartdigimkt.j5.a.a().a(hashSet, "g2c_finger_icon");
            }
        }
        if (t.Z() == 4) {
            if (t.f() == 2) {
                com.smartdigimkt.j5.a.a().a(hashSet, "am_bubble");
            }
            if (t.f() == 3) {
                com.smartdigimkt.j5.a.a().a(hashSet, "am_wrapper_top");
                com.smartdigimkt.j5.a.a().a(hashSet, "am_wrapper_right");
                com.smartdigimkt.j5.a.a().a(hashSet, "am_wrapper_left");
            }
            if (t.A1() > 0) {
                com.smartdigimkt.j5.a.a().a(hashSet, "sp_ec_top_bg");
            }
            if (t.p1() == 1) {
                com.smartdigimkt.j5.a.a().a(hashSet, "g2c_finger_icon");
            }
            boolean z3 = (O() == 1 && (t instanceof com.smartdigimkt.z6.c) && 2 != ((com.smartdigimkt.z6.c) t).S1()) ? false : true;
            if ((O() == 2 || O() == 4) && (this instanceof l) ? 1 != ((l) this).B0() : !z3) {
                if (t.m() == 2) {
                    com.smartdigimkt.j5.a.a().a(hashSet, "sp_am_bg_and");
                }
            }
        }
        return new ArrayList(hashSet);
    }
}
