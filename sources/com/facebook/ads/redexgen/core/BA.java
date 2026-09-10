package com.facebook.ads.redexgen.core;

import android.media.MediaCodec;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class BA extends Exception {
    public static byte[] A05;
    public final B3 A00;
    public final BA A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    static {
        A05();
    }

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 113);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{0, 12, 49, 16, 22, 26, 17, 16, 7, 85, 28, 27, 28, 1, 85, 19, 20, 28, 25, 16, 17, 79, 85, 101, 68, 66, 78, 69, 68, 83, 1, 72, 79, 72, 85, 1, 71, 64, 72, 77, 68, 69, 27, 1, 122, 63, 78, 66, 29, 17, 19, 80, 24, 31, 29, 27, 28, 17, 17, 21, 80, 31, 26, 13, 80, 31, 16, 26, 12, 17, 23, 26, 6, 80, 19, 27, 26, 23, 31, 77, 80, 27, 6, 17, 14, 18, 31, 7, 27, 12, 80, 19, 27, 26, 23, 31, 29, 17, 26, 27, 29, 80, 51, 27, 26, 23, 31, 61, 17, 26, 27, 29, 44, 27, 16, 26, 27, 12, 27, 12, 33, 36, 47, 45, 21};
    }

    public BA(C2860qI c2860qI, Throwable th, boolean z2, int i2) {
        this(A03(23, 22, 80) + i2 + A03(45, 3, 19) + c2860qI, th, c2860qI.A0W, z2, null, A02(i2), null);
    }

    public BA(C2860qI c2860qI, Throwable th, boolean z2, B3 b3) {
        this(A03(2, 21, 4) + b3.A03 + A03(0, 2, 93) + c2860qI, th, c2860qI.A0W, z2, b3, C5C.A02 >= 21 ? A04(th) : null, null);
    }

    public BA(String str, Throwable th, String str2, boolean z2, B3 b3, String str3, BA ba) {
        super(str, th);
        this.A03 = str2;
        this.A04 = z2;
        this.A00 = b3;
        this.A02 = str3;
        this.A01 = ba;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BA A00(BA ba) {
        return new BA(getMessage(), getCause(), this.A03, this.A04, this.A00, this.A02, ba);
    }

    public static String A02(int i2) {
        String strA03 = i2 < 0 ? A03(121, 4, 59) : A03(0, 0, 98);
        StringBuilder sb = new StringBuilder();
        String sign = A03(48, 73, 15);
        return sb.append(sign).append(strA03).append(Math.abs(i2)).toString();
    }

    public static String A04(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
