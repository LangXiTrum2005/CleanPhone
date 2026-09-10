package org.apache.commons.codec.binary;

import java.io.FilterOutputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class BaseNCodecOutputStream extends FilterOutputStream {
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() {
        throw null;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) {
        Objects.requireNonNull(bArr, "array");
        if (i2 < 0 || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 > bArr.length || i2 + i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i3 > 0) {
            throw null;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i2) {
        throw null;
    }
}
