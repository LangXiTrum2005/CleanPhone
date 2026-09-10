package y8;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f54325f = new a(200, 10000, 81920, 10485760, 604800000);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f54326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f54329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f54330e;

    public a(int i10, int i11, int i12, long j10, long j11) {
        this.f54326a = j10;
        this.f54327b = i10;
        this.f54328c = i11;
        this.f54329d = j11;
        this.f54330e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f54326a == aVar.f54326a && this.f54327b == aVar.f54327b && this.f54328c == aVar.f54328c && this.f54329d == aVar.f54329d && this.f54330e == aVar.f54330e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f54326a;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f54327b) * 1000003) ^ this.f54328c) * 1000003;
        long j11 = this.f54329d;
        return this.f54330e ^ ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f54326a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f54327b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f54328c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.f54329d);
        sb2.append(", maxBlobByteSizePerRow=");
        return l1.d.i(sb2, this.f54330e, "}");
    }
}
