package com.google.common.collect;

import java.util.ListIterator;

/* JADX INFO: compiled from: UnmodifiableListIterator.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class basify<E> extends immediately<E> implements ListIterator<E> {
    @Override // java.util.ListIterator
    @Deprecated
    public final void add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void set(E e) {
        throw new UnsupportedOperationException();
    }
}
