package com.google.zxing.oned;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class CodaBarWriter extends OneDimensionalCodeWriter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f21368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f21369b = {'T', 'N', '*', 'E'};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char[] f21370c = {IOUtils.DIR_SEPARATOR_UNIX, AbstractJsonLexerKt.COLON, '+', '.'};
    public static final char d;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f21368a = cArr;
        d = cArr[0];
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public final boolean[] c(String str) {
        int i2;
        int length = str.length();
        char c2 = d;
        if (length < 2) {
            str = c2 + str + c2;
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f21368a;
            boolean zA = CodaBarReader.a(cArr, upperCase);
            boolean zA2 = CodaBarReader.a(cArr, upperCase2);
            char[] cArr2 = f21369b;
            boolean zA3 = CodaBarReader.a(cArr2, upperCase);
            boolean zA4 = CodaBarReader.a(cArr2, upperCase2);
            if (zA) {
                if (!zA2) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (!zA3) {
                if (zA2 || zA4) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
                str = c2 + str + c2;
            } else if (!zA4) {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
            }
        }
        int i3 = 20;
        for (int i4 = 1; i4 < str.length() - 1; i4++) {
            if (Character.isDigit(str.charAt(i4)) || str.charAt(i4) == '-' || str.charAt(i4) == '$') {
                i3 += 9;
            } else {
                if (!CodaBarReader.a(f21370c, str.charAt(i4))) {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i4) + '\'');
                }
                i3 += 10;
            }
        }
        boolean[] zArr = new boolean[(str.length() - 1) + i3];
        int i5 = 0;
        for (int i6 = 0; i6 < str.length(); i6++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i6));
            if (i6 == 0 || i6 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i7 = 0;
            while (true) {
                char[] cArr3 = CodaBarReader.f21366a;
                if (i7 >= cArr3.length) {
                    i2 = 0;
                    break;
                }
                if (upperCase3 == cArr3[i7]) {
                    i2 = CodaBarReader.f21367b[i7];
                    break;
                }
                i7++;
            }
            int i8 = 0;
            int i9 = 0;
            boolean z2 = true;
            while (i8 < 7) {
                zArr[i5] = z2;
                i5++;
                if (((i2 >> (6 - i8)) & 1) == 0 || i9 == 1) {
                    z2 = !z2;
                    i8++;
                    i9 = 0;
                } else {
                    i9++;
                }
            }
            if (i6 < str.length() - 1) {
                zArr[i5] = false;
                i5++;
            }
        }
        return zArr;
    }
}
