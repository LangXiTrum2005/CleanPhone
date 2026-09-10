package bc;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f5559c;

    public k(m mVar, j jVar) {
        this.f5559c = mVar;
        this.f5557a = mVar.q(jVar.f5555a + 4);
        this.f5558b = jVar.f5556b;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i12 = this.f5558b;
        if (i12 <= 0) {
            return -1;
        }
        if (i11 > i12) {
            i11 = i12;
        }
        int i13 = this.f5557a;
        m mVar = this.f5559c;
        mVar.n(i13, i10, i11, bArr);
        this.f5557a = mVar.q(this.f5557a + i11);
        this.f5558b -= i11;
        return i11;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f5558b == 0) {
            return -1;
        }
        m mVar = this.f5559c;
        mVar.f5561a.seek(this.f5557a);
        int i10 = mVar.f5561a.read();
        this.f5557a = mVar.q(this.f5557a + 1);
        this.f5558b--;
        return i10;
    }
}
