package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: compiled from: UnmodifiableIterator.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class immediately<E> implements Iterator<E> {
    @Override // java.util.Iterator
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
