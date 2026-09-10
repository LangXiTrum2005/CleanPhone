package com.facebook.ads.redexgen.core;

import android.media.MediaCodec;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Z9 extends Exception {
    public static byte[] A05;
    public static String[] A06 = {"9kVEYz8Fvo5xhSOzuJPUG0DtFPKnoAfZ", "nILImtdMyTts8zQogW", "OfODn1pBdp5yzeo7Yvo5sT1rcnlq0ViG", "qGlPYNH", "", "ts6KbiyzNqBM6YYnn38hfvyWzjDxD670", "3JhZU", "6JGOai9fkST22ZnIH1TjBxiAnQW4ss0W"};
    public final Z2 A00;
    public final Z9 A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A06[4].length() != 0) {
                throw new RuntimeException();
            }
            A06[6] = "Vd828XWjPQJOMHPNIfQrrg";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 22);
            i4++;
        }
    }

    public static void A05() {
        A05 = new byte[]{126, 114, 58, 27, 29, 17, 26, 27, 12, 94, 23, cw.n, 23, 10, 94, 24, 31, 23, 18, 27, 26, 68, 94, 30, 63, 57, 53, 62, 63, 40, 122, 51, 52, 51, 46, 122, 60, 59, 51, 54, 63, 62, 96, 122, 1, cw.l, 127, 115, 113, 125, 127, 60, 117, 125, 125, 117, 126, 119, 60, 115, 124, 118, 96, 125, 123, 118, 60, 119, 106, 125, 98, 126, 115, 107, 119, 96, 32, 60, 127, 119, 118, 123, 115, 113, 125, 118, 119, 113, 60, 95, 119, 118, 123, 115, 81, 125, 118, 119, 113, 64, 119, 124, 118, 119, 96, 119, 96, 77, 10, 1, 3, 59};
    }

    static {
        A05();
    }

    public Z9(ZM zm, Throwable th, boolean z, int i) {
        this(A03(23, 22, 76) + i + A03(45, 3, 69) + zm, th, zm.A0W, z, null, A02(i), null);
    }

    public Z9(ZM zm, Throwable th, boolean z, Z2 z2) {
        this(A03(2, 21, 104) + z2.A03 + A03(0, 2, 68) + zm, th, zm.A0W, z, z2, AbstractC1600gE.A02 >= 21 ? A04(th) : null, null);
    }

    public Z9(String str, Throwable th, String str2, boolean z, Z2 z2, String str3, Z9 z9) {
        super(str, th);
        this.A03 = str2;
        this.A04 = z;
        this.A00 = z2;
        this.A02 = str3;
        this.A01 = z9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Z9 A00(Z9 z9) {
        return new Z9(getMessage(), getCause(), this.A03, this.A04, this.A00, this.A02, z9);
    }

    public static String A02(int i) {
        String sign;
        if (i >= 0) {
            sign = A03(0, 0, 102);
        } else {
            if (A06[6].length() == 27) {
                throw new RuntimeException();
            }
            A06[1] = "3GaTlyeF73NJSpWfO7";
            sign = A03(108, 4, 114);
        }
        return A03(48, 60, 4) + sign + Math.abs(i);
    }

    public static String A04(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
