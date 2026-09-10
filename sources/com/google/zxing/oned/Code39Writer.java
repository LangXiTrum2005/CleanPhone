package com.google.zxing.oned;

import androidx.datastore.preferences.protobuf.a;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitMatrix;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes3.dex */
public final class Code39Writer extends OneDimensionalCodeWriter {
    public static void e(int i2, int[] iArr) {
        for (int i3 = 0; i3 < 9; i3++) {
            int i4 = 1;
            if (((1 << (8 - i3)) & i2) != 0) {
                i4 = 2;
            }
            iArr[i3] = i4;
        }
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public final BitMatrix a(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) {
        throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(BarcodeFormat.f21331Y)));
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00ee  */
    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public final boolean[] c(String str) {
        int[] iArr;
        int length = str.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        for (int i2 = 0; i2 < length; i2++) {
            if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i2)) < 0) {
                int length2 = str.length();
                StringBuilder sb = new StringBuilder();
                for (int i3 = 0; i3 < length2; i3++) {
                    char cCharAt = str.charAt(i3);
                    if (cCharAt == 0) {
                        sb.append("%U");
                    } else if (cCharAt == ' ') {
                        sb.append(cCharAt);
                    } else if (cCharAt == '@') {
                        sb.append("%V");
                    } else if (cCharAt == '`') {
                        sb.append("%W");
                    } else if (cCharAt == '-' || cCharAt == '.') {
                        sb.append(cCharAt);
                    } else if (cCharAt <= 26) {
                        sb.append('$');
                        sb.append((char) (cCharAt + '@'));
                    } else if (cCharAt < ' ') {
                        sb.append('%');
                        sb.append((char) (cCharAt + '&'));
                    } else if (cCharAt <= ',' || cCharAt == '/' || cCharAt == ':') {
                        sb.append(IOUtils.DIR_SEPARATOR_UNIX);
                        sb.append((char) (cCharAt + ' '));
                    } else if (cCharAt <= '9') {
                        sb.append(cCharAt);
                    } else if (cCharAt <= '?') {
                        sb.append('%');
                        sb.append((char) (cCharAt + 11));
                    } else if (cCharAt <= 'Z') {
                        sb.append(cCharAt);
                    } else if (cCharAt <= '_') {
                        sb.append('%');
                        sb.append((char) (cCharAt - 16));
                    } else if (cCharAt <= 'z') {
                        sb.append('+');
                        sb.append((char) (cCharAt - ' '));
                    } else {
                        if (cCharAt > 127) {
                            throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i3) + "'");
                        }
                        sb.append('%');
                        sb.append((char) (cCharAt - '+'));
                    }
                }
                str = sb.toString();
                length = str.length();
                if (length <= 80) {
                    break;
                }
                throw new IllegalArgumentException(a.k("Requested contents should be less than 80 digits long, but got ", length, " (extended full ASCII mode)"));
            }
        }
        int[] iArr2 = new int[9];
        int i4 = length + 25;
        int i5 = 0;
        while (true) {
            iArr = Code39Reader.f21373a;
            if (i5 >= length) {
                break;
            }
            e(iArr["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i5))], iArr2);
            for (int i6 = 0; i6 < 9; i6++) {
                i4 += iArr2[i6];
            }
            i5++;
        }
        boolean[] zArr = new boolean[i4];
        e(148, iArr2);
        int iB = OneDimensionalCodeWriter.b(zArr, 0, iArr2, true);
        int[] iArr3 = {1};
        int iB2 = OneDimensionalCodeWriter.b(zArr, iB, iArr3, false) + iB;
        for (int i7 = 0; i7 < length; i7++) {
            e(iArr["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i7))], iArr2);
            int iB3 = OneDimensionalCodeWriter.b(zArr, iB2, iArr2, true) + iB2;
            iB2 = OneDimensionalCodeWriter.b(zArr, iB3, iArr3, false) + iB3;
        }
        e(148, iArr2);
        OneDimensionalCodeWriter.b(zArr, iB2, iArr2, true);
        return zArr;
    }
}
