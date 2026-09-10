package com.adjust.sdk.sig;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class a implements Iterator, q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f6921b;

    public a(d dVar) {
        this.f6921b = dVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6920a < this.f6921b.a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        d dVar = this.f6921b;
        int i10 = this.f6920a;
        this.f6920a = i10 + 1;
        return dVar.get(i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
