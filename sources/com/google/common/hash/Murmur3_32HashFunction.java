package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
@Immutable
@ElementTypesAreNonnullByDefault
final class Murmur3_32HashFunction extends AbstractHashFunction implements Serializable {
    private static final long serialVersionUID = 0;

    public static final class Murmur3_32Hasher extends AbstractHasher {
    }

    static {
        int i2 = Hashing.f20001a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Murmur3_32HashFunction)) {
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        Murmur3_32HashFunction.class.hashCode();
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
