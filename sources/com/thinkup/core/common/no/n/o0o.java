package com.thinkup.core.common.no.n;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes6.dex */
final class o0o implements o0 {
    public final oom m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f42091n;
    public final n o = new n();

    public o0o(oom oomVar) {
        if (oomVar == null) {
            throw new NullPointerException("sink == null");
        }
        this.m = oomVar;
    }

    @Override // com.thinkup.core.common.no.n.oom, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        if (this.f42091n) {
            return;
        }
        n nVar = this.o;
        long j = nVar.f42084n;
        if (j > 0) {
            this.m.o(nVar, j);
        }
        th = null;
        try {
            this.m.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f42091n = true;
        if (th != null) {
            omo.o(th);
        }
    }

    @Override // com.thinkup.core.common.no.n.o0, com.thinkup.core.common.no.n.oom, java.io.Flushable
    public final void flush() {
        if (this.f42091n) {
            throw new IllegalStateException("closed");
        }
        n nVar = this.o;
        long j = nVar.f42084n;
        if (j > 0) {
            this.m.o(nVar, j);
        }
        this.m.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f42091n;
    }

    @Override // com.thinkup.core.common.no.n.o0
    public final o0 m(String str) {
        if (this.f42091n) {
            throw new IllegalStateException("closed");
        }
        this.o.m(str);
        return omn();
    }

    @Override // com.thinkup.core.common.no.n.o0
    public final o0 m0(int i2) {
        if (this.f42091n) {
            throw new IllegalStateException("closed");
        }
        this.o.m0(i2);
        return omn();
    }

    @Override // com.thinkup.core.common.no.n.o0
    public final o0 mm(int i2) {
        if (this.f42091n) {
            throw new IllegalStateException("closed");
        }
        this.o.mm(i2);
        return omn();
    }

    @Override // com.thinkup.core.common.no.n.o0
    public final o0 mn(int i2) {
        if (this.f42091n) {
            throw new IllegalStateException("closed");
        }
        this.o.mn(i2);
        return omn();
    }

    @Override // com.thinkup.core.common.no.n.o0
    public final o0 mo(int i2) {
        if (this.f42091n) {
            throw new IllegalStateException("closed");
        }
        this.o.mo(i2);
        return omn();
    }

    @Override // com.thinkup.core.common.no.n.o0, com.thinkup.core.common.no.n.oo
    public final n n() {
        return this.o;
    }

    @Override // com.thinkup.core.common.no.n.o0
    public final o0 n0(int i2) {
        if (this.f42091n) {
            throw new IllegalStateException("closed");
        }
        this.o.n0(i2);
        return omn();
    }

    @Override // com.thinkup.core.common.no.n.o0
    public final o0 nm(long j) {
        if (this.f42091n) {
            throw new IllegalStateException("closed");
        }
        this.o.nm(j);
        return omn();
    }

    @Override // com.thinkup.core.common.no.n.o0
    public final o0 nn(long j) {
        if (this.f42091n) {
            throw new IllegalStateException("closed");
        }
        this.o.nn(j);
        return omn();
    }

    @Override // com.thinkup.core.common.no.n.o0
    public final o0 no(int i2) {
        if (this.f42091n) {
            throw new IllegalStateException("closed");
        }
        this.o.no(i2);
        return omn();
    }

    @Override // com.thinkup.core.common.no.n.oom
    public final void o(n nVar, long j) {
        if (this.f42091n) {
            throw new IllegalStateException("closed");
        }
        this.o.o(nVar, j);
        omn();
    }

    @Override // com.thinkup.core.common.no.n.o0
    public final o0 o0(om omVar) {
        if (this.f42091n) {
            throw new IllegalStateException("closed");
        }
        this.o.o0(omVar);
        return omn();
    }

    @Override // com.thinkup.core.common.no.n.o0
    public final o0 o00(long j) {
        if (this.f42091n) {
            throw new IllegalStateException("closed");
        }
        this.o.o00(j);
        return omn();
    }

    @Override // com.thinkup.core.common.no.n.o0
    public final o0 o0o(long j) {
        if (this.f42091n) {
            throw new IllegalStateException("closed");
        }
        this.o.o0o(j);
        return omn();
    }

    @Override // com.thinkup.core.common.no.n.o0
    public final o0 om() {
        if (this.f42091n) {
            throw new IllegalStateException("closed");
        }
        n nVar = this.o;
        long j = nVar.f42084n;
        if (j > 0) {
            this.m.o(nVar, j);
        }
        return this;
    }

    @Override // com.thinkup.core.common.no.n.o0
    public final o0 omn() {
        if (this.f42091n) {
            throw new IllegalStateException("closed");
        }
        long jMm = this.o.mm();
        if (jMm > 0) {
            this.m.o(this.o, jMm);
        }
        return this;
    }

    @Override // com.thinkup.core.common.no.n.o0
    public final OutputStream oo() {
        return new OutputStream() { // from class: com.thinkup.core.common.no.n.o0o.1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws Throwable {
                o0o.this.close();
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public final void flush() {
                o0o o0oVar = o0o.this;
                if (o0oVar.f42091n) {
                    return;
                }
                o0oVar.flush();
            }

            public final String toString() {
                return o0o.this + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public final void write(int i2) throws IOException {
                o0o o0oVar = o0o.this;
                if (o0oVar.f42091n) {
                    throw new IOException("closed");
                }
                o0oVar.o.n0((int) ((byte) i2));
                o0o.this.omn();
            }

            @Override // java.io.OutputStream
            public final void write(byte[] bArr, int i2, int i3) throws IOException {
                o0o o0oVar = o0o.this;
                if (!o0oVar.f42091n) {
                    o0oVar.o.n(bArr, i2, i3);
                    o0o.this.omn();
                    return;
                }
                throw new IOException("closed");
            }
        };
    }

    public final String toString() {
        return "buffer(" + this.m + ")";
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (this.f42091n) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.o.write(byteBuffer);
        omn();
        return iWrite;
    }

    @Override // com.thinkup.core.common.no.n.o0
    public final o0 n(byte[] bArr, int i2, int i3) {
        if (this.f42091n) {
            throw new IllegalStateException("closed");
        }
        this.o.n(bArr, i2, i3);
        return omn();
    }

    @Override // com.thinkup.core.common.no.n.o0
    public final o0 m(String str, int i2, int i3) {
        if (!this.f42091n) {
            this.o.m(str, i2, i3);
            return omn();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.thinkup.core.common.no.n.o0
    public final long o(oon oonVar) {
        if (oonVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long jA_ = oonVar.a_(this.o, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (jA_ == -1) {
                return j;
            }
            j += jA_;
            omn();
        }
    }

    @Override // com.thinkup.core.common.no.n.o0
    public final o0 o0(byte[] bArr) {
        if (!this.f42091n) {
            this.o.o0(bArr);
            return omn();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.thinkup.core.common.no.n.o0
    public final o0 o(oon oonVar, long j) throws EOFException {
        while (j > 0) {
            long jA_ = oonVar.a_(this.o, j);
            if (jA_ != -1) {
                j -= jA_;
                omn();
            } else {
                throw new EOFException();
            }
        }
        return this;
    }

    @Override // com.thinkup.core.common.no.n.o0
    public final o0 m(String str, Charset charset) {
        if (!this.f42091n) {
            this.o.m(str, charset);
            return omn();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.thinkup.core.common.no.n.oom
    public final om0 o() {
        return this.m.o();
    }

    @Override // com.thinkup.core.common.no.n.o0
    public final o0 m(String str, int i2, int i3, Charset charset) {
        if (!this.f42091n) {
            this.o.m(str, i2, i3, charset);
            return omn();
        }
        throw new IllegalStateException("closed");
    }
}
