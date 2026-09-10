package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h4 implements m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c3 f15103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o2 f15104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m2 f15105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Pair f15106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m2 f15107f;

    public h4(int i10) {
        this.f15102a = i10;
        switch (i10) {
            case 1:
                this.f15103b = new c3(65496, 2, "image/jpeg");
                this.f15107f = new i4();
                break;
            default:
                this.f15103b = new c3(-1, -1, "image/heif");
                this.f15107f = new g4();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean d(n2 n2Var) {
        switch (this.f15102a) {
            case 0:
                if (rb0.l(n2Var, true)) {
                    return true;
                }
                ((h2) n2Var).f15065f = 0;
                return rb0.l(n2Var, false);
            default:
                if (((i4) this.f15107f).d(n2Var)) {
                    return true;
                }
                ((h2) n2Var).f15065f = 0;
                return this.f15103b.d(n2Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void e(long j10, long j11) {
        switch (this.f15102a) {
            case 0:
                m2 m2Var = this.f15105d;
                if (m2Var == null) {
                    this.f15106e = Pair.create(Long.valueOf(j10), Long.valueOf(j11));
                } else {
                    m2Var.e(j10, j11);
                }
                break;
            default:
                m2 m2Var2 = this.f15105d;
                if (m2Var2 == null) {
                    this.f15106e = Pair.create(Long.valueOf(j10), Long.valueOf(j11));
                } else {
                    m2Var2.e(j10, j11);
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final int f(n2 n2Var, q2 q2Var) {
        switch (this.f15102a) {
            case 0:
                if (this.f15105d == null) {
                    m2 m2Var = (g4) this.f15107f;
                    m2Var.getClass();
                    if (!rb0.l(n2Var, true)) {
                        m2Var = this.f15103b;
                    }
                    this.f15105d = m2Var;
                    n2Var.zzl();
                    Pair pair = this.f15106e;
                    if (pair != null) {
                        this.f15105d.e(((Long) pair.first).longValue(), ((Long) this.f15106e.second).longValue());
                        this.f15106e = null;
                    }
                    m2 m2Var2 = this.f15105d;
                    o2 o2Var = this.f15104c;
                    o2Var.getClass();
                    m2Var2.g(o2Var);
                }
                break;
            default:
                if (this.f15105d == null) {
                    m2 m2Var3 = (i4) this.f15107f;
                    if (!m2Var3.d(n2Var)) {
                        m2Var3 = this.f15103b;
                    }
                    this.f15105d = m2Var3;
                    n2Var.zzl();
                    Pair pair2 = this.f15106e;
                    if (pair2 != null) {
                        this.f15105d.e(((Long) pair2.first).longValue(), ((Long) this.f15106e.second).longValue());
                        this.f15106e = null;
                    }
                    m2 m2Var4 = this.f15105d;
                    o2 o2Var2 = this.f15104c;
                    o2Var2.getClass();
                    m2Var4.g(o2Var2);
                }
                break;
        }
        return this.f15105d.f(n2Var, q2Var);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void g(o2 o2Var) {
        switch (this.f15102a) {
            case 0:
                this.f15104c = o2Var;
                break;
            default:
                this.f15104c = o2Var;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void zzf() {
        switch (this.f15102a) {
            case 0:
                ((g4) this.f15107f).zzf();
                break;
        }
    }

    private final void a() {
    }
}
