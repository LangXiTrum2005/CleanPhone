package com.adjust.sdk.sig;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a implements ListIterator {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f6924c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, int i10) {
        super(dVar);
        this.f6924c = dVar;
        int iA = dVar.a();
        if (i10 < 0 || i10 > iA) {
            throw new IndexOutOfBoundsException(defpackage.e.g(i10, iA, "index: ", ", size: "));
        }
        this.f6920a = i10;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f6920a > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f6920a;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        d dVar = this.f6924c;
        int i10 = this.f6920a - 1;
        this.f6920a = i10;
        return dVar.get(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f6920a - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
