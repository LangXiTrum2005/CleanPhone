package il;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ql.h f43092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Collection f43093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f43094c;

    public n(ql.h hVar, Collection collection) {
        this(hVar, collection, hVar.f49147a == ql.g.f49145c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.n.a(this.f43092a, nVar.f43092a) && kotlin.jvm.internal.n.a(this.f43093b, nVar.f43093b) && this.f43094c == nVar.f43094c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final int hashCode() {
        int iHashCode = (this.f43093b.hashCode() + (this.f43092a.hashCode() * 31)) * 31;
        boolean z10 = this.f43094c;
        ?? r2 = z10;
        if (z10) {
            r2 = 1;
        }
        return iHashCode + r2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        sb2.append(this.f43092a);
        sb2.append(", qualifierApplicabilityTypes=");
        sb2.append(this.f43093b);
        sb2.append(", definitelyNotNull=");
        return defpackage.e.t(sb2, this.f43094c, ')');
    }

    public n(ql.h hVar, Collection qualifierApplicabilityTypes, boolean z10) {
        kotlin.jvm.internal.n.f(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.f43092a = hVar;
        this.f43093b = qualifierApplicabilityTypes;
        this.f43094c = z10;
    }
}
