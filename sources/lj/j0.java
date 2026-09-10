package lj;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f45398c;

    public j0(String str, String str2, List list) {
        this.f45396a = str;
        this.f45397b = str2;
        this.f45398c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(j0.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        j0 j0Var = (j0) obj;
        return t9.e.d(this.f45396a, j0Var.f45396a) && t9.e.d(this.f45397b, j0Var.f45397b) && t9.e.d(this.f45398c, j0Var.f45398c);
    }

    public final int hashCode() {
        return t9.e.e(this.f45398c) + l1.d.c(l1.d.c(j0.class.hashCode() * 31, 31, this.f45396a), 31, this.f45397b);
    }

    public final String toString() {
        StringBuilder sbV = defpackage.e.v("PlatformUserChoiceDetails(originalExternalTransactionId=", this.f45396a, ", externalTransactionToken=", this.f45397b, ", products=");
        sbV.append(this.f45398c);
        sbV.append(")");
        return sbV.toString();
    }
}
