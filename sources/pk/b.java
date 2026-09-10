package pk;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements Iterator, kk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f48398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f48399d;

    public b(int i10, int i11, int i12) {
        this.f48396a = i12;
        this.f48397b = i11;
        boolean z10 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z10 = true;
        }
        this.f48398c = z10;
        this.f48399d = z10 ? i10 : i11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f48398c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public final int nextInt() {
        int i10 = this.f48399d;
        if (i10 != this.f48397b) {
            this.f48399d = this.f48396a + i10;
            return i10;
        }
        if (!this.f48398c) {
            throw new NoSuchElementException();
        }
        this.f48398c = false;
        return i10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
