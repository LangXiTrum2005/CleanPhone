package com.google.android.gms.internal.play_billing;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends b0 implements ListIterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f24440d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, int i10) {
        super(0);
        int size = rVar.size();
        no.b.J(i10, size);
        this.f24438b = size;
        this.f24439c = i10;
        this.f24440d = rVar;
    }

    public final Object a(int i10) {
        return this.f24440d.get(i10);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f24439c < this.f24438b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f24439c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f24439c;
        this.f24439c = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f24439c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f24439c - 1;
        this.f24439c = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f24439c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
