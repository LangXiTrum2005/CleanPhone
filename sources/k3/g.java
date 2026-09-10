package k3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f44280b;

    public g(long j10, byte[] bArr) {
        this.f44279a = j10;
        this.f44280b = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f44279a, ((g) obj).f44279a);
    }
}
