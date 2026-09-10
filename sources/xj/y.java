package xj;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f53869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f53870b;

    public y(int i10, Object obj) {
        this.f53869a = i10;
        this.f53870b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f53869a == yVar.f53869a && kotlin.jvm.internal.n.a(this.f53870b, yVar.f53870b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f53869a) * 31;
        Object obj = this.f53870b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f53869a + ", value=" + this.f53870b + ')';
    }
}
