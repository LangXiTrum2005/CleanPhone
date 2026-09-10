package oa;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class f1 extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f47251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final na.e f47252b;

    public f1(List list, na.e eVar) {
        list.getClass();
        this.f47251a = list;
        this.f47252b = eVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return this.f47252b.apply(this.f47251a.get(i10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f47251a.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new e1(this, this.f47251a.listIterator(i10), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        return this.f47252b.apply(this.f47251a.remove(i10));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        this.f47251a.subList(i10, i11).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f47251a.size();
    }
}
