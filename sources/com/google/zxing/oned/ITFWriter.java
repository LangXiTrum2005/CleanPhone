package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitMatrix;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ITFWriter extends OneDimensionalCodeWriter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f21375a = {1, 1, 1, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f21376b = {3, 1, 1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[][] f21377c = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public final BitMatrix a(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) {
        throw new IllegalArgumentException("Can only encode ITF, but got ".concat(String.valueOf(BarcodeFormat.f21331Y)));
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public final boolean[] c(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        }
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        boolean[] zArr = new boolean[(length * 9) + 9];
        int iB = OneDimensionalCodeWriter.b(zArr, 0, f21375a, true);
        for (int i2 = 0; i2 < length; i2 += 2) {
            int iDigit = Character.digit(str.charAt(i2), 10);
            int iDigit2 = Character.digit(str.charAt(i2 + 1), 10);
            int[] iArr = new int[10];
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = i3 * 2;
                int[][] iArr2 = f21377c;
                iArr[i4] = iArr2[iDigit][i3];
                iArr[i4 + 1] = iArr2[iDigit2][i3];
            }
            iB += OneDimensionalCodeWriter.b(zArr, iB, iArr, true);
        }
        OneDimensionalCodeWriter.b(zArr, iB, f21376b, true);
        return zArr;
    }
}
