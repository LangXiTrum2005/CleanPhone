package com.google.android.gms.internal.ads;

import android.view.Surface;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1 f17595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g1 f17596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m1 f17597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f17598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f17599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g22 f17600f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f17601g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public s1 f17602h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Executor f17603i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d1 f17604j;

    public n0(f1 f1Var, g1 g1Var, s6 s6Var) {
        this.f17595a = f1Var;
        this.f17596b = g1Var;
        f1Var.f14166k = s6Var;
        this.f17597c = new m1(new lj1(this), f1Var, g1Var);
        this.f17598d = new ArrayDeque();
        this.f17600f = new g22(new i12());
        this.f17601g = C.TIME_UNSET;
        this.f17602h = s1.f19757a;
        this.f17603i = l0.f16607a;
        this.f17604j = k0.f16232b;
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void a(r0 r0Var) {
        this.f17602h = r0Var;
        this.f17603i = td1.f20333a;
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void b(long j10, long j11) throws t1 {
        try {
            this.f17597c.b(j10, j11);
        } catch (dy1 e10) {
            throw new t1(e10, this.f17600f);
        }
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final boolean c(g22 g22Var) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void d(d1 d1Var) {
        this.f17604j = d1Var;
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void e(float f10) {
        this.f17595a.g(f10);
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void f(Surface surface, aq0 aq0Var) {
        this.f17599e = surface;
        this.f17595a.c(surface);
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final boolean g(long j10, s0 s0Var) {
        this.f17598d.add(s0Var);
        m1 m1Var = this.f17597c;
        ml0 ml0Var = (ml0) m1Var.f17200i;
        int i10 = ml0Var.f17472c;
        long[] jArr = ml0Var.f17473d;
        int length = jArr.length;
        if (i10 == length) {
            int i11 = length + length;
            if (i11 < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[i11];
            int i12 = ml0Var.f17470a;
            int i13 = length - i12;
            System.arraycopy(jArr, i12, jArr2, 0, i13);
            System.arraycopy(ml0Var.f17473d, 0, jArr2, i13, i12);
            ml0Var.f17470a = 0;
            ml0Var.f17471b = ml0Var.f17472c - 1;
            ml0Var.f17473d = jArr2;
            ml0Var.f17474e = i11 - 1;
            jArr = jArr2;
        }
        int i14 = (ml0Var.f17471b + 1) & ml0Var.f17474e;
        ml0Var.f17471b = i14;
        jArr[i14] = j10;
        ml0Var.f17472c++;
        m1Var.f17192a = j10;
        m1Var.f17194c = C.TIME_UNSET;
        this.f17603i.execute(new d(this, 2));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void h(int i10) {
        l1 l1Var = this.f17595a.f14157b;
        if (l1Var.f16634h == i10) {
            return;
        }
        l1Var.f16634h = i10;
        l1Var.g(true);
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void i(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void j(long j10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void k(g22 g22Var, long j10, int i10, List list) {
        ps1.c0(list.isEmpty());
        int i11 = g22Var.f14685v;
        int i12 = g22Var.f14686w;
        g22 g22Var2 = this.f17600f;
        int i13 = g22Var2.f14685v;
        m1 m1Var = this.f17597c;
        if (i11 != i13 || i12 != g22Var2.f14686w) {
            long j11 = m1Var.f17192a;
            ((ht0) m1Var.f17198g).g(j11 == C.TIME_UNSET ? 0L : j11 + 1, new lt(1.0f, i11, i12));
        }
        float f10 = g22Var.f14689z;
        if (f10 != this.f17600f.f14689z) {
            this.f17595a.d(f10);
        }
        this.f17600f = g22Var;
        if (j10 != this.f17601g) {
            if (((ml0) m1Var.f17200i).f17472c == 0) {
                ((f1) m1Var.f17196e).a(i10);
                m1Var.f17195d = j10;
            } else {
                ht0 ht0Var = (ht0) m1Var.f17199h;
                long j12 = m1Var.f17192a;
                ht0Var.g(j12 == C.TIME_UNSET ? -4611686018427387904L : j12 + 1, Long.valueOf(j10));
            }
            this.f17601g = j10;
        }
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void zza() {
        this.f17596b.f();
        this.f17595a.b();
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void zzb() {
        this.f17596b.f();
        f1 f1Var = this.f17595a;
        f1Var.f14158c = false;
        f1Var.f14163h = C.TIME_UNSET;
        l1 l1Var = f1Var.f14157b;
        l1Var.f16628b = false;
        h1 h1Var = (h1) l1Var.f16644s;
        if (h1Var != null) {
            h1Var.h();
        }
        l1Var.h();
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void zzf() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void zzg(boolean z10) {
        if (z10) {
            f1 f1Var = this.f17595a;
            f1Var.f14157b.e();
            f1Var.f14162g = C.TIME_UNSET;
            f1Var.f14160e = C.TIME_UNSET;
            f1Var.f14159d = Math.min(f1Var.f14159d, 1);
            f1Var.f14163h = C.TIME_UNSET;
            f1Var.f14167m = false;
        }
        this.f17596b.f();
        m1 m1Var = this.f17597c;
        ml0 ml0Var = (ml0) m1Var.f17200i;
        ml0Var.f17470a = 0;
        ml0Var.f17471b = -1;
        ml0Var.f17472c = 0;
        m1Var.f17192a = C.TIME_UNSET;
        m1Var.f17193b = C.TIME_UNSET;
        m1Var.f17194c = C.TIME_UNSET;
        ht0 ht0Var = (ht0) m1Var.f17199h;
        if (ht0Var.h() > 0) {
            ps1.v(ht0Var.h() > 0);
            while (ht0Var.h() > 1) {
                ht0Var.i();
            }
            Object objI = ht0Var.i();
            objI.getClass();
            m1Var.f17195d = ((Long) objI).longValue();
        }
        ht0 ht0Var2 = (ht0) m1Var.f17198g;
        if (ht0Var2.h() > 0) {
            ps1.v(ht0Var2.h() > 0);
            while (ht0Var2.h() > 1) {
                ht0Var2.i();
            }
            Object objI2 = ht0Var2.i();
            objI2.getClass();
            ht0Var2.g(0L, (lt) objI2);
        }
        this.f17598d.clear();
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final boolean zzh(boolean z10) {
        return this.f17595a.e(z10);
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void zzi() {
        m1 m1Var = this.f17597c;
        long j10 = m1Var.f17192a;
        if (j10 == C.TIME_UNSET) {
            j10 = Long.MIN_VALUE;
            m1Var.f17192a = Long.MIN_VALUE;
            m1Var.f17193b = Long.MIN_VALUE;
        }
        m1Var.f17194c = j10;
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final boolean zzj() {
        m1 m1Var = this.f17597c;
        long j10 = m1Var.f17194c;
        return j10 != C.TIME_UNSET && m1Var.f17193b == j10;
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final Surface zzk() {
        Surface surface = this.f17599e;
        surface.getClass();
        return surface;
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void zzq() {
        this.f17599e = null;
        this.f17595a.c(null);
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void zzt() {
        f1 f1Var = this.f17595a;
        if (f1Var.f14159d == 0) {
            f1Var.f14159d = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void zzw(boolean z10) {
        f1 f1Var = this.f17595a;
        f1Var.f14164i = z10;
        f1Var.f14163h = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void zzx() {
    }
}
