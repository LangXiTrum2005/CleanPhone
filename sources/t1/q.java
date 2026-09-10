package t1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f50404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f50405b;

    public q(long j10, long j11) {
        this.f50404a = j10;
        this.f50405b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f50404a == qVar.f50404a && this.f50405b == qVar.f50405b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f50404a) * 31) + ((int) this.f50405b);
    }
}
