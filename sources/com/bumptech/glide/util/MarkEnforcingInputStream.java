package com.bumptech.glide.util;

import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class MarkEnforcingInputStream extends FilterInputStream {
    public int X;

    public MarkEnforcingInputStream(ExceptionPassthroughInputStream exceptionPassthroughInputStream) {
        super(exceptionPassthroughInputStream);
        this.X = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i2 = this.X;
        return i2 == Integer.MIN_VALUE ? super.available() : Math.min(i2, super.available());
    }

    public final long h(long j) {
        int i2 = this.X;
        if (i2 == 0) {
            return -1L;
        }
        return (i2 == Integer.MIN_VALUE || j <= ((long) i2)) ? j : i2;
    }

    public final void i(long j) {
        int i2 = this.X;
        if (i2 == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.X = (int) (((long) i2) - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i2) {
        super.mark(i2);
        this.X = i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (h(1L) == -1) {
            return -1;
        }
        int i2 = super.read();
        i(1L);
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.X = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jH = h(j);
        if (jH == -1) {
            return 0L;
        }
        long jSkip = super.skip(jH);
        i(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int iH = (int) h(i3);
        if (iH == -1) {
            return -1;
        }
        int i4 = super.read(bArr, i2, iH);
        i(i4);
        return i4;
    }
}
