package cc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class k1 extends n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6141b;

    public k1(String str, String str2) {
        this.f6140a = str;
        this.f6141b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n2) {
            k1 k1Var = (k1) ((n2) obj);
            if (this.f6140a.equals(k1Var.f6140a) && this.f6141b.equals(k1Var.f6141b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6141b.hashCode() ^ ((this.f6140a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f6140a);
        sb2.append(", variantId=");
        return defpackage.e.q(this.f6141b, "}", sb2);
    }
}
