package com.bumptech.glide.util;

import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class ExceptionCatchingInputStream extends InputStream {
    static {
        char[] cArr = Util.f12851a;
        new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        throw null;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // java.io.InputStream
    public final void mark(int i2) {
        throw null;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        throw null;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        throw null;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        throw null;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        throw null;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        throw null;
    }

    @Override // java.io.InputStream
    public final int read() {
        throw null;
    }
}
