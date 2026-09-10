package f;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f40244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.v f40245b;

    public p(androidx.lifecycle.v vVar, o callback) {
        kotlin.jvm.internal.n.f(callback, "callback");
        this.f40244a = callback;
        this.f40245b = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.n.a(this.f40244a, pVar.f40244a) && kotlin.jvm.internal.n.a(this.f40245b, pVar.f40245b);
    }

    public final int hashCode() {
        int iHashCode = this.f40244a.hashCode() * 31;
        androidx.lifecycle.v vVar = this.f40245b;
        return iHashCode + (vVar == null ? 0 : vVar.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.f40244a + ", owner=" + this.f40245b + ')';
    }
}
