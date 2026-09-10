package lj;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f45441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f45442b;

    public r(long j10, long j11) {
        this.f45441a = j10;
        this.f45442b = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(r.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        r rVar = (r) obj;
        return t9.e.d(Long.valueOf(this.f45441a), Long.valueOf(rVar.f45441a)) && t9.e.d(Long.valueOf(this.f45442b), Long.valueOf(rVar.f45442b));
    }

    public final int hashCode() {
        return t9.e.e(Long.valueOf(this.f45442b)) + ((t9.e.e(Long.valueOf(this.f45441a)) + (r.class.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return defpackage.e.r(wi.d.l(this.f45441a, "PlatformInstallmentPlanDetails(commitmentPaymentsCount=", ", subsequentCommitmentPaymentsCount="), this.f45442b, ")");
    }
}
