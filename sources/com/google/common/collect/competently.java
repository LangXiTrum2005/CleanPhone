package com.google.common.collect;

import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: AbstractSequentialIterator.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class competently<T> extends immediately<T> {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    @CheckForNull
    public T f21883kowloon;

    public competently(@CheckForNull T t) {
        this.f21883kowloon = t;
    }

    @CheckForNull
    public abstract T attabal(T t);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21883kowloon != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t = this.f21883kowloon;
        if (t == null) {
            throw new NoSuchElementException();
        }
        this.f21883kowloon = attabal(t);
        return t;
    }
}
