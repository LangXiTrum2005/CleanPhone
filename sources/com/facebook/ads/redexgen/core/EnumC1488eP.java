package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@MetaExoPlayerCustomization
public enum EnumC1488eP {
    A04,
    A03,
    A05,
    A02;

    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 43);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-59, -54, -59, -48, -37, -49, -63, -61, -55, -63, -54, -48, -6, -10, -21, 3, -20, -21, -19, -11, -56, -54, -67, -66, -67, -52, -69, -64, -111, -118, -121, -118, -117, -109, -118};
    }

    static {
        A01();
    }
}
