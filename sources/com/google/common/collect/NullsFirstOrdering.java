package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class NullsFirstOrdering<T> extends Ordering<T> implements Serializable {
    private static final long serialVersionUID = 0;
    public final Ordering X;

    public NullsFirstOrdering(Ordering ordering) {
        this.X = ordering;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return this.X.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NullsFirstOrdering) {
            return this.X.equals(((NullsFirstOrdering) obj).X);
        }
        return false;
    }

    @Override // com.google.common.collect.Ordering
    public final Ordering g() {
        return this;
    }

    @Override // com.google.common.collect.Ordering
    public final Ordering h() {
        return this.X.h();
    }

    public final int hashCode() {
        return this.X.hashCode() ^ 957692532;
    }

    @Override // com.google.common.collect.Ordering
    public final Ordering j() {
        return this.X.j().h();
    }

    public final String toString() {
        return this.X + ".nullsFirst()";
    }
}
