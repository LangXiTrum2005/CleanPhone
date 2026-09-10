package lj;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f45473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f45474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f45475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f45476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f45477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f45478h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f45479i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f45480j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f45481k;
    public final c0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f45482m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t f45483n;

    public z(String str, String str2, long j10, String str3, String str4, List list, boolean z10, String str5, String str6, boolean z11, long j11, c0 c0Var, j jVar, t tVar) {
        this.f45471a = str;
        this.f45472b = str2;
        this.f45473c = j10;
        this.f45474d = str3;
        this.f45475e = str4;
        this.f45476f = list;
        this.f45477g = z10;
        this.f45478h = str5;
        this.f45479i = str6;
        this.f45480j = z11;
        this.f45481k = j11;
        this.l = c0Var;
        this.f45482m = jVar;
        this.f45483n = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(z.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        z zVar = (z) obj;
        return t9.e.d(this.f45471a, zVar.f45471a) && t9.e.d(this.f45472b, zVar.f45472b) && t9.e.d(Long.valueOf(this.f45473c), Long.valueOf(zVar.f45473c)) && t9.e.d(this.f45474d, zVar.f45474d) && t9.e.d(this.f45475e, zVar.f45475e) && t9.e.d(this.f45476f, zVar.f45476f) && t9.e.d(Boolean.valueOf(this.f45477g), Boolean.valueOf(zVar.f45477g)) && t9.e.d(this.f45478h, zVar.f45478h) && t9.e.d(this.f45479i, zVar.f45479i) && t9.e.d(Boolean.valueOf(this.f45480j), Boolean.valueOf(zVar.f45480j)) && t9.e.d(Long.valueOf(this.f45481k), Long.valueOf(zVar.f45481k)) && t9.e.d(this.l, zVar.l) && t9.e.d(this.f45482m, zVar.f45482m) && t9.e.d(this.f45483n, zVar.f45483n);
    }

    public final int hashCode() {
        return t9.e.e(this.f45483n) + ((t9.e.e(this.f45482m) + ((t9.e.e(this.l) + ((t9.e.e(Long.valueOf(this.f45481k)) + ((t9.e.e(Boolean.valueOf(this.f45480j)) + l1.d.c(l1.d.c((t9.e.e(Boolean.valueOf(this.f45477g)) + ((t9.e.e(this.f45476f) + l1.d.c(l1.d.c((t9.e.e(Long.valueOf(this.f45473c)) + l1.d.c(l1.d.c(z.class.hashCode() * 31, 31, this.f45471a), 31, this.f45472b)) * 31, 31, this.f45474d), 31, this.f45475e)) * 31)) * 31, 31, this.f45478h), 31, this.f45479i)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbV = defpackage.e.v("PlatformPurchase(orderId=", this.f45471a, ", packageName=", this.f45472b, ", purchaseTime=");
        sbV.append(this.f45473c);
        sbV.append(", purchaseToken=");
        sbV.append(this.f45474d);
        sbV.append(", signature=");
        sbV.append(this.f45475e);
        sbV.append(", products=");
        sbV.append(this.f45476f);
        sbV.append(", isAutoRenewing=");
        sbV.append(this.f45477g);
        sbV.append(", originalJson=");
        sbV.append(this.f45478h);
        sbV.append(", developerPayload=");
        sbV.append(this.f45479i);
        sbV.append(", isAcknowledged=");
        sbV.append(this.f45480j);
        q4.a.r(sbV, ", quantity=", this.f45481k, ", purchaseState=");
        sbV.append(this.l);
        sbV.append(", accountIdentifiers=");
        sbV.append(this.f45482m);
        sbV.append(", pendingPurchaseUpdate=");
        sbV.append(this.f45483n);
        sbV.append(")");
        return sbV.toString();
    }
}
