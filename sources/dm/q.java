package dm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class q extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f38961a;

    public q(f fVar) {
        this.f38961a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && kotlin.jvm.internal.n.a(this.f38961a, ((q) obj).f38961a);
    }

    public final int hashCode() {
        return this.f38961a.hashCode();
    }

    public final String toString() {
        return "NormalClass(value=" + this.f38961a + ')';
    }
}
