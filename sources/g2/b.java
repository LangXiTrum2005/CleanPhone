package g2;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f41345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f41346c;

    public b(long j10, long j11) {
        this.f41344a = j10;
        this.f41345b = j11;
        this.f41346c = j10 - 1;
    }

    public final void a() {
        long j10 = this.f41346c;
        if (j10 < this.f41344a || j10 > this.f41345b) {
            throw new NoSuchElementException();
        }
    }

    @Override // g2.n
    public final boolean next() {
        long j10 = this.f41346c + 1;
        this.f41346c = j10;
        return !(j10 > this.f41345b);
    }
}
