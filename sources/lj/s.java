package lj;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f45443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45445c;

    public s(long j10, String str, String str2) {
        this.f45443a = j10;
        this.f45444b = str;
        this.f45445c = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(s.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        s sVar = (s) obj;
        return t9.e.d(Long.valueOf(this.f45443a), Long.valueOf(sVar.f45443a)) && t9.e.d(this.f45444b, sVar.f45444b) && t9.e.d(this.f45445c, sVar.f45445c);
    }

    public final int hashCode() {
        return t9.e.e(this.f45445c) + l1.d.c((t9.e.e(Long.valueOf(this.f45443a)) + (s.class.hashCode() * 31)) * 31, 31, this.f45444b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlatformOneTimePurchaseOfferDetails(priceAmountMicros=");
        sb2.append(this.f45443a);
        sb2.append(", formattedPrice=");
        sb2.append(this.f45444b);
        return q4.a.j(sb2, ", priceCurrencyCode=", this.f45445c, ")");
    }
}
