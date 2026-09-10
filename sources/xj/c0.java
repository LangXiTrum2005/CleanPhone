package xj;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 implements ListIterator, kk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListIterator f53836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f53837b;

    public c0(d0 d0Var, int i10) {
        this.f53837b = d0Var;
        this.f53836a = d0Var.f53839a.listIterator(n.f0(d0Var, i10));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ListIterator listIterator = this.f53836a;
        listIterator.add(obj);
        listIterator.previous();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f53836a.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f53836a.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f53836a.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return o.P(this.f53837b) - this.f53836a.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f53836a.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return o.P(this.f53837b) - this.f53836a.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.f53836a.remove();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f53836a.set(obj);
    }
}
