package um;

import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f52267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f52268b;

    public a(Object obj, Object obj2) {
        this.f52267a = obj;
        this.f52268b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return n.a(this.f52267a, aVar.f52267a) && n.a(this.f52268b, aVar.f52268b);
    }

    public final int hashCode() {
        Object obj = this.f52267a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f52268b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "ApproximationBounds(lower=" + this.f52267a + ", upper=" + this.f52268b + ')';
    }
}
