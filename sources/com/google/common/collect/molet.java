package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: compiled from: TransformedIterator.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class molet<F, T> implements Iterator<T> {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final Iterator<? extends F> f21914kowloon;

    public molet(Iterator<? extends F> it) {
        this.f21914kowloon = (Iterator) com.google.common.base.formularize.triweekly(it);
    }

    public abstract T attabal(F f);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21914kowloon.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return attabal(this.f21914kowloon.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f21914kowloon.remove();
    }
}
