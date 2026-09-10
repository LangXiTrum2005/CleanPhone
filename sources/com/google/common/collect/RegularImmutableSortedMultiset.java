package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class RegularImmutableSortedMultiset<E> extends ImmutableSortedMultiset<E> {
    public static final long[] l0 = {0};
    public static final ImmutableSortedMultiset m0 = new RegularImmutableSortedMultiset(NaturalOrdering.Z);
    public final transient RegularImmutableSortedSet h0;
    public final transient long[] i0;
    public final transient int j0;
    public final transient int k0;

    public RegularImmutableSortedMultiset(RegularImmutableSortedSet regularImmutableSortedSet, long[] jArr, int i2, int i3) {
        this.h0 = regularImmutableSortedSet;
        this.i0 = jArr;
        this.j0 = i2;
        this.k0 = i3;
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return u(0);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public final NavigableSet k() {
        return this.h0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean l() {
        if (this.j0 <= 0) {
            if (this.k0 >= this.i0.length - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return u(this.k0 - 1);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset
    /* JADX INFO: renamed from: s */
    public final ImmutableSet k() {
        return this.h0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i2 = this.k0;
        int i3 = this.j0;
        long[] jArr = this.i0;
        return Ints.e(jArr[i2 + i3] - jArr[i3]);
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public final Multiset.Entry u(int i2) {
        E e2 = this.h0.g0.get(i2);
        int i3 = this.j0 + i2;
        long[] jArr = this.i0;
        return new Multisets.ImmutableEntry(e2, (int) (jArr[i3 + 1] - jArr[i3]));
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset
    /* JADX INFO: renamed from: w */
    public final ImmutableSortedSet k() {
        return this.h0;
    }

    @Override // com.google.common.collect.Multiset
    public final int w0(Object obj) {
        RegularImmutableSortedSet regularImmutableSortedSet = this.h0;
        regularImmutableSortedSet.getClass();
        int i2 = -1;
        if (obj != null) {
            try {
                int iBinarySearch = Collections.binarySearch(regularImmutableSortedSet.g0, obj, regularImmutableSortedSet.e0);
                if (iBinarySearch >= 0) {
                    i2 = iBinarySearch;
                }
            } catch (ClassCastException unused) {
            }
        }
        if (i2 < 0) {
            return 0;
        }
        int i3 = this.j0 + i2;
        long[] jArr = this.i0;
        return (int) (jArr[i3 + 1] - jArr[i3]);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    /* JADX INFO: renamed from: x */
    public final ImmutableSortedMultiset t0(Object obj, BoundType boundType) {
        return z(0, this.h0.Q(obj, boundType == BoundType.f19795Y));
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    /* JADX INFO: renamed from: y */
    public final ImmutableSortedMultiset z0(Object obj, BoundType boundType) {
        return z(this.h0.R(obj, boundType == BoundType.f19795Y), this.k0);
    }

    public final ImmutableSortedMultiset z(int i2, int i3) {
        int i4 = this.k0;
        Preconditions.l(i2, i3, i4);
        RegularImmutableSortedSet regularImmutableSortedSet = this.h0;
        if (i2 == i3) {
            Comparator comparator = regularImmutableSortedSet.e0;
            return NaturalOrdering.Z.equals(comparator) ? m0 : new RegularImmutableSortedMultiset(comparator);
        }
        if (i2 == 0 && i3 == i4) {
            return this;
        }
        return new RegularImmutableSortedMultiset(regularImmutableSortedSet.P(i2, i3), this.i0, this.j0 + i2, i3 - i2);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public final Set k() {
        return this.h0;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public final SortedSet k() {
        return this.h0;
    }

    public RegularImmutableSortedMultiset(Comparator comparator) {
        this.h0 = ImmutableSortedSet.F(comparator);
        this.i0 = l0;
        this.j0 = 0;
        this.k0 = 0;
    }
}
