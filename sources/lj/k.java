package lj;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f45399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45400b;

    public k(q qVar, String str) {
        this.f45399a = qVar;
        this.f45400b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(k.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        k kVar = (k) obj;
        return t9.e.d(this.f45399a, kVar.f45399a) && t9.e.d(this.f45400b, kVar.f45400b);
    }

    public final int hashCode() {
        return t9.e.e(this.f45400b) + ((t9.e.e(this.f45399a) + (k.class.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlatformAlternativeBillingOnlyReportingDetailsResponse(billingResult=" + this.f45399a + ", externalTransactionToken=" + this.f45400b + ")";
    }
}
