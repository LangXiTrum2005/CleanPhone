package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1019Rt extends Exception {
    public static byte[] A03;
    public final int A00;
    public final ZM A01;
    public final boolean A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 59);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{5, 92, 84, cw.l, 25, 31, 19, 10, 25, cw.l, 29, 30, cw.n, 25, 85, 46, 43, 39, 105, 114, 106, 72, 97, 70, 114, 99, 110, 104, 83, 117, 102, 100, 108, 70, 107, 107, 104, 100, 102, 115, 98, 99, 58, 5, 9, 19, 39, 54, 59, 61, 6, 32, 51, 49, 57, 114, 59, 60, 59, 38, 114, 52, 51, 59, 62, 55, 54, 114, 18, 62, 63, 55, 56, 54, 121};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @MetaExoPlayerCustomization(type = {"NEW_CLASS"}, value = "D23918943: Monitor the audio track usage")
    public C1019Rt(int i, int i2, int i3, int i4, ZM zm, boolean z, Exception exc, int i5) {
        StringBuilder sbAppend = new StringBuilder().append(A00(45, 23, 105)).append(i);
        String strA00 = A00(0, 1, 30);
        StringBuilder sbAppend2 = sbAppend.append(strA00).append(A00(68, 7, 106)).append(i2);
        String strA01 = A00(43, 2, 18);
        super(sbAppend2.append(strA01).append(i3).append(strA01).append(i4).append(A00(15, 28, 60)).append(i5).append(strA00).append(zm).append(z ? A00(1, 14, 71) : A00(0, 0, 97)).toString(), exc);
        this.A00 = i;
        this.A02 = z;
        this.A01 = zm;
    }
}
