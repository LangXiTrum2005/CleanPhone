package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d02 implements oe, v32, c22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s6 f13326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ug f13327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ih f13328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v90 f13329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f13330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public mk0 f13331f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public mu1 f13332g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ys0 f13333h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f13334i;

    public d02(s6 s6Var) {
        s6Var.getClass();
        this.f13326a = s6Var;
        String str = uu0.f20901a;
        Looper looperMyLooper = Looper.myLooper();
        this.f13331f = new mk0((looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper).getThread(), 0);
        ug ugVar = new ug();
        this.f13327b = ugVar;
        this.f13328c = new ih();
        v90 v90Var = new v90();
        v90Var.f21135a = ugVar;
        aa1 aa1Var = ca1.f13122b;
        v90Var.f21136b = ya1.f22208e;
        v90Var.f21137c = db1.f13484g;
        this.f13329d = v90Var;
        this.f13330e = new SparseArray();
    }

    @Override // com.google.android.gms.internal.ads.v32
    public final void a(int i10, r32 r32Var, j32 j32Var, o32 o32Var) {
        f(p(i10, r32Var), 1001, new ey1((byte) 0, 25));
    }

    @Override // com.google.android.gms.internal.ads.v32
    public final void b(int i10, r32 r32Var, j32 j32Var, o32 o32Var) {
        f(p(i10, r32Var), 1002, new ey1((byte) 0, 26));
    }

    @Override // com.google.android.gms.internal.ads.v32
    public final void c(int i10, r32 r32Var, j32 j32Var, o32 o32Var, int i11) {
        f(p(i10, r32Var), 1000, new ey1((byte) 0, 24));
    }

    @Override // com.google.android.gms.internal.ads.v32
    public final void d(int i10, r32 r32Var, o32 o32Var) {
        zz1 zz1VarP = p(i10, r32Var);
        f(zz1VarP, 1004, new f81(9, zz1VarP, o32Var));
    }

    @Override // com.google.android.gms.internal.ads.v32
    public final void e(int i10, r32 r32Var, j32 j32Var, o32 o32Var, IOException iOException, boolean z10) {
        zz1 zz1VarP = p(i10, r32Var);
        f(zz1VarP, 1003, new z61(zz1VarP, j32Var, o32Var, iOException, z10));
    }

    public final void f(zz1 zz1Var, int i10, li0 li0Var) {
        this.f13330e.put(i10, zz1Var);
        mk0 mk0Var = this.f13331f;
        mk0Var.i(i10, li0Var);
        mk0Var.j();
    }

    public final zz1 g() {
        return i((r32) this.f13329d.f21138d);
    }

    public final zz1 h(ci ciVar, int i10, r32 r32Var) {
        r32 r32Var2 = true == ciVar.g() ? null : r32Var;
        this.f13326a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = false;
        if (ciVar.equals(this.f13332g.O0()) && i10 == this.f13332g.R0()) {
            z10 = true;
        }
        long jS = 0;
        if (r32Var2 == null || !r32Var2.b()) {
            if (z10) {
                jS = this.f13332g.y0();
            } else if (!ciVar.g()) {
                ciVar.b(i10, this.f13328c, 0L).getClass();
                jS = uu0.s(0L);
            }
        } else if (z10 && this.f13332g.c() == r32Var2.f19360b && this.f13332g.W0() == r32Var2.f19361c) {
            jS = this.f13332g.T0();
        }
        return new zz1(jElapsedRealtime, ciVar, i10, r32Var2, jS, this.f13332g.O0(), this.f13332g.R0(), (r32) this.f13329d.f21138d, this.f13332g.T0(), this.f13332g.U0());
    }

    public final zz1 i(r32 r32Var) {
        this.f13332g.getClass();
        ci ciVar = r32Var == null ? null : (ci) ((db1) this.f13329d.f21137c).get(r32Var);
        if (r32Var != null && ciVar != null) {
            return h(ciVar, ciVar.o(r32Var.f19359a, this.f13327b).f20772c, r32Var);
        }
        int iR0 = this.f13332g.R0();
        ci ciVarO0 = this.f13332g.O0();
        if (iR0 >= ciVarO0.a()) {
            ciVarO0 = ci.f13168a;
        }
        return h(ciVarO0, iR0, null);
    }

    @Override // com.google.android.gms.internal.ads.oe
    public final void j(int i10) {
        zz1 zz1VarG = g();
        f(zz1VarG, 4, new d5.o(i10, 8, zz1VarG));
    }

    @Override // com.google.android.gms.internal.ads.oe
    public final void k(lt ltVar) {
        zz1 zz1VarO = o();
        f(zz1VarO, 25, new wv0(zz1VarO, ltVar, 12));
    }

    @Override // com.google.android.gms.internal.ads.oe
    public final void l(dy1 dy1Var) {
        r32 r32Var;
        f((dy1Var == null || (r32Var = dy1Var.f13765h) == null) ? g() : i(r32Var), 10, new b02(8));
    }

    @Override // com.google.android.gms.internal.ads.oe
    public final void m(dy1 dy1Var) {
        r32 r32Var;
        zz1 zz1VarG = (dy1Var == null || (r32Var = dy1Var.f13765h) == null) ? g() : i(r32Var);
        f(zz1VarG, 10, new at0(zz1VarG, dy1Var));
    }

    @Override // com.google.android.gms.internal.ads.oe
    public final void n(jf jfVar, jf jfVar2, int i10) {
        if (i10 == 1) {
            this.f13334i = false;
            i10 = 1;
        }
        mu1 mu1Var = this.f13332g;
        mu1Var.getClass();
        v90 v90Var = this.f13329d;
        v90Var.f21138d = v90.p(mu1Var, (ca1) v90Var.f21136b, (r32) v90Var.f21139e, (ug) v90Var.f21135a);
        zz1 zz1VarG = g();
        f(zz1VarG, 11, new d5.o(zz1VarG, i10, jfVar, jfVar2));
    }

    public final zz1 o() {
        return i((r32) this.f13329d.f21140f);
    }

    public final zz1 p(int i10, r32 r32Var) {
        mu1 mu1Var = this.f13332g;
        mu1Var.getClass();
        if (r32Var != null) {
            return ((ci) ((db1) this.f13329d.f21137c).get(r32Var)) != null ? i(r32Var) : h(ci.f13168a, i10, r32Var);
        }
        ci ciVarO0 = mu1Var.O0();
        if (i10 >= ciVarO0.a()) {
            ciVarO0 = ci.f13168a;
        }
        return h(ciVarO0, i10, null);
    }

    public final void q(xz1 xz1Var, Looper looper) {
        boolean z10 = true;
        if (this.f13332g != null && !((ca1) this.f13329d.f21136b).isEmpty()) {
            z10 = false;
        }
        ps1.c0(z10);
        xz1Var.getClass();
        this.f13332g = xz1Var;
        s6 s6Var = this.f13326a;
        this.f13333h = s6Var.u(looper, null);
        mk0 mk0Var = this.f13331f;
        iw0 iw0Var = new iw0(14, this, xz1Var);
        mk0Var.getClass();
        this.f13331f = new mk0((CopyOnWriteArraySet) mk0Var.f17464f, looper, looper.getThread(), s6Var, iw0Var, mk0Var.f17460b);
    }

    @Override // com.google.android.gms.internal.ads.oe
    public final void zzb() {
        mu1 mu1Var = this.f13332g;
        mu1Var.getClass();
        v90 v90Var = this.f13329d;
        v90Var.f21138d = v90.p(mu1Var, (ca1) v90Var.f21136b, (r32) v90Var.f21139e, (ug) v90Var.f21135a);
        v90Var.n(mu1Var.O0());
        f(g(), 0, new ey1((byte) 0, 28));
    }

    @Override // com.google.android.gms.internal.ads.oe
    public final void zzc() {
        f(g(), 1, new ey1((byte) 0, 29));
    }

    @Override // com.google.android.gms.internal.ads.oe
    public final void zzd() {
        f(g(), 2, new b02(0));
    }

    @Override // com.google.android.gms.internal.ads.oe
    public final void zze() {
        f(g(), 14, new b02(10));
    }

    @Override // com.google.android.gms.internal.ads.oe
    public final void zzf() {
        f(g(), 3, new b02(1));
    }

    @Override // com.google.android.gms.internal.ads.oe
    public final void zzg() {
        f(g(), 13, new b02(2));
    }

    @Override // com.google.android.gms.internal.ads.oe
    public final void zzh() {
        f(g(), -1, new b02(3));
    }

    @Override // com.google.android.gms.internal.ads.oe
    public final void zzj() {
        f(g(), 5, new b02(4));
    }

    @Override // com.google.android.gms.internal.ads.oe
    public final void zzk() {
        f(g(), 6, new b02(5));
    }

    @Override // com.google.android.gms.internal.ads.oe
    public final void zzl() {
        f(g(), 7, new b02(7));
    }

    @Override // com.google.android.gms.internal.ads.oe
    public final void zzp() {
        f(g(), 12, new b02(9));
    }

    @Override // com.google.android.gms.internal.ads.oe
    public final void zzq() {
        f(o(), 21, new b02(12));
    }

    @Override // com.google.android.gms.internal.ads.oe
    public final void zzr() {
        f(o(), 22, new ey1((byte) 0, 15));
    }

    @Override // com.google.android.gms.internal.ads.oe
    public final void zzs() {
        f(o(), 23, new b02(11));
    }

    @Override // com.google.android.gms.internal.ads.oe
    public final void zzu() {
        f(o(), 24, new ey1((byte) 0, 23));
    }

    @Override // com.google.android.gms.internal.ads.oe
    public final void zza() {
    }
}
