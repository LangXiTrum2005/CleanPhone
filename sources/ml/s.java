package ml;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yl.f f46237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fl.n f46238b;

    public s(yl.f name, fl.n nVar) {
        kotlin.jvm.internal.n.f(name, "name");
        this.f46237a = name;
        this.f46238b = nVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return kotlin.jvm.internal.n.a(this.f46237a, ((s) obj).f46237a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f46237a.hashCode();
    }
}
