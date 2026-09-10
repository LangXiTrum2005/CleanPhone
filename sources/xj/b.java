package xj;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements Iterator, kk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f53834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f53835b;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f53834a;
        if (i10 == 0) {
            this.f53834a = 3;
            a();
            return this.f53834a == 1;
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f53834a;
        if (i10 == 1) {
            this.f53834a = 0;
            return this.f53835b;
        }
        if (i10 != 2) {
            this.f53834a = 3;
            a();
            if (this.f53834a == 1) {
                this.f53834a = 0;
                return this.f53835b;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
