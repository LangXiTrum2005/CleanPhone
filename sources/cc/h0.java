package cc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6105b;

    public h0(String str, String str2) {
        this.f6104a = str;
        this.f6105b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1) {
            h0 h0Var = (h0) ((v1) obj);
            if (this.f6104a.equals(h0Var.f6104a) && this.f6105b.equals(h0Var.f6105b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6105b.hashCode() ^ ((this.f6104a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f6104a);
        sb2.append(", value=");
        return defpackage.e.q(this.f6105b, "}", sb2);
    }
}
