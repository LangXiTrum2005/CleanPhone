package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class CompoundOrdering<T> extends Ordering<T> implements Serializable {
    private static final long serialVersionUID = 0;
    public final Comparator[] X;

    public CompoundOrdering(Ordering ordering, Comparator comparator) {
        this.X = new Comparator[]{ordering, comparator};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i2 = 0;
        while (true) {
            Comparator[] comparatorArr = this.X;
            if (i2 >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i2].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i2++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CompoundOrdering) {
            return Arrays.equals(this.X, ((CompoundOrdering) obj).X);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.X);
    }

    public final String toString() {
        return android.support.v4.media.a.r(new StringBuilder("Ordering.compound("), Arrays.toString(this.X), ")");
    }
}
