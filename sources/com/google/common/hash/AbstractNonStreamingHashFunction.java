package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes4.dex */
@Immutable
@ElementTypesAreNonnullByDefault
abstract class AbstractNonStreamingHashFunction extends AbstractHashFunction {

    public final class BufferingHasher extends AbstractHasher {
    }

    public static final class ExposedByteArrayOutputStream extends ByteArrayOutputStream {
    }
}
