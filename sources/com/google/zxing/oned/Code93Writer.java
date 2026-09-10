package com.google.zxing.oned;

import android.support.v4.media.a;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitMatrix;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes3.dex */
public class Code93Writer extends OneDimensionalCodeWriter {
    public static void e(boolean[] zArr, int i2, int[] iArr) {
        int length = iArr.length;
        int i3 = 0;
        while (i3 < length) {
            int i4 = i2 + 1;
            zArr[i2] = iArr[i3] != 0;
            i3++;
            i2 = i4;
        }
    }

    public static int f(int i2, String str) {
        int iIndexOf = 0;
        int i3 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i3;
            i3++;
            if (i3 > i2) {
                i3 = 1;
            }
        }
        return iIndexOf % 47;
    }

    public static void g(int i2, int[] iArr) {
        for (int i3 = 0; i3 < 9; i3++) {
            int i4 = 1;
            if (((1 << (8 - i3)) & i2) == 0) {
                i4 = 0;
            }
            iArr[i3] = i4;
        }
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public final BitMatrix a(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) {
        throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(BarcodeFormat.f21331Y)));
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public final boolean[] c(String str) {
        int length = str.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        int i2 = 9;
        int[] iArr = new int[9];
        int length2 = ((str.length() + 4) * 9) + 1;
        g(Code93Reader.f21374a[47], iArr);
        boolean[] zArr = new boolean[length2];
        e(zArr, 0, iArr);
        for (int i3 = 0; i3 < length; i3++) {
            g(Code93Reader.f21374a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(i3))], iArr);
            e(zArr, i2, iArr);
            i2 += 9;
        }
        int iF = f(20, str);
        int[] iArr2 = Code93Reader.f21374a;
        g(iArr2[iF], iArr);
        e(zArr, i2, iArr);
        StringBuilder sbW = a.w(str);
        sbW.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(iF));
        g(iArr2[f(15, sbW.toString())], iArr);
        e(zArr, i2 + 9, iArr);
        g(iArr2[47], iArr);
        e(zArr, i2 + 18, iArr);
        zArr[i2 + 27] = true;
        return zArr;
    }
}
