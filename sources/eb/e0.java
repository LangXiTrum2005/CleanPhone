package eb;

import java.security.SecureRandom;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final co.c f39978a = new co.c(12);

    public static byte[] a(int i10) {
        byte[] bArr = new byte[i10];
        ((SecureRandom) f39978a.get()).nextBytes(bArr);
        return bArr;
    }
}
