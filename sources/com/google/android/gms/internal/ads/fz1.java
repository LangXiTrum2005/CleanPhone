package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class fz1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f14606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f14610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f14611f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f14612g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f14613h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f14614i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f14615j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f14616k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f14617m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f14618n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f14619o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f14620p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f14621q;

    public fz1(d02 d02Var, ys0 ys0Var, uo0 uo0Var, gy1 gy1Var) {
        this.f14615j = d02Var;
        this.f14616k = ys0Var;
        this.f14621q = uo0Var;
        this.f14613h = new ug();
        this.f14614i = new ih();
        this.f14612g = new ArrayList();
    }

    public static f2.c0 o(i1.p0 p0Var, Object obj, long j10, long j11, i1.o0 o0Var, i1.n0 n0Var) {
        p0Var.g(obj, n0Var);
        p0Var.n(n0Var.f42584c, o0Var);
        p0Var.b(obj);
        int i10 = n0Var.f42588g.f42525a;
        if (i10 != 0) {
            if (i10 == 1) {
                n0Var.f(0);
            }
            n0Var.f42588g.getClass();
            n0Var.g(0);
        }
        p0Var.g(obj, n0Var);
        int iC = n0Var.c(j10);
        return iC == -1 ? new f2.c0(obj, j11, n0Var.b(j10)) : new f2.c0(obj, iC, n0Var.e(iC), j11, -1);
    }

    public static r32 t(ci ciVar, Object obj, long j10, ih ihVar, ug ugVar) {
        ciVar.o(obj, ugVar);
        ciVar.b(ugVar.f20772c, ihVar, 0L);
        ciVar.e(obj);
        ugVar.f20775f.getClass();
        ciVar.o(obj, ugVar);
        ugVar.f20775f.a(-1);
        return new r32(obj, j10, -1);
    }

    public boolean A(ci ciVar, r32 r32Var) {
        if (!r32Var.b() && r32Var.f19363e == -1) {
            Object obj = r32Var.f19359a;
            int i10 = ciVar.o(obj, (ug) this.f14613h).f20772c;
            if (ciVar.b(i10, (ih) this.f14614i, 0L).l == ciVar.e(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean B(ci ciVar, r32 r32Var, boolean z10) {
        int iE = ciVar.e(r32Var.f19359a);
        ug ugVar = (ug) this.f14613h;
        int i10 = ciVar.d(iE, ugVar, false).f20772c;
        ih ihVar = (ih) this.f14614i;
        return !ciVar.b(i10, ihVar, 0L).f15750g && ciVar.l(iE, ugVar, ihVar, this.f14607b, this.f14608c) == -1 && z10;
    }

    public long C(ci ciVar, r32 r32Var) {
        Object obj = r32Var.f19359a;
        ug ugVar = (ug) this.f14613h;
        ciVar.o(obj, ugVar);
        if (r32Var.b()) {
            return ugVar.b(r32Var.f19360b, r32Var.f19361c);
        }
        int i10 = r32Var.f19363e;
        if (i10 == -1) {
            return ugVar.f20773d;
        }
        ugVar.f20775f.a(i10).getClass();
        return 0L;
    }

    public int D(ci ciVar, int i10) {
        this.f14607b = i10;
        return w(ciVar);
    }

    public int E(ci ciVar, boolean z10) {
        this.f14608c = z10;
        return w(ciVar);
    }

    public void F(gy1 gy1Var) {
        gy1Var.getClass();
        K();
    }

    public void G(long j10) {
        dz1 dz1Var = (dz1) this.f14619o;
        if (dz1Var != null) {
            ps1.c0(dz1Var.f13785m == null);
            if (dz1Var.f13778e) {
                dz1Var.f13774a.a(j10 - dz1Var.f13788p);
            }
        }
    }

    public boolean H() {
        dz1 dz1Var = (dz1) this.f14619o;
        if (dz1Var != null) {
            return !dz1Var.f13780g.f14123h && dz1Var.b() && ((dz1) this.f14619o).f13780g.f14120e != C.TIME_UNSET && this.f14609d < 100;
        }
        return true;
    }

    public ez1 I(long j10, nz1 nz1Var) {
        dz1 dz1Var = (dz1) this.f14619o;
        if (dz1Var != null) {
            return x(nz1Var.f18038a, dz1Var, j10);
        }
        ci ciVar = nz1Var.f18038a;
        r32 r32Var = nz1Var.f18039b;
        long j11 = nz1Var.f18040c;
        long j12 = nz1Var.f18054r;
        Object obj = r32Var.f19359a;
        ciVar.o(obj, (ug) this.f14613h);
        return r32Var.b() ? y(ciVar, obj, r32Var.f19360b, r32Var.f19361c, j11, r32Var.f19362d) : z(ciVar, obj, j12, C.TIME_UNSET, j11, r32Var.f19362d);
    }

    public dz1 J(ez1 ez1Var) {
        dz1 dz1Var;
        long j10 = ez1Var.f14117b;
        dz1 dz1Var2 = (dz1) this.f14619o;
        long j11 = dz1Var2 == null ? 1000000000000L : (dz1Var2.f13788p + dz1Var2.f13780g.f14120e) - j10;
        int i10 = 0;
        while (true) {
            if (i10 >= this.f14612g.size()) {
                dz1Var = null;
                break;
            }
            ez1 ez1Var2 = ((dz1) this.f14612g.get(i10)).f13780g;
            long j12 = ez1Var2.f14120e;
            long j13 = ez1Var.f14120e;
            if ((j12 == C.TIME_UNSET || j12 == j13) && ez1Var2.f14117b == j10 && ez1Var2.f14116a.equals(ez1Var.f14116a)) {
                dz1Var = (dz1) this.f14612g.remove(i10);
                break;
            }
            i10++;
        }
        if (dz1Var == null) {
            wy1 wy1Var = (wy1) ((uo0) this.f14621q).f20839b;
            u uVarF = wy1Var.f21631f.f(wy1Var.f21644t);
            wy1Var.Y.getClass();
            dz1Var = new dz1(wy1Var.f21625b, j11, wy1Var.f21629d, uVarF, wy1Var.f21642r, ez1Var, wy1Var.f21630e);
        } else {
            dz1Var.f13780g = ez1Var;
            dz1Var.f13788p = j11;
        }
        dz1 dz1Var3 = (dz1) this.f14619o;
        if (dz1Var3 == null) {
            this.l = dz1Var;
            this.f14617m = dz1Var;
            this.f14618n = dz1Var;
        } else if (dz1Var != dz1Var3.f13785m) {
            dz1Var3.l();
            dz1Var3.f13785m = dz1Var;
        }
        this.f14610e = null;
        this.f14619o = dz1Var;
        this.f14609d++;
        u();
        return dz1Var;
    }

    public void K() {
        if (this.f14612g.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f14612g.size(); i10++) {
            ((dz1) this.f14612g.get(i10)).h();
        }
        this.f14612g = arrayList;
        this.f14620p = null;
        S();
    }

    public dz1 L() {
        return (dz1) this.l;
    }

    public dz1 M() {
        return (dz1) this.f14617m;
    }

    public dz1 N() {
        return (dz1) this.f14618n;
    }

    public dz1 O() {
        dz1 dz1Var = (dz1) this.f14618n;
        dz1 dz1Var2 = (dz1) this.f14617m;
        if (dz1Var == dz1Var2) {
            dz1Var2.getClass();
            this.f14618n = dz1Var2.f13785m;
        }
        dz1Var2.getClass();
        this.f14617m = dz1Var2.f13785m;
        u();
        dz1 dz1Var3 = (dz1) this.f14617m;
        dz1Var3.getClass();
        return dz1Var3;
    }

    public void P() {
        dz1 dz1Var;
        dz1 dz1Var2 = (dz1) this.f14618n;
        if (dz1Var2 == null || (dz1Var = dz1Var2.f13785m) == null) {
            throw null;
        }
        this.f14618n = dz1Var;
        u();
    }

    public dz1 Q() {
        dz1 dz1Var = (dz1) this.l;
        if (dz1Var == null) {
            return null;
        }
        if (dz1Var == ((dz1) this.f14617m)) {
            this.f14617m = dz1Var.f13785m;
        }
        if (dz1Var == ((dz1) this.f14618n)) {
            this.f14618n = dz1Var.f13785m;
        }
        dz1Var.h();
        int i10 = this.f14609d - 1;
        this.f14609d = i10;
        if (i10 == 0) {
            this.f14619o = null;
            dz1 dz1Var2 = (dz1) this.l;
            this.f14610e = dz1Var2.f13775b;
            this.f14611f = dz1Var2.f13780g.f14116a.f19362d;
        }
        this.l = ((dz1) this.l).f13785m;
        u();
        return (dz1) this.l;
    }

    public int R(dz1 dz1Var) {
        dz1Var.getClass();
        int i10 = 0;
        if (dz1Var.equals((dz1) this.f14619o)) {
            return 0;
        }
        this.f14619o = dz1Var;
        int i11 = 0;
        while (true) {
            dz1Var = dz1Var.f13785m;
            if (dz1Var == null) {
                break;
            }
            if (dz1Var == ((dz1) this.f14617m)) {
                dz1 dz1Var2 = (dz1) this.l;
                this.f14617m = dz1Var2;
                this.f14618n = dz1Var2;
                i11 = 3;
            }
            if (dz1Var == ((dz1) this.f14618n)) {
                this.f14618n = (dz1) this.f14617m;
                i11 |= 2;
            }
            dz1Var.h();
            this.f14609d--;
        }
        dz1 dz1Var3 = (dz1) this.f14619o;
        dz1Var3.getClass();
        if (dz1Var3.f13785m != null) {
            dz1Var3.l();
            dz1Var3.f13785m = null;
            while (true) {
                s sVar = dz1Var3.f13787o;
                if (i10 >= sVar.f19742a) {
                    break;
                }
                sVar.b(i10);
                p pVar = ((p[]) dz1Var3.f13787o.f19744c)[i10];
                i10++;
            }
        }
        u();
        return i11;
    }

    public void S() {
        dz1 dz1Var = (dz1) this.f14620p;
        if (dz1Var == null || dz1Var.c()) {
            this.f14620p = null;
            for (int i10 = 0; i10 < this.f14612g.size(); i10++) {
                dz1 dz1Var2 = (dz1) this.f14612g.get(i10);
                if (!dz1Var2.c()) {
                    this.f14620p = dz1Var2;
                    return;
                }
            }
        }
    }

    public dz1 T(q32 q32Var) {
        for (int i10 = 0; i10 < this.f14612g.size(); i10++) {
            dz1 dz1Var = (dz1) this.f14612g.get(i10);
            if (dz1Var.f13774a == q32Var) {
                return dz1Var;
            }
        }
        return null;
    }

    public void U() {
        if (this.f14609d == 0) {
            return;
        }
        dz1 dz1Var = (dz1) this.l;
        dz1Var.getClass();
        this.f14610e = dz1Var.f13775b;
        this.f14611f = dz1Var.f13780g.f14116a.f19362d;
        while (dz1Var != null) {
            dz1Var.h();
            dz1Var = dz1Var.f13785m;
        }
        this.l = null;
        this.f14619o = null;
        this.f14617m = null;
        this.f14618n = null;
        this.f14609d = 0;
        u();
    }

    public int V(ci ciVar, long j10, long j11, long j12) {
        long j13;
        int i10;
        ez1 ez1VarA;
        dz1 dz1Var = (dz1) this.l;
        dz1 dz1Var2 = null;
        while (dz1Var != null) {
            ez1 ez1Var = dz1Var.f13780g;
            r32 r32Var = ez1Var.f14116a;
            if (dz1Var2 != null) {
                ez1 ez1VarX = x(ciVar, dz1Var2, j10);
                if (ez1VarX != null) {
                    long j14 = ez1Var.f14118c;
                    if (r32Var.equals(ez1VarX.f14116a)) {
                        long j15 = ez1Var.f14117b;
                        j13 = C.TIME_UNSET;
                        long j16 = ez1VarX.f14117b;
                        if (j15 == j16) {
                            i10 = 0;
                        } else if (j14 != C.TIME_UNSET) {
                            i10 = 0;
                            long j17 = ez1VarX.f14118c;
                            if (j17 != C.TIME_UNSET) {
                                if (Math.abs((j16 - j17) - (j15 - j14)) >= 5000000) {
                                }
                            }
                        }
                        ez1VarA = j15 != j16 ? ez1VarX.a(j15, j14) : ez1VarX;
                    }
                }
                return R(dz1Var2);
            }
            ez1VarA = W(ciVar, ez1Var);
            j13 = C.TIME_UNSET;
            i10 = 0;
            long j18 = ez1Var.f14119d;
            dz1Var.f13780g = j18 == ez1VarA.f14119d ? ez1VarA : new ez1(ez1VarA.f14116a, ez1VarA.f14117b, ez1VarA.f14118c, j18, ez1VarA.f14120e, ez1VarA.f14121f, ez1VarA.f14122g, ez1VarA.f14123h);
            long j19 = ez1Var.f14120e;
            long j20 = ez1VarA.f14120e;
            if (j19 != j20) {
                long j21 = j20 == j13 ? Long.MAX_VALUE : j20 + dz1Var.f13788p;
                int i11 = (dz1Var != ((dz1) this.f14617m) || (j11 != Long.MIN_VALUE && j11 < j21)) ? i10 : 1;
                int i12 = (dz1Var != ((dz1) this.f14618n) || (j12 != Long.MIN_VALUE && j12 < j21)) ? i10 : 1;
                int iR = R(dz1Var);
                if (iR != 0) {
                    return iR;
                }
                int i13 = (i11 == 0 || (j19 == j13 && r32Var.f19363e == -1)) ? i10 : 1;
                return i12 != 0 ? i13 | 2 : i13;
            }
            dz1Var2 = dz1Var;
            dz1Var = dz1Var.f13785m;
        }
        return 0;
    }

    public ez1 W(ci ciVar, ez1 ez1Var) {
        r32 r32Var = ez1Var.f14116a;
        boolean zB = r32Var.b();
        int i10 = r32Var.f19363e;
        boolean z10 = !zB && i10 == -1;
        boolean zA = A(ciVar, r32Var);
        boolean zB2 = B(ciVar, r32Var, z10);
        long jC = C(ciVar, r32Var);
        Object obj = r32Var.f19359a;
        ug ugVar = (ug) this.f14613h;
        ciVar.o(obj, ugVar);
        if (r32Var.b()) {
            ugVar.c(r32Var.f19360b);
        } else if (i10 != -1) {
            ugVar.c(i10);
        }
        return new ez1(r32Var, ez1Var.f14117b, ez1Var.f14118c, ez1Var.f14119d, jC, z10, zA, zB2);
    }

    public r32 X(ci ciVar, Object obj) {
        long jV;
        int iE;
        ug ugVar = (ug) this.f14613h;
        int i10 = ciVar.o(obj, ugVar).f20772c;
        Object obj2 = this.f14610e;
        if (obj2 == null || (iE = ciVar.e(obj2)) == -1 || ciVar.d(iE, ugVar, false).f20772c != i10) {
            dz1 dz1Var = (dz1) this.l;
            while (true) {
                if (dz1Var == null) {
                    dz1 dz1Var2 = (dz1) this.l;
                    while (true) {
                        if (dz1Var2 == null) {
                            jV = v(obj);
                            if (jV != -1) {
                                break;
                            }
                            jV = this.f14606a;
                            this.f14606a = 1 + jV;
                            if (((dz1) this.l) != null) {
                                break;
                            }
                            this.f14610e = obj;
                            this.f14611f = jV;
                            break;
                        }
                        int iE2 = ciVar.e(dz1Var2.f13775b);
                        if (iE2 != -1 && ciVar.d(iE2, ugVar, false).f20772c == i10) {
                            jV = dz1Var2.f13780g.f14116a.f19362d;
                            break;
                        }
                        dz1Var2 = dz1Var2.f13785m;
                    }
                } else {
                    if (dz1Var.f13775b.equals(obj)) {
                        jV = dz1Var.f13780g.f14116a.f19362d;
                        break;
                    }
                    dz1Var = dz1Var.f13785m;
                }
            }
        } else {
            jV = this.f14611f;
        }
        long j10 = jV;
        ciVar.o(obj, ugVar);
        int i11 = ugVar.f20772c;
        ih ihVar = (ih) this.f14614i;
        ciVar.b(i11, ihVar, 0L);
        for (int iE3 = ciVar.e(obj); iE3 >= ihVar.f15754k; iE3--) {
            ciVar.d(iE3, ugVar, true);
            ugVar.f20775f.getClass();
            ugVar.f20775f.a(-1);
        }
        return t(ciVar, obj, j10, ihVar, ugVar);
    }

    public p1.m0 a() {
        p1.m0 m0Var = (p1.m0) this.f14617m;
        if (m0Var == null) {
            return null;
        }
        if (m0Var == ((p1.m0) this.f14618n)) {
            this.f14618n = m0Var.f48121m;
        }
        if (m0Var == ((p1.m0) this.f14619o)) {
            this.f14619o = m0Var.f48121m;
        }
        m0Var.i();
        int i10 = this.f14609d - 1;
        this.f14609d = i10;
        if (i10 == 0) {
            this.f14620p = null;
            p1.m0 m0Var2 = (p1.m0) this.f14617m;
            this.f14610e = m0Var2.f48111b;
            this.f14611f = m0Var2.f48116g.f48126a.f40310d;
        }
        this.f14617m = ((p1.m0) this.f14617m).f48121m;
        l();
        return (p1.m0) this.f14617m;
    }

    public void b() {
        if (this.f14609d == 0) {
            return;
        }
        p1.m0 m0Var = (p1.m0) this.f14617m;
        m0Var.getClass();
        this.f14610e = m0Var.f48111b;
        this.f14611f = m0Var.f48116g.f48126a.f40310d;
        while (m0Var != null) {
            m0Var.i();
            m0Var = m0Var.f48121m;
        }
        this.f14617m = null;
        this.f14620p = null;
        this.f14618n = null;
        this.f14619o = null;
        this.f14609d = 0;
        l();
    }

    public p1.n0 c(i1.p0 p0Var, p1.m0 m0Var, long j10) {
        i1.p0 p0Var2;
        Object obj;
        long j11;
        long j12;
        long j13;
        long jQ;
        i1.n0 n0Var = (i1.n0) this.f14613h;
        p1.n0 n0Var2 = m0Var.f48116g;
        long j14 = (m0Var.f48124p + n0Var2.f48130e) - j10;
        if (!n0Var2.f48133h) {
            f2.c0 c0Var = n0Var2.f48126a;
            Object obj2 = c0Var.f40307a;
            int i10 = c0Var.f40311e;
            p0Var.g(obj2, n0Var);
            boolean z10 = n0Var2.f48132g;
            if (!c0Var.b()) {
                if (i10 != -1) {
                    n0Var.f(i10);
                }
                int iE = n0Var.e(i10);
                n0Var.g(i10);
                if (iE != n0Var.f42588g.a(i10).f42490a) {
                    return e(p0Var, c0Var.f40307a, c0Var.f40311e, iE, n0Var2.f48130e, c0Var.f40310d, z10);
                }
                p0Var.g(obj2, n0Var);
                n0Var.d(i10);
                n0Var.f42588g.a(i10).getClass();
                return f(p0Var, c0Var.f40307a, 0L, n0Var2.f48130e, c0Var.f40310d, false);
            }
            int i11 = c0Var.f40308b;
            int i12 = n0Var.f42588g.a(i11).f42490a;
            if (i12 == -1) {
                return null;
            }
            int iA = n0Var.f42588g.a(i11).a(c0Var.f40309c);
            if (iA < i12) {
                return e(p0Var, c0Var.f40307a, i11, iA, n0Var2.f48128c, c0Var.f40310d, z10);
            }
            long jLongValue = n0Var2.f48128c;
            if (jLongValue == C.TIME_UNSET) {
                Pair pairJ = p0Var.j((i1.o0) this.f14614i, n0Var, n0Var.f42584c, C.TIME_UNSET, Math.max(0L, j14));
                p0Var2 = p0Var;
                if (pairJ == null) {
                    return null;
                }
                jLongValue = ((Long) pairJ.second).longValue();
            } else {
                p0Var2 = p0Var;
            }
            int i13 = c0Var.f40308b;
            p0Var2.g(obj2, n0Var);
            n0Var.d(i13);
            n0Var.f42588g.a(i13).getClass();
            return f(p0Var, c0Var.f40307a, Math.max(0L, jLongValue), n0Var2.f48128c, c0Var.f40310d, z10);
        }
        i1.n0 n0Var3 = (i1.n0) this.f14613h;
        p1.n0 n0Var4 = m0Var.f48116g;
        f2.c0 c0Var2 = n0Var4.f48126a;
        long j15 = n0Var4.f48128c;
        int iD = p0Var.d(p0Var.b(c0Var2.f40307a), (i1.n0) this.f14613h, (i1.o0) this.f14614i, this.f14607b, this.f14608c);
        if (iD != -1) {
            int i14 = p0Var.f(iD, n0Var3, true).f42584c;
            Object obj3 = n0Var3.f42583b;
            obj3.getClass();
            long j16 = c0Var2.f40310d;
            if (p0Var.m(i14, (i1.o0) this.f14614i, 0L).f42628n == iD) {
                Pair pairJ2 = p0Var.j((i1.o0) this.f14614i, (i1.n0) this.f14613h, i14, C.TIME_UNSET, Math.max(0L, j14));
                if (pairJ2 != null) {
                    Object obj4 = pairJ2.first;
                    long jLongValue2 = ((Long) pairJ2.second).longValue();
                    p1.m0 m0Var2 = m0Var.f48121m;
                    if (m0Var2 == null || !m0Var2.f48111b.equals(obj4)) {
                        jQ = q(obj4);
                        if (jQ == -1) {
                            jQ = this.f14606a;
                            this.f14606a = 1 + jQ;
                        }
                    } else {
                        jQ = m0Var2.f48116g.f48126a.f40310d;
                    }
                    obj = obj4;
                    j11 = jLongValue2;
                    j13 = jQ;
                    j12 = -9223372036854775807L;
                }
            } else {
                obj = obj3;
                j11 = 0;
                j12 = 0;
                j13 = j16;
            }
            f2.c0 c0VarO = o(p0Var, obj, j11, j13, (i1.o0) this.f14614i, (i1.n0) this.f14613h);
            if (j12 != C.TIME_UNSET && j15 != C.TIME_UNSET) {
                int i15 = p0Var.g(c0Var2.f40307a, n0Var3).f42588g.f42525a;
                n0Var3.f42588g.getClass();
                if (i15 > 0) {
                    n0Var3.g(0);
                }
            }
            return d(p0Var, c0VarO, j12, j11);
        }
        return null;
    }

    public p1.n0 d(i1.p0 p0Var, f2.c0 c0Var, long j10, long j11) {
        p0Var.g(c0Var.f40307a, (i1.n0) this.f14613h);
        return c0Var.b() ? e(p0Var, c0Var.f40307a, c0Var.f40308b, c0Var.f40309c, j10, c0Var.f40310d, false) : f(p0Var, c0Var.f40307a, j11, j10, c0Var.f40310d, false);
    }

    public p1.n0 e(i1.p0 p0Var, Object obj, int i10, int i11, long j10, long j11, boolean z10) {
        f2.c0 c0Var = new f2.c0(obj, i10, i11, j11, -1);
        i1.n0 n0Var = (i1.n0) this.f14613h;
        long jA = p0Var.g(obj, n0Var).a(i10, i11);
        if (i11 == n0Var.e(i10)) {
            n0Var.f42588g.getClass();
        }
        n0Var.g(i10);
        long jMax = 0;
        if (jA != C.TIME_UNSET && 0 >= jA) {
            jMax = Math.max(0L, jA - 1);
        }
        return new p1.n0(c0Var, jMax, j10, C.TIME_UNSET, jA, z10, false, false, false, false);
    }

    public p1.n0 f(i1.p0 p0Var, Object obj, long j10, long j11, long j12, boolean z10) {
        long j13;
        i1.n0 n0Var = (i1.n0) this.f14613h;
        p0Var.g(obj, n0Var);
        int iB = n0Var.b(j10);
        boolean z11 = false;
        if (iB != -1) {
            n0Var.g(iB);
        } else if (n0Var.f42588g.f42525a > 0) {
            n0Var.g(0);
        }
        f2.c0 c0Var = new f2.c0(obj, j12, iB);
        if (!c0Var.b() && iB == -1) {
            z11 = true;
        }
        boolean zJ = j(p0Var, c0Var);
        boolean zI = i(p0Var, c0Var, z11);
        if (iB != -1) {
            n0Var.g(iB);
        }
        if (iB != -1) {
            n0Var.f(iB);
        }
        if (iB != -1) {
            n0Var.d(iB);
            j13 = 0;
        } else {
            j13 = -9223372036854775807L;
        }
        long j14 = (j13 == C.TIME_UNSET || j13 == Long.MIN_VALUE) ? n0Var.f42585d : j13;
        return new p1.n0(c0Var, (j14 == C.TIME_UNSET || j10 < j14) ? j10 : Math.max(0L, j14 - ((long) 1)), j11, j13, j14, z10, false, z11, zJ, zI);
    }

    public p1.m0 g() {
        return (p1.m0) this.f14619o;
    }

    public p1.n0 h(i1.p0 p0Var, p1.n0 n0Var) {
        long j10;
        long jA;
        f2.c0 c0Var = n0Var.f48126a;
        boolean zB = c0Var.b();
        int i10 = c0Var.f40311e;
        boolean z10 = !zB && i10 == -1;
        int i11 = c0Var.f40308b;
        boolean zJ = j(p0Var, c0Var);
        boolean zI = i(p0Var, c0Var, z10);
        Object obj = c0Var.f40307a;
        i1.n0 n0Var2 = (i1.n0) this.f14613h;
        p0Var.g(obj, n0Var2);
        if (c0Var.b() || i10 == -1) {
            j10 = -9223372036854775807L;
        } else {
            n0Var2.d(i10);
            j10 = 0;
        }
        if (c0Var.b()) {
            jA = n0Var2.a(i11, c0Var.f40309c);
        } else {
            jA = (j10 == C.TIME_UNSET || j10 == Long.MIN_VALUE) ? n0Var2.f42585d : j10;
        }
        if (c0Var.b()) {
            n0Var2.g(i11);
        } else if (i10 != -1) {
            n0Var2.g(i10);
        }
        return new p1.n0(c0Var, n0Var.f48127b, n0Var.f48128c, j10, jA, n0Var.f48131f, false, z10, zJ, zI);
    }

    public boolean i(i1.p0 p0Var, f2.c0 c0Var, boolean z10) {
        int iB = p0Var.b(c0Var.f40307a);
        return !p0Var.m(p0Var.f(iB, (i1.n0) this.f14613h, false).f42584c, (i1.o0) this.f14614i, 0L).f42624i && p0Var.d(iB, (i1.n0) this.f14613h, (i1.o0) this.f14614i, this.f14607b, this.f14608c) == -1 && z10;
    }

    public boolean j(i1.p0 p0Var, f2.c0 c0Var) {
        boolean z10 = !c0Var.b() && c0Var.f40311e == -1;
        Object obj = c0Var.f40307a;
        if (z10) {
            if (p0Var.m(p0Var.g(obj, (i1.n0) this.f14613h).f42584c, (i1.o0) this.f14614i, 0L).f42629o == p0Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public void k() {
        p1.m0 m0Var = (p1.m0) this.f14621q;
        if (m0Var == null || m0Var.h()) {
            this.f14621q = null;
            for (int i10 = 0; i10 < this.f14612g.size(); i10++) {
                p1.m0 m0Var2 = (p1.m0) this.f14612g.get(i10);
                if (!m0Var2.h()) {
                    this.f14621q = m0Var2;
                    return;
                }
            }
        }
    }

    public void l() {
        oa.e0 e0VarU = oa.j0.u();
        for (p1.m0 m0Var = (p1.m0) this.f14617m; m0Var != null; m0Var = m0Var.f48121m) {
            e0VarU.b(m0Var.f48116g.f48126a);
        }
        p1.m0 m0Var2 = (p1.m0) this.f14618n;
        ((l1.w) this.f14616k).c(new ld.f(this, e0VarU, m0Var2 == null ? null : m0Var2.f48116g.f48126a, 5));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [f2.e1, java.lang.Object] */
    public void m(long j10) {
        p1.m0 m0Var = (p1.m0) this.f14620p;
        if (m0Var != null) {
            go.k.t(m0Var.f48121m == null);
            if (m0Var.f48114e) {
                m0Var.f48110a.reevaluateBuffer(j10 - m0Var.f48124p);
            }
        }
    }

    public int n(p1.m0 m0Var) {
        m0Var.getClass();
        int i10 = 0;
        if (m0Var.equals((p1.m0) this.f14620p)) {
            return 0;
        }
        this.f14620p = m0Var;
        while (true) {
            m0Var = m0Var.f48121m;
            if (m0Var == null) {
                break;
            }
            if (m0Var == ((p1.m0) this.f14618n)) {
                p1.m0 m0Var2 = (p1.m0) this.f14617m;
                this.f14618n = m0Var2;
                this.f14619o = m0Var2;
                i10 = 3;
            }
            if (m0Var == ((p1.m0) this.f14619o)) {
                this.f14619o = (p1.m0) this.f14618n;
                i10 |= 2;
            }
            m0Var.i();
            this.f14609d--;
        }
        p1.m0 m0Var3 = (p1.m0) this.f14620p;
        m0Var3.getClass();
        if (m0Var3.f48121m != null) {
            m0Var3.b();
            m0Var3.f48121m = null;
            m0Var3.c();
        }
        l();
        return i10;
    }

    public f2.c0 p(i1.p0 p0Var, Object obj, long j10) {
        long jQ;
        int iB;
        Object obj2 = obj;
        i1.o0 o0Var = (i1.o0) this.f14614i;
        i1.n0 n0Var = (i1.n0) this.f14613h;
        int i10 = p0Var.g(obj2, n0Var).f42584c;
        Object obj3 = this.f14610e;
        if (obj3 == null || (iB = p0Var.b(obj3)) == -1 || p0Var.f(iB, n0Var, false).f42584c != i10) {
            p1.m0 m0Var = (p1.m0) this.f14617m;
            while (true) {
                if (m0Var == null) {
                    p1.m0 m0Var2 = (p1.m0) this.f14617m;
                    while (true) {
                        if (m0Var2 == null) {
                            jQ = q(obj2);
                            if (jQ != -1) {
                                break;
                            }
                            jQ = this.f14606a;
                            this.f14606a = 1 + jQ;
                            if (((p1.m0) this.f14617m) != null) {
                                break;
                            }
                            this.f14610e = obj2;
                            this.f14611f = jQ;
                            break;
                        }
                        int iB2 = p0Var.b(m0Var2.f48111b);
                        if (iB2 != -1 && p0Var.f(iB2, n0Var, false).f42584c == i10) {
                            jQ = m0Var2.f48116g.f48126a.f40310d;
                            break;
                        }
                        m0Var2 = m0Var2.f48121m;
                    }
                } else {
                    if (m0Var.f48111b.equals(obj2)) {
                        jQ = m0Var.f48116g.f48126a.f40310d;
                        break;
                    }
                    m0Var = m0Var.f48121m;
                }
            }
        } else {
            jQ = this.f14611f;
        }
        p0Var.g(obj2, n0Var);
        p0Var.n(n0Var.f42584c, o0Var);
        boolean z10 = false;
        for (int iB3 = p0Var.b(obj); iB3 >= o0Var.f42628n; iB3--) {
            p0Var.f(iB3, n0Var, true);
            boolean z11 = n0Var.f42588g.f42525a > 0;
            z10 |= z11;
            if (n0Var.c(n0Var.f42585d) != -1) {
                obj2 = n0Var.f42583b;
                obj2.getClass();
            }
            if (z10 && (!z11 || n0Var.f42585d != 0)) {
                break;
            }
        }
        return o(p0Var, obj2, j10, jQ, (i1.o0) this.f14614i, (i1.n0) this.f14613h);
    }

    public long q(Object obj) {
        for (int i10 = 0; i10 < this.f14612g.size(); i10++) {
            p1.m0 m0Var = (p1.m0) this.f14612g.get(i10);
            if (m0Var.f48111b.equals(obj)) {
                return m0Var.f48116g.f48126a.f40310d;
            }
        }
        return -1L;
    }

    public int r(i1.p0 p0Var) {
        i1.p0 p0Var2;
        p1.m0 m0Var;
        p1.m0 m0Var2 = (p1.m0) this.f14617m;
        if (m0Var2 == null) {
            return 0;
        }
        int iB = p0Var.b(m0Var2.f48111b);
        while (true) {
            p0Var2 = p0Var;
            iB = p0Var2.d(iB, (i1.n0) this.f14613h, (i1.o0) this.f14614i, this.f14607b, this.f14608c);
            while (true) {
                m0Var2.getClass();
                m0Var = m0Var2.f48121m;
                if (m0Var == null || m0Var2.f48116g.f48133h) {
                    break;
                }
                m0Var2 = m0Var;
            }
            if (iB == -1 || m0Var == null || p0Var2.b(m0Var.f48111b) != iB) {
                break;
            }
            m0Var2 = m0Var;
            p0Var = p0Var2;
        }
        int iN = n(m0Var2);
        m0Var2.f48116g = h(p0Var2, m0Var2.f48116g);
        return iN;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x009f  */
    public int s(i1.p0 p0Var, long j10, long j11, long j12) {
        p1.n0 n0VarH;
        boolean z10;
        p1.m0 m0Var = (p1.m0) this.f14617m;
        p1.m0 m0Var2 = null;
        while (true) {
            int i10 = 0;
            if (m0Var == null) {
                return 0;
            }
            p1.n0 n0Var = m0Var.f48116g;
            if (m0Var2 == null) {
                n0VarH = h(p0Var, n0Var);
            } else {
                p1.n0 n0VarC = c(p0Var, m0Var2, j10);
                if (n0VarC == null || n0Var.f48127b != n0VarC.f48127b || !n0Var.f48126a.equals(n0VarC.f48126a)) {
                    return n(m0Var2);
                }
                n0VarH = n0VarC;
            }
            long j13 = n0VarH.f48130e;
            long j14 = n0Var.f48128c;
            long j15 = n0Var.f48130e;
            m0Var.f48116g = n0VarH.a(j14);
            if (j15 != j13) {
                m0Var.k();
                long j16 = j13 == C.TIME_UNSET ? Long.MAX_VALUE : j13 + m0Var.f48124p;
                boolean z11 = m0Var == ((p1.m0) this.f14618n) && !m0Var.f48116g.f48132g && (j11 == Long.MIN_VALUE || j11 >= j16);
                boolean z12 = m0Var == ((p1.m0) this.f14619o) && (j12 == Long.MIN_VALUE || j12 >= j16);
                int iN = n(m0Var);
                if (iN != 0) {
                    return iN;
                }
                if (j15 == C.TIME_UNSET && n0Var.f48129d == Long.MIN_VALUE) {
                    long j17 = n0VarH.f48129d;
                    if (j17 == C.TIME_UNSET || j17 == Long.MIN_VALUE) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                } else {
                    z10 = false;
                }
                if (z11 && (j15 != C.TIME_UNSET || z10)) {
                    i10 = 1;
                }
                return z12 ? i10 | 2 : i10;
            }
            m0Var2 = m0Var;
            m0Var = m0Var.f48121m;
        }
    }

    public void u() {
        aa1 aa1Var = ca1.f13122b;
        z91 z91Var = new z91(4);
        for (dz1 dz1Var = (dz1) this.l; dz1Var != null; dz1Var = dz1Var.f13785m) {
            z91Var.a(dz1Var.f13780g.f14116a);
        }
        dz1 dz1Var2 = (dz1) this.f14617m;
        ((ys0) this.f14616k).e(new o1(this, z91Var, dz1Var2 == null ? null : dz1Var2.f13780g.f14116a, 14));
    }

    public long v(Object obj) {
        for (int i10 = 0; i10 < this.f14612g.size(); i10++) {
            dz1 dz1Var = (dz1) this.f14612g.get(i10);
            if (dz1Var.f13775b.equals(obj)) {
                return dz1Var.f13780g.f14116a.f19362d;
            }
        }
        return -1L;
    }

    public int w(ci ciVar) {
        ci ciVar2;
        dz1 dz1Var;
        dz1 dz1Var2 = (dz1) this.l;
        if (dz1Var2 == null) {
            return 0;
        }
        int iE = ciVar.e(dz1Var2.f13775b);
        while (true) {
            ciVar2 = ciVar;
            iE = ciVar2.l(iE, (ug) this.f14613h, (ih) this.f14614i, this.f14607b, this.f14608c);
            while (true) {
                dz1Var = dz1Var2.f13785m;
                if (dz1Var == null || dz1Var2.f13780g.f14121f) {
                    break;
                }
                dz1Var2 = dz1Var;
            }
            if (iE == -1 || dz1Var == null || ciVar2.e(dz1Var.f13775b) != iE) {
                break;
            }
            dz1Var2 = dz1Var;
            ciVar = ciVar2;
        }
        int iR = R(dz1Var2);
        dz1Var2.f13780g = W(ciVar2, dz1Var2.f13780g);
        return iR;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007b  */
    /* JADX WARN: Code duplicated, block: B:68:0x017f  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e7  */
    public ez1 x(ci ciVar, dz1 dz1Var, long j10) {
        int i10;
        int i11;
        ci ciVar2;
        ug ugVar;
        int i12;
        long j11;
        long jLongValue;
        long jMax;
        int i13;
        ih ihVar;
        Object obj;
        long j12;
        long j13;
        long j14;
        long jMax2;
        long jV;
        ug ugVar2 = (ug) this.f14613h;
        ez1 ez1Var = dz1Var.f13780g;
        long j15 = dz1Var.f13788p;
        long j16 = ez1Var.f14120e;
        long j17 = ez1Var.f14119d;
        r32 r32Var = ez1Var.f14116a;
        boolean z10 = ez1Var.f14121f;
        long j18 = (j15 + j16) - j10;
        long j19 = C.TIME_UNSET;
        if (z10) {
            Object obj2 = r32Var.f19359a;
            int iE = ciVar.e(obj2);
            ug ugVar3 = (ug) this.f14613h;
            ih ihVar2 = (ih) this.f14614i;
            long j20 = 0;
            int iL = ciVar.l(iE, ugVar3, ihVar2, this.f14607b, this.f14608c);
            if (iL == -1) {
                return null;
            }
            int i14 = ciVar.d(iL, ugVar3, true).f20772c;
            Object obj3 = ugVar3.f20771b;
            obj3.getClass();
            long j21 = r32Var.f19362d;
            if (ciVar.b(i14, ihVar2, 0L).f15754k == iL) {
                int i15 = ugVar3.f20772c;
                if (ugVar3.f20773d == C.TIME_UNSET) {
                    ciVar.b(i15, ihVar2, 0L);
                    if (!ihVar2.f15750g || ihVar2.f15752i) {
                        jMax2 = -9223372036854775807L;
                    } else {
                        jMax2 = Math.max(0L, j18);
                    }
                } else {
                    jMax2 = -9223372036854775807L;
                }
                Pair pairN = ciVar.n(ihVar2, ugVar3, i14, C.TIME_UNSET, jMax2);
                if (pairN == null) {
                    return null;
                }
                Object obj4 = pairN.first;
                long jLongValue2 = ((Long) pairN.second).longValue();
                dz1 dz1Var2 = dz1Var.f13785m;
                if (dz1Var2 == null || !dz1Var2.f13775b.equals(obj4)) {
                    jV = v(obj4);
                    if (jV == -1) {
                        jV = this.f14606a;
                        this.f14606a = 1 + jV;
                    }
                } else {
                    jV = dz1Var2.f13780g.f14116a.f19362d;
                }
                ihVar = ihVar2;
                obj = obj4;
                j13 = jV;
                j20 = jLongValue2;
                j12 = jMax2;
                j14 = -9223372036854775807L;
            } else {
                ihVar = ihVar2;
                obj = obj3;
                j12 = -9223372036854775807L;
                j13 = j21;
                j14 = 0;
            }
            r32 r32VarT = t(ciVar, obj, j13, ihVar, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00d5: INVOKE (r2v19 'r32VarT' com.google.android.gms.internal.ads.r32) = 
                  (r25v0 'ciVar' com.google.android.gms.internal.ads.ci A[IMMUTABLE_TYPE, METHOD_ARGUMENT])
                  (r2v18 'obj' java.lang.Object)
                  (r3v17 'j13' long)
                  (r5v16 'ihVar' com.google.android.gms.internal.ads.ih)
                  (r3v15 ?? I:??[OBJECT, ARRAY])
                 STATIC call: com.google.android.gms.internal.ads.fz1.t(com.google.android.gms.internal.ads.ci, java.lang.Object, long, com.google.android.gms.internal.ads.ih, com.google.android.gms.internal.ads.ug):com.google.android.gms.internal.ads.r32 A[DECLARE_VAR, MD:(com.google.android.gms.internal.ads.ci, java.lang.Object, long, com.google.android.gms.internal.ads.ih, com.google.android.gms.internal.ads.ug):com.google.android.gms.internal.ads.r32 (m)] (LINE:214) in method: com.google.android.gms.internal.ads.fz1.x(com.google.android.gms.internal.ads.ci, com.google.android.gms.internal.ads.dz1, long):com.google.android.gms.internal.ads.ez1, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:414)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:402)
                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:352)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v15 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 579
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fz1.x(com.google.android.gms.internal.ads.ci, com.google.android.gms.internal.ads.dz1, long):com.google.android.gms.internal.ads.ez1");
        }

        public ez1 y(ci ciVar, Object obj, int i10, int i11, long j10, long j11) {
            int i12;
            r32 r32Var = new r32(obj, i10, i11, j11, -1);
            ug ugVar = (ug) this.f14613h;
            long jB = ciVar.o(obj, ugVar).b(i10, i11);
            a aVarA = ugVar.f20775f.a(i10);
            int i13 = 0;
            while (true) {
                int[] iArr = aVarA.f11787d;
                if (i13 >= iArr.length || (i12 = iArr[i13]) == 0 || i12 == 1) {
                    break;
                }
                i13++;
            }
            if (i11 == i13) {
                ugVar.f20775f.getClass();
            }
            ugVar.c(i10);
            long jMax = 0;
            if (jB != C.TIME_UNSET && jB <= 0) {
                jMax = Math.max(0L, (-1) + jB);
            }
            return new ez1(r32Var, jMax, C.TIME_UNSET, j10, jB, false, false, false);
        }

        public ez1 z(ci ciVar, Object obj, long j10, long j11, long j12, long j13) {
            ug ugVar = (ug) this.f14613h;
            ciVar.o(obj, ugVar);
            ugVar.getClass();
            r32 r32Var = new r32(obj, j13, -1);
            boolean z10 = !r32Var.b();
            boolean zA = A(ciVar, r32Var);
            boolean zB = B(ciVar, r32Var, z10);
            long jC = C(ciVar, r32Var);
            return new ez1(r32Var, (jC == C.TIME_UNSET || j10 < jC) ? j10 : Math.max(0L, (-1) + jC), j11, j12, jC, z10, zA, zB);
        }

        public fz1(q1.f fVar, l1.w wVar, k3.j jVar, p1.j jVar2) {
            this.f14615j = fVar;
            this.f14616k = wVar;
            this.l = jVar;
            this.f14613h = new i1.n0();
            this.f14614i = new i1.o0();
            this.f14612g = new ArrayList();
        }
    }
