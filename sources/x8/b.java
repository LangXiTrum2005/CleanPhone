package x8;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f53663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f53664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f53665c;

    public b(long j10, long j11, Set set) {
        this.f53663a = j10;
        this.f53664b = j11;
        this.f53665c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f53663a == bVar.f53663a && this.f53664b == bVar.f53664b && this.f53665c.equals(bVar.f53665c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f53663a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f53664b;
        return this.f53665c.hashCode() ^ ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f53663a + ", maxAllowedDelay=" + this.f53664b + ", flags=" + this.f53665c + "}";
    }
}
