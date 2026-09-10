package com.facebook.ads.redexgen.core;

import com.applovin.shadow.okio.Utf8;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import org.jacoco.core.runtime.RemoteControlWriter;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C10388t extends Exception {
    public static byte[] A03;
    public final int A00;
    public final C2691qI A01;
    public final boolean A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 65);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{60, 127, 119, 45, 58, 60, 48, 41, 58, 45, 62, 61, 51, 58, 118, 123, 126, 114, 60, 39, Utf8.REPLACEMENT_BYTE, 29, 52, 19, 39, 54, 59, 61, 6, RemoteControlWriter.BLOCK_CMDOK, 51, 49, 57, 19, 62, 62, 61, 49, 51, 38, 55, 54, 111, 42, 38, 86, 98, 115, 126, 120, 67, 101, 118, 116, 124, 55, 126, 121, 126, 99, 55, 113, 118, 126, 123, 114, 115, 55, 44, 0, 1, 9, 6, 8, 71};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @MetaExoPlayerCustomization(type = {"NEW_CLASS"}, value = "D23918943: Monitor the audio track usage")
    public C10388t(int i, int i2, int i3, int i4, C2691qI c2691qI, boolean z, Exception exc, int i5) {
        StringBuilder sbAppend = new StringBuilder().append(A00(45, 23, 86)).append(i);
        String strA00 = A00(0, 1, 93);
        StringBuilder sbAppend2 = sbAppend.append(strA00).append(A00(68, 7, 46)).append(i2);
        String strA01 = A00(43, 2, 71);
        super(sbAppend2.append(strA01).append(i3).append(strA01).append(i4).append(A00(15, 28, 19)).append(i5).append(strA00).append(c2691qI).append(z ? A00(1, 14, 30) : A00(0, 0, 74)).toString(), exc);
        this.A00 = i;
        this.A02 = z;
        this.A01 = c2691qI;
    }
}
