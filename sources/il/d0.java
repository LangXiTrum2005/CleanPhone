package il;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yl.f f43058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43059b;

    public d0(yl.f fVar, String signature) {
        kotlin.jvm.internal.n.f(signature, "signature");
        this.f43058a = fVar;
        this.f43059b = signature;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return kotlin.jvm.internal.n.a(this.f43058a, d0Var.f43058a) && kotlin.jvm.internal.n.a(this.f43059b, d0Var.f43059b);
    }

    public final int hashCode() {
        return this.f43059b.hashCode() + (this.f43058a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NameAndSignature(name=");
        sb2.append(this.f43058a);
        sb2.append(", signature=");
        return wi.d.k(sb2, this.f43059b, ')');
    }
}
