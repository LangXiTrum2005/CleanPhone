package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
@Immutable
@ElementTypesAreNonnullByDefault
final class Murmur3_128HashFunction extends AbstractHashFunction implements Serializable {
    public static final HashFunction X = null;
    private static final long serialVersionUID = 0;

    public static final class Murmur3_128Hasher extends AbstractStreamingHasher {
    }

    static {
        int i2 = Hashing.f20001a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Murmur3_128HashFunction)) {
            return false;
        }
        ((Murmur3_128HashFunction) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Murmur3_128HashFunction.class.hashCode();
    }

    public final String toString() {
        return "Hashing.murmur3_128(0)";
    }
}
