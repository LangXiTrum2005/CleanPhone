package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: compiled from: PeekingIterator.java */
/* JADX INFO: loaded from: classes3.dex */
public interface vesuvio<E> extends Iterator<E> {
    @Override // java.util.Iterator
    E next();

    E peek();
}
