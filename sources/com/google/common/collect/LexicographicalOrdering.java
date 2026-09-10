package com.google.common.collect;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class LexicographicalOrdering<T> extends Ordering<Iterable<T>> implements Serializable {
    private static final long serialVersionUID = 0;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Iterator<T> it = ((Iterable) obj).iterator();
        Iterator<T> it2 = ((Iterable) obj2).iterator();
        if (!it.hasNext()) {
            return it2.hasNext() ? -1 : 0;
        }
        if (!it2.hasNext()) {
            return 1;
        }
        it.next();
        it2.next();
        throw null;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LexicographicalOrdering)) {
            return false;
        }
        ((LexicographicalOrdering) obj).getClass();
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "null.lexicographical()";
    }
}
