package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Sc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f27188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27189b;

    public Sc() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public final boolean a() {
        return this.f27188a;
    }

    public final int b() {
        return this.f27189b;
    }

    public final int c() {
        return this.f27189b;
    }

    public final boolean d() {
        return this.f27188a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sc)) {
            return false;
        }
        Sc sc2 = (Sc) obj;
        return this.f27188a == sc2.f27188a && this.f27189b == sc2.f27189b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public int hashCode() {
        boolean z10 = this.f27188a;
        ?? r0 = z10;
        if (z10) {
            r0 = 1;
        }
        return Integer.hashCode(this.f27189b) + (r0 * 31);
    }

    public String toString() {
        return "OpenUrlConfigurations(isImmersive=" + this.f27188a + ", flags=" + this.f27189b + ")";
    }

    public Sc(boolean z10, int i10) {
        this.f27188a = z10;
        this.f27189b = i10;
    }

    public final Sc a(boolean z10, int i10) {
        return new Sc(z10, i10);
    }

    public static /* synthetic */ Sc a(Sc sc2, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = sc2.f27188a;
        }
        if ((i11 & 2) != 0) {
            i10 = sc2.f27189b;
        }
        return sc2.a(z10, i10);
    }

    public /* synthetic */ Sc(boolean z10, int i10, int i11, kotlin.jvm.internal.g gVar) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? 805306368 : i10);
    }
}
