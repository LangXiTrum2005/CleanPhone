package id;

import d5.u;
import java.io.IOException;
import java.io.OutputStream;
import md.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputStream f42988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f42989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gd.f f42990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f42991d = -1;

    public b(OutputStream outputStream, gd.f fVar, h hVar) {
        this.f42988a = outputStream;
        this.f42990c = fVar;
        this.f42989b = hVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        long j10 = this.f42991d;
        gd.f fVar = this.f42990c;
        if (j10 != -1) {
            fVar.e(j10);
        }
        h hVar = this.f42989b;
        fVar.f41858d.w(hVar.b());
        try {
            this.f42988a.close();
        } catch (IOException e10) {
            u.s(hVar, fVar, fVar);
            throw e10;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            this.f42988a.flush();
        } catch (IOException e10) {
            h hVar = this.f42989b;
            gd.f fVar = this.f42990c;
            u.s(hVar, fVar, fVar);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        gd.f fVar = this.f42990c;
        try {
            this.f42988a.write(i10);
            long j10 = this.f42991d + 1;
            this.f42991d = j10;
            fVar.e(j10);
        } catch (IOException e10) {
            u.s(this.f42989b, fVar, fVar);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        gd.f fVar = this.f42990c;
        try {
            this.f42988a.write(bArr);
            long length = this.f42991d + ((long) bArr.length);
            this.f42991d = length;
            fVar.e(length);
        } catch (IOException e10) {
            u.s(this.f42989b, fVar, fVar);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        gd.f fVar = this.f42990c;
        try {
            this.f42988a.write(bArr, i10, i11);
            long j10 = this.f42991d + ((long) i11);
            this.f42991d = j10;
            fVar.e(j10);
        } catch (IOException e10) {
            u.s(this.f42989b, fVar, fVar);
            throw e10;
        }
    }
}
