package com.google.common.collect;

import com.google.common.base.MoreObjects;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public class TreeRangeSet<C extends Comparable<?>> extends AbstractRangeSet<C> implements Serializable {

    public final class AsRanges extends ForwardingCollection<Range<C>> implements Set<Range<C>> {
        @Override // java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            return Sets.b(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            return Sets.e(this);
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final Object w() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingCollection
        public final Collection x() {
            throw null;
        }
    }

    public final class Complement extends TreeRangeSet<C> {
    }

    public static final class ComplementRangesByLowerBound<C extends Comparable<?>> extends AbstractNavigableMap<Cut<C>, Range<C>> {
        public final NavigableMap X = new RangesByUpperBound();

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Range f19983Y;

        public ComplementRangesByLowerBound(Range range) {
            this.f19983Y = range;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public final Iterator a() {
            Collection collectionValues;
            Cut cut = Cut.BelowAll.f19813Y;
            Range range = this.f19983Y;
            Cut cut2 = range.X;
            boolean z2 = cut2 != cut;
            Map map = this.X;
            if (z2) {
                collectionValues = ((RangesByUpperBound) map).tailMap((Cut) cut2.g(), range.X.k() == BoundType.f19795Y).values();
            } else {
                collectionValues = ((AbstractMap) map).values();
            }
            PeekingIterator peekingIteratorI = Iterators.i(collectionValues.iterator());
            if (!range.a(cut) || (peekingIteratorI.hasNext() && ((Range) ((Iterators.PeekingImpl) peekingIteratorI).a()).X == cut)) {
                if (!peekingIteratorI.hasNext()) {
                    return Iterators.ArrayItr.e0;
                }
                cut = ((Range) peekingIteratorI.next()).f19946Y;
            }
            return new AbstractIterator<Map.Entry<Cut<Comparable<?>>, Range<Comparable<?>>>>(cut, peekingIteratorI) { // from class: com.google.common.collect.TreeRangeSet.ComplementRangesByLowerBound.1
                public Cut Z;
                public final /* synthetic */ PeekingIterator e0;

                {
                    this.e0 = peekingIteratorI;
                    this.Z = cut;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.collect.AbstractIterator
                public final Object a() {
                    Range range2;
                    if (!ComplementRangesByLowerBound.this.f19983Y.f19946Y.i(this.Z)) {
                        Cut cut3 = this.Z;
                        Cut.AboveAll aboveAll = Cut.AboveAll.f19812Y;
                        if (cut3 != aboveAll) {
                            PeekingIterator peekingIterator = this.e0;
                            if (peekingIterator.hasNext()) {
                                Range range3 = (Range) peekingIterator.next();
                                range2 = new Range(this.Z, range3.X);
                                this.Z = range3.f19946Y;
                            } else {
                                range2 = new Range(this.Z, aboveAll);
                                this.Z = aboveAll;
                            }
                            return new ImmutableEntry(range2.X, range2);
                        }
                    }
                    this.X = AbstractIterator.State.Z;
                    return null;
                }
            };
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.AbstractNavigableMap
        public final Iterator b() {
            Range range = this.f19983Y;
            boolean zD = range.d();
            Cut.AboveAll aboveAll = Cut.AboveAll.f19812Y;
            Cut cut = range.f19946Y;
            PeekingIterator peekingIteratorI = Iterators.i(((RangesByUpperBound) this.X).headMap(zD ? (Cut) cut.g() : aboveAll, range.d() && cut.l() == BoundType.f19795Y).descendingMap().values().iterator());
            if (!peekingIteratorI.hasNext()) {
                if (range.a(Cut.BelowAll.f19813Y)) {
                    throw null;
                }
                return Iterators.ArrayItr.e0;
            }
            Iterators.PeekingImpl peekingImpl = (Iterators.PeekingImpl) peekingIteratorI;
            if (((Range) peekingImpl.a()).f19946Y == aboveAll) {
                return new AbstractIterator<Map.Entry<Cut<Comparable<?>>, Range<Comparable<?>>>>((Cut) MoreObjects.a(((Range) peekingIteratorI.next()).X, aboveAll), peekingIteratorI) { // from class: com.google.common.collect.TreeRangeSet.ComplementRangesByLowerBound.2
                    public Cut Z;
                    public final /* synthetic */ PeekingIterator e0;

                    {
                        this.e0 = peekingIteratorI;
                        this.Z = cut;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.common.collect.AbstractIterator
                    public final Object a() {
                        Cut cut2 = this.Z;
                        Cut.BelowAll belowAll = Cut.BelowAll.f19813Y;
                        AbstractIterator.State state = AbstractIterator.State.Z;
                        if (cut2 == belowAll) {
                            this.X = state;
                            return null;
                        }
                        PeekingIterator peekingIterator = this.e0;
                        boolean zHasNext = peekingIterator.hasNext();
                        ComplementRangesByLowerBound complementRangesByLowerBound = ComplementRangesByLowerBound.this;
                        if (zHasNext) {
                            Range range2 = (Range) peekingIterator.next();
                            Cut cut3 = range2.f19946Y;
                            Range range3 = new Range(cut3, this.Z);
                            this.Z = range2.X;
                            if (complementRangesByLowerBound.f19983Y.X.i(cut3)) {
                                return new ImmutableEntry(cut3, range3);
                            }
                        } else if (complementRangesByLowerBound.f19983Y.X.i(belowAll)) {
                            Range range4 = new Range(belowAll, this.Z);
                            this.Z = belowAll;
                            return new ImmutableEntry(belowAll, range4);
                        }
                        this.X = state;
                        return null;
                    }
                };
            }
            Cut cut2 = ((Range) peekingImpl.a()).f19946Y;
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Range get(Object obj) {
            if (!(obj instanceof Cut)) {
                return null;
            }
            try {
                Cut cut = (Cut) obj;
                Map.Entry entryFirstEntry = d(Range.b(cut, BoundType.a(true))).firstEntry();
                if (entryFirstEntry == null || !((Cut) entryFirstEntry.getKey()).equals(cut)) {
                    return null;
                }
                return (Range) entryFirstEntry.getValue();
            } catch (ClassCastException unused) {
                return null;
            }
        }

        @Override // java.util.SortedMap
        public final Comparator comparator() {
            return NaturalOrdering.Z;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        public final NavigableMap d(Range range) {
            Range range2 = this.f19983Y;
            return !range2.f(range) ? ImmutableSortedMap.h0 : new ComplementRangesByLowerBound(range.e(range2));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap headMap(Object obj, boolean z2) {
            return d(Range.i((Cut) obj, BoundType.a(z2)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return Iterators.l(a());
        }

        @Override // java.util.NavigableMap
        public final NavigableMap subMap(Object obj, boolean z2, Object obj2, boolean z3) {
            return d(Range.h((Cut) obj, BoundType.a(z2), (Cut) obj2, BoundType.a(z3)));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap tailMap(Object obj, boolean z2) {
            return d(Range.b((Cut) obj, BoundType.a(z2)));
        }
    }

    public final class SubRangeSet extends TreeRangeSet<C> {
    }

    public static final class SubRangeSetRangesByLowerBound<C extends Comparable<?>> extends AbstractNavigableMap<Cut<C>, Range<C>> {
        public final Range X;

        /* JADX INFO: renamed from: com.google.common.collect.TreeRangeSet$SubRangeSetRangesByLowerBound$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIterator<Map.Entry<Cut<Comparable<?>>, Range<Comparable<?>>>> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.TreeRangeSet$SubRangeSetRangesByLowerBound$2, reason: invalid class name */
        class AnonymousClass2 extends AbstractIterator<Map.Entry<Cut<Comparable<?>>, Range<Comparable<?>>>> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        public SubRangeSetRangesByLowerBound(Range range) {
            this.X = range;
            throw null;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public final Iterator a() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        public final Iterator b() {
            throw null;
        }

        public final Range c(Object obj) {
            if (obj instanceof Cut) {
                try {
                    if (this.X.a((Cut) obj)) {
                        throw null;
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.SortedMap
        public final Comparator comparator() {
            return NaturalOrdering.Z;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            c(obj);
            return false;
        }

        public final NavigableMap d(Range range) {
            Range range2 = this.X;
            if (!range.f(range2)) {
                return ImmutableSortedMap.h0;
            }
            new SubRangeSetRangesByLowerBound(range2.e(range));
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            c(obj);
            return null;
        }

        @Override // java.util.NavigableMap
        public final NavigableMap headMap(Object obj, boolean z2) {
            return d(Range.i((Cut) obj, BoundType.a(z2)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            throw null;
        }

        @Override // java.util.NavigableMap
        public final NavigableMap subMap(Object obj, boolean z2, Object obj2, boolean z3) {
            return d(Range.h((Cut) obj, BoundType.a(z2), (Cut) obj2, BoundType.a(z3)));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap tailMap(Object obj, boolean z2) {
            return d(Range.b((Cut) obj, BoundType.a(z2)));
        }
    }

    @Override // com.google.common.collect.RangeSet
    public final Set d() {
        throw null;
    }

    public static final class RangesByUpperBound<C extends Comparable<?>> extends AbstractNavigableMap<Cut<C>, Range<C>> {
        public final Range X;

        /* JADX INFO: renamed from: com.google.common.collect.TreeRangeSet$RangesByUpperBound$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIterator<Map.Entry<Cut<Comparable<?>>, Range<Comparable<?>>>> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.TreeRangeSet$RangesByUpperBound$2, reason: invalid class name */
        class AnonymousClass2 extends AbstractIterator<Map.Entry<Cut<Comparable<?>>, Range<Comparable<?>>>> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        public RangesByUpperBound() {
            this.X = Range.Z;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public final Iterator a() {
            Cut.BelowAll belowAll = Cut.BelowAll.f19813Y;
            Cut cut = this.X.X;
            if (!(cut != belowAll)) {
                throw null;
            }
            throw null;
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        public final Iterator b() {
            Range range = this.X;
            if (!range.d()) {
                throw null;
            }
            throw null;
        }

        public final Range c(Object obj) {
            if (obj instanceof Cut) {
                try {
                    if (this.X.a((Cut) obj)) {
                        throw null;
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.SortedMap
        public final Comparator comparator() {
            return NaturalOrdering.Z;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            c(obj);
            return false;
        }

        public final NavigableMap d(Range range) {
            Range range2 = this.X;
            return range.f(range2) ? new RangesByUpperBound(range.e(range2)) : ImmutableSortedMap.h0;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            c(obj);
            return null;
        }

        @Override // java.util.NavigableMap
        public final NavigableMap headMap(Object obj, boolean z2) {
            return d(Range.i((Cut) obj, BoundType.a(z2)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean isEmpty() {
            if (this.X.equals(Range.Z)) {
                throw null;
            }
            a();
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            if (this.X.equals(Range.Z)) {
                throw null;
            }
            a();
            throw null;
        }

        @Override // java.util.NavigableMap
        public final NavigableMap subMap(Object obj, boolean z2, Object obj2, boolean z3) {
            return d(Range.h((Cut) obj, BoundType.a(z2), (Cut) obj2, BoundType.a(z3)));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap tailMap(Object obj, boolean z2) {
            return d(Range.b((Cut) obj, BoundType.a(z2)));
        }

        public RangesByUpperBound(Range range) {
            this.X = range;
        }
    }
}
