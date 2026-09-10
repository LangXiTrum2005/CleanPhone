package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v81 extends mb1 implements ListIterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21114c;

    public v81(int i10, int i11) {
        super(0);
        ps1.g0(i11, i10);
        this.f21113b = i10;
        this.f21114c = i11;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public abstract Object b(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f21114c < this.f21113b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f21114c > 0;
    }

    @Override // com.google.android.gms.internal.ads.mb1, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f21114c;
        this.f21114c = i10 + 1;
        return b(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f21114c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f21114c - 1;
        this.f21114c = i10;
        return b(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f21114c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
