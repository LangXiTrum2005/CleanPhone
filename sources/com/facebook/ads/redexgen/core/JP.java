package com.facebook.ads.redexgen.core;

import com.smartdigimkt.m3.h;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class JP {
    public static byte[] A05;
    public static String[] A06 = {"8Hrr", h.f36614b, "0Fdee0wg4hsenc5DHvlvwY", "0vqFlF7HyuYg3TUYlVTMC9xVo", "FyWFMrZuY5MlICM", "PN9pA9f0QUy", "hrYl81FOJTp7gpX67gLzFhurxBV", "ujvsBGrB8Jik"};
    public final int A00;
    public final C1405Hb A01;
    public final String A02;
    public final boolean A03;
    public final byte[] A04;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 64);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{40, 33, 47, 78, 124, 124, 122, 98, 102, 97, 104, 47, 78, 74, 92, 34, 76, 91, 93, 47, 108, 125, 118, AbstractJsonLexerKt.TC_INVALID, 123, 96, 47, 98, 96, 107, 106, 33, 38, 0, 19, 17, 25, 55, 28, 17, 0, 11, 2, 6, 27, 29, 28, 48, 29, 10, 95, 100, 121, AbstractJsonLexerKt.TC_INVALID, 122, 122, 101, 120, 126, 111, 110, 42, 122, 120, 101, 126, 111, 105, 126, 99, 101, 100, 42, 121, 105, 98, 111, 103, 111, 42, 126, 115, 122, 111, 42, 45, 115, 114, 115, 33, 41, 40, 41, 57, 60, 58, 49, 60, 120, 126, 117, 104};
    }

    static {
        A02();
    }

    public JP(boolean z2, String str, int i2, byte[] bArr, int i3, int i4, byte[] bArr2) {
        AbstractC10843y.A07((bArr2 == null) ^ (i2 == 0));
        this.A03 = z2;
        this.A02 = str;
        this.A00 = i2;
        this.A04 = bArr2;
        this.A01 = new C1405Hb(A00(str), bArr, i3, i4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x00a5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x00a6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0010  */
    public static int A00(String str) {
        byte b2;
        if (str == null) {
            return 1;
        }
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals(A01(86, 4, 80))) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
                switch (b2) {
                    case 0:
                    case 1:
                        return 1;
                    case 2:
                    case 3:
                        return 2;
                    default:
                        AbstractC10924g.A07(A01(32, 18, 50), A01(50, 36, 74) + str + A01(0, 32, 79));
                        return 1;
                }
            case 3046671:
                if (str.equals(A01(90, 4, 10))) {
                    b2 = 3;
                } else {
                    b2 = -1;
                }
                switch (b2) {
                    case 0:
                    case 1:
                        return 1;
                    case 2:
                    case 3:
                        return 2;
                    default:
                        AbstractC10924g.A07(A01(32, 18, 50), A01(50, 36, 74) + str + A01(0, 32, 79));
                        return 1;
                }
            case 3049879:
                if (str.equals(A01(94, 4, 31))) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
                switch (b2) {
                    case 0:
                    case 1:
                        return 1;
                    case 2:
                    case 3:
                        return 2;
                    default:
                        AbstractC10924g.A07(A01(32, 18, 50), A01(50, 36, 74) + str + A01(0, 32, 79));
                        return 1;
                }
            case 3049895:
                String[] strArr = A06;
                if (strArr[6].length() != strArr[1].length()) {
                    A06[5] = "5D1VNf4Gt9Q";
                    if (str.equals(A01(98, 4, 91))) {
                        b2 = 1;
                    } else {
                        b2 = -1;
                    }
                    switch (b2) {
                        case 0:
                        case 1:
                            return 1;
                        case 2:
                        case 3:
                            return 2;
                        default:
                            AbstractC10924g.A07(A01(32, 18, 50), A01(50, 36, 74) + str + A01(0, 32, 79));
                            return 1;
                    }
                }
                throw new RuntimeException();
            default:
                b2 = -1;
                switch (b2) {
                    case 0:
                    case 1:
                        return 1;
                    case 2:
                    case 3:
                        return 2;
                    default:
                        AbstractC10924g.A07(A01(32, 18, 50), A01(50, 36, 74) + str + A01(0, 32, 79));
                        return 1;
                }
        }
    }
}
