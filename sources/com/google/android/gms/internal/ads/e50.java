package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e50 extends o70 {
    public final hz S;
    public final vu0 T;
    public final a50 U;
    public final f50 V;
    public final fx1 W;
    public final fx1 X;
    public final fx1 Y;
    public final fx1 Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final fx1 f13839a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final fx1 f13840b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final fx1 f13841c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final fx1 f13842d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final fx1 f13843e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final fx1 f13844f0;
    public final fx1 g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final fx1 f13845h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final fx1 f13846i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final fx1 f13847j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final fx1 f13848k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final fx1 f13849l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final fx1 f13850m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final fx1 f13851n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final fx1 f13852o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final er0 f13853p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final fx1 f13854q0;
    public final fx1 r0;

    public e50(a50 a50Var, f50 f50Var, vu0 vu0Var, hz hzVar) {
        super(21);
        this.U = a50Var;
        this.V = f50Var;
        this.S = hzVar;
        this.T = vu0Var;
        t80 t80Var = new t80(vu0Var, 0);
        fx1 fx1Var = f50Var.f14235j;
        ei eiVar = a50Var.G0;
        fx1 fx1VarA = fx1.a(new p60(fx1Var, t80Var, 1));
        fx1 fx1VarA2 = fx1.a(new g90(fx1VarA, 7));
        fx1 fx1VarA3 = fx1.a(new v50(a50Var.H0, 12));
        fx1 fx1VarA4 = fx1.a(new g70(t80Var, 0));
        u40 u40Var = a50Var.f11865h;
        ei eiVar2 = v71.l;
        fx1 fx1VarA5 = fx1.a(new fz(u40Var, fx1VarA4, eiVar2, 1));
        o40 o40Var = a50Var.f11864g;
        fx1 fx1VarA6 = fx1.a(new e70(fx1VarA3, fx1.a(new a70(o40Var, fx1VarA5, 0)), a50Var.f11856c, fx1.a(new g40(fx1VarA5, fx1VarA3, 3)), a50Var.f11862f));
        this.W = fx1VarA6;
        fx1 fx1VarA7 = fx1.a(new g40(fx1VarA6, fx1VarA4, 5));
        u70 u70Var = new u70(hzVar, 3);
        e60 e60Var = new e60(new e60(u70Var, 14), 15);
        int i10 = lx1.f17149c;
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList2.add(f50Var.f14245u);
        arrayList2.add(f50Var.f14246v);
        arrayList.add(fx1VarA2);
        arrayList2.add(fx1VarA7);
        arrayList.add(e60Var);
        fx1 fx1VarA8 = fx1.a(new ca0(new lx1(arrayList, arrayList2), 3));
        this.X = fx1VarA8;
        fx1 fx1VarA9 = fx1.a(ps1.f18799g);
        this.Y = fx1VarA9;
        fx1 fx1Var2 = a50Var.f11856c;
        fx1 fx1VarA10 = fx1.a(new a70(fx1VarA9, (kx1) fx1Var2, 4));
        t80 t80Var2 = new t80(vu0Var, 3);
        t80 t80Var3 = new t80(vu0Var, 2);
        o40 o40Var2 = a50Var.f11864g;
        fx1 fx1VarA11 = fx1.a(new v50(o40Var2, 24));
        fx1 fx1VarA12 = fx1.a(rb0.f19504g);
        fx1 fx1VarA13 = fx1.a(new n60(o40Var2, a50Var.F, fx1VarA11, fx1VarA12, a50Var.E0, a50Var.f11858d));
        fx1 fx1VarA14 = fx1.a(new n60(a50Var.N, a50Var.M, t80Var, t80Var3, fx1VarA13, f50Var.l));
        u70 u70Var2 = new u70(hzVar, 0);
        fx1 fx1VarA15 = fx1.a(new a70(fx1VarA9, (kx1) fx1Var2, 9));
        ArrayList arrayList3 = new ArrayList(1);
        ArrayList arrayList4 = new ArrayList(1);
        arrayList4.add(f50Var.A);
        arrayList3.add(fx1VarA15);
        fx1 fx1VarA16 = fx1.a(new fz(new lx1(arrayList3, arrayList4), t80Var, t80Var2, 5));
        fx1 fx1VarA17 = fx1.a(new e60(t80Var2, 8));
        this.Z = fx1VarA17;
        fx1 fx1VarA18 = fx1.a(new v60(a50Var.f11864g, a50Var.f11856c, a50Var.f11858d, t80Var2, t80Var, f50Var.f14240p, fx1VarA14, u70Var2, u70Var, a50Var.J, f50Var.f14241q, f50Var.l, f50Var.f14250z, fx1VarA16, fx1VarA17, f50Var.f14236k));
        this.f13839a0 = fx1VarA18;
        r40 r40Var = new r40(fx1VarA18, 24);
        g90 g90Var = new g90(fx1.a(new p60(t80Var, a50Var.Z, 0)), 11);
        ArrayList arrayList5 = new ArrayList(4);
        ArrayList arrayList6 = new ArrayList(2);
        arrayList5.add(f50Var.f14247w);
        arrayList6.add(f50Var.f14248x);
        arrayList6.add(f50Var.f14249y);
        arrayList5.add(fx1VarA10);
        arrayList5.add(r40Var);
        arrayList5.add(g90Var);
        fx1 fx1VarA19 = fx1.a(new ca0(new lx1(arrayList5, arrayList6), 4));
        this.f13840b0 = fx1VarA19;
        fx1 fx1VarA20 = fx1.a(new j90(a50Var.f11864g, a50Var.D0, a50Var.f11874m, t80Var2, t80Var, a50Var.L, eiVar2));
        fx1 fx1VarA21 = fx1.a(new g90(fx1VarA20, 5));
        int i11 = 3;
        fx1 fx1VarA22 = fx1.a(new a70(fx1VarA9, (kx1) fx1Var2, i11));
        fx1 fx1Var3 = a50Var.f11899z0;
        z90 z90Var = f50Var.f14228f;
        fx1 fx1VarA23 = fx1.a(new g90(fx1.a(new w70(fx1Var3, z90Var, 1)), i11));
        r40 r40Var2 = new r40(fx1VarA18, 23);
        ArrayList arrayList7 = new ArrayList(5);
        ArrayList arrayList8 = new ArrayList(3);
        arrayList7.add(f50Var.B);
        arrayList7.add(f50Var.C);
        arrayList8.add(f50Var.D);
        arrayList8.add(f50Var.E);
        arrayList7.add(fx1VarA21);
        arrayList7.add(fx1VarA22);
        arrayList8.add(fx1VarA23);
        arrayList7.add(r40Var2);
        fx1 fx1VarA24 = fx1.a(new ca0(new lx1(arrayList7, arrayList8), 0));
        this.f13841c0 = fx1VarA24;
        o40 o40Var3 = a50Var.f11864g;
        u40 u40Var2 = a50Var.f11865h;
        fx1 fx1Var4 = a50Var.f11874m;
        fx1 fx1VarA25 = fx1.a(new d80(o40Var3, u40Var2, t80Var, u70Var, fx1Var4));
        this.f13842d0 = fx1VarA25;
        fx1 fx1VarA26 = fx1.a(new d80((kx1) o40Var3, (gx1) u70Var, (gx1) t80Var, (kx1) u40Var2, (kx1) fx1VarA25, 0));
        this.f13843e0 = fx1VarA26;
        r40 r40Var3 = new r40(fx1VarA26, 7);
        e60 e60Var2 = new e60(new fz(u70Var, fx1Var4, t80Var, 2), 3);
        int i12 = 6;
        fx1 fx1VarA27 = fx1.a(new g90(fx1VarA20, i12));
        fx1 fx1VarA28 = fx1.a(new a70(fx1VarA9, (kx1) fx1Var2, i12));
        fx1 fx1VarA29 = fx1.a(new v50(f50Var.f14238n, 14));
        r40 r40Var4 = new r40(fx1VarA16, 12);
        r40 r40Var5 = new r40(fx1VarA18, 26);
        fx1 fx1VarA30 = fx1.a(new g40(fx1VarA6, fx1VarA4, 4));
        ArrayList arrayList9 = new ArrayList(9);
        ArrayList arrayList10 = new ArrayList(3);
        arrayList9.add(f50Var.F);
        arrayList9.add(f50Var.G);
        arrayList10.add(f50Var.H);
        arrayList10.add(f50Var.I);
        arrayList9.add(r40Var3);
        arrayList9.add(e60Var2);
        arrayList9.add(fx1VarA27);
        arrayList9.add(fx1VarA28);
        arrayList9.add(fx1VarA29);
        arrayList9.add(r40Var4);
        arrayList9.add(r40Var5);
        arrayList10.add(fx1VarA30);
        fx1 fx1VarA31 = fx1.a(new ca0(new lx1(arrayList9, arrayList10), 2));
        this.f13844f0 = fx1VarA31;
        r40 r40Var6 = new r40(fx1VarA18, 29);
        ArrayList arrayList11 = new ArrayList(1);
        ArrayList arrayList12 = new ArrayList(1);
        arrayList12.add(f50Var.J);
        arrayList11.add(r40Var6);
        fx1 fx1VarA32 = fx1.a(new ca0(new lx1(arrayList11, arrayList12), 19));
        this.g0 = fx1VarA32;
        r40 r40Var7 = new r40(fx1.a(new p60(t80Var, a50Var.N, 2)), 22);
        ArrayList arrayList13 = new ArrayList(1);
        ArrayList arrayList14 = new ArrayList(1);
        arrayList14.add(f50Var.K);
        arrayList13.add(r40Var7);
        fx1 fx1VarA33 = fx1.a(new ca0(new lx1(arrayList13, arrayList14), 21));
        this.f13845h0 = fx1VarA33;
        fx1 fx1VarA34 = fx1.a(new a70(fx1VarA9, (kx1) fx1Var2, 10));
        ArrayList arrayList15 = new ArrayList(1);
        ArrayList arrayList16 = new ArrayList(1);
        arrayList16.add(f50Var.L);
        arrayList15.add(fx1VarA34);
        fx1 fx1VarA35 = fx1.a(new ca0(new lx1(arrayList15, arrayList16), 20));
        this.f13846i0 = fx1VarA35;
        fx1 fx1VarA36 = fx1.a(new a70(fx1VarA9, (kx1) fx1Var2, 7));
        r40 r40Var8 = new r40(fx1VarA16, 13);
        ArrayList arrayList17 = new ArrayList(2);
        ArrayList arrayList18 = new ArrayList(1);
        arrayList18.add(f50Var.S);
        arrayList17.add(fx1VarA36);
        arrayList17.add(r40Var8);
        fx1 fx1VarA37 = fx1.a(new ca0(new lx1(arrayList17, arrayList18), 8));
        fx1 fx1VarA38 = fx1.a(new g90(fx1VarA20, 2));
        r40 r40Var9 = new r40(fx1VarA18, 28);
        ArrayList arrayList19 = new ArrayList(2);
        ArrayList arrayList20 = new ArrayList(1);
        arrayList20.add(f50Var.T);
        arrayList19.add(fx1VarA38);
        arrayList19.add(r40Var9);
        fx1 fx1VarA39 = fx1.a(new l40((kx1) t80Var, (kx1) fx1VarA31, (kx1) fx1VarA37, (kx1) fx1.a(new ca0(new lx1(arrayList19, arrayList20), 10)), 3));
        this.f13847j0 = fx1VarA39;
        fx1 fx1VarA40 = fx1.a(new g90(fx1VarA, 8));
        this.f13848k0 = fx1VarA40;
        g90 g90Var2 = new g90(fx1.a(new r40(fx1VarA19, 11)), 1);
        fx1 fx1VarA41 = fx1.a(new a70(fx1VarA9, (kx1) fx1Var2, 8));
        ArrayList arrayList21 = new ArrayList(2);
        ArrayList arrayList22 = new ArrayList(1);
        arrayList22.add(f50Var.V);
        arrayList21.add(g90Var2);
        arrayList21.add(fx1VarA41);
        fx1 fx1VarA42 = fx1.a(new ca0(new lx1(arrayList21, arrayList22), 9));
        this.f13849l0 = fx1VarA42;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList23 = new ArrayList(1);
        arrayList23.add(f50Var.W);
        this.f13850m0 = fx1.a(new yc0(new lx1(list, arrayList23)));
        r40 r40Var10 = new r40(fx1VarA39, 5);
        fx1 fx1VarA43 = fx1.a(new g90(fx1VarA20, 4));
        ArrayList arrayList24 = new ArrayList(1);
        ArrayList arrayList25 = new ArrayList(1);
        arrayList25.add(r40Var10);
        arrayList24.add(fx1VarA43);
        this.f13851n0 = fx1.a(new ca0(new lx1(arrayList24, arrayList25), 13));
        fx1 fx1VarA44 = fx1.a(new a70(fx1VarA9, (kx1) fx1Var2, 5));
        r40 r40Var11 = new r40(fx1VarA18, 25);
        ArrayList arrayList26 = new ArrayList(2);
        ArrayList arrayList27 = new ArrayList(1);
        arrayList27.add(f50Var.X);
        arrayList26.add(fx1VarA44);
        arrayList26.add(r40Var11);
        ca0 ca0Var = new ca0(new lx1(arrayList26, arrayList27), 1);
        fx1 fx1VarA45 = fx1.a(new g90(fx1VarA20, 0));
        ArrayList arrayList28 = new ArrayList(1);
        List list2 = Collections.EMPTY_LIST;
        arrayList28.add(fx1VarA45);
        this.f13852o0 = fx1.a(new fz(ca0Var, new lx1(arrayList28, list2), a50Var.f11858d, 4));
        r40 r40Var12 = new r40(hzVar, fx1VarA39, 6);
        r40 r40Var13 = new r40(hzVar, fx1VarA26, 8);
        v70 v70Var = new v70(hzVar, f50Var.f14235j, a50Var.f11865h, t80Var, f50Var.f14228f);
        r40 r40Var14 = new r40(fx1VarA18, 27);
        ArrayList arrayList29 = new ArrayList(9);
        ArrayList arrayList30 = new ArrayList(5);
        arrayList29.add(f50Var.M);
        arrayList30.add(f50Var.N);
        arrayList29.add(f50Var.O);
        arrayList29.add(f50Var.P);
        arrayList30.add(f50Var.Z);
        arrayList30.add(f50Var.f14219a0);
        arrayList30.add(f50Var.f14221b0);
        arrayList29.add(f50Var.Q);
        arrayList29.add(f50Var.R);
        arrayList30.add(r40Var12);
        arrayList29.add(r40Var13);
        arrayList29.add(v70Var);
        arrayList29.add(fx1VarA40);
        arrayList29.add(r40Var14);
        int i13 = 2;
        oz ozVar = new oz(hzVar, new lx1(arrayList29, arrayList30), i13);
        d80 d80Var = new d80(t80Var, new t80(vu0Var, 1), f50Var.f14239o, t80Var3, f50Var.f14230g);
        ArrayList arrayList31 = new ArrayList(1);
        ArrayList arrayList32 = new ArrayList(1);
        arrayList32.add(f50Var.f14225d0);
        arrayList31.add(f50Var.f14227e0);
        w80 w80Var = new w80(t80Var2, t80Var, fx1VarA8, ozVar, f50Var.f14223c0, d80Var, fx1VarA9, new ca0(new lx1(arrayList31, arrayList32), 6), fx1VarA32, fx1VarA17, a50Var.f11879o0);
        u70 u70Var3 = new u70(hzVar, 1);
        u70 u70Var4 = new u70(hzVar, 2);
        er0 er0Var = new er0();
        this.f13853p0 = er0Var;
        fx1 fx1Var5 = f50Var.f14235j;
        er0.a(er0Var, new d80((kx1) fx1Var5, (kx1) f50Var.Y, (gx1) f50Var.f14228f, (kx1) new e60(new q70(w80Var, fx1Var5, u70Var3, u70Var2, u70Var, u70Var4, f50Var.f14229f0, fx1VarA33, er0Var, a50Var.f11856c), 2), (kx1) a50Var.f11874m, 15));
        r40 r40Var15 = new r40(fx1VarA39, 9);
        int i14 = 6;
        r40 r40Var16 = new r40(fx1.a(new e60(new w70(o40Var, z90Var, 0), 6)), 10);
        e60 e60Var3 = new e60(new oz(u70Var, fx1Var2, 7), 4);
        fx1 fx1VarA46 = fx1.a(new g40(fx1VarA6, fx1VarA4, i14));
        ArrayList arrayList33 = new ArrayList(1);
        ArrayList arrayList34 = new ArrayList(4);
        arrayList34.add(f50Var.f14232h0);
        arrayList34.add(r40Var15);
        arrayList33.add(r40Var16);
        arrayList34.add(e60Var3);
        arrayList34.add(fx1VarA46);
        lx1 lx1Var = new lx1(arrayList33, arrayList34);
        fx1 fx1Var6 = f50Var.f14235j;
        fx1 fx1VarA47 = fx1.a(new fz(fx1Var6, lx1Var, t80Var, i14));
        this.f13854q0 = fx1VarA47;
        fx1 fx1VarA48 = fx1.a(new fz(fx1Var6, u40Var, t80Var, 3));
        fx1 fx1VarA49 = fx1.a(new a70((kx1) fx1Var6, fx1VarA48, i13));
        v50 v50Var = new v50(f50Var.f14242r, 13);
        ArrayList arrayList35 = new ArrayList(1);
        ArrayList arrayList36 = new ArrayList(1);
        arrayList36.add(f50Var.f14234i0);
        arrayList35.add(v50Var);
        fx1 fx1VarA50 = fx1.a(new ca0(new lx1(arrayList35, arrayList36), 12));
        fx1 fx1Var7 = a50Var.f11862f;
        fx1 fx1Var8 = a50Var.f11874m;
        this.r0 = fx1.a(new fh0(fx1VarA24, fx1VarA19, f50Var.g0, fx1VarA42, f50Var.U, a50Var.f11856c, fx1VarA47, fx1VarA6, fx1VarA49, fx1VarA48, a50Var.J, fx1VarA50, a50Var.L, a50Var.N, fx1Var8, fx1VarA35, fx1VarA13, fx1VarA12, a50Var.f11879o0, fx1.a(new d80(t80Var2, t80Var, fx1Var7, fx1Var8, a50Var.f11858d)), fx1VarA17));
    }

    public final sa0 V() {
        ha1 ha1VarY = ia1.y(14);
        f50 f50Var = this.V;
        ha1VarY.f(f50Var.M.zzb());
        ha1VarY.g((Iterable) f50Var.N.zzb());
        ha1VarY.f(f50Var.O.zzb());
        ha1VarY.f(f50Var.P.zzb());
        hi0 hi0Var = (hi0) f50Var.f14231h.zzb();
        k00 k00Var = l00.f16608a;
        ic1.h(k00Var);
        Set setJ = tc0.j(hi0Var, k00Var);
        ic1.h(setJ);
        ha1VarY.g(setJ);
        ha1VarY.g(f50Var.f14218a.f12724f);
        Set set = Collections.EMPTY_SET;
        ic1.h(set);
        ha1VarY.g(set);
        ha1VarY.f(f50Var.Q.zzb());
        ha1VarY.f(f50Var.R.zzb());
        e80 e80Var = (e80) this.f13847j0.zzb();
        k00 k00Var2 = l00.f16615h;
        Set setSingleton = Collections.singleton(new nc0(e80Var, k00Var2));
        ic1.h(setSingleton);
        ha1VarY.g(setSingleton);
        ha1VarY.f(new nc0((c80) this.f13843e0.zzb(), l00.f16613f));
        Context context = (Context) f50Var.f14235j.zzb();
        w90 w90Var = f50Var.f14220b;
        VersionInfoParcel versionInfoParcel = this.U.f11852a.f15965a;
        ic1.h(versionInfoParcel);
        du0 du0Var = (du0) this.T.f21275c;
        ic1.h(du0Var);
        ou0 ou0Var = w90Var.f21463b;
        ic1.h(ou0Var);
        ha1VarY.f(new nc0(new s70(context, versionInfoParcel, du0Var, ou0Var, 0), k00Var2));
        ha1VarY.f(this.f13848k0.zzb());
        ha1VarY.f(new nc0((u60) this.f13839a0.zzb(), k00Var));
        return this.S.l(ha1VarY.h());
    }

    public final p70 W() {
        vu0 vu0Var = this.T;
        ju0 ju0Var = (ju0) vu0Var.f21274b;
        ic1.h(ju0Var);
        du0 du0Var = (du0) vu0Var.f21275c;
        ic1.h(du0Var);
        pa0 pa0Var = (pa0) this.X.zzb();
        sa0 sa0VarV = V();
        f50 f50Var = this.V;
        ts0 ts0Var = f50Var.f14218a.f12732o;
        aa0 aa0Var = new aa0(du0Var, (String) vu0Var.f21276d, (sm0) f50Var.f14239o.zzb(), vu0Var.n(), (String) f50Var.f14230g.zzb());
        nb0 nb0Var = (nb0) this.Y.zzb();
        bc0 bc0Var = f50Var.f14218a;
        ha1 ha1VarY = ia1.y(2);
        ha1VarY.g(bc0Var.f12725g);
        dj0 dj0Var = (dj0) f50Var.f14233i.zzb();
        k00 k00Var = l00.f16608a;
        ic1.h(k00Var);
        ha1VarY.f(new nc0(dj0Var, k00Var));
        ua0 ua0Var = new ua0(ha1VarY.h());
        lc0 lc0Var = (lc0) this.g0.zzb();
        n90 n90Var = (n90) this.Z.zzb();
        a50 a50Var = this.U;
        k80 k80Var = new k80(ju0Var, du0Var, pa0Var, sa0VarV, ts0Var, aa0Var, nb0Var, ua0Var, lc0Var, n90Var, (ji0) a50Var.f11879o0.zzb());
        Context context = (Context) f50Var.f14235j.zzb();
        hz hzVar = this.S;
        eu0 eu0Var = (eu0) hzVar.f15435d;
        ic1.h(eu0Var);
        View view = (View) hzVar.f15434c;
        ic1.h(view);
        b30 b30Var = (b30) hzVar.f15436e;
        j80 j80Var = (j80) hzVar.f15433b;
        ne0 ne0Var = (ne0) f50Var.f14222c.f17399b;
        ic1.h(ne0Var);
        return new p70(k80Var, context, eu0Var, view, b30Var, j80Var, ne0Var, (rc0) this.f13845h0.zzb(), fx1.b(this.f13853p0), (Executor) a50Var.f11856c.zzb());
    }
}
