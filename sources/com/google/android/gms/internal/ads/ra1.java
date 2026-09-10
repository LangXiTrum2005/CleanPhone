package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ra1 extends AbstractSequentialList implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d81 f19494b;

    public ra1(List list, d81 d81Var) {
        list.getClass();
        this.f19493a = list;
        this.f19494b = d81Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f19493a.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new pa1(this, this.f19493a.listIterator(i10), 1);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        this.f19493a.subList(i10, i11).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19493a.size();
    }
}
