package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractMultiset<E> extends AbstractCollection<E> implements Multiset<E> {
    public transient Set X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public transient Set f19793Y;

    public class ElementSet extends Multisets.ElementSet<E> {
        public ElementSet() {
        }

        @Override // com.google.common.collect.Multisets.ElementSet
        public final Multiset a() {
            return AbstractMultiset.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return AbstractMultiset.this.i();
        }
    }

    public class EntrySet extends Multisets.EntrySet<E> {
        public EntrySet() {
        }

        @Override // com.google.common.collect.Multisets.EntrySet
        public Multiset a() {
            return AbstractMultiset.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return AbstractMultiset.this.l();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return AbstractMultiset.this.h();
        }
    }

    public int Q0(Object obj) {
        CollectPreconditions.b(0, "count");
        int iW0 = w0(obj);
        int i2 = 0 - iW0;
        if (i2 > 0) {
            add(i2, obj);
            return iW0;
        }
        if (i2 < 0) {
            m(-i2, obj);
        }
        return iW0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        add(1, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (!(collection instanceof Multiset)) {
            if (collection.isEmpty()) {
                return false;
            }
            return Iterators.a(this, collection.iterator());
        }
        Multiset multiset = (Multiset) collection;
        if (!(multiset instanceof AbstractMapBasedMultiset)) {
            if (multiset.isEmpty()) {
                return false;
            }
            for (Multiset.Entry entry : multiset.entrySet()) {
                add(entry.getCount(), entry.d());
            }
            return true;
        }
        AbstractMapBasedMultiset abstractMapBasedMultiset = (AbstractMapBasedMultiset) multiset;
        if (abstractMapBasedMultiset.isEmpty()) {
            return false;
        }
        for (int iC = abstractMapBasedMultiset.Z.c(); iC >= 0; iC = abstractMapBasedMultiset.Z.k(iC)) {
            add(abstractMapBasedMultiset.Z.f(iC), abstractMapBasedMultiset.Z.e(iC));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return w0(obj) > 0;
    }

    public Set d() {
        return new ElementSet();
    }

    @Override // com.google.common.collect.Multiset
    public Set entrySet() {
        Set set = this.f19793Y;
        if (set != null) {
            return set;
        }
        Set setG = g();
        this.f19793Y = setG;
        return setG;
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final boolean equals(Object obj) {
        return Multisets.a(this, obj);
    }

    public Set g() {
        return new EntrySet();
    }

    public abstract int h();

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final int hashCode() {
        return entrySet().hashCode();
    }

    public abstract Iterator i();

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @Override // com.google.common.collect.Multiset
    public Set k() {
        Set set = this.X;
        if (set != null) {
            return set;
        }
        Set setD = d();
        this.X = setD;
        return setD;
    }

    public abstract Iterator l();

    public int m(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean r(int i2, Object obj) {
        CollectPreconditions.b(i2, "oldCount");
        CollectPreconditions.b(0, "newCount");
        if (w0(obj) != i2) {
            return false;
        }
        Q0(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return m(1, obj) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).k();
        }
        return k().removeAll(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).k();
        }
        return k().retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return entrySet().toString();
    }

    public int add(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }
}
