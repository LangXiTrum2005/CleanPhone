package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
abstract class DescendingMultiset<E> extends ForwardingMultiset<E> implements SortedMultiset<E> {
    public transient Ordering X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public transient NavigableSet f19814Y;
    public transient Set Z;

    @Override // com.google.common.collect.ForwardingMultiset
    /* JADX INFO: renamed from: A */
    public final Multiset w() {
        return C();
    }

    public abstract Iterator B();

    public abstract SortedMultiset C();

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public final Comparator comparator() {
        Ordering ordering = this.X;
        if (ordering != null) {
            return ordering;
        }
        Ordering orderingJ = Ordering.b(C().comparator()).j();
        this.X = orderingJ;
        return orderingJ;
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
    public final Set entrySet() {
        Set set = this.Z;
        if (set != null) {
            return set;
        }
        Multisets.EntrySet<Object> entrySet = new Multisets.EntrySet<Object>() { // from class: com.google.common.collect.DescendingMultiset.1EntrySetImpl
            @Override // com.google.common.collect.Multisets.EntrySet
            public final Multiset a() {
                return DescendingMultiset.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                return DescendingMultiset.this.B();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                return DescendingMultiset.this.C().entrySet().size();
            }
        };
        this.Z = entrySet;
        return entrySet;
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry firstEntry() {
        return C().lastEntry();
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return Multisets.b(this);
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry lastEntry() {
        return C().firstEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset n(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        return C().n(obj2, boundType2, obj, boundType).q();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry pollFirstEntry() {
        return C().pollLastEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry pollLastEntry() {
        return C().pollFirstEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset q() {
        return C();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset t0(Object obj, BoundType boundType) {
        return ((TreeMultiset) C()).z0(obj, boundType).q();
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return y();
    }

    @Override // com.google.common.collect.ForwardingObject
    public final String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    /* JADX INFO: renamed from: w */
    public final Object x() {
        return C();
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection
    public final Collection x() {
        return C();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset z0(Object obj, BoundType boundType) {
        return ((TreeMultiset) C()).t0(obj, boundType).q();
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return ObjectArrays.c(this, objArr);
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
    public final NavigableSet k() {
        NavigableSet navigableSet = this.f19814Y;
        if (navigableSet != null) {
            return navigableSet;
        }
        SortedMultisets.NavigableElementSet navigableElementSet = new SortedMultisets.NavigableElementSet(this);
        this.f19814Y = navigableElementSet;
        return navigableElementSet;
    }
}
