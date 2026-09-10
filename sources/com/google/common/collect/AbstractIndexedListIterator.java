package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractIndexedListIterator<E> extends UnmodifiableListIterator<E> {
    public final int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f19781Y;

    public AbstractIndexedListIterator(int i2, int i3) {
        Preconditions.k(i3, i2);
        this.X = i2;
        this.f19781Y = i3;
    }

    public abstract Object a(int i2);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f19781Y < this.X;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f19781Y > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f19781Y;
        this.f19781Y = i2 + 1;
        return a(i2);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f19781Y;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f19781Y - 1;
        this.f19781Y = i2;
        return a(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f19781Y - 1;
    }
}
