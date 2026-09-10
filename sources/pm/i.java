package pm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final al.j f48438a;

    public i(al.j annotations) {
        kotlin.jvm.internal.n.f(annotations, "annotations");
        this.f48438a = annotations;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return kotlin.jvm.internal.n.a(((i) obj).f48438a, this.f48438a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f48438a.hashCode();
    }
}
