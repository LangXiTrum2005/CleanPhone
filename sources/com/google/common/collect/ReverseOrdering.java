package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class ReverseOrdering<T> extends Ordering<T> implements Serializable {
    private static final long serialVersionUID = 0;
    public final Ordering X;

    public ReverseOrdering(Ordering ordering) {
        ordering.getClass();
        this.X = ordering;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.X.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReverseOrdering) {
            return this.X.equals(((ReverseOrdering) obj).X);
        }
        return false;
    }

    public final int hashCode() {
        return -this.X.hashCode();
    }

    @Override // com.google.common.collect.Ordering
    public final Ordering j() {
        return this.X;
    }

    public final String toString() {
        return this.X + ".reverse()";
    }
}
