package mb;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f45916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f45917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f45918c;

    public a(long j10, long j11, long j12) {
        this.f45916a = j10;
        this.f45917b = j11;
        this.f45918c = j12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f45916a == aVar.f45916a && this.f45917b == aVar.f45917b && this.f45918c == aVar.f45918c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f45916a;
        long j11 = this.f45917b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f45918c;
        return ((int) ((j12 >>> 32) ^ j12)) ^ i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f45916a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f45917b);
        sb2.append(", uptimeMillis=");
        return defpackage.e.r(sb2, this.f45918c, "}");
    }
}
