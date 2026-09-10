package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class Multisets {

    /* JADX INFO: renamed from: com.google.common.collect.Multisets$1, reason: invalid class name */
    class AnonymousClass1 extends ViewMultiset<Object> {

        /* JADX INFO: renamed from: com.google.common.collect.Multisets$1$1, reason: invalid class name and collision with other inner class name */
        class C01981 extends AbstractIterator<Multiset.Entry<Object>> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Set d() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Iterator i() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Iterator l() {
            throw null;
        }

        @Override // com.google.common.collect.Multiset
        public final int w0(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Multisets$2, reason: invalid class name */
    class AnonymousClass2 extends ViewMultiset<Object> {

        /* JADX INFO: renamed from: com.google.common.collect.Multisets$2$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIterator<Multiset.Entry<Object>> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Set d() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Iterator i() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Iterator l() {
            throw null;
        }

        @Override // com.google.common.collect.Multiset
        public final int w0(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Multisets$3, reason: invalid class name */
    class AnonymousClass3 extends ViewMultiset<Object> {

        /* JADX INFO: renamed from: com.google.common.collect.Multisets$3$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIterator<Multiset.Entry<Object>> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Set d() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Iterator i() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Iterator l() {
            throw null;
        }

        @Override // com.google.common.collect.Multisets.ViewMultiset, java.util.AbstractCollection, java.util.Collection
        public final int size() {
            throw null;
        }

        @Override // com.google.common.collect.Multiset
        public final int w0(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Multisets$4, reason: invalid class name */
    class AnonymousClass4 extends ViewMultiset<Object> {

        /* JADX INFO: renamed from: com.google.common.collect.Multisets$4$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIterator<Object> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.Multisets$4$2, reason: invalid class name */
        class AnonymousClass2 extends AbstractIterator<Multiset.Entry<Object>> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        @Override // com.google.common.collect.Multisets.ViewMultiset, java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multisets.ViewMultiset, com.google.common.collect.AbstractMultiset
        public final int h() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Iterator i() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Iterator l() {
            throw null;
        }

        @Override // com.google.common.collect.Multiset
        public final int w0(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Multisets$5, reason: invalid class name */
    class AnonymousClass5 extends TransformedIterator<Multiset.Entry<Object>, Object> {
        @Override // com.google.common.collect.TransformedIterator
        public final Object a(Object obj) {
            return ((Multiset.Entry) obj).d();
        }
    }

    public static abstract class AbstractEntry<E> implements Multiset.Entry<E> {
        public final boolean equals(Object obj) {
            if (obj instanceof Multiset.Entry) {
                Multiset.Entry entry = (Multiset.Entry) obj;
                if (getCount() == entry.getCount() && Objects.a(d(), entry.d())) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            Object objD = d();
            return (objD == null ? 0 : objD.hashCode()) ^ getCount();
        }

        public final String toString() {
            String strValueOf = String.valueOf(d());
            int count = getCount();
            return count == 1 ? strValueOf : androidx.datastore.preferences.protobuf.a.m(strValueOf, " x ", count);
        }
    }

    public static final class DecreasingCount implements Comparator<Multiset.Entry<?>> {
        @Override // java.util.Comparator
        public final int compare(Multiset.Entry<?> entry, Multiset.Entry<?> entry2) {
            return entry2.getCount() - entry.getCount();
        }
    }

    public static abstract class ElementSet<E> extends Sets.ImprovedAbstractSet<E> {
        public abstract Multiset a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return a().contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection collection) {
            return a().containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            return a().m(Integer.MAX_VALUE, obj) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return a().entrySet().size();
        }
    }

    public static abstract class EntrySet<E> extends Sets.ImprovedAbstractSet<Multiset.Entry<E>> {
        public abstract Multiset a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Multiset.Entry)) {
                return false;
            }
            Multiset.Entry entry = (Multiset.Entry) obj;
            return entry.getCount() > 0 && a().w0(entry.d()) == entry.getCount();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            if (!(obj instanceof Multiset.Entry)) {
                return false;
            }
            Multiset.Entry entry = (Multiset.Entry) obj;
            Object objD = entry.d();
            int count = entry.getCount();
            if (count != 0) {
                return a().r(count, objD);
            }
            return false;
        }
    }

    public static final class FilteredMultiset<E> extends ViewMultiset<E> {

        /* JADX INFO: renamed from: com.google.common.collect.Multisets$FilteredMultiset$1, reason: invalid class name */
        class AnonymousClass1 implements Predicate<Multiset.Entry<Object>> {
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                throw null;
            }
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public final int add(int i2, Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Set d() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Set g() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Iterator i() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.Multisets.ViewMultiset, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Iterator l() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public final int m(int i2, Object obj) {
            CollectPreconditions.b(i2, "occurrences");
            if (i2 == 0 || contains(obj)) {
                throw null;
            }
            return 0;
        }

        @Override // com.google.common.collect.Multiset
        public final int w0(Object obj) {
            throw null;
        }
    }

    public static class ImmutableEntry<E> extends AbstractEntry<E> implements Serializable {
        private static final long serialVersionUID = 0;
        public final Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final int f19934Y;

        public ImmutableEntry(Object obj, int i2) {
            this.X = obj;
            this.f19934Y = i2;
            CollectPreconditions.b(i2, "count");
        }

        @Override // com.google.common.collect.Multiset.Entry
        public final Object d() {
            return this.X;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public final int getCount() {
            return this.f19934Y;
        }
    }

    public static final class MultisetIteratorImpl<E> implements Iterator<E> {
        public final Multiset X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Iterator f19935Y;
        public Multiset.Entry Z;
        public int e0;
        public int f0;
        public boolean g0;

        public MultisetIteratorImpl(Multiset multiset, Iterator it) {
            this.X = multiset;
            this.f19935Y = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.e0 > 0 || this.f19935Y.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            if (this.e0 == 0) {
                Multiset.Entry entry = (Multiset.Entry) this.f19935Y.next();
                this.Z = entry;
                int count = entry.getCount();
                this.e0 = count;
                this.f0 = count;
            }
            this.e0--;
            this.g0 = true;
            Multiset.Entry entry2 = this.Z;
            java.util.Objects.requireNonNull(entry2);
            return entry2.d();
        }

        @Override // java.util.Iterator
        public final void remove() {
            CollectPreconditions.d(this.g0);
            if (this.f0 == 1) {
                this.f19935Y.remove();
            } else {
                Multiset.Entry entry = this.Z;
                java.util.Objects.requireNonNull(entry);
                this.X.remove(entry.d());
            }
            this.f0--;
            this.g0 = false;
        }
    }

    public static class UnmodifiableMultiset<E> extends ForwardingMultiset<E> implements Serializable {
        private static final long serialVersionUID = 0;
        public final SortedMultiset X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public transient Set f19936Y;
        public transient Set Z;

        public UnmodifiableMultiset(SortedMultiset sortedMultiset) {
            this.X = sortedMultiset;
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public Multiset w() {
            return this.X;
        }

        public Set B() {
            return Collections.unmodifiableSet(this.X.k());
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public final int Q0(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public final Set entrySet() {
            Set set = this.Z;
            if (set != null) {
                return set;
            }
            Set setUnmodifiableSet = Collections.unmodifiableSet(this.X.entrySet());
            this.Z = setUnmodifiableSet;
            return setUnmodifiableSet;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return Iterators.n(this.X.iterator());
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public Set k() {
            Set set = this.f19936Y;
            if (set != null) {
                return set;
            }
            Set setB = B();
            this.f19936Y = setB;
            return setB;
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public final int m(int i2, Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public final boolean r(int i2, Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public final int add(int i2, Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    public static abstract class ViewMultiset<E> extends AbstractMultiset<E> {
        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            k().clear();
        }

        @Override // com.google.common.collect.AbstractMultiset
        public int h() {
            return k().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return Multisets.b(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            Iterator<E> it = entrySet().iterator();
            long count = 0;
            while (it.hasNext()) {
                count += (long) ((Multiset.Entry) it.next()).getCount();
            }
            return Ints.e(count);
        }
    }

    public static boolean a(Multiset multiset, Object obj) {
        if (obj == multiset) {
            return true;
        }
        if (!(obj instanceof Multiset)) {
            return false;
        }
        Multiset multiset2 = (Multiset) obj;
        if (multiset.size() != multiset2.size() || multiset.entrySet().size() != multiset2.entrySet().size()) {
            return false;
        }
        for (Multiset.Entry entry : multiset2.entrySet()) {
            if (multiset.w0(entry.d()) != entry.getCount()) {
                return false;
            }
        }
        return true;
    }

    public static Iterator b(Multiset multiset) {
        return new MultisetIteratorImpl(multiset, multiset.entrySet().iterator());
    }
}
