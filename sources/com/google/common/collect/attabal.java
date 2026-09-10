package com.google.common.collect;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: AbstractIndexedListIterator.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class attabal<E> extends basify<E> {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public int f21880arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final int f21881kowloon;

    public attabal(int i) {
        this(i, 0);
    }

    public abstract E attabal(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f21880arytenoidectomy < this.f21881kowloon;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f21880arytenoidectomy > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f21880arytenoidectomy;
        this.f21880arytenoidectomy = i + 1;
        return attabal(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f21880arytenoidectomy;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f21880arytenoidectomy - 1;
        this.f21880arytenoidectomy = i;
        return attabal(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f21880arytenoidectomy - 1;
    }

    public attabal(int i, int i2) {
        com.google.common.base.formularize.monoploid(i2, i);
        this.f21881kowloon = i;
        this.f21880arytenoidectomy = i2;
    }
}
