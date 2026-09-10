package lj;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f45418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f45420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f45421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f45422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f45423g;

    public o(String str, g0 g0Var, String str2, String str3, String str4, String str5, String str6) {
        this.f45417a = str;
        this.f45418b = g0Var;
        this.f45419c = str2;
        this.f45420d = str3;
        this.f45421e = str4;
        this.f45422f = str5;
        this.f45423g = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(o.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        o oVar = (o) obj;
        return t9.e.d(this.f45417a, oVar.f45417a) && t9.e.d(this.f45418b, oVar.f45418b) && t9.e.d(this.f45419c, oVar.f45419c) && t9.e.d(this.f45420d, oVar.f45420d) && t9.e.d(this.f45421e, oVar.f45421e) && t9.e.d(this.f45422f, oVar.f45422f) && t9.e.d(this.f45423g, oVar.f45423g);
    }

    public final int hashCode() {
        return t9.e.e(this.f45423g) + l1.d.c(l1.d.c(l1.d.c(l1.d.c((t9.e.e(this.f45418b) + l1.d.c(o.class.hashCode() * 31, 31, this.f45417a)) * 31, 31, this.f45419c), 31, this.f45420d), 31, this.f45421e), 31, this.f45422f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlatformBillingFlowParams(product=");
        sb2.append(this.f45417a);
        sb2.append(", replacementMode=");
        sb2.append(this.f45418b);
        sb2.append(", offerToken=");
        d5.u.r(sb2, this.f45419c, ", accountId=", this.f45420d, ", obfuscatedProfileId=");
        d5.u.r(sb2, this.f45421e, ", oldProduct=", this.f45422f, ", purchaseToken=");
        return defpackage.e.q(this.f45423g, ")", sb2);
    }
}
