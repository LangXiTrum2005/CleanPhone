package cc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class g1 extends l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f6096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6101f;

    public g1(Double d10, int i10, boolean z10, int i11, long j10, long j11) {
        this.f6096a = d10;
        this.f6097b = i10;
        this.f6098c = z10;
        this.f6099d = i11;
        this.f6100e = j10;
        this.f6101f = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l2) {
            l2 l2Var = (l2) obj;
            Double d10 = this.f6096a;
            if (d10 != null ? d10.equals(((g1) l2Var).f6096a) : ((g1) l2Var).f6096a == null) {
                g1 g1Var = (g1) l2Var;
                if (this.f6097b == g1Var.f6097b && this.f6098c == g1Var.f6098c && this.f6099d == g1Var.f6099d && this.f6100e == g1Var.f6100e && this.f6101f == g1Var.f6101f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Double d10 = this.f6096a;
        int iHashCode = ((((((((d10 == null ? 0 : d10.hashCode()) ^ 1000003) * 1000003) ^ this.f6097b) * 1000003) ^ (this.f6098c ? 1231 : 1237)) * 1000003) ^ this.f6099d) * 1000003;
        long j10 = this.f6100e;
        long j11 = this.f6101f;
        return ((int) (j11 ^ (j11 >>> 32))) ^ ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f6096a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f6097b);
        sb2.append(", proximityOn=");
        sb2.append(this.f6098c);
        sb2.append(", orientation=");
        sb2.append(this.f6099d);
        sb2.append(", ramUsed=");
        sb2.append(this.f6100e);
        sb2.append(", diskUsed=");
        return defpackage.e.r(sb2, this.f6101f, "}");
    }
}
