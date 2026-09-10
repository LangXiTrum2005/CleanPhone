package lj;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f45337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f45338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f45340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f45341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f45342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f45343g;

    public a0(long j10, long j11, String str, String str2, String str3, String str4, List list) {
        this.f45337a = j10;
        this.f45338b = j11;
        this.f45339c = str;
        this.f45340d = str2;
        this.f45341e = str3;
        this.f45342f = str4;
        this.f45343g = list;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(a0.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        a0 a0Var = (a0) obj;
        return t9.e.d(Long.valueOf(this.f45337a), Long.valueOf(a0Var.f45337a)) && t9.e.d(Long.valueOf(this.f45338b), Long.valueOf(a0Var.f45338b)) && t9.e.d(this.f45339c, a0Var.f45339c) && t9.e.d(this.f45340d, a0Var.f45340d) && t9.e.d(this.f45341e, a0Var.f45341e) && t9.e.d(this.f45342f, a0Var.f45342f) && t9.e.d(this.f45343g, a0Var.f45343g);
    }

    public final int hashCode() {
        return t9.e.e(this.f45343g) + l1.d.c(l1.d.c(l1.d.c(l1.d.c((t9.e.e(Long.valueOf(this.f45338b)) + ((t9.e.e(Long.valueOf(this.f45337a)) + (a0.class.hashCode() * 31)) * 31)) * 31, 31, this.f45339c), 31, this.f45340d), 31, this.f45341e), 31, this.f45342f);
    }

    public final String toString() {
        StringBuilder sbL = wi.d.l(this.f45337a, "PlatformPurchaseHistoryRecord(quantity=", ", purchaseTime=");
        sbL.append(this.f45338b);
        sbL.append(", developerPayload=");
        sbL.append(this.f45339c);
        d5.u.r(sbL, ", originalJson=", this.f45340d, ", purchaseToken=", this.f45341e);
        sbL.append(", signature=");
        sbL.append(this.f45342f);
        sbL.append(", products=");
        sbL.append(this.f45343g);
        sbL.append(")");
        return sbL.toString();
    }
}
