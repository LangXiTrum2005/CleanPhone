package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ImmutableSortedSet<E> extends ImmutableSet<E> implements NavigableSet<E>, SortedIterable<E> {
    private static final long serialVersionUID = 912559;
    public final transient Comparator e0;
    public transient ImmutableSortedSet f0;

    public static final class Builder<E> extends ImmutableSet.Builder<E> {
        public final Comparator d;

        public Builder(Comparator comparator) {
            super(4);
            comparator.getClass();
            this.d = comparator;
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.ArrayBasedBuilder
        /* JADX INFO: renamed from: b */
        public final ImmutableCollection.ArrayBasedBuilder c(Object obj) {
            super.c(obj);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.ArrayBasedBuilder
        public final ImmutableCollection.Builder c(Object obj) {
            super.c(obj);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.Builder
        /* JADX INFO: renamed from: h */
        public final ImmutableSet.Builder c(Object obj) {
            super.c(obj);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.Builder
        public final ImmutableSet.Builder i(Object[] objArr) {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableSet.Builder
        public final ImmutableSet.Builder j(Iterable iterable) {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableSet.Builder
        public final ImmutableSet k() {
            ImmutableSortedSet immutableSortedSetB = ImmutableSortedSet.B(this.d, this.f19827b, this.f19826a);
            this.f19827b = ((RegularImmutableSortedSet) immutableSortedSetB).g0.size();
            this.f19828c = true;
            return immutableSortedSetB;
        }

        @Override // com.google.common.collect.ImmutableSet.Builder
        public final ImmutableSet.Builder l(ImmutableSet.Builder builder) {
            super.l(builder);
            return this;
        }
    }

    public static class SerializedForm<E> implements Serializable {
        private static final long serialVersionUID = 0;
        public final Comparator X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Object[] f19861Y;

        public SerializedForm(Comparator comparator, Object[] objArr) {
            this.X = comparator;
            this.f19861Y = objArr;
        }

        public Object readResolve() {
            Builder builder = new Builder(this.X);
            Object[] objArr = this.f19861Y;
            builder.d(objArr.length, objArr);
            ImmutableSortedSet immutableSortedSetB = ImmutableSortedSet.B(builder.d, builder.f19827b, builder.f19826a);
            builder.f19827b = ((RegularImmutableSortedSet) immutableSortedSetB).g0.size();
            builder.f19828c = true;
            return immutableSortedSetB;
        }
    }

    public ImmutableSortedSet(Comparator comparator) {
        this.e0 = comparator;
    }

    public static ImmutableSortedSet B(Comparator comparator, int i2, Object... objArr) {
        if (i2 == 0) {
            return F(comparator);
        }
        ObjectArrays.a(i2, objArr);
        Arrays.sort(objArr, 0, i2, comparator);
        int i3 = 1;
        for (int i4 = 1; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (comparator.compare(obj, objArr[i3 - 1]) != 0) {
                objArr[i3] = obj;
                i3++;
            }
        }
        Arrays.fill(objArr, i3, i2, (Object) null);
        if (i3 < objArr.length / 2) {
            objArr = Arrays.copyOf(objArr, i3);
        }
        return new RegularImmutableSortedSet(ImmutableList.p(i3, objArr), comparator);
    }

    public static RegularImmutableSortedSet F(Comparator comparator) {
        return NaturalOrdering.Z.equals(comparator) ? RegularImmutableSortedSet.h0 : new RegularImmutableSortedSet(RegularImmutableList.f0, comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public abstract ImmutableSortedSet C();

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: D */
    public abstract UnmodifiableIterator descendingIterator();

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet descendingSet() {
        ImmutableSortedSet immutableSortedSet = this.f0;
        if (immutableSortedSet != null) {
            return immutableSortedSet;
        }
        ImmutableSortedSet immutableSortedSetC = C();
        this.f0 = immutableSortedSetC;
        immutableSortedSetC.f0 = this;
        return immutableSortedSetC;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet headSet(Object obj, boolean z2) {
        obj.getClass();
        return I(obj, z2);
    }

    public abstract ImmutableSortedSet I(Object obj, boolean z2);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet subSet(Object obj, boolean z2, Object obj2, boolean z3) {
        obj.getClass();
        obj2.getClass();
        Preconditions.f(this.e0.compare(obj, obj2) <= 0);
        return L(obj, z2, obj2, z3);
    }

    public abstract ImmutableSortedSet L(Object obj, boolean z2, Object obj2, boolean z3);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet tailSet(Object obj, boolean z2) {
        obj.getClass();
        return O(obj, z2);
    }

    public abstract ImmutableSortedSet O(Object obj, boolean z2);

    public Object ceiling(Object obj) {
        return Iterators.h(tailSet(obj, true).iterator(), null);
    }

    @Override // java.util.SortedSet, com.google.common.collect.SortedIterable
    public final Comparator comparator() {
        return this.e0;
    }

    public Object first() {
        return iterator().next();
    }

    public Object floor(Object obj) {
        return Iterators.h(headSet(obj, true).descendingIterator(), null);
    }

    public Object higher(Object obj) {
        return Iterators.h(tailSet(obj, false).iterator(), null);
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public Object last() {
        return descendingIterator().next();
    }

    public Object lower(Object obj) {
        return Iterators.h(headSet(obj, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(this.e0, toArray(ImmutableCollection.X));
    }
}
