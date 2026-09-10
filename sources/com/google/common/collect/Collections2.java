package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class Collections2 {

    public static class FilteredCollection<E> extends AbstractCollection<E> {
        public final Collection X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Predicate f19799Y;

        public FilteredCollection(Collection collection, Predicate predicate) {
            this.X = collection;
            this.f19799Y = predicate;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean add(Object obj) {
            Preconditions.f(this.f19799Y.apply(obj));
            return this.X.add(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean addAll(Collection collection) {
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                Preconditions.f(this.f19799Y.apply(it.next()));
            }
            return this.X.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            Iterables.f(this.X, this.f19799Y);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            if (Collections2.c(obj, this.X)) {
                return this.f19799Y.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean containsAll(Collection collection) {
            return Collections2.a(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return !Iterables.a(this.X, this.f19799Y);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return Iterators.e(this.X.iterator(), this.f19799Y);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            return contains(obj) && this.X.remove(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection collection) {
            Iterator<E> it = this.X.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f19799Y.apply(next) && collection.contains(next)) {
                    it.remove();
                    z2 = true;
                }
            }
            return z2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection collection) {
            Iterator<E> it = this.X.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f19799Y.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z2 = true;
                }
            }
            return z2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            Iterator<E> it = this.X.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                if (this.f19799Y.apply(it.next())) {
                    i2++;
                }
            }
            return i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final Object[] toArray() {
            return Lists.a(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            return Lists.a(iterator()).toArray(objArr);
        }
    }

    public static final class OrderedPermutationCollection<E> extends AbstractCollection<List<E>> {
        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            if (obj instanceof List) {
                throw null;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return 0;
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            return "orderedPermutationCollection(null)";
        }
    }

    public static final class OrderedPermutationIterator<E> extends AbstractIterator<List<E>> {
        public ArrayList Z;

        @Override // com.google.common.collect.AbstractIterator
        public final Object a() {
            ArrayList arrayList = this.Z;
            if (arrayList == null) {
                this.X = AbstractIterator.State.Z;
                return null;
            }
            ImmutableList immutableListU = ImmutableList.u(arrayList);
            Objects.requireNonNull(this.Z);
            int size = this.Z.size();
            int i2 = size - 2;
            if (i2 < 0) {
                this.Z = null;
                return immutableListU;
            }
            this.Z.get(i2);
            this.Z.get(size - 1);
            throw null;
        }
    }

    public static final class PermutationCollection<E> extends AbstractCollection<List<E>> {
        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            if (obj instanceof List) {
                throw null;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            new PermutationIterator();
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            throw null;
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            return "permutations(null)";
        }
    }

    public static class PermutationIterator<E> extends AbstractIterator<List<E>> {
        public final ArrayList Z = new ArrayList((Collection) null);
        public int e0;

        public PermutationIterator() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractIterator
        public final Object a() {
            if (this.e0 <= 0) {
                this.X = AbstractIterator.State.Z;
                return null;
            }
            ArrayList arrayList = this.Z;
            ImmutableList immutableListU = ImmutableList.u(arrayList);
            int size = arrayList.size() - 1;
            this.e0 = size;
            if (size == -1) {
                return immutableListU;
            }
            throw null;
        }
    }

    public static class TransformedCollection<F, T> extends AbstractCollection<T> {
        public final Collection X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Function f19800Y;

        public TransformedCollection(Collection collection, Function function) {
            collection.getClass();
            this.X = collection;
            function.getClass();
            this.f19800Y = function;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            this.X.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return this.X.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return Iterators.m(this.X.iterator(), this.f19800Y);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.X.size();
        }
    }

    public static boolean a(Collection collection, Collection collection2) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static Collection b(Predicate predicate) {
        throw null;
    }

    public static boolean c(Object obj, Collection collection) {
        collection.getClass();
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
