package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l61 f14766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v51 f14767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c61 f14768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a71 f14769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t21 f14770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f14771f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f14772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f14773h;

    public g51(l61 l61Var, v51 v51Var, c61 c61Var, a71 a71Var, t21 t21Var, boolean z10, long j10, long j11) {
        this.f14766a = l61Var;
        this.f14767b = v51Var;
        this.f14768c = c61Var;
        this.f14769d = a71Var;
        this.f14770e = t21Var;
        this.f14771f = z10;
        this.f14772g = j10;
        this.f14773h = j11;
    }

    public final vd1 a() {
        vd1 vd1VarR = vd1.r(this.f14768c.zzb());
        i6 i6Var = i6.f15623x;
        td1 td1Var = td1.f20333a;
        lc1 lc1VarT = zw1.t(vd1VarR, Throwable.class, i6Var, td1Var);
        l61 l61Var = this.f14766a;
        Objects.requireNonNull(l61Var);
        return zw1.x(zw1.z(lc1VarT, new lx(l61Var, 10), td1Var), new d51(this, 0), td1Var);
    }

    public final vd1 b(final int i10) {
        vd1 vd1VarR = vd1.r(this.f14767b.zza());
        lx lxVar = new lx(this, 11);
        td1 td1Var = td1.f20333a;
        lc1 lc1VarT = zw1.t(zw1.t(zw1.t(zw1.z(zw1.x(zw1.z(vd1VarR, lxVar, td1Var), new d51(this, 1), td1Var), i6.f15624y, td1Var), b51.class, i6.f15625z, td1Var), c51.class, i6.A, td1Var), a51.class, new d81() { // from class: com.google.android.gms.internal.ads.e51
            @Override // com.google.android.gms.internal.ads.d81
            public final /* synthetic */ Object apply(Object obj) {
                g51 g51Var = this.f13855a;
                if (g51Var.f14771f) {
                    int i11 = i10;
                    if (i11 < g51Var.f14772g) {
                        g51Var.f14770e.a(new com.google.android.gms.common.api.internal.q(i11, 5, g51Var), g51Var.f14773h * ((long) Math.pow(2.0d, i11)));
                    }
                }
                return f51.f14256f;
            }
        }, td1Var);
        this.f14769d.e(1002, lc1VarT);
        return lc1VarT;
    }
}
