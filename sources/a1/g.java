package a1;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends b {
    public g(byte[] bArr) {
        super(bArr);
        this.f3319a.mark(Integer.MAX_VALUE);
    }

    public final void h(long j10) throws IOException {
        int i10 = this.f3320b;
        if (i10 > j10) {
            this.f3320b = 0;
            this.f3319a.reset();
        } else {
            j10 -= (long) i10;
        }
        a((int) j10);
    }

    public g(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f3319a.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
