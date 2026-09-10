package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class gb1 extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f14808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f14809b;

    public gb1(Set set, Set set2) {
        this.f14808a = set;
        this.f14809b = set2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final int b() {
        Set set = this.f14808a;
        int iB = set instanceof gb1 ? ((gb1) set).b() : set.size();
        Set set2 = this.f14809b;
        return Math.min(iB, set2 instanceof gb1 ? ((gb1) set2).b() : set2.size());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f14808a.contains(obj) && this.f14809b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f14808a.containsAll(collection) && this.f14809b.containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        int size;
        if (obj != this) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                boolean z10 = set instanceof gb1;
                int iB = z10 ? ((gb1) set).b() : set.size();
                if (iB >= 0) {
                    if (z10) {
                        size = 0;
                    } else {
                        size = set.size();
                    }
                    if (b() >= size) {
                        la1 la1Var = new la1(this, this.f14808a, this.f14809b);
                        int i10 = 0;
                        while (la1Var.hasNext()) {
                            try {
                                if (set.contains(la1Var.next())) {
                                    i10++;
                                }
                            } catch (ClassCastException | NullPointerException unused) {
                            }
                        }
                        if (i10 != iB) {
                            if (i10 >= size) {
                                Iterator it = set.iterator();
                                int i11 = 0;
                                while (it.hasNext()) {
                                    it.next();
                                    i11++;
                                    if (i11 > i10) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f14809b, this.f14808a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new la1(this, this.f14808a, this.f14809b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f14808a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.f14809b.contains(it.next())) {
                i10++;
            }
        }
        return i10;
    }
}
