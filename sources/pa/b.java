package pa;

import j1.f;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f48293a = "0123456789abcdef".toCharArray();

    public final boolean equals(Object obj) {
        boolean z10;
        if (obj instanceof b) {
            byte[] bArr = ((a) this).f48292b;
            int length = bArr.length * 8;
            byte[] bArr2 = ((a) ((b) obj)).f48292b;
            if (length == bArr2.length * 8) {
                if (bArr.length != bArr2.length) {
                    z10 = false;
                } else {
                    z10 = true;
                    for (int i10 = 0; i10 < bArr.length; i10++) {
                        z10 &= bArr[i10] == bArr2[i10];
                    }
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = ((a) this).f48292b;
        if (bArr.length * 8 >= 32) {
            boolean z10 = bArr.length >= 4;
            int length = bArr.length;
            if (z10) {
                return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
            }
            throw new IllegalStateException(f.B("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
        }
        int i10 = bArr[0] & 255;
        for (int i11 = 1; i11 < bArr.length; i11++) {
            i10 |= (bArr[i11] & 255) << (i11 * 8);
        }
        return i10;
    }

    public final String toString() {
        byte[] bArr = ((a) this).f48292b;
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            char[] cArr = f48293a;
            sb2.append(cArr[(b10 >> 4) & 15]);
            sb2.append(cArr[b10 & 15]);
        }
        return sb2.toString();
    }
}
