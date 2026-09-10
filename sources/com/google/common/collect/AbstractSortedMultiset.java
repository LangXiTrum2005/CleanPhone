package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractSortedMultiset<E> extends AbstractMultiset<E> implements SortedMultiset<E> {
    public final Comparator Z;
    public transient SortedMultiset e0;

    public AbstractSortedMultiset() {
        this(NaturalOrdering.Z);
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public Comparator comparator() {
        return this.Z;
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Set d() {
        return new SortedMultisets.NavigableElementSet(this);
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry firstEntry() {
        Iterator itL = l();
        if (itL.hasNext()) {
            return (Multiset.Entry) itL.next();
        }
        return null;
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry lastEntry() {
        TreeMultiset.AnonymousClass3 anonymousClass3 = (TreeMultiset.AnonymousClass3) o();
        if (anonymousClass3.hasNext()) {
            return anonymousClass3.next();
        }
        return null;
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset n(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        return ((TreeMultiset) ((TreeMultiset) this).z0(obj, boundType)).t0(obj2, boundType2);
    }

    public abstract Iterator o();

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry pollFirstEntry() {
        Iterator itL = l();
        if (!itL.hasNext()) {
            return null;
        }
        Multiset.Entry entry = (Multiset.Entry) itL.next();
        Multisets.ImmutableEntry immutableEntry = new Multisets.ImmutableEntry(entry.d(), entry.getCount());
        itL.remove();
        return immutableEntry;
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry pollLastEntry() {
        TreeMultiset.AnonymousClass3 anonymousClass3 = (TreeMultiset.AnonymousClass3) o();
        if (!anonymousClass3.hasNext()) {
            return null;
        }
        Multiset.Entry<Object> next = anonymousClass3.next();
        Multisets.ImmutableEntry immutableEntry = new Multisets.ImmutableEntry(next.d(), next.getCount());
        anonymousClass3.remove();
        return immutableEntry;
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset q() {
        SortedMultiset sortedMultiset = this.e0;
        if (sortedMultiset != null) {
            return sortedMultiset;
        }
        DescendingMultiset<Object> descendingMultiset = new DescendingMultiset<Object>() { // from class: com.google.common.collect.AbstractSortedMultiset.1DescendingMultisetImpl
            @Override // com.google.common.collect.DescendingMultiset
            public final Iterator B() {
                return AbstractSortedMultiset.this.o();
            }

            @Override // com.google.common.collect.DescendingMultiset
            public final SortedMultiset C() {
                return AbstractSortedMultiset.this;
            }

            @Override // com.google.common.collect.DescendingMultiset, com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                return Multisets.b(AbstractSortedMultiset.this.q());
            }
        };
        this.e0 = descendingMultiset;
        return descendingMultiset;
    }

    public AbstractSortedMultiset(Comparator comparator) {
        comparator.getClass();
        this.Z = comparator;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public NavigableSet k() {
        return (NavigableSet) super.k();
    }
}
