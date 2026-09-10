package oa;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c1 implements ListIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f47232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ListIterator f47233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d1 f47234c;

    public c1(d1 d1Var, ListIterator listIterator) {
        this.f47233b = listIterator;
        this.f47234c = d1Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ListIterator listIterator = this.f47233b;
        listIterator.add(obj);
        listIterator.previous();
        this.f47232a = false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f47233b.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f47233b.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        ListIterator listIterator = this.f47233b;
        if (!listIterator.hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f47232a = true;
        return listIterator.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f47234c.b(this.f47233b.nextIndex());
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        ListIterator listIterator = this.f47233b;
        if (!listIterator.hasNext()) {
            throw new NoSuchElementException();
        }
        this.f47232a = true;
        return listIterator.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return nextIndex() - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        go.k.s("no calls to next() since the last call to remove()", this.f47232a);
        this.f47233b.remove();
        this.f47232a = false;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        go.k.t(this.f47232a);
        this.f47233b.set(obj);
    }
}
