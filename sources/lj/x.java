package lj;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f45463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f45464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f45465c;

    public x(q qVar, List list, List list2) {
        this.f45463a = qVar;
        this.f45464b = list;
        this.f45465c = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(x.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        x xVar = (x) obj;
        return t9.e.d(this.f45463a, xVar.f45463a) && t9.e.d(this.f45464b, xVar.f45464b) && t9.e.d(this.f45465c, xVar.f45465c);
    }

    public final int hashCode() {
        return t9.e.e(this.f45465c) + ((t9.e.e(this.f45464b) + ((t9.e.e(this.f45463a) + (x.class.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PlatformProductDetailsResponse(billingResult=" + this.f45463a + ", productDetails=" + this.f45464b + ", unfetchedProductList=" + this.f45465c + ")";
    }
}
