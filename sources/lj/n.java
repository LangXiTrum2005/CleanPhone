package lj;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f45415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45416b;

    public n(q qVar, String str) {
        this.f45415a = qVar;
        this.f45416b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(n.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        n nVar = (n) obj;
        return t9.e.d(this.f45415a, nVar.f45415a) && t9.e.d(this.f45416b, nVar.f45416b);
    }

    public final int hashCode() {
        return t9.e.e(this.f45416b) + ((t9.e.e(this.f45415a) + (n.class.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlatformBillingConfigResponse(billingResult=" + this.f45415a + ", countryCode=" + this.f45416b + ")";
    }
}
