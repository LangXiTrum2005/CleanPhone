package dm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pm.y f38960a;

    public p(pm.y yVar) {
        this.f38960a = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && kotlin.jvm.internal.n.a(this.f38960a, ((p) obj).f38960a);
    }

    public final int hashCode() {
        return this.f38960a.hashCode();
    }

    public final String toString() {
        return "LocalClass(type=" + this.f38960a + ')';
    }
}
