package lj;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f45359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f45360b;

    public d0(q qVar, List list) {
        this.f45359a = qVar;
        this.f45360b = list;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(d0.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        d0 d0Var = (d0) obj;
        return t9.e.d(this.f45359a, d0Var.f45359a) && t9.e.d(this.f45360b, d0Var.f45360b);
    }

    public final int hashCode() {
        return t9.e.e(this.f45360b) + ((t9.e.e(this.f45359a) + (d0.class.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlatformPurchasesResponse(billingResult=" + this.f45359a + ", purchases=" + this.f45360b + ")";
    }
}
