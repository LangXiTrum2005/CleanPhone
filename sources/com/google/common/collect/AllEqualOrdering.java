package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class AllEqualOrdering extends Ordering<Object> implements Serializable {
    public static final AllEqualOrdering X = new AllEqualOrdering();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return X;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return 0;
    }

    @Override // com.google.common.collect.Ordering
    public final Ordering j() {
        return this;
    }

    public final String toString() {
        return "Ordering.allEqual()";
    }
}
