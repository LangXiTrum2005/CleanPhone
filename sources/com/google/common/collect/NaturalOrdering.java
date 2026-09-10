package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class NaturalOrdering extends Ordering<Comparable<?>> implements Serializable {
    public static final NaturalOrdering Z = new NaturalOrdering();
    private static final long serialVersionUID = 0;
    public transient Ordering X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public transient Ordering f19937Y;

    private Object readResolve() {
        return Z;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    @Override // com.google.common.collect.Ordering
    public final Ordering g() {
        Ordering ordering = this.X;
        if (ordering != null) {
            return ordering;
        }
        NullsFirstOrdering nullsFirstOrdering = new NullsFirstOrdering(this);
        this.X = nullsFirstOrdering;
        return nullsFirstOrdering;
    }

    @Override // com.google.common.collect.Ordering
    public final Ordering h() {
        Ordering ordering = this.f19937Y;
        if (ordering != null) {
            return ordering;
        }
        NullsLastOrdering nullsLastOrdering = new NullsLastOrdering(this);
        this.f19937Y = nullsLastOrdering;
        return nullsLastOrdering;
    }

    @Override // com.google.common.collect.Ordering
    public final Ordering j() {
        return ReverseNaturalOrdering.X;
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
