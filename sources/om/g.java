package om;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f47569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.internal.o f47570b;

    /* JADX WARN: Multi-variable type inference failed */
    public g(Object obj, jk.a aVar) {
        this.f47569a = obj;
        this.f47570b = (kotlin.jvm.internal.o) aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && g.class == obj.getClass() && this.f47569a.equals(((g) obj).f47569a);
    }

    public final int hashCode() {
        return this.f47569a.hashCode();
    }
}
