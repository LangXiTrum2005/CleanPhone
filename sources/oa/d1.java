package oa;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class d1 extends AbstractList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f47241a;

    public d1(List list) {
        list.getClass();
        this.f47241a = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        this.f47241a.add(b(i10), obj);
    }

    public final int b(int i10) {
        int size = this.f47241a.size();
        go.k.q(i10, size);
        return size - i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f47241a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        List list = this.f47241a;
        int size = list.size();
        go.k.m(i10, size);
        return list.get((size - 1) - i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new c1(this, this.f47241a.listIterator(b(i10)));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        List list = this.f47241a;
        int size = list.size();
        go.k.m(i10, size);
        return list.remove((size - 1) - i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        subList(i10, i11).clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        List list = this.f47241a;
        int size = list.size();
        go.k.m(i10, size);
        return list.set((size - 1) - i10, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f47241a.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        List list = this.f47241a;
        go.k.r(i10, i11, list.size());
        return q.t(list.subList(b(i11), b(i10)));
    }
}
