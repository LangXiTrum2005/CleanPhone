package com.bykv.vk.openvk.preload.geckox.buffer.stream;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class BufferOutputStream extends b {
    private com.bykv.vk.openvk.preload.geckox.buffer.a mBuffer;

    public BufferOutputStream(com.bykv.vk.openvk.preload.geckox.buffer.a aVar) {
        this.mBuffer = aVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        flush();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // java.io.OutputStream
    public void write(int i2) throws IOException {
        this.mBuffer.a(i2);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.mBuffer.a(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) throws IOException {
        this.mBuffer.a(bArr, i2, i3);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.stream.b
    public void write(long j, int i2) throws IOException {
        synchronized (this) {
            this.mBuffer.b(j);
            this.mBuffer.a(i2);
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.stream.b
    public void write(long j, byte[] bArr) throws IOException {
        synchronized (this) {
            this.mBuffer.b(j);
            this.mBuffer.a(bArr);
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.stream.b
    public void write(long j, byte[] bArr, int i2, int i3) throws IOException {
        synchronized (this) {
            this.mBuffer.b(j);
            this.mBuffer.a(bArr, i2, i3);
        }
    }
}
