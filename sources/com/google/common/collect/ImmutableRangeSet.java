package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class ImmutableRangeSet<C extends Comparable> extends AbstractRangeSet<C> implements Serializable {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final ImmutableRangeSet f19853Y;
    public static final ImmutableRangeSet Z;
    public final transient ImmutableList X;

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableRangeSet$1, reason: invalid class name */
    class AnonymousClass1 extends ImmutableList<Range<Comparable>> {
        public final /* synthetic */ int Z;
        public final /* synthetic */ int e0;
        public final /* synthetic */ Range f0;

        public AnonymousClass1(int i2, int i3, Range range) {
            this.Z = i2;
            this.e0 = i3;
            this.f0 = range;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public final Object get(int i2) {
            int i3 = this.Z;
            Preconditions.i(i2, i3);
            int i4 = this.e0;
            ImmutableRangeSet immutableRangeSet = ImmutableRangeSet.this;
            return (i2 == 0 || i2 == i3 + (-1)) ? ((Range) immutableRangeSet.X.get(i2 + i4)).e(this.f0) : (Range) immutableRangeSet.X.get(i2 + i4);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean l() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.Z;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public final class AsSet extends ImmutableSortedSet<C> {
        public transient Integer g0;

        /* JADX INFO: renamed from: com.google.common.collect.ImmutableRangeSet$AsSet$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIterator<Comparable> {
            public final UnmodifiableListIterator Z;
            public final UnmodifiableIterator e0;

            public AnonymousClass1() {
                AsSet.this.getClass();
                throw null;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                UnmodifiableIterator unmodifiableIterator = this.e0;
                if (unmodifiableIterator.hasNext()) {
                    return (Comparable) unmodifiableIterator.next();
                }
                UnmodifiableListIterator unmodifiableListIterator = this.Z;
                if (!unmodifiableListIterator.hasNext()) {
                    this.X = AbstractIterator.State.Z;
                    return null;
                }
                Range range = (Range) unmodifiableListIterator.next();
                AsSet.this.getClass();
                int i2 = ContiguousSet.g0;
                range.getClass();
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.ImmutableRangeSet$AsSet$2, reason: invalid class name */
        class AnonymousClass2 extends AbstractIterator<Comparable> {
            public final UnmodifiableListIterator Z;
            public final UnmodifiableIterator e0;

            public AnonymousClass2() {
                AsSet.this.getClass();
                throw null;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                UnmodifiableIterator unmodifiableIterator = this.e0;
                if (unmodifiableIterator.hasNext()) {
                    return (Comparable) unmodifiableIterator.next();
                }
                UnmodifiableListIterator unmodifiableListIterator = this.Z;
                if (!unmodifiableListIterator.hasNext()) {
                    this.X = AbstractIterator.State.Z;
                    return null;
                }
                Range range = (Range) unmodifiableListIterator.next();
                AsSet.this.getClass();
                int i2 = ContiguousSet.g0;
                range.getClass();
                throw null;
            }
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use SerializedForm");
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public final ImmutableSortedSet C() {
            return new DescendingImmutableSortedSet(this);
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        /* JADX INFO: renamed from: D */
        public final UnmodifiableIterator descendingIterator() {
            return new AnonymousClass2();
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public final ImmutableSortedSet I(Object obj, boolean z2) {
            P(Range.i((Comparable) obj, BoundType.a(z2)));
            throw null;
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public final ImmutableSortedSet L(Object obj, boolean z2, Object obj2, boolean z3) {
            Comparable comparable = (Comparable) obj;
            Comparable comparable2 = (Comparable) obj2;
            if (!z2 && !z3) {
                Range range = Range.Z;
                if (comparable.compareTo(comparable2) == 0) {
                    return RegularImmutableSortedSet.h0;
                }
            }
            P(Range.h(comparable, BoundType.a(z2), comparable2, BoundType.a(z3)));
            throw null;
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public final ImmutableSortedSet O(Object obj, boolean z2) {
            P(Range.b((Comparable) obj, BoundType.a(z2)));
            throw null;
        }

        public final ImmutableSortedSet P(Range range) {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                throw null;
            } catch (ClassCastException unused) {
                return false;
            }
        }

        @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
        public final Iterator descendingIterator() {
            return new AnonymousClass2();
        }

        @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public final Iterator iterator() {
            return new AnonymousClass1();
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean l() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* JADX INFO: renamed from: o */
        public final UnmodifiableIterator iterator() {
            return new AnonymousClass1();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            Integer num = this.g0;
            num.getClass();
            return num.intValue();
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            throw null;
        }
    }

    public static class AsSetSerializedForm<C extends Comparable> implements Serializable {
        public AsSetSerializedForm(ImmutableList immutableList) {
        }

        public Object readResolve() {
            throw null;
        }
    }

    public static class Builder<C extends Comparable<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f19854a = new ArrayList();
    }

    public final class ComplementRanges extends ImmutableList<Range<C>> {
        @Override // java.util.List
        public final Object get(int i2) {
            Preconditions.i(i2, 0);
            throw null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean l() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return 0;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static final class SerializedForm<C extends Comparable> implements Serializable {
        public final ImmutableList X;

        public SerializedForm(ImmutableList immutableList) {
            this.X = immutableList;
        }

        public Object readResolve() {
            ImmutableList immutableList = this.X;
            if (immutableList.isEmpty()) {
                return ImmutableRangeSet.f19853Y;
            }
            return immutableList.equals(ImmutableList.z(Range.Z)) ? ImmutableRangeSet.Z : new ImmutableRangeSet(immutableList);
        }
    }

    static {
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f19830Y;
        f19853Y = new ImmutableRangeSet(RegularImmutableList.f0);
        Z = new ImmutableRangeSet(ImmutableList.z(Range.Z));
    }

    public ImmutableRangeSet(ImmutableList immutableList) {
        this.X = immutableList;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Range a(Comparable comparable) {
        int iA;
        Range range = Range.Z;
        Range.LowerBoundFn lowerBoundFn = Range.LowerBoundFn.X;
        Cut.BelowValue belowValueA = Cut.a(comparable);
        SortedLists.KeyPresentBehavior.AnonymousClass1 anonymousClass1 = SortedLists.KeyPresentBehavior.X;
        SortedLists.KeyAbsentBehavior.AnonymousClass1 anonymousClass2 = SortedLists.KeyAbsentBehavior.X;
        ImmutableList immutableList = this.X;
        NaturalOrdering naturalOrdering = NaturalOrdering.Z;
        AbstractList abstractListC = Lists.c(immutableList, lowerBoundFn);
        if (!(abstractListC instanceof RandomAccess)) {
            abstractListC = new ArrayList(abstractListC);
        }
        int size = abstractListC.size() - 1;
        int i2 = 0;
        while (true) {
            if (i2 > size) {
                iA = anonymousClass2.a(i2);
                break;
            }
            int i3 = (i2 + size) >>> 1;
            int iCompare = naturalOrdering.compare(belowValueA, abstractListC.get(i3));
            if (iCompare >= 0) {
                if (iCompare <= 0) {
                    int i4 = i3 - i2;
                    anonymousClass1.a(belowValueA, abstractListC.subList(i2, size + 1), i4);
                    iA = i2 + i4;
                    break;
                }
                i2 = i3 + 1;
            } else {
                size = i3 - 1;
            }
        }
        if (iA == -1) {
            return null;
        }
        Range range2 = (Range) immutableList.get(iA);
        if (range2.a(comparable)) {
            return range2;
        }
        return null;
    }

    @Override // com.google.common.collect.RangeSet
    public final Set d() {
        ImmutableList immutableList = this.X;
        if (immutableList.isEmpty()) {
            int i2 = ImmutableSet.Z;
            return RegularImmutableSet.k0;
        }
        Range range = Range.Z;
        return new RegularImmutableSortedSet(immutableList, Range.RangeLexOrdering.X);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Range g() {
        ImmutableList immutableList = this.X;
        if (immutableList.isEmpty()) {
            throw new NoSuchElementException();
        }
        return new Range(((Range) immutableList.get(0)).X, ((Range) immutableList.get(immutableList.size() - 1)).f19946Y);
    }

    public Object writeReplace() {
        return new SerializedForm(this.X);
    }
}
