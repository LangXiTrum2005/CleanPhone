package lj;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f45383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f45384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r f45385f;

    public h0(String str, String str2, String str3, List list, List list2, r rVar) {
        this.f45380a = str;
        this.f45381b = str2;
        this.f45382c = str3;
        this.f45383d = list;
        this.f45384e = list2;
        this.f45385f = rVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(h0.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        h0 h0Var = (h0) obj;
        return t9.e.d(this.f45380a, h0Var.f45380a) && t9.e.d(this.f45381b, h0Var.f45381b) && t9.e.d(this.f45382c, h0Var.f45382c) && t9.e.d(this.f45383d, h0Var.f45383d) && t9.e.d(this.f45384e, h0Var.f45384e) && t9.e.d(this.f45385f, h0Var.f45385f);
    }

    public final int hashCode() {
        return t9.e.e(this.f45385f) + ((t9.e.e(this.f45384e) + ((t9.e.e(this.f45383d) + l1.d.c(l1.d.c(l1.d.c(h0.class.hashCode() * 31, 31, this.f45380a), 31, this.f45381b), 31, this.f45382c)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbV = defpackage.e.v("PlatformSubscriptionOfferDetails(basePlanId=", this.f45380a, ", offerId=", this.f45381b, ", offerToken=");
        sbV.append(this.f45382c);
        sbV.append(", offerTags=");
        sbV.append(this.f45383d);
        sbV.append(", pricingPhases=");
        sbV.append(this.f45384e);
        sbV.append(", installmentPlanDetails=");
        sbV.append(this.f45385f);
        sbV.append(")");
        return sbV.toString();
    }
}
