package eb;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f39987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f39988b;

    public h0(Class cls, Class cls2) {
        this.f39987a = cls;
        this.f39988b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return h0Var.f39987a.equals(this.f39987a) && h0Var.f39988b.equals(this.f39988b);
    }

    public final int hashCode() {
        return Objects.hash(this.f39987a, this.f39988b);
    }

    public final String toString() {
        return this.f39987a.getSimpleName() + " with serialization type: " + this.f39988b.getSimpleName();
    }
}
