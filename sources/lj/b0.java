package lj;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f45347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f45348b;

    public b0(q qVar, List list) {
        this.f45347a = qVar;
        this.f45348b = list;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(b0.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        b0 b0Var = (b0) obj;
        return t9.e.d(this.f45347a, b0Var.f45347a) && t9.e.d(this.f45348b, b0Var.f45348b);
    }

    public final int hashCode() {
        return t9.e.e(this.f45348b) + ((t9.e.e(this.f45347a) + (b0.class.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlatformPurchaseHistoryResponse(billingResult=" + this.f45347a + ", purchases=" + this.f45348b + ")";
    }
}
