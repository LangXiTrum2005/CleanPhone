package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class HL {
    public static byte[] A09;
    public static String[] A0A = {"EsB1Svc2O0r", "neXgiGAVZF2hPSW", "e5UrGC6TzR", "xWVfqfZ1XD25z1nFBwMIBfHnywy3RQhb", "m9mgew9TdIxun9z0pjAF4NJPGlbJBstI", "nE", "RVA0jPrNpk", "4CgUEtTVWe3Kq65nNHH5xBV3YKPxdnIZ"};
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final String A07;
    public final List<byte[]> A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static HL A00(C11074v c11074v) throws C3K {
        try {
            c11074v.A0g(21);
            int iA0I = c11074v.A0I() & 3;
            int iA0I2 = c11074v.A0I();
            int i2 = 0;
            int iA09 = c11074v.A09();
            for (int i3 = 0; i3 < iA0I2; i3++) {
                c11074v.A0g(1);
                int iA0M = c11074v.A0M();
                for (int i4 = 0; i4 < iA0M; i4++) {
                    int iA0M2 = c11074v.A0M();
                    i2 += iA0M2 + 4;
                    c11074v.A0g(iA0M2);
                }
            }
            c11074v.A0f(iA09);
            byte[] bArr = new byte[i2];
            int i5 = 0;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            float f = 1.0f;
            String strA03 = null;
            for (int i11 = 0; i11 < iA0I2; i11++) {
                int iA0I3 = c11074v.A0I() & 63;
                int iA0M3 = c11074v.A0M();
                for (int i12 = 0; i12 < iA0M3; i12++) {
                    int iA0M4 = c11074v.A0M();
                    System.arraycopy(HS.A03, 0, bArr, i5, HS.A03.length);
                    int length = i5 + HS.A03.length;
                    System.arraycopy(c11074v.A0l(), c11074v.A09(), bArr, length, iA0M4);
                    if (iA0I3 == 33 && i12 == 0) {
                        HP hpA05 = HS.A05(bArr, length, length + iA0M4);
                        i6 = hpA05.A0A;
                        i7 = hpA05.A08;
                        i8 = hpA05.A02;
                        i9 = hpA05.A01;
                        i10 = hpA05.A03;
                        f = hpA05.A00;
                        strA03 = AnonymousClass46.A03(hpA05.A07, hpA05.A0B, hpA05.A06, hpA05.A05, hpA05.A0C, hpA05.A04);
                    }
                    i5 = length + iA0M4;
                    c11074v.A0g(iA0M4);
                }
            }
            return new HL(i2 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iA0I + 1, i6, i7, f, strA03, i8, i9, i10);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw C3K.A01(A01(0, 25, 126), e2);
        }
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A0A[5].length() == 29) {
                throw new RuntimeException();
            }
            A0A[5] = "YyBlh7kREcvGfk8zeLahZrRMr2fR36";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 68);
            i5++;
        }
    }

    public static void A02() {
        A09 = new byte[]{AbstractJsonLexerKt.TC_INVALID, 72, 72, 85, 72, 26, 74, 91, 72, 73, 83, 84, 93, 26, 114, AbstractJsonLexerKt.TC_INVALID, 108, 121, 26, 89, 85, 84, 92, 83, 93};
    }

    static {
        A02();
    }

    public HL(List<byte[]> initializationData, int i2, int i3, int i4, float f, String str, int i5, int i6, int i7) {
        this.A08 = initializationData;
        this.A05 = i2;
        this.A06 = i3;
        this.A04 = i4;
        this.A00 = f;
        this.A07 = str;
        this.A02 = i5;
        this.A01 = i6;
        this.A03 = i7;
    }
}
