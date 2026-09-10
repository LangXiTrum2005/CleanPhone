package cc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class j1 extends o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n2 f6125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6128d;

    public j1(k1 k1Var, String str, String str2, long j10) {
        this.f6125a = k1Var;
        this.f6126b = str;
        this.f6127c = str2;
        this.f6128d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o2) {
            j1 j1Var = (j1) ((o2) obj);
            if (this.f6125a.equals(j1Var.f6125a) && this.f6126b.equals(j1Var.f6126b) && this.f6127c.equals(j1Var.f6127c) && this.f6128d == j1Var.f6128d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f6125a.hashCode() ^ 1000003) * 1000003) ^ this.f6126b.hashCode()) * 1000003) ^ this.f6127c.hashCode()) * 1000003;
        long j10 = this.f6128d;
        return ((int) ((j10 >>> 32) ^ j10)) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f6125a);
        sb2.append(", parameterKey=");
        sb2.append(this.f6126b);
        sb2.append(", parameterValue=");
        sb2.append(this.f6127c);
        sb2.append(", templateVersion=");
        return defpackage.e.r(sb2, this.f6128d, "}");
    }
}
