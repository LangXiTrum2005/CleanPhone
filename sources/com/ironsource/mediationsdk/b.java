package com.ironsource.mediationsdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q.d f29313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f29314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f29315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f29316d;

    public b(q.d sdkState, boolean z10, boolean z11, boolean z12) {
        kotlin.jvm.internal.n.f(sdkState, "sdkState");
        this.f29313a = sdkState;
        this.f29314b = z10;
        this.f29315c = z11;
        this.f29316d = z12;
    }

    public final q.d a() {
        return this.f29313a;
    }

    public final boolean b() {
        return this.f29314b;
    }

    public final boolean c() {
        return this.f29315c;
    }

    public final boolean d() {
        return this.f29316d;
    }

    public final q.d e() {
        return this.f29313a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f29313a == bVar.f29313a && this.f29314b == bVar.f29314b && this.f29315c == bVar.f29315c && this.f29316d == bVar.f29316d;
    }

    public final boolean f() {
        return this.f29316d;
    }

    public final boolean g() {
        return this.f29315c;
    }

    public final boolean h() {
        return this.f29314b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = this.f29313a.hashCode() * 31;
        boolean z10 = this.f29314b;
        ?? r2 = z10;
        if (z10) {
            r2 = 1;
        }
        int i10 = (iHashCode + r2) * 31;
        boolean z11 = this.f29315c;
        ?? r3 = z11;
        if (z11) {
            r3 = 1;
        }
        int i11 = (i10 + r3) * 31;
        boolean z12 = this.f29316d;
        return i11 + (z12 ? 1 : z12);
    }

    public String toString() {
        return "AdUnitInitStateInfo(sdkState=" + this.f29313a + ", isRetryForMoreThan15Secs=" + this.f29314b + ", isDemandOnlyInitRequested=" + this.f29315c + ", isAdUnitInitRequested=" + this.f29316d + ")";
    }

    public final b a(q.d sdkState, boolean z10, boolean z11, boolean z12) {
        kotlin.jvm.internal.n.f(sdkState, "sdkState");
        return new b(sdkState, z10, z11, z12);
    }

    public static /* synthetic */ b a(b bVar, q.d dVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dVar = bVar.f29313a;
        }
        if ((i10 & 2) != 0) {
            z10 = bVar.f29314b;
        }
        if ((i10 & 4) != 0) {
            z11 = bVar.f29315c;
        }
        if ((i10 & 8) != 0) {
            z12 = bVar.f29316d;
        }
        return bVar.a(dVar, z10, z11, z12);
    }
}
