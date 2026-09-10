package com.facebook.ads.redexgen.core;

import android.media.MediaFormat;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Random;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.is, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2427is {
    public static String A00;
    public static String A01;
    public static byte[] A02;
    public static final Random A03;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 10);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{39, 0, 8, 13, 4, 5, 65, 21, 14, 65, 19, 4, 21, 19, 8, 4, 23, 4, 65, 44, 4, 5, 8, 0, 39, 14, 19, 12, 0, 21, 73, 100, 115, 110, 68, 121, 110, 84, 117, 104, 109, 9, 43, 54, 33, 32, 116, 10, 45, 56, 45, 44, 42, 126, 72, 89, 13, 108, 100, 13, 107, AbstractJsonLexerKt.TC_INVALID, 110, 13, 124, 107, 105, 13, 65, 72, 91, 72, 65, 13, 89, 66, 13, 8, 73, 59, 13, 28, 72, 41, 33, 72, 46, 58, 43, 72, 26, 13, 25, 29, 13, 27, 28, 72, 28, 7, 72, 89, 12, 58, 43, AbstractJsonLexerKt.TC_INVALID, 30, 22, AbstractJsonLexerKt.TC_INVALID, 25, 13, 28, AbstractJsonLexerKt.TC_INVALID, 41, 54, 59, 58, 48, AbstractJsonLexerKt.TC_INVALID, 59, 42, 45, 62, 43, 54, 48, 49, AbstractJsonLexerKt.TC_INVALID, 43, 48, AbstractJsonLexerKt.TC_INVALID, 122, 59, 37, 40, 36, 42, 37, 57, 19, 14, 10, 2, 8, 18, 19, 56, 19, 21, 30, 14, 9, 0, 56, 19, 8, 56, 1, 14, 9, 3, 56, 20, 2, 0, 10, 2, 9, 19, 56, 14, 9, 56, 8, 14, 11, 15, 28, 23, 29, 22, 11, 87, 10, 28, 26, 84, 24, 16, 31, 11, 26, 84, 13, 11, 24, 23, 10, 31, 28, 11, 84, 11, 28, 8, 12, 28, 10, 13, 87, 15, 24, 21, 12, 28, 112, 99, 104, 98, 105, 116, 40, 117, 99, 101, 43, 103, 111, 96, 116, 101, 43, 112, 111, 98, 99, 105, 43, 98, 115, 116, 103, 114, 111, 105, 104, 40, 112, 103, 106, 115, 99, 78, 93, 86, 92, 87, 74, 22, 75, 93, 91, 21, 89, 81, 94, 74, 91, 21, 78, 81, 92, 93, 87, 21, 73, 94, 92, 21, 84, 93, 78, 93, 84, 22, 78, 89, 84, 77, 93, 89, 71, 74, 90, 70};
    }

    static {
        A02();
        A00 = A01(41, 12, 83);
        A01 = A01(139, 37, 109);
        A03 = new Random();
    }

    public static int A00(int i2, int i3) {
        if (i3 != 0) {
            return (int) ((Math.pow(2.0d, i2 - 1) * ((double) i3) * 1000.0d) + ((double) A03.nextInt(2000)));
        }
        return (int) Math.min((((long) (i2 - 1)) * 1000) + 500, 5000L);
    }

    public static void A03(C2456jQ c2456jQ, MediaFormat mediaFormat) {
        String strA01 = A01(0, 30, 107);
        String strA02 = A01(30, 11, 11);
        if (!c2456jQ.A01) {
            return;
        }
        try {
            if (C2425iq.A02()) {
                if (c2456jQ.A0P && !C2425iq.A03(mediaFormat.getInteger(A01(290, 5, 36)), mediaFormat.getInteger(A01(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 6, 71)))) {
                    return;
                }
                long j = c2456jQ.A00;
                if (j > 0) {
                    mediaFormat.setLong(A01(Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 37, 12), j);
                    AbstractC2357hd.A01(strA02, A01(102, 31, 85), Long.valueOf(j));
                }
                mediaFormat.setInteger(A01(252, 38, 50), c2456jQ.A02);
                AbstractC2357hd.A01(strA02, A01(53, 26, 39), Integer.valueOf(c2456jQ.A02));
                mediaFormat.setInteger(A01(176, 39, 115), 1);
                AbstractC2357hd.A00(strA02, A01(79, 23, 98));
            }
        } catch (ClassCastException e2) {
            AbstractC2357hd.A02(strA02, strA01, e2);
        } catch (NullPointerException e3) {
            AbstractC2357hd.A02(strA02, strA01, e3);
        }
    }

    public static boolean A04(C2456jQ c2456jQ, int i2, int i3, int i4, int i5) {
        if (c2456jQ.A01 && c2456jQ.A0P && C2425iq.A03(i2, i3) != C2425iq.A03(i4, i5)) {
            return true;
        }
        return false;
    }
}
