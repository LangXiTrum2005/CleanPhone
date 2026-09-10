package x8;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a9.a f53661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f53662b;

    public a(a9.a aVar, HashMap map) {
        this.f53661a = aVar;
        this.f53662b = map;
    }

    public final long a(o8.d dVar, long j10, int i10) {
        long jF = j10 - this.f53661a.f();
        b bVar = (b) this.f53662b.get(dVar);
        long j11 = bVar.f53663a;
        int i11 = i10 - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * j11 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j11 > 1 ? j11 : 2L) * ((long) i11)))), jF), bVar.f53664b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f53661a.equals(aVar.f53661a) && this.f53662b.equals(aVar.f53662b);
    }

    public final int hashCode() {
        return this.f53662b.hashCode() ^ ((this.f53661a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f53661a + ", values=" + this.f53662b + "}";
    }
}
