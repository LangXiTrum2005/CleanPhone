package cc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class z0 extends f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6347c;

    public z0(String str, String str2, long j10) {
        this.f6345a = str;
        this.f6346b = str2;
        this.f6347c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2) {
            z0 z0Var = (z0) ((f2) obj);
            if (this.f6345a.equals(z0Var.f6345a) && this.f6346b.equals(z0Var.f6346b) && this.f6347c == z0Var.f6347c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f6345a.hashCode() ^ 1000003) * 1000003) ^ this.f6346b.hashCode()) * 1000003;
        long j10 = this.f6347c;
        return ((int) ((j10 >>> 32) ^ j10)) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f6345a);
        sb2.append(", code=");
        sb2.append(this.f6346b);
        sb2.append(", address=");
        return defpackage.e.r(sb2, this.f6347c, "}");
    }
}
