package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class ReverseNaturalOrdering extends Ordering<Comparable<?>> implements Serializable {
    public static final ReverseNaturalOrdering X = new ReverseNaturalOrdering();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return X;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    @Override // com.google.common.collect.Ordering
    public final Ordering j() {
        return NaturalOrdering.Z;
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
