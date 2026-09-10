package pc;

import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f48308a;

    @Override // java.io.OutputStream
    public final void write(int i10) {
        this.f48308a++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f48308a += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 >= 0 && i10 <= bArr.length && i11 >= 0 && (i12 = i10 + i11) <= bArr.length && i12 >= 0) {
            this.f48308a += (long) i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
