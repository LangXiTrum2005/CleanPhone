package com.google.common.cache;

import com.google.common.base.MoreObjects;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class CacheStats {
    public final boolean equals(Object obj) {
        if (!(obj instanceof CacheStats)) {
            return false;
        }
        ((CacheStats) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{0L, 0L, 0L, 0L, 0L, 0L});
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.a(0L, "hitCount");
        toStringHelperB.a(0L, "missCount");
        toStringHelperB.a(0L, "loadSuccessCount");
        toStringHelperB.a(0L, "loadExceptionCount");
        toStringHelperB.a(0L, "totalLoadTime");
        toStringHelperB.a(0L, "evictionCount");
        return toStringHelperB.toString();
    }
}
