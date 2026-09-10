package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
final class m implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f36804a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f36805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f36806c;

    public m(r rVar) {
        if (rVar == null) {
            throw new NullPointerException("sink == null");
        }
        this.f36805b = rVar;
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public c a() {
        return this.f36804a;
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public t b() {
        return this.f36805b.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f36806c) {
            return;
        }
        c cVar = this.f36804a;
        long j10 = cVar.f36779b;
        if (j10 > 0) {
            this.f36805b.a(cVar, j10);
        }
        th = null;
        try {
            this.f36805b.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f36806c = true;
        if (th != null) {
            u.a(th);
        }
    }

    public d d() throws IOException {
        if (this.f36806c) {
            throw new IllegalStateException("closed");
        }
        long jM = this.f36804a.m();
        if (jM > 0) {
            this.f36805b.a(this.f36804a, jM);
        }
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.d, com.mbridge.msdk.thrid.okio.r, java.io.Flushable
    public void flush() throws IOException {
        if (this.f36806c) {
            throw new IllegalStateException("closed");
        }
        c cVar = this.f36804a;
        long j10 = cVar.f36779b;
        if (j10 > 0) {
            this.f36805b.a(cVar, j10);
        }
        this.f36805b.flush();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f36806c;
    }

    public String toString() {
        return "buffer(" + this.f36805b + ")";
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d write(byte[] bArr) throws IOException {
        if (this.f36806c) {
            throw new IllegalStateException("closed");
        }
        this.f36804a.write(bArr);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d writeByte(int i10) throws IOException {
        if (this.f36806c) {
            throw new IllegalStateException("closed");
        }
        this.f36804a.writeByte(i10);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d writeInt(int i10) throws IOException {
        if (this.f36806c) {
            throw new IllegalStateException("closed");
        }
        this.f36804a.writeInt(i10);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d writeShort(int i10) throws IOException {
        if (this.f36806c) {
            throw new IllegalStateException("closed");
        }
        this.f36804a.writeShort(i10);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public void a(c cVar, long j10) throws IOException {
        if (this.f36806c) {
            throw new IllegalStateException("closed");
        }
        this.f36804a.a(cVar, j10);
        d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d write(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.f36806c) {
            this.f36804a.write(bArr, i10, i11);
            return d();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d a(String str) throws IOException {
        if (!this.f36806c) {
            this.f36804a.a(str);
            return d();
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!this.f36806c) {
            int iWrite = this.f36804a.write(byteBuffer);
            d();
            return iWrite;
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d a(long j10) throws IOException {
        if (!this.f36806c) {
            this.f36804a.a(j10);
            return d();
        }
        throw new IllegalStateException("closed");
    }
}
