package cc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c1 extends g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6026e;

    public c1(long j10, String str, String str2, long j11, int i10) {
        this.f6022a = j10;
        this.f6023b = str;
        this.f6024c = str2;
        this.f6025d = j11;
        this.f6026e = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g2) {
            c1 c1Var = (c1) ((g2) obj);
            String str2 = c1Var.f6024c;
            if (this.f6022a == c1Var.f6022a && this.f6023b.equals(c1Var.f6023b) && ((str = this.f6024c) != null ? str.equals(str2) : str2 == null) && this.f6025d == c1Var.f6025d && this.f6026e == c1Var.f6026e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f6022a;
        int iHashCode = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f6023b.hashCode()) * 1000003;
        String str = this.f6024c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j11 = this.f6025d;
        return this.f6026e ^ ((iHashCode2 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.f6022a);
        sb2.append(", symbol=");
        sb2.append(this.f6023b);
        sb2.append(", file=");
        sb2.append(this.f6024c);
        sb2.append(", offset=");
        sb2.append(this.f6025d);
        sb2.append(", importance=");
        return l1.d.i(sb2, this.f6026e, "}");
    }
}
