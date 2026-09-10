package com.google.common.math;

import com.google.common.base.MoreObjects;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class Stats implements Serializable {
    private static final long serialVersionUID = 0;

    public final boolean equals(Object obj) {
        if (obj == null || Stats.class != obj.getClass()) {
            return false;
        }
        return Double.doubleToLongBits(0.0d) == Double.doubleToLongBits(0.0d) && Double.doubleToLongBits(0.0d) == Double.doubleToLongBits(0.0d) && Double.doubleToLongBits(0.0d) == Double.doubleToLongBits(0.0d) && Double.doubleToLongBits(0.0d) == Double.doubleToLongBits(0.0d);
    }

    public final int hashCode() {
        Double dValueOf = Double.valueOf(0.0d);
        return Arrays.hashCode(new Object[]{0L, dValueOf, dValueOf, dValueOf, dValueOf});
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.a(0L, "count");
        return toStringHelperB.toString();
    }
}
