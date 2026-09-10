package lj;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45393a;

    public i0(String str) {
        this.f45393a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(i0.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return t9.e.d(this.f45393a, ((i0) obj).f45393a);
    }

    public final int hashCode() {
        return t9.e.e(this.f45393a) + (i0.class.hashCode() * 31);
    }

    public final String toString() {
        return defpackage.e.o("PlatformUnfetchedProduct(productId=", this.f45393a, ")");
    }
}
