package com.adjust.sdk.sig;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Iterator, q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f6951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6952b;

    public f(Object[] objArr) {
        this.f6951a = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6952b < this.f6951a.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            Object[] objArr = this.f6951a;
            int i10 = this.f6952b;
            this.f6952b = i10 + 1;
            return objArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f6952b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
