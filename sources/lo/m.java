package lo;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class m implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f45653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f45654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f45655c;

    public m(r sink) {
        kotlin.jvm.internal.n.f(sink, "sink");
        this.f45653a = sink;
        this.f45654b = new e();
    }

    @Override // lo.r, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        r rVar = this.f45653a;
        if (this.f45655c) {
            return;
        }
        e eVar = this.f45654b;
        long j10 = eVar.f45637b;
        if (j10 > 0) {
            rVar.e(j10, eVar);
        }
        th = null;
        try {
            rVar.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f45655c = true;
        if (th != null) {
            throw th;
        }
    }

    public final f d() {
        if (this.f45655c) {
            throw new IllegalStateException("closed");
        }
        e eVar = this.f45654b;
        long j10 = eVar.f45637b;
        if (j10 == 0) {
            j10 = 0;
        } else {
            o oVar = eVar.f45636a;
            kotlin.jvm.internal.n.c(oVar);
            o oVar2 = oVar.f45665g;
            kotlin.jvm.internal.n.c(oVar2);
            int i10 = oVar2.f45661c;
            if (i10 < 8192 && oVar2.f45663e) {
                j10 -= (long) (i10 - oVar2.f45660b);
            }
        }
        if (j10 > 0) {
            this.f45653a.e(j10, eVar);
        }
        return this;
    }

    @Override // lo.r
    public final void e(long j10, e source) {
        kotlin.jvm.internal.n.f(source, "source");
        if (this.f45655c) {
            throw new IllegalStateException("closed");
        }
        this.f45654b.e(j10, source);
        d();
    }

    @Override // lo.f, lo.r, java.io.Flushable
    public final void flush() {
        if (this.f45655c) {
            throw new IllegalStateException("closed");
        }
        e eVar = this.f45654b;
        long j10 = eVar.f45637b;
        r rVar = this.f45653a;
        if (j10 > 0) {
            rVar.e(j10, eVar);
        }
        rVar.flush();
    }

    @Override // lo.f
    public final f g(h byteString) {
        kotlin.jvm.internal.n.f(byteString, "byteString");
        if (this.f45655c) {
            throw new IllegalStateException("closed");
        }
        this.f45654b.o(byteString);
        d();
        return this;
    }

    public final f h(int i10, int i11, String string) {
        kotlin.jvm.internal.n.f(string, "string");
        if (this.f45655c) {
            throw new IllegalStateException("closed");
        }
        this.f45654b.u(i10, i11, string);
        d();
        return this;
    }

    @Override // lo.f
    public final f i(int i10, byte[] source) {
        kotlin.jvm.internal.n.f(source, "source");
        if (this.f45655c) {
            throw new IllegalStateException("closed");
        }
        this.f45654b.n(i10, source);
        d();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f45655c;
    }

    @Override // lo.r
    public final v timeout() {
        return this.f45653a.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f45653a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        kotlin.jvm.internal.n.f(source, "source");
        if (this.f45655c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f45654b.write(source);
        d();
        return iWrite;
    }

    @Override // lo.f
    public final f writeByte(int i10) {
        if (this.f45655c) {
            throw new IllegalStateException("closed");
        }
        this.f45654b.q(i10);
        d();
        return this;
    }

    @Override // lo.f
    public final f writeHexadecimalUnsignedLong(long j10) {
        if (this.f45655c) {
            throw new IllegalStateException("closed");
        }
        this.f45654b.r(j10);
        d();
        return this;
    }

    @Override // lo.f
    public final f writeInt(int i10) {
        if (this.f45655c) {
            throw new IllegalStateException("closed");
        }
        this.f45654b.s(i10);
        d();
        return this;
    }

    @Override // lo.f
    public final f writeShort(int i10) {
        if (this.f45655c) {
            throw new IllegalStateException("closed");
        }
        this.f45654b.t(i10);
        d();
        return this;
    }

    @Override // lo.f
    public final f writeUtf8(String string) {
        kotlin.jvm.internal.n.f(string, "string");
        if (this.f45655c) {
            throw new IllegalStateException("closed");
        }
        this.f45654b.v(string);
        d();
        return this;
    }

    @Override // lo.f
    public final f write(byte[] bArr) {
        if (!this.f45655c) {
            this.f45654b.n(bArr.length, bArr);
            d();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
