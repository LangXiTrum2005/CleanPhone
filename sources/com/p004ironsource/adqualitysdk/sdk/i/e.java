package com.p004ironsource.adqualitysdk.sdk.i;

/* JADX INFO: loaded from: classes5.dex */
public final class e {
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m2071(int[] iArr) {
        for (int i2 = 0; i2 < iArr.length / 2; i2++) {
            int i3 = iArr[i2];
            iArr[i2] = iArr[(iArr.length - i2) - 1];
            iArr[(iArr.length - i2) - 1] = i3;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m2072(int i2, int i3, boolean z2, int i4, int[] iArr, int[][] iArr2, int[] iArr3) {
        if (!z2) {
            m2071(iArr);
        }
        int i5 = 0;
        while (i5 < i4) {
            int i6 = i2 ^ iArr[i5];
            int i7 = i3 ^ ((iArr2[2][(i6 >>> 8) & 255] ^ (iArr2[0][i6 >>> 24] + iArr2[1][(i6 >>> 16) & 255])) + iArr2[3][i6 & 255]);
            i5++;
            i3 = i6;
            i2 = i7;
        }
        int i8 = i2 ^ iArr[iArr.length - 2];
        int i9 = i3 ^ iArr[iArr.length - 1];
        if (!z2) {
            m2071(iArr);
        }
        iArr3[0] = i9;
        iArr3[1] = i8;
    }
}
