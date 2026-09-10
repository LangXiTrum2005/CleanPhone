package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.smartdigimkt.a6.d;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@MetaExoPlayerCustomization
public enum MN {
    A05,
    A04,
    A06,
    A03;

    public static byte[] A00;
    public static String[] A01 = {"YGvusjMOvw", "XxhXqbssDzTPx8cD", "v5f5FK7FNpA1cfN1ohQEtzmA1XlLSzXE", "dOnhpxcme8C8DMHJdbJ1zsQXlaw", "o8NFvW23E6YML82dyv2qOnj4D0AhAt32", "sFvB7Juf2T", "FilLqBnJ3Dc1fTgDAzXDzQr78D6tohNx", "1sAmBYm9v"};

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            byte b2 = bArrCopyOfRange[i5];
            String[] strArr = A01;
            if (strArr[7].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A01[1] = "k0Ctdizy0CSYjdQTYuro";
            bArrCopyOfRange[i5] = (byte) ((b2 - i4) + d.o);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{11, 16, 11, 22, 33, 21, 7, 9, 15, 7, 16, 22, -27, -31, -42, -18, -41, -42, -40, -32, -39, -37, -50, -49, -50, -35, -52, -47, -10, -17, -20, -17, -16, -8, -17};
    }

    static {
        A01();
    }
}
