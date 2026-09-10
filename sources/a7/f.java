package a7;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import n6.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends InputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayDeque f3422c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v f3423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IOException f3424b;

    static {
        char[] cArr = p.f3444a;
        f3422c = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f3423a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f3423a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i10) {
        this.f3423a.mark(i10);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.f3423a.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f3423a.read();
        } catch (IOException e10) {
            this.f3424b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f3423a.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j10) throws IOException {
        try {
            return this.f3423a.skip(j10);
        } catch (IOException e10) {
            this.f3424b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.f3423a.read(bArr);
        } catch (IOException e10) {
            this.f3424b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            return this.f3423a.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f3424b = e10;
            throw e10;
        }
    }
}
