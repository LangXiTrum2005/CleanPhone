package fo;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p {
    public static int a(int i10, int i11, int i12) throws IOException {
        if ((i11 & 8) != 0) {
            i10--;
        }
        if (i12 <= i10) {
            return i10 - i12;
        }
        throw new IOException(defpackage.e.g(i12, i10, "PROTOCOL_ERROR padding ", " > remaining length "));
    }
}
