package pk;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements Iterable, kk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f48405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f48406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f48407c;

    public e(long j10, long j11) {
        this.f48405a = j10;
        if (j10 < j11) {
            long j12 = j11 % 1;
            long j13 = j10 % 1;
            long j14 = ((j12 < 0 ? j12 + 1 : j12) - (j13 < 0 ? j13 + 1 : j13)) % 1;
            j11 -= j14 < 0 ? j14 + 1 : j14;
        }
        this.f48406b = j11;
        this.f48407c = 1L;
    }

    public final boolean b(long j10) {
        return this.f48405a <= j10 && j10 <= this.f48406b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (isEmpty() && ((e) obj).isEmpty()) {
            return true;
        }
        e eVar = (e) obj;
        return this.f48405a == eVar.f48405a && this.f48406b == eVar.f48406b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j10 = this.f48405a;
        long j11 = ((long) 31) * (j10 ^ (j10 >>> 32));
        long j12 = this.f48406b;
        return (int) (j11 + (j12 ^ (j12 >>> 32)));
    }

    public final boolean isEmpty() {
        return this.f48405a > this.f48406b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new d(this.f48405a, this.f48406b, this.f48407c);
    }

    public final String toString() {
        return this.f48405a + ".." + this.f48406b;
    }
}
