package q8;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f48868a;

    public n(l lVar) {
        this.f48868a = lVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        Object obj2 = x.f48892a;
        if (obj2.equals(obj2)) {
            return this.f48868a.equals(((n) yVar).f48868a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f48868a.hashCode() ^ ((x.f48892a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + x.f48892a + ", androidClientInfo=" + this.f48868a + "}";
    }
}
