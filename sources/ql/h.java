package ql;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f49147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f49148b;

    public h(g gVar) {
        this.f49147a = gVar;
        this.f49148b = false;
    }

    public static h a(h hVar, g qualifier, boolean z10, int i10) {
        if ((i10 & 1) != 0) {
            qualifier = hVar.f49147a;
        }
        if ((i10 & 2) != 0) {
            z10 = hVar.f49148b;
        }
        hVar.getClass();
        kotlin.jvm.internal.n.f(qualifier, "qualifier");
        return new h(qualifier, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f49147a == hVar.f49147a && this.f49148b == hVar.f49148b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final int hashCode() {
        int iHashCode = this.f49147a.hashCode() * 31;
        boolean z10 = this.f49148b;
        ?? r2 = z10;
        if (z10) {
            r2 = 1;
        }
        return iHashCode + r2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NullabilityQualifierWithMigrationStatus(qualifier=");
        sb2.append(this.f49147a);
        sb2.append(", isForWarningOnly=");
        return defpackage.e.t(sb2, this.f49148b, ')');
    }

    public h(g gVar, boolean z10) {
        this.f49147a = gVar;
        this.f49148b = z10;
    }
}
