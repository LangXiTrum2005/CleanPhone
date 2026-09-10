package oe;

import com.google.android.gms.internal.auth.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h extends o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f47403e = {1, 1, 1};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f47404f = {1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f47405g = {1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[][] f47406h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[][] f47407i;

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f47406h = iArr;
        int[][] iArr2 = new int[20][];
        f47407i = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i10 = 10; i10 < 20; i10++) {
            int[] iArr3 = f47406h[i10 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i11 = 0; i11 < iArr3.length; i11++) {
                iArr4[i11] = iArr3[(iArr3.length - i11) - 1];
            }
            f47407i[i10] = iArr4;
        }
    }

    public static boolean F(String str) {
        int length = str.length();
        if (length != 0) {
            int i10 = length - 1;
            if (G(str.subSequence(0, i10)) == Character.digit(str.charAt(i10), 10)) {
                return true;
            }
        }
        return false;
    }

    public static int G(CharSequence charSequence) throws he.b {
        int length = charSequence.length();
        int i10 = 0;
        for (int i11 = length - 1; i11 >= 0; i11 -= 2) {
            int iCharAt = charSequence.charAt(i11) - '0';
            if (iCharAt < 0 || iCharAt > 9) {
                he.b bVar = he.b.f42336c;
                if (he.c.f42337a) {
                    throw new he.b();
                }
                throw he.b.f42336c;
            }
            i10 += iCharAt;
        }
        int i12 = i10 * 3;
        for (int i13 = length - 2; i13 >= 0; i13 -= 2) {
            int iCharAt2 = charSequence.charAt(i13) - '0';
            if (iCharAt2 < 0 || iCharAt2 > 9) {
                he.b bVar2 = he.b.f42336c;
                if (he.c.f42337a) {
                    throw new he.b();
                }
                throw he.b.f42336c;
            }
            i12 += iCharAt2;
        }
        return (1000 - i12) % 10;
    }
}
