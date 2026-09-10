package com.google.android.gms.internal.consent_sdk;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends v0 implements ListIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o0 f23091c;

    public m0(o0 o0Var, int i10) {
        int size = o0Var.size();
        j0.d(i10, size);
        this.f23089a = size;
        this.f23090b = i10;
        this.f23091c = o0Var;
    }

    public final Object a(int i10) {
        return this.f23091c.get(i10);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f23090b < this.f23089a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f23090b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f23090b;
        this.f23090b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f23090b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f23090b - 1;
        this.f23090b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f23090b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
