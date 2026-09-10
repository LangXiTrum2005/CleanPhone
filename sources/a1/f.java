package a1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3335b;

    public f(long j10, long j11) {
        if (j11 == 0) {
            this.f3334a = 0L;
            this.f3335b = 1L;
        } else {
            this.f3334a = j10;
            this.f3335b = j11;
        }
    }

    public final String toString() {
        return this.f3334a + "/" + this.f3335b;
    }
}
