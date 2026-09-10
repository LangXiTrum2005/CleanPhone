package id;

import d5.u;
import java.io.IOException;
import java.io.InputStream;
import md.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f42982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gd.f f42983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f42984c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f42986e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f42985d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f42987f = -1;

    public a(InputStream inputStream, gd.f fVar, h hVar) {
        this.f42984c = hVar;
        this.f42982a = inputStream;
        this.f42983b = fVar;
        this.f42986e = fVar.f41858d.k();
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        try {
            return this.f42982a.available();
        } catch (IOException e10) {
            h hVar = this.f42984c;
            gd.f fVar = this.f42983b;
            u.s(hVar, fVar, fVar);
            throw e10;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        gd.f fVar = this.f42983b;
        h hVar = this.f42984c;
        long jB = hVar.b();
        if (this.f42987f == -1) {
            this.f42987f = jB;
        }
        try {
            this.f42982a.close();
            long j10 = this.f42985d;
            if (j10 != -1) {
                fVar.h(j10);
            }
            long j11 = this.f42986e;
            if (j11 != -1) {
                fVar.f41858d.y(j11);
            }
            fVar.i(this.f42987f);
            fVar.b();
        } catch (IOException e10) {
            u.s(hVar, fVar, fVar);
            throw e10;
        }
    }

    public final void h(long j10) {
        long j11 = this.f42985d;
        if (j11 == -1) {
            this.f42985d = j10;
        } else {
            this.f42985d = j11 + j10;
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i10) {
        this.f42982a.mark(i10);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f42982a.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        h hVar = this.f42984c;
        gd.f fVar = this.f42983b;
        try {
            int i10 = this.f42982a.read();
            long jB = hVar.b();
            if (this.f42986e == -1) {
                this.f42986e = jB;
            }
            if (i10 != -1 || this.f42987f != -1) {
                h(1L);
                fVar.h(this.f42985d);
                return i10;
            }
            this.f42987f = jB;
            fVar.i(jB);
            fVar.b();
            return i10;
        } catch (IOException e10) {
            u.s(hVar, fVar, fVar);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        try {
            this.f42982a.reset();
        } catch (IOException e10) {
            h hVar = this.f42984c;
            gd.f fVar = this.f42983b;
            u.s(hVar, fVar, fVar);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j10) throws IOException {
        h hVar = this.f42984c;
        gd.f fVar = this.f42983b;
        try {
            long jSkip = this.f42982a.skip(j10);
            long jB = hVar.b();
            if (this.f42986e == -1) {
                this.f42986e = jB;
            }
            if (jSkip == 0 && j10 != 0 && this.f42987f == -1) {
                this.f42987f = jB;
                fVar.i(jB);
                return jSkip;
            }
            h(jSkip);
            fVar.h(this.f42985d);
            return jSkip;
        } catch (IOException e10) {
            u.s(hVar, fVar, fVar);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        h hVar = this.f42984c;
        gd.f fVar = this.f42983b;
        try {
            int i12 = this.f42982a.read(bArr, i10, i11);
            long jB = hVar.b();
            if (this.f42986e == -1) {
                this.f42986e = jB;
            }
            if (i12 == -1 && this.f42987f == -1) {
                this.f42987f = jB;
                fVar.i(jB);
                fVar.b();
                return i12;
            }
            h(i12);
            fVar.h(this.f42985d);
            return i12;
        } catch (IOException e10) {
            u.s(hVar, fVar, fVar);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        h hVar = this.f42984c;
        gd.f fVar = this.f42983b;
        try {
            int i10 = this.f42982a.read(bArr);
            long jB = hVar.b();
            if (this.f42986e == -1) {
                this.f42986e = jB;
            }
            if (i10 == -1 && this.f42987f == -1) {
                this.f42987f = jB;
                fVar.i(jB);
                fVar.b();
                return i10;
            }
            h(i10);
            fVar.h(this.f42985d);
            return i10;
        } catch (IOException e10) {
            u.s(hVar, fVar, fVar);
            throw e10;
        }
    }
}
