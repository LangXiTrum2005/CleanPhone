package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class RegularContiguousSet<C extends Comparable> extends ContiguousSet<C> {
    public static final /* synthetic */ int i0 = 0;
    private static final long serialVersionUID = 0;
    public final Range h0;

    /* JADX INFO: renamed from: com.google.common.collect.RegularContiguousSet$3, reason: invalid class name */
    class AnonymousClass3 extends ImmutableAsList<Comparable> {
        @Override // com.google.common.collect.ImmutableAsList
        public final ImmutableCollection F() {
            return null;
        }

        @Override // java.util.List
        public final Object get(int i2) {
            Preconditions.i(i2, size());
            throw null;
        }

        @Override // com.google.common.collect.ImmutableAsList, com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static final class SerializedForm<C extends Comparable> implements Serializable {
        public final Range X;

        public SerializedForm(Range range) {
            this.X = range;
        }

        private Object readResolve() {
            return new RegularContiguousSet(this.X);
        }
    }

    public RegularContiguousSet(Range range) {
        this.h0 = range;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final UnmodifiableIterator descendingIterator() {
        return new AbstractSequentialIterator<Comparable>(last()) { // from class: com.google.common.collect.RegularContiguousSet.2

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final Comparable f19949Y;

            {
                this.f19949Y = RegularContiguousSet.this.first();
            }

            @Override // com.google.common.collect.AbstractSequentialIterator
            public final Object a(Object obj) {
                Comparable comparable = (Comparable) obj;
                int i2 = RegularContiguousSet.i0;
                Comparable comparable2 = this.f19949Y;
                if (comparable2 != null) {
                    Range range = Range.Z;
                    if (comparable.compareTo(comparable2) == 0) {
                        return null;
                    }
                }
                RegularContiguousSet.this.getClass();
                throw null;
            }
        };
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final ContiguousSet I(Comparable comparable, boolean z2) {
        return U(Range.i(comparable, BoundType.a(z2)));
    }

    @Override // com.google.common.collect.ContiguousSet
    public final Range Q() {
        Range range = this.h0;
        return new Range(range.X.m(), range.f19946Y.n());
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final ContiguousSet L(Comparable comparable, boolean z2, Comparable comparable2, boolean z3) {
        return (comparable.compareTo(comparable2) != 0 || z2 || z3) ? U(Range.h(comparable, BoundType.a(z2), comparable2, BoundType.a(z3))) : new EmptyContiguousSet();
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final ContiguousSet O(Comparable comparable, boolean z2) {
        return U(Range.b(comparable, BoundType.a(z2)));
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final Comparable first() {
        Comparable comparableJ = this.h0.X.j();
        Objects.requireNonNull(comparableJ);
        return comparableJ;
    }

    public final ContiguousSet U(Range range) {
        Range range2 = this.h0;
        if (!range2.f(range)) {
            return new EmptyContiguousSet();
        }
        range2.e(range);
        throw null;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final Comparable last() {
        Comparable comparableH = this.h0.f19946Y.h();
        Objects.requireNonNull(comparableH);
        return comparableH;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.h0.a((Comparable) obj);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return Collections2.a(this, collection);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RegularContiguousSet)) {
            return super.equals(obj);
        }
        ((RegularContiguousSet) obj).getClass();
        throw null;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return Sets.e(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean l() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: o */
    public final UnmodifiableIterator iterator() {
        return new AbstractSequentialIterator<Comparable>(first()) { // from class: com.google.common.collect.RegularContiguousSet.1

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final Comparable f19948Y;

            {
                this.f19948Y = RegularContiguousSet.this.last();
            }

            @Override // com.google.common.collect.AbstractSequentialIterator
            public final Object a(Object obj) {
                Comparable comparable = (Comparable) obj;
                int i2 = RegularContiguousSet.i0;
                Comparable comparable2 = this.f19948Y;
                if (comparable2 != null) {
                    Range range = Range.Z;
                    if (comparable.compareTo(comparable2) == 0) {
                        return null;
                    }
                }
                RegularContiguousSet.this.getClass();
                throw null;
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        first();
        last();
        throw null;
    }

    @Override // com.google.common.collect.ImmutableSet
    public final ImmutableList w() {
        throw null;
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(this.h0);
    }
}
