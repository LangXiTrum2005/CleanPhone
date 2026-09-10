package com.google.common.collect;

import java.lang.Comparable;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractRangeSet<C extends Comparable> implements RangeSet<C> {
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RangeSet) {
            return d().equals(((RangeSet) obj).d());
        }
        return false;
    }

    public final int hashCode() {
        return d().hashCode();
    }

    public final String toString() {
        return d().toString();
    }
}
