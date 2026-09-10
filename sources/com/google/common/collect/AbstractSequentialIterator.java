package com.google.common.collect;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractSequentialIterator<T> extends UnmodifiableIterator<T> {
    public Object X;

    public AbstractSequentialIterator(Object obj) {
        this.X = obj;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.X != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.X;
        if (obj == null) {
            throw new NoSuchElementException();
        }
        this.X = a(obj);
        return obj;
    }
}
