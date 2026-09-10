package com.bumptech.glide.util;

import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class ExceptionPassthroughInputStream extends InputStream {
    public static final ArrayDeque Z;
    public RecyclableBufferedInputStream X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public IOException f12836Y;

    static {
        char[] cArr = Util.f12851a;
        Z = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.X.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.X.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i2) {
        this.X.mark(i2);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.X.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.X.read();
        } catch (IOException e2) {
            this.f12836Y = e2;
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.X.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            return this.X.skip(j);
        } catch (IOException e2) {
            this.f12836Y = e2;
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.X.read(bArr);
        } catch (IOException e2) {
            this.f12836Y = e2;
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        try {
            return this.X.read(bArr, i2, i3);
        } catch (IOException e2) {
            this.f12836Y = e2;
            throw e2;
        }
    }
}
