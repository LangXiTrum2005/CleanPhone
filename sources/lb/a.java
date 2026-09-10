package lb;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f45273a;

    public a(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[i10];
        this.f45273a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i10);
    }

    public static a a(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        int length = bArr.length;
        if (length > bArr.length) {
            length = bArr.length;
        }
        return new a(bArr, length);
    }

    public final byte[] b() {
        byte[] bArr = this.f45273a;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Arrays.equals(((a) obj).f45273a, this.f45273a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f45273a);
    }

    public final String toString() {
        return "Bytes(" + a.a.m(this.f45273a) + ")";
    }
}
