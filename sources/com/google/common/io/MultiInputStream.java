package com.google.common.io;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class MultiInputStream extends InputStream {
    public InputStream X;

    @Override // java.io.InputStream
    public final int available() {
        InputStream inputStream = this.X;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.X;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.X = null;
            }
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        InputStream inputStream = this.X;
        if (inputStream == null) {
            return -1;
        }
        int i2 = inputStream.read();
        if (i2 != -1) {
            return i2;
        }
        close();
        throw null;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        InputStream inputStream = this.X;
        if (inputStream == null || j <= 0) {
            return 0L;
        }
        long jSkip = inputStream.skip(j);
        if (jSkip != 0) {
            return jSkip;
        }
        if (read() == -1) {
            return 0L;
        }
        return this.X.skip(j - 1) + 1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        bArr.getClass();
        InputStream inputStream = this.X;
        if (inputStream == null) {
            return -1;
        }
        int i4 = inputStream.read(bArr, i2, i3);
        if (i4 != -1) {
            return i4;
        }
        close();
        throw null;
    }
}
