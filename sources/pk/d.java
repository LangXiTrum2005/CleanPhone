package pk;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements Iterator, kk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f48401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f48402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f48403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f48404d;

    public d(long j10, long j11, long j12) {
        this.f48401a = j12;
        this.f48402b = j11;
        boolean z10 = false;
        if (j12 <= 0 ? j10 >= j11 : j10 <= j11) {
            z10 = true;
        }
        this.f48403c = z10;
        this.f48404d = z10 ? j10 : j11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f48403c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        long j10 = this.f48404d;
        if (j10 != this.f48402b) {
            this.f48404d = this.f48401a + j10;
        } else {
            if (!this.f48403c) {
                throw new NoSuchElementException();
            }
            this.f48403c = false;
        }
        return Long.valueOf(j10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
