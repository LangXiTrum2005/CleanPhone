package xn;

import java.io.Closeable;
import java.io.IOException;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class y implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        yn.a.d(n());
    }

    public final byte[] d() throws IOException {
        long jH = h();
        if (jH > 2147483647L) {
            throw new IOException(defpackage.e.i(jH, "Cannot buffer entire body for content length: "));
        }
        lo.g gVarN = n();
        try {
            byte[] byteArray = gVarN.readByteArray();
            gVarN.close();
            int length = byteArray.length;
            if (jH == -1 || jH == length) {
                return byteArray;
            }
            throw new IOException("Content-Length (" + jH + ") and stream length (" + length + ") disagree");
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                i0.j(gVarN, th2);
                throw th3;
            }
        }
    }

    public abstract long h();

    public abstract o k();

    public abstract lo.g n();
}
