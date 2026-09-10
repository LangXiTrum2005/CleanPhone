package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C12078t extends Exception {
    public static byte[] A03;
    public final int A00;
    public final C2860qI A01;
    public final boolean A02;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 65);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{60, AbstractJsonLexerKt.TC_INVALID, 119, 45, 58, 60, 48, 41, 58, 45, 62, 61, 51, 58, 118, 123, 126, 114, 60, 39, 63, 29, 52, 19, 39, 54, 59, 61, 6, 32, 51, 49, 57, 19, 62, 62, 61, 49, 51, 38, 55, 54, 111, 42, 38, 86, 98, 115, 126, 120, 67, 101, 118, 116, 124, 55, 126, 121, 126, 99, 55, 113, 118, 126, 123, 114, 115, 55, 44, 0, 1, 9, 6, 8, 71};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @MetaExoPlayerCustomization(type = {"NEW_CLASS"}, value = "D23918943: Monitor the audio track usage")
    public C12078t(int i2, int i3, int i4, int i5, C2860qI c2860qI, boolean z2, Exception exc, int i6) {
        StringBuilder sbAppend = new StringBuilder().append(A00(45, 23, 86)).append(i2);
        String strA00 = A00(0, 1, 93);
        StringBuilder sbAppend2 = sbAppend.append(strA00).append(A00(68, 7, 46)).append(i3);
        String strA01 = A00(43, 2, 71);
        super(sbAppend2.append(strA01).append(i4).append(strA01).append(i5).append(A00(15, 28, 19)).append(i6).append(strA00).append(c2860qI).append(z2 ? A00(1, 14, 30) : A00(0, 0, 74)).toString(), exc);
        this.A00 = i2;
        this.A02 = z2;
        this.A01 = c2860qI;
    }
}
