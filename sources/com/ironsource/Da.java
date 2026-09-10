package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Da {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f25968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f25969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f25970c;

    public Da(long j10, long j11, boolean z10) {
        this.f25968a = j10;
        this.f25969b = j11;
        this.f25970c = z10;
    }

    public final long a() {
        return this.f25968a;
    }

    public final long b() {
        return this.f25969b;
    }

    public final boolean c() {
        return this.f25970c;
    }

    public final long d() {
        return this.f25968a;
    }

    public final long e() {
        return this.f25969b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Da)) {
            return false;
        }
        Da da = (Da) obj;
        return this.f25968a == da.f25968a && this.f25969b == da.f25969b && this.f25970c == da.f25970c;
    }

    public final boolean f() {
        return this.f25970c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    public int hashCode() {
        int iJ = com.applovin.impl.ca.j(this.f25969b, Long.hashCode(this.f25968a) * 31, 31);
        boolean z10 = this.f25970c;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iJ + r10;
    }

    public String toString() {
        long j10 = this.f25968a;
        long j11 = this.f25969b;
        boolean z10 = this.f25970c;
        StringBuilder sbL = wi.d.l(j10, "LevelPlayBannerReloadAdUnitStrategyConfig(refreshInterval=", ", visibilityCheckerInterval=");
        sbL.append(j11);
        sbL.append(", isAutoRefreshEnabled=");
        sbL.append(z10);
        sbL.append(")");
        return sbL.toString();
    }

    public final Da a(long j10, long j11, boolean z10) {
        return new Da(j10, j11, z10);
    }

    public static /* synthetic */ Da a(Da da, long j10, long j11, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = da.f25968a;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            j11 = da.f25969b;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            z10 = da.f25970c;
        }
        return da.a(j12, j13, z10);
    }
}
