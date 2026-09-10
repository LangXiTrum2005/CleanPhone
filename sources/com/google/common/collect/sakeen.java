package com.google.common.collect;

import java.util.ListIterator;

/* JADX INFO: compiled from: TransformedListIterator.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class sakeen<F, T> extends molet<F, T> implements ListIterator<T> {
    public sakeen(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    @Override // java.util.ListIterator
    public void add(T t) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return saneness().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return saneness().nextIndex();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        return attabal(saneness().previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return saneness().previousIndex();
    }

    public final ListIterator<? extends F> saneness() {
        return (ListIterator) this.f21914kowloon;
    }

    @Override // java.util.ListIterator
    public void set(T t) {
        throw new UnsupportedOperationException();
    }
}
