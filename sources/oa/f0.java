package oa;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends e2 implements ListIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f47250c;

    public f0(j0 j0Var, int i10) {
        int size = j0Var.size();
        go.k.q(i10, size);
        this.f47248a = size;
        this.f47249b = i10;
        this.f47250c = j0Var;
    }

    public final Object a(int i10) {
        return this.f47250c.get(i10);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f47249b < this.f47248a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f47249b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f47249b;
        this.f47249b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f47249b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f47249b - 1;
        this.f47249b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f47249b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
