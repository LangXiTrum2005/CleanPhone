package a7;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f3412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3413b = -1;

    public a(ByteBuffer byteBuffer) {
        this.f3412a = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f3412a.remaining();
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i10) {
        this.f3413b = this.f3412a.position();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.f3412a;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        int i10 = this.f3413b;
        if (i10 == -1) {
            throw new IOException("Cannot reset to unset mark position");
        }
        this.f3412a.position(i10);
    }

    @Override // java.io.InputStream
    public final long skip(long j10) {
        ByteBuffer byteBuffer = this.f3412a;
        if (!byteBuffer.hasRemaining()) {
            return -1L;
        }
        long jMin = Math.min(j10, byteBuffer.remaining());
        byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
        return jMin;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        ByteBuffer byteBuffer = this.f3412a;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i11, byteBuffer.remaining());
        byteBuffer.get(bArr, i10, iMin);
        return iMin;
    }
}
