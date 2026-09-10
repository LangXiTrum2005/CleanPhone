package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
@Immutable
@ElementTypesAreNonnullByDefault
final class Crc32cHashFunction extends AbstractHashFunction {

    public static final class Crc32cHasher extends AbstractStreamingHasher {
        static {
            ByteBuffer.allocate(0);
        }
    }

    public final String toString() {
        return "Hashing.crc32c()";
    }
}
