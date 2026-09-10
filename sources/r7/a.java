package r7;

import defpackage.e;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f49458b;

    public a(String name, boolean z10) {
        n.f(name, "name");
        this.f49457a = name;
        this.f49458b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return n.a(this.f49457a, aVar.f49457a) && this.f49458b == aVar.f49458b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final int hashCode() {
        int iHashCode = this.f49457a.hashCode() * 31;
        boolean z10 = this.f49458b;
        ?? r2 = z10;
        if (z10) {
            r2 = 1;
        }
        return iHashCode + r2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GateKeeper(name=");
        sb2.append(this.f49457a);
        sb2.append(", value=");
        return e.t(sb2, this.f49458b, ')');
    }
}
