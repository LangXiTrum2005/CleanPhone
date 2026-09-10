package a1;

import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends FilterOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataOutputStream f3324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteOrder f3325b;

    public c(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f3324a = new DataOutputStream(outputStream);
        this.f3325b = byteOrder;
    }

    public final void a(int i10) throws IOException {
        this.f3324a.write(i10);
    }

    public final void b(int i10) throws IOException {
        ByteOrder byteOrder = this.f3325b;
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        DataOutputStream dataOutputStream = this.f3324a;
        if (byteOrder == byteOrder2) {
            dataOutputStream.write(i10 & 255);
            dataOutputStream.write((i10 >>> 8) & 255);
            dataOutputStream.write((i10 >>> 16) & 255);
            dataOutputStream.write((i10 >>> 24) & 255);
            return;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            dataOutputStream.write((i10 >>> 24) & 255);
            dataOutputStream.write((i10 >>> 16) & 255);
            dataOutputStream.write((i10 >>> 8) & 255);
            dataOutputStream.write(i10 & 255);
        }
    }

    public final void c(short s10) throws IOException {
        ByteOrder byteOrder = this.f3325b;
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        DataOutputStream dataOutputStream = this.f3324a;
        if (byteOrder == byteOrder2) {
            dataOutputStream.write(s10 & 255);
            dataOutputStream.write((s10 >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            dataOutputStream.write((s10 >>> 8) & 255);
            dataOutputStream.write(s10 & 255);
        }
    }

    public final void h(long j10) throws IOException {
        if (j10 > 4294967295L) {
            throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
        }
        b((int) j10);
    }

    public final void j(int i10) throws IOException {
        if (i10 > 65535) {
            throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
        }
        c((short) i10);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f3324a.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f3324a.write(bArr, i10, i11);
    }
}
