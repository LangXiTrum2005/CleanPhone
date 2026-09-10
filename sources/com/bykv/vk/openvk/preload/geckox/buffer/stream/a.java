package com.bykv.vk.openvk.preload.geckox.buffer.stream;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class a extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.buffer.a f12943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f12944b;

    public a(com.bykv.vk.openvk.preload.geckox.buffer.a aVar) {
        this.f12943a = aVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        long jB = this.f12943a.b() - this.f12943a.c();
        if (jB > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) jB;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i2) {
        this.f12944b = i2;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return this.f12943a.b(bArr);
    }

    @Override // java.io.InputStream
    public final synchronized void reset() throws IOException {
        this.f12943a.b(this.f12944b);
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        return this.f12943a.a(j);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        return this.f12943a.b(bArr, i2, i3);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        return this.f12943a.d();
    }
}
