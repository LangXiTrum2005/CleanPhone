package en;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f40167a;

    public j(Throwable th2) {
        this.f40167a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return kotlin.jvm.internal.n.a(this.f40167a, ((j) obj).f40167a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th2 = this.f40167a;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    @Override // en.k
    public final String toString() {
        return "Closed(" + this.f40167a + ')';
    }
}
