package cc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class x0 extends d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6334d;

    public x0(long j10, long j11, String str, String str2) {
        this.f6331a = j10;
        this.f6332b = j11;
        this.f6333c = str;
        this.f6334d = str2;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d2) {
            x0 x0Var = (x0) ((d2) obj);
            String str2 = x0Var.f6334d;
            if (this.f6331a == x0Var.f6331a && this.f6332b == x0Var.f6332b && this.f6333c.equals(x0Var.f6333c) && ((str = this.f6334d) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f6331a;
        long j11 = this.f6332b;
        int iHashCode = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f6333c.hashCode()) * 1000003;
        String str = this.f6334d;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BinaryImage{baseAddress=");
        sb2.append(this.f6331a);
        sb2.append(", size=");
        sb2.append(this.f6332b);
        sb2.append(", name=");
        sb2.append(this.f6333c);
        sb2.append(", uuid=");
        return defpackage.e.q(this.f6334d, "}", sb2);
    }
}
