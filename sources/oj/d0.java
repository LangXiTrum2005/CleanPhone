package oj;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f47480b;

    public d0(String str, b0 b0Var) {
        this.f47479a = str;
        this.f47480b = b0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        d0 d0Var = (d0) obj;
        return go.k.C(xj.o.Q(this.f47479a, this.f47480b), xj.o.Q(d0Var.f47479a, d0Var.f47480b));
    }

    public final int hashCode() {
        return xj.o.Q(this.f47479a, this.f47480b).hashCode();
    }

    public final String toString() {
        return "StringListResult(jsonEncodedValue=" + this.f47479a + ", type=" + this.f47480b + ")";
    }
}
