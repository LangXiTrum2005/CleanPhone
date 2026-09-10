package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class qa1 extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d81 f19013b;

    public qa1(List list, d81 d81Var) {
        list.getClass();
        this.f19012a = list;
        this.f19013b = d81Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return this.f19013b.apply(this.f19012a.get(i10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f19012a.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new pa1(this, this.f19012a.listIterator(i10), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        return this.f19013b.apply(this.f19012a.remove(i10));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        this.f19012a.subList(i10, i11).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19012a.size();
    }
}
