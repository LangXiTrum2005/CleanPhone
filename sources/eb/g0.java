package eb;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f39984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb.a f39985b;

    public g0(Class cls, lb.a aVar) {
        this.f39984a = cls;
        this.f39985b = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return g0Var.f39984a.equals(this.f39984a) && g0Var.f39985b.equals(this.f39985b);
    }

    public final int hashCode() {
        return Objects.hash(this.f39984a, this.f39985b);
    }

    public final String toString() {
        return this.f39984a.getSimpleName() + ", object identifier: " + this.f39985b;
    }
}
