package y8;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f54331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r8.i f54332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r8.h f54333c;

    public b(long j10, r8.i iVar, r8.h hVar) {
        this.f54331a = j10;
        this.f54332b = iVar;
        this.f54333c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f54331a == bVar.f54331a && this.f54332b.equals(bVar.f54332b) && this.f54333c.equals(bVar.f54333c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f54331a;
        return this.f54333c.hashCode() ^ ((((((int) ((j10 >>> 32) ^ j10)) ^ 1000003) * 1000003) ^ this.f54332b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f54331a + ", transportContext=" + this.f54332b + ", event=" + this.f54333c + "}";
    }
}
