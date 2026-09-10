package lj;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f45403c;

    public k0(String str, String str2, y yVar) {
        this.f45401a = str;
        this.f45402b = str2;
        this.f45403c = yVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(k0.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        k0 k0Var = (k0) obj;
        return t9.e.d(this.f45401a, k0Var.f45401a) && t9.e.d(this.f45402b, k0Var.f45402b) && t9.e.d(this.f45403c, k0Var.f45403c);
    }

    public final int hashCode() {
        return t9.e.e(this.f45403c) + l1.d.c(l1.d.c(k0.class.hashCode() * 31, 31, this.f45401a), 31, this.f45402b);
    }

    public final String toString() {
        StringBuilder sbV = defpackage.e.v("PlatformUserChoiceProduct(id=", this.f45401a, ", offerToken=", this.f45402b, ", type=");
        sbV.append(this.f45403c);
        sbV.append(")");
        return sbV.toString();
    }
}
