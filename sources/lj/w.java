package lj;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f45458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f45459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s f45460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f45461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f45462h;

    public w(String str, String str2, String str3, y yVar, String str4, s sVar, List list, List list2) {
        this.f45455a = str;
        this.f45456b = str2;
        this.f45457c = str3;
        this.f45458d = yVar;
        this.f45459e = str4;
        this.f45460f = sVar;
        this.f45461g = list;
        this.f45462h = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(w.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        w wVar = (w) obj;
        return t9.e.d(this.f45455a, wVar.f45455a) && t9.e.d(this.f45456b, wVar.f45456b) && t9.e.d(this.f45457c, wVar.f45457c) && t9.e.d(this.f45458d, wVar.f45458d) && t9.e.d(this.f45459e, wVar.f45459e) && t9.e.d(this.f45460f, wVar.f45460f) && t9.e.d(this.f45461g, wVar.f45461g) && t9.e.d(this.f45462h, wVar.f45462h);
    }

    public final int hashCode() {
        return t9.e.e(this.f45462h) + ((t9.e.e(this.f45461g) + ((t9.e.e(this.f45460f) + l1.d.c((t9.e.e(this.f45458d) + l1.d.c(l1.d.c(l1.d.c(w.class.hashCode() * 31, 31, this.f45455a), 31, this.f45456b), 31, this.f45457c)) * 31, 31, this.f45459e)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbV = defpackage.e.v("PlatformProductDetails(description=", this.f45455a, ", name=", this.f45456b, ", productId=");
        sbV.append(this.f45457c);
        sbV.append(", productType=");
        sbV.append(this.f45458d);
        sbV.append(", title=");
        sbV.append(this.f45459e);
        sbV.append(", oneTimePurchaseOfferDetails=");
        sbV.append(this.f45460f);
        sbV.append(", oneTimePurchaseOfferDetailsList=");
        sbV.append(this.f45461g);
        sbV.append(", subscriptionOfferDetails=");
        sbV.append(this.f45462h);
        sbV.append(")");
        return sbV.toString();
    }
}
