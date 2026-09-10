package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
abstract class TransformedIterator<F, T> implements Iterator<T> {
    public final Iterator X;

    public TransformedIterator(Iterator it) {
        it.getClass();
        this.X = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.X.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.X.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.X.remove();
    }
}
