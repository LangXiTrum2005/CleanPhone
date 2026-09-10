package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
@Immutable
@ElementTypesAreNonnullByDefault
final class SipHashFunction extends AbstractHashFunction implements Serializable {
    private static final long serialVersionUID = 0;

    public static final class SipHasher extends AbstractStreamingHasher {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SipHashFunction)) {
            return false;
        }
        ((SipHashFunction) obj).getClass();
        return 0 == 0 && 0 == 0;
    }

    public final int hashCode() {
        return (int) ((((long) ((SipHashFunction.class.hashCode() ^ 0) ^ 0)) ^ 0) ^ 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Hashing.sipHash");
        sb.append(0);
        sb.append("");
        sb.append(0);
        sb.append("(");
        sb.append(0L);
        sb.append(", ");
        return android.support.v4.media.a.j(0L, ")", sb);
    }
}
