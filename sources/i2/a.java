package i2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f42727b;

    public a(long j10, long j11) {
        this.f42726a = j10;
        this.f42727b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f42726a == aVar.f42726a && this.f42727b == aVar.f42727b;
    }

    public final int hashCode() {
        return (((int) this.f42726a) * 31) + ((int) this.f42727b);
    }
}
