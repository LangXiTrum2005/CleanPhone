package lj;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f45363b;

    public e0(String str, y yVar) {
        this.f45362a = str;
        this.f45363b = yVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(e0.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        e0 e0Var = (e0) obj;
        return t9.e.d(this.f45362a, e0Var.f45362a) && t9.e.d(this.f45363b, e0Var.f45363b);
    }

    public final int hashCode() {
        return t9.e.e(this.f45363b) + l1.d.c(e0.class.hashCode() * 31, 31, this.f45362a);
    }

    public final String toString() {
        return "PlatformQueryProduct(productId=" + this.f45362a + ", productType=" + this.f45363b + ")";
    }
}
