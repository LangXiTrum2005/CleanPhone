package org.apache.commons.codec.binary;

import androidx.datastore.preferences.protobuf.a;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class BaseNCodecInputStream extends FilterInputStream {
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        throw null;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i2) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        read(null, 0, 1);
        throw null;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        throw new IOException("mark/reset not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(a.i(j, "Negative skip length: "));
        }
        byte[] bArr = new byte[512];
        long j2 = j;
        while (j2 > 0) {
            read(bArr, 0, (int) Math.min(512, j2));
            j2 -= (long) 0;
        }
        return j - j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        Objects.requireNonNull(bArr, "array");
        if (i2 < 0 || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 > bArr.length || i2 + i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i3 == 0) {
            return 0;
        }
        throw null;
    }
}
