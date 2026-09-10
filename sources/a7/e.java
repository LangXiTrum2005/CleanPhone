package a7;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3421b;

    public e(InputStream inputStream, long j10) {
        super(inputStream);
        this.f3420a = j10;
    }

    public final void a(int i10) throws IOException {
        if (i10 >= 0) {
            this.f3421b += i10;
            return;
        }
        long j10 = this.f3421b;
        long j11 = this.f3420a;
        if (j11 - j10 <= 0) {
            return;
        }
        StringBuilder sbL = wi.d.l(j11, "Failed to read all expected data, expected: ", ", but read: ");
        sbL.append(this.f3421b);
        throw new IOException(sbL.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f3420a - ((long) this.f3421b), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int i10;
        i10 = super.read();
        a(i10 >= 0 ? 1 : -1);
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i10, int i11) {
        int i12;
        i12 = super.read(bArr, i10, i11);
        a(i12);
        return i12;
    }
}
