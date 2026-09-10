package n1;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f46363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f46364b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f46366d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f46367e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f46365c = new byte[1];

    public j(h hVar, k kVar) {
        this.f46363a = hVar;
        this.f46364b = kVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f46367e) {
            return;
        }
        this.f46363a.close();
        this.f46367e = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f46365c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        go.k.t(!this.f46367e);
        boolean z10 = this.f46366d;
        h hVar = this.f46363a;
        if (!z10) {
            hVar.C(this.f46364b);
            this.f46366d = true;
        }
        int i12 = hVar.read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        return i12;
    }
}
