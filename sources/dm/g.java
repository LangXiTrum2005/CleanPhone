package dm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f38953a;

    public g(Object obj) {
        this.f38953a = obj;
    }

    public abstract pm.y a(zk.w wVar);

    public Object b() {
        return this.f38953a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Object objB = b();
        g gVar = obj instanceof g ? (g) obj : null;
        return kotlin.jvm.internal.n.a(objB, gVar != null ? gVar.b() : null);
    }

    public final int hashCode() {
        Object objB = b();
        if (objB != null) {
            return objB.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(b());
    }
}
