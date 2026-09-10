package com.google.common.io;

import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class CountingInputStream extends FilterInputStream {
    public long X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public long f20024Y;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i2) {
        ((FilterInputStream) this).in.mark(i2);
        this.f20024Y = this.X;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i2 = ((FilterInputStream) this).in.read();
        if (i2 != -1) {
            this.X++;
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f20024Y == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.X = this.f20024Y;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(j);
        this.X += jSkip;
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = ((FilterInputStream) this).in.read(bArr, i2, i3);
        if (i4 != -1) {
            this.X += (long) i4;
        }
        return i4;
    }
}
