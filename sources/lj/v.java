package lj;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f45449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f45450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f45451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f45452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f45453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f45454f;

    public v(long j10, f0 f0Var, long j11, String str, String str2, String str3) {
        this.f45449a = j10;
        this.f45450b = f0Var;
        this.f45451c = j11;
        this.f45452d = str;
        this.f45453e = str2;
        this.f45454f = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(v.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        v vVar = (v) obj;
        return t9.e.d(Long.valueOf(this.f45449a), Long.valueOf(vVar.f45449a)) && t9.e.d(this.f45450b, vVar.f45450b) && t9.e.d(Long.valueOf(this.f45451c), Long.valueOf(vVar.f45451c)) && t9.e.d(this.f45452d, vVar.f45452d) && t9.e.d(this.f45453e, vVar.f45453e) && t9.e.d(this.f45454f, vVar.f45454f);
    }

    public final int hashCode() {
        return t9.e.e(this.f45454f) + l1.d.c(l1.d.c((t9.e.e(Long.valueOf(this.f45451c)) + ((t9.e.e(this.f45450b) + ((t9.e.e(Long.valueOf(this.f45449a)) + (v.class.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.f45452d), 31, this.f45453e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlatformPricingPhase(billingCycleCount=");
        sb2.append(this.f45449a);
        sb2.append(", recurrenceMode=");
        sb2.append(this.f45450b);
        q4.a.r(sb2, ", priceAmountMicros=", this.f45451c, ", billingPeriod=");
        d5.u.r(sb2, this.f45452d, ", formattedPrice=", this.f45453e, ", priceCurrencyCode=");
        return defpackage.e.q(this.f45454f, ")", sb2);
    }
}
