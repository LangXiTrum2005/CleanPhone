package e6;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends IOException {
    private static final long serialVersionUID = 1;

    public c(int i10, IOException iOException, String str) {
        super(str + ", status code: " + i10, iOException);
    }
}
