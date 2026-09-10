package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b50 extends j70 {
    public final vu0 S;
    public final lj1 T;
    public final d5.o U;
    public final a50 V;
    public final d50 W;
    public final fx1 X;
    public final fx1 Y;
    public final fx1 Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final fx1 f12636a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final fx1 f12637b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final fx1 f12638c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final fx1 f12639d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final fx1 f12640e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final fx1 f12641f0;
    public final fx1 g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final fx1 f12642h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final fx1 f12643i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final fx1 f12644j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final fx1 f12645k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final fx1 f12646l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final fx1 f12647m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final fx1 f12648n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final fx1 f12649o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final fx1 f12650p0;

    public b50(a50 a50Var, d50 d50Var, vu0 vu0Var, lj1 lj1Var, d5.o oVar) {
        super(21);
        this.V = a50Var;
        this.W = d50Var;
        this.S = vu0Var;
        this.T = lj1Var;
        this.U = oVar;
        t80 t80Var = new t80(vu0Var, 0);
        fx1 fx1Var = d50Var.f13410j;
        ei eiVar = a50Var.G0;
        int i10 = 1;
        fx1 fx1VarA = fx1.a(new p60(fx1Var, t80Var, i10));
        fx1 fx1VarA2 = fx1.a(new g90(fx1VarA, 7));
        fx1 fx1VarA3 = fx1.a(new v50(a50Var.H0, 12));
        fx1 fx1VarA4 = fx1.a(new g70(t80Var, 0));
        u40 u40Var = a50Var.f11865h;
        ei eiVar2 = x10.f21685k;
        fx1 fx1VarA5 = fx1.a(new fz(u40Var, fx1VarA4, eiVar2, i10));
        o40 o40Var = a50Var.f11864g;
        fx1 fx1VarA6 = fx1.a(new e70(fx1VarA3, fx1.a(new a70(o40Var, fx1VarA5, 0)), a50Var.f11856c, fx1.a(new g40(fx1VarA5, fx1VarA3, 3)), a50Var.f11862f));
        fx1 fx1VarA7 = fx1.a(new g40(fx1VarA6, fx1VarA4, 5));
        int i11 = lx1.f17149c;
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList2.add(d50Var.f13416q);
        arrayList2.add(d50Var.f13417r);
        arrayList.add(fx1VarA2);
        arrayList2.add(fx1VarA7);
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
        fx1 fx1VarA14 = fx1.a(new n60(a50Var.N, a50Var.M, t80Var, t80Var3, fx1VarA13, d50Var.f13406f));
        cd0 cd0Var = new cd0(lj1Var, 1);
        cd0 cd0Var2 = new cd0(lj1Var, 2);
        fx1 fx1VarA15 = fx1.a(new a70(fx1VarA9, (kx1) fx1Var2, 9));
        ArrayList arrayList3 = new ArrayList(1);
        ArrayList arrayList4 = new ArrayList(1);
        arrayList4.add(d50Var.f13422w);
        arrayList3.add(fx1VarA15);
        fx1 fx1VarA16 = fx1.a(new fz(new lx1(arrayList3, arrayList4), t80Var, t80Var2, 5));
        fx1 fx1VarA17 = fx1.a(new e60(t80Var2, 8));
        this.Z = fx1VarA17;
        o40 o40Var3 = a50Var.f11864g;
        fx1 fx1Var3 = a50Var.f11856c;
        fx1 fx1VarA18 = fx1.a(new v60(o40Var3, fx1Var3, a50Var.f11858d, t80Var2, t80Var, d50Var.f13413n, fx1VarA14, cd0Var, cd0Var2, a50Var.J, d50Var.f13414o, d50Var.f13406f, d50Var.f13421v, fx1VarA16, fx1VarA17, d50Var.l));
        r40 r40Var = new r40(fx1VarA18, 24);
        g90 g90Var = new g90(fx1.a(new p60(t80Var, a50Var.Z, 0)), 11);
        fx1 fx1Var4 = a50Var.D0;
        fx1 fx1Var5 = a50Var.f11874m;
        fx1 fx1VarA19 = fx1.a(new j90(o40Var3, fx1Var4, fx1Var5, t80Var2, t80Var, a50Var.L, eiVar2));
        int i12 = 6;
        fx1 fx1VarA20 = fx1.a(new g90(fx1VarA19, i12));
        fx1 fx1VarA21 = fx1.a(new a70(fx1VarA9, (kx1) fx1Var3, i12));
        fx1 fx1VarA22 = fx1.a(new v50(d50Var.f13409i, 14));
        r40 r40Var2 = new r40(fx1VarA16, 12);
        r40 r40Var3 = new r40(fx1VarA18, 26);
        fx1 fx1VarA23 = fx1.a(new g40(fx1VarA6, fx1VarA4, 4));
        u40 u40Var2 = a50Var.f11865h;
        fx1 fx1VarA24 = fx1.a(new d80(o40Var3, u40Var2, t80Var, cd0Var2, fx1Var5));
        this.f12636a0 = fx1VarA24;
        fx1 fx1VarA25 = fx1.a(new d80((kx1) o40Var3, (gx1) cd0Var2, (gx1) t80Var, (kx1) u40Var2, (kx1) fx1VarA24, 4));
        g90 g90Var2 = new g90(fx1VarA25, 19);
        ArrayList arrayList5 = new ArrayList(8);
        ArrayList arrayList6 = new ArrayList(3);
        arrayList5.add(d50Var.f13423x);
        arrayList5.add(d50Var.f13424y);
        arrayList6.add(d50Var.f13425z);
        arrayList6.add(d50Var.A);
        arrayList5.add(fx1VarA20);
        arrayList5.add(fx1VarA21);
        arrayList5.add(fx1VarA22);
        arrayList5.add(r40Var2);
        arrayList5.add(r40Var3);
        arrayList6.add(fx1VarA23);
        arrayList5.add(g90Var2);
        int i13 = 2;
        fx1 fx1VarA26 = fx1.a(new ca0(new lx1(arrayList5, arrayList6), i13));
        this.f12637b0 = fx1VarA26;
        t80 t80Var4 = new t80(vu0Var, 1);
        fx1 fx1VarA27 = fx1.a(new g90(fx1VarA19, i13));
        r40 r40Var4 = new r40(fx1VarA18, 28);
        ArrayList arrayList7 = new ArrayList(2);
        ArrayList arrayList8 = new ArrayList(1);
        arrayList8.add(d50Var.B);
        arrayList7.add(fx1VarA27);
        arrayList7.add(r40Var4);
        fx1 fx1VarA28 = fx1.a(new d80(fx1VarA26, t80Var, a50Var.f11858d, t80Var4, fx1.a(new ca0(new lx1(arrayList7, arrayList8), 10))));
        this.f12638c0 = fx1VarA28;
        oz ozVar = new oz(lj1Var, fx1VarA28, 12);
        o40 o40Var4 = a50Var.f11864g;
        z90 z90Var = d50Var.f13405e;
        fx1 fx1VarA29 = fx1.a(new n60(new w70(o40Var4, z90Var, 2), o40Var4, a50Var.f11896y, new cd0(lj1Var, 0), dv.f13733e, t80Var));
        this.f12639d0 = fx1VarA29;
        g90 g90Var3 = new g90(fx1VarA29, 25);
        ArrayList arrayList9 = new ArrayList(5);
        ArrayList arrayList10 = new ArrayList(3);
        arrayList9.add(d50Var.f13418s);
        arrayList10.add(d50Var.f13419t);
        arrayList10.add(d50Var.f13420u);
        arrayList9.add(fx1VarA10);
        arrayList9.add(r40Var);
        arrayList9.add(g90Var);
        arrayList10.add(ozVar);
        arrayList9.add(g90Var3);
        fx1 fx1VarA30 = fx1.a(new ca0(new lx1(arrayList9, arrayList10), 4));
        this.f12640e0 = fx1VarA30;
        fx1 fx1VarA31 = fx1.a(new g90(fx1VarA19, 5));
        fx1 fx1VarA32 = fx1.a(new a70(fx1VarA9, (kx1) fx1Var2, 3));
        fx1 fx1VarA33 = fx1.a(new g90(fx1.a(new w70(a50Var.f11899z0, z90Var, 1)), 3));
        r40 r40Var5 = new r40(fx1VarA18, 23);
        fx1 fx1VarA34 = fx1.a(new oz(a50Var.V, t80Var3, 11));
        g90 g90Var4 = new g90(fx1VarA34, 17);
        ArrayList arrayList11 = new ArrayList(6);
        ArrayList arrayList12 = new ArrayList(3);
        arrayList11.add(d50Var.C);
        arrayList11.add(d50Var.D);
        arrayList12.add(d50Var.E);
        arrayList12.add(d50Var.F);
        arrayList11.add(fx1VarA31);
        arrayList11.add(fx1VarA32);
        arrayList12.add(fx1VarA33);
        arrayList11.add(r40Var5);
        arrayList11.add(g90Var4);
        fx1 fx1VarA35 = fx1.a(new ca0(new lx1(arrayList11, arrayList12), 0));
        this.f12641f0 = fx1VarA35;
        r40 r40Var6 = new r40(fx1VarA18, 29);
        ArrayList arrayList13 = new ArrayList(1);
        ArrayList arrayList14 = new ArrayList(1);
        arrayList14.add(d50Var.G);
        arrayList13.add(r40Var6);
        this.g0 = fx1.a(new ca0(new lx1(arrayList13, arrayList14), 19));
        r40 r40Var7 = new r40(fx1.a(new p60(t80Var, a50Var.N, 2)), 22);
        ArrayList arrayList15 = new ArrayList(1);
        new ArrayList(1).add(d50Var.H);
        arrayList15.add(r40Var7);
        fx1 fx1VarA36 = fx1.a(new a70(fx1VarA9, (kx1) fx1Var2, 10));
        ArrayList arrayList16 = new ArrayList(1);
        ArrayList arrayList17 = new ArrayList(1);
        arrayList17.add(d50Var.I);
        arrayList16.add(fx1VarA36);
        lx1 lx1Var = new lx1(arrayList16, arrayList17);
        int i14 = 20;
        fx1 fx1VarA37 = fx1.a(new ca0(lx1Var, i14));
        this.f12642h0 = fx1VarA37;
        fx1 fx1VarA38 = fx1.a(new g90(fx1VarA, 8));
        r40 r40Var8 = new r40(fx1VarA18, 27);
        g90 g90Var5 = new g90(fx1VarA25, i14);
        fx1 fx1Var6 = d50Var.f13410j;
        v70 v70Var = new v70(fx1Var6, u40Var, t80Var, z90Var);
        ArrayList arrayList18 = new ArrayList(9);
        ArrayList arrayList19 = new ArrayList(4);
        arrayList18.add(d50Var.J);
        arrayList19.add(d50Var.K);
        arrayList18.add(d50Var.L);
        arrayList18.add(d50Var.M);
        arrayList19.add(d50Var.N);
        arrayList19.add(d50Var.O);
        arrayList19.add(d50Var.P);
        arrayList18.add(d50Var.Q);
        arrayList18.add(d50Var.R);
        arrayList18.add(fx1VarA38);
        arrayList18.add(r40Var8);
        arrayList18.add(g90Var5);
        arrayList18.add(v70Var);
        this.f12643i0 = fx1.a(new ca0(new lx1(arrayList18, arrayList19), 5));
        g90 g90Var6 = new g90(fx1.a(new r40(fx1VarA30, 11)), 1);
        fx1 fx1VarA39 = fx1.a(new a70(fx1VarA9, (kx1) fx1Var2, 8));
        g90 g90Var7 = new g90(fx1VarA25, 21);
        g90 g90Var8 = new g90(fx1VarA34, 18);
        fx1 fx1VarA40 = fx1.a(new d80(t80Var2, t80Var, a50Var.f11862f, a50Var.f11874m, a50Var.f11858d));
        g90 g90Var9 = new g90(fx1VarA40, 24);
        ArrayList arrayList20 = new ArrayList(5);
        ArrayList arrayList21 = new ArrayList(1);
        arrayList21.add(d50Var.T);
        arrayList20.add(g90Var6);
        arrayList20.add(fx1VarA39);
        arrayList20.add(g90Var7);
        arrayList20.add(g90Var8);
        arrayList20.add(g90Var9);
        fx1 fx1VarA41 = fx1.a(new ca0(new lx1(arrayList20, arrayList21), 9));
        this.f12644j0 = fx1VarA41;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList22 = new ArrayList(1);
        arrayList22.add(d50Var.U);
        this.f12645k0 = fx1.a(new yc0(new lx1(list, arrayList22)));
        fx1 fx1VarA42 = fx1.a(new g90(fx1VarA19, 4));
        g90 g90Var10 = new g90(fx1VarA28, 16);
        ArrayList arrayList23 = new ArrayList(1);
        ArrayList arrayList24 = new ArrayList(1);
        arrayList23.add(fx1VarA42);
        arrayList24.add(g90Var10);
        lx1 lx1Var2 = new lx1(arrayList23, arrayList24);
        int i15 = 13;
        this.f12646l0 = fx1.a(new ca0(lx1Var2, i15));
        fx1 fx1VarA43 = fx1.a(new a70(fx1VarA9, (kx1) fx1Var2, 5));
        r40 r40Var9 = new r40(fx1VarA18, 25);
        g90 g90Var11 = new g90(fx1VarA28, i15);
        fx1 fx1VarA44 = fx1.a(new w70(o40Var, d50Var.f13406f, 12));
        this.f12647m0 = fx1VarA44;
        g90 g90Var12 = new g90(fx1VarA44, 14);
        ArrayList arrayList25 = new ArrayList(3);
        ArrayList arrayList26 = new ArrayList(2);
        arrayList26.add(d50Var.V);
        arrayList25.add(fx1VarA43);
        arrayList25.add(r40Var9);
        arrayList26.add(g90Var11);
        arrayList25.add(g90Var12);
        ca0 ca0Var = new ca0(new lx1(arrayList25, arrayList26), 1);
        fx1 fx1VarA45 = fx1.a(new g90(fx1VarA19, 0));
        ArrayList arrayList27 = new ArrayList(1);
        List list2 = Collections.EMPTY_LIST;
        arrayList27.add(fx1VarA45);
        this.f12648n0 = fx1.a(new fz(ca0Var, new lx1(arrayList27, list2), a50Var.f11858d, 4));
        fx1 fx1VarA46 = fx1.a(new g40(fx1VarA6, fx1VarA4, 6));
        g90 g90Var13 = new g90(fx1VarA28, 23);
        List list3 = Collections.EMPTY_LIST;
        ArrayList arrayList28 = new ArrayList(3);
        arrayList28.add(d50Var.X);
        arrayList28.add(fx1VarA46);
        arrayList28.add(g90Var13);
        fx1 fx1VarA47 = fx1.a(new fz(fx1Var6, new lx1(list3, arrayList28), t80Var, 6));
        fx1 fx1VarA48 = fx1.a(new fz(fx1Var6, u40Var, t80Var, 3));
        fx1 fx1VarA49 = fx1.a(new a70((kx1) fx1Var6, fx1VarA48, 2));
        oz ozVar2 = new oz(lj1Var, fx1Var2, 13);
        ArrayList arrayList29 = new ArrayList(1);
        ArrayList arrayList30 = new ArrayList(1);
        arrayList30.add(d50Var.Y);
        arrayList29.add(ozVar2);
        this.f12649o0 = fx1.a(new fh0(fx1VarA35, fx1VarA30, d50Var.W, fx1VarA41, d50Var.S, a50Var.f11856c, fx1VarA47, fx1VarA6, fx1VarA49, fx1VarA48, a50Var.J, fx1.a(new ca0(new lx1(arrayList29, arrayList30), 12)), a50Var.L, a50Var.N, a50Var.f11874m, fx1VarA37, fx1VarA13, fx1VarA12, a50Var.f11879o0, fx1VarA40, fx1VarA17));
        g90 g90Var14 = new g90(fx1.a(new g90(fx1VarA8, 28)), 26);
        g90 g90Var15 = new g90(fx1VarA44, 15);
        ArrayList arrayList31 = new ArrayList(1);
        ArrayList arrayList32 = new ArrayList(1);
        arrayList32.add(g90Var14);
        arrayList31.add(g90Var15);
        this.f12650p0 = fx1.a(new g40(fx1VarA41, fx1.a(new ca0(new lx1(arrayList31, arrayList32), 18)), 8));
    }

    public final ma0 V() {
        return (ma0) this.f12637b0.zzb();
    }

    public final l70 W() {
        vu0 vu0Var = this.S;
        ju0 ju0Var = (ju0) vu0Var.f21274b;
        ic1.h(ju0Var);
        du0 du0Var = (du0) vu0Var.f21275c;
        ic1.h(du0Var);
        pa0 pa0Var = (pa0) this.X.zzb();
        sa0 sa0Var = (sa0) this.f12643i0.zzb();
        d50 d50Var = this.W;
        ts0 ts0Var = d50Var.f13402b.f12732o;
        aa0 aa0Var = new aa0(du0Var, (String) vu0Var.f21276d, (sm0) d50Var.f13411k.zzb(), vu0Var.n(), (String) d50Var.f13407g.zzb());
        nb0 nb0Var = (nb0) this.Y.zzb();
        bc0 bc0Var = d50Var.f13402b;
        ha1 ha1VarY = ia1.y(2);
        ha1VarY.g(bc0Var.f12725g);
        dj0 dj0Var = (dj0) d50Var.f13408h.zzb();
        k00 k00Var = l00.f16608a;
        ic1.h(k00Var);
        ha1VarY.f(new nc0(dj0Var, k00Var));
        ua0 ua0Var = new ua0(ha1VarY.h());
        lc0 lc0Var = (lc0) this.g0.zzb();
        n90 n90Var = (n90) this.Z.zzb();
        a50 a50Var = this.V;
        k80 k80Var = new k80(ju0Var, du0Var, pa0Var, sa0Var, ts0Var, aa0Var, nb0Var, ua0Var, lc0Var, n90Var, (ji0) a50Var.f11879o0.zzb());
        Context context = (Context) d50Var.f13410j.zzb();
        lj1 lj1Var = this.T;
        b30 b30Var = (b30) lj1Var.f17037c;
        int i10 = this.U.f38703b;
        fx1 fx1Var = a50Var.f11874m;
        yh0 yh0Var = (yh0) fx1Var.zzb();
        ic1.h(ju0Var);
        lj1 lj1Var2 = new lj1((Object) yh0Var, false, (Object) ju0Var, 14);
        gd0 gd0Var = (gd0) lj1Var.f17036b;
        ha1 ha1VarY2 = ia1.y(3);
        Set setP = lj1Var.p((m90) this.f12638c0.zzb());
        ic1.h(setP);
        ha1VarY2.g(setP);
        kd0 kd0Var = (kd0) this.f12639d0.zzb();
        k00 k00Var2 = l00.f16615h;
        ha1VarY2.f(new nc0(kd0Var, k00Var2));
        ha1VarY2.f(new nc0((aw0) this.f12647m0.zzb(), k00Var2));
        return new l70(k80Var, context, b30Var, i10, lj1Var2, gd0Var, new xv0(ha1VarY2.h()), (ka0) this.f12648n0.zzb(), ((f00) a50Var.E.zzb()).f14131c, (yh0) fx1Var.zzb());
    }
}
